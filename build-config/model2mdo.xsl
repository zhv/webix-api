<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns="http://modello.codehaus.org/MODELLO/1.4.1"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://modello.codehaus.org/MODELLO/1.4.1 http://modello.codehaus.org/xsd/modello-1.4.1.xsd">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:strip-space elements="name description type" />



	<xsl:variable name="alpha_lower" select="'abcdefghqijklmnoprstuvwxyz'" />
	<xsl:variable name="alpha_upper" select="'ABCDEFGHQIJKLMNOPRSTUVWXYZ'" />
	<xsl:variable name="global_url_base" select="'http://docs.webix.com/'" />
	<xsl:variable name="global_package_prefix" select="'com.webix.ui.model'" />
	<xsl:variable name="global_model_version" select="/model/version" />



	<xsl:template name="substr_alpha_prefix">
		<xsl:param name="str" />
		<xsl:param name="pos" select="1" />
		<xsl:choose>
			<xsl:when test="$pos>string-length($str)">
				<xsl:value-of select="$str" />
			</xsl:when>
			<xsl:when test="contains('ABCDEFGHQIJKLMNOPRSTUVWXYZabcdefghqijklmnoprstuvwxyz', substring($str, $pos, 1))">
				<xsl:call-template name="substr_alpha_prefix">
					<xsl:with-param name="str" select="$str" />
					<xsl:with-param name="pos" select="$pos + 1" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="substring($str, 1, $pos - 1)" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="substr_after_last">
		<xsl:param name="str" />
		<xsl:param name="needle" />
		<xsl:param name="tmp" select="substring-after($str, $needle)" />
		<xsl:choose>
			<xsl:when test="string-length($tmp) = 0 or $str = $tmp">
				<xsl:value-of select="$str" />
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="substr_after_last">
					<xsl:with-param name="str" select="$tmp" />
					<xsl:with-param name="needle" select="$needle" />
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="substr_before_last">
		<xsl:param name="str" />
		<xsl:param name="needle" />
		<xsl:param name="strm" select="''" />
		<xsl:param name="tmp" select="substring-after($str, $needle)" />
		<xsl:param name="tmp_length" select="string-length($tmp)" />
		<xsl:choose>
			<xsl:when test="$tmp_length = 0">
				<xsl:value-of select="substring($strm, 1, string-length($strm) - string-length($needle))" />
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="substr_before_last">
					<xsl:with-param name="str" select="$tmp" />
					<xsl:with-param name="needle" select="$needle" />
					<xsl:with-param name="strm" select="concat($strm, substring($str, 1, (string-length($str) - $tmp_length)))" />
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>



	<xsl:template name="process_class">
		<xsl:variable name="type_ref" select="@ref" />
		<xsl:variable name="subpackage" select="/model/packages/package[types/type[@ref=$type_ref]]/name" />
		<xsl:variable name="classname" select="substring-after(name, '.')" />
		<class>
			<version>
				<xsl:value-of select="$global_model_version" />
			</version>
			<packageName>
				<xsl:value-of select="concat($global_package_prefix, '.')" />
				<xsl:call-template name="substr_alpha_prefix">
					<xsl:with-param name="str" select="translate($subpackage, $alpha_upper, $alpha_lower)" />
				</xsl:call-template>
			</packageName>
			<name>
				<xsl:value-of select="concat(translate(substring($classname, 1, 1), $alpha_lower, $alpha_upper), substring($classname, 2))" />
			</name>
			<xsl:copy-of select="description" />
			<fields>
				<xsl:for-each select="fields/field">
					<xsl:call-template name="process_field" />
				</xsl:for-each>
			</fields>
			<codeSegments>
				<xsl:for-each select="methods/method">
					<xsl:call-template name="process_method">
						<xsl:with-param name="type_ref" select="$type_ref" />
					</xsl:call-template>
				</xsl:for-each>
			</codeSegments>
		</class>
	</xsl:template>

	<xsl:template name="process_field">
		<xsl:variable name="component_ref" select="@ref" />
		<xsl:variable name="component" select="(/model/components/component[@ref=$component_ref])[1]" />
		<xsl:variable name="description" select="$component/description" />
		<xsl:variable name="type_name" select="$component/type" />
		<field>
			<xsl:copy-of select="name" />
			<description>
				<xsl:value-of
					select="concat(translate(substring($description, 1, 1), $alpha_lower, $alpha_upper), substring($description, 2))" />
			</description>
			<xsl:call-template name="process_field_type">
				<xsl:with-param name="type_name" select="$type_name" />
			</xsl:call-template>
		</field>
	</xsl:template>

	<xsl:template name="process_field_type">
		<xsl:param name="type_name" />
		<xsl:variable name="resolved_type">
			<xsl:choose>
				<xsl:when test="$type_name='bool' or $type_name='boolean'">
					Boolean
				</xsl:when>
				<xsl:when test="$type_name='string'">
					String
				</xsl:when>
				<xsl:when test="$type_name='number'">
					Integer
				</xsl:when>
				<xsl:when test="$type_name='id'">
					String
				</xsl:when>
				<!-- <xsl:when test="$type_name='array'">
					Byte
				</xsl:when> -->
				<xsl:otherwise>
					Byte
				</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<type>
			<xsl:value-of select="normalize-space($resolved_type)" />
		</type>
		<!-- <xsl:value-of select="translate($field_type, '|', '_')" /> -->
	</xsl:template>

	<xsl:template name="process_method">
		<xsl:param name="type_ref" />

		<xsl:variable name="component_ref" select="@ref" />
		<xsl:variable name="component" select="(/model/components/component[@ref=$component_ref])[1]" />
		<xsl:variable name="description" select="$component/description" />
		<xsl:variable name="return_type_name" select="$component/return-type" />
		<xsl:variable name="method_name" select="normalize-space(name)" />
		<xsl:variable name="is_accessor_method" select="starts-with($method_name, 'get') or starts-with($method_name, 'set')" />
		<xsl:variable name="method_name_suffix">
			<xsl:choose>
				<xsl:when test="$is_accessor_method">
					<xsl:value-of
						select="concat(translate(substring($method_name, 4, 1), $alpha_upper, $alpha_lower), substring($method_name, 5))" />
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="$method_name" />
				</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:comment>
			<xsl:value-of select="concat('$type_ref', '=', $type_ref)" />
			,
			<xsl:value-of select="concat('$component_ref', '=', $component_ref)" />
			,
			<xsl:value-of select="concat('$return_type_name', '=', $return_type_name)" />
			,
		</xsl:comment>
		<xsl:if
			test="not($is_accessor_method) or ($is_accessor_method and 0=count(/model/types/type[@ref=$type_ref]/fields/field[name=$method_name_suffix]))">
			<xsl:variable name="resolved_type">
				<xsl:call-template name="resolve_type">
					<xsl:with-param name="type_name" select="$return_type_name" />
				</xsl:call-template>
			</xsl:variable>
			<xsl:variable name="return_value_clause">
				<xsl:choose>
					<xsl:when test="normalize-space($resolved_type)!='void'">
						<xsl:value-of select="' null'" />
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="''" />
					</xsl:otherwise>
				</xsl:choose>
			</xsl:variable>
			<codeSegment>
