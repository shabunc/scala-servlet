<?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">

<xsl:template match="/page">
    <xsl:apply-templates select="data" />
</xsl:template>

<xsl:template match="data">
    LABEL:
    <xsl:value-of select="." />
</xsl:template>

</xsl:stylesheet>

