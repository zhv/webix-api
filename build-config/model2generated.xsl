<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns="http://modello.codehaus.org/MODELLO/1.4.1" xsi:schemaLocation="http://modello.codehaus.org/MODELLO/1.4.1 http://modello.codehaus.org/xsd/modello-1.4.1.xsd">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:strip-space elements="name description type return-type" />
	<xsl:namespace-alias stylesheet-prefix="m" result-prefix="#default" />
	<xsl:import href="import.xsl" />



	<xsl:variable name="global_url_base" select="'http://docs.webix.com/'" />
	<xsl:variable name="global_package_prefix" select="'com.webix.ui.model'" />
	<xsl:variable name="global_model_version" select="/model/model/version" />

	<xsl:variable name="EOL">
		<xsl:text><![CDATA[
]]></xsl:text>
	</xsl:variable>

	<xsl:key name="get_type_by_ref" match="/model/model/types/type" use="@ref" />
	<xsl:key name="get_type_by_name" match="/model/model/types/type" use="name" />
	<xsl:key name="get_component_by_ref" match="/model/model/components/component" use="@ref" />



	<xsl:template name="resolve_type">
		<xsl:param name="component" />
		<xsl:variable name="return-type">
			<xsl:call-template name="replace_all">
				<xsl:with-param name="str" select="normalize-space($component/return-type)" />
				<xsl:with-param name="match" select="' '" />
			</xsl:call-template>
		</xsl:variable>
		<xsl:variable name="preselected_type">
			<xsl:choose>
				<!-- explicit values for empty return-type -->
				<xsl:when test="starts-with($component/description, 'makes the pager invisible to enable')">
					<xsl:text>bool</xsl:text>
				</xsl:when>
				<xsl:when test="starts-with($component/description, 'lets the component autosize')">
					<xsl:text>bool</xsl:text>
				</xsl:when>
				<xsl:when test="starts-with($component/description, 'points to an html input field')">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/description = 'legend of fieldset'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/description = 'max value of slider'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="starts-with($component/description, 'if the parameter is set to true, the method getvalue')">
					<xsl:text>bool</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'id'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'container' and $return-type = 'element'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'data' and $return-type = 'string|array'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'tooltip' and $return-type = 'object'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'ready' and $return-type = 'function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'multi' and $return-type = 'bool|string'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'content' and $return-type = 'id|element'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'blockDates' and $return-type = 'functor'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'date' and $return-type = 'object'">
					<xsl:text>date</xsl:text>
				</xsl:when>
				<xsl:when test="($component/name = 'minDate' or $component/name = 'maxDate') and $return-type = 'mixed'">
					<xsl:text>date</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'dayTemplate' and $return-type = 'function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'events' and $return-type = 'function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'header' and $return-type = 'bool|string|function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'scroll' and $return-type = 'bool|string'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'template' and $return-type = 'function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'head' and $return-type = 'object|string'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'select' and $return-type = 'bool|string'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'templateCopy' and $return-type = 'function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'clipboard' and $return-type = 'bool|string'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'drag' and $return-type = 'bool|string'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'dragscroll' and $return-type = 'bool|string'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'externalData' and $return-type = 'function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'input' and $return-type = ''">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'template' and $return-type = 'template'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'gradient' and $return-type = 'bool|string|function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'filter' and $return-type = 'function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'sort' and $return-type = 'function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'uniteBy' and $return-type = 'function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'dragColumn' and $return-type = 'bool|string'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'value' and $return-type = 'template'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'popup' and $return-type = 'object'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'stringResult' and $return-type = ''">
					<xsl:text>bool</xsl:text>
				</xsl:when>
				<xsl:when test="($component/name = 'moreTemplate' or $component/name = 'popupTemplate') and $return-type = 'functor'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$component/name = 'click' and $return-type = 'functor'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$return-type = 'string|function'">
					<xsl:text>string</xsl:text>
				</xsl:when>
				<xsl:when test="$return-type = 'int'">
					<xsl:text>number</xsl:text>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="$return-type" />
				</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:choose>
			<!-- Modello compatible Java types -->
			<xsl:when test="$preselected_type = 'bool' or $preselected_type = 'boolean'">
				<xsl:text>Boolean</xsl:text>
			</xsl:when>
			<xsl:when test="$preselected_type = 'string'">
				<xsl:text>String</xsl:text>
			</xsl:when>
			<xsl:when test="$preselected_type = 'number'">
				<xsl:text>Integer</xsl:text>
			</xsl:when>
			<xsl:when test="$preselected_type = 'date'">
				<xsl:text>Date</xsl:text>
			</xsl:when>
			<xsl:when test="$preselected_type = 'void'">
				<xsl:text>void</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'src' and $return-type = 'any'">
				<xsl:text>String[]</xsl:text>
			</xsl:when>
			<!-- Custom types from model -->
			<xsl:when test="$component/name = 'animate' and $return-type = 'bool|object'">
				<xsl:text>model:AnimateConfig</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'type' and $component/description = 'object that specifies items presentation'">
				<xsl:text>model:TypeConfig</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'navigation' and $return-type = 'object'">
				<xsl:text>model:NavigationConfig</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'padding' and $return-type = 'object'">
				<xsl:text>model:PaddingConfig</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'padding' and $return-type = 'object'">
				<xsl:text>model:GraphItemConfig</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'delimiter' and $return-type = 'object'">
				<xsl:text>model:DelimiterConfig</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'item' and $return-type = 'object'">
				<xsl:text>model:RGBColorList</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'palette' and $return-type = 'array'">
				<xsl:text>model:RGBColorList[]</xsl:text>
			</xsl:when>
			<xsl:when test="$return-type = 'view'">
				<xsl:text>model:View</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'body' and $return-type = 'string|view'">
				<xsl:text>model:View</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'multiview' and $return-type = 'object'">
				<xsl:text>model:View</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'body' and $return-type = 'object'">
				<xsl:text>model:View</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'suggest' and $return-type = 'string|view'">
				<xsl:text>model:View</xsl:text>
			</xsl:when>
			<xsl:when test="($component/name = 'cols' or $component/name = 'rows') and $return-type = 'array'">
				<xsl:text>model:View[]</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'cells' and ($return-type = 'object' or $return-type = 'array')">
				<xsl:text>model:View[]</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'elements' and $return-type = 'array'">
				<xsl:text>model:View[]</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'pager' and $return-type = 'object'">
				<xsl:text>model:Pager</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'submenu' and $return-type = 'object'">
				<xsl:text>model:Menu</xsl:text>
			</xsl:when>
			<!-- Temporary types for replace -->
			<xsl:when test="$component/description = 'set of validation rules for the component'">
				<xsl:text>model:$Map_String_String$</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'icons' and $return-type = 'boolean|object'">
				<xsl:text>model:$Map_String_String$</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'scheme' and $return-type = 'object'">
				<xsl:text>model:$Map_String_String$</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'rules'">
				<xsl:text>model:$Map_String_String$</xsl:text>
			</xsl:when>
			<xsl:when test="$return-type = 'hash'">
				<xsl:text>model:$Map_String_String$</xsl:text>
			</xsl:when>
			<xsl:when test="$component/name = 'on' and $return-type = 'object'">
				<xsl:text>model:$Map_Event_String$</xsl:text>
			</xsl:when>
			<xsl:when test="($component/name = 'onDblClick' or $component/name = 'onMouseMove') and $return-type = 'function'">
				<xsl:text>model:$Map_String_String$</xsl:text>
			</xsl:when>
			<!-- Unknown type -->
			<xsl:otherwise>
				<xsl:text>model:UnknownType</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="resolve_classname">
		<xsl:param name="name" select="name" />
		<xsl:variable name="tmp">
			<xsl:choose>
				<xsl:when test="contains($name, '.')">
					<xsl:value-of select="substring-after($name, '.')" />
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="$name" />
				</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<xsl:value-of select="concat(translate(substring($tmp, 1, 1), $alpha_lower, $alpha_upper), substring($tmp, 2))" />
	</xsl:template>

	<xsl:template name="resolve_parent_ref">
		<xsl:param name="type_ref" select="@ref" />
		<xsl:variable name="name" select="key('get_type_by_ref', $type_ref)[1]/name" />
		<xsl:choose>
			<xsl:when test="$name = 'ui.proto'" />
			<xsl:when test="$name = 'ui.baseview'">
				<xsl:value-of select="/model/model/types/type[name = 'ui.proto']/@ref" />
			</xsl:when>
			<xsl:when test="$name = 'ui.view'">
				<xsl:value-of select="/model/model/types/type[name = 'ui.baseview']/@ref" />
			</xsl:when>
			<!-- Layouts subpackage -->
			<xsl:when test="/model/model/packages/package[types/type[@ref = $type_ref]]/name = 'Layouts'">
				<xsl:value-of select="/model/model/types/type[name = 'ui.baselayout']/@ref" />
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="/model/model/types/type[name = 'ui.view']/@ref" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template name="check_parent_type_field">
		<xsl:param name="type_ref" />
		<xsl:param name="field_component" />

		<xsl:variable name="parent_ref">
			<xsl:call-template name="resolve_parent_ref">
				<xsl:with-param name="type_ref" select="$type_ref" />
			</xsl:call-template>
		</xsl:variable>

		<xsl:if test="string-length($parent_ref) > 0">
			<xsl:variable name="in_key"
				select="concat($field_component/name, ';', $field_component/return-type, ';', $field_component/description)" />

			<xsl:for-each select="key('get_type_by_ref', $parent_ref)/fields/field">
				<xsl:variable name="component" select="key('get_component_by_ref', @ref)[1]" />
				<xsl:variable name="component_key" select="concat($component/name, ';', $component/return-type, ';', $component/description)" />
				<xsl:if test="$in_key = $component_key">
					<xsl:value-of select="'1'" />
				</xsl:if>
			</xsl:for-each>
			<xsl:call-template name="check_parent_type_field">
				<xsl:with-param name="type_ref" select="$parent_ref" />
				<xsl:with-param name="field_component" select="$field_component" />
			</xsl:call-template>
		</xsl:if>
	</xsl:template>

	<xsl:template name="check_child_type_field">
		<xsl:param name="type_ref" />
		<xsl:param name="field_component" />

		<xsl:for-each select="/model/model/types/type[@ref != $type_ref]">
			<xsl:variable name="current_type_ref" select="@ref" />
			<xsl:variable name="parent_ref">
				<xsl:call-template name="resolve_parent_ref" />
			</xsl:variable>

			<xsl:if test="$type_ref = $parent_ref">
				<xsl:for-each select="fields/field[name = $field_component/name]">
					<xsl:variable name="current_field_component" select="key('get_component_by_ref', @ref)[1]" />
					<xsl:if
						test="$current_field_component/return-type != $field_component/return-type or $current_field_component/description != $field_component/description">
						<xsl:value-of select="'1'" />
					</xsl:if>
				</xsl:for-each>

				<xsl:call-template name="check_child_type_field">
					<xsl:with-param name="type_ref" select="$current_type_ref" />
					<xsl:with-param name="field_component" select="$field_component" />
				</xsl:call-template>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>



	<xsl:template name="proceed_class">
		<xsl:variable name="type_ref" select="@ref" />
		<xsl:variable name="subpackage" select="/model/model/packages/package[types/type[@ref = $type_ref]]/name" />
		<xsl:variable name="classname">
			<xsl:call-template name="resolve_classname" />
		</xsl:variable>
		<xsl:variable name="superclass_ref">
			<xsl:call-template name="resolve_parent_ref" />
		</xsl:variable>
		<xsl:variable name="superclass_node" select="key('get_type_by_ref', $superclass_ref)" />
		<class>
			<!-- java.abstract="false" -->
			<packageName>
				<xsl:value-of select="$global_package_prefix" />
				<xsl:if test="$subpackage">
					<xsl:text>.</xsl:text>
					<xsl:call-template name="substr_alpha_prefix">
						<xsl:with-param name="str" select="translate($subpackage, $alpha_upper, $alpha_lower)" />
					</xsl:call-template>
				</xsl:if>
			</packageName>
			<xsl:if test="string-length($superclass_ref) &gt; 0">
				<superClass>
					<xsl:call-template name="resolve_classname">
						<xsl:with-param name="name" select="$superclass_node/name" />
					</xsl:call-template>
				</superClass>
			</xsl:if>
			<name>
				<xsl:value-of select="$classname" />
			</name>
			<description>
				<xsl:value-of
					select="concat(translate(substring(description, 1, 1), $alpha_lower, $alpha_upper), substring(description, 2))" />
			</description>
			<annotations>
				<annotation>
					<xsl:text>@com.webix.ui.model.WebixEvent({</xsl:text>
					<xsl:for-each select="events/event">
						<xsl:if test="position() &gt; 1">
							<xsl:text>,</xsl:text>
						</xsl:if>
						<xsl:value-of select="concat($EOL, '    com.webix.ui.model.Event.')" />
						<xsl:call-template name="java_constant_name">
							<xsl:with-param name="name" select="name" />
						</xsl:call-template>
					</xsl:for-each>
					<xsl:value-of select="concat($EOL, '})')" />
				</annotation>
				<annotation>
					<xsl:text>@com.webix.ui.model.WebixName(&quot;</xsl:text>
					<xsl:choose>
						<xsl:when test="contains(name, '.')">
							<xsl:value-of select="substring-after(name, '.')" />
						</xsl:when>
						<xsl:otherwise>
							<xsl:value-of select="name" />
						</xsl:otherwise>
					</xsl:choose>
					<xsl:text>&quot;)</xsl:text>
				</annotation>
				<annotation>@javax.xml.bind.annotation.XmlRootElement</annotation>
			</annotations>
			<fields>
				<xsl:for-each select="fields/field">
					<xsl:variable name="component" select="(key('get_component_by_ref', @ref))[1]" />

					<xsl:variable name="check_parent_field">
						<xsl:call-template name="check_parent_type_field">
							<xsl:with-param name="type_ref" select="$type_ref" />
							<xsl:with-param name="field_component" select="$component" />
						</xsl:call-template>
					</xsl:variable>

					<xsl:variable name="check_child_field">
						<xsl:call-template name="check_child_type_field">
							<xsl:with-param name="type_ref" select="$type_ref" />
							<xsl:with-param name="field_component" select="$component" />
						</xsl:call-template>
					</xsl:variable>

					<xsl:choose>
						<xsl:when test="contains($check_parent_field, '1')">
							<xsl:comment>
								<xsl:value-of select="concat('field=', @ref, ', parent type contains same field')" />
							</xsl:comment>
						</xsl:when>
						<xsl:when test="contains($check_child_field, '1')">
							<xsl:comment>
								<xsl:value-of select="concat('field=', @ref, ', child type contains field with same name but different declaration')" />
							</xsl:comment>
						</xsl:when>
						<xsl:otherwise>
							<xsl:call-template name="proceed_field" />
						</xsl:otherwise>
					</xsl:choose>
				</xsl:for-each>
			</fields>
			<!-- <codeSegments>
				<xsl:for-each select="methods/method">
					<xsl:variable name="localname" select="name" />
					<xsl:if test="count($superclass_node/methods/method[name = $localname]) = 0">
						<xsl:call-template name="proceed_method">
							<xsl:with-param name="type_ref" select="$type_ref" />
						</xsl:call-template>
					</xsl:if>
				</xsl:for-each>
			</codeSegments> -->
		</class>
	</xsl:template>

	<xsl:template name="proceed_field">
		<xsl:variable name="component" select="(key('get_component_by_ref', @ref))[1]" />
		<xsl:variable name="description" select="normalize-space($component/description)" />
		<xsl:variable name="component_type">
			<xsl:call-template name="replace_all">
				<xsl:with-param name="str">
					<xsl:call-template name="replace_all">
						<xsl:with-param name="str" select="normalize-space($component/return-type)" />
						<xsl:with-param name="match" select="' '" />
					</xsl:call-template>
				</xsl:with-param>
				<xsl:with-param name="match" select="'&quot;'" />
				<xsl:with-param name="replacement" select="'\&quot;'" />
			</xsl:call-template>
		</xsl:variable>
		<xsl:variable name="resolved_type">
			<xsl:call-template name="resolve_type">
				<xsl:with-param name="component" select="$component" />
			</xsl:call-template>
		</xsl:variable>
		<xsl:variable name="resolved_type_name">
			<xsl:choose>
				<xsl:when test="contains($resolved_type, '[]')">
					<xsl:value-of select="substring-before($resolved_type, '[]')" />
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="$resolved_type" />
				</xsl:otherwise>
			</xsl:choose>
		</xsl:variable>
		<field>
			<xsl:copy-of select="name" />
			<description>
				<xsl:variable name="description_url"
					select="concat('&lt;br /&gt;&lt;br /&gt;&lt;a href=&quot;', $global_url_base, @ref, '&quot;&gt;Webix API Reference&lt;/a&gt;')" />
				<xsl:value-of
					select="concat(translate(substring($description, 1, 1), $alpha_lower, $alpha_upper), substring($description, 2), $description_url)" />
			</description>
			<annotations>
				<annotation>
					<xsl:value-of select="concat('@com.webix.ui.model.WebixType(&quot;', $component_type, '&quot;)')" />
				</annotation>
			</annotations>
			<xsl:choose>
				<xsl:when test="starts-with($resolved_type_name, 'model:')">
					<association java.adder="false">
						<type>
							<xsl:value-of select="substring-after($resolved_type_name, 'model:')" />
						</type>
						<xsl:if test="contains($resolved_type, '[]')">
							<multiplicity>*</multiplicity>
						</xsl:if>
					</association>
				</xsl:when>
				<xsl:otherwise>
					<type>
						<xsl:value-of select="$resolved_type_name" />
					</type>
				</xsl:otherwise>
			</xsl:choose>
		</field>
	</xsl:template>

	<xsl:template name="proceed_method">
		<xsl:param name="type_ref" />
		<xsl:variable name="component" select="(key('get_component_by_ref', @ref))[1]" />
		<xsl:variable name="description_text"
			select="concat(translate(substring($component/description, 1, 1), $alpha_lower, $alpha_upper), substring($component/description, 2))" />
		<xsl:variable name="return_type_name" select="normalize-space($component/return-type)" />
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
		<!-- Check name conflict -->
		<xsl:if
			test="not($is_accessor_method) or ($is_accessor_method and 0 = count(/model/model/types/type[@ref=$type_ref]/fields/field[name = $method_name_suffix]))">
			<xsl:variable name="resolved_type">
				<xsl:call-template name="resolve_type">
					<xsl:with-param name="component" select="$component" />
				</xsl:call-template>
			</xsl:variable>
			<xsl:variable name="resolved_type_name">
				<xsl:choose>
					<xsl:when test="starts-with($resolved_type, 'model:')">
						<xsl:value-of select="substring-after($resolved_type, 'model:')" />
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="$resolved_type" />
					</xsl:otherwise>
				</xsl:choose>
			</xsl:variable>
			<xsl:variable name="return_value_clause">
				<xsl:if test="$resolved_type_name != 'void'">
					<xsl:value-of select="'return null;'" />
				</xsl:if>
			</xsl:variable>
			<codeSegment>
<!-- Code formatting explicitly defined / start -->
				<xsl:element name="code">
					<xsl:text disable-output-escaping="yes">&lt;![CDATA[</xsl:text><![CDATA[/**
     * ]]><xsl:value-of select="$description_text" /><![CDATA[
     */
    ]]><xsl:value-of select="concat('public ', $resolved_type_name, ' ', name, '()')" /><![CDATA[ {
        ]]><xsl:value-of select="$return_value_clause" /><![CDATA[
    }]]><xsl:text disable-output-escaping="yes">]]&gt;</xsl:text>
				</xsl:element>
<!-- Code formatting explicitly defined / end -->
			</codeSegment>
		</xsl:if>
	</xsl:template>

	<xsl:template name="temp_class">
		<xsl:param name="classname" />
		<class java.abstract="true">
			<packageName>exclude</packageName>
			<name>
				<xsl:value-of select="$classname" />
			</name>
			<description>Temporary class. It will be replaced during generate-sources step. If you see this class then you have
				incorrect build.</description>
		</class>
	</xsl:template>


	<xsl:template match="/">
		<model java.suppressAllWarnings="false">
			<id>
				<xsl:value-of select="$global_package_prefix" />
			</id>
			<name>Webix UI data model</name>
			<classes>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<name>UnknownType</name>
					<description>Temporary used for unparsed types</description>
				</class>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<name>AnimateConfig</name>
					<fields>
						<field>
							<description>The animation direction. Available values: left, right, top, bottom.</description>
							<type>String</type>
							<name>direction</name>
						</field>
						<field>
							<description>The type of animation. Available values: slide, flip. The default value - 'slide'.</description>
							<type>String</type>
							<name>type</name>
							<defaultValue>slide</defaultValue>
						</field>
						<field>
							<description>The subtype of animation. The default value - 'together'.
								&lt;ul&gt;
									&lt;li&gt;if type = slide : together, in, out&lt;/li&gt;
									&lt;li&gt;if type:flip : horizontal, vertical&lt;/li&gt;
								&lt;/ul&gt;</description>
							<type>String</type>
							<name>subtype</name>
							<defaultValue>together</defaultValue>
						</field>
					</fields>
				</class>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<name>TypeConfig</name>
					<description>Object that specifies items presentation</description>
					<fields>
						<field>
							<description>The name of a css class that will be applied to component's items (the default name of the applied class is 'default').</description>
							<type>String</type>
							<name>css</name>
						</field>
						<field>
							<description>The height of an item in the component.</description>
							<type>Integer</type>
							<name>height</name>
						</field>
						<field>
							<description>An html template that will define item presentation in the component.</description>
							<type>String</type>
							<name>template</name>
						</field>
						<field>
							<description>The width of the items list.</description>
							<type>Integer</type>
							<name>width</name>
						</field>
						<field>
							<description>For menu: if true shows an array of menu items that feature a submenu.</description>
							<type>Boolean</type>
							<name>subsign</name>
						</field>
					</fields>
				</class>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<name>NavigationConfig</name>
					<description>Object that defines navigation parameters</description>
					<fields>
						<field>
							<description>enables navigation items (by default, true)</description>
							<type>Boolean</type>
							<name>items</name>
							<defaultValue>true</defaultValue>
						</field>
						<field>
							<description>enables "previos" and "next" arrow buttons (by default, true)</description>
							<type>Boolean</type>
							<name>buttons</name>
							<defaultValue>true</defaultValue>
						</field>
						<field>
							<description>defines navigation styling (by default, corner)</description>
							<type>String</type>
							<name>type</name>
							<defaultValue>corner</defaultValue>
						</field>
					</fields>
				</class>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<name>PaddingConfig</name>
					<description>Object that defines paddings of the component content</description>
					<fields>
						<field>
							<type>Integer</type>
							<name>top</name>
						</field>
						<field>
							<type>Integer</type>
							<name>bottom</name>
						</field>
						<field>
							<type>Integer</type>
							<name>left</name>
						</field>
						<field>
							<type>Integer</type>
							<name>right</name>
						</field>
					</fields>
				</class>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<description>Defines styling for a point on the graph line</description>
					<name>GraphItemConfig</name>
					<fields>
						<field>
							<description>Radius on the point in the chart</description>
							<type>Integer</type>
							<name>radius</name>
						</field>
						<field>
							<description>Radius of the virtual circle which events will fire for items within</description>
							<type>Integer</type>
							<name>eventRadius</name>
						</field>
						<field>
							<description>Border color for the point</description>
							<type>String</type>
							<name>borderColor</name>
						</field>
						<field>
							<description>Inner color of the point</description>
							<type>String</type>
							<name>color</name>
						</field>
					</fields>
				</class>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<description>CSV delimiters for clipboard operations</description>
					<name>DelimiterConfig</name>
					<fields>
						<field>
							<description>The rows delimiter, default rows delimiter - '\n' (new-line character)</description>
							<type>String</type>
							<name>rows</name>
						</field>
						<field>
							<description>The columns delimiter, default columns delimiter - '\t' (horizontal tab)</description>
							<type>String</type>
							<name>cols</name>
						</field>
					</fields>
				</class>
				<!-- =================================================================== -->
				<xsl:call-template name="temp_class">
					<xsl:with-param name="classname" select="'$Event$'" />
				</xsl:call-template>
				<xsl:call-template name="temp_class">
					<xsl:with-param name="classname" select="'$Map_Event_String$'" />
				</xsl:call-template>
				<xsl:call-template name="temp_class">
					<xsl:with-param name="classname" select="'$Map_String_String$'" />
				</xsl:call-template>
				<xsl:call-template name="temp_class">
					<xsl:with-param name="classname" select="'$RGBColor$'" />
				</xsl:call-template>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<name>EventHandler</name>
					<fields>
						<field>
							<name>event</name>
							<association>
								<type>$Event$</type>
								<multiplicity>1</multiplicity>
							</association>
						</field>
						<field>
							<type>String</type>
							<name>data</name>
						</field>
					</fields>
				</class>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<name>EventHandlerList</name>
					<fields>
						<field>
							<name>events</name>
							<association java.adder="false">
								<type>EventHandler</type>
								<multiplicity>*</multiplicity>
							</association>
						</field>
					</fields>
				</class>
				<class>
					<packageName>
						<xsl:value-of select="$global_package_prefix" />
					</packageName>
					<name>RGBColorList</name>
					<fields>
						<field>
							<name>colors</name>
							<association java.adder="false">
								<type>$RGBColor$</type>
								<multiplicity>*</multiplicity>
							</association>
						</field>
					</fields>
				</class>
				<xsl:for-each select="model/model/types/type">
					<xsl:call-template name="proceed_class" />
				</xsl:for-each>
			</classes>
		</model>
	</xsl:template>
</xsl:transform>
