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

import  java.awt.*;
import  javax.swing.*;
//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class GenerateDtable extends com.esarks.mic.Component  {

private boolean iReverseMerge = true;
private String iFileSeparator = System.getProperty("file.separator");

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected GenerateDtable() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public GenerateDtable(Script aScript) {

    super(aScript);

  }

  public void generateDtable(String aXmlDefinition) {
    resetExit();
    try {
//ScriptWriter~~%>generateDtable: <!%aXmlDefinition!>
{
//ScriptWriter~~~
iOutputManager.println("generateDtable: " + aXmlDefinition + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    parseXmlPath(path(aXmlDefinition) + ".xml");

//ScriptWriter~~    if (<!com.esarks.arm.schemas.rules.root!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root")).size() == 0) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Could not find <com.esarks.arm.schemas.rules.root> tag in " + path(aXmlDefinition) + ".xml file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Could not find <com.esarks.arm.schemas.rules.root> tag in " + path(aXmlDefinition) + ".xml file.");
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
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateDtable") + ".new");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
//ScriptWriter~~      File lNewFile = new File(path(<![com.esarks.arm.schemas.rules.root:name]!>) + ".script");
      File lNewFile = new File(path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:name]")) + ".script");
      if (lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          lGeneratorFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) {
//ScriptWriter~~        String lReportName = <![com.esarks.arm.schemas.rules.root:name]!>;
        String lReportName = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:name]");
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
//ScriptWriter~~    String lHomePath = <![$jac:path:home]!>;
    String lHomePath = iSymbolTable.translateProperties("[$jac:path:home]");
//ScriptWriter~~    String lWorkPath = <![$jac:path:work]!>;
    String lWorkPath = iSymbolTable.translateProperties("[$jac:path:work]");
//ScriptWriter~~    String lScriptPath = <![$jac:path:scripts]!>;
    String lScriptPath = iSymbolTable.translateProperties("[$jac:path:scripts]");
    restoreContext();
    String lPackageName = "";
    String lPackagePath = "";
//ScriptWriter~~    String aScriptName = <![com.esarks.arm.schemas.rules.root:name]!>;
    String aScriptName = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:name]");
    String lScriptName = aScriptName;

    {
        int lLastDot = -1;
        for (int lIdx = aScriptName.length() - 1; lIdx >= 0; lIdx--) {
            if (aScriptName.charAt(lIdx) == '.') {
                lLastDot = lIdx;
                break;
            }
        }

        if (lLastDot > -1) {
            lPackageName = aScriptName.substring(0, lLastDot);
            lPackagePath = lPackageName;
            lScriptName = aScriptName.substring(lLastDot + 1);
        }

        int lIdx = lPackagePath.indexOf(".");
        while (lIdx > -1) {
            lPackagePath = lPackagePath.substring(0,lIdx) + iFileSeparator + lPackagePath.substring(lIdx+1);
            lIdx = lPackagePath.indexOf(".");
        }
    }


    File lPrimarySourceFile = new File(lScriptPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".script");
    if (lPrimarySourceFile.exists()) {
        try {
            File lJavaFile = new File(lWorkPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".java");

            if (iReverseMerge == false && lJavaFile.exists() && lJavaFile.lastModified() > lPrimarySourceFile.lastModified()) lJavaFile.setLastModified(lPrimarySourceFile.lastModified());

            if (iReverseMerge && lJavaFile.exists() && lJavaFile.lastModified() > lPrimarySourceFile.lastModified()) {

                boolean lReverseMergeThisFile = false;
                java.awt.Frame lFrame = new java.awt.Frame();
                int lResult = JOptionPane.showConfirmDialog(lFrame, "Do you want to Reverse Merge " + lPrimarySourceFile.getName() + "?");
                switch (lResult) {
                    case JOptionPane.YES_OPTION:
                        lReverseMergeThisFile = true;
                        break;
                    case JOptionPane.NO_OPTION:
                        lJavaFile.setLastModified(lPrimarySourceFile.lastModified());
                        lReverseMergeThisFile = false;
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        lJavaFile.setLastModified(lPrimarySourceFile.lastModified());
                        lReverseMergeThisFile = false;
                        iReverseMerge = false;
                        break;
                }
                lFrame.dispose();

                if (lReverseMergeThisFile) {
                    if (!iOutputManager.isJspOpen()) iOutputManager.println("Reverse Merging " + lPrimarySourceFile.getName(), true);
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:sectionMarker", new PropertyValue("//$Sec" + "tion="));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:preserveMarker", new PropertyValue("$Pres" + "erve=yes"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:noPreserveMarker", new PropertyValue("$Pres" + "erve=no"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:keepPreserveMarker", new PropertyValue("$Pres" + "erve=keep"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:discardPreserveMarker", new PropertyValue("$Pres" + "erve=discard"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:preservePreamble", new PropertyValue("no"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:comments", new PropertyValue("//"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:commentsBegin", new PropertyValue("/*"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:commentsEnd", new PropertyValue("*/"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:reverseMergeMarker", new PropertyValue("$Reverse" + "Merge=yes"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:reverseMergeNoPreserveMarker", new PropertyValue("$Reverse" + "Merge=no"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:excludeCompare", new PropertyValue("//  Gener" + "ated at"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:trimOutput", new PropertyValue("yes"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:keepSections", new PropertyValue("no"));
                    Merge.getInstance().doMergeToExisting(lPrimarySourceFile.getAbsolutePath(), lJavaFile.getAbsolutePath(), iScript);
//                      lJavaFile.setLastModified(lPrimarySourceFile.lastModified());
                }
            }
        } catch (Exception e) {if (!iOutputManager.isJspOpen()) iOutputManager.println(e.getMessage(), true);
                               if (!iOutputManager.isJspOpen()) iOutputManager.println("Error in ReverseMerge.", true);}
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
//ScriptWriter~~    <!$jac:merge:preservePreamble!>!reset("yes");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preservePreamble")).reset("yes");
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

//ScriptWriter~~    openOutput(path(<![com.esarks.arm.schemas.rules.root:name]!>) + ".html");
    openOutput(path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:name]")) + ".html");

//ScriptWriter~~    %><html><%
    {
//ScriptWriter~~~
iOutputManager.println("<html>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><table border=1 cellpadding=2 cellspacing=0><%
    {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=2 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td><table width="100%" border="1" cellpadding="2" cellspacing="0"><tr><td><b><![com.esarks.arm.schemas.rules.root:title]!></b> (<![com.esarks.arm.schemas.rules.root:name]!>)<%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table width=\"100%\" border=\"1\" cellpadding=\"2\" cellspacing=\"0\"><tr><td><b>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:title]") + "</b> (" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:name]") + ")", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></td></tr></table></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr bgcolor="#ccccff"><td><b>Rule Controller:</b></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr bgcolor=\"#ccccff\"><td><b>Rule Controller:</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td><![com.esarks.arm.schemas.rules.root:text]!><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:text]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></table><%
    {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><p><i>List of Decision Tables:</i><%
    {
//ScriptWriter~~~
iOutputManager.println("<p><i>List of Decision Tables:</i>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><ul><%
    {
//ScriptWriter~~~
iOutputManager.println("<ul>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!com.esarks.arm.schemas.rules.root:dtable!>& {
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable")).next())  {
//ScriptWriter~~      %><li><![com.esarks.arm.schemas.rules.root:dtable:title]!> (<![com.esarks.arm.schemas.rules.root:dtable:name]!>) <%
      {
//ScriptWriter~~~
iOutputManager.println("<li>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:title]") + " (" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + ") ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    %></ul><br><%
    {
//ScriptWriter~~~
iOutputManager.println("</ul><br>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!com.esarks.arm.schemas.rules.root:dtable!>& {
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable")).next())  {
//ScriptWriter~~      if (<![com.esarks.arm.schemas.rules.root:dtable:pagebreak]!>.equals("true")) {
      if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:pagebreak]").equals("true")) {
//ScriptWriter~~        %><p style="page-break-before: always"><%
        {
//ScriptWriter~~~
iOutputManager.println("<p style=\"page-break-before: always\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
//ScriptWriter~~        %><p><%
        {
//ScriptWriter~~~
iOutputManager.println("<p>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      %><a name="<!%iScriptFullName!>_<!%iScriptInstanceName!>_<![com.esarks.arm.schemas.rules.root:dtable:name]!>"></a><%
      {
//ScriptWriter~~~
iOutputManager.println("<a name=\"" + iScriptFullName + "_" + iScriptInstanceName + "_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "\"></a>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><table width="100%" border="0" cellpadding="0" cellspacing="0"><%
      {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td><table width="100%" border="1" cellpadding="2" cellspacing="0"><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table width=\"100%\" border=\"1\" cellpadding=\"2\" cellspacing=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td><table width="100%" border="1" cellpadding="2" cellspacing="0"><tr><td><b><![com.esarks.arm.schemas.rules.root:dtable:title]!></b> (<![com.esarks.arm.schemas.rules.root:dtable:name]!>)</td></tr></table></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table width=\"100%\" border=\"1\" cellpadding=\"2\" cellspacing=\"0\"><tr><td><b>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:title]") + "</b> (" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + ")</td></tr></table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr bgcolor="#ccccff"><td><b>Control:</b></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr bgcolor=\"#ccccff\"><td><b>Control:</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td><![com.esarks.arm.schemas.rules.root:dtable:text]!></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:text]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr bgcolor="#ccccff"><td><b>Method Prototype:</b></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr bgcolor=\"#ccccff\"><td><b>Method Prototype:</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td><table width="100%" border="1" cellpadding="2" cellspacing="0"><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table width=\"100%\" border=\"1\" cellpadding=\"2\" cellspacing=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      String lReturn = "void";
      String lVisibility = "private";
//ScriptWriter~~      if (<!com.esarks.arm.schemas.rules.root:dtable:return!>!size() > 0) lReturn = <![com.esarks.arm.schemas.rules.root:dtable:return]!>;
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:return")).size() > 0) lReturn = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:return]");
//ScriptWriter~~      if (<!com.esarks.arm.schemas.rules.root:dtable:visibility!>!size() > 0) lVisibility = <![com.esarks.arm.schemas.rules.root:dtable:visibility]!>;
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:visibility")).size() > 0) lVisibility = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:visibility]");
//ScriptWriter~~      %><tr><td colspan=3><b>Return:</b> <!%lReturn!>; <b>Visibility:</b> <!%lVisibility!>; <b>Name:</b> <![com.esarks.arm.schemas.rules.root:dtable:name]!></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td colspan=3><b>Return:</b> " + lReturn + "; <b>Visibility:</b> " + lVisibility + "; <b>Name:</b> " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td><b>Type</b></td><td><b>Name</b></td><td><b>Description</b></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td><b>Type</b></td><td><b>Name</b></td><td><b>Description</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.rules.root:dtable:argument!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:argument")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:argument")).next())  {
//ScriptWriter~~        %><tr><td><![com.esarks.arm.schemas.rules.root:dtable:argument:type]!></td><td><![com.esarks.arm.schemas.rules.root:dtable:argument:name]!></td><td><![com.esarks.arm.schemas.rules.root:dtable:argument:document]!></td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:argument:type]") + "</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:argument:name]") + "</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:argument:document]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      %></table></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("</table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %></table></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("</table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td><table width="100%" border="1" cellpadding="2" cellspacing="0"><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table width=\"100%\" border=\"1\" cellpadding=\"2\" cellspacing=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (<!com.esarks.arm.schemas.rules.root:dtable:condition!>!size() == 1) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).size() == 1) {
//ScriptWriter~~        %><tr bgcolor="#ccccff"><td><b>Condition:</b></td><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr bgcolor=\"#ccccff\"><td><b>Condition:</b></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      } else if (<!com.esarks.arm.schemas.rules.root:dtable:condition!>!size() > 1) {
      } else if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).size() > 1) {
//ScriptWriter~~        %><tr bgcolor="#ccccff"><td><b>Conditions:</b></td><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr bgcolor=\"#ccccff\"><td><b>Conditions:</b></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      for (int lIdx=0; lIdx < <!com.esarks.arm.schemas.rules.root:dtable:scenario!>!size(); lIdx++) {
      for (int lIdx=0; lIdx < iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).size(); lIdx++) {
//ScriptWriter~~        %><td width="20" valign="top" align="center"><b><!%Integer.toString(lIdx+1)!></b></td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"20\" valign=\"top\" align=\"center\"><b>" + Integer.toString(lIdx+1) + "</b></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      %></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.rules.root:dtable:condition!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).next())  {
//ScriptWriter~~        String lConditionText = <![com.esarks.arm.schemas.rules.root:dtable:condition:text]!>.trim();
        String lConditionText = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:text]").trim();
//ScriptWriter~~        %><tr><td><table border="0" cellpadding="2" cellspacing="0"><tr><td valign="top"><![com.esarks.arm.schemas.rules.root:dtable:condition:id]!>)</td><td valign="top"><!%lConditionText!><br><small>[<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!>]</small><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table border=\"0\" cellpadding=\"2\" cellspacing=\"0\"><tr><td valign=\"top\">" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:id]") + ")</td><td valign=\"top\">" + lConditionText + "<br><small>[" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + "]</small>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %></td></tr></table></td><%
        {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        <!com.esarks.arm.schemas.rules.root:dtable:scenario!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).next())  {
//ScriptWriter~~          <!com.esarks.arm.schemas.rules.root:dtable:scenario:condition!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:condition")).resetIterator();
//ScriptWriter~~          if (<!com.esarks.arm.schemas.rules.root:dtable:scenario!>!scan("condition:id", <![com.esarks.arm.schemas.rules.root:dtable:condition:id]!>)) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).scan("condition:id", iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:id]"))) {
//ScriptWriter~~            if (<!com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate!>!size() == 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate")).size() == 0) {
//ScriptWriter~~              %><td width="20" valign="top" align="center">T</td><%
              {
//ScriptWriter~~~
iOutputManager.println("<td width=\"20\" valign=\"top\" align=\"center\">T</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            } else if (<![com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate]!>.equals("true")) {
            } else if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate]").equals("true")) {
//ScriptWriter~~              %><td width="20" valign="top" align="center">T</td><%
              {
//ScriptWriter~~~
iOutputManager.println("<td width=\"20\" valign=\"top\" align=\"center\">T</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            } else if (<![com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate]!>.equals("false")) {
            } else if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate]").equals("false")) {
//ScriptWriter~~              %><td width="20" valign="top" align="center">F</td><%
              {
//ScriptWriter~~~
iOutputManager.println("<td width=\"20\" valign=\"top\" align=\"center\">F</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            } else {
//ScriptWriter~~              %><td width="20" valign="top" align="center">?</td><%
              {
//ScriptWriter~~~
iOutputManager.println("<td width=\"20\" valign=\"top\" align=\"center\">?</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
          } else {
//ScriptWriter~~            %><td>&nbsp;</td><%
            {
//ScriptWriter~~~
iOutputManager.println("<td>&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        }
//ScriptWriter~~        %></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      %></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td><table width="100%" border="1" cellpadding="2" cellspacing="0"><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table width=\"100%\" border=\"1\" cellpadding=\"2\" cellspacing=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (<!com.esarks.arm.schemas.rules.root:dtable:action!>!size() == 1) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:action")).size() == 1) {
//ScriptWriter~~        %><tr bgcolor="#ccccff"><td><b>Action:</b></td><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr bgcolor=\"#ccccff\"><td><b>Action:</b></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      } else if (<!com.esarks.arm.schemas.rules.root:dtable:action!>!size() > 1) {
      } else if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:action")).size() > 1) {
//ScriptWriter~~        %><tr bgcolor="#ccccff"><td><b>Actions:</b></td><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr bgcolor=\"#ccccff\"><td><b>Actions:</b></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      for (int lIdx=0; lIdx < <!com.esarks.arm.schemas.rules.root:dtable:scenario!>!size(); lIdx++) {
      for (int lIdx=0; lIdx < iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).size(); lIdx++) {
//ScriptWriter~~        %><td width="20" valign="top" align="center"><b><!%Integer.toString(lIdx+1)!></b></td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td width=\"20\" valign=\"top\" align=\"center\"><b>" + Integer.toString(lIdx+1) + "</b></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      %></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.rules.root:dtable:action!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:action")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:action")).next())  {
//ScriptWriter~~        String lActionText = <![com.esarks.arm.schemas.rules.root:dtable:action:text]!>.trim();
        String lActionText = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:text]").trim();
//ScriptWriter~~        %><tr><td><table border="0" cellpadding="2" cellspacing="0"><tr><td valign="top"><![com.esarks.arm.schemas.rules.root:dtable:action:id]!>)</td><td><!%lActionText!><br><small>[<![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>]</small><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td><table border=\"0\" cellpadding=\"2\" cellspacing=\"0\"><tr><td valign=\"top\">" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:id]") + ")</td><td>" + lActionText + "<br><small>[" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "]</small>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %></td></tr></table></td><%
        {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        <!com.esarks.arm.schemas.rules.root:dtable:scenario!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).next())  {
//ScriptWriter~~          <!com.esarks.arm.schemas.rules.root:dtable:scenario:action!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:action")).resetIterator();
//ScriptWriter~~          if (<!com.esarks.arm.schemas.rules.root:dtable:scenario!>!scan("action:id", <![com.esarks.arm.schemas.rules.root:dtable:action:id]!>)) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).scan("action:id", iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:id]"))) {
//ScriptWriter~~            int lSeq = <!com.esarks.arm.schemas.rules.root:dtable:scenario:action!>!getIterator();
            int lSeq = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:action")).getIterator();
//ScriptWriter~~            %><td width="20" valign="top" align="center"><!%lSeq!></td><%
            {
//ScriptWriter~~~
iOutputManager.println("<td width=\"20\" valign=\"top\" align=\"center\">" + lSeq + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          } else {
//ScriptWriter~~            %><td>&nbsp;</td><%
            {
//ScriptWriter~~~
iOutputManager.println("<td>&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        }
//ScriptWriter~~        %></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      %></table></td></tr></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</table></td></tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    %></html><%
    {
//ScriptWriter~~~
iOutputManager.println("</html>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    closeOutput();

//ScriptWriter~~    openOutput(path(<![com.esarks.arm.schemas.rules.root:name]!>) + ".new");
    openOutput(path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:name]")) + ".new");

    setContext(iScript.getMasterScript());
//ScriptWriter~~    String lDateTime = <![$jac:dateTime]!>;
    String lDateTime = iSymbolTable.translateProperties("[$jac:dateTime]");
    restoreContext();

    String lStart = "%" + ">";
    String lStop = "<" + "%";
    String lVarStart = "<" + "!";
    String lVarEnd = "!" + ">";
    String lScriptBegin = "<" + "&";
    String lScriptEnd = "&" + ">";
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//  Generated at <!%lDateTime!> by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
iOutputManager.println("//  Generated at " + lDateTime + " by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED", true);
//ScriptWriter~~//$Section=genertedBody$Preserve=yes
iOutputManager.println("//$Section=genertedBody$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~// TODO: Place custom declarations (e.g. variables) or helper methods here.
iOutputManager.println("// TODO: Place custom declarations (e.g. variables) or helper methods here.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=genertedBody$Preserve=no
iOutputManager.println("//$Section=genertedBody$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!%lScriptBegin!> com.esarks.arm.scripts.Method
iOutputManager.println("" + lScriptBegin + " com.esarks.arm.scripts.Method", true);
//ScriptWriter~~  <method name="execute" visibility="public" return="void" >
iOutputManager.println("  <method name=\"execute\" visibility=\"public\" return=\"void\" >", true);
//ScriptWriter~~  </method>
iOutputManager.println("  </method>", true);
//ScriptWriter~~<!%lScriptEnd!>
iOutputManager.println("" + lScriptEnd + "", true);
//ScriptWriter~~//$Section=execute$Preserve=yes
iOutputManager.println("//$Section=execute$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~// TODO: Place execute() method behavior here.
iOutputManager.println("// TODO: Place execute() method behavior here.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=execute$Preserve=no
iOutputManager.println("//$Section=execute$Preserve=no", true);
//ScriptWriter~~<!%lScriptBegin!> com.esarks.arm.scripts.FinalReturnMethod <!%lScriptEnd!>
iOutputManager.println("" + lScriptBegin + " com.esarks.arm.scripts.FinalReturnMethod " + lScriptEnd + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!com.esarks.arm.schemas.rules.root:dtable!>& {
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable")).next())  {
    String lReturn = "void";
    String lVisibility = "private";
//ScriptWriter~~    if (<!com.esarks.arm.schemas.rules.root:dtable:return!>!size() > 0) lReturn = <![com.esarks.arm.schemas.rules.root:dtable:return]!>;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:return")).size() > 0) lReturn = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:return]");
//ScriptWriter~~    if (<!com.esarks.arm.schemas.rules.root:dtable:visibility!>!size() > 0) lVisibility = <![com.esarks.arm.schemas.rules.root:dtable:visibility]!>;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:visibility")).size() > 0) lVisibility = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:visibility]");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lScriptBegin!> com.esarks.arm.scripts.Method
iOutputManager.println("" + lScriptBegin + " com.esarks.arm.scripts.Method", true);
//ScriptWriter~~  <method name="<![com.esarks.arm.schemas.rules.root:dtable:name]!>" visibility="<!%lVisibility!>" return="<!%lReturn!>" >
iOutputManager.println("  <method name=\"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "\" visibility=\"" + lVisibility + "\" return=\"" + lReturn + "\" >", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.rules.root:dtable:argument!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:argument")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:argument")).next())  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <argument type="<![com.esarks.arm.schemas.rules.root:dtable:argument:type]!>" name="a<![com.esarks.arm.schemas.rules.root:dtable:argument:name]!>" document="<![com.esarks.arm.schemas.rules.root:dtable:argument:document]!>" />
iOutputManager.println("    <argument type=\"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:argument:type]") + "\" name=\"a" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:argument:name]") + "\" document=\"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:argument:document]") + "\" />", true);
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
//ScriptWriter~~  </method>
iOutputManager.println("  </method>", true);
//ScriptWriter~~<!%lScriptEnd!>
iOutputManager.println("" + lScriptEnd + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      <!com.esarks.arm.schemas.rules.root:dtable:condition!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).next())  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    boolean lConditionEnable_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!> = true;
iOutputManager.println("    boolean lConditionEnable_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + " = true;", true);
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
//ScriptWriter~~//CUSTOMDTABLE-----------------------------------------------------------------------------------------
iOutputManager.println("//CUSTOMDTABLE-----------------------------------------------------------------------------------------", true);
//ScriptWriter~~// <![com.esarks.arm.schemas.rules.root:dtable:name]!> Precondition
iOutputManager.println("// " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + " Precondition", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_precondition$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_precondition$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~// TODO: Place decision table control initialization behavior here.
iOutputManager.println("// TODO: Place decision table control initialization behavior here.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_precondition$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_precondition$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (<!com.esarks.arm.schemas.rules.root:dtable:condition!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    boolean lDecisionTableProcessing = false;
iOutputManager.println("    boolean lDecisionTableProcessing = false;", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    do {
iOutputManager.println("    do {", true);
//ScriptWriter~~        if (iMicLog.test(Log._APP)) {
iOutputManager.println("        if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~            iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Start of DecisionTable loop");
iOutputManager.println("            iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Start of DecisionTable loop\");", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        lDecisionTableProcessing = false;
iOutputManager.println("        lDecisionTableProcessing = false;", true);
//ScriptWriter~~        boolean lScenarioProcessing = true;
iOutputManager.println("        boolean lScenarioProcessing = true;", true);
//ScriptWriter~~        int lNextScenario = 0;
iOutputManager.println("        int lNextScenario = 0;", true);
//ScriptWriter~~        do {
iOutputManager.println("        do {", true);
//ScriptWriter~~          if (iMicLog.test(Log._APP)) {
iOutputManager.println("          if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~              iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Start of Scenario loop");
iOutputManager.println("              iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Start of Scenario loop\");", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//CUSTOMDTABLE-----------------------------------------------------------------------------------------
iOutputManager.println("//CUSTOMDTABLE-----------------------------------------------------------------------------------------", true);
//ScriptWriter~~// <![com.esarks.arm.schemas.rules.root:dtable:name]!> Code
iOutputManager.println("// " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + " Code", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_code$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_code$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~// TODO: Place decision table control initialization behavior here. (This is within the "do" iteration loops).
iOutputManager.println("// TODO: Place decision table control initialization behavior here. (This is within the \"do\" iteration loops).", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_code$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_code$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.rules.root:dtable:condition!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).next())  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//CUSTOMDTABLE-----------------------------------------------------------------------------------------
iOutputManager.println("//CUSTOMDTABLE-----------------------------------------------------------------------------------------", true);
//ScriptWriter~~// <![com.esarks.arm.schemas.rules.root:dtable:name]!> Condition id = <![com.esarks.arm.schemas.rules.root:dtable:condition:id]!>; symbolicId = <![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!>
iOutputManager.println("// " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + " Condition id = " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:id]") + "; symbolicId = " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      String lText = <![com.esarks.arm.schemas.rules.root:dtable:condition:text]!>.trim();
      String lText = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:text]").trim();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~/* <!%lText!> */
iOutputManager.println("/* " + lText + " */", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_condition_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!>$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_condition_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + "$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~// TODO: Modify or add condition processing behavior here.
iOutputManager.println("// TODO: Modify or add condition processing behavior here.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~            int lConditionResult_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!> = 0;
iOutputManager.println("            int lConditionResult_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + " = 0;", true);
//ScriptWriter~~            if (lConditionEnable_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!>) {
iOutputManager.println("            if (lConditionEnable_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + ") {", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~                lConditionResult_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!> = 0;
iOutputManager.println("                lConditionResult_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + " = 0;", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~            }
iOutputManager.println("            }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_condition_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!>$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_condition_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + "$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~            if (iMicLog.test(Log._APP)) {
iOutputManager.println("            if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~                iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!lConditionResult_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!> = " + lConditionResult_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!>);
iOutputManager.println("                iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!lConditionResult_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + " = \" + lConditionResult_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + ");", true);
//ScriptWriter~~            }
iOutputManager.println("            }", true);
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
//ScriptWriter~~            int lScenarioTaken = 0;
iOutputManager.println("            int lScenarioTaken = 0;", true);
//ScriptWriter~~            ArrayList lActionArrayList = new ArrayList();
iOutputManager.println("            ArrayList lActionArrayList = new ArrayList();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.rules.root:dtable:scenario!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).next())  {
//ScriptWriter~~        String lScenarioNumber = Integer.toString(<!com.esarks.arm.schemas.rules.root:dtable:scenario!>!getIterator());
        String lScenarioNumber = Integer.toString(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).getIterator());
        String lConditionsExist = " &&";
//ScriptWriter~~        if (<!com.esarks.arm.schemas.rules.root:dtable:scenario:condition!>!size() == 0) lConditionsExist = "";
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:condition")).size() == 0) lConditionsExist = "";
//ScriptWriter~~        if (<!com.esarks.arm.schemas.rules.root:dtable:scenario!>!isFirst()) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario")).isFirst()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            if (lScenarioProcessing && lNextScenario <= <!%lScenarioNumber!><!%lConditionsExist!> <%
iOutputManager.println("            if (lScenarioProcessing && lNextScenario <= " + lScenarioNumber + "" + lConditionsExist + " ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~%> else if (lScenarioProcessing && lNextScenario <= <!%lScenarioNumber!><!%lConditionsExist!> <%
{
//ScriptWriter~~~
iOutputManager.println(" else if (lScenarioProcessing && lNextScenario <= " + lScenarioNumber + "" + lConditionsExist + " ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


        }
//ScriptWriter~~        <!com.esarks.arm.schemas.rules.root:dtable:scenario:condition!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:condition")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:condition")).next())  {
          String lTest = "true";
//ScriptWriter~~          if (<!com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate")).size() > 0) {
//ScriptWriter~~            if (<![com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate]!>.equals("true")) {
            if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate]").equals("true")) {
              lTest = "true";
//ScriptWriter~~            } else if (<![com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate]!>.equals("false")) {
            } else if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:scenario:condition:evaluate]").equals("false")) {
              lTest = "false";
            } else {
              lTest = "?";
            }
          }
          String lAnd = " &&";
//ScriptWriter~~          if (<!com.esarks.arm.schemas.rules.root:dtable:scenario:condition!>!isLast()) lAnd = "";
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:condition")).isLast()) lAnd = "";
//ScriptWriter~~            <!com.esarks.arm.schemas.rules.root:dtable:condition!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).resetIterator();
//ScriptWriter~~            <!com.esarks.arm.schemas.rules.root:dtable!>!scan("condition:id", <![com.esarks.arm.schemas.rules.root:dtable:scenario:condition:id]!>);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable")).scan("condition:id", iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:scenario:condition:id]"));
            if (lTest.equals("true")) {
//ScriptWriter~~%>(lConditionResult_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!> > 0)<!%lAnd!><%
{
//ScriptWriter~~~
iOutputManager.println("(lConditionResult_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + " > 0)" + lAnd + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
            if (lTest.equals("false")) {
//ScriptWriter~~%>(lConditionResult_<![com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]!> < 0)<!%lAnd!><%
{
//ScriptWriter~~~
iOutputManager.println("(lConditionResult_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:condition:symbolicId]") + " < 0)" + lAnd + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
        }
//ScriptWriter~~%>) {
{
//ScriptWriter~~~
iOutputManager.println(") {", true);
//ScriptWriter~~                // Scenario <!%lScenarioNumber!>
iOutputManager.println("                // Scenario " + lScenarioNumber + "", true);
//ScriptWriter~~                if (iMicLog.test(Log._APP)) {
iOutputManager.println("                if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~                    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Scenario <!%lScenarioNumber!> taken.");
iOutputManager.println("                    iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Scenario " + lScenarioNumber + " taken.\");", true);
//ScriptWriter~~                }
iOutputManager.println("                }", true);
//ScriptWriter~~                lScenarioTaken = <!%lScenarioNumber!>;
iOutputManager.println("                lScenarioTaken = " + lScenarioNumber + ";", true);
//ScriptWriter~~                lScenarioProcessing = false;
iOutputManager.println("                lScenarioProcessing = false;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        <!com.esarks.arm.schemas.rules.root:dtable:scenario:action!>& {
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:action")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:scenario:action")).next())  {
//ScriptWriter~~          <!com.esarks.arm.schemas.rules.root:dtable:action!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:action")).resetIterator();
//ScriptWriter~~          <!com.esarks.arm.schemas.rules.root:dtable!>!scan("action:id", <![com.esarks.arm.schemas.rules.root:dtable:scenario:action:id]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable")).scan("action:id", iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:scenario:action:id]"));
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~                // Action symbolicId=<![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>
iOutputManager.println("                // Action symbolicId=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "", true);
//ScriptWriter~~                lActionArrayList.add("<![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>");
iOutputManager.println("                lActionArrayList.add(\"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "\");", true);
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
//ScriptWriter~~            }<%
iOutputManager.println("            }", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~else {
iOutputManager.println("else {", true);
//ScriptWriter~~                // No scenario taken
iOutputManager.println("                // No scenario taken", true);
//ScriptWriter~~                if (iMicLog.test(Log._APP)) {
iOutputManager.println("                if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~                    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!No scenario taken.");
iOutputManager.println("                    iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!No scenario taken.\");", true);
//ScriptWriter~~                }
iOutputManager.println("                }", true);
//ScriptWriter~~                lScenarioProcessing = false;
iOutputManager.println("                lScenarioProcessing = false;", true);
//ScriptWriter~~                lScenarioTaken = -1;
iOutputManager.println("                lScenarioTaken = -1;", true);
//ScriptWriter~~            }
iOutputManager.println("            }", true);
//ScriptWriter~~//CUSTOMDTABLE-----------------------------------------------------------------------------------------
iOutputManager.println("//CUSTOMDTABLE-----------------------------------------------------------------------------------------", true);
//ScriptWriter~~// <![com.esarks.arm.schemas.rules.root:dtable:name]!> Actions (all have visibility of this section)
iOutputManager.println("// " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + " Actions (all have visibility of this section)", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_actions$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_actions$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~// TODO: Place global action behavior here.  This section is visible to all actions.
iOutputManager.println("// TODO: Place global action behavior here.  This section is visible to all actions.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_actions$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_actions$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~            for (int lActionIdx=0; lActionIdx < lActionArrayList.size(); lActionIdx++) {
iOutputManager.println("            for (int lActionIdx=0; lActionIdx < lActionArrayList.size(); lActionIdx++) {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.rules.root:dtable:action!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:action")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:action")).next())  {

//ScriptWriter~~        if (<!com.esarks.arm.schemas.rules.root:dtable:action!>!isFirst()) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:action")).isFirst()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~                if (((String) lActionArrayList.get(lActionIdx)).equals("<![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>")) {
iOutputManager.println("                if (((String) lActionArrayList.get(lActionIdx)).equals(\"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "\")) {", true);
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
//ScriptWriter~~ else if (((String) lActionArrayList.get(lActionIdx)).equals("<![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>")) {
iOutputManager.println(" else if (((String) lActionArrayList.get(lActionIdx)).equals(\"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "\")) {", true);
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
//ScriptWriter~~                    // Action symbolicId=<![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>
iOutputManager.println("                    // Action symbolicId=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "", true);
//ScriptWriter~~                    if (iMicLog.test(Log._APP)) {
iOutputManager.println("                    if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~                        iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Performing action code \\\"<![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>\\\"");
iOutputManager.println("                        iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Performing action code \"" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "\"\");", true);
//ScriptWriter~~                    }
iOutputManager.println("                    }", true);
//ScriptWriter~~//CUSTOMDTABLE-----------------------------------------------------------------------------------------
iOutputManager.println("//CUSTOMDTABLE-----------------------------------------------------------------------------------------", true);
//ScriptWriter~~// <![com.esarks.arm.schemas.rules.root:dtable:name]!> Action id = <![com.esarks.arm.schemas.rules.root:dtable:action:id]!>; symbolicId = <![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>
iOutputManager.println("// " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + " Action id = " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:id]") + "; symbolicId = " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      String lText = <![com.esarks.arm.schemas.rules.root:dtable:action:text]!>.trim();
      String lText = iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:text]").trim();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~/* <!%lText!> */
iOutputManager.println("/* " + lText + " */", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_action_<![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_action_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~// TODO: Place action behavior here.
iOutputManager.println("// TODO: Place action behavior here.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_action_<![com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]!>$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_action_" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:action:symbolicId]") + "$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~                }<%
iOutputManager.println("                }", false);
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
//ScriptWriter~~            }
iOutputManager.println("            }", true);
//ScriptWriter~~        } while(lScenarioProcessing);
iOutputManager.println("        } while(lScenarioProcessing);", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~        if (iMicLog.test(Log._APP)) {
iOutputManager.println("        if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~            iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Fall out of Scenario loop");
iOutputManager.println("            iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Fall out of Scenario loop\");", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//CUSTOMDTABLE-----------------------------------------------------------------------------------------
iOutputManager.println("//CUSTOMDTABLE-----------------------------------------------------------------------------------------", true);
//ScriptWriter~~// <![com.esarks.arm.schemas.rules.root:dtable:name]!> Postcondition
iOutputManager.println("// " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + " Postcondition", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_postcondition$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_postcondition$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~// TODO: Place decision table control post-processing behavior here.
iOutputManager.println("// TODO: Place decision table control post-processing behavior here.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_postcondition$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_postcondition$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    } while(lDecisionTableProcessing);
iOutputManager.println("    } while(lDecisionTableProcessing);", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    if (iMicLog.test(Log._APP)) {
iOutputManager.println("    if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~        iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Fall out of DecisionTable loop");
iOutputManager.println("        iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Fall out of DecisionTable loop\");", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      } // if (<!com.esarks.arm.schemas.rules.root:dtable:condition!>!size() > 0) {
      } // if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:condition")).size() > 0) {

//ScriptWriter~~      if (<!com.esarks.arm.schemas.rules.root:dtable:return!>!size() == 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:return")).size() == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_return$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_return$Preserve=yes", true);
//ScriptWriter~~<!%lScriptBegin!> com.esarks.arm.scripts.FinalReturnMethod <!%lScriptEnd!>
iOutputManager.println("" + lScriptBegin + " com.esarks.arm.scripts.FinalReturnMethod " + lScriptEnd + "", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_return$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_return$Preserve=no", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        continue;
      }
//ScriptWriter~~      if (<![com.esarks.arm.schemas.rules.root:dtable:return]!>.equals("boolean")) {
      if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:return]").equals("boolean")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_return$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_return$Preserve=yes", true);
//ScriptWriter~~<!%lScriptBegin!> com.esarks.arm.scripts.FinalReturnMethod
iOutputManager.println("" + lScriptBegin + " com.esarks.arm.scripts.FinalReturnMethod", true);
//ScriptWriter~~  <return>
iOutputManager.println("  <return>", true);
//ScriptWriter~~    <normal>true</normal>
iOutputManager.println("    <normal>true</normal>", true);
//ScriptWriter~~    <error>false</error>
iOutputManager.println("    <error>false</error>", true);
//ScriptWriter~~  </return>
iOutputManager.println("  </return>", true);
//ScriptWriter~~<!%lScriptEnd!>
iOutputManager.println("" + lScriptEnd + "", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_return$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_return$Preserve=no", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        continue;
      }
//ScriptWriter~~      if (<!com.esarks.arm.schemas.rules.root:dtable:return!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.rules.root:dtable:return")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_return$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_return$Preserve=yes", true);
//ScriptWriter~~<!%lScriptBegin!> com.esarks.arm.scripts.FinalReturnMethod
iOutputManager.println("" + lScriptBegin + " com.esarks.arm.scripts.FinalReturnMethod", true);
//ScriptWriter~~  <return>
iOutputManager.println("  <return>", true);
//ScriptWriter~~    <normal>null</normal>
iOutputManager.println("    <normal>null</normal>", true);
//ScriptWriter~~    <error>null</error>
iOutputManager.println("    <error>null</error>", true);
//ScriptWriter~~  </return>
iOutputManager.println("  </return>", true);
//ScriptWriter~~<!%lScriptEnd!>
iOutputManager.println("" + lScriptEnd + "", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_return$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_return$Preserve=no", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        continue;
      }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_return$Preserve=yes
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_return$Preserve=yes", true);
//ScriptWriter~~<!%lScriptBegin!> com.esarks.arm.scripts.FinalReturnMethod <!%lScriptEnd!>
iOutputManager.println("" + lScriptBegin + " com.esarks.arm.scripts.FinalReturnMethod " + lScriptEnd + "", true);
//ScriptWriter~~//$Section=<![com.esarks.arm.schemas.rules.root:dtable:name]!>_return$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:dtable:name]") + "_return$Preserve=no", true);
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
//ScriptWriter~~//$Section=endOfClass$Preserve=yes
iOutputManager.println("//$Section=endOfClass$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~// TODO: Place helper methods or inner-classes here.
iOutputManager.println("// TODO: Place helper methods or inner-classes here.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=endOfClass$Preserve=no
iOutputManager.println("//$Section=endOfClass$Preserve=no", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    closeOutput();

//ScriptWriter~~    if (<![com.esarks.arm.schemas.rules.root:generateCode]!>.equals("true")) {
    if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:generateCode]").equals("true")) {
//ScriptWriter~~      Merge.getInstance().doMerge(path(<![com.esarks.arm.schemas.rules.root:name]!>) + ".script", path(<![com.esarks.arm.schemas.rules.root:name]!>) + ".new", iScript.getMasterScript());
      Merge.getInstance().doMerge(path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:name]")) + ".script", path(iSymbolTable.translateProperties("[com.esarks.arm.schemas.rules.root:name]")) + ".new", iScript.getMasterScript());
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
