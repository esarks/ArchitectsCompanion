//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.report;

import com.esarks.jac.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.net.*;
import javax.net.ssl.*;
import java.security.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.awt.*;
import javax.swing.*;
import com.esarks.mic.*;

//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class GenerateReport extends com.esarks.mic.Component {

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
//ScriptWriter~~    if (<!report!>!size() == 0) return;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report")).size() == 0) return;
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
        
    try {
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
//ScriptWriter~~      File lNewFile = new File(path(<![report:name]!>) + ".script");
      File lNewFile = new File(path(iSymbolTable.translateProperties("[report:name]")) + ".script");
      if (lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() > lXmlFile.lastModified()) {
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

//ScriptWriter~~    openOutput(path(<![report:name]!>) + ".script");
    openOutput(path(iSymbolTable.translateProperties("[report:name]")) + ".script");

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
//ScriptWriter~~  public void render(String aOutput, <![report:inJeo]!> aJeo) {
iOutputManager.println("  public void render(String aOutput, " + iSymbolTable.translateProperties("[report:inJeo]") + " aJeo) {", true);
//ScriptWriter~~    renderHtml(aOutput, aJeo);
iOutputManager.println("    renderHtml(aOutput, aJeo);", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~  
iOutputManager.println("  ", true);
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

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lStart!><html><!%lStop!>
iOutputManager.println("    " + lStart + "<html>" + lStop + "", true);
//ScriptWriter~~    <!%lStart!><!%lVarStart!>%aOutput<!%lVarEnd!><br><br><!%lStop!>
iOutputManager.println("    " + lStart + "" + lVarStart + "%aOutput" + lVarEnd + "<br><br>" + lStop + "", true);
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
//ScriptWriter~~  <!%lIndent!>ArrayList lArrayList<!%lX!>x = lJeo<!%lX!>.getJeoByInstanceName("<![" + lJeoName + ":jeo:instance]!>");
iOutputManager.println("  " + lIndent + "ArrayList lArrayList" + lX + "x = lJeo" + lX + ".getJeoByInstanceName(\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + "\");", true);
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
//ScriptWriter~~  <!%lIndent!><!%lStart!><table cellspacing="0" cellpadding="0" border="1"><!%lStop!>
iOutputManager.println("  " + lIndent + "" + lStart + "<table cellspacing=\"0\" cellpadding=\"0\" border=\"1\">" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~      if (<!" + lJeoName + ":jeo:column:heading!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column:heading")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!><!%lStart!><table cellspacing="0" cellpadding="0" border="1"><!%lStop!>
iOutputManager.println("  " + lIndent + "" + lStart + "<table cellspacing=\"0\" cellpadding=\"0\" border=\"1\">" + lStop + "", true);
//ScriptWriter~~  <!%lIndent!><!%lStart!><tr><!%lStop!>
iOutputManager.println("  " + lIndent + "" + lStart + "<tr>" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        <!" + lJeoName + ":jeo:column!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~        while (<!" + lJeoName + ":jeo:column!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!><!%lStart!><td width="<![" + lJeoName + ":jeo:column:width]!>"><![" + lJeoName + ":jeo:column:heading]!>&nbsp;</td><!%lStop!>
iOutputManager.println("  " + lIndent + "" + lStart + "<td width=\"" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:width]") + "\">" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:heading]") + "&nbsp;</td>" + lStop + "", true);
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
//ScriptWriter~~  <!%lIndent!><!%lStart!></tr><!%lStop!>
iOutputManager.println("  " + lIndent + "" + lStart + "</tr>" + lStop + "", true);
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
//ScriptWriter~~  <!%lIndent!>for (int lIdx<!%lX!>=0; lIdx<!%lX!> < lArrayList<!%lX!>x.size(); lIdx<!%lX!>++) {
iOutputManager.println("  " + lIndent + "for (int lIdx" + lX + "=0; lIdx" + lX + " < lArrayList" + lX + "x.size(); lIdx" + lX + "++) {", true);
//ScriptWriter~~    <!%lIndent!><![" + lJeoName + ":jeo:instance]!> lJeo<!%lX!>x = (<![" + lJeoName + ":jeo:instance]!>) lArrayList<!%lX!>x.get(lIdx<!%lX!>);
iOutputManager.println("    " + lIndent + "" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + " lJeo" + lX + "x = (" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:instance]") + ") lArrayList" + lX + "x.get(lIdx" + lX + ");", true);
//ScriptWriter~~    <!%lIndent!><!%lStart!><tr><!%lStop!>
iOutputManager.println("    " + lIndent + "" + lStart + "<tr>" + lStop + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~      while (<!" + lJeoName + ":jeo:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next()) {
//ScriptWriter~~        if (<!" + lJeoName + ":jeo:column:attribute!>!size() > 0) {
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
//ScriptWriter~~        if (<!" + lJeoName + ":jeo:column:property!>!size() > 0) {
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
//ScriptWriter~~    <!%lIndent!><!%lStart!></table><!%lStop!>
iOutputManager.println("    " + lIndent + "" + lStart + "</table>" + lStop + "", true);
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
//ScriptWriter~~    <!%lStart!></html><!%lStop!>
iOutputManager.println("    " + lStart + "</html>" + lStop + "", true);
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
//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~      while (<!" + lJeoName + ":jeo:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <!%lIndent!>lJeo<!%lX!>x.set<![cap@[" + lJeoName + ":jeo:column:attribute]]!>(<!%lVarStart!>[<!%lJeoName!>:jeo:<![" + lJeoName + ":jeo:column:attribute]!>]<!%lVarEnd!>);
iOutputManager.println("    " + lIndent + "lJeo" + lX + "x.set" + iSymbolTable.translateProperties("[cap@[" + lJeoName + ":jeo:column:attribute]]") + "(" + lVarStart + "[" + lJeoName + ":jeo:" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]") + "]" + lVarEnd + ");", true);
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
//ScriptWriter~~//    Merge.getInstance().doMerge(path(<![report:name]!>) + ".script", path(<![report:name]!>) + ".new", iScript.getMasterScript());
//    Merge.getInstance().doMerge(path(iSymbolTable.translateProperties("[report:name]")) + ".script", path(iSymbolTable.translateProperties("[report:name]")) + ".new", iScript.getMasterScript());

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
//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~      while (<!" + lJeoName + ":jeo:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <!%lIndent!><<![" + lJeoName + ":jeo:column:attribute]!>><![" + lJeoName + ":jeo:column:attribute]!></<![" + lJeoName + ":jeo:column:attribute]!>>
iOutputManager.println("  " + lIndent + "<" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]") + ">" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]") + "</" + iSymbolTable.translateProperties("[" + lJeoName + ":jeo:column:attribute]") + ">", true);
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
//ScriptWriter~~    com.esarks.arm.model.jeo.service lDocumentServiceJeo = new com.esarks.arm.model.jeo.service();
iOutputManager.println("    com.esarks.arm.model.jeo.service lDocumentServiceJeo = new com.esarks.arm.model.jeo.service();", true);
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
//ScriptWriter~~    com.esarks.arm.model.jeo.service lServiceJeo = new com.esarks.arm.model.jeo.service();
iOutputManager.println("    com.esarks.arm.model.jeo.service lServiceJeo = new com.esarks.arm.model.jeo.service();", true);
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
//ScriptWriter~~      <!" + lJeoName + ":jeo:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).resetIterator();
//ScriptWriter~~      while (<!" + lJeoName + ":jeo:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lJeoName + ":jeo:column")).next()) {
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
