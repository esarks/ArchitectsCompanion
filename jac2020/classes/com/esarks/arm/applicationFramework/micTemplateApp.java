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
public class micTemplateApp extends com.esarks.mic.MicScriptHelper {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected micTemplateApp() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public micTemplateApp(Script aScript) {

    super(aScript);

  }

  public void execute() {

//ScriptWriter~~    if (<!micImages!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("micImages")).size() == 0) {
      parseXml("com.hqsonline.conf.micImages");
//      loadXmlSchema("mic", path("com.hqsonline.conf.schemas") + ".xml");
    }
//ScriptWriter~~    if (<!$jac:phase!>!size() == 0) <!$jac:phase!>!reset(<![$jac:loc:phase]!>); 
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:phase")).size() == 0) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:phase")).reset(iSymbolTable.translateProperties("[$jac:loc:phase]")); 
//ScriptWriter~~    if (<!properties!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("properties")).size() == 0) {
      loadXmlSchema("com.hqsonline.arm.properties.conf", path("com.hqsonline.arm.properties.conf.Schemas") + ".xml");
      parseXmlSchema("com.hqsonline.arm.properties.conf.Properties");
//ScriptWriter~~      boolean lScan = <!properties:com.hqsonline.arm.properties.conf.properties!>!scan("sqlServer");
      boolean lScan = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("properties:com.hqsonline.arm.properties.conf.properties")).scan("sqlServer");
    }

    if (iSecurityManager == null) iSecurityManager = new com.esarks.mic.SecurityManager();

//ScriptWriter~~//    if (<!$jac:security!>!size() == 0) {
//    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:security")).size() == 0) {
//ScriptWriter~~//      <!$jac:security!>!set(<![$jac:loc:security]!>);
//      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:security")).set(iSymbolTable.translateProperties("[$jac:loc:security]"));
//ScriptWriter~~//      lSecurityManager = (com.esarks.mic.SecurityManager) loadScript(<![$jac:security]!>);
//      lSecurityManager = (com.esarks.mic.SecurityManager) loadScript(iSymbolTable.translateProperties("[$jac:security]"));
//ScriptWriter~~//      <!$jac:security:object!>!set(lSecurityManager);
//      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:security:object")).set(lSecurityManager);
//    } else {
//ScriptWriter~~//      lSecurityManager = (com.esarks.mic.SecurityManager) <!$jac:security:object!>!getValueObject();
//      lSecurityManager = (com.esarks.mic.SecurityManager) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:security:object")).getValueObject();
//    }

    ServletRequest lServletRequest = getServletRequest();

    String lScript = null;
    String lInstance = null;
    String lMethod = null;
    String lArgument = null;
    String lAction = null;
    
    String lHref = lServletRequest.getParameter("href");
    if (lHref != null) {
//ScriptWriter~~      <!$jac:href!>!resetIterator(Integer.parseInt(lHref));
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href")).resetIterator(Integer.parseInt(lHref));
//ScriptWriter~~      lScript = (String) <![$jac:href:script]!>!getValueObject();
      lScript = (String) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$jac:href:script]")).getValueObject();
//ScriptWriter~~      lInstance = (String) <![$jac:href:instance]!>!getValueObject();
      lInstance = (String) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$jac:href:instance]")).getValueObject();
//ScriptWriter~~      lMethod = (String) <![$jac:href:method]!>!getValueObject();
      lMethod = (String) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$jac:href:method]")).getValueObject();
//ScriptWriter~~      lArgument = (String) <![$jac:href:argument]!>!getValueObject();
      lArgument = (String) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$jac:href:argument]")).getValueObject();
//ScriptWriter~~      lAction = (String) <![$jac:href:action]!>!getValueObject();
      lAction = (String) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$jac:href:action]")).getValueObject();
    } else {
      lScript = lServletRequest.getParameter("script");
      lInstance = lServletRequest.getParameter("instance");
      lMethod = lServletRequest.getParameter("method");
      lArgument = lServletRequest.getParameter("argument");
      lAction = lServletRequest.getParameter("action");
    }
    
//ScriptWriter~~    <!$mic:securityError!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:securityError")).remove();
    if (iSecurityManager != null &&
        (lMethod.compareTo("openHas") != 0 && iSecurityManager.checkScript(lScript) == true ||
         lMethod.compareTo("openHas") == 0 && iSecurityManager.checkScript(lScript) == true && iSecurityManager.checkScript(lArgument) == true)) {

      if (lInstance == null) lInstance="";    
      ScriptHelper lScriptHelper = (ScriptHelper) loadScript(lScript, lInstance);

      if (lArgument == null) {
        iScript.execMethod(lScriptHelper, lMethod);
      } else {
        iScript.execMethod(lScriptHelper, lMethod, new Object[] {lArgument});
      }

      if (lAction != null && lAction.compareTo("init") == 0) {
        register(iScript, lScript, "", lScriptHelper);
        iScript.execMethod(lScriptHelper, "execute", new Object[] {"open"});
      }
    } else {
//ScriptWriter~~      <!$mic:securityError!>!set("true");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:securityError")).set("true");
      if (iSecurityManager != null) {
//        lSecurityManager.execute("violation");
//ScriptWriter~~        <!$mic:securityError!>!remove();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:securityError")).remove();
      }
    }
    
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
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<!$jac:title!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:title")).size() > 0) {
//ScriptWriter~~%><title><![$jac:title]!></title><%
{
//ScriptWriter~~~
iOutputManager.println("<title>" + iSymbolTable.translateProperties("[$jac:title]") + "</title>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  } else {
//ScriptWriter~~%><title><![$jac:loc:title]!></title><%
{
//ScriptWriter~~~
iOutputManager.println("<title>" + iSymbolTable.translateProperties("[$jac:loc:title]") + "</title>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
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
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    if (<!$mic:securityError!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:securityError")).size() > 0) {
//ScriptWriter~~      %><table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0"><%
      {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td style="background-color:darkred; color:white;"><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td style=\"background-color:darkred; color:white;\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %>A security violation has prevented processing your last request.<%
      {
//ScriptWriter~~~
iOutputManager.println("A security violation has prevented processing your last request.", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %></td></tr></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    <!$jac:registry:script!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).resetIterator();
//ScriptWriter~~    while (<!$jac:registry:script!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).next()) {
//ScriptWriter~~      <!$jac:registry:script:instance!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).resetIterator();
//ScriptWriter~~      while (<!$jac:registry:script:instance!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).next()) {
//ScriptWriter~~        MicScriptHelper lContextObject = (MicScriptHelper) <!$jac:registry:script:instance:object!>!getValueObject();
        MicScriptHelper lContextObject = (MicScriptHelper) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance:object")).getValueObject();
//ScriptWriter~~        <!$jac:loc:content!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:content")).resetIterator();
//ScriptWriter~~        while (<!$jac:loc:content!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:loc:content")).next()) {
//ScriptWriter~~          String lContentScript = <![$jac:loc:content]!>;
          String lContentScript = iSymbolTable.translateProperties("[$jac:loc:content]");
//ScriptWriter~~          String lContentScriptMethod = <![$jac:loc:content:method]!>;
          String lContentScriptMethod = iSymbolTable.translateProperties("[$jac:loc:content:method]");
          MicScriptHelper lMicScriptHelper = (MicScriptHelper) loadScript(lContentScript);
          lMicScriptHelper.execute(lContextObject);
        }
      }
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