<!-- Code formatting explicitly defined / start -->
				<xsl:element name="code">
					<xsl:text disable-output-escaping="yes">&lt;![CDATA[</xsl:text><![CDATA[/**
     * ]]><xsl:value-of
					select="concat(translate(substring($description, 1, 1), $alpha_lower, $alpha_upper), substring($description, 2))" /><![CDATA[
     */
    ]]><xsl:value-of select="concat('public ', normalize-space($resolved_type), ' ', name, '()')" /><![CDATA[ {
        return]]><xsl:value-of select="$return_value_clause" /><![CDATA[;
    }]]><xsl:text disable-output-escaping="yes">]]&gt;</xsl:text>
				</xsl:element>
<!-- Code formatting explicitly defined / end -->
			</codeSegment>
		</xsl:if>
	</xsl:template>

	<xsl:template name="resolve_type">
		<xsl:param name="type_name" />
		<xsl:choose>
			<xsl:when test="$type_name='bool' or $type_name='boolean'">
				<xsl:text>Boolean</xsl:text>
			</xsl:when>
			<xsl:when test="$type_name='string'">
				<xsl:text>String</xsl:text>
			</xsl:when>
			<xsl:when test="$type_name='number'">
				<xsl:text>Integer</xsl:text>
			</xsl:when>
			<xsl:when test="$type_name='void'">
				<xsl:text>void</xsl:text>
			</xsl:when>
			<!-- <xsl:when test="$type_name='array'"><xsl:text>Byte</xsl:text></xsl:when> -->
			<xsl:otherwise>
				<xsl:text>Byte</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>


	<xsl:template match="/">
		<model>
			<id><xsl:value-of select="$global_package_prefix" /></id>
			<name>Webix UI data model</name>
			<classes>
				<xsl:for-each select="model/types/type">
					<xsl:call-template name="process_class" />
				</xsl:for-each>
			</classes>
		</model>
	</xsl:template>

</xsl:transform>
