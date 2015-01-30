<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />
	<xsl:strip-space elements="name description type return-type" />
	<xsl:import href="import.xsl" />



	<xsl:variable name="alpha_lower" select="'abcdefghqijklmnoprstuvwxyz'" />
	<xsl:variable name="alpha_upper" select="'ABCDEFGHQIJKLMNOPRSTUVWXYZ'" />

	<xsl:variable name="global_url_base" select="'http://docs.webix.com/'" />
	<xsl:variable name="global_package_prefix" select="'com.webix.ui.model'" />



	<xsl:template match="/">
		<descriptor>
			<file location="{translate($global_package_prefix, '.', '/')}/Event.xml">
				<xml2java>
					<package>
						<xsl:value-of select="$global_package_prefix" />
					</package>
					<imports>
						<import>com.webix.ui.utils.StringUtils</import>
					</imports>
					<enum>
						<name>Event</name>
						<constants>
							<xsl:variable name="n" select="(model/types/type/events/event/name)" />
							<xsl:for-each select="model/types/type/events/event">
								<xsl:variable name="prev_node_name">
									<xsl:call-template name="node_exists">
										<xsl:with-param name="nodes" select="$n" />
										<xsl:with-param name="text" select="name" />
										<xsl:with-param name="pos" select="position()" />
									</xsl:call-template>
								</xsl:variable>
								<xsl:if test="$prev_node_name != name">
									<constant>
										<name>
											<xsl:call-template name="java_constant_name">
												<xsl:with-param name="name" select="name" />
											</xsl:call-template>
										</name>
										<description>
											<xsl:value-of
												select="concat(translate(substring(description, 1, 1), $alpha_lower, $alpha_upper), substring(description, 2))" />
										</description>
									</constant>
								</xsl:if>
							</xsl:for-each>
						</constants>
						<methods>
							<method>
								<return-type>String</return-type>
								<name>toWebixName</name>
								<body><![CDATA[return StringUtils.enumToCamelCase(name());]]></body>
							</method>
							<method>
								<return-type>Event</return-type>
								<name>fromWebixName</name>
								<arguments>
									<argument>
										<type>String</type>
										<name>webixName</name>
									</argument>
								</arguments>
								<body><![CDATA[return valueOf(Event.class, StringUtils.camelCaseToEnum(webixName));]]></body>
							</method>
						</methods>
					</enum>
				</xml2java>
			</file>
			<file location="{translate($global_package_prefix, '.', '/')}/WebixEvent.xml">
				<xml2java>
					<package>
						<xsl:value-of select="$global_package_prefix" />
					</package>
					<imports>
						<import>java.lang.annotation.Retention</import>
						<import>java.lang.annotation.RetentionPolicy</import>
						<import>java.lang.annotation.Target</import>
						<import>java.lang.annotation.ElementType</import>
					</imports>
					<annotation>
						<annotations>
							<annotation>Retention(RetentionPolicy.RUNTIME)</annotation>
							<annotation>Target(ElementType.TYPE)</annotation>
						</annotations>
						<name>WebixEvent</name>
						<methods>
							<method>
								<return-type>Event[]</return-type>
								<name>value</name>
							</method>
						</methods>
					</annotation>
				</xml2java>
			</file>
			<file location="{translate($global_package_prefix, '.', '/')}/WebixType.xml">
				<xml2java>
					<package>
						<xsl:value-of select="$global_package_prefix" />
					</package>
					<imports>
						<import>java.lang.annotation.Retention</import>
						<import>java.lang.annotation.RetentionPolicy</import>
						<import>java.lang.annotation.Target</import>
						<import>java.lang.annotation.ElementType</import>
					</imports>
					<annotation>
						<annotations>
							<annotation>Retention(RetentionPolicy.RUNTIME)</annotation>
							<annotation>Target(ElementType.FIELD)</annotation>
						</annotations>
						<name>WebixType</name>
						<description>Original Webix data type used for element</description>
						<methods>
							<method>
								<return-type>String</return-type>
								<name>value</name>
							</method>
						</methods>
					</annotation>
				</xml2java>
			</file>
			<file location="{translate($global_package_prefix, '.', '/')}/WebixName.xml">
				<xml2java>
					<package>
						<xsl:value-of select="$global_package_prefix" />
					</package>
					<imports>
						<import>java.lang.annotation.Retention</import>
						<import>java.lang.annotation.RetentionPolicy</import>
						<import>java.lang.annotation.Target</import>
						<import>java.lang.annotation.ElementType</import>
					</imports>
					<annotation>
						<annotations>
							<annotation>Retention(RetentionPolicy.RUNTIME)</annotation>
							<annotation>Target(ElementType.TYPE)</annotation>
						</annotations>
						<name>WebixName</name>
						<description>Original Webix element name</description>
						<methods>
							<method>
								<return-type>String</return-type>
								<name>value</name>
							</method>
						</methods>
					</annotation>
				</xml2java>
			</file>
			<!-- == debug files ================================================================= -->
			<file location="../debug-type-hierarchy.xml">
				<type-hierarchy>
					<components-count>
						<xsl:for-each select="/model/types/type">
							<xsl:sort
								select="concat(count(fields/field), '.', count(other-components/other-component), '.', count(methods/method), '.', count(events/event))" />
							<type ref="{@ref}" xfields="{count(fields/field)}" xmethods="{count(methods/method)}" xevents="{count(events/event)}"
								xother="{count(other-components/other-component)}" />
						</xsl:for-each>
					</components-count>
					<inheritance-count>
						<xsl:for-each select="/model/types/type">
							<xsl:sort select="count(references/reference[type = 'based on'])" data-type="number" />
							<xsl:variable name="r" select="@ref" />
							<type ref="{$r}" xparents="{count(references/reference[type = 'based on'])}"
								xchilds="{count(/model/types/type[references/reference[type = 'based on' and @ref = $r]])}" />
						</xsl:for-each>
					</inheritance-count>
					<down-up>
						<xsl:for-each select="/model/types/type/references/reference[type = 'based on']">
							<xsl:sort select="../../@ref" />
							<hierarchy r="{../../@ref}" l="{@ref}" />
						</xsl:for-each>
					</down-up>
					<up-down>
						<xsl:for-each select="/model/types/type/references/reference[type = 'based on']">
							<xsl:sort select="@ref" />
							<hierarchy r="{@ref}" l="{../../@ref}" />
						</xsl:for-each>
					</up-down>
				</type-hierarchy>
			</file>
		</descriptor>
	</xsl:template>
</xsl:transform>
