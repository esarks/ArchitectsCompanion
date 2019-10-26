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
public class ExceptionRpt extends com.esarks.mic.Report  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected ExceptionRpt() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public ExceptionRpt(Script aScript) {

    super(aScript);

  }
//  Generated at 2019.10.26 12:14:56.477 PM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED

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
    int lNbrColumns_ = 0;
// *********************************************************************************************
// ***** Begin XML tag: report Jeo Type: detail
// *********************************************************************************************
    ArrayList lArrayListx = lJeo.getJeoByTypeName("detail");
    boolean lPrintHeadingx_detail = true;
    int lNbrColumnsx_detail = 8;
    String lTableEndx_detail = "</table>";
    if (lNbrColumns_ > 0) lTableEndx_detail = "</table></td></tr>";
    for (int lIdx=0; lIdx < lArrayListx.size(); lIdx++) {
      com.esarks.arm.logging.ExceptionJeo lJeox = (com.esarks.arm.logging.ExceptionJeo) lArrayListx.get(lIdx);
      if (lNbrColumns_ > 0) {
//ScriptWriter~~        %><tr><td colspan="<!%lNbrColumns_!>"><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=\"" + lNbrColumns_ + "\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      if (lPrintHeadingx_detail) {
        lPrintHeadingx_detail=false;
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

//ScriptWriter~~        %><td width="">Module&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Module&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td width="">Method&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Method&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td width="">Severity&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Severity&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td width="">Location&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Location&nbsp;</td>", false);
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

//ScriptWriter~~        %><td width="">Action&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Action&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td width="">Resolution&nbsp;</td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Resolution&nbsp;</td>", false);
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

//ScriptWriter~~      %><td><!%lJeox.getTimePropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getTimePropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><td><!%lJeox.getModulePropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getModulePropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><td><!%lJeox.getMethodPropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getMethodPropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><td><!%lJeox.getSeverityPropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getSeverityPropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><td><!%lJeox.getLocationPropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getLocationPropertyValue().toString() + "&nbsp;</td>", false);
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

//ScriptWriter~~      %><td><!%lJeox.getActionPropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getActionPropertyValue().toString() + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><td><!%lJeox.getResolutionPropertyValue().toString()!>&nbsp;</td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>" + lJeox.getResolutionPropertyValue().toString() + "&nbsp;</td>", false);
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

// *********************************************************************************************
// ***** Begin XML tag: report:jeo Jeo Type: trace
// *********************************************************************************************
      ArrayList lArrayListxx = lJeox.getJeoByTypeName("trace");
      boolean lPrintHeadingxx_trace = true;
      int lNbrColumnsxx_trace = 1;
      String lTableEndxx_trace = "</table>";
      if (lNbrColumnsx_detail > 0) lTableEndxx_trace = "</table></td></tr>";
      for (int lIdxx=0; lIdxx < lArrayListxx.size(); lIdxx++) {
        com.esarks.arm.logging.ExceptionJeo lJeoxx = (com.esarks.arm.logging.ExceptionJeo) lArrayListxx.get(lIdxx);
        if (lNbrColumnsx_detail > 0) {
//ScriptWriter~~          %><tr><td colspan="<!%lNbrColumnsx_detail!>"><%
          {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=\"" + lNbrColumnsx_detail + "\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        if (lPrintHeadingxx_trace) {
          lPrintHeadingxx_trace=false;
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

//ScriptWriter~~          %><td width="">Trace&nbsp;</td><%
          {
//ScriptWriter~~~
iOutputManager.println("<td width=\"\">Trace&nbsp;</td>", false);
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
//ScriptWriter~~        if (!lPrintHeadingxx_trace) %><!%lTableEndxx_trace!><%
        if (!lPrintHeadingxx_trace) {
//ScriptWriter~~~
iOutputManager.println("" + lTableEndxx_trace + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      if (!lPrintHeadingx_detail) %><!%lTableEndx_detail!><%
      if (!lPrintHeadingx_detail) {
//ScriptWriter~~~
iOutputManager.println("" + lTableEndx_detail + "", false);
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

    int lNbrColumns_ = 0;
// *********************************************************************************************
// ***** Begin XML tag: report Jeo Type: detail
// *********************************************************************************************
    ArrayList lArrayListx = lJeo.getJeoByTypeName("detail");
    boolean lPrintHeadingx_detail = true;
    int lNbrColumnsx_detail = 8;
    String lTableEndx_detail = "</table>";
    for (int lIdx=0; lIdx < lArrayListx.size(); lIdx++) {
      com.esarks.arm.logging.ExceptionJeo lJeox = (com.esarks.arm.logging.ExceptionJeo) lArrayListx.get(lIdx);
      if (lPrintHeadingx_detail) {
        lPrintHeadingx_detail=false;
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
//ScriptWriter~~<column attribute="time" width="">Time</column>
iOutputManager.println("<column attribute=\"time\" width=\"\">Time</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="module" width="">Module</column>
iOutputManager.println("<column attribute=\"module\" width=\"\">Module</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="method" width="">Method</column>
iOutputManager.println("<column attribute=\"method\" width=\"\">Method</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="severity" width="">Severity</column>
iOutputManager.println("<column attribute=\"severity\" width=\"\">Severity</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="location" width="">Location</column>
iOutputManager.println("<column attribute=\"location\" width=\"\">Location</column>", true);
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
//ScriptWriter~~<column attribute="action" width="">Action</column>
iOutputManager.println("<column attribute=\"action\" width=\"\">Action</column>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<column attribute="resolution" width="">Resolution</column>
iOutputManager.println("<column attribute=\"resolution\" width=\"\">Resolution</column>", true);
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
//ScriptWriter~~<time <!%AttributeList!>><!%lJeox.getTimePropertyValue().toString()!></time>
iOutputManager.println("<time " + AttributeList + ">" + lJeox.getTimePropertyValue().toString() + "</time>", true);
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
//ScriptWriter~~<module <!%AttributeList!>><!%lJeox.getModulePropertyValue().toString()!></module>
iOutputManager.println("<module " + AttributeList + ">" + lJeox.getModulePropertyValue().toString() + "</module>", true);
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
//ScriptWriter~~<method <!%AttributeList!>><!%lJeox.getMethodPropertyValue().toString()!></method>
iOutputManager.println("<method " + AttributeList + ">" + lJeox.getMethodPropertyValue().toString() + "</method>", true);
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
//ScriptWriter~~<severity <!%AttributeList!>><!%lJeox.getSeverityPropertyValue().toString()!></severity>
iOutputManager.println("<severity " + AttributeList + ">" + lJeox.getSeverityPropertyValue().toString() + "</severity>", true);
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
//ScriptWriter~~<location <!%AttributeList!>><!%lJeox.getLocationPropertyValue().toString()!></location>
iOutputManager.println("<location " + AttributeList + ">" + lJeox.getLocationPropertyValue().toString() + "</location>", true);
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
//ScriptWriter~~<action <!%AttributeList!>><!%lJeox.getActionPropertyValue().toString()!></action>
iOutputManager.println("<action " + AttributeList + ">" + lJeox.getActionPropertyValue().toString() + "</action>", true);
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
//ScriptWriter~~<resolution <!%AttributeList!>><!%lJeox.getResolutionPropertyValue().toString()!></resolution>
iOutputManager.println("<resolution " + AttributeList + ">" + lJeox.getResolutionPropertyValue().toString() + "</resolution>", true);
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

// *********************************************************************************************
// ***** Begin XML tag: report:jeo Jeo Type: trace
// *********************************************************************************************
      ArrayList lArrayListxx = lJeox.getJeoByTypeName("trace");
      boolean lPrintHeadingxx_trace = true;
      int lNbrColumnsxx_trace = 1;
      String lTableEndxx_trace = "</table>";
      for (int lIdxx=0; lIdxx < lArrayListxx.size(); lIdxx++) {
        com.esarks.arm.logging.ExceptionJeo lJeoxx = (com.esarks.arm.logging.ExceptionJeo) lArrayListxx.get(lIdxx);
        if (lPrintHeadingxx_trace) {
          lPrintHeadingxx_trace=false;
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
//ScriptWriter~~<column attribute="description" width="">Trace</column>
iOutputManager.println("<column attribute=\"description\" width=\"\">Trace</column>", true);
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
//ScriptWriter~~        if (!lPrintHeadingxx_trace) %><!%lTableEndxx_trace!><%
        if (!lPrintHeadingxx_trace) {
//ScriptWriter~~~
iOutputManager.println("" + lTableEndxx_trace + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      if (!lPrintHeadingx_detail) %><!%lTableEndx_detail!><%
      if (!lPrintHeadingx_detail) {
//ScriptWriter~~~
iOutputManager.println("" + lTableEndx_detail + "", false);
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
      com.esarks.arm.logging.ExceptionJeo lJeox = new com.esarks.arm.logging.ExceptionJeo("detail");
      lJeo.addJeo(lJeox);
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "time")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "time")) {
//ScriptWriter~~        lJeox.setTime(<![report:jeo:attribute:value]!>);
        lJeox.setTime(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "module")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "module")) {
//ScriptWriter~~        lJeox.setModule(<![report:jeo:attribute:value]!>);
        lJeox.setModule(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "method")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "method")) {
//ScriptWriter~~        lJeox.setMethod(<![report:jeo:attribute:value]!>);
        lJeox.setMethod(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "severity")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "severity")) {
//ScriptWriter~~        lJeox.setSeverity(<![report:jeo:attribute:value]!>);
        lJeox.setSeverity(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "location")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "location")) {
//ScriptWriter~~        lJeox.setLocation(<![report:jeo:attribute:value]!>);
        lJeox.setLocation(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "description")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "description")) {
//ScriptWriter~~        lJeox.setDescription(<![report:jeo:attribute:value]!>);
        lJeox.setDescription(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "action")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "action")) {
//ScriptWriter~~        lJeox.setAction(<![report:jeo:attribute:value]!>);
        lJeox.setAction(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      if (<!report:jeo!>!scan("attribute:name", "resolution")) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo")).scan("attribute:name", "resolution")) {
//ScriptWriter~~        lJeox.setResolution(<![report:jeo:attribute:value]!>);
        lJeox.setResolution(iSymbolTable.translateProperties("[report:jeo:attribute:value]"));
      }
//ScriptWriter~~      <!report:jeo:jeo!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo:jeo")).resetIterator();
//ScriptWriter~~      while (<!report:jeo:jeo!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:jeo:jeo")).next()) {
        com.esarks.arm.logging.ExceptionJeo lJeoxx = new com.esarks.arm.logging.ExceptionJeo("trace");
        lJeox.addJeo(lJeoxx);
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
