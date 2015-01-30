<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="text" encoding="UTF-8" />

	<!-- Variables -->

	<xsl:variable name="EOL">
		<xsl:text><![CDATA[
]]></xsl:text>
	</xsl:variable>

	<xsl:variable name="EOL2">
		<xsl:value-of select="concat($EOL, $EOL)" />
	</xsl:variable>

	<xsl:variable name="TAB">
		<xsl:text><![CDATA[    ]]></xsl:text>
	</xsl:variable>

	<!-- Functions -->

	<xsl:template name="make_prefix">
		<xsl:param name="indent" />
		<xsl:param name="part" select="$TAB" />
		<xsl:param name="buffer" select="''" />
		<xsl:choose>
			<xsl:when test="$indent &gt; 0">
				<xsl:call-template name="make_prefix">
					<xsl:with-param name="indent" select="$indent - 1" />
					<xsl:with-param name="buffer" select="concat($buffer, $part)" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$buffer" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<!-- Code blocks -->

	<xsl:template name="block_description" match="description">
		<xsl:param name="indent_text" />
		<xsl:value-of select="concat($indent_text, '/**', $EOL, $indent_text, ' * ', ., $EOL, $indent_text, ' **/', $EOL)" />
	</xsl:template>

	<xsl:template name="line_annotation">
		<xsl:value-of select="concat('@', .)" />
	</xsl:template>

	<xsl:template name="line_access_modificator">
		<xsl:choose>
			<xsl:when test="not(access)">
				<xsl:text>public </xsl:text>
			</xsl:when>
			<xsl:when test="access='package'" />
			<xsl:otherwise>
				<xsl:value-of select="concat(access, ' ')" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="block_enum_constant">
		<xsl:param name="indent_text" />
		<xsl:apply-templates select="description">
			<xsl:with-param name="indent_text" select="$indent_text" />
		</xsl:apply-templates>
		<xsl:value-of select="concat($indent_text, name)" />
	</xsl:template>

	<xsl:template name="line_return_type">
		<xsl:choose>
			<xsl:when test="not(return-type)">
				<xsl:text>void</xsl:text>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="return-type" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="block_method_declaration">
		<xsl:param name="indent_text" />

		<xsl:apply-templates select="description">
			<xsl:with-param name="indent_text" select="$indent_text" />
		</xsl:apply-templates>

		<xsl:for-each select="annotations/annotation">
			<xsl:value-of select="$indent_text" />
			<xsl:call-template name="line_annotation" />
			<xsl:value-of select="$EOL" />
		</xsl:for-each>

		<xsl:value-of select="$indent_text" />
		<xsl:call-template name="line_access_modificator" />
		<xsl:call-template name="line_return_type" />
		<xsl:value-of select="concat(' ', name, '(')" />

		<xsl:for-each select="arguments/argument">
			<xsl:if test="position() &gt; 1">
				<xsl:value-of select="', '" />
			</xsl:if>
			<xsl:value-of select="concat(type, ' ', name)" />
		</xsl:for-each>

		<xsl:value-of select="')'" />
	</xsl:template>

	<xsl:template name="block_method_with_body">
		<xsl:param name="indent_text" />

		<xsl:call-template name="block_method_declaration">
			<xsl:with-param name="indent_text" select="$indent_text" />
		</xsl:call-template>

		<xsl:value-of select="concat(' {', $EOL, $indent_text, body, $EOL, $indent_text, '}')" />
	</xsl:template>

	<xsl:template name="block_field">
		<xsl:param name="indent_text" />

		<xsl:apply-templates select="description">
			<xsl:with-param name="indent_text" select="$indent_text" />
		</xsl:apply-templates>

		<xsl:for-each select="annotations/annotation">
			<xsl:value-of select="$indent_text" />
			<xsl:call-template name="line_annotation" />
			<xsl:value-of select="$EOL" />
		</xsl:for-each>

		<xsl:value-of select="$indent_text" />
		<xsl:call-template name="line_access_modificator" />
		<xsl:value-of select="concat(type, ' ', name)" />

		<xsl:if test="initial-value">
			<xsl:value-of select="concat(' = ', initial-value)" />
		</xsl:if>
	</xsl:template>

	<xsl:template name="block_type_inner">
		<xsl:param name="indent" />

		<xsl:variable name="indent_text">
			<xsl:call-template name="make_prefix">
				<xsl:with-param name="indent" select="$indent" />
			</xsl:call-template>
		</xsl:variable>

		<xsl:for-each select="self::enum/constants/constant">
			<xsl:if test="position() &gt; 1">
				<xsl:value-of select="concat(',', $EOL)" />
			</xsl:if>
			<xsl:value-of select="$EOL" />
			<xsl:call-template name="block_enum_constant">
				<xsl:with-param name="indent_text" select="$indent_text" />
			</xsl:call-template>
			<xsl:if test="position() = last()">
				<xsl:value-of select="concat(';', $EOL)" />
			</xsl:if>
		</xsl:for-each>

		<xsl:for-each select="self::class/fields/field">
			<xsl:value-of select="$EOL" />
			<xsl:call-template name="block_field">
				<xsl:with-param name="indent_text" select="$indent_text" />
			</xsl:call-template>
			<xsl:value-of select="concat(';', $EOL)" />
		</xsl:for-each>

		<xsl:for-each select="(self::class | self::enum)/methods/method">
			<xsl:value-of select="$EOL" />
			<xsl:call-template name="block_method_with_body">
				<xsl:with-param name="indent_text" select="$indent_text" />
			</xsl:call-template>
			<xsl:value-of select="$EOL" />
		</xsl:for-each>

		<xsl:for-each select="(self::interface | self::annotation)/methods/method">
			<xsl:value-of select="$EOL" />
			<xsl:call-template name="block_method_declaration">
				<xsl:with-param name="indent_text" select="$indent_text" />
			</xsl:call-template>
			<xsl:value-of select="concat(';', $EOL)" />
		</xsl:for-each>
	</xsl:template>

	<xsl:template name="block_type">
		<xsl:param name="indent" />

		<xsl:variable name="indent_text">
			<xsl:call-template name="make_prefix">
				<xsl:with-param name="indent" select="$indent" />
			</xsl:call-template>
		</xsl:variable>

		<xsl:apply-templates select="description">
			<xsl:with-param name="indent_text" select="$indent_text" />
		</xsl:apply-templates>

		<xsl:for-each select="annotations/annotation">
			<xsl:value-of select="$indent_text" />
			<xsl:call-template name="line_annotation" />
			<xsl:value-of select="$EOL" />
		</xsl:for-each>

		<xsl:value-of select="$indent_text" />
		<xsl:call-template name="line_access_modificator" />

		<xsl:if test="abstract='true'">
			<xsl:text>abstract </xsl:text>
		</xsl:if>

		<xsl:if test="static='true'">
			<xsl:text>static </xsl:text>
		</xsl:if>

		<xsl:choose>
			<xsl:when test="local-name(.) = 'annotation'">
				<xsl:text>@interface</xsl:text>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="local-name(.)" />
			</xsl:otherwise>
		</xsl:choose>

		<xsl:value-of select="concat(' ', name)" />

		<xsl:if test="extends">
			<xsl:value-of select="concat(' extends ', extends)" />
		</xsl:if>

		<xsl:for-each select="implements/implement">
			<xsl:choose>
				<xsl:when test="position() = 1">
					<xsl:value-of select="concat(' implements ', .)" />
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="concat(', ', .)" />
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>

		<xsl:value-of select="concat(' {', $EOL)" />

		<xsl:for-each select="class | enum | interface | annotation">
			<xsl:value-of select="$EOL" />
			<xsl:call-template name="block_type">
				<xsl:with-param name="indent" select="$indent + 1" />
			</xsl:call-template>
			<xsl:value-of select="$EOL" />
		</xsl:for-each>

		<xsl:call-template name="block_type_inner">
			<xsl:with-param name="indent" select="$indent + 1" />
		</xsl:call-template>

		<xsl:value-of select="concat($EOL, $indent_text, '}')" />
	</xsl:template>

	<!-- Transformation flow -->

	<xsl:template match="/xml2java">
		<xsl:if test="package">
			<xsl:value-of select="concat('package ', package, ';')" />
		</xsl:if>

		<xsl:value-of select="$EOL" />

		<xsl:for-each select="imports/import">
			<xsl:value-of select="concat($EOL, 'import ', ., ';')" />
		</xsl:for-each>
		<xsl:value-of select="$EOL2" />

		<xsl:for-each select="class | enum | interface | annotation">
			<xsl:call-template name="block_type">
				<xsl:with-param name="indent" select="0" />
			</xsl:call-template>
		</xsl:for-each>
	</xsl:template>

</xsl:transform>
