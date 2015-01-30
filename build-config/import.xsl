<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

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

	<xsl:template name="replace_all">
		<xsl:param name="str" />
		<xsl:param name="match" />
		<xsl:param name="replacement" select="" />
		<xsl:choose>
			<xsl:when test="contains($str, $match)">
				<xsl:call-template name="replace_all">
					<xsl:with-param name="str"
						select="concat(substring-before($str, $match), $replacement, substring-after($str, $match))" />
					<xsl:with-param name="match" select="$match" />
					<xsl:with-param name="replacement" select="$replacement" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$str" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

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

	<xsl:template name="node_exists">
		<xsl:param name="nodes" />
		<xsl:param name="text" />
		<xsl:param name="pos" />
		<xsl:value-of select="$nodes[position() &lt; $pos and . = $text]" />
	</xsl:template>

	<xsl:template name="java_constant_name">
		<xsl:param name="name" />
		<xsl:param name="pos" select="1" />
		<xsl:choose>
			<xsl:when test="$pos &gt; string-length($name)">
				<xsl:value-of select="translate($name, $alpha_lower, $alpha_upper)" />
			</xsl:when>
			<xsl:when
				test="contains($alpha_upper, substring($name, $pos, 1)) and contains($alpha_lower, substring($name, $pos - 1, 1))">
				<xsl:call-template name="java_constant_name">
					<xsl:with-param name="name" select="concat(substring($name, 1, $pos - 1), '_', substring($name, $pos))" />
					<xsl:with-param name="pos" select="$pos + 1" />
				</xsl:call-template>
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="java_constant_name">
					<xsl:with-param name="name" select="$name" />
					<xsl:with-param name="pos" select="$pos + 1" />
				</xsl:call-template>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

</xsl:transform>