<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:h="http://www.w3.org/1999/xhtml">
	<xsl:output method="xml" encoding="UTF-8" indent="yes" />



	<xsl:param name="step.current" />
	<xsl:param name="step.next" />
	<xsl:param name="sourcefile" />

	<xsl:variable name="global_url_base" select="'http://docs.webix.com/'" />



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



	<xsl:template name="process_toc_page">
		<file>
			<xsl:attribute name="location">
				<xsl:value-of select="'descriptor-ready/type/'" />
				<xsl:call-template name="substr_before_last">
					<xsl:with-param name="str" select="$sourcefile" />
					<xsl:with-param name="needle" select="'.'" />
				</xsl:call-template>
				<xsl:value-of select="'.xml'" />
			</xsl:attribute>
			<descriptor>
				<!-- ()[position()&gt;=19 and position()&lt;=27] -->
				<xsl:for-each select="//h:div[@id='doc_content']/h:table[@class='webixtoc']/h:tbody/h:tr/h:td[position()=2]/h:a">
					<source-url>
						<xsl:value-of select="concat($global_url_base, @href)" />
					</source-url>
				</xsl:for-each>
			</descriptor>
		</file>
		<file omit-xml-declaration="yes">
			<xsl:attribute name="location">
				<xsl:value-of select="'model/'" />
				<xsl:call-template name="substr_before_last">
					<xsl:with-param name="str" select="$sourcefile" />
					<xsl:with-param name="needle" select="'.'" />
				</xsl:call-template>
				<xsl:value-of select="'.xml'" />
			</xsl:attribute>
			<packages>
				<xsl:for-each select="//h:div[@id='doc_content']/h:div[@class='h2']">
					<package>
						<name>
							<xsl:value-of select="." />
						</name>
						<types>
							<xsl:for-each select="following-sibling::h:table[@class='webixtoc' and position()=1]//h:tr/h:td/h:a">
								<type ref="{@href}" />
							</xsl:for-each>
						</types>
					</package>
				</xsl:for-each>
			</packages>
		</file>
	</xsl:template>

	<xsl:template name="process_type_page">
		<!-- components -->
		<file>
			<xsl:attribute name="location">
				<xsl:value-of select="'descriptor-ready/component/'" />
				<xsl:call-template name="substr_before_last">
					<xsl:with-param name="str" select="$sourcefile" />
					<xsl:with-param name="needle" select="'.'" />
				</xsl:call-template>
				<xsl:value-of select="'.xml'" />
			</xsl:attribute>
			<descriptor>
				<xsl:for-each select="//h:div[@id='doc_content']/h:div[@class='h2']/following-sibling::h:table[1]/h:tr/h:td/h:a">
					<source-url>
						<xsl:value-of select="concat($global_url_base, @href)" />
					</source-url>
				</xsl:for-each>
			</descriptor>
		</file>
		<!-- types -->
		<file omit-xml-declaration="yes">
			<xsl:attribute name="location">
				<xsl:value-of select="'model/'" />
				<xsl:call-template name="substr_before_last">
					<xsl:with-param name="str" select="$sourcefile" />
					<xsl:with-param name="needle" select="'.'" />
				</xsl:call-template>
				<xsl:value-of select="'.xml'" />
			</xsl:attribute>
			<types>
				<xsl:for-each select="//h:div[@id='doc_content']">
					<type ref="{$sourcefile}">
						<name>
							<xsl:value-of select="h:h1[1]" />
						</name>
						<description>
							<xsl:apply-templates select="h:p[position()&lt;3]" mode="description_text" />
						</description>
						<references>
							<xsl:for-each select="h:div[@class='webixdoc_parents']/h:a">
								<reference ref="{@href}">
									<name>
										<xsl:value-of select="." />
									</name>
									<type>based on</type>
								</reference>
							</xsl:for-each>
						</references>
						<fields>
							<xsl:for-each select="h:div[@class='h2' and text()='Properties']/following-sibling::h:table[1]/h:tr[h:td[1]/h:a]">
								<xsl:call-template name="process_type_component">
									<xsl:with-param name="component_type" select="'field'" />
								</xsl:call-template>
							</xsl:for-each>
						</fields>
						<methods>
							<xsl:for-each select="h:div[@class='h2' and text()='Methods']/following-sibling::h:table[1]/h:tr[h:td[1]/h:a]">
								<xsl:call-template name="process_type_component">
									<xsl:with-param name="component_type" select="'method'" />
								</xsl:call-template>
							</xsl:for-each>
						</methods>
						<events>
							<xsl:for-each select="h:div[@class='h2' and text()='Events']/following-sibling::h:table[1]/h:tr[h:td[1]/h:a]">
								<xsl:call-template name="process_type_component">
									<xsl:with-param name="component_type" select="'event'" />
								</xsl:call-template>
							</xsl:for-each>
						</events>
						<other-components>
							<xsl:for-each select="h:div[@class='h2' and text()='Other']/following-sibling::h:table[1]/h:tr[h:td[1]/h:a]">
								<xsl:call-template name="process_type_component">
									<xsl:with-param name="component_type" select="'other-component'" />
								</xsl:call-template>
							</xsl:for-each>
						</other-components>
					</type>
				</xsl:for-each>
			</types>
		</file>
	</xsl:template>

	<xsl:template name="process_component_page">
		<file omit-xml-declaration="yes">
			<xsl:attribute name="location">
				<xsl:value-of select="'model/'" />
				<xsl:call-template name="substr_before_last">
					<xsl:with-param name="str" select="$sourcefile" />
					<xsl:with-param name="needle" select="'.'" />
				</xsl:call-template>
				<xsl:value-of select="'.xml'" />
			</xsl:attribute>
			<components>
				<xsl:for-each select="//h:div[@id='doc_content']">
					<component ref="{$sourcefile}">
						<name>
							<xsl:value-of select="h:div[@class='signature']/h:b[1]" />
						</name>
						<return-type>
							<xsl:value-of select="h:div[@class='signature']/h:em[1]" />
						</return-type>
						<parameters>
							<xsl:for-each select="h:div[@class='signature']/h:b[1]/following-sibling::h:b">
								<xsl:variable name="prev_text" select="preceding-sibling::text()[contains(self::node(), '[')]" />
								<xsl:variable name="next_text" select="following-sibling::text()[contains(self::node(), ']')]" />
								<parameter>
									<type>
										<xsl:value-of select="preceding-sibling::h:em[1]" />
									</type>
									<name>
										<xsl:value-of select="." />
									</name>
									<is-optional>
										<xsl:choose>
											<xsl:when test="string-length($prev_text) &gt; 0 and string-length($next_text) &gt; 0">
												<xsl:text>Y</xsl:text>
											</xsl:when>
											<xsl:otherwise>
												<xsl:text>N</xsl:text>
											</xsl:otherwise>
										</xsl:choose>
									</is-optional>
								</parameter>
							</xsl:for-each>
						</parameters>
						<description>
							<xsl:value-of select="h:p[1]" />
						</description>
						<references>
							<xsl:for-each select="h:h4[text()='See also']/following-sibling::h:div[@class='apitable']/h:ul/h:li/h:div/h:ul/h:li/h:a">
								<reference ref="{@href}">
									<name>
										<xsl:value-of select="." />
									</name>
									<type>
										<xsl:value-of select="../../../../h:div[@class='alsogroup']" />
									</type>
								</reference>
							</xsl:for-each>
						</references>
						<!-- <details>
							<xsl:variable name="pos" />
							<xsl:for-each select="h:h2[text()='Details']/following-sibling::*">
								<xsl:if test="local-name()='a' and @href='#top'">
									<xsl:variable name="pos" select="position()" />
								</xsl:if>
								<xsl:value-of select="concat(local-name(), '=', position())" />
							</xsl:for-each>
							<xsl:value-of select="$pos" />
							<xsl:variable name="last_node_pos" select="h:h2[text()='Details']/following-sibling::h:a[@href='#top']/self::position()" />
							<xsl:for-each select="h:h2[text()='Details']/following-sibling::*[position()&lt;$last_node_pos]">
								<xsl:copy-of select="." />
							</xsl:for-each>
						</details> -->
					</component>
				</xsl:for-each>
			</components>
		</file>
	</xsl:template>

	<xsl:template name="process_version_page">
		<file omit-xml-declaration="yes">
			<xsl:attribute name="location">
				<xsl:value-of select="'model/'" />
				<xsl:call-template name="substr_before_last">
					<xsl:with-param name="str" select="$sourcefile" />
					<xsl:with-param name="needle" select="'.'" />
				</xsl:call-template>
				<xsl:value-of select="'.xml'" />
			</xsl:attribute>
			<version>
				<xsl:value-of select="substring-after(//h:div[@id='doc_content']/h:ul/h:li[1]/h:a, 'Version ')" />
			</version>
		</file>
	</xsl:template>



	<xsl:template name="process_type_component">
		<xsl:param name="component_type" />
		<xsl:element name="{$component_type}">
			<xsl:attribute name="ref">
				<!-- <xsl:value-of select="concat($global_url_base, h:td[1]/h:a/@href)" /> -->
				<xsl:value-of select="h:td[1]/h:a/@href" />
			</xsl:attribute>
			<name>
				<xsl:value-of select="h:td[1]/h:a" />
			</name>
			<description>
				<xsl:value-of select="h:td[position()=2]" />
			</description>
		</xsl:element>
	</xsl:template>

	<xsl:template match="h:*" mode="description_text" priority="100">
		<xsl:choose>
			<xsl:when test="self::text()">
				<xsl:value-of select="." />
			</xsl:when>
			<xsl:when test="local-name() = 'a'">
				<xsl:value-of select="concat('&lt;a href=&quot;', $global_url_base, @href, '&quot;&gt;', ., '&lt;/a&gt;')" />
			</xsl:when>
			<xsl:otherwise>
				<xsl:apply-templates mode="description_text" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>



	<xsl:template match="/" priority="1">
		<descriptor>
			<xsl:choose>
				<xsl:when test="$sourcefile = 'api__toc__ui.html'">
					<xsl:call-template name="process_toc_page" />
				</xsl:when>
				<xsl:when test="$sourcefile = 'api__toc__ui_mixins.html'"></xsl:when>
				<xsl:when test="$sourcefile = 'desktop__whats_new.html'">
					<xsl:call-template name="process_version_page" />
				</xsl:when>
				<xsl:when test="starts-with($sourcefile, 'api__refs__ui.')">
					<xsl:call-template name="process_type_page" />
				</xsl:when>
				<xsl:when
					test="starts-with($sourcefile, 'api__link__ui.') or starts-with($sourcefile, 'api__ui.') or $sourcefile='datatable__frozen_columns.html'">
					<xsl:call-template name="process_component_page" />
				</xsl:when>
				<xsl:otherwise>
					<xsl:message terminate="yes">
						<xsl:value-of select="concat('Unsupported element, sourcefile:', $sourcefile)" />
					</xsl:message>
				</xsl:otherwise>
			</xsl:choose>
		</descriptor>
	</xsl:template>

</xsl:transform>
