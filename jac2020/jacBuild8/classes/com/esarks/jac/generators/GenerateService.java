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
public class GenerateService extends com.esarks.mic.Component  {

String iOpenSymbol = "<" + "!";
String iCloseSymbol = "!" + ">";

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected GenerateService() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public GenerateService(Script aScript) {

    super(aScript);

  }

  public void generateServices(String aXmlDefinition) {
    resetExit();
    try {
//ScriptWriter~~%>generateServices: <!%aXmlDefinition!>
{
//ScriptWriter~~~
iOutputManager.println("generateServices: " + aXmlDefinition + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!com.esarks.arm.schemas.services.root!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root")).remove();
    parseXmlDefinition(aXmlDefinition);
//ScriptWriter~~    if (<!com.esarks.arm.schemas.services.root!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root")).size() == 0) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Could not find <services> tag in " + path(aXmlDefinition) + ".xml file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Could not find <services> tag in " + path(aXmlDefinition) + ".xml file.");
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
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateService") + ".script");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
//ScriptWriter~~      File lNewFile = new File(path(<![com.esarks.arm.schemas.services.root:name]!>) + ".script");
      File lNewFile = new File(path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]")) + ".script");
      if (lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          ((lGeneratorFile.exists() && lNewFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) || !lGeneratorFile.exists())) {
//ScriptWriter~~        String lServicesName = <![com.esarks.arm.schemas.services.root:name]!>;
        String lServicesName = iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]");
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("File " + lServicesName + ".script is not stale.  Generation bypassed.");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("File " + lServicesName + ".script is not stale.  Generation bypassed.");
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

//ScriptWriter~~    if (!openOutput(path(<![com.esarks.arm.schemas.services.root:name]!>) + ".xml")) {
    if (!openOutput(path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]")) + ".xml")) {
      setContext(iScript.getMasterScript());
      if (iOutputManager.getExceptionMessage() != null) {
//ScriptWriter~~        <!$jac:event!>!set(iOutputManager.getExceptionMessage());
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(iOutputManager.getExceptionMessage());
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      }
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(<![com.esarks.arm.schemas.services.root:name]!>) + ".xml file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]")) + ".xml file for output.");
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

    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getDbConnection("application");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<mic.element type="Service" title="">  
iOutputManager.println("<mic.element type=\"Service\" title=\"\">  ", true);
//ScriptWriter~~</mic.element>
iOutputManager.println("</mic.element>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    closeOutput();
    
//ScriptWriter~~    if (!openOutput(path(<![com.esarks.arm.schemas.services.root:name]!>) + ".new")) {
    if (!openOutput(path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]")) + ".new")) {
      setContext(iScript.getMasterScript());
      if (iOutputManager.getExceptionMessage() != null) {
//ScriptWriter~~        <!$jac:event!>!set(iOutputManager.getExceptionMessage());
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(iOutputManager.getExceptionMessage());
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      }
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(<![com.esarks.arm.schemas.services.root:name]!>) + ".new file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]")) + ".new file for output.");
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
//ScriptWriter~~    String lDateTime = <![$jac:dateTime]!>;
    String lDateTime = iSymbolTable.translateProperties("[$jac:dateTime]");
    restoreContext();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=License$Preserve=no
iOutputManager.println("//$Section=License$Preserve=no", true);
//ScriptWriter~~//  Generated at <!%lDateTime!> by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
iOutputManager.println("//  Generated at " + lDateTime + " by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=ChangeLog$Preserve=yes
iOutputManager.println("//$Section=ChangeLog$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~/* ========================================================================= *
iOutputManager.println("/* ========================================================================= *", true);
//ScriptWriter~~   Contributor        Description
iOutputManager.println("   Contributor        Description", true);
//ScriptWriter~~   ------------------ ------------------------------------------------------
iOutputManager.println("   ------------------ ------------------------------------------------------", true);
//ScriptWriter~~                      Author
iOutputManager.println("                      Author", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~ * ========================================================================= */
iOutputManager.println(" * ========================================================================= */", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=ChangeLog$Preserve=no
iOutputManager.println("//$Section=ChangeLog$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for custom operations.
iOutputManager.println("// This section is for custom operations.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~//$Section=CustomOperations$Preserve=yes
iOutputManager.println("//$Section=CustomOperations$Preserve=yes", true);
//ScriptWriter~~//$Section=CustomOperations$Preserve=no
iOutputManager.println("//$Section=CustomOperations$Preserve=no", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


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

//ScriptWriter~~    %><tr><td align="right">Service Script Name</td><td><![com.esarks.arm.schemas.services.root:name]!></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td align=\"right\">Service Script Name</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + "</td></tr>", false);
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

//ScriptWriter~~    <!com.esarks.arm.schemas.services.root:service!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.services.root:service!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service")).next()) {

      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %><table width=100% border=1 cellpadding=5 cellspacing=0><%
      {
//ScriptWriter~~~
iOutputManager.println("<table width=100% border=1 cellpadding=5 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td colspan=2><b><![com.esarks.arm.schemas.services.root:service:name]!></b> ( <![com.esarks.arm.schemas.services.root:service:jeo]!> )</td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=2><b>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "</b> ( " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:jeo]") + " )</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    public void <![com.esarks.arm.schemas.services.root:service:name]!>(<![com.esarks.arm.schemas.services.root:service:jeo]!> aJeo) {
iOutputManager.println("    public void " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "(" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:jeo]") + " aJeo) {", true);
//ScriptWriter~~      java.util.Date lStartTime = null;
iOutputManager.println("      java.util.Date lStartTime = null;", true);
//ScriptWriter~~      if (iMicLog.test(Log._APP)) {
iOutputManager.println("      if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~        lStartTime = new java.util.Date();
iOutputManager.println("        lStartTime = new java.util.Date();", true);
//ScriptWriter~~        iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!Enter method");
iOutputManager.println("        iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!Enter method\");", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~<%  
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
  

//ScriptWriter~~      if (<!com.esarks.arm.schemas.services.root:service:sql!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql")).size() > 0) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
iOutputManager.println("      DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();", true);
//ScriptWriter~~      DbConnection lDbConnection = null;
iOutputManager.println("      DbConnection lDbConnection = null;", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      PropertyValue lDbConnectionPropertyValue = aJeo.getPropertyValue("DbConnection");
iOutputManager.println("      PropertyValue lDbConnectionPropertyValue = aJeo.getPropertyValue(\"DbConnection\");", true);
//ScriptWriter~~      if (lDbConnectionPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL) {
iOutputManager.println("      if (lDbConnectionPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL) {", true);
//ScriptWriter~~        lDbConnection = (DbConnection) lDbConnectionPropertyValue.getValueObject();
iOutputManager.println("        lDbConnection = (DbConnection) lDbConnectionPropertyValue.getValueObject();", true);
//ScriptWriter~~      } else {
iOutputManager.println("      } else {", true);
//ScriptWriter~~        lDbConnection = lDbConnectionFactory.getDbConnection("application");
iOutputManager.println("        lDbConnection = lDbConnectionFactory.getDbConnection(\"application\");", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      if (lDbConnection == null) {
iOutputManager.println("      if (lDbConnection == null) {", true);
//ScriptWriter~~        aJeo.addError();
iOutputManager.println("        aJeo.addError();", true);
//ScriptWriter~~        aJeo.setErrorId("");
iOutputManager.println("        aJeo.setErrorId(\"\");", true);
//ScriptWriter~~        aJeo.setErrorLocation("<!%aXmlDefinition!> : <![com.esarks.arm.schemas.services.root:service:name]!>");
iOutputManager.println("        aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\");", true);
//ScriptWriter~~        aJeo.setErrorTitle("Database Connection Failed");
iOutputManager.println("        aJeo.setErrorTitle(\"Database Connection Failed\");", true);
//ScriptWriter~~        aJeo.setErrorText("The service failed to obtain a database connection.");
iOutputManager.println("        aJeo.setErrorText(\"The service failed to obtain a database connection.\");", true);
//ScriptWriter~~        aJeo.setErrorResolution("This is an internal application error that will likely be unresolvable without technical support intervention.");
iOutputManager.println("        aJeo.setErrorResolution(\"This is an internal application error that will likely be unresolvable without technical support intervention.\");", true);
//ScriptWriter~~        aJeo.setErrorSeverity(0);
iOutputManager.println("        aJeo.setErrorSeverity(0);", true);
//ScriptWriter~~        aJeo.getMostSevereError();
iOutputManager.println("        aJeo.getMostSevereError();", true);
//ScriptWriter~~        if (iMicLog.test(Log._ERR)) {
iOutputManager.println("        if (iMicLog.test(Log._ERR)) {", true);
//ScriptWriter~~          iMicLog.println(Log._ERR, "ERR-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!DbConnection is null");
iOutputManager.println("          iMicLog.println(Log._ERR, \"ERR-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!DbConnection is null\");", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        return;
iOutputManager.println("        return;", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        <!com.esarks.arm.schemas.services.root:service:sql!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql")).next())  {
//ScriptWriter~~        if (!<![com.esarks.arm.schemas.services.root:service:sql:stereotype]!>.equals("") &&
        if (!iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:stereotype]").equals("") &&
//ScriptWriter~~            !<![com.esarks.arm.schemas.services.root:service:sql:stereotype]!>.equals(lDbConnection.getStereotype())) continue;
            !iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:stereotype]").equals(lDbConnection.getStereotype())) continue;
//ScriptWriter~~%>      
{
//ScriptWriter~~~
iOutputManager.println("      ", true);
//ScriptWriter~~      try {
iOutputManager.println("      try {", true);
//ScriptWriter~~        String lTop = "";
iOutputManager.println("        String lTop = \"\";", true);
//ScriptWriter~~        String lWhere = "";
iOutputManager.println("        String lWhere = \"\";", true);
//ScriptWriter~~        ArrayList lWhereList = new ArrayList();
iOutputManager.println("        ArrayList lWhereList = new ArrayList();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        iOutputManager.setDocument("createHtml");
//ScriptWriter~~        %><tr><td>Order By</td><td><![com.esarks.arm.schemas.services.root:service:sql:orderBy]!>&nbsp;</td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Order By</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:orderBy]") + "&nbsp;</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        iOutputManager.setDocument("");

//ScriptWriter~~        if (<!com.esarks.arm.schemas.services.root:service:sql:orderBy!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql:orderBy")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        String lOrder = "<![com.esarks.arm.schemas.services.root:service:sql:orderBy]!>";
iOutputManager.println("        String lOrder = \"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:orderBy]") + "\";", true);
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
//ScriptWriter~~        String lOrder = "";
iOutputManager.println("        String lOrder = \"\";", true);
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
//ScriptWriter~~        if (!aJeo.getRequest().getOrderClausePropertyValue().toString().equals("")) {
iOutputManager.println("        if (!aJeo.getRequest().getOrderClausePropertyValue().toString().equals(\"\")) {", true);
//ScriptWriter~~          lOrder = aJeo.getRequest().getOrderClausePropertyValue().toString();
iOutputManager.println("          lOrder = aJeo.getRequest().getOrderClausePropertyValue().toString();", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        String lProcedure = "";
        String lCompact = "";
        String lDocument = "";

//ScriptWriter~~        if (<!com.esarks.arm.schemas.services.root:service:sql:statement!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql:statement")).size() > 0) {
//ScriptWriter~~          <!com.esarks.arm.schemas.services.root:service:sql:statement!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql:statement")).resetIterator();
//ScriptWriter~~          while (<!com.esarks.arm.schemas.services.root:service:sql:statement!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql:statement")).next()) {
//ScriptWriter~~            if (<![com.esarks.arm.schemas.services.root:service:sql:statement:stereotype]!>.equals("")) break;
            if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement:stereotype]").equals("")) break;
//ScriptWriter~~            if (<![com.esarks.arm.schemas.services.root:service:sql:statement:stereotype]!>.equals(lDbConnection.getStereotype())) break;
            if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement:stereotype]").equals(lDbConnection.getStereotype())) break;
          }
//ScriptWriter~~          lProcedure = <![com.esarks.arm.schemas.services.root:service:sql:statement]!>;
          lProcedure = iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement]");
        }
        boolean lSkipSpace = true;
        for (int lIdx=0; lIdx < lProcedure.length(); lIdx++) {
          if (lProcedure.charAt(lIdx) == '\\' && lProcedure.charAt(lIdx+1) == 'n') {
            lCompact = lCompact.concat("\" + \"\\n\" + \"");
            lDocument = lDocument.concat("<br>");
            lIdx++;
            continue;
          }
          if (lProcedure.charAt(lIdx) <= ' ') {
            if (lProcedure.charAt(lIdx) < ' ') lDocument = lDocument.concat("<br>");
            if (lSkipSpace == true) continue;
            lSkipSpace = true;
            lCompact = lCompact.concat(" ");
            lDocument = lDocument.concat(" ");
            continue;
          }
          lSkipSpace = false;
          lCompact = lCompact.concat(lProcedure.substring(lIdx, lIdx+1));
          lDocument = lDocument.concat(lProcedure.substring(lIdx, lIdx+1));
        }

        iOutputManager.setDocument("createHtml");
//ScriptWriter~~        %><tr><td>Statement</td><td><!%lDocument!>&nbsp;</td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Statement</td><td>" + lDocument + "&nbsp;</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        iOutputManager.setDocument("");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        String lSql = "<!%lCompact!>";
iOutputManager.println("        String lSql = \"" + lCompact + "\";", true);
//ScriptWriter~~        if (!aJeo.getRequest().getSelectClausePropertyValue().toString().equals("")) {
iOutputManager.println("        if (!aJeo.getRequest().getSelectClausePropertyValue().toString().equals(\"\")) {", true);
//ScriptWriter~~          lSql = aJeo.getRequest().getSelectClausePropertyValue().toString();
iOutputManager.println("          lSql = aJeo.getRequest().getSelectClausePropertyValue().toString();", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~        <!com.esarks.arm.schemas.services.root:service:sql:where!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql:where")).resetIterator();
//ScriptWriter~~        while (<!com.esarks.arm.schemas.services.root:service:sql:where!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql:where")).next()) {

          iOutputManager.setDocument("createHtml");
//ScriptWriter~~          %><tr><td colspan=2>Where</td></tr><%
          {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=2>Where</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><tr><td colspan=2><table border=0 cellpadding=0 cellspacing=0><%
          {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=2><table border=0 cellpadding=0 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          iOutputManager.setDocument("");

//ScriptWriter~~          if (!<!com.esarks.arm.schemas.services.root:service:sql:where!>!isFirst()) {
          if (!iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql:where")).isFirst()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        else
iOutputManager.println("        else", true);
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
//ScriptWriter~~        if (aJeo.getRequest().getWhereClausePropertyValue().toString().equals("")) {
iOutputManager.println("        if (aJeo.getRequest().getWhereClausePropertyValue().toString().equals(\"\")) {", true);
//ScriptWriter~~          <![com.esarks.arm.schemas.services.root:service:jeo]!> lJeox = aJeo;
iOutputManager.println("          " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:jeo]") + " lJeox = aJeo;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          String lJeoName = "lJeox";
          String lResultJeo = "com.esarks.arm.schemas.services.root:service:sql:where";
          int lJeoCount = 0;
//ScriptWriter~~          while (<!" + lResultJeo + ":jeo!>!size() > 0) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo")).size() > 0) {

            iOutputManager.setDocument("createHtml");
            lJeoCount++;
//ScriptWriter~~            %><tr><td><table border=1 cellpadding=5 cellspacing=0><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table border=1 cellpadding=5 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            %><tr><td colspan=5><![" + lResultJeo + ":jeo:name]!></td></tr><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=5>" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            iOutputManager.setDocument("");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          <![" + lResultJeo + ":jeo:name]!> <!%lJeoName!>x = (<![" + lResultJeo + ":jeo:name]!>) <!%lJeoName!>.getJeoByInstanceNameAt("<![" + lResultJeo + ":jeo:name]!>", 0);
iOutputManager.println("          " + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + " " + lJeoName + "x = (" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + ") " + lJeoName + ".getJeoByInstanceNameAt(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + "\", 0);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            lJeoName = lJeoName + "x";
            lResultJeo = lResultJeo + ":jeo";
          }
//ScriptWriter~~          <!" + lResultJeo + ":where!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where")).resetIterator();
//ScriptWriter~~          while(<!" + lResultJeo + ":where!>!next()) {
          while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where")).next()) {

            iOutputManager.setDocument("createHtml");
//ScriptWriter~~            if (<!" + lResultJeo + ":where!>!isFirst()) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where")).isFirst()) {
//ScriptWriter~~              %><tr><td><table border=1 cellpadding=5 cellspacing=0><%
              {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table border=1 cellpadding=5 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~              %><tr><td><b>Attribute</b></td><td><b>Property</b></td><td><b>Clause</b></td><td><b>Skip If Null</b></td><td><b>Skip If Blank</b></td></tr><%
              {
//ScriptWriter~~~
iOutputManager.println("<tr><td><b>Attribute</b></td><td><b>Property</b></td><td><b>Clause</b></td><td><b>Skip If Null</b></td><td><b>Skip If Blank</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~            %><tr><td><![" + lResultJeo + ":where:attribute]!>&nbsp;</td><td><![" + lResultJeo + ":where:property]!>&nbsp;</td><td><![" + lResultJeo + ":where:clause]!>&nbsp;</td><td><![" + lResultJeo + ":where:skipIfNull]!>&nbsp;</td><td><![" + lResultJeo + ":where:skipIfBlank]!>&nbsp;</td></tr><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:attribute]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:property]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:clause]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:skipIfNull]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:skipIfBlank]") + "&nbsp;</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            iOutputManager.setDocument("");

//ScriptWriter~~            if (<![" + lResultJeo + ":where:skipIfNull]!>.equals("true") || <![" + lResultJeo + ":where:skipIfBlank]!>.equals("true")) {
            if (iSymbolTable.translateProperties("[" + lResultJeo + ":where:skipIfNull]").equals("true") || iSymbolTable.translateProperties("[" + lResultJeo + ":where:skipIfBlank]").equals("true")) {
//ScriptWriter~~              if (<!" + lResultJeo + ":where:property!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:property")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          {
iOutputManager.println("          {", true);
//ScriptWriter~~            PropertyValue lPropertyValue = <!%lJeoName!>.getPropertyValue("<![" + lResultJeo + ":where:property]!>");
iOutputManager.println("            PropertyValue lPropertyValue = " + lJeoName + ".getPropertyValue(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:property]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                if (<![" + lResultJeo + ":where:skipIfBlank]!>.equals("true")) {
                if (iSymbolTable.translateProperties("[" + lResultJeo + ":where:skipIfBlank]").equals("true")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            if (lPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL && lPropertyValue.toString().trim().length() > 0) {
iOutputManager.println("            if (lPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL && lPropertyValue.toString().trim().length() > 0) {", true);
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
//ScriptWriter~~            if (lPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL) {
iOutputManager.println("            if (lPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL) {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                }
              }
//ScriptWriter~~              if (<!" + lResultJeo + ":where:attribute!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:attribute")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          {
iOutputManager.println("          {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                if (<![" + lResultJeo + ":where:skipIfBlank]!>.equals("true")) {
                if (iSymbolTable.translateProperties("[" + lResultJeo + ":where:skipIfBlank]").equals("true")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            if(!<!%lJeoName!>.is<![cap@[" + lResultJeo + ":where:attribute]]!>Null() && <!%lJeoName!>.get<![cap@[" + lResultJeo + ":where:attribute]]!>PropertyValue().toString().trim().length() > 0) {
iOutputManager.println("            if(!" + lJeoName + ".is" + iSymbolTable.translateProperties("[cap@[" + lResultJeo + ":where:attribute]]") + "Null() && " + lJeoName + ".get" + iSymbolTable.translateProperties("[cap@[" + lResultJeo + ":where:attribute]]") + "PropertyValue().toString().trim().length() > 0) {", true);
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
//ScriptWriter~~            if(!<!%lJeoName!>.is<![cap@[" + lResultJeo + ":where:attribute]]!>Null()) {
iOutputManager.println("            if(!" + lJeoName + ".is" + iSymbolTable.translateProperties("[cap@[" + lResultJeo + ":where:attribute]]") + "Null()) {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                }
              }
            } else {
//ScriptWriter~~              if (<!" + lResultJeo + ":where:property!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:property")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          {
iOutputManager.println("          {", true);
//ScriptWriter~~            {
iOutputManager.println("            {", true);
//ScriptWriter~~              PropertyValue lPropertyValue = <!%lJeoName!>.getPropertyValue("<![" + lResultJeo + ":where:property]!>");
iOutputManager.println("              PropertyValue lPropertyValue = " + lJeoName + ".getPropertyValue(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:property]") + "\");", true);
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
//ScriptWriter~~          {
iOutputManager.println("          {", true);
//ScriptWriter~~            {
iOutputManager.println("            {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

              }
            }
//ScriptWriter~~            <!" + lResultJeo + ":where:conjunction!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:conjunction")).resetIterator();
//ScriptWriter~~            while(<!" + lResultJeo + ":where:conjunction!>!next()) {
            while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:conjunction")).next()) {

              iOutputManager.setDocument("createHtml");
//ScriptWriter~~              if (<!" + lResultJeo + ":where:conjunction!>!isFirst()) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:conjunction")).isFirst()) {
//ScriptWriter~~                %><tr><td colspan=5><table border=1 cellpadding=5 cellspacing=0><%
                {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=5><table border=1 cellpadding=5 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                %><tr><td><b>Equals</b></td><td><b>Ends With</b></td><td><b>Clause</b></td></tr><%
                {
//ScriptWriter~~~
iOutputManager.println("<tr><td><b>Equals</b></td><td><b>Ends With</b></td><td><b>Clause</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

              }
//ScriptWriter~~              %><tr><td><![" + lResultJeo + ":where:conjunction:equals]!>&nbsp;</td><td><![" + lResultJeo + ":where:conjunction:endsWith]!>&nbsp;</td><td><![" + lResultJeo + ":where:conjunction:clause]!>&nbsp;</td></tr><%
              {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:conjunction:equals]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:conjunction:endsWith]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:conjunction:clause]") + "&nbsp;</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

              iOutputManager.setDocument("");

//ScriptWriter~~              if (<!" + lResultJeo + ":where:conjunction:equals!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:conjunction:equals")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              if (lWhere.equals("<![" + lResultJeo + ":where:conjunction:equals]!>")) lWhere = lWhere.trim() + " <![" + lResultJeo + ":where:conjunction:clause]!>";
iOutputManager.println("              if (lWhere.equals(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:conjunction:equals]") + "\")) lWhere = lWhere.trim() + \" " + iSymbolTable.translateProperties("[" + lResultJeo + ":where:conjunction:clause]") + "\";", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

              }
//ScriptWriter~~              if (<!" + lResultJeo + ":where:conjunction:endsWith!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:conjunction:endsWith")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              if (lWhere.endsWith("<![" + lResultJeo + ":where:conjunction:endsWith]!>")) lWhere = lWhere.trim() + " <![" + lResultJeo + ":where:conjunction:clause]!>";
iOutputManager.println("              if (lWhere.endsWith(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":where:conjunction:endsWith]") + "\")) lWhere = lWhere.trim() + \" " + iSymbolTable.translateProperties("[" + lResultJeo + ":where:conjunction:clause]") + "\";", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

              }

              iOutputManager.setDocument("createHtml");
//ScriptWriter~~              if (<!" + lResultJeo + ":where:conjunction!>!isLast()) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:conjunction")).isLast()) {
//ScriptWriter~~                %></table><%
                {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

              }
              iOutputManager.setDocument("");

            }
//ScriptWriter~~            if (<!" + lResultJeo + ":where:clause!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:clause")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              lWhere = lWhere.trim() + " <![" + lResultJeo + ":where:clause]!>";
iOutputManager.println("              lWhere = lWhere.trim() + \" " + iSymbolTable.translateProperties("[" + lResultJeo + ":where:clause]") + "\";", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~            if (<!" + lResultJeo + ":where:property!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:property")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              lWhereList.add(lPropertyValue);
iOutputManager.println("              lWhereList.add(lPropertyValue);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~            if (<!" + lResultJeo + ":where:attribute!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:attribute")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              lWhereList.add(<!%lJeoName!>.get<![cap@[" + lResultJeo + ":where:attribute]]!>PropertyValue());
iOutputManager.println("              lWhereList.add(" + lJeoName + ".get" + iSymbolTable.translateProperties("[cap@[" + lResultJeo + ":where:attribute]]") + "PropertyValue());", true);
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
//ScriptWriter~~            }
iOutputManager.println("            }", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            iOutputManager.setDocument("createHtml");
//ScriptWriter~~            if (<!" + lResultJeo + ":where!>!isLast()) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where")).isLast()) {
//ScriptWriter~~              %></table><%
              {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
            iOutputManager.setDocument("");
          }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          for (int lIdx=0; lIdx < lJeoCount; lIdx++) {
            iOutputManager.setDocument("createHtml");
//ScriptWriter~~            %></td></tr></table><%
            {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            iOutputManager.setDocument("");
          }

          iOutputManager.setDocument("createHtml");
//ScriptWriter~~          %></table></td></tr><%
          {
//ScriptWriter~~~
iOutputManager.println("</table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          iOutputManager.setDocument("");

        } // while (!com.esarks.arm.schemas.services.root:service:sql:where!next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        if (!aJeo.getRequest().getWhereClausePropertyValue().toString().equals("")) {
iOutputManager.println("        if (!aJeo.getRequest().getWhereClausePropertyValue().toString().equals(\"\")) {", true);
//ScriptWriter~~          lWhere = aJeo.getRequest().getWhereClausePropertyValue().toString();
iOutputManager.println("          lWhere = aJeo.getRequest().getWhereClausePropertyValue().toString();", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        if (lWhere.trim().length() > 0) lWhere = lWhere.trim();
iOutputManager.println("        if (lWhere.trim().length() > 0) lWhere = lWhere.trim();", true);
//ScriptWriter~~        if (lOrder.trim().length() > 0) lOrder = lOrder.trim();
iOutputManager.println("        if (lOrder.trim().length() > 0) lOrder = lOrder.trim();", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~        int lTagSearchIndex = 0;
iOutputManager.println("        int lTagSearchIndex = 0;", true);
//ScriptWriter~~        if ((lTagSearchIndex = lSql.indexOf("$*top")) > -1) {
iOutputManager.println("        if ((lTagSearchIndex = lSql.indexOf(\"$*top\")) > -1) {", true);
//ScriptWriter~~          if (lDbConnection.getStereotype().equals("sqlServer")) {
iOutputManager.println("          if (lDbConnection.getStereotype().equals(\"sqlServer\")) {", true);
//ScriptWriter~~            if (aJeo.getRequest().getTopPropertyValue().toString().equals("")) {
iOutputManager.println("            if (aJeo.getRequest().getTopPropertyValue().toString().equals(\"\")) {", true);
//ScriptWriter~~              lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 5);
iOutputManager.println("              lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 5);", true);
//ScriptWriter~~            } else {
iOutputManager.println("            } else {", true);
//ScriptWriter~~              lSql = lSql.substring(0, lTagSearchIndex) + "TOP " + aJeo.getRequest().getTopPropertyValue().toString() + lSql.substring(lTagSearchIndex + 5);
iOutputManager.println("              lSql = lSql.substring(0, lTagSearchIndex) + \"TOP \" + aJeo.getRequest().getTopPropertyValue().toString() + lSql.substring(lTagSearchIndex + 5);", true);
//ScriptWriter~~            }
iOutputManager.println("            }", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~            lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 5);
iOutputManager.println("            lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 5);", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        if ((lTagSearchIndex = lSql.indexOf("$*limit")) > -1) {
iOutputManager.println("        if ((lTagSearchIndex = lSql.indexOf(\"$*limit\")) > -1) {", true);
//ScriptWriter~~          if (lDbConnection.getStereotype().equals("mySql") || lDbConnection.getStereotype().equals("postgreSql")) {
iOutputManager.println("          if (lDbConnection.getStereotype().equals(\"mySql\") || lDbConnection.getStereotype().equals(\"postgreSql\")) {", true);
//ScriptWriter~~            if (aJeo.getRequest().getTopPropertyValue().toString().equals("")) {
iOutputManager.println("            if (aJeo.getRequest().getTopPropertyValue().toString().equals(\"\")) {", true);
//ScriptWriter~~              lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 7);
iOutputManager.println("              lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 7);", true);
//ScriptWriter~~            } else {
iOutputManager.println("            } else {", true);
//ScriptWriter~~              lSql = lSql.substring(0, lTagSearchIndex) + "LIMIT " + aJeo.getRequest().getTopPropertyValue().toString() + lSql.substring(lTagSearchIndex + 7);
iOutputManager.println("              lSql = lSql.substring(0, lTagSearchIndex) + \"LIMIT \" + aJeo.getRequest().getTopPropertyValue().toString() + lSql.substring(lTagSearchIndex + 7);", true);
//ScriptWriter~~            }
iOutputManager.println("            }", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~            lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 7);
iOutputManager.println("            lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 7);", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        if ((lTagSearchIndex = lSql.indexOf("$*where")) > -1) {
iOutputManager.println("        if ((lTagSearchIndex = lSql.indexOf(\"$*where\")) > -1) {", true);
//ScriptWriter~~          lWhere = lWhere.trim();
iOutputManager.println("          lWhere = lWhere.trim();", true);
//ScriptWriter~~          if (lWhere.equals("")) {
iOutputManager.println("          if (lWhere.equals(\"\")) {", true);
//ScriptWriter~~            lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 7);
iOutputManager.println("            lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 7);", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~            lSql = lSql.substring(0, lTagSearchIndex) + "WHERE " + lWhere + lSql.substring(lTagSearchIndex + 7);
iOutputManager.println("            lSql = lSql.substring(0, lTagSearchIndex) + \"WHERE \" + lWhere + lSql.substring(lTagSearchIndex + 7);", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        if ((lTagSearchIndex = lSql.indexOf("$*order")) > -1) {
iOutputManager.println("        if ((lTagSearchIndex = lSql.indexOf(\"$*order\")) > -1) {", true);
//ScriptWriter~~          lOrder = lOrder.trim();
iOutputManager.println("          lOrder = lOrder.trim();", true);
//ScriptWriter~~          if (lOrder.equals("")) {
iOutputManager.println("          if (lOrder.equals(\"\")) {", true);
//ScriptWriter~~            lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 7);
iOutputManager.println("            lSql = lSql.substring(0, lTagSearchIndex) + lSql.substring(lTagSearchIndex + 7);", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~            lSql = lSql.substring(0, lTagSearchIndex) + "ORDER BY " + lOrder + lSql.substring(lTagSearchIndex + 7);
iOutputManager.println("            lSql = lSql.substring(0, lTagSearchIndex) + \"ORDER BY \" + lOrder + lSql.substring(lTagSearchIndex + 7);", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        while ( (lTagSearchIndex = lSql.indexOf("$*")) > -1) {
iOutputManager.println("        while ( (lTagSearchIndex = lSql.indexOf(\"$*\")) > -1) {", true);
//ScriptWriter~~          int lSize = lSql.substring(lTagSearchIndex).indexOf(" ");
iOutputManager.println("          int lSize = lSql.substring(lTagSearchIndex).indexOf(\" \");", true);
//ScriptWriter~~          if (lSize == -1) {
iOutputManager.println("          if (lSize == -1) {", true);
//ScriptWriter~~            lSize = lSql.length();
iOutputManager.println("            lSize = lSql.length();", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~            lSize += lTagSearchIndex;
iOutputManager.println("            lSize += lTagSearchIndex;", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~          lSize = lSize;
iOutputManager.println("          lSize = lSize;", true);
//ScriptWriter~~          String lTag = lSql.substring(lTagSearchIndex+2, lSize);
iOutputManager.println("          String lTag = lSql.substring(lTagSearchIndex+2, lSize);", true);
//ScriptWriter~~          lSql = lSql.substring(0, lTagSearchIndex) + aJeo.getRequest().getPropertyValue(lTag).toString() + lSql.substring(lSize);
iOutputManager.println("          lSql = lSql.substring(0, lTagSearchIndex) + aJeo.getRequest().getPropertyValue(lTag).toString() + lSql.substring(lSize);", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        while ( (lTagSearchIndex = lSql.indexOf("$")) > -1) {
iOutputManager.println("        while ( (lTagSearchIndex = lSql.indexOf(\"$\")) > -1) {", true);
//ScriptWriter~~          int lSize = lSql.substring(lTagSearchIndex).indexOf(" ");
iOutputManager.println("          int lSize = lSql.substring(lTagSearchIndex).indexOf(\" \");", true);
//ScriptWriter~~          int lSize2 = lSql.substring(lTagSearchIndex).indexOf(".");
iOutputManager.println("          int lSize2 = lSql.substring(lTagSearchIndex).indexOf(\".\");", true);
//ScriptWriter~~          if (lSize2 > -1 && lSize2 < lSize) lSize = lSize2;
iOutputManager.println("          if (lSize2 > -1 && lSize2 < lSize) lSize = lSize2;", true);
//ScriptWriter~~          if (lSize == -1) {
iOutputManager.println("          if (lSize == -1) {", true);
//ScriptWriter~~            lSize = lSql.length();
iOutputManager.println("            lSize = lSql.length();", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~            lSize += lTagSearchIndex;
iOutputManager.println("            lSize += lTagSearchIndex;", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~          lSize = lSize;
iOutputManager.println("          lSize = lSize;", true);
//ScriptWriter~~          lSql = lSql.substring(0, lTagSearchIndex) + 
iOutputManager.println("          lSql = lSql.substring(0, lTagSearchIndex) + ", true);
//ScriptWriter~~                   getObjectPrefix(lSql.substring(lTagSearchIndex+1, lSize).toLowerCase()) + lSql.substring(lTagSearchIndex+1, lSize) +
iOutputManager.println("                   getObjectPrefix(lSql.substring(lTagSearchIndex+1, lSize).toLowerCase()) + lSql.substring(lTagSearchIndex+1, lSize) +", true);
//ScriptWriter~~                   lSql.substring(lSize);
iOutputManager.println("                   lSql.substring(lSize);", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~<%                
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
                
//ScriptWriter~~        if (<![com.esarks.arm.schemas.services.root:service:sql:statement:type]!>.equals("CallableStatement")) {
        if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement:type]").equals("CallableStatement")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        if (iMicLog.test(Log._APP)) {
iOutputManager.println("        if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~          iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!CallableStatement=" + lSql.trim());
iOutputManager.println("          iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!CallableStatement=\" + lSql.trim());", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        CallableStatement lStatement = lDbConnection.getConnection().prepareCall(lSql.trim());
iOutputManager.println("        CallableStatement lStatement = lDbConnection.getConnection().prepareCall(lSql.trim());", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        } else if (<![com.esarks.arm.schemas.services.root:service:sql:statement:type]!>.equals("PreparedStatement")) {
        } else if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement:type]").equals("PreparedStatement")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        if (iMicLog.test(Log._APP)) {
iOutputManager.println("        if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~          iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!PreparedStatement=" + lSql.trim());
iOutputManager.println("          iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!PreparedStatement=\" + lSql.trim());", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        PreparedStatement lStatement = lDbConnection.getConnection().prepareStatement(lSql.trim());
iOutputManager.println("        PreparedStatement lStatement = lDbConnection.getConnection().prepareStatement(lSql.trim());", true);
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
//ScriptWriter~~        if (iMicLog.test(Log._APP)) {
iOutputManager.println("        if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~          iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!PreparedStatement=" + lSql.trim());
iOutputManager.println("          iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!PreparedStatement=\" + lSql.trim());", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        PreparedStatement lStatement = lDbConnection.getConnection().prepareStatement(lSql.trim());
iOutputManager.println("        PreparedStatement lStatement = lDbConnection.getConnection().prepareStatement(lSql.trim());", true);
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
//ScriptWriter~~        if (aJeo.getRequest().getValueList() != null) {
iOutputManager.println("        if (aJeo.getRequest().getValueList() != null) {", true);
//ScriptWriter~~          ArrayList lValueList = aJeo.getRequest().getValueList();
iOutputManager.println("          ArrayList lValueList = aJeo.getRequest().getValueList();", true);
//ScriptWriter~~          for (int lValueListIdx=0; lValueListIdx < lValueList.size(); lValueListIdx++) {
iOutputManager.println("          for (int lValueListIdx=0; lValueListIdx < lValueList.size(); lValueListIdx++) {", true);
//ScriptWriter~~            lStatement.setString(lValueListIdx+1, (String) lValueList.get(lValueListIdx));
iOutputManager.println("            lStatement.setString(lValueListIdx+1, (String) lValueList.get(lValueListIdx));", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~        } else {
iOutputManager.println("        } else {", true);
//ScriptWriter~~          for (int lIdx=0; lIdx < lWhereList.size(); lIdx++) {
iOutputManager.println("          for (int lIdx=0; lIdx < lWhereList.size(); lIdx++) {", true);
//ScriptWriter~~            lStatement.setString(lIdx+1, ((PropertyValue) lWhereList.get(lIdx)).toString());
iOutputManager.println("            lStatement.setString(lIdx+1, ((PropertyValue) lWhereList.get(lIdx)).toString());", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        boolean lExecuteBatch = false;
//ScriptWriter~~        if (<!com.esarks.arm.schemas.services.root:service:sql:value!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql:value")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        {
iOutputManager.println("        {", true);
//ScriptWriter~~          <![com.esarks.arm.schemas.services.root:service:jeo]!> lJeox = aJeo;
iOutputManager.println("          " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:jeo]") + " lJeox = aJeo;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          String lJeoName = "lJeox";
          String lResultJeo = "com.esarks.arm.schemas.services.root:service:sql:value";
          String lJeoClassName = "";
          int lColumn = 0;
//ScriptWriter~~          while (<!" + lResultJeo + ":jeo!>!size() > 0) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo")).size() > 0) {
//ScriptWriter~~            lJeoClassName = <![" + lResultJeo + ":jeo:name]!>;
            lJeoClassName = iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]");
            boolean lIterate = false;
//ScriptWriter~~            if (<![" + lResultJeo + ":jeo:iterate]!>.equals("true")) {
            if (iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:iterate]").equals("true")) {
              lIterate = true;
              lExecuteBatch = true;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          ArrayList arrayList_<!%lJeoName!>x = <!%lJeoName!>.getJeoByInstanceName("<![" + lResultJeo + ":jeo:name]!>");
iOutputManager.println("          ArrayList arrayList_" + lJeoName + "x = " + lJeoName + ".getJeoByInstanceName(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + "\");", true);
//ScriptWriter~~          for (int idx_<!%lJeoName!>x=0; idx_<!%lJeoName!>x < arrayList_<!%lJeoName!>x.size(); idx_<!%lJeoName!>x++) {
iOutputManager.println("          for (int idx_" + lJeoName + "x=0; idx_" + lJeoName + "x < arrayList_" + lJeoName + "x.size(); idx_" + lJeoName + "x++) {", true);
//ScriptWriter~~          <![" + lResultJeo + ":jeo:name]!> <!%lJeoName!>x = (<![" + lResultJeo + ":jeo:name]!>) arrayList_<!%lJeoName!>x.get(idx_<!%lJeoName!>x);
iOutputManager.println("          " + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + " " + lJeoName + "x = (" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + ") arrayList_" + lJeoName + "x.get(idx_" + lJeoName + "x);", true);
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
//ScriptWriter~~          <![" + lResultJeo + ":jeo:name]!> <!%lJeoName!>x = (<![" + lResultJeo + ":jeo:name]!>) <!%lJeoName!>.getJeoByInstanceNameAt("<![" + lResultJeo + ":jeo:name]!>", 0);
iOutputManager.println("          " + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + " " + lJeoName + "x = (" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + ") " + lJeoName + ".getJeoByInstanceNameAt(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + "\", 0);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
            lJeoName = lJeoName + "x";
            lResultJeo = lResultJeo + ":jeo";
            Jeo lJeoInstance = null;
            try {
              Class lJeoClass = ClassLoader.getSystemClassLoader().loadClass(lJeoClassName);
              Constructor lConstructor = lJeoClass.getConstructor(new Class[]{});
              lJeoInstance = (Jeo) lConstructor.newInstance(new Object[]{});
            } catch (Exception e) {
              setContext(iScript.getMasterScript());
//ScriptWriter~~              <!$jac:event!>!set(e.getMessage() + " For class " + lJeoClassName + ".");
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage() + " For class " + lJeoClassName + ".");
//ScriptWriter~~              <!$jac:event:severity!>!set("error");
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("error");
//ScriptWriter~~              <!$jac:event:scriptPackage!>!set(iScriptPackage);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~              <!$jac:event:scriptName!>!set(iScriptName);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
              restoreContext();
            }

//ScriptWriter~~            <!" + lResultJeo + ":value!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":value")).resetIterator();
//ScriptWriter~~            while(<!" + lResultJeo + ":value!>!next()) {
            while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":value")).next()) {
//ScriptWriter~~              if (<!" + lResultJeo + ":value:property!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":value:property")).size() > 0) {
                lColumn++;
                String lPropertyGet = "toString";
                String lStatementSet = "setString";
//ScriptWriter~~                if (<!" + lResultJeo + ":value:property:get!>!size() > 0) lPropertyGet = <![" + lResultJeo + ":value:property:get]!>;
                if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":value:property:get")).size() > 0) lPropertyGet = iSymbolTable.translateProperties("[" + lResultJeo + ":value:property:get]");
//ScriptWriter~~                if (<!" + lResultJeo + ":value:property:set!>!size() > 0) lStatementSet = <![" + lResultJeo + ":value:property:set]!>;
                if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":value:property:set")).size() > 0) lStatementSet = iSymbolTable.translateProperties("[" + lResultJeo + ":value:property:set]");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          {
iOutputManager.println("          {", true);
//ScriptWriter~~            PropertyValue lPropertyValue = <!%lJeoName!>.getPropertyValue("<![" + lResultJeo + ":value:property]!>");
iOutputManager.println("            PropertyValue lPropertyValue = " + lJeoName + ".getPropertyValue(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":value:property]") + "\");", true);
//ScriptWriter~~            if (lPropertyValue.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) {
iOutputManager.println("            if (lPropertyValue.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                  if (<!" + lResultJeo + ":value:ifNull!>!size() > 0) {
                  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":value:ifNull")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              lStatement.setString(<!%lColumn!>, "<![" + lResultJeo + ":value:ifNull]!>");
iOutputManager.println("              lStatement.setString(" + lColumn + ", \"" + iSymbolTable.translateProperties("[" + lResultJeo + ":value:ifNull]") + "\");", true);
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
//ScriptWriter~~              lStatement.setNull(<!%lColumn!>, java.sql.Types.VARCHAR);
iOutputManager.println("              lStatement.setNull(" + lColumn + ", java.sql.Types.VARCHAR);", true);
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
//ScriptWriter~~            } else {
iOutputManager.println("            } else {", true);
//ScriptWriter~~              lStatement.<!%lStatementSet!>(<!%lColumn!>, lPropertyValue.<!%lPropertyGet!>());
iOutputManager.println("              lStatement." + lStatementSet + "(" + lColumn + ", lPropertyValue." + lPropertyGet + "());", true);
//ScriptWriter~~            }
iOutputManager.println("            }", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~<%             
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
             
              }
//ScriptWriter~~              if (<!" + lResultJeo + ":value:attribute!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":value:attribute")).size() > 0) {
                String lValueType = "";
//ScriptWriter~~                if (lJeoInstance != null) lValueType = lJeoInstance.getTypeByName(<![" + lResultJeo + ":value:attribute]!>);
                if (lJeoInstance != null) lValueType = lJeoInstance.getTypeByName(iSymbolTable.translateProperties("[" + lResultJeo + ":value:attribute]"));
                if (lValueType == null || lValueType.equals("")) {
//ScriptWriter~~                  String lAttributeName = <![" + lResultJeo + ":value:attribute]!>;
                  String lAttributeName = iSymbolTable.translateProperties("[" + lResultJeo + ":value:attribute]");
                  setContext(iScript.getMasterScript());
//ScriptWriter~~                  <!$jac:event!>!set("Cannot find attribute " + lAttributeName + " in Jeo " + lJeoClassName + ".");
                  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Cannot find attribute " + lAttributeName + " in Jeo " + lJeoClassName + ".");
//ScriptWriter~~                  <!$jac:event:severity!>!set("error");
                  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("error");
//ScriptWriter~~                  <!$jac:event:scriptPackage!>!set(iScriptPackage);
                  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~                  <!$jac:event:scriptName!>!set(iScriptName);
                  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
                  restoreContext();
                }
                lColumn++;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          if(<!%lJeoName!>.is<![cap@[" + lResultJeo + ":value:attribute]]!>Null()) {
iOutputManager.println("          if(" + lJeoName + ".is" + iSymbolTable.translateProperties("[cap@[" + lResultJeo + ":value:attribute]]") + "Null()) {", true);
//ScriptWriter~~            lStatement.setNull(<!%lColumn!>, java.sql.Types.VARCHAR);
iOutputManager.println("            lStatement.setNull(" + lColumn + ", java.sql.Types.VARCHAR);", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                String lTypeJdbc = getProperty("dbTypes:" + lValueType + ":jdbc");
                String lTypeProperty = getProperty("dbTypes:" + lValueType + ":jdbcProperty");
                String lCastProperty = "";
                if (lTypeProperty.equals("")) lTypeProperty = getProperty("dbTypes:" + lValueType + ":property");
                if (lTypeProperty.startsWith("(")) {
                  lCastProperty = lTypeProperty + " ";
                  lTypeProperty = "getValueObject";
                }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            lStatement.set<!%lTypeJdbc!>(<!%lColumn!>, <!%lCastProperty!><!%lJeoName!>.get<![cap@[" + lResultJeo + ":value:attribute]]!>PropertyValue().<!%lTypeProperty!>());
iOutputManager.println("            lStatement.set" + lTypeJdbc + "(" + lColumn + ", " + lCastProperty + "" + lJeoName + ".get" + iSymbolTable.translateProperties("[cap@[" + lResultJeo + ":value:attribute]]") + "PropertyValue()." + lTypeProperty + "());", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

              }
            }
            if (lIterate) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        lStatement.addBatch();
iOutputManager.println("        lStatement.addBatch();", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
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
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
       
//ScriptWriter~~        if (<!com.esarks.arm.schemas.services.root:service:sql:result!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql:result")).size() > 0) {

          iOutputManager.setDocument("createHtml");
//ScriptWriter~~          %><tr><td colspan=2>Result</td></tr><%
          {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=2>Result</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><tr><td colspan=2><table border=0 cellpadding=0 cellspacing=0><%
          {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=2><table border=0 cellpadding=0 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          iOutputManager.setDocument("");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        if (iMicLog.test(Log._APP)) {
iOutputManager.println("        if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~          java.util.Date lStopTime = new java.util.Date();
iOutputManager.println("          java.util.Date lStopTime = new java.util.Date();", true);
//ScriptWriter~~          iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!Before <![com.esarks.arm.schemas.services.root:service:sql:statement:method]!>" + "!Elapsed time = " + Long.toString(lStopTime.getTime() - lStartTime.getTime()));
iOutputManager.println("          iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!Before " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement:method]") + "\" + \"!Elapsed time = \" + Long.toString(lStopTime.getTime() - lStartTime.getTime()));", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~<%                
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
                
//ScriptWriter~~          if (<![com.esarks.arm.schemas.services.root:service:sql:statement:method]!>.equals("executeUpdate")) {
          if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement:method]").equals("executeUpdate")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        lStatement.executeUpdate();
iOutputManager.println("        lStatement.executeUpdate();", true);
//ScriptWriter~~        ResultSet lResultSet = lStatement.getResultSet();
iOutputManager.println("        ResultSet lResultSet = lStatement.getResultSet();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          } else if (<![com.esarks.arm.schemas.services.root:service:sql:statement:method]!>.equals("executeQuery")) {
          } else if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement:method]").equals("executeQuery")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        ResultSet lResultSet = lStatement.executeQuery();
iOutputManager.println("        ResultSet lResultSet = lStatement.executeQuery();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          } else if (<![com.esarks.arm.schemas.services.root:service:sql:statement:method]!>.equals("execute")) {
          } else if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement:method]").equals("execute")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        lStatement.execute();
iOutputManager.println("        lStatement.execute();", true);
//ScriptWriter~~        ResultSet lResultSet = lStatement.getResultSet();
iOutputManager.println("        ResultSet lResultSet = lStatement.getResultSet();", true);
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
//ScriptWriter~~        lStatement.execute();
iOutputManager.println("        lStatement.execute();", true);
//ScriptWriter~~        ResultSet lResultSet = lStatement.getResultSet();
iOutputManager.println("        ResultSet lResultSet = lStatement.getResultSet();", true);
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
//ScriptWriter~~        if (iMicLog.test(Log._APP)) {
iOutputManager.println("        if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~          java.util.Date lStopTime = new java.util.Date();
iOutputManager.println("          java.util.Date lStopTime = new java.util.Date();", true);
//ScriptWriter~~          iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!After <![com.esarks.arm.schemas.services.root:service:sql:statement:method]!>" + "!Elapsed time = " + Long.toString(lStopTime.getTime() - lStartTime.getTime()));
iOutputManager.println("          iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!After " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:sql:statement:method]") + "\" + \"!Elapsed time = \" + Long.toString(lStopTime.getTime() - lStartTime.getTime()));", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        if (lResultSet == null) {
iOutputManager.println("        if (lResultSet == null) {", true);
//ScriptWriter~~          aJeo.addError();
iOutputManager.println("          aJeo.addError();", true);
//ScriptWriter~~          aJeo.setErrorId("");
iOutputManager.println("          aJeo.setErrorId(\"\");", true);
//ScriptWriter~~          aJeo.setErrorLocation("<!%aXmlDefinition!> : <![com.esarks.arm.schemas.services.root:service:name]!>");
iOutputManager.println("          aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\");", true);
//ScriptWriter~~          aJeo.setErrorTitle("No ResultSet Returned");
iOutputManager.println("          aJeo.setErrorTitle(\"No ResultSet Returned\");", true);
//ScriptWriter~~          aJeo.setErrorText("No ResultSet was returned from the database request.");
iOutputManager.println("          aJeo.setErrorText(\"No ResultSet was returned from the database request.\");", true);
//ScriptWriter~~          aJeo.setErrorResolution("The application user may submit another request.");
iOutputManager.println("          aJeo.setErrorResolution(\"The application user may submit another request.\");", true);
//ScriptWriter~~          aJeo.setErrorSeverity(4);
iOutputManager.println("          aJeo.setErrorSeverity(4);", true);
//ScriptWriter~~          aJeo.getMostSevereError();
iOutputManager.println("          aJeo.getMostSevereError();", true);
//ScriptWriter~~          lStatement.close();
iOutputManager.println("          lStatement.close();", true);
//ScriptWriter~~          if (iMicLog.test(Log._APP)) {
iOutputManager.println("          if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~            java.util.Date lStopTime = new java.util.Date();
iOutputManager.println("            java.util.Date lStopTime = new java.util.Date();", true);
//ScriptWriter~~            iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!Exit method!No ResultSet was returned from the database request");
iOutputManager.println("            iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!Exit method!No ResultSet was returned from the database request\");", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~          return;
iOutputManager.println("          return;", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        if (lResultSet.next() == false) {
iOutputManager.println("        if (lResultSet.next() == false) {", true);
//ScriptWriter~~          aJeo.addError();
iOutputManager.println("          aJeo.addError();", true);
//ScriptWriter~~          aJeo.setErrorId("");
iOutputManager.println("          aJeo.setErrorId(\"\");", true);
//ScriptWriter~~          aJeo.setErrorLocation("<!%aXmlDefinition!> : <![com.esarks.arm.schemas.services.root:service:name]!>");
iOutputManager.println("          aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\");", true);
//ScriptWriter~~          aJeo.setErrorTitle("No Data Returned");
iOutputManager.println("          aJeo.setErrorTitle(\"No Data Returned\");", true);
//ScriptWriter~~          aJeo.setErrorText("No data was returned from the database request.");
iOutputManager.println("          aJeo.setErrorText(\"No data was returned from the database request.\");", true);
//ScriptWriter~~          aJeo.setErrorResolution("The application user may submit another request.");
iOutputManager.println("          aJeo.setErrorResolution(\"The application user may submit another request.\");", true);
//ScriptWriter~~          aJeo.setErrorSeverity(4);
iOutputManager.println("          aJeo.setErrorSeverity(4);", true);
//ScriptWriter~~          aJeo.getMostSevereError();
iOutputManager.println("          aJeo.getMostSevereError();", true);
//ScriptWriter~~          lResultSet.close();
iOutputManager.println("          lResultSet.close();", true);
//ScriptWriter~~          lStatement.close();
iOutputManager.println("          lStatement.close();", true);
//ScriptWriter~~          if (iMicLog.test(Log._APP)) {
iOutputManager.println("          if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~            java.util.Date lStopTime = new java.util.Date();
iOutputManager.println("            java.util.Date lStopTime = new java.util.Date();", true);
//ScriptWriter~~            iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!Exit method!No data was returned from the database request");
iOutputManager.println("            iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!Exit method!No data was returned from the database request\");", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~          return;
iOutputManager.println("          return;", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        int lResultRowsReturned = 0;
iOutputManager.println("        int lResultRowsReturned = 0;", true);
//ScriptWriter~~        {
iOutputManager.println("        {", true);
//ScriptWriter~~          <![com.esarks.arm.schemas.services.root:service:jeo]!> lJeox = aJeo;
iOutputManager.println("          " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:jeo]") + " lJeox = aJeo;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          String lJeoName = "lJeox";
          String lResultJeo = "com.esarks.arm.schemas.services.root:service:sql:result";
          int lJeoCount = 0;
//ScriptWriter~~          while (<!" + lResultJeo + ":jeo!>!size() > 0) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo")).size() > 0) {

            iOutputManager.setDocument("createHtml");               lJeoCount++;
//ScriptWriter~~            %><tr><td><table border=1  cellpadding=5 cellspacing=0><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table border=1  cellpadding=5 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            String lMapFromResultSet = "true";
//ScriptWriter~~            if (<![" + lResultJeo + ":jeo:mapFromResultSet]!>.equals("false")) lMapFromResultSet = "false";
            if (iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:mapFromResultSet]").equals("false")) lMapFromResultSet = "false";
//ScriptWriter~~            %><tr><td><![" + lResultJeo + ":jeo:name]!>; mapFromResultSet = <!%lMapFromResultSet!></td></tr><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + "; mapFromResultSet = " + lMapFromResultSet + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            iOutputManager.setDocument("");

//ScriptWriter~~            if (<!" + lResultJeo + ":jeo:jeo!>!size() == 0) break;
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo:jeo")).size() == 0) break;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          <![" + lResultJeo + ":jeo:name]!> <!%lJeoName!>x = (<![" + lResultJeo + ":jeo:name]!>) <!%lJeoName!>.getJeoByInstanceNameAt("<![" + lResultJeo + ":jeo:name]!>", 0);
iOutputManager.println("          " + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + " " + lJeoName + "x = (" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + ") " + lJeoName + ".getJeoByInstanceNameAt(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + "\", 0);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            lJeoName = lJeoName + "x";
            lResultJeo = lResultJeo + ":jeo";
          }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          do {
iOutputManager.println("          do {", true);
//ScriptWriter~~            <![" + lResultJeo + ":jeo:name]!> <!%lJeoName!>x = (<![" + lResultJeo + ":jeo:name]!>) com.esarks.jac.JeoFactory.getInstance().reserveJeo("<![" + lResultJeo + ":jeo:name]!>");
iOutputManager.println("            " + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + " " + lJeoName + "x = (" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + ") com.esarks.jac.JeoFactory.getInstance().reserveJeo(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + "\");", true);
//ScriptWriter~~            <!%lJeoName!>.addJeo(<!%lJeoName!>x);
iOutputManager.println("            " + lJeoName + ".addJeo(" + lJeoName + "x);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            if (!<![" + lResultJeo + ":jeo:mapFromResultSet]!>.equals("false")) {
            if (!iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:mapFromResultSet]").equals("false")) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            <!%lJeoName!>x.mapFromResultSet(lResultSet, true, false);
iOutputManager.println("            " + lJeoName + "x.mapFromResultSet(lResultSet, true, false);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~            if (<!" + lResultJeo + ":jeo:property!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo:property")).size() > 0) {
//ScriptWriter~~              <!" + lResultJeo + ":jeo:property!>!resetIterator();
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo:property")).resetIterator();
//ScriptWriter~~              while (<!" + lResultJeo + ":jeo:property!>!next()) {
              while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo:property")).next()) {
//ScriptWriter~~                String lJavaType = getProperty("dbTypes:" + <![" + lResultJeo + ":jeo:property:type]!> + ":java");
                String lJavaType = getProperty("dbTypes:" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:property:type]") + ":java");
//ScriptWriter~~                String lJdbcType = getProperty("dbTypes:" + <![" + lResultJeo + ":jeo:property:type]!> + ":jdbc");
                String lJdbcType = getProperty("dbTypes:" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:property:type]") + ":jdbc");

                iOutputManager.setDocument("createHtml");
//ScriptWriter~~                if (<!" + lResultJeo + ":jeo:property!>!isFirst()) {
                if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo:property")).isFirst()) {
//ScriptWriter~~                  %><tr><td><table border=1 cellpadding=5 cellspacing=0><%
                  {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table border=1 cellpadding=5 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                  %><tr><td><b>Property Name</b></td><td><b>Type</b></td><td><b>Java Type</b></td><td><b>JDBC Type</b></td></tr><%
                  {
//ScriptWriter~~~
iOutputManager.println("<tr><td><b>Property Name</b></td><td><b>Type</b></td><td><b>Java Type</b></td><td><b>JDBC Type</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                }
//ScriptWriter~~                %><tr><td><![" + lResultJeo + ":jeo:property:name]!>&nbsp;</td><td><![" + lResultJeo + ":jeo:property:type]!>&nbsp;</td><td><!%lJavaType!>&nbsp;</td><td><!%lJdbcType!>&nbsp;</td></tr><%
                {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:property:name]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:property:type]") + "&nbsp;</td><td>" + lJavaType + "&nbsp;</td><td>" + lJdbcType + "&nbsp;</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                iOutputManager.setDocument("");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              try {
iOutputManager.println("              try {", true);
//ScriptWriter~~                <!%lJavaType!> lValue = lResultSet.get<!%lJdbcType!>("<![" + lResultJeo + ":jeo:property:name]!>");
iOutputManager.println("                " + lJavaType + " lValue = lResultSet.get" + lJdbcType + "(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:property:name]") + "\");", true);
//ScriptWriter~~                if (lResultSet.wasNull()) {
iOutputManager.println("                if (lResultSet.wasNull()) {", true);
//ScriptWriter~~                  <!%lJeoName!>x.setPropertyValue("<![" + lResultJeo + ":jeo:property:name]!>", new PropertyValue());
iOutputManager.println("                  " + lJeoName + "x.setPropertyValue(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:property:name]") + "\", new PropertyValue());", true);
//ScriptWriter~~                } else {
iOutputManager.println("                } else {", true);
//ScriptWriter~~                  <!%lJeoName!>x.setPropertyValue("<![" + lResultJeo + ":jeo:property:name]!>", new PropertyValue(lValue));
iOutputManager.println("                  " + lJeoName + "x.setPropertyValue(\"" + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:property:name]") + "\", new PropertyValue(lValue));", true);
//ScriptWriter~~                }
iOutputManager.println("                }", true);
//ScriptWriter~~              } catch (Throwable e) {}
iOutputManager.println("              } catch (Throwable e) {}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                iOutputManager.setDocument("createHtml");
//ScriptWriter~~                if (<!" + lResultJeo + ":jeo:property!>!isLast()) {
                if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo:property")).isLast()) {
//ScriptWriter~~                  %></table><%
                  {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                }
                iOutputManager.setDocument("");
              }
            }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            lResultRowsReturned++;
iOutputManager.println("            lResultRowsReturned++;", true);
//ScriptWriter~~          } while (lResultSet.next());
iOutputManager.println("          } while (lResultSet.next());", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        if (iMicLog.test(Log._APP)) {
iOutputManager.println("        if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~          java.util.Date lStopTime = new java.util.Date();
iOutputManager.println("          java.util.Date lStopTime = new java.util.Date();", true);
//ScriptWriter~~          iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!Result rows returned = " + Integer.toString(lResultRowsReturned) + "!Elapsed time = " + Long.toString(lStopTime.getTime() - lStartTime.getTime()));
iOutputManager.println("          iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!Result rows returned = \" + Integer.toString(lResultRowsReturned) + \"!Elapsed time = \" + Long.toString(lStopTime.getTime() - lStartTime.getTime()));", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        lResultSet.close();
iOutputManager.println("        lResultSet.close();", true);
//ScriptWriter~~        lStatement.close();
iOutputManager.println("        lStatement.close();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


          for (int lIdx=0; lIdx < lJeoCount; lIdx++) {
            iOutputManager.setDocument("createHtml");
//ScriptWriter~~            %></td></tr></table><%
            {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            iOutputManager.setDocument("");
          }

          iOutputManager.setDocument("createHtml");
//ScriptWriter~~          %></table></td></tr><%
          {
//ScriptWriter~~~
iOutputManager.println("</table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          iOutputManager.setDocument("");

        } else {
          if (lExecuteBatch) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        lStatement.executeBatch();
iOutputManager.println("        lStatement.executeBatch();", true);
//ScriptWriter~~        lStatement.close();
iOutputManager.println("        lStatement.close();", true);
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
//ScriptWriter~~        boolean lResult = lStatement.execute();
iOutputManager.println("        boolean lResult = lStatement.execute();", true);
//ScriptWriter~~        int lUpdateCount = lStatement.getUpdateCount();
iOutputManager.println("        int lUpdateCount = lStatement.getUpdateCount();", true);
//ScriptWriter~~        if (iMicLog.test(Log._APP)) {
iOutputManager.println("        if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~          java.util.Date lStopTime = new java.util.Date();
iOutputManager.println("          java.util.Date lStopTime = new java.util.Date();", true);
//ScriptWriter~~          iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!getUpdateCount = " + Integer.toString(lUpdateCount) + "!Elapsed time = " + Long.toString(lStopTime.getTime() - lStartTime.getTime()));
iOutputManager.println("          iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!getUpdateCount = \" + Integer.toString(lUpdateCount) + \"!Elapsed time = \" + Long.toString(lStopTime.getTime() - lStartTime.getTime()));", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        aJeo.getReply().setPropertyValue("getUpdateCount", new PropertyValue(lUpdateCount));
iOutputManager.println("        aJeo.getReply().setPropertyValue(\"getUpdateCount\", new PropertyValue(lUpdateCount));", true);
//ScriptWriter~~        lStatement.close();
iOutputManager.println("        lStatement.close();", true);
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
//ScriptWriter~~      } catch (SQLException e) {
iOutputManager.println("      } catch (SQLException e) {", true);
//ScriptWriter~~        while (e != null) {
iOutputManager.println("        while (e != null) {", true);
//ScriptWriter~~          aJeo.addError();
iOutputManager.println("          aJeo.addError();", true);
//ScriptWriter~~          aJeo.setErrorId("");
iOutputManager.println("          aJeo.setErrorId(\"\");", true);
//ScriptWriter~~          aJeo.setErrorLocation("<!%aXmlDefinition!> : <![com.esarks.arm.schemas.services.root:service:name]!>");
iOutputManager.println("          aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\");", true);
//ScriptWriter~~          aJeo.setErrorTitle("Database Exception");
iOutputManager.println("          aJeo.setErrorTitle(\"Database Exception\");", true);
//ScriptWriter~~          aJeo.setErrorText("A database exception was caught: " + e.getMessage());
iOutputManager.println("          aJeo.setErrorText(\"A database exception was caught: \" + e.getMessage());", true);
//ScriptWriter~~          aJeo.setErrorResolution("The application user may evaluate the conditions that caused this problem, and may need to escalate the problem to technical support.");
iOutputManager.println("          aJeo.setErrorResolution(\"The application user may evaluate the conditions that caused this problem, and may need to escalate the problem to technical support.\");", true);
//ScriptWriter~~          aJeo.setErrorSeverity(3);
iOutputManager.println("          aJeo.setErrorSeverity(3);", true);
//ScriptWriter~~          aJeo.getMostSevereError();
iOutputManager.println("          aJeo.getMostSevereError();", true);
//ScriptWriter~~          if (iMicLog.test(Log._ERR)) {
iOutputManager.println("          if (iMicLog.test(Log._ERR)) {", true);
//ScriptWriter~~            iMicLog.println(Log._ERR, "ERR-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!Exception caught!" + e.getMessage());
iOutputManager.println("            iMicLog.println(Log._ERR, \"ERR-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!Exception caught!\" + e.getMessage());", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~  
iOutputManager.println("  ", true);
//ScriptWriter~~          if (aJeo.getSuppressException() == false) {
iOutputManager.println("          if (aJeo.getSuppressException() == false) {", true);
//ScriptWriter~~            com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
iOutputManager.println("            com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();", true);
//ScriptWriter~~            com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
iOutputManager.println("            com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo(\"detail\");", true);
//ScriptWriter~~            lExceptionServiceJeo.addJeo(lExceptionJeo);
iOutputManager.println("            lExceptionServiceJeo.addJeo(lExceptionJeo);", true);
//ScriptWriter~~            java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
iOutputManager.println("            java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());", true);
//ScriptWriter~~            lExceptionJeo.setTime(lExceptionTimestamp);
iOutputManager.println("            lExceptionJeo.setTime(lExceptionTimestamp);", true);
//ScriptWriter~~            lExceptionJeo.setModule("<!%aXmlDefinition!> : <![com.esarks.arm.schemas.services.root:name]!>");
iOutputManager.println("            lExceptionJeo.setModule(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + "\");", true);
//ScriptWriter~~            lExceptionJeo.setMethod("<![com.esarks.arm.schemas.services.root:service:name]!>");
iOutputManager.println("            lExceptionJeo.setMethod(\"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\");", true);
//ScriptWriter~~            lExceptionJeo.setSeverity("unknown");
iOutputManager.println("            lExceptionJeo.setSeverity(\"unknown\");", true);
//ScriptWriter~~            lExceptionJeo.setLocation("");
iOutputManager.println("            lExceptionJeo.setLocation(\"\");", true);
//ScriptWriter~~            lExceptionJeo.setDescription(e.getMessage());
iOutputManager.println("            lExceptionJeo.setDescription(e.getMessage());", true);
//ScriptWriter~~            lExceptionJeo.setAction("unknown");
iOutputManager.println("            lExceptionJeo.setAction(\"unknown\");", true);
//ScriptWriter~~            lExceptionJeo.setResolution("unknown");
iOutputManager.println("            lExceptionJeo.setResolution(\"unknown\");", true);
//ScriptWriter~~      
iOutputManager.println("      ", true);
//ScriptWriter~~            StackTraceElement[] lStackTraceElements = e.getStackTrace();
iOutputManager.println("            StackTraceElement[] lStackTraceElements = e.getStackTrace();", true);
//ScriptWriter~~            for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
iOutputManager.println("            for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {", true);
//ScriptWriter~~              com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
iOutputManager.println("              com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo(\"trace\");", true);
//ScriptWriter~~              lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
iOutputManager.println("              lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());", true);
//ScriptWriter~~              lExceptionJeo.addJeo(lStackExceptionJeo);
iOutputManager.println("              lExceptionJeo.addJeo(lStackExceptionJeo);", true);
//ScriptWriter~~            }
iOutputManager.println("            }", true);
//ScriptWriter~~      
iOutputManager.println("      ", true);
//ScriptWriter~~            iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception_" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});
iOutputManager.println("            iScript.execMethod(\"com.esarks.arm.logging.ExceptionRpt\", \"render\", new Object[]{\"logs.Exception_\" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~          e = e.getNextException();
iOutputManager.println("          e = e.getNextException();", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        return;
iOutputManager.println("        return;", true);
//ScriptWriter~~      } catch (Throwable e) {
iOutputManager.println("      } catch (Throwable e) {", true);
//ScriptWriter~~        aJeo.addError();
iOutputManager.println("        aJeo.addError();", true);
//ScriptWriter~~        aJeo.setErrorId("");
iOutputManager.println("        aJeo.setErrorId(\"\");", true);
//ScriptWriter~~        aJeo.setErrorLocation("<!%aXmlDefinition!> : <![com.esarks.arm.schemas.services.root:service:name]!>");
iOutputManager.println("        aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\");", true);
//ScriptWriter~~        aJeo.setErrorTitle("Database Exception");
iOutputManager.println("        aJeo.setErrorTitle(\"Database Exception\");", true);
//ScriptWriter~~        aJeo.setErrorText("A database exception was caught: " + e.getMessage());
iOutputManager.println("        aJeo.setErrorText(\"A database exception was caught: \" + e.getMessage());", true);
//ScriptWriter~~        aJeo.setErrorResolution("The application user may evaluate the conditions that caused this problem, and may need to escalate the problem to technical support.");
iOutputManager.println("        aJeo.setErrorResolution(\"The application user may evaluate the conditions that caused this problem, and may need to escalate the problem to technical support.\");", true);
//ScriptWriter~~        aJeo.setErrorSeverity(3);
iOutputManager.println("        aJeo.setErrorSeverity(3);", true);
//ScriptWriter~~        aJeo.getMostSevereError();
iOutputManager.println("        aJeo.getMostSevereError();", true);
//ScriptWriter~~        if (iMicLog.test(Log._ERR)) {
iOutputManager.println("        if (iMicLog.test(Log._ERR)) {", true);
//ScriptWriter~~          iMicLog.println(Log._ERR, "ERR-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!Exception caught!" + e.getMessage());
iOutputManager.println("          iMicLog.println(Log._ERR, \"ERR-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!Exception caught!\" + e.getMessage());", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~        if (aJeo.getSuppressException() == false) {
iOutputManager.println("        if (aJeo.getSuppressException() == false) {", true);
//ScriptWriter~~          com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
iOutputManager.println("          com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();", true);
//ScriptWriter~~          com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
iOutputManager.println("          com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo(\"detail\");", true);
//ScriptWriter~~          lExceptionServiceJeo.addJeo(lExceptionJeo);
iOutputManager.println("          lExceptionServiceJeo.addJeo(lExceptionJeo);", true);
//ScriptWriter~~          java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
iOutputManager.println("          java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());", true);
//ScriptWriter~~          lExceptionJeo.setTime(lExceptionTimestamp);
iOutputManager.println("          lExceptionJeo.setTime(lExceptionTimestamp);", true);
//ScriptWriter~~          lExceptionJeo.setModule("<!%aXmlDefinition!> : <![com.esarks.arm.schemas.services.root:name]!>");
iOutputManager.println("          lExceptionJeo.setModule(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + "\");", true);
//ScriptWriter~~          lExceptionJeo.setMethod("<![com.esarks.arm.schemas.services.root:service:name]!>");
iOutputManager.println("          lExceptionJeo.setMethod(\"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\");", true);
//ScriptWriter~~          lExceptionJeo.setSeverity("unknown");
iOutputManager.println("          lExceptionJeo.setSeverity(\"unknown\");", true);
//ScriptWriter~~          lExceptionJeo.setLocation("");
iOutputManager.println("          lExceptionJeo.setLocation(\"\");", true);
//ScriptWriter~~          lExceptionJeo.setDescription(e.getMessage());
iOutputManager.println("          lExceptionJeo.setDescription(e.getMessage());", true);
//ScriptWriter~~          lExceptionJeo.setAction("unknown");
iOutputManager.println("          lExceptionJeo.setAction(\"unknown\");", true);
//ScriptWriter~~          lExceptionJeo.setResolution("unknown");
iOutputManager.println("          lExceptionJeo.setResolution(\"unknown\");", true);
//ScriptWriter~~    
iOutputManager.println("    ", true);
//ScriptWriter~~          StackTraceElement[] lStackTraceElements = e.getStackTrace();
iOutputManager.println("          StackTraceElement[] lStackTraceElements = e.getStackTrace();", true);
//ScriptWriter~~          for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
iOutputManager.println("          for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {", true);
//ScriptWriter~~            com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
iOutputManager.println("            com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo(\"trace\");", true);
//ScriptWriter~~            lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
iOutputManager.println("            lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());", true);
//ScriptWriter~~            lExceptionJeo.addJeo(lStackExceptionJeo);
iOutputManager.println("            lExceptionJeo.addJeo(lStackExceptionJeo);", true);
//ScriptWriter~~          }    
iOutputManager.println("          }    ", true);
//ScriptWriter~~          iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception_" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});
iOutputManager.println("          iScript.execMethod(\"com.esarks.arm.logging.ExceptionRpt\", \"render\", new Object[]{\"logs.Exception_\" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        return;
iOutputManager.println("        return;", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      }  // <!com.esarks.arm.schemas.services.root:service:sql!> loop
      }  // iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql") loop
//ScriptWriter~~      }  // if (<!com.esarks.arm.schemas.services.root:service:sql!>!size() > 0) {
      }  // if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service:sql")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      aJeo.addError();
iOutputManager.println("      aJeo.addError();", true);
//ScriptWriter~~      aJeo.setErrorId("");
iOutputManager.println("      aJeo.setErrorId(\"\");", true);
//ScriptWriter~~      aJeo.setErrorLocation("<!%aXmlDefinition!> : <![com.esarks.arm.schemas.services.root:service:name]!>");
iOutputManager.println("      aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\");", true);
//ScriptWriter~~      aJeo.setErrorTitle("Success");
iOutputManager.println("      aJeo.setErrorTitle(\"Success\");", true);
//ScriptWriter~~      aJeo.setErrorText("The service completed successfully.");
iOutputManager.println("      aJeo.setErrorText(\"The service completed successfully.\");", true);
//ScriptWriter~~      aJeo.setErrorResolution("This is a notification of successful completion that requires no resolution.");
iOutputManager.println("      aJeo.setErrorResolution(\"This is a notification of successful completion that requires no resolution.\");", true);
//ScriptWriter~~      aJeo.setErrorSeverity(10);
iOutputManager.println("      aJeo.setErrorSeverity(10);", true);
//ScriptWriter~~      aJeo.getMostSevereError();
iOutputManager.println("      aJeo.getMostSevereError();", true);
//ScriptWriter~~      if (iMicLog.test(Log._APP)) {
iOutputManager.println("      if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~        java.util.Date lStopTime = new java.util.Date();
iOutputManager.println("        java.util.Date lStopTime = new java.util.Date();", true);
//ScriptWriter~~        iMicLog.println(Log._APP, "APP-<![com.esarks.arm.schemas.services.root:name]!>:<![com.esarks.arm.schemas.services.root:service:name]!>" + "!Normal return!Elapsed time = " + Long.toString(lStopTime.getTime() - lStartTime.getTime()));
iOutputManager.println("        iMicLog.println(Log._APP, \"APP-" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]") + ":" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:service:name]") + "\" + \"!Normal return!Elapsed time = \" + Long.toString(lStopTime.getTime() - lStartTime.getTime()));", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("");

//ScriptWriter~~    } // while (<!com.esarks.arm.schemas.services.root:service!>!next()) {
    } // while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.services.root:service")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  private String getObjectPrefix(String aObjectName) {
iOutputManager.println("  private String getObjectPrefix(String aObjectName) {", true);
//ScriptWriter~~    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
iOutputManager.println("    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();", true);
//ScriptWriter~~    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(aObjectName.toLowerCase());
iOutputManager.println("    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(aObjectName.toLowerCase());", true);
//ScriptWriter~~    if (lDbConnection == null) {
iOutputManager.println("    if (lDbConnection == null) {", true);
//ScriptWriter~~      if (iMicLog.test(Log._APP)) {
iOutputManager.println("      if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~        iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":getObjectPrefix(" + aObjectName + ")!Object name not in known list.");
iOutputManager.println("        iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":getObjectPrefix(\" + aObjectName + \")!Object name not in known list.\");", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~      return "";
iOutputManager.println("      return \"\";", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    return lDbConnection.getPrefix();    
iOutputManager.println("    return lDbConnection.getPrefix();    ", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
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
//ScriptWriter~~      Merge.getInstance().doMerge(path(<![com.esarks.arm.schemas.services.root:name]!>) + ".script", path(<![com.esarks.arm.schemas.services.root:name]!>) + ".new", iScript.getMasterScript());
      Merge.getInstance().doMerge(path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]")) + ".script", path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.services.root:name]")) + ".new", iScript.getMasterScript());

      StringBuffer lStringBuffer1 = iOutputManager.getDocument("createHtml");
  
      if (openOutput(path(aXmlDefinition) + ".html")) {
//ScriptWriter~~        %><!%lStringBuffer1.toString()!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer1.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %></html><%
        {
//ScriptWriter~~~
iOutputManager.println("</html>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        closeOutput();
      }

      if (Merge.getInstance().getExceptionMessage() != null) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set(Merge.getInstance().getExceptionMessage());
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(Merge.getInstance().getExceptionMessage());
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
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

  }

  private void parseXmlDefinition(String aXmlDefinition) {
    XmlSchemaFactory lXmlSchemaFactory = iSymbolTable.getXmlSchemaFactory();
    if (lXmlSchemaFactory.getXmlSchemaElement("com.esarks.arm.schemas.services.root") == null) {
      loadXmlSchema("com.esarks.arm.schemas.services", path("com.esarks.arm.schemas.ServicesSchema") + ".xml");
    }
    parseXmlSchema(aXmlDefinition);
  }
}
