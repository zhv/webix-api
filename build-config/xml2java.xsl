<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="text" encoding="UTF-8" />

	<!-- Note: Only Java 1.5 Enum types supported -->

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

	<xsl:template name="javadoc_comment">
		<xsl:if test=".">
			<xsl:value-of select="concat($TAB, '/**', $EOL, $TAB, ' * ', ., $EOL, $TAB, ' **/', $EOL)" />
		</xsl:if>
	</xsl:template>

	<xsl:template name="enum_constant">
		<xsl:for-each select="description">
			<xsl:call-template name="javadoc_comment" />
		</xsl:for-each>
		<xsl:value-of select="concat($TAB, name)" />
	</xsl:template>

	<xsl:template name="access_modificator">
		<xsl:choose>
			<xsl:when test="not(access)">
				<xsl:text>public </xsl:text>
			</xsl:when>
			<xsl:when test="access='package'"></xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="concat(access, ' ')" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="return_type">
		<xsl:choose>
			<xsl:when test="not(return-type)">
				<xsl:text>void</xsl:text>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="return-type" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="method_declaration">
		<xsl:for-each select="description">
			<xsl:call-template name="javadoc_comment" />
		</xsl:for-each>
		<xsl:value-of select="$TAB" />
		<xsl:call-template name="access_modificator" />
		<xsl:call-template name="return_type" />
		<xsl:value-of select="concat(' ', name, '(')" />
		<xsl:for-each select="arguments/argument">
			<xsl:if test="position() &gt; 1">
				<xsl:value-of select="', '" />
			</xsl:if>
			<xsl:value-of select="concat(type, ' ', name)" />
		</xsl:for-each>
		<xsl:value-of select="concat(')')" />
	</xsl:template>

	<xsl:template name="method_with_body">
		<xsl:call-template name="method_declaration" />
		<xsl:value-of select="concat(' {', $EOL, $TAB, $TAB, body, $EOL, $TAB, '}', $EOL)" />
	</xsl:template>

	<xsl:template match="/xml2java/class | /xml2java/enum | /xml2java/interface | /xml2java/annotation">
		<xsl:value-of select="concat('package ', package, ';', $EOL2)" />

		<xsl:for-each select="imports/import">
			<xsl:value-of select="concat('import', ., ';', $EOL)" />
		</xsl:for-each>
		<xsl:value-of select="$EOL" />

		<xsl:for-each select="description">
			<xsl:call-template name="javadoc_comment" />
		</xsl:for-each>

		<xsl:call-template name="access_modificator" />

		<xsl:choose>
			<xsl:when test="local-name(.) = 'annotation'">
				<xsl:text>@interface</xsl:text>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="local-name(.)" />
			</xsl:otherwise>
		</xsl:choose>

		<xsl:value-of select="concat(' ', name, $EOL, '{', $EOL)" />

		<xsl:for-each select="self::enum/constants/constant">
			<xsl:if test="position() &gt; 1">
				<xsl:value-of select="concat(',', $EOL2)" />
			</xsl:if>
			<xsl:call-template name="enum_constant" />
			<xsl:if test="position() = last()">
				<xsl:value-of select="concat(';', $EOL2)" />
			</xsl:if>
		</xsl:for-each>

		<xsl:for-each select="(self::class | self::enum)/methods/method">
			<xsl:if test="position() &gt; 1">
				<xsl:value-of select="$EOL" />
			</xsl:if>
			<xsl:call-template name="method_with_body" />
		</xsl:for-each>

		<xsl:for-each select="(self::interface | self::annotation)/methods/method">
			<xsl:if test="position() &gt; 1">
				<xsl:value-of select="$EOL" />
			</xsl:if>
			<xsl:call-template name="method_declaration" />
			<xsl:value-of select="concat(';', $EOL)" />
		</xsl:for-each>

		<xsl:value-of select="concat('}', $EOL)" />

	</xsl:template>

</xsl:transform>
