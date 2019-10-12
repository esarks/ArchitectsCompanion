//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.applicationFramework;

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
public class Router com.esarks.mic.MicScriptHelper  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Router() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Router(Script aScript) {

    super(aScript);

  }

//////////////////////////////////////////////////////////////////////////////

/*<& com.esarks.arm.scripts.Method
   <method name="execute" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void execute() {
  String lMethodSignature = "execute()";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method");
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

  // Router's the first micScriptHelper to get initiated...so doesn't go through normal initialization.
  iScriptFullName = "com.esarks.arm.applicationFramework.Router";
  
//ScriptWriter~~  String lRouterPackage = <!$jac:router.package!>!getValueString();
  String lRouterPackage = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:router.package")).getValueString();
//ScriptWriter~~  String lRouterLoc = <!$jac:router.loc!>!getValueString();
  String lRouterLoc = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:router.loc")).getValueString();

System.out.println("lRouterPackage=" + lRouterPackage);
System.out.println("lRouterLoc=" + lRouterLoc);

  if (iMicLog.test(Log._APP)) {
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!RouterPackage=" + lRouterPackage);
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!RouterLoc=" + lRouterLoc);
  }
  
  XmlSchemaFactory lXmlSchemaFactory = iSymbolTable.getXmlSchemaFactory();
  if (lXmlSchemaFactory.getXmlSchemaElement("com.esarks.arm.schemas.router.root") == null) {
    loadXmlSchema("com.esarks.arm.schemas.router", path(lRouterPackage + "Schema") + ".xml");
    parseXmlSchema(lRouterPackage);
  }

//ScriptWriter~~  boolean lScan = <!com.esarks.arm.schemas.router.root!>!scan("loc", lRouterLoc);
  boolean lScan = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root")).scan("loc", lRouterLoc);

System.out.println("scan " + lRouterLoc + "=" + lScan);
//ScriptWriter~~System.out.println("script=" + <![com.esarks.arm.schemas.router.root:loc:template:script]!>);
System.out.println("script=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:template:script]"));
  
  if (iMicLog.test(Log._APP)) {
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Scan=" + lScan);
//ScriptWriter~~    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!script=" + <![com.esarks.arm.schemas.router.root:loc:template:script]!>);
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!script=" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:template:script]"));
  }

//ScriptWriter~~  if (<![com.esarks.arm.schemas.router.root:loc:template:method]!>.compareTo("") == 0) {
  if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:template:method]").compareTo("") == 0) {
//ScriptWriter~~    iScript.execMethod(loadScript(<![com.esarks.arm.schemas.router.root:loc:template:script]!>, lRouterLoc), "execute");
    iScript.execMethod(loadScript(iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:template:script]"), lRouterLoc), "execute");
  } else {
//ScriptWriter~~    iScript.execMethod(loadScript(<![com.esarks.arm.schemas.router.root:loc:template:script]!>, lRouterLoc), <![com.esarks.arm.schemas.router.root:loc:template:method]!>);
    iScript.execMethod(loadScript(iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:template:script]"), lRouterLoc), iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:template:method]"));
  }

/*<& com.esarks.arm.scripts.FinalReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.FinalReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Normal final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;

  } catch (Throwable e) {
    setContext(iScript.getMasterScript());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
    restoreContext();
    setExit();

    iScript.execMethod("com.esarks.arm.logging.ExceptionRptController", "execute", new Object[]{"", iScriptFullName, lMethodSignature, "fatal", lMethodLocation, e.getMessage(), "Unhandled exception.", "Review this exception to determine proper handling."});

    System.out.println("ExceptionRptController called..." + e.getMessage());

    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
    lExceptionServiceJeo.addJeo(lExceptionJeo);
    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
    lExceptionJeo.setTime(lExceptionTimestamp);
    lExceptionJeo.setModule(iScriptFullName);
    lExceptionJeo.setMethod(lMethodSignature);
    lExceptionJeo.setSeverity("unknown");
    lExceptionJeo.setLocation(lMethodLocation);
    lExceptionJeo.setDescription(e.getMessage());
    lExceptionJeo.setAction("unknown");
    lExceptionJeo.setResolution("unknown");

    StackTraceElement[] lStackTraceElements = e.getStackTrace();
    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
      lExceptionJeo.addJeo(lStackExceptionJeo);
    }

    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception_" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});

    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    if (iMicLog.test(Log._ERR)) {
      iMicLog.println(Log._ERR, "ERR-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!" + e.getMessage());
    }
    return;
  }
  }
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */
}
