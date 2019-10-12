//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.model;

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
public class GenerateService extends com.esarks.mic.Component {

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

//ScriptWriter~~    <!services!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
//ScriptWriter~~    if (<!services!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services")).size() == 0) {
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
        
    try {
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
//ScriptWriter~~      File lNewFile = new File(path(<![services:name]!>) + ".script");
      File lNewFile = new File(path(iSymbolTable.translateProperties("[services:name]")) + ".script");
      // next if statement blocked by "false"
      if (false && lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() > lXmlFile.lastModified()) {
//ScriptWriter~~        String lServicesName = <![services:name]!>;
        String lServicesName = iSymbolTable.translateProperties("[services:name]");
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

//ScriptWriter~~    if (!openOutput(path(<![services:name]!>) + ".xml")) {
    if (!openOutput(path(iSymbolTable.translateProperties("[services:name]")) + ".xml")) {
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(<![services:name]!>) + ".xml file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(iSymbolTable.translateProperties("[services:name]")) + ".xml file for output.");
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
    
//ScriptWriter~~    if (!openOutput(path(<![services:name]!>) + ".new")) {
    if (!openOutput(path(iSymbolTable.translateProperties("[services:name]")) + ".new")) {
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(<![services:name]!>) + ".new file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(iSymbolTable.translateProperties("[services:name]")) + ".new file for output.");
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


//ScriptWriter~~    <!services:service!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service")).resetIterator();
//ScriptWriter~~    while (<!services:service!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    public void <![services:service:name]!>(<![services:service:jeo]!> aJeo) {
iOutputManager.println("    public void " + iSymbolTable.translateProperties("[services:service:name]") + "(" + iSymbolTable.translateProperties("[services:service:jeo]") + " aJeo) {", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      Log lLog = Log.getInstance();
iOutputManager.println("      Log lLog = Log.getInstance();", true);
//ScriptWriter~~      if (lLog.test(Log._DEBUG))
iOutputManager.println("      if (lLog.test(Log._DEBUG))", true);
//ScriptWriter~~        iLog.println(Log._DEBUG, "Enter <![services:name]!>.<![services:service:name]!>" + "!");
iOutputManager.println("        iLog.println(Log._DEBUG, \"Enter " + iSymbolTable.translateProperties("[services:name]") + "." + iSymbolTable.translateProperties("[services:service:name]") + "\" + \"!\");", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%  
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
  

//ScriptWriter~~      if (<!services:service:sql!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql")).size() > 0) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      DbConnection lDbConnection = getDbConnection();
iOutputManager.println("      DbConnection lDbConnection = getDbConnection();", true);
//ScriptWriter~~      if (lDbConnection == null) {
iOutputManager.println("      if (lDbConnection == null) {", true);
//ScriptWriter~~        aJeo.addError();
iOutputManager.println("        aJeo.addError();", true);
//ScriptWriter~~        aJeo.setErrorId("");
iOutputManager.println("        aJeo.setErrorId(\"\");", true);
//ScriptWriter~~        aJeo.setErrorLocation("<!%aXmlDefinition!> : <![services:service:name]!>");
iOutputManager.println("        aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[services:service:name]") + "\");", true);
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
//ScriptWriter~~        return;
iOutputManager.println("        return;", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      try {
iOutputManager.println("      try {", true);
//ScriptWriter~~        String lWhere = "";
iOutputManager.println("        String lWhere = \"\";", true);
//ScriptWriter~~        ArrayList lWhereList = new ArrayList();
iOutputManager.println("        ArrayList lWhereList = new ArrayList();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!services:service:sql:orderBy!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql:orderBy")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        String lOrder = "<![services:service:sql:orderBy]!>";
iOutputManager.println("        String lOrder = \"" + iSymbolTable.translateProperties("[services:service:sql:orderBy]") + "\";", true);
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
//ScriptWriter~~        if (<!services:service:sql:procedure!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql:procedure")).size() > 0) {
//ScriptWriter~~          lProcedure = <![services:service:sql:procedure]!>;
          lProcedure = iSymbolTable.translateProperties("[services:service:sql:procedure]");
        } else {
//ScriptWriter~~          lProcedure = <![services:service:sql:statement]!>;
          lProcedure = iSymbolTable.translateProperties("[services:service:sql:statement]");
        }
        boolean lSkipSpace = true;
        for (int lIdx=0; lIdx < lProcedure.length(); lIdx++) {
          if (lProcedure.charAt(lIdx) <= ' ') {
            if (lSkipSpace == true) continue;
            lSkipSpace = true;
            lCompact = lCompact.concat(" ");
            continue;
          }
          lSkipSpace = false;
          lCompact = lCompact.concat(lProcedure.substring(lIdx, lIdx+1));
        }

//        for (int lIdx=0; lIdx < lProcedure.length(); lIdx++) {
//          if (lProcedure.charAt(lIdx) < ' ') lProcedure = lProcedure.replace(lProcedure.charAt(lIdx), ' ');
//        }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        String lSql = "<!%lCompact!>";
iOutputManager.println("        String lSql = \"" + lCompact + "\";", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~        <!services:service:sql:where!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql:where")).resetIterator();
//ScriptWriter~~        while (<!services:service:sql:where!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql:where")).next()) {
//ScriptWriter~~          if (!<!services:service:sql:where!>!isFirst()) {
          if (!iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql:where")).isFirst()) {
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
//ScriptWriter~~          <![services:service:jeo]!> lJeox = aJeo;
iOutputManager.println("          " + iSymbolTable.translateProperties("[services:service:jeo]") + " lJeox = aJeo;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          String lJeoName = "lJeox";
          String lResultJeo = "services:service:sql:where";
//ScriptWriter~~          while (<!" + lResultJeo + ":jeo!>!size() > 0) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo")).size() > 0) {
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
//ScriptWriter~~            if (<![" + lResultJeo + ":where:skipIfNull]!>.equals("true")) {
            if (iSymbolTable.translateProperties("[" + lResultJeo + ":where:skipIfNull]").equals("true")) {
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
//ScriptWriter~~            if (lPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL) {
iOutputManager.println("            if (lPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL) {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

              }
//ScriptWriter~~              if (<!" + lResultJeo + ":where:attribute!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":where:attribute")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          {
iOutputManager.println("          {", true);
//ScriptWriter~~            if(!<!%lJeoName!>.is<![cap@[" + lResultJeo + ":where:attribute]]!>Null()) {
iOutputManager.println("            if(!" + lJeoName + ".is" + iSymbolTable.translateProperties("[cap@[" + lResultJeo + ":where:attribute]]") + "Null()) {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

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
//ScriptWriter~~<%                
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
                
//ScriptWriter~~        if (<!services:service:sql:procedure!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql:procedure")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        if (lWhere.trim().length() > 0) lWhere = " WHERE " + lWhere.trim();
iOutputManager.println("        if (lWhere.trim().length() > 0) lWhere = \" WHERE \" + lWhere.trim();", true);
//ScriptWriter~~        if (lOrder.trim().length() > 0) lOrder = " ORDER BY " + lOrder.trim();
iOutputManager.println("        if (lOrder.trim().length() > 0) lOrder = \" ORDER BY \" + lOrder.trim();", true);
//ScriptWriter~~        CallableStatement lStatement = lDbConnection.getConnection().prepareCall(lSql.trim() + " " + lWhere.trim() + " " + lOrder.trim());
iOutputManager.println("        CallableStatement lStatement = lDbConnection.getConnection().prepareCall(lSql.trim() + \" \" + lWhere.trim() + \" \" + lOrder.trim());", true);
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
//ScriptWriter~~        if (lWhere.trim().length() > 0) lWhere = " WHERE " + lWhere.trim();
iOutputManager.println("        if (lWhere.trim().length() > 0) lWhere = \" WHERE \" + lWhere.trim();", true);
//ScriptWriter~~        if (lOrder.trim().length() > 0) lOrder = " ORDER BY " + lOrder.trim();
iOutputManager.println("        if (lOrder.trim().length() > 0) lOrder = \" ORDER BY \" + lOrder.trim();", true);
//ScriptWriter~~        PreparedStatement lStatement = lDbConnection.getConnection().prepareStatement(lSql.trim() + " " + lWhere.trim() + " " + lOrder.trim());
iOutputManager.println("        PreparedStatement lStatement = lDbConnection.getConnection().prepareStatement(lSql.trim() + \" \" + lWhere.trim() + \" \" + lOrder.trim());", true);
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
//ScriptWriter~~        for (int lIdx=0; lIdx < lWhereList.size(); lIdx++) {
iOutputManager.println("        for (int lIdx=0; lIdx < lWhereList.size(); lIdx++) {", true);
//ScriptWriter~~          lStatement.setString(lIdx+1, ((PropertyValue) lWhereList.get(lIdx)).toString());
iOutputManager.println("          lStatement.setString(lIdx+1, ((PropertyValue) lWhereList.get(lIdx)).toString());", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        boolean lExecuteBatch = false;
//ScriptWriter~~        if (<!services:service:sql:value!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql:value")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        {
iOutputManager.println("        {", true);
//ScriptWriter~~          <![services:service:jeo]!> lJeox = aJeo;
iOutputManager.println("          " + iSymbolTable.translateProperties("[services:service:jeo]") + " lJeox = aJeo;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          String lJeoName = "lJeox";
          String lResultJeo = "services:service:sql:value";
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

                if (lValueType != null && lValueType.equals("date")) {
//ScriptWriter~~//                lStatement.setTimestamp(<!%lColumn!>, new java.sql.Timestamp(<!%lJeoName!>.get<![cap@[" + lResultJeo + ":value:attribute]]!>().getTime()));
//                lStatement.setTimestamp(iSymbolTable.translateProperties(lColumn), new java.sql.Timestamp(iSymbolTable.translateProperties(lJeoName).getiSymbolTable.translateProperties("[cap@[" + lResultJeo + ":value:attribute]]")().getTime()));
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            lStatement.setString(<!%lColumn!>, <!%lJeoName!>.get<![cap@[" + lResultJeo + ":value:attribute]]!>PropertyValue().toString());
iOutputManager.println("            lStatement.setString(" + lColumn + ", " + lJeoName + ".get" + iSymbolTable.translateProperties("[cap@[" + lResultJeo + ":value:attribute]]") + "PropertyValue().toString());", true);
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
//ScriptWriter~~            lStatement.setString(<!%lColumn!>, <!%lJeoName!>.get<![cap@[" + lResultJeo + ":value:attribute]]!>PropertyValue().toString());
iOutputManager.println("            lStatement.setString(" + lColumn + ", " + lJeoName + ".get" + iSymbolTable.translateProperties("[cap@[" + lResultJeo + ":value:attribute]]") + "PropertyValue().toString());", true);
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

//ScriptWriter~~        if (<!services:service:sql:result!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql:result")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        ResultSet lResultSet = lStatement.executeQuery();
iOutputManager.println("        ResultSet lResultSet = lStatement.executeQuery();", true);
//ScriptWriter~~        if (lResultSet.next() == false) {
iOutputManager.println("        if (lResultSet.next() == false) {", true);
//ScriptWriter~~          aJeo.addError();
iOutputManager.println("          aJeo.addError();", true);
//ScriptWriter~~          aJeo.setErrorId("");
iOutputManager.println("          aJeo.setErrorId(\"\");", true);
//ScriptWriter~~          aJeo.setErrorLocation("<!%aXmlDefinition!> : <![services:service:name]!>");
iOutputManager.println("          aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[services:service:name]") + "\");", true);
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
//ScriptWriter~~          return;
iOutputManager.println("          return;", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        {
iOutputManager.println("        {", true);
//ScriptWriter~~          <![services:service:jeo]!> lJeox = aJeo;
iOutputManager.println("          " + iSymbolTable.translateProperties("[services:service:jeo]") + " lJeox = aJeo;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          String lJeoName = "lJeox";
          String lResultJeo = "services:service:sql:result";
//ScriptWriter~~          while (<!" + lResultJeo + ":jeo!>!size() > 0) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lResultJeo + ":jeo")).size() > 0) {
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
//ScriptWriter~~            <![" + lResultJeo + ":jeo:name]!> <!%lJeoName!>x = new <![" + lResultJeo + ":jeo:name]!>();
iOutputManager.println("            " + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + " " + lJeoName + "x = new " + iSymbolTable.translateProperties("[" + lResultJeo + ":jeo:name]") + "();", true);
//ScriptWriter~~            <!%lJeoName!>.addJeo(<!%lJeoName!>x);
iOutputManager.println("            " + lJeoName + ".addJeo(" + lJeoName + "x);", true);
//ScriptWriter~~            <!%lJeoName!>x.mapFromResultSet(lResultSet, true, true);
iOutputManager.println("            " + lJeoName + "x.mapFromResultSet(lResultSet, true, true);", true);
//ScriptWriter~~          } while (lResultSet.next());
iOutputManager.println("          } while (lResultSet.next());", true);
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
//ScriptWriter~~      } catch (Throwable e) {
iOutputManager.println("      } catch (Throwable e) {", true);
//ScriptWriter~~        aJeo.addError();
iOutputManager.println("        aJeo.addError();", true);
//ScriptWriter~~        aJeo.setErrorId("");
iOutputManager.println("        aJeo.setErrorId(\"\");", true);
//ScriptWriter~~        aJeo.setErrorLocation("<!%aXmlDefinition!> : <![services:service:name]!>");
iOutputManager.println("        aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[services:service:name]") + "\");", true);
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
//ScriptWriter~~        return;
iOutputManager.println("        return;", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      }  // if (<!services:service:sql!>!size() > 0) {
      }  // if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service:sql")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      aJeo.addError();
iOutputManager.println("      aJeo.addError();", true);
//ScriptWriter~~      aJeo.setErrorId("");
iOutputManager.println("      aJeo.setErrorId(\"\");", true);
//ScriptWriter~~      aJeo.setErrorLocation("<!%aXmlDefinition!> : <![services:service:name]!>");
iOutputManager.println("      aJeo.setErrorLocation(\"" + aXmlDefinition + " : " + iSymbolTable.translateProperties("[services:service:name]") + "\");", true);
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
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    } // while (<!services:service!>!next()) {
    } // while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("services:service")).next()) {
  
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
//ScriptWriter~~      Merge.getInstance().doMerge(path(<![services:name]!>) + ".script", path(<![services:name]!>) + ".new", iScript.getMasterScript());
      Merge.getInstance().doMerge(path(iSymbolTable.translateProperties("[services:name]")) + ".script", path(iSymbolTable.translateProperties("[services:name]")) + ".new", iScript.getMasterScript());
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
}
