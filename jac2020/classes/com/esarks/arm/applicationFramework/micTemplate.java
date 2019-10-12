//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.applicationFramework;

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
public class micTemplate extends com.esarks.mic.MicScriptHelper {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected micTemplate() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public micTemplate(Script aScript) {

    super(aScript);

  }

  public void execute() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!-- enter micTemplate -->
iOutputManager.println("<!-- enter micTemplate -->", true);
//ScriptWriter~~<html>
iOutputManager.println("<html>", true);
//ScriptWriter~~<head>
iOutputManager.println("<head>", true);
//ScriptWriter~~<title><![$jac:loc:title]!></title>
iOutputManager.println("<title>" + iSymbolTable.translateProperties("[$jac:loc:title]") + "</title>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  <!$jac:loc:stylesheet!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:stylesheet")).resetIterator();
//ScriptWriter~~  while (<!$jac:loc:stylesheet!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:stylesheet")).next()) {
//ScriptWriter~~    iScript.execMethod(iScript.loadScript(<![$jac:loc:stylesheet]!>, <![$jac:loc:stylesheet:context]!>), <![$jac:loc:stylesheet:method]!>);
    iScript.execMethod(iScript.loadScript(iSymbolTable.translateProperties("[$jac:loc:stylesheet]"), iSymbolTable.translateProperties("[$jac:loc:stylesheet:context]")), iSymbolTable.translateProperties("[$jac:loc:stylesheet:method]"));
  }
//ScriptWriter~~  <!$jac:loc:head!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:head")).resetIterator();
//ScriptWriter~~  while (<!$jac:loc:head!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:head")).next()) {
//ScriptWriter~~    iScript.execMethod(iScript.loadScript(<![$jac:loc:head]!>, <![$jac:loc:head:context]!>), <![$jac:loc:head:method]!>);
    iScript.execMethod(iScript.loadScript(iSymbolTable.translateProperties("[$jac:loc:head]"), iSymbolTable.translateProperties("[$jac:loc:head:context]")), iSymbolTable.translateProperties("[$jac:loc:head:method]"));
  }
//ScriptWriter~~  <!$jac:loc:script!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:script")).resetIterator();
//ScriptWriter~~  while (<!$jac:loc:script!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:script")).next()) {
//ScriptWriter~~    iScript.execMethod(iScript.loadScript(<![$jac:loc:script]!>, <![$jac:loc:script:context]!>), <![$jac:loc:script:method]!>);
    iScript.execMethod(iScript.loadScript(iSymbolTable.translateProperties("[$jac:loc:script]"), iSymbolTable.translateProperties("[$jac:loc:script:context]")), iSymbolTable.translateProperties("[$jac:loc:script:method]"));
  }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~</head>
iOutputManager.println("</head>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  <!$jac:loc:body!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:body")).resetIterator();
//ScriptWriter~~  while (<!$jac:loc:body!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:body")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<body <![$jac:loc:body]!> />
iOutputManager.println("<body " + iSymbolTable.translateProperties("[$jac:loc:body]") + " />", true);
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
//ScriptWriter~~<!-- Page -->
iOutputManager.println("<!-- Page -->", true);
//ScriptWriter~~<table <![$jac:loc:page]!>>
iOutputManager.println("<table " + iSymbolTable.translateProperties("[$jac:loc:page]") + ">", true);
//ScriptWriter~~  <tr>
iOutputManager.println("  <tr>", true);
//ScriptWriter~~    <td>
iOutputManager.println("    <td>", true);
//ScriptWriter~~<!-- Site Banner -->
iOutputManager.println("<!-- Site Banner -->", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  <!$jac:loc:banner!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:banner")).resetIterator();
//ScriptWriter~~  while (<!$jac:loc:banner!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:banner")).next()) {
//ScriptWriter~~    iScript.execMethod(iScript.loadScript(<![$jac:loc:banner]!>, <![$jac:loc:banner:context]!>), <![$jac:loc:banner:method]!>);
    iScript.execMethod(iScript.loadScript(iSymbolTable.translateProperties("[$jac:loc:banner]"), iSymbolTable.translateProperties("[$jac:loc:banner:context]")), iSymbolTable.translateProperties("[$jac:loc:banner:method]"));
  }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    </td>
iOutputManager.println("    </td>", true);
//ScriptWriter~~  </tr>
iOutputManager.println("  </tr>", true);
//ScriptWriter~~  <tr>
iOutputManager.println("  <tr>", true);
//ScriptWriter~~    <td>
iOutputManager.println("    <td>", true);
//ScriptWriter~~<!-- Page Header -->
iOutputManager.println("<!-- Page Header -->", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  <!$jac:loc:header!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:header")).resetIterator();
//ScriptWriter~~  while (<!$jac:loc:header!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:header")).next()) {
//ScriptWriter~~    iScript.execMethod(iScript.loadScript(<![$jac:loc:header]!>, <![$jac:loc:header:context]!>), <![$jac:loc:header:method]!>);
    iScript.execMethod(iScript.loadScript(iSymbolTable.translateProperties("[$jac:loc:header]"), iSymbolTable.translateProperties("[$jac:loc:header:context]")), iSymbolTable.translateProperties("[$jac:loc:header:method]"));
  }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    </td>
iOutputManager.println("    </td>", true);
//ScriptWriter~~  </tr>
iOutputManager.println("  </tr>", true);
//ScriptWriter~~  <tr>
iOutputManager.println("  <tr>", true);
//ScriptWriter~~    <td>
iOutputManager.println("    <td>", true);
//ScriptWriter~~<!-- Content from components -->
iOutputManager.println("<!-- Content from components -->", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  <!$jac:loc:content!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:content")).resetIterator();
//ScriptWriter~~  while (<!$jac:loc:content!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:content")).next()) {
//ScriptWriter~~    iScript.execMethod(loadScript(<![$jac:loc:content]!>), <![$jac:loc:content:method]!>);
    iScript.execMethod(loadScript(iSymbolTable.translateProperties("[$jac:loc:content]")), iSymbolTable.translateProperties("[$jac:loc:content:method]"));
  }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    </td>
iOutputManager.println("    </td>", true);
//ScriptWriter~~  </tr>
iOutputManager.println("  </tr>", true);
//ScriptWriter~~</table>
iOutputManager.println("</table>", true);
//ScriptWriter~~<!-- Site Footer -->
iOutputManager.println("<!-- Site Footer -->", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  <!$jac:loc:footer!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:footer")).resetIterator();
//ScriptWriter~~  while (<!$jac:loc:footer!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:footer")).next()) {
//ScriptWriter~~    iScript.execMethod(iScript.loadScript(<![$jac:loc:footer]!>, <![$jac:loc:footer:context]!>), <![$jac:loc:footer:method]!>);
    iScript.execMethod(iScript.loadScript(iSymbolTable.translateProperties("[$jac:loc:footer]"), iSymbolTable.translateProperties("[$jac:loc:footer:context]")), iSymbolTable.translateProperties("[$jac:loc:footer:method]"));
  }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~</html>
iOutputManager.println("</html>", true);
//ScriptWriter~~<!-- exit micTemplate -->
iOutputManager.println("<!-- exit micTemplate -->", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
  
}
