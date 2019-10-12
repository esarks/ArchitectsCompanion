//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.userGuides;

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
public class GenerateTagHtml extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected GenerateTagHtml() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public GenerateTagHtml(Script aScript) {

    super(aScript);

  }
  
  public void generateTagHtml(String aXmlDefinition) {
//ScriptWriter~~%>generateTagHtml: <!%aXmlDefinition!>
{
//ScriptWriter~~~
iOutputManager.println("generateTagHtml: " + aXmlDefinition + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!tags!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tags")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
//ScriptWriter~~    if (<!tags!>!size() == 0) return;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tags")).size() == 0) return;

    openOutput(path(aXmlDefinition) + ".html");

    int lSize = 200;
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<html>
iOutputManager.println("<html>", true);
//ScriptWriter~~<head>
iOutputManager.println("<head>", true);
//ScriptWriter~~<style type="text/css">
iOutputManager.println("<style type=\"text/css\">", true);
//ScriptWriter~~p {font-family: Arial, Helvetica, sans-serif; font-size: x-small; color: #000000;}
iOutputManager.println("p {font-family: Arial, Helvetica, sans-serif; font-size: x-small; color: #000000;}", true);
//ScriptWriter~~tr {font-family: Arial, Helvetica, sans-serif; font-size: x-small; color: #000000;}
iOutputManager.println("tr {font-family: Arial, Helvetica, sans-serif; font-size: x-small; color: #000000;}", true);
//ScriptWriter~~td {font-family: Arial, Helvetica, sans-serif; font-size: x-small; color: #000000;}
iOutputManager.println("td {font-family: Arial, Helvetica, sans-serif; font-size: x-small; color: #000000;}", true);
//ScriptWriter~~</style>
iOutputManager.println("</style>", true);
//ScriptWriter~~</head>
iOutputManager.println("</head>", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<body />
iOutputManager.println("<body />", true);
//ScriptWriter~~  <table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0">
iOutputManager.println("  <table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", true);
//ScriptWriter~~    <tr><td width="6" bgcolor="gray"></td><td width="6"></td><td>
iOutputManager.println("    <tr><td width=\"6\" bgcolor=\"gray\"></td><td width=\"6\"></td><td>", true);
//ScriptWriter~~      <hr>
iOutputManager.println("      <hr>", true);
//ScriptWriter~~      <table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0">
iOutputManager.println("      <table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", true);
//ScriptWriter~~        <tr>
iOutputManager.println("        <tr>", true);
//ScriptWriter~~          <th width="<!%lSize!>" align='left'>Element</th>
iOutputManager.println("          <th width=\"" + lSize + "\" align='left'>Element</th>", true);
//ScriptWriter~~          <th align='left'>Description</th>
iOutputManager.println("          <th align='left'>Description</th>", true);
//ScriptWriter~~        </tr>
iOutputManager.println("        </tr>", true);
//ScriptWriter~~        <tr>
iOutputManager.println("        <tr>", true);
//ScriptWriter~~          <td valign='top' align='left'><![tags:root]!></td>
iOutputManager.println("          <td valign='top' align='left'>" + iSymbolTable.translateProperties("[tags:root]") + "</td>", true);
//ScriptWriter~~          <td valign='top' align='left'><![tags:documentation]!></td>
iOutputManager.println("          <td valign='top' align='left'>" + iSymbolTable.translateProperties("[tags:documentation]") + "</td>", true);
//ScriptWriter~~        </tr>
iOutputManager.println("        </tr>", true);
//ScriptWriter~~      </table>
iOutputManager.println("      </table>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    String lIndent="      ";
    String lTag = "tags";
//ScriptWriter~~    if (<!" + lTag + ":tag!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lTag + ":tag")).size() > 0) {
      lTag += ":tag";
//ScriptWriter~~      <!" + lTag + "!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lTag + "")).resetIterator();
      lSize -= 12;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      <table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0">
iOutputManager.println("      <table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", true);
//ScriptWriter~~        <tr><td width="6" bgcolor="gray"></td><td width="6"></td><td>
iOutputManager.println("        <tr><td width=\"6\" bgcolor=\"gray\"></td><td width=\"6\"></td><td>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }

    while (!lTag.equals("tags")) {

//ScriptWriter~~      while (<!" + lTag + "!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lTag + "")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      <hr>
iOutputManager.println("      <hr>", true);
//ScriptWriter~~      <table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0">
iOutputManager.println("      <table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", true);
//ScriptWriter~~        <tr>
iOutputManager.println("        <tr>", true);
//ScriptWriter~~          <th width="<!%lSize!>" align='left'><![cap@[" + lTag + ":type]]!></th>
iOutputManager.println("          <th width=\"" + lSize + "\" align='left'>" + iSymbolTable.translateProperties("[cap@[" + lTag + ":type]]") + "</th>", true);
//ScriptWriter~~          <th align='left'>Description</th>
iOutputManager.println("          <th align='left'>Description</th>", true);
//ScriptWriter~~        </tr>
iOutputManager.println("        </tr>", true);
//ScriptWriter~~        <tr>
iOutputManager.println("        <tr>", true);
//ScriptWriter~~          <td valign='top' align='left'><![" + lTag + ":name]!></td>
iOutputManager.println("          <td valign='top' align='left'>" + iSymbolTable.translateProperties("[" + lTag + ":name]") + "</td>", true);
//ScriptWriter~~          <td valign='top' align='left'><![" + lTag + ":documentation]!></td>
iOutputManager.println("          <td valign='top' align='left'>" + iSymbolTable.translateProperties("[" + lTag + ":documentation]") + "</td>", true);
//ScriptWriter~~        </tr>
iOutputManager.println("        </tr>", true);
//ScriptWriter~~      </table>
iOutputManager.println("      </table>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    
//ScriptWriter~~        if (<!" + lTag + ":tag!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lTag + ":tag")).size() > 0) {
          lTag += ":tag";
//ScriptWriter~~          <!" + lTag + "!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lTag + "")).resetIterator();
          lSize -= 12;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      <table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0">
iOutputManager.println("      <table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", true);
//ScriptWriter~~        <tr><td width="6" bgcolor="gray"></td><td width="6"></td><td>
iOutputManager.println("        <tr><td width=\"6\" bgcolor=\"gray\"></td><td width=\"6\"></td><td>", true);
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
//ScriptWriter~~    </td></tr>
iOutputManager.println("    </td></tr>", true);
//ScriptWriter~~  </table>
iOutputManager.println("  </table>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      lTag = lTag.substring(0, lTag.length() - 4);
      lSize += 12;
    }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    </td></tr>
iOutputManager.println("    </td></tr>", true);
//ScriptWriter~~  </table>
iOutputManager.println("  </table>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }    
}
