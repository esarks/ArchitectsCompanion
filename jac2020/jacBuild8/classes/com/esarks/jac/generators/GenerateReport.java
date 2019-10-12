//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.jac.generators;

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
public class GenerateReport extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected GenerateReport() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public GenerateReport(Script aScript) {

    super(aScript);

  }

  public void generateReport(String aXmlDefinition) {
    resetExit();
    try {
//ScriptWriter~~%>generateReport: <!%aXmlDefinition!>
{
//ScriptWriter~~~
iOutputManager.println("generateReport: " + aXmlDefinition + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!report!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
//ScriptWriter~~    if (<!report!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report")).size() == 0) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Could not find <report> tag in " + path(aXmlDefinition) + ".xml file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Could not find <report> tag in " + path(aXmlDefinition) + ".xml file.");
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
        
    boolean lForce = false;
    setContext(iScript.getMasterScript());
//ScriptWriter~~    if (<![$jac:makeAll:force]!>.equals("true")) lForce = true;
    if (iSymbolTable.translateProperties("[$jac:makeAll:force]").equals("true")) lForce = true;
    restoreContext();
    if (!lForce) {
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateReport") + ".script");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
//ScriptWriter~~      File lNewFile = new File(path(<![report:name]!>) + ".script");
      File lNewFile = new File(path(iSymbolTable.translateProperties("[report:name]")) + ".script");
      if (lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          ((lGeneratorFile.exists() && lNewFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) || !lGeneratorFile.exists())) {
//ScriptWriter~~        String lReportName = <![report:name]!>;
        String lReportName = iSymbolTable.translateProperties("[report:name]");
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("File " + lReportName + ".script is not stale.  Generation bypassed.");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("File " + lReportName + ".script is not stale.  Generation bypassed.");
//ScriptWriter~~        <!$jac:event:severity!>!set("info");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("info");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return;
      }
    }

    setContext(iScript.getMasterScript());
//ScriptWriter~~    <!$jac:merge:sectionMarker!>!reset("//$Section=");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:sectionMarker")).reset("//$Section=");
//ScriptWriter~~    <!$jac:merge:preserveMarker!>!reset("$Preserve=yes");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preserveMarker")).reset("$Preserve=yes");
//ScriptWriter~~    <!$jac:merge:noPreserveMarker!>!reset("$Preserve=no");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:noPreserveMarker")).reset("$Preserve=no");
//ScriptWriter~~    <!$jac:merge:keepPreserveMarker!>!reset("$Preserve=keep");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepPreserveMarker")).reset("$Preserve=keep");
//ScriptWriter~~    <!$jac:merge:discardPreserveMarker!>!reset("$Preserve=discard");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:discardPreserveMarker")).reset("$Preserve=discard");
//ScriptWriter~~    <!$jac:merge:preservePreamble!>!reset("no");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preservePreamble")).reset("no");
//ScriptWriter~~    <!$jac:merge:comments!>!reset("//");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:comments")).reset("//");
//ScriptWriter~~    <!$jac:merge:excludeCompare!>!reset("//  Generated at");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:excludeCompare")).reset("//  Generated at");
//ScriptWriter~~    <!$jac:merge:trimOutput!>!reset("yes");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:trimOutput")).reset("yes");
//ScriptWriter~~    <!$jac:merge:keepSections!>!reset("no");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepSections")).reset("no");
    restoreContext();

//    String lLineNbr = "<" + "#" + "[$jac:script:lineNumber]#>";
//    boolean lResultSetExists = false;

//ScriptWriter~~    openOutput(path(<![report:name]!>) + ".xml");
    openOutput(path(iSymbolTable.translateProperties("[report:name]")) + ".xml");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<mic.element type="Report" title="">  
iOutputManager.println("<mic.element type=\"Report\" title=\"\">  ", true);
//ScriptWriter~~</mic.element>
iOutputManager.println("</mic.element>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    closeOutput();

//ScriptWriter~~    openOutput(path(<![report:name]!>) + ".new");
    openOutput(path(iSymbolTable.translateProperties("[report:name]")) + ".new");

    setContext(iScript.getMasterScript());
//ScriptWriter~~    String lDateTime = <![$jac:dateTime]!>;
    String lDateTime = iSymbolTable.translateProperties("[$jac:dateTime]");
    restoreContext();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//  Generated at <!%lDateTime!> by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
iOutputManager.println("//  Generated at " + lDateTime + " by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void render(String aOutput, String aStereotype, <![report:inJeo]!> aJeo) {
iOutputManager.println("  public void render(String aOutput, String aStereotype, " + iSymbolTable.translateProperties("[report:inJeo]") + " aJeo) {", true);
//ScriptWriter~~    renderHtml(aOutput, aJeo);
iOutputManager.println("    renderHtml(aOutput, aJeo);", true);
//ScriptWriter~~    renderXml(aOutput, aJeo);
iOutputManager.println("    renderXml(aOutput, aJeo);", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void render(String aOutput, <![report:inJeo]!> aJeo) {
iOutputManager.println("  public void render(String aOutput, " + iSymbolTable.translateProperties("[report:inJeo]") + " aJeo) {", true);
//ScriptWriter~~    renderHtml(aOutput, aJeo);
iOutputManager.println("    renderHtml(aOutput, aJeo);", true);
//ScriptWriter~~    renderXml(aOutput, aJeo);
iOutputManager.println("    renderXml(aOutput, aJeo);", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void renderHtml(String aOutput, <![report:inJeo]!> aJeo) {
iOutputManager.println("  public void renderHtml(String aOutput, " + iSymbolTable.translateProperties("[report:inJeo]") + " aJeo) {", true);
//ScriptWriter~~    openOutput(path(aOutput) + ".html");
iOutputManager.println("    openOutput(path(aOutput) + \".html\");", true);
//ScriptWriter~~    <![report:inJeo]!> lJeo = aJeo;
iOutputManager.println("    " + iSymbolTable.translateProperties("[report:inJeo]") + " lJeo = aJeo;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    String lStart = "%" + ">";
    String lStop = "<" + "%";
    String lVarStart = "<" + "!";
    String lVarEnd = "!" + ">";
    String lJeoName = "report";
    String lX = "";
    int lXCount = 0;
    String lIndent = "  ";

    iOutputManager.setDocument("createHtml");
//ScriptWriter~~    %><html><%
    {
//ScriptWriter~~~
iOutputManager.println("<html>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><table border=1 cellpadding=5 cellspacing=0><%
    {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=5 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td align="right">Specification File Name</td><td><!%aXmlDefinition!>.xml</td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td align=\"right\">Specification File Name</td><td>" + aXmlDefinition + ".xml</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td align="right">Report Name</td><td><![report:name]!></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td align=\"right\">Report Name</td><td>" + iSymbolTable.translateProperties("[report:name]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td align="right">Incoming Jeo Type</td><td><![report:inJeo]!></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td align=\"right\">Incoming Jeo Type</td><td>" + iSymbolTable.translateProperties("[report:inJeo]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></table><br><%
    {
//ScriptWriter~~~
iOutputManager.println("</table><br>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.setDocument("");

    parseXmlPath(path(aXmlDefinition) + ".xml");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    int lNbrColumns_ = 0;
iOutputManager.println("    int lNbrColumns_ = 0;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

//ScriptWriter~~    <!" + lJeoName + ":jeo!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).resetIterator();
//ScriptWriter~~    while(<!" + lJeoName + ":jeo!>!next()) {
    while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).next()) {

//ScriptWriter~~//System.out.println(lJeoName + ":jeo is type " + <![" + lJeoName + ":jeo:type]!>);
//System.out.println(lJeoName + ":jeo is type " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]"));

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// *********************************************************************************************
iOutputManager.println("// *********************************************************************************************", true);
//ScriptWriter~~// ***** Begin XML tag: <!%lJeoName!> Jeo Type: <![" + lJeoName + ":jeo:type]!>
iOutputManager.println("// ***** Begin XML tag: " + lJeoName + " Jeo Type: " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "", true);
//ScriptWriter~~// *********************************************************************************************
iOutputManager.println("// *********************************************************************************************", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %><table border=1 cellpadding=3 cellspacing=0><%
      {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td><b><![" + lJeoName + ":jeo:instance]!></b></td><td><b><![" + lJeoName + ":jeo:type]!></b></td><tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td><b>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "</b></td><td><b>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "</b></td><tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td colspan=2><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=2>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createHtml2");
//ScriptWriter~~      %><table border=1 cellpadding=5 cellspacing=0><%
      {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=5 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("");

      lXCount++;
//ScriptWriter~~      if (<!" + lJeoName + ":jeo:type!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:type")).size() > 0) {
//ScriptWriter~~        if (<!" + lJeoName + ":jeo!>!isFirst()) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).isFirst()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>ArrayList lArrayList<!%lX!>x = lJeo<!%lX!>.getJeoByTypeName("<![" + lJeoName + ":jeo:type]!>");
iOutputManager.println("  " + lIndent + "ArrayList lArrayList" + lX + "x = lJeo" + lX + ".getJeoByTypeName(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>lArrayList<!%lX!>x = lJeo<!%lX!>.getJeoByTypeName("<![" + lJeoName + ":jeo:type]!>");
iOutputManager.println("  " + lIndent + "lArrayList" + lX + "x = lJeo" + lX + ".getJeoByTypeName(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      } else {
//ScriptWriter~~        if (<!" + lJeoName + ":jeo!>!isFirst()) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).isFirst()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>ArrayList lArrayList<!%lX!>x = lJeo<!%lX!>.getJeoByInstanceName("<![" + lJeoName + ":jeo:instance]!>");
iOutputManager.println("  " + lIndent + "ArrayList lArrayList" + lX + "x = lJeo" + lX + ".getJeoByInstanceName(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>lArrayList<!%lX!>x = lJeo<!%lX!>.getJeoByInstanceName("<![" + lJeoName + ":jeo:instance]!>");
iOutputManager.println("  " + lIndent + "lArrayList" + lX + "x = lJeo" + lX + ".getJeoByInstanceName(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }

//ScriptWriter~~      <!$mic:sortfields!>!remove();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).remove();

//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~        if (<!" + lJeoName + ":jeo:column:sort!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:sort")).size() > 0) {
//ScriptWriter~~          <!" + lJeoName + ":jeo:column:attribute!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:attribute")).resetIterator();
//ScriptWriter~~          <!$mic:sortfields!>!set(<![" + lJeoName + ":jeo:column:attribute]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).set(iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]"));
//ScriptWriter~~          <!$mic:sortfields:order!>!set(<![" + lJeoName + ":jeo:column:sort:ascending]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields:order")).set(iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:sort:ascending]"));
//ScriptWriter~~          <!$mic:sortfields:importance!>!set(<![" + lJeoName + ":jeo:column:sort]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields:importance")).set(iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:sort]"));
//ScriptWriter~~          <!$mic:sortfields:type!>!set(<![" + lJeoName + ":jeo:column:sort:type]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields:type")).set(iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:sort:type]"));
        }
      }
//ScriptWriter~~      if (<!$mic:sortfields!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).size() > 0) {
//ScriptWriter~~        <!$mic:sortfields!>!sort("importance", false);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).sort("importance", false);
//ScriptWriter~~        <!$mic:sortfields!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).next())  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>for (int lIdx<!%lX!>=0; lIdx<!%lX!> < lArrayList<!%lX!>x.size(); lIdx<!%lX!>++) {
iOutputManager.println("  " + lIndent + "for (int lIdx" + lX + "=0; lIdx" + lX + " < lArrayList" + lX + "x.size(); lIdx" + lX + "++) {", true);
//ScriptWriter~~    <!%lIndent!>Jeo lSortJeo = (Jeo) lArrayList<!%lX!>x.get(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "Jeo lSortJeo = (Jeo) lArrayList" + lX + "x.get(lIdx" + lX + ");", true);
//ScriptWriter~~    <!%lIndent!>PropertyValue lSortPropertyValue = lSortJeo.getPropertyValueByName("<![$mic:sortfields]!>");
iOutputManager.println("    " + lIndent + "PropertyValue lSortPropertyValue = lSortJeo.getPropertyValueByName(\"" + iSymbolTable.translateProperties("[$mic:sortfields]") + "\");", true);
//ScriptWriter~~    <!%lIndent!>if (lSortPropertyValue == null) {
iOutputManager.println("    " + lIndent + "if (lSortPropertyValue == null) {", true);
//ScriptWriter~~      <!%lIndent!>lSortPropertyValue = lSortJeo.getPropertyValue("<![$mic:sortfields]!>");
iOutputManager.println("      " + lIndent + "lSortPropertyValue = lSortJeo.getPropertyValue(\"" + iSymbolTable.translateProperties("[$mic:sortfields]") + "\");", true);
//ScriptWriter~~      <!%lIndent!>if (lSortPropertyValue == null) lSortPropertyValue = new PropertyValue();
iOutputManager.println("      " + lIndent + "if (lSortPropertyValue == null) lSortPropertyValue = new PropertyValue();", true);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~    <!%lIndent!>String lSort = lSortPropertyValue.toString();
iOutputManager.println("    " + lIndent + "String lSort = lSortPropertyValue.toString();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          if (<![$mic:sortfields:type]!>.equals("string")) {
          if (iSymbolTable.translateProperties("[$mic:sortfields:type]").equals("string")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSort += (new DecimalFormat("00000000000")).format(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "lSort += (new DecimalFormat(\"00000000000\")).format(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          } else if (<![$mic:sortfields:type]!>.equals("date")) {
          } else if (iSymbolTable.translateProperties("[$mic:sortfields:type]").equals("date")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSort += "0000000000000000000000";
iOutputManager.println("    " + lIndent + "lSort += \"0000000000000000000000\";", true);
//ScriptWriter~~    <!%lIndent!>lSort = lSort.substring(6,10) + lSort.substring(0,5) + (new DecimalFormat("00000000000")).format(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "lSort = lSort.substring(6,10) + lSort.substring(0,5) + (new DecimalFormat(\"00000000000\")).format(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          } else if (<![$mic:sortfields:type]!>.equals("int")) {
          } else if (iSymbolTable.translateProperties("[$mic:sortfields:type]").equals("int")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSort = "0000000000000000000000".substring(0, 20 - lSort.length()) + lSort + (new DecimalFormat("00000000000")).format(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "lSort = \"0000000000000000000000\".substring(0, 20 - lSort.length()) + lSort + (new DecimalFormat(\"00000000000\")).format(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSort += (new DecimalFormat("00000000000")).format(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "lSort += (new DecimalFormat(\"00000000000\")).format(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSortJeo.setPropertyValue("<![$mic:sortfields]!>.sort", new PropertyValue(lSort));
iOutputManager.println("    " + lIndent + "lSortJeo.setPropertyValue(\"" + iSymbolTable.translateProperties("[$mic:sortfields]") + ".sort\", new PropertyValue(lSort));", true);
//ScriptWriter~~  <!%lIndent!>}
iOutputManager.println("  " + lIndent + "}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          boolean lAscending = true;
//ScriptWriter~~          if (<![$mic:sortfields:order]!>.equals("false")) lAscending = false;
          if (iSymbolTable.translateProperties("[$mic:sortfields:order]").equals("false")) lAscending = false;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>Jeo.sort(lArrayList<!%lX!>x, "<![$mic:sortfields]!>.sort", <!%lAscending!>);
iOutputManager.println("  " + lIndent + "Jeo.sort(lArrayList" + lX + "x, \"" + iSymbolTable.translateProperties("[$mic:sortfields]") + ".sort\", " + lAscending + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }

//ScriptWriter~~      int lNbrColumns = <!" + lJeoName + ":jeo:column!>!size();
      int lNbrColumns = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).size();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>boolean lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!> = true;
iOutputManager.println("  " + lIndent + "boolean lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + " = true;", true);
//ScriptWriter~~  <!%lIndent!>int lNbrColumns<!%lX!>x_<![" + lJeoName + ":jeo:type]!> = <!%lNbrColumns!>;
iOutputManager.println("  " + lIndent + "int lNbrColumns" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + " = " + lNbrColumns + ";", true);
//ScriptWriter~~  <!%lIndent!>String lTableEnd<!%lX!>x_<![" + lJeoName + ":jeo:type]!> = "</table>";
iOutputManager.println("  " + lIndent + "String lTableEnd" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + " = \"</table>\";", true);
//ScriptWriter~~  <!%lIndent!>if (lNbrColumns<!%lX!>_<![" + lJeoName + ":type]!> > 0) lTableEnd<!%lX!>x_<![" + lJeoName + ":jeo:type]!> = "</table></td></tr>";
iOutputManager.println("  " + lIndent + "if (lNbrColumns" + lX + "_" + iSymbolTable.translateProperties("[" + lJeoName + ":type]") + " > 0) lTableEnd" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + " = \"</table></td></tr>\";", true);
//ScriptWriter~~  <!%lIndent!>for (int lIdx<!%lX!>=0; lIdx<!%lX!> < lArrayList<!%lX!>x.size(); lIdx<!%lX!>++) {
iOutputManager.println("  " + lIndent + "for (int lIdx" + lX + "=0; lIdx" + lX + " < lArrayList" + lX + "x.size(); lIdx" + lX + "++) {", true);
//ScriptWriter~~    <!%lIndent!><![" + lJeoName + ":jeo:instance]!> lJeo<!%lX!>x = (<![" + lJeoName + ":jeo:instance]!>) lArrayList<!%lX!>x.get(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + " lJeo" + lX + "x = (" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + ") lArrayList" + lX + "x.get(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      if (lNbrColumns > 0) {      
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>if (lNbrColumns<!%lX!>_<![" + lJeoName + ":type]!> > 0) {
iOutputManager.println("    " + lIndent + "if (lNbrColumns" + lX + "_" + iSymbolTable.translateProperties("[" + lJeoName + ":type]") + " > 0) {", true);
//ScriptWriter~~      <!%lIndent!><!%lStart!><tr><td colspan="<!%lVarStart!>%lNbrColumns<!%lX!>_<![" + lJeoName + ":type]!><!%lVarEnd!>"><!%lStop!>
iOutputManager.println("      " + lIndent + "" + lStart + "<tr><td colspan=\"" + lVarStart + "%lNbrColumns" + lX + "_" + iSymbolTable.translateProperties("[" + lJeoName + ":type]") + "" + lVarEnd + "\">" + lStop + "", true);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~    <!%lIndent!>if (lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>) {
iOutputManager.println("    " + lIndent + "if (lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + ") {", true);
//ScriptWriter~~      <!%lIndent!>lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>=false;
iOutputManager.println("      " + lIndent + "lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "=false;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~



        iOutputManager.setDocument("createHtml");
//ScriptWriter~~        <!" + lJeoName + ":jeo:column!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {

//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column!>!isFirst()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).isFirst()) {
//ScriptWriter~~            %><table width=100% border=1 cellpadding=3 cellspacing=0><%
            {
//ScriptWriter~~~
iOutputManager.println("<table width=100% border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            %><tr><td><b>Attribute</b></td><td><b>Heading</b></td><td><b>Width</b></td></tr><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr><td><b>Attribute</b></td><td><b>Heading</b></td><td><b>Width</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }

//ScriptWriter~~          %><tr><%
          {
//ScriptWriter~~~
iOutputManager.println("<tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><td><![" + lJeoName + ":jeo:column:attribute]!>&nbsp;<%
          {
//ScriptWriter~~~
iOutputManager.println("<td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]") + "&nbsp;", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><td><![" + lJeoName + ":jeo:column:heading]!>&nbsp;<%
          {
//ScriptWriter~~~
iOutputManager.println("<td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:heading]") + "&nbsp;", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><td><![" + lJeoName + ":jeo:column:width]!>&nbsp;<%
          {
//ScriptWriter~~~
iOutputManager.println("<td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:width]") + "&nbsp;", false);
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


//ScriptWriter~~          <!" + lJeoName + ":jeo:column:tag!>& {
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:tag")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:tag")).next())  {
//ScriptWriter~~            if (<!" + lJeoName + ":jeo:column:tag!>!isFirst()) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:tag")).isFirst()) {
//ScriptWriter~~              %><tr><td colspan=3><%
              {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=3>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~              %><table width=100% border=1 cellpadding=3 cellspacing=0><%
              {
//ScriptWriter~~~
iOutputManager.println("<table width=100% border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~              %><tr><td><b>Tag Name</b></td><td><b>Default</b></td><td><b>Property</b></td></tr><%
              {
//ScriptWriter~~~
iOutputManager.println("<tr><td><b>Tag Name</b></td><td><b>Default</b></td><td><b>Property</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~            %><tr><td><![" + lJeoName + ":jeo:column:tag:name]!>&nbsp;</td><td><![" + lJeoName + ":jeo:column:tag:default]!>&nbsp;</td><td><![" + lJeoName + ":jeo:column:tag]!>&nbsp;</td></tr><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:tag:name]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:tag:default]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:tag]") + "&nbsp;</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            if (<!" + lJeoName + ":jeo:column:tag!>!isLast()) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:tag")).isLast()) {
//ScriptWriter~~              %></table></td></tr><%
              {
//ScriptWriter~~~
iOutputManager.println("</table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
          }

//ScriptWriter~~          <!" + lJeoName + ":jeo:column:sort!>& {
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:sort")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:sort")).next())  {
//ScriptWriter~~            if (<!" + lJeoName + ":jeo:column:sort!>!isFirst()) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:sort")).isFirst()) {
//ScriptWriter~~              %><tr><td colspan=3><%
              {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=3>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~              %><table width=100% border=1 cellpadding=3 cellspacing=0><%
              {
//ScriptWriter~~~
iOutputManager.println("<table width=100% border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~              %><tr><td><b>Sort Type</b></td><td><b>Ascending</b></td><td><b>Priority</b></td></tr><%
              {
//ScriptWriter~~~
iOutputManager.println("<tr><td><b>Sort Type</b></td><td><b>Ascending</b></td><td><b>Priority</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~            %><tr><td><![" + lJeoName + ":jeo:column:sort:type]!>&nbsp;</td><td><![" + lJeoName + ":jeo:column:sort:ascending]!>&nbsp;</td><td><![" + lJeoName + ":jeo:column:sort]!>&nbsp;</td></tr><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:sort:type]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:sort:ascending]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:sort]") + "&nbsp;</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            if (<!" + lJeoName + ":jeo:column:sort!>!isLast()) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:sort")).isLast()) {
//ScriptWriter~~              %></table></td></tr><%
              {
//ScriptWriter~~~
iOutputManager.println("</table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
          }

//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column!>!isLast()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).isLast()) {
//ScriptWriter~~            %></table><%
            {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        }
        iOutputManager.setDocument("createHtml2");
//ScriptWriter~~        <!" + lJeoName + ":jeo:column!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column!>!isFirst()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).isFirst()) {
//ScriptWriter~~            %><table width=100% border=1 cellpadding=3 cellspacing=0><tr><%
            {
//ScriptWriter~~~
iOutputManager.println("<table width=100% border=1 cellpadding=3 cellspacing=0><tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          %><td><![" + lJeoName + ":jeo:column:heading]!>&nbsp;</td><%
          {
//ScriptWriter~~~
iOutputManager.println("<td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:heading]") + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column!>!isLast()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).isLast()) {
//ScriptWriter~~            %></tr><%
            {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        }
//ScriptWriter~~        <!" + lJeoName + ":jeo:column!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column!>!isFirst()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).isFirst()) {
//ScriptWriter~~            %><tr><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          %><td><![" + lJeoName + ":jeo:column:attribute]!>&nbsp;</td><%
          {
//ScriptWriter~~~
iOutputManager.println("<td>" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]") + "&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column!>!isLast()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).isLast()) {
//ScriptWriter~~            %></tr><%
            {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        }
//ScriptWriter~~        <!" + lJeoName + ":jeo:column!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column!>!isFirst()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).isFirst()) {
//ScriptWriter~~            %><tr><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column!>!scan("tag:name", "type")) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).scan("tag:name", "type")) {
//ScriptWriter~~            if (<![" + lJeoName + ":jeo:column:tag:default]!>.equals("string")) {
            if (iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:tag:default]").equals("string")) {
//ScriptWriter~~              %><td>Abcdefgh</td><%
              {
//ScriptWriter~~~
iOutputManager.println("<td>Abcdefgh</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            } else if (<![" + lJeoName + ":jeo:column:tag:default]!>.equals("date")) {
            } else if (iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:tag:default]").equals("date")) {
//ScriptWriter~~              %><td>01/01/2005</td><%
              {
//ScriptWriter~~~
iOutputManager.println("<td>01/01/2005</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            } else if (<![" + lJeoName + ":jeo:column:tag:default]!>.equals("int")) {
            } else if (iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:tag:default]").equals("int")) {
//ScriptWriter~~              %><td>12345</td><%
              {
//ScriptWriter~~~
iOutputManager.println("<td>12345</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            } else {
//ScriptWriter~~              %><td>???</td><%
              {
//ScriptWriter~~~
iOutputManager.println("<td>???</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
          } else {
//ScriptWriter~~            %><td>???</td><%
            {
//ScriptWriter~~~
iOutputManager.println("<td>???</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column!>!isLast()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).isLast()) {
//ScriptWriter~~            %></tr></table><%
            {
//ScriptWriter~~~
iOutputManager.println("</tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        }
        iOutputManager.setDocument("");

//ScriptWriter~~        <!" + lJeoName + ":jeo:column!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~        if (<!" + lJeoName + ":jeo:column:heading!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:heading")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      <!%lIndent!><!%lStart!><table cellspacing="0" cellpadding="0" border="1"><!%lStop!>
iOutputManager.println("      " + lIndent + "" + lStart + "<table cellspacing=\"0\" cellpadding=\"0\" border=\"1\">" + lStop + "", true);
//ScriptWriter~~      <!%lIndent!><!%lStart!><tr><!%lStop!>
iOutputManager.println("      " + lIndent + "" + lStart + "<tr>" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          <!" + lJeoName + ":jeo:column!>& {
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      <!%lIndent!><!%lStart!><td width="<![" + lJeoName + ":jeo:column:width]!>"><![" + lJeoName + ":jeo:column:heading]!>&nbsp;</td><!%lStop!>
iOutputManager.println("      " + lIndent + "" + lStart + "<td width=\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:width]") + "\">" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:heading]") + "&nbsp;</td>" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      <!%lIndent!><!%lStart!></tr><!%lStop!>
iOutputManager.println("      " + lIndent + "" + lStart + "</tr>" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~    <!%lIndent!><!%lStart!><tr><!%lStop!>
iOutputManager.println("    " + lIndent + "" + lStart + "<tr>" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        <!" + lJeoName + ":jeo:column!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~          <!" + lJeoName + ":jeo:column:attribute!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:attribute")).resetIterator();
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column:attribute!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:attribute")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!><!%lStart!><td><!%lVarStart!>%lJeo<!%lX!>x.get<![cap@[" + lJeoName + ":jeo:column:attribute]]!>PropertyValue().toString()<!%lVarEnd!>&nbsp;</td><!%lStop!>
iOutputManager.println("    " + lIndent + "" + lStart + "<td>" + lVarStart + "%lJeo" + lX + "x.get" + iSymbolTable.translateProperties("[cap@[" + lJeoName + ":jeo:column:attribute]]") + "PropertyValue().toString()" + lVarEnd + "&nbsp;</td>" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column:property!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:property")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!><!%lStart!><td><!%lVarStart!>%lJeo<!%lX!>x.getPropertyValue("<![" + lJeoName + ":jeo:column:property]!>").toString()<!%lVarEnd!>&nbsp;</td><!%lStop!>
iOutputManager.println("    " + lIndent + "" + lStart + "<td>" + lVarStart + "%lJeo" + lX + "x.getPropertyValue(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:property]") + "\").toString()" + lVarEnd + "&nbsp;</td>" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!><!%lStart!></tr><!%lStop!>
iOutputManager.println("    " + lIndent + "" + lStart + "</tr>" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
//System.out.println("1> " + lJeoName);

//ScriptWriter~~      if (<!" + lJeoName + ":jeo:jeo!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:jeo")).size() > 0) {
//System.out.println("2> " + lJeoName);
//ScriptWriter~~        <!" + lJeoName + ":jeo:jeo!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:jeo")).resetIterator();
        lJeoName += ":jeo";
        lX += "x";
        lIndent += "  ";
//System.out.println("3> " + lJeoName);
      } else {
//System.out.println("4> " + lJeoName);
        if (lJeoName.endsWith(":jeo")) {
//ScriptWriter~~          while (<!" + lJeoName + ":jeo!>!isLast()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).isLast()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~    <!%lIndent!>if (!lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>) <!%lStart!><!%lVarStart!>%lTableEnd<!%lX!>x_<![" + lJeoName + ":jeo:type]!><!%lVarEnd!><!%lStop!>
iOutputManager.println("    " + lIndent + "if (!lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + ") " + lStart + "" + lVarStart + "%lTableEnd" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "" + lVarEnd + "" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            if (lJeoName.endsWith(":jeo")) {
//System.out.println("5> " + lJeoName);
              lJeoName = lJeoName.substring(0, lJeoName.length() - 4);
              lIndent = lIndent.substring(0, lIndent.length() - 2);
              lX = lX.substring(0, lX.length() - 1);
//System.out.println("6> " + lJeoName);
            } else {
//System.out.println("7> " + lJeoName);
              break;
            }
          }
//ScriptWriter~~          if (<!" + lJeoName + ":jeo!>!isLast()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).isLast()) {
          } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>}
iOutputManager.println("  " + lIndent + "}", true);
//ScriptWriter~~  <!%lIndent!>if (!lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>) <!%lStart!><!%lVarStart!>%lTableEnd<!%lX!>x_<![" + lJeoName + ":jeo:type]!><!%lVarEnd!><!%lStop!>
iOutputManager.println("  " + lIndent + "if (!lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + ") " + lStart + "" + lVarStart + "%lTableEnd" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "" + lVarEnd + "" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        } else {
//System.out.println("8> " + lJeoName);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>}
iOutputManager.println("  " + lIndent + "}", true);
//ScriptWriter~~  <!%lIndent!>if (!lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>) <!%lStart!><!%lVarStart!>%lTableEnd<!%lX!>x_<![" + lJeoName + ":jeo:type]!><!%lVarEnd!><!%lStop!>
iOutputManager.println("  " + lIndent + "if (!lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + ") " + lStart + "" + lVarStart + "%lTableEnd" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "" + lVarEnd + "" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }
//System.out.println("9> " + lJeoName);
    }

//System.out.println("*> ");
//??
    iOutputManager.setDocument("createHtml");
//ScriptWriter~~    %></td></tr></table><%
    {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.setDocument("createHtml2");
//ScriptWriter~~    %></td></tr></table><%
    {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.setDocument("");

    iOutputManager.setDocument("createHtml");
//ScriptWriter~~    %></td></tr></table><%
    {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.setDocument("");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    closeOutput();
iOutputManager.println("    closeOutput();", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//=============================================================================

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void renderXml(String aOutput, <![report:inJeo]!> aJeo) {
iOutputManager.println("  public void renderXml(String aOutput, " + iSymbolTable.translateProperties("[report:inJeo]") + " aJeo) {", true);
//ScriptWriter~~    openOutput(path(aOutput) + ".xml");
iOutputManager.println("    openOutput(path(aOutput) + \".xml\");", true);
//ScriptWriter~~    <![report:inJeo]!> lJeo = aJeo;
iOutputManager.println("    " + iSymbolTable.translateProperties("[report:inJeo]") + " lJeo = aJeo;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    lStart = "%" + ">";
    lStop = "<" + "%";
    lVarStart = "<" + "!";
    lVarEnd = "!" + ">";
    lJeoName = "report";
    lX = "";
    lXCount = 0;
    lIndent = "  ";
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lStart!><report name="<!%lVarStart!>%aOutput<!%lVarEnd!>"><!%lStop!>
iOutputManager.println("    " + lStart + "<report name=\"" + lVarStart + "%aOutput" + lVarEnd + "\">" + lStop + "", true);
//ScriptWriter~~    int lNbrColumns_ = 0;
iOutputManager.println("    int lNbrColumns_ = 0;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////

//ScriptWriter~~    <!" + lJeoName + ":jeo!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).resetIterator();
//ScriptWriter~~    while(<!" + lJeoName + ":jeo!>!next()) {
    while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).next()) {

//ScriptWriter~~//System.out.println(lJeoName + ":jeo is type " + <![" + lJeoName + ":jeo:type]!>);
//System.out.println(lJeoName + ":jeo is type " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]"));

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// *********************************************************************************************
iOutputManager.println("// *********************************************************************************************", true);
//ScriptWriter~~// ***** Begin XML tag: <!%lJeoName!> Jeo Type: <![" + lJeoName + ":jeo:type]!>
iOutputManager.println("// ***** Begin XML tag: " + lJeoName + " Jeo Type: " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "", true);
//ScriptWriter~~// *********************************************************************************************
iOutputManager.println("// *********************************************************************************************", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      lXCount++;
//ScriptWriter~~      if (<!" + lJeoName + ":jeo:type!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:type")).size() > 0) {
//ScriptWriter~~        if (<!" + lJeoName + ":jeo!>!isFirst()) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).isFirst()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>ArrayList lArrayList<!%lX!>x = lJeo<!%lX!>.getJeoByTypeName("<![" + lJeoName + ":jeo:type]!>");
iOutputManager.println("  " + lIndent + "ArrayList lArrayList" + lX + "x = lJeo" + lX + ".getJeoByTypeName(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>lArrayList<!%lX!>x = lJeo<!%lX!>.getJeoByTypeName("<![" + lJeoName + ":jeo:type]!>");
iOutputManager.println("  " + lIndent + "lArrayList" + lX + "x = lJeo" + lX + ".getJeoByTypeName(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      } else {
//ScriptWriter~~        if (<!" + lJeoName + ":jeo!>!isFirst()) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).isFirst()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>ArrayList lArrayList<!%lX!>x = lJeo<!%lX!>.getJeoByInstanceName("<![" + lJeoName + ":jeo:instance]!>");
iOutputManager.println("  " + lIndent + "ArrayList lArrayList" + lX + "x = lJeo" + lX + ".getJeoByInstanceName(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>lArrayList<!%lX!>x = lJeo<!%lX!>.getJeoByInstanceName("<![" + lJeoName + ":jeo:instance]!>");
iOutputManager.println("  " + lIndent + "lArrayList" + lX + "x = lJeo" + lX + ".getJeoByInstanceName(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }

//ScriptWriter~~      <!$mic:sortfields!>!remove();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).remove();

//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~        if (<!" + lJeoName + ":jeo:column:sort!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:sort")).size() > 0) {
//ScriptWriter~~          <!" + lJeoName + ":jeo:column:attribute!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:attribute")).resetIterator();
//ScriptWriter~~          <!$mic:sortfields!>!set(<![" + lJeoName + ":jeo:column:attribute]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).set(iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]"));
//ScriptWriter~~          <!$mic:sortfields:order!>!set(<![" + lJeoName + ":jeo:column:sort:ascending]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields:order")).set(iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:sort:ascending]"));
//ScriptWriter~~          <!$mic:sortfields:importance!>!set(<![" + lJeoName + ":jeo:column:sort]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields:importance")).set(iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:sort]"));
//ScriptWriter~~          <!$mic:sortfields:type!>!set(<![" + lJeoName + ":jeo:column:sort:type]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields:type")).set(iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:sort:type]"));
        }
      }
//ScriptWriter~~      if (<!$mic:sortfields!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).size() > 0) {
//ScriptWriter~~        <!$mic:sortfields!>!sort("importance", false);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).sort("importance", false);
//ScriptWriter~~        <!$mic:sortfields!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sortfields")).next())  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>for (int lIdx<!%lX!>=0; lIdx<!%lX!> < lArrayList<!%lX!>x.size(); lIdx<!%lX!>++) {
iOutputManager.println("  " + lIndent + "for (int lIdx" + lX + "=0; lIdx" + lX + " < lArrayList" + lX + "x.size(); lIdx" + lX + "++) {", true);
//ScriptWriter~~    <!%lIndent!>Jeo lSortJeo = (Jeo) lArrayList<!%lX!>x.get(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "Jeo lSortJeo = (Jeo) lArrayList" + lX + "x.get(lIdx" + lX + ");", true);
//ScriptWriter~~    <!%lIndent!>PropertyValue lSortPropertyValue = lSortJeo.getPropertyValueByName("<![$mic:sortfields]!>");
iOutputManager.println("    " + lIndent + "PropertyValue lSortPropertyValue = lSortJeo.getPropertyValueByName(\"" + iSymbolTable.translateProperties("[$mic:sortfields]") + "\");", true);
//ScriptWriter~~    <!%lIndent!>if (lSortPropertyValue == null) {
iOutputManager.println("    " + lIndent + "if (lSortPropertyValue == null) {", true);
//ScriptWriter~~      <!%lIndent!>lSortPropertyValue = lSortJeo.getPropertyValue("<![$mic:sortfields]!>");
iOutputManager.println("      " + lIndent + "lSortPropertyValue = lSortJeo.getPropertyValue(\"" + iSymbolTable.translateProperties("[$mic:sortfields]") + "\");", true);
//ScriptWriter~~      <!%lIndent!>if (lSortPropertyValue == null) lSortPropertyValue = new PropertyValue();
iOutputManager.println("      " + lIndent + "if (lSortPropertyValue == null) lSortPropertyValue = new PropertyValue();", true);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~    <!%lIndent!>String lSort = lSortPropertyValue.toString();
iOutputManager.println("    " + lIndent + "String lSort = lSortPropertyValue.toString();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          if (<![$mic:sortfields:type]!>.equals("string")) {
          if (iSymbolTable.translateProperties("[$mic:sortfields:type]").equals("string")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSort += (new DecimalFormat("00000000000")).format(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "lSort += (new DecimalFormat(\"00000000000\")).format(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          } else if (<![$mic:sortfields:type]!>.equals("date")) {
          } else if (iSymbolTable.translateProperties("[$mic:sortfields:type]").equals("date")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSort += "0000000000000000000000";
iOutputManager.println("    " + lIndent + "lSort += \"0000000000000000000000\";", true);
//ScriptWriter~~    <!%lIndent!>lSort = lSort.substring(6,10) + lSort.substring(0,5) + (new DecimalFormat("00000000000")).format(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "lSort = lSort.substring(6,10) + lSort.substring(0,5) + (new DecimalFormat(\"00000000000\")).format(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          } else if (<![$mic:sortfields:type]!>.equals("int")) {
          } else if (iSymbolTable.translateProperties("[$mic:sortfields:type]").equals("int")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSort = "0000000000000000000000".substring(0, 20 - lSort.length()) + lSort + (new DecimalFormat("00000000000")).format(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "lSort = \"0000000000000000000000\".substring(0, 20 - lSort.length()) + lSort + (new DecimalFormat(\"00000000000\")).format(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSort += (new DecimalFormat("00000000000")).format(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "lSort += (new DecimalFormat(\"00000000000\")).format(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lSortJeo.setPropertyValue("<![$mic:sortfields]!>.sort", new PropertyValue(lSort));
iOutputManager.println("    " + lIndent + "lSortJeo.setPropertyValue(\"" + iSymbolTable.translateProperties("[$mic:sortfields]") + ".sort\", new PropertyValue(lSort));", true);
//ScriptWriter~~  <!%lIndent!>}
iOutputManager.println("  " + lIndent + "}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          boolean lAscending = true;
//ScriptWriter~~          if (<![$mic:sortfields:order]!>.equals("false")) lAscending = false;
          if (iSymbolTable.translateProperties("[$mic:sortfields:order]").equals("false")) lAscending = false;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>Jeo.sort(lArrayList<!%lX!>x, "<![$mic:sortfields]!>.sort", <!%lAscending!>);
iOutputManager.println("  " + lIndent + "Jeo.sort(lArrayList" + lX + "x, \"" + iSymbolTable.translateProperties("[$mic:sortfields]") + ".sort\", " + lAscending + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }

//ScriptWriter~~      int lNbrColumns = <!" + lJeoName + ":jeo:column!>!size();
      int lNbrColumns = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).size();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>boolean lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!> = true;
iOutputManager.println("  " + lIndent + "boolean lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + " = true;", true);
//ScriptWriter~~  <!%lIndent!>int lNbrColumns<!%lX!>x_<![" + lJeoName + ":jeo:type]!> = <!%lNbrColumns!>;
iOutputManager.println("  " + lIndent + "int lNbrColumns" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + " = " + lNbrColumns + ";", true);
//ScriptWriter~~  <!%lIndent!>String lTableEnd<!%lX!>x_<![" + lJeoName + ":jeo:type]!> = "</table>";
iOutputManager.println("  " + lIndent + "String lTableEnd" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + " = \"</table>\";", true);
//ScriptWriter~~  <!%lIndent!>for (int lIdx<!%lX!>=0; lIdx<!%lX!> < lArrayList<!%lX!>x.size(); lIdx<!%lX!>++) {
iOutputManager.println("  " + lIndent + "for (int lIdx" + lX + "=0; lIdx" + lX + " < lArrayList" + lX + "x.size(); lIdx" + lX + "++) {", true);
//ScriptWriter~~    <!%lIndent!><![" + lJeoName + ":jeo:instance]!> lJeo<!%lX!>x = (<![" + lJeoName + ":jeo:instance]!>) lArrayList<!%lX!>x.get(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + " lJeo" + lX + "x = (" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + ") lArrayList" + lX + "x.get(lIdx" + lX + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      if (lNbrColumns > 0) {      
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>if (lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>) {
iOutputManager.println("    " + lIndent + "if (lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + ") {", true);
//ScriptWriter~~      <!%lIndent!>lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>=false;
iOutputManager.println("      " + lIndent + "lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "=false;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        <!" + lJeoName + ":jeo:column!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~        if (<!" + lJeoName + ":jeo:column:heading!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:heading")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lStart!>
iOutputManager.println("" + lStart + "", true);
//ScriptWriter~~<table>
iOutputManager.println("<table>", true);
//ScriptWriter~~<!%lStop!>
iOutputManager.println("" + lStop + "", true);
//ScriptWriter~~<!%lStart!>
iOutputManager.println("" + lStart + "", true);
//ScriptWriter~~<header>
iOutputManager.println("<header>", true);
//ScriptWriter~~<!%lStop!>
iOutputManager.println("" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          <!" + lJeoName + ":jeo:column!>& {
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lStart!>
iOutputManager.println("" + lStart + "", true);
//ScriptWriter~~<column attribute="<![" + lJeoName + ":jeo:column:attribute]!>" width="<![" + lJeoName + ":jeo:column:width]!>"><![" + lJeoName + ":jeo:column:heading]!></column>
iOutputManager.println("<column attribute=\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]") + "\" width=\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:width]") + "\">" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:heading]") + "</column>", true);
//ScriptWriter~~<!%lStop!>
iOutputManager.println("" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lStart!>
iOutputManager.println("" + lStart + "", true);
//ScriptWriter~~</header>
iOutputManager.println("</header>", true);
//ScriptWriter~~<!%lStop!>
iOutputManager.println("" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~    <!%lIndent!>String <!%lX!>AttributeList = "";
iOutputManager.println("    " + lIndent + "String " + lX + "AttributeList = \"\";", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        <!" + lJeoName + ":jeo:tag!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:tag")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:tag")).next())  {
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:tag:name!>!size() != 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:tag:name")).size() != 0) {
//ScriptWriter~~            String lTag = <![" + lJeoName + ":jeo:tag:name]!>;
            String lTag = iSymbolTable.translateProperties("[" + lJeoName + ":jeo:tag:name]");
//ScriptWriter~~            String lTagProperty = <![" + lJeoName + ":jeo:tag]!>;
            String lTagProperty = iSymbolTable.translateProperties("[" + lJeoName + ":jeo:tag]");
//ScriptWriter~~            String lTagDefault = <![" + lJeoName + ":jeo:tag:default]!>;
            String lTagDefault = iSymbolTable.translateProperties("[" + lJeoName + ":jeo:tag:default]");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>{
iOutputManager.println("    " + lIndent + "{", true);
//ScriptWriter~~    <!%lIndent!>  PropertyValue lTagPropertyValue = lJeo<!%lX!>x.getPropertyValue("<!%lTagProperty!>");
iOutputManager.println("    " + lIndent + "  PropertyValue lTagPropertyValue = lJeo" + lX + "x.getPropertyValue(\"" + lTagProperty + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            if (<!" + lJeoName + ":jeo:tag:default!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:tag:default")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>  if (lTagPropertyValue.getType().equals("null")) lTagPropertyValue.reset("<!%lTagDefault!>");
iOutputManager.println("    " + lIndent + "  if (lTagPropertyValue.getType().equals(\"null\")) lTagPropertyValue.reset(\"" + lTagDefault + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>  if (!lTagPropertyValue.getType().equals("null")) <!%lX!>AttributeList += "<!%lTag!>" + "=\\\"" + lTagPropertyValue.toString() + "\\\" ";
iOutputManager.println("    " + lIndent + "  if (!lTagPropertyValue.getType().equals(\"null\")) " + lX + "AttributeList += \"" + lTag + "\" + \"=\"\" + lTagPropertyValue.toString() + \"\" \";", true);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
          }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lStart!>
iOutputManager.println("" + lStart + "", true);
//ScriptWriter~~<row <!%lVarStart!>%<!%lX!>AttributeList<!%lVarEnd!>>
iOutputManager.println("<row " + lVarStart + "%" + lX + "AttributeList" + lVarEnd + ">", true);
//ScriptWriter~~<!%lStop!>
iOutputManager.println("" + lStop + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <!%lIndent!><!%lX!>AttributeList = "";
iOutputManager.println("    " + lIndent + "" + lX + "AttributeList = \"\";", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        <!" + lJeoName + ":jeo:column!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {

//ScriptWriter~~          <!" + lJeoName + ":jeo:column:tag!>& {
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:tag")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:tag")).next())  {

//ScriptWriter~~            if (<!" + lJeoName + ":jeo:column:tag:name!>!size() != 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:tag:name")).size() != 0) {
//ScriptWriter~~              String lTag = <![" + lJeoName + ":jeo:column:tag:name]!>;
              String lTag = iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:tag:name]");
//ScriptWriter~~              String lTagProperty = <![" + lJeoName + ":jeo:column:tag]!>;
              String lTagProperty = iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:tag]");
//ScriptWriter~~              String lTagDefault = <![" + lJeoName + ":jeo:column:tag:default]!>;
              String lTagDefault = iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:tag:default]");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>{
iOutputManager.println("    " + lIndent + "{", true);
//ScriptWriter~~    <!%lIndent!>  PropertyValue lTagPropertyValue = lJeo<!%lX!>x.getPropertyValue("<!%lTagProperty!>");
iOutputManager.println("    " + lIndent + "  PropertyValue lTagPropertyValue = lJeo" + lX + "x.getPropertyValue(\"" + lTagProperty + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            if (<!" + lJeoName + ":jeo:column:tag:default!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:tag:default")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>  if (lTagPropertyValue.getType().equals("null")) lTagPropertyValue.reset("<!%lTagDefault!>");
iOutputManager.println("    " + lIndent + "  if (lTagPropertyValue.getType().equals(\"null\")) lTagPropertyValue.reset(\"" + lTagDefault + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>  if (!lTagPropertyValue.getType().equals("null")) <!%lX!>AttributeList += "<!%lTag!>" + "=\\\"" + lTagPropertyValue.toString() + "\\\" ";
iOutputManager.println("    " + lIndent + "  if (!lTagPropertyValue.getType().equals(\"null\")) " + lX + "AttributeList += \"" + lTag + "\" + \"=\"\" + lTagPropertyValue.toString() + \"\" \";", true);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
          }

//ScriptWriter~~          <!" + lJeoName + ":jeo:column:attribute!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:attribute")).resetIterator();
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column:attribute!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:attribute")).size() > 0) {
//ScriptWriter~~            String aColumnName = <![" + lJeoName + ":jeo:column:attribute]!>;
            String aColumnName = iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lStart!>
iOutputManager.println("" + lStart + "", true);
//ScriptWriter~~<<!%aColumnName!> <!%lVarStart!>%<!%lX!>AttributeList<!%lVarEnd!>><!%lVarStart!>%lJeo<!%lX!>x.get<![cap@[" + lJeoName + ":jeo:column:attribute]]!>PropertyValue().toString()<!%lVarEnd!></<!%aColumnName!>>
iOutputManager.println("<" + aColumnName + " " + lVarStart + "%" + lX + "AttributeList" + lVarEnd + ">" + lVarStart + "%lJeo" + lX + "x.get" + iSymbolTable.translateProperties("[cap@[" + lJeoName + ":jeo:column:attribute]]") + "PropertyValue().toString()" + lVarEnd + "</" + aColumnName + ">", true);
//ScriptWriter~~<!%lStop!>
iOutputManager.println("" + lStop + "", true);
//ScriptWriter~~    <!%lIndent!><!%lX!>AttributeList = "";
iOutputManager.println("    " + lIndent + "" + lX + "AttributeList = \"\";", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          if (<!" + lJeoName + ":jeo:column:property!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:property")).size() > 0) {
//ScriptWriter~~            String aColumnName = <![" + lJeoName + ":jeo:column:property]!>;
            String aColumnName = iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:property]");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lStart!>
iOutputManager.println("" + lStart + "", true);
//ScriptWriter~~<<!%aColumnName!> <!%lVarStart!>%<!%lX!>AttributeList<!%lVarEnd!>><!%lVarStart!>%lJeo<!%lX!>x.getPropertyValue("<![" + lJeoName + ":jeo:column:property]!>").toString()<!%lVarEnd!></<!%aColumnName!>>
iOutputManager.println("<" + aColumnName + " " + lVarStart + "%" + lX + "AttributeList" + lVarEnd + ">" + lVarStart + "%lJeo" + lX + "x.getPropertyValue(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:property]") + "\").toString()" + lVarEnd + "</" + aColumnName + ">", true);
//ScriptWriter~~<!%lStop!>
iOutputManager.println("" + lStop + "", true);
//ScriptWriter~~    <!%lIndent!><!%lX!>AttributeList = "";
iOutputManager.println("    " + lIndent + "" + lX + "AttributeList = \"\";", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }

        }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lStart!>
iOutputManager.println("" + lStart + "", true);
//ScriptWriter~~</row>
iOutputManager.println("</row>", true);
//ScriptWriter~~<!%lStop!>
iOutputManager.println("" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }

///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
//System.out.println("1> " + lJeoName);

//ScriptWriter~~      if (<!" + lJeoName + ":jeo:jeo!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:jeo")).size() > 0) {
//System.out.println("2> " + lJeoName);
//ScriptWriter~~        <!" + lJeoName + ":jeo:jeo!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:jeo")).resetIterator();
        lJeoName += ":jeo";
        lX += "x";
        lIndent += "  ";
//System.out.println("3> " + lJeoName);
      } else {
//System.out.println("4> " + lJeoName);
        if (lJeoName.endsWith(":jeo")) {
//ScriptWriter~~          while (<!" + lJeoName + ":jeo!>!isLast()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).isLast()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~    <!%lIndent!>if (!lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>) <!%lStart!><!%lVarStart!>%lTableEnd<!%lX!>x_<![" + lJeoName + ":jeo:type]!><!%lVarEnd!><!%lStop!>
iOutputManager.println("    " + lIndent + "if (!lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + ") " + lStart + "" + lVarStart + "%lTableEnd" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "" + lVarEnd + "" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            if (lJeoName.endsWith(":jeo")) {
//System.out.println("5> " + lJeoName);
              lJeoName = lJeoName.substring(0, lJeoName.length() - 4);
              lIndent = lIndent.substring(0, lIndent.length() - 2);
              lX = lX.substring(0, lX.length() - 1);
//System.out.println("6> " + lJeoName);
            } else {
//System.out.println("7> " + lJeoName);
              break;
            }
          }
//ScriptWriter~~          if (<!" + lJeoName + ":jeo!>!isLast()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).isLast()) {
          } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>}
iOutputManager.println("  " + lIndent + "}", true);
//ScriptWriter~~  <!%lIndent!>if (!lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>) <!%lStart!><!%lVarStart!>%lTableEnd<!%lX!>x_<![" + lJeoName + ":jeo:type]!><!%lVarEnd!><!%lStop!>
iOutputManager.println("  " + lIndent + "if (!lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + ") " + lStart + "" + lVarStart + "%lTableEnd" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "" + lVarEnd + "" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        } else {
//System.out.println("8> " + lJeoName);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!>}
iOutputManager.println("  " + lIndent + "}", true);
//ScriptWriter~~  <!%lIndent!>if (!lPrintHeading<!%lX!>x_<![" + lJeoName + ":jeo:type]!>) <!%lStart!><!%lVarStart!>%lTableEnd<!%lX!>x_<![" + lJeoName + ":jeo:type]!><!%lVarEnd!><!%lStop!>
iOutputManager.println("  " + lIndent + "if (!lPrintHeading" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + ") " + lStart + "" + lVarStart + "%lTableEnd" + lX + "x_" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "" + lVarEnd + "" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }
//System.out.println("9> " + lJeoName);
    }

//System.out.println("*> ");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lStart!>
iOutputManager.println("" + lStart + "", true);
//ScriptWriter~~</report>
iOutputManager.println("</report>", true);
//ScriptWriter~~<!%lStop!>
iOutputManager.println("" + lStop + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    closeOutput();
iOutputManager.println("    closeOutput();", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//=============================================================================


//=============================================================================

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  public void renderFromXml(String aXmlFile) {
iOutputManager.println("  public void renderFromXml(String aXmlFile) {", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    parseXmlPath(path(aXmlFile) + ".xml");
iOutputManager.println("    parseXmlPath(path(aXmlFile) + \".xml\");", true);
//ScriptWriter~~    <![report:inJeo]!> lJeo = new <![report:inJeo]!>();
iOutputManager.println("    " + iSymbolTable.translateProperties("[report:inJeo]") + " lJeo = new " + iSymbolTable.translateProperties("[report:inJeo]") + "();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    lStart = "%" + ">";
    lStop = "<" + "%";
    lVarStart = "<" + "!";
    lVarEnd = "!" + ">";
    lJeoName = "report";
    lX = "";
    lXCount = 0;
    lIndent = "  ";

//ScriptWriter~~    while(<!" + lJeoName + ":jeo!>!size() > 0) {
    while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).size() > 0) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!><!%lVarStart!><!%lJeoName!>:jeo<!%lVarEnd!><!%"!"!>resetIterator();
iOutputManager.println("  " + lIndent + "" + lVarStart + "" + lJeoName + ":jeo" + lVarEnd + "" + "!" + "resetIterator();", true);
//ScriptWriter~~  <!%lIndent!>while (<!%lVarStart!><!%lJeoName!>:jeo<!%lVarEnd!><!%"!"!>next()) {
iOutputManager.println("  " + lIndent + "while (" + lVarStart + "" + lJeoName + ":jeo" + lVarEnd + "" + "!" + "next()) {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      lXCount++;
//ScriptWriter~~      if (<!" + lJeoName + ":jeo:type!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:type")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!><![" + lJeoName + ":jeo:instance]!> lJeo<!%lX!>x = new <![" + lJeoName + ":jeo:instance]!>("<![" + lJeoName + ":jeo:type]!>");
iOutputManager.println("    " + lIndent + "" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + " lJeo" + lX + "x = new " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "\");", true);
//ScriptWriter~~    <!%lIndent!>lJeo<!%lX!>.addJeo(lJeo<!%lX!>x);
iOutputManager.println("    " + lIndent + "lJeo" + lX + ".addJeo(lJeo" + lX + "x);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!><![" + lJeoName + ":jeo:instance]!> lJeo<!%lX!>x = new <![" + lJeoName + ":jeo:instance]!>();
iOutputManager.println("    " + lIndent + "" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + " lJeo" + lX + "x = new " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "();", true);
//ScriptWriter~~    <!%lIndent!>lJeo<!%lX!>.addJeo(lJeo<!%lX!>x);
iOutputManager.println("    " + lIndent + "lJeo" + lX + ".addJeo(lJeo" + lX + "x);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~        String lAttributeName = <![" + lJeoName + ":jeo:column:attribute]!>;
        String lAttributeName = iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>if (<!%lVarStart!><!%lJeoName!>:jeo!>!scan("attribute:name", "<!%lAttributeName!>")) {
iOutputManager.println("    " + lIndent + "if (" + lVarStart + "" + lJeoName + ":jeo!>!scan(\"attribute:name\", \"" + lAttributeName + "\")) {", true);
//ScriptWriter~~    <!%lIndent!>  lJeo<!%lX!>x.set<![cap@[" + lJeoName + ":jeo:column:attribute]]!>(<!%lVarStart!>[<!%lJeoName!>:jeo:attribute:value]!>);
iOutputManager.println("    " + lIndent + "  lJeo" + lX + "x.set" + iSymbolTable.translateProperties("[cap@[" + lJeoName + ":jeo:column:attribute]]") + "(" + lVarStart + "[" + lJeoName + ":jeo:attribute:value]!>);", true);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }

      lJeoName += ":jeo";
      lX += "x";
      lIndent+="  ";

    }

    lIndent = lIndent.substring(0, lIndent.length() - 2);
    for (int lIdx=0; lIdx < lXCount; lIdx++) {
      lIndent = lIndent.substring(0, lIndent.length() - 2);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>}
iOutputManager.println("    " + lIndent + "}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    render(aXmlFile, lJeo);
iOutputManager.println("    render(aXmlFile, lJeo);", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//=============================================================================

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//$Section=Deleted$Preserve=yes
iOutputManager.println("//$Section=Deleted$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section contains orphaned code from deleted operations.
iOutputManager.println("// This section contains orphaned code from deleted operations.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Deleted$Preserve=no
iOutputManager.println("//$Section=Deleted$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//End of script---------------
iOutputManager.println("//End of script---------------", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    closeOutput();
//ScriptWriter~~    Merge.getInstance().doMerge(path(<![report:name]!>) + ".script", path(<![report:name]!>) + ".new", iScript.getMasterScript());
    Merge.getInstance().doMerge(path(iSymbolTable.translateProperties("[report:name]")) + ".script", path(iSymbolTable.translateProperties("[report:name]")) + ".new", iScript.getMasterScript());

    StringBuffer lStringBuffer1 = iOutputManager.getDocument("createHtml");
    StringBuffer lStringBuffer2 = iOutputManager.getDocument("createHtml2");

    if (openOutput(path(aXmlDefinition) + ".html")) {
//ScriptWriter~~      %><!%lStringBuffer1.toString()!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer1.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><br><%
      {
//ScriptWriter~~~
iOutputManager.println("<br>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><!%lStringBuffer2.toString()!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer2.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %></html><%
      {
//ScriptWriter~~~
iOutputManager.println("</html>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      closeOutput();
    }

//ScriptWriter~~    openOutput(path(<![report:name]!>) + "_Test.xml");
    openOutput(path(iSymbolTable.translateProperties("[report:name]")) + "_Test.xml");
    lStart = "%" + ">";
    lStop = "<" + "%";
    lVarStart = "<" + "!";
    lVarEnd = "!" + ">";
    lJeoName = "report";
    lX = "";
    lXCount = 0;
    lIndent = "  ";

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<report name="<![report:name]!>" inJeo="<![report:inJeo]!>">
iOutputManager.println("<report name=\"" + iSymbolTable.translateProperties("[report:name]") + "\" inJeo=\"" + iSymbolTable.translateProperties("[report:inJeo]") + "\">", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    while(<!" + lJeoName + ":jeo!>!size() > 0) {
    while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).size() > 0) {
      lXCount++;
//ScriptWriter~~      if (<!" + lJeoName + ":jeo:type!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:type")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lIndent!><jeo instance="<![" + lJeoName + ":jeo:instance]!>" type="<![" + lJeoName + ":jeo:type]!>">
iOutputManager.println("" + lIndent + "<jeo instance=\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "\" type=\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "\">", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lIndent!><jeo instance="<![" + lJeoName + ":jeo:instance]!>">
iOutputManager.println("" + lIndent + "<jeo instance=\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "\">", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!><attribute name="<![" + lJeoName + ":jeo:column:attribute]!>" value="<![" + lJeoName + ":jeo:column:attribute]!>" />
iOutputManager.println("  " + lIndent + "<attribute name=\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]") + "\" value=\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]") + "\" />", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }

      lJeoName += ":jeo";
      lX += "x";
      lIndent+="  ";

    }

    lIndent = lIndent.substring(0, lIndent.length() - 2);
    for (int lIdx=0; lIdx < lXCount; lIdx++) {
      lIndent = lIndent.substring(0, lIndent.length() - 2);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  <!%lIndent!></jeo>
iOutputManager.println("  " + lIndent + "</jeo>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~</report>
iOutputManager.println("</report>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    closeOutput();

//ScriptWriter~~    openOutput(path(<![report:name]!>) + "Controller.new");
    openOutput(path(iSymbolTable.translateProperties("[report:name]")) + "Controller.new");
    lStart = "%" + ">";
    lStop = "<" + "%";
    lVarStart = "<" + "!";
    lVarEnd = "!" + ">";
    lJeoName = "report";
    lX = "";
    lXCount = 0;
    lIndent = "  ";

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//  Generated at <!%lDateTime!> by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
iOutputManager.println("//  Generated at " + lDateTime + " by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void execute() {
iOutputManager.println("  public void execute() {", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    ArrayList lCollection = performService();
iOutputManager.println("    ArrayList lCollection = performService();", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    com.esarks.arm.model.jeo.ServiceJeo lDocumentServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
iOutputManager.println("    com.esarks.arm.model.jeo.ServiceJeo lDocumentServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    iScript.execMethod("<![report:name]!>", "render", new Object[]{"<![report:name]!>", lDocumentServiceJeo});
iOutputManager.println("    iScript.execMethod(\"" + iSymbolTable.translateProperties("[report:name]") + "\", \"render\", new Object[]{\"" + iSymbolTable.translateProperties("[report:name]") + "\", lDocumentServiceJeo});", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~  
iOutputManager.println("  ", true);
//ScriptWriter~~  public void performService() {
iOutputManager.println("  public void performService() {", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    // Create the service jeo
iOutputManager.println("    // Create the service jeo", true);
//ScriptWriter~~    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
iOutputManager.println("    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    // Call the service
iOutputManager.println("    // Call the service", true);
//ScriptWriter~~    iScript.execMethod("!!com...!!", "!!serviceName!!", new Object[]{lServiceJeo});
iOutputManager.println("    iScript.execMethod(\"!!com...!!\", \"!!serviceName!!\", new Object[]{lServiceJeo});", true);
//ScriptWriter~~    if (lServiceJeo.getError() != null && lServiceJeo.getError().getSeverity() < 5) {
iOutputManager.println("    if (lServiceJeo.getError() != null && lServiceJeo.getError().getSeverity() < 5) {", true);
//ScriptWriter~~      System.out.println(lServiceJeo.getError().getTitle());
iOutputManager.println("      System.out.println(lServiceJeo.getError().getTitle());", true);
//ScriptWriter~~      System.out.println(lServiceJeo.getError().getText());
iOutputManager.println("      System.out.println(lServiceJeo.getError().getText());", true);
//ScriptWriter~~      System.out.println(lServiceJeo.getError().getLocation());
iOutputManager.println("      System.out.println(lServiceJeo.getError().getLocation());", true);
//ScriptWriter~~      return;
iOutputManager.println("      return;", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    // Get the reply objects
iOutputManager.println("    // Get the reply objects", true);
//ScriptWriter~~    Jeo lReplyJeo = lServiceJeo.getReply();
iOutputManager.println("    Jeo lReplyJeo = lServiceJeo.getReply();", true);
//ScriptWriter~~    ArrayList lArrayList = lReplyJeo.getJeoByInstanceName("!!com...!!");
iOutputManager.println("    ArrayList lArrayList = lReplyJeo.getJeoByInstanceName(\"!!com...!!\");", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    int lIdx = 0;
iOutputManager.println("    int lIdx = 0;", true);
//ScriptWriter~~    for (lIdx=0; lIdx < lArrayList.size(); lIdx++) {
iOutputManager.println("    for (lIdx=0; lIdx < lArrayList.size(); lIdx++) {", true);
//ScriptWriter~~      !!com...!! lJeo = (!!com...!!) lArrayList.get(lIdx);
iOutputManager.println("      !!com...!! lJeo = (!!com...!!) lArrayList.get(lIdx);", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~  
iOutputManager.println("  ", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    while(<!" + lJeoName + ":jeo!>!size() > 0) {
    while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo")).size() > 0) {

      lXCount++;
//ScriptWriter~~      if (<!" + lJeoName + ":jeo:type!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:type")).size() > 0) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  public Jeo create<![cap@[" + lJeoName + ":jeo:type]]!>(Jeo aJeo);
iOutputManager.println("  public Jeo create" + iSymbolTable.translateProperties("[cap@[" + lJeoName + ":jeo:type]]") + "(Jeo aJeo);", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <![" + lJeoName + ":jeo:instance]!> lJeo = new <![" + lJeoName + ":jeo:instance]!>("<![" + lJeoName + ":jeo:type]!>");
iOutputManager.println("    " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + " lJeo = new " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:type]") + "\");", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  public Jeo create!!NoType!!(Jeo aJeo);
iOutputManager.println("  public Jeo create!!NoType!!(Jeo aJeo);", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <![" + lJeoName + ":jeo:instance]!> lJeo = new <![" + lJeoName + ":jeo:instance]!>();
iOutputManager.println("    " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + " lJeo = new " + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "();", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next())  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    lJeo.set<![cap@[" + lJeoName + ":jeo:column:attribute]]!>(aJeo.get!!Attribute!!PropertyValue().toString());
iOutputManager.println("    lJeo.set" + iSymbolTable.translateProperties("[cap@[" + lJeoName + ":jeo:column:attribute]]") + "(aJeo.get!!Attribute!!PropertyValue().toString());", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }

      lJeoName += ":jeo";
      lX += "x";
      lIndent+="  ";

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    return lJeo;
iOutputManager.println("    return lJeo;", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~}
iOutputManager.println("}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    closeOutput();

//ScriptWriter~~    openOutput(path(<![report:name]!>) + "Controller.xml");
    openOutput(path(iSymbolTable.translateProperties("[report:name]")) + "Controller.xml");
    lStart = "%" + ">";
    lStop = "<" + "%";
    lVarStart = "<" + "!";
    lVarEnd = "!" + ">";
    lJeoName = "report";
    lX = "";
    lXCount = 0;
    lIndent = "  ";

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<mic.element type="Component" title="">
iOutputManager.println("<mic.element type=\"Component\" title=\"\">", true);
//ScriptWriter~~</mic.element>
iOutputManager.println("</mic.element>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    closeOutput();

    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }

  }
}
