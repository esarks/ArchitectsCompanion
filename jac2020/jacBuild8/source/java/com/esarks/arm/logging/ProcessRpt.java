//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.logging;

import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.sql.*;
//import java.net.*;
//import javax.net.ssl.*;
//import java.security.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.awt.*;
//import javax.swing.*;

import com.esarks.jac.*;
import com.esarks.mic.*;

//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class ProcessRpt extends com.esarks.mic.Report  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected ProcessRpt() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public ProcessRpt(Script aScript) {

    super(aScript);

  }
//  Generated at 2005.06.16 04:53:16.037 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED

  public void render(String aOutput, String aStereotype, com.esarks.arm.model.jeo.ServiceJeo aJeo) {
    renderHtml(aOutput, aJeo);
    renderXml(aOutput, aJeo);
  }

  public void render(String aOutput, com.esarks.arm.model.jeo.ServiceJeo aJeo) {
    renderHtml(aOutput, aJeo);
    renderXml(aOutput, aJeo);
  }

  public void renderHtml(String aOutput, com.esarks.arm.model.jeo.ServiceJeo aJeo) {
    openOutput(path(aOutput) + ".html");
    com.esarks.arm.model.jeo.ServiceJeo lJeo = aJeo;
//ScriptWriter~~    %><html><%
    {
//ScriptWriter~~~
iOutputManager.println("<html>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><!%aOutput!><br><br><%
    {
//ScriptWriter~~~
iOutputManager.println("" + aOutput + "<br><br>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    int lNbrColumns = 0;
    ArrayList lArrayListx = lJeo.getJeoByTypeName("process");
    boolean lPrintHeadingx = true;
    int lNbrColumnsx = 3;
    String lTableEndx = "</table>";
    if (lNbrColumns > 0) lTableEndx = "</table></td></tr>";
    for (int lIdx=0; lIdx < lArrayListx.size(); lIdx++) {
      com.esarks.arm.model.jeo.ProcessJeo lJeox = (com.esarks.arm.model.jeo.ProcessJeo) lArrayListx.get(lIdx);
      if (lNbrColumns > 0) {
//ScriptWriter~~        %><tr><td colspan="<!%lNbrColumns!>"><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=\"" + lNbrColumns + "\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      if (lPrintHeadingx) {
        lPrintHeadingx=false;
//ScriptWriter~~        %><table cellspacing="0" cellpadding="0" border="1"><%
        {
//ScriptWriter~~~
iOutputManager.println("<table cellspacing=\"0\" cellpadding=\"0\" border=\"1\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td width="">Time&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Time&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td width="">Code&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Code&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td width="">Description&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Description&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      %><tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><td><!%lJeox.getEventTimePropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getEventTimePropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><td><!%lJeox.getEventCodePropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getEventCodePropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><td><!%lJeox.getDescriptionPropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getDescriptionPropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      ArrayList lArrayListxx = lJeox.getJeoByTypeName("item");
      boolean lPrintHeadingxx = true;
      int lNbrColumnsxx = 3;
      String lTableEndxx = "</table>";
      if (lNbrColumnsx > 0) lTableEndxx = "</table></td></tr>";
      for (int lIdxx=0; lIdxx < lArrayListxx.size(); lIdxx++) {
        com.esarks.arm.model.jeo.ProcessJeo lJeoxx = (com.esarks.arm.model.jeo.ProcessJeo) lArrayListxx.get(lIdxx);
        if (lNbrColumnsx > 0) {
//ScriptWriter~~          %><tr><td colspan="<!%lNbrColumnsx!>"><%
          {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=\"" + lNbrColumnsx + "\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        if (lPrintHeadingxx) {
          lPrintHeadingxx=false;
//ScriptWriter~~          %><table cellspacing="0" cellpadding="0" border="1"><%
          {
//ScriptWriter~~~
iOutputManager.println("<table cellspacing=\"0\" cellpadding=\"0\" border=\"1\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><tr><%
          {
//ScriptWriter~~~
iOutputManager.println("<tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><td width="">Time&nbsp;</td><%
          {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Time&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><td width="">Code&nbsp;</td><%
          {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Code&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><td width="">Description&nbsp;</td><%
          {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Description&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %></tr><%
          {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        %><tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td><!%lJeoxx.getEventTimePropertyValue().toString()!>&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeoxx.getEventTimePropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td><!%lJeoxx.getEventCodePropertyValue().toString()!>&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeoxx.getEventCodePropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td><!%lJeoxx.getDescriptionPropertyValue().toString()!>&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeoxx.getDescriptionPropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      if (!lPrintHeadingxx) %><!%lTableEndxx!><%
      if (!lPrintHeadingxx) {
//ScriptWriter~~~
iOutputManager.println("" + lTableEndxx + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    if (!lPrintHeadingx) %><!%lTableEndx!><%
    if (!lPrintHeadingx) {
//ScriptWriter~~~
iOutputManager.println("" + lTableEndx + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></html><%
    {
//ScriptWriter~~~
iOutputManager.println("</html>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    closeOutput();
  }

  public void renderXml(String aOutput, com.esarks.arm.model.jeo.ServiceJeo aJeo) {
    openOutput(path(aOutput) + ".xml");
    com.esarks.arm.model.jeo.ServiceJeo lJeo = aJeo;
//ScriptWriter~~    %><report name="<!%aOutput!>"><%
    {
//ScriptWriter~~~
iOutputManager.println("<report name=\"" + aOutput + "\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    int lNbrColumns = 0;
    ArrayList lArrayListx = lJeo.getJeoByTypeName("process");
    boolean lPrintHeadingx = true;
    int lNbrColumnsx = 3;
    String lTableEndx = "</table>";
    for (int lIdx=0; lIdx < lArrayListx.size(); lIdx++) {
      com.esarks.arm.model.jeo.ProcessJeo lJeox = (com.esarks.arm.model.jeo.ProcessJeo) lArrayListx.get(lIdx);
      if (lPrintHeadingx) {
        lPrintHeadingx=false;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<table>
iOutputManager.println("<table>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<header>
iOutputManager.println("<header>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="eventTime" width="">Time</column>
iOutputManager.println("<column attribute=\"eventTime\" width=\"\">Time</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="eventCode" width="">Code</column>
iOutputManager.println("<column attribute=\"eventCode\" width=\"\">Code</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="description" width="">Description</column>
iOutputManager.println("<column attribute=\"description\" width=\"\">Description</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~</header>
iOutputManager.println("</header>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      String AttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<row <!%AttributeList!>>
iOutputManager.println("<row " + AttributeList + ">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      AttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<eventTime <!%AttributeList!>><!%lJeox.getEventTimePropertyValue().toString()!></eventTime>
iOutputManager.println("<eventTime " + AttributeList + ">" + lJeox.getEventTimePropertyValue().toString() + "</eventTime>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      AttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<eventCode <!%AttributeList!>><!%lJeox.getEventCodePropertyValue().toString()!></eventCode>
iOutputManager.println("<eventCode " + AttributeList + ">" + lJeox.getEventCodePropertyValue().toString() + "</eventCode>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      AttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<description <!%AttributeList!>><!%lJeox.getDescriptionPropertyValue().toString()!></description>
iOutputManager.println("<description " + AttributeList + ">" + lJeox.getDescriptionPropertyValue().toString() + "</description>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      AttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~</row>
iOutputManager.println("</row>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      ArrayList lArrayListxx = lJeox.getJeoByTypeName("item");
      boolean lPrintHeadingxx = true;
      int lNbrColumnsxx = 3;
      String lTableEndxx = "</table>";
      for (int lIdxx=0; lIdxx < lArrayListxx.size(); lIdxx++) {
        com.esarks.arm.model.jeo.ProcessJeo lJeoxx = (com.esarks.arm.model.jeo.ProcessJeo) lArrayListxx.get(lIdxx);
        if (lPrintHeadingxx) {
          lPrintHeadingxx=false;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<table>
iOutputManager.println("<table>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<header>
iOutputManager.println("<header>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="eventTime" width="">Time</column>
iOutputManager.println("<column attribute=\"eventTime\" width=\"\">Time</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="eventCode" width="">Code</column>
iOutputManager.println("<column attribute=\"eventCode\" width=\"\">Code</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="description" width="">Description</column>
iOutputManager.println("<column attribute=\"description\" width=\"\">Description</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~</header>
iOutputManager.println("</header>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        String xAttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<row <!%xAttributeList!>>
iOutputManager.println("<row " + xAttributeList + ">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


        xAttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<eventTime <!%xAttributeList!>><!%lJeoxx.getEventTimePropertyValue().toString()!></eventTime>
iOutputManager.println("<eventTime " + xAttributeList + ">" + lJeoxx.getEventTimePropertyValue().toString() + "</eventTime>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        xAttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<eventCode <!%xAttributeList!>><!%lJeoxx.getEventCodePropertyValue().toString()!></eventCode>
iOutputManager.println("<eventCode " + xAttributeList + ">" + lJeoxx.getEventCodePropertyValue().toString() + "</eventCode>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        xAttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<description <!%xAttributeList!>><!%lJeoxx.getDescriptionPropertyValue().toString()!></description>
iOutputManager.println("<description " + xAttributeList + ">" + lJeoxx.getDescriptionPropertyValue().toString() + "</description>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        xAttributeList = "";
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~</row>
iOutputManager.println("</row>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      if (!lPrintHeadingxx) %><!%lTableEndxx!><%
      if (!lPrintHeadingxx) {
//ScriptWriter~~~
iOutputManager.println("" + lTableEndxx + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    if (!lPrintHeadingx) %><!%lTableEndx!><%
    if (!lPrintHeadingx) {
//ScriptWriter~~~
iOutputManager.println("" + lTableEndx + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~</report>
iOutputManager.println("</report>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    closeOutput();
  }
  public void renderFromXml(String aXmlFile) {

    parseXmlPath(path(aXmlFile) + ".xml");
    com.esarks.arm.model.jeo.ServiceJeo lJeo = new com.esarks.arm.model.jeo.ServiceJeo();
//ScriptWriter~~    <!report:jeo!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).resetIterator();
//ScriptWriter~~    while (<!report:jeo!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).next()) {
      com.esarks.arm.model.jeo.ProcessJeo lJeox = new com.esarks.arm.model.jeo.ProcessJeo("process");
      lJeo.addJeo(lJeox);
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "eventTime")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "eventTime")) {
//ScriptWriter~~        lJeox.setEventTime(<![report:jeo:attribute:value]!>);
        lJeox.setEventTime(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "eventCode")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "eventCode")) {
//ScriptWriter~~        lJeox.setEventCode(<![report:jeo:attribute:value]!>);
        lJeox.setEventCode(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "description")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "description")) {
//ScriptWriter~~        lJeox.setDescription(<![report:jeo:attribute:value]!>);
        lJeox.setDescription(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      <!report:jeo:jeo!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo:jeo")).resetIterator();
//ScriptWriter~~      while (<!report:jeo:jeo!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo:jeo")).next()) {
        com.esarks.arm.model.jeo.ProcessJeo lJeoxx = new com.esarks.arm.model.jeo.ProcessJeo("item");
        lJeox.addJeo(lJeoxx);
//ScriptWriter~~        if (<!report:jeo:jeo!>!scan("attribute:name", "eventTime")) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo:jeo")).scan("attribute:name", "eventTime")) {
//ScriptWriter~~          lJeoxx.setEventTime(<![report:jeo:jeo:attribute:value]!>);
          lJeoxx.setEventTime(iSymbolTable.translateProperties("[report:jeo:jeo:attribute:value]"));
        }
//ScriptWriter~~        if (<!report:jeo:jeo!>!scan("attribute:name", "eventCode")) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo:jeo")).scan("attribute:name", "eventCode")) {
//ScriptWriter~~          lJeoxx.setEventCode(<![report:jeo:jeo:attribute:value]!>);
          lJeoxx.setEventCode(iSymbolTable.translateProperties("[report:jeo:jeo:attribute:value]"));
        }
//ScriptWriter~~        if (<!report:jeo:jeo!>!scan("attribute:name", "description")) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo:jeo")).scan("attribute:name", "description")) {
//ScriptWriter~~          lJeoxx.setDescription(<![report:jeo:jeo:attribute:value]!>);
          lJeoxx.setDescription(iSymbolTable.translateProperties("[report:jeo:jeo:attribute:value]"));
        }
      }
    }
    render(aXmlFile, lJeo);
  }
//$Section=Deleted$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$Preserve=no

//End of script---------------
}
