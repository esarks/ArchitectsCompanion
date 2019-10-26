//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.scripts;

import com.esarks.jac.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
//import java.sql.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.jsp.*;

//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class ExitMethod extends com.esarks.jac.ScriptHelper  {


//ScriptWriter~~  private String iScriptPackage = "<#[$jac:script:package]#>";
  private String iScriptPackage = "com.esarks.arm.scripts";
//ScriptWriter~~  private String iScriptName = "<#[$jac:script]#>";
  private String iScriptName = "ExitMethod";

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected ExitMethod() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public ExitMethod(Script aScript) {

    super(aScript);

  }

  public void execute() {
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// Begin: com.esarks.arm.scripts.EndMethod
iOutputManager.println("// Begin: com.esarks.arm.scripts.EndMethod", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<!$jac:script:xml:return!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:return")).size() > 0) {
  }
//ScriptWriter~~  if (<!$jac:script:xml:normalReturn!>!size() == 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:normalReturn")).size() == 0) {
  }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<!$jac:script:xml:return!>!size() == 0 || <!$jac:script:xml:normalReturn!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:return")).size() == 0 || iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:normalReturn")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    if (iMicLog.test(Log._APP)) {
iOutputManager.println("    if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~      lMethodStopDate = new java.util.Date();
iOutputManager.println("      lMethodStopDate = new java.util.Date();", true);
//ScriptWriter~~      iMicLog.println(Log._APP, "Exit " + iScriptFullName + ":" + lMethodSignature + "!Normal exit!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
iOutputManager.println("      iMicLog.println(Log._APP, \"Exit \" + iScriptFullName + \":\" + lMethodSignature + \"!Normal exit!Elapsed time = \" + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
//ScriptWriter~~  if (<!$jac:script:xml:normalReturn!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:normalReturn")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    return <![$jac:script:xml:normalReturn]!>;
iOutputManager.println("    return " + iSymbolTable.translateProperties("[$jac:script:xml:normalReturn]") + ";", true);
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
//ScriptWriter~~  } catch (Throwable e) {
iOutputManager.println("  } catch (Throwable e) {", true);
//ScriptWriter~~    setContext(iScript.getMasterScript());
iOutputManager.println("    setContext(iScript.getMasterScript());", true);
//ScriptWriter~~    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
iOutputManager.println("    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties(\"$jac:event\")).set(e.getMessage());", true);
//ScriptWriter~~    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
iOutputManager.println("    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties(\"$jac:event:severity\")).set(\"fatal\");", true);
//ScriptWriter~~    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
iOutputManager.println("    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties(\"$jac:event:scriptPackage\")).set(iScriptPackage);", true);
//ScriptWriter~~    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
iOutputManager.println("    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties(\"$jac:event:scriptName\")).set(iScriptName);", true);
//ScriptWriter~~    restoreContext();
iOutputManager.println("    restoreContext();", true);
//ScriptWriter~~    setExit();
iOutputManager.println("    setExit();", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    iScript.execMethod("com.esarks.arm.logging.ExceptionRptController", "execute", new Object[]{"", iScriptFullName, lMethodSignature, "fatal", lMethodLocation, e.getMessage(), "Unhandled exception.", "Review this exception to determine proper handling."});
iOutputManager.println("    iScript.execMethod(\"com.esarks.arm.logging.ExceptionRptController\", \"execute\", new Object[]{\"\", iScriptFullName, lMethodSignature, \"fatal\", lMethodLocation, e.getMessage(), \"Unhandled exception.\", \"Review this exception to determine proper handling.\"});", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    System.out.println("ExceptionRptController called..." + e.getMessage());
iOutputManager.println("    System.out.println(\"ExceptionRptController called...\" + e.getMessage());", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
iOutputManager.println("    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();", true);
//ScriptWriter~~    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
iOutputManager.println("    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo(\"detail\");", true);
//ScriptWriter~~    lExceptionServiceJeo.addJeo(lExceptionJeo);
iOutputManager.println("    lExceptionServiceJeo.addJeo(lExceptionJeo);", true);
//ScriptWriter~~    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
iOutputManager.println("    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());", true);
//ScriptWriter~~    lExceptionJeo.setTime(lExceptionTimestamp);
iOutputManager.println("    lExceptionJeo.setTime(lExceptionTimestamp);", true);
//ScriptWriter~~    lExceptionJeo.setModule(iScriptFullName);
iOutputManager.println("    lExceptionJeo.setModule(iScriptFullName);", true);
//ScriptWriter~~    lExceptionJeo.setMethod(lMethodSignature);
iOutputManager.println("    lExceptionJeo.setMethod(lMethodSignature);", true);
//ScriptWriter~~    lExceptionJeo.setSeverity("unknown");
iOutputManager.println("    lExceptionJeo.setSeverity(\"unknown\");", true);
//ScriptWriter~~    lExceptionJeo.setLocation(lMethodLocation);
iOutputManager.println("    lExceptionJeo.setLocation(lMethodLocation);", true);
//ScriptWriter~~    lExceptionJeo.setDescription(e.getMessage());
iOutputManager.println("    lExceptionJeo.setDescription(e.getMessage());", true);
//ScriptWriter~~    lExceptionJeo.setAction("unknown");
iOutputManager.println("    lExceptionJeo.setAction(\"unknown\");", true);
//ScriptWriter~~    lExceptionJeo.setResolution("unknown");
iOutputManager.println("    lExceptionJeo.setResolution(\"unknown\");", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    StackTraceElement[] lStackTraceElements = e.getStackTrace();
iOutputManager.println("    StackTraceElement[] lStackTraceElements = e.getStackTrace();", true);
//ScriptWriter~~    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
iOutputManager.println("    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {", true);
//ScriptWriter~~      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
iOutputManager.println("      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo(\"trace\");", true);
//ScriptWriter~~      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
iOutputManager.println("      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());", true);
//ScriptWriter~~      lExceptionJeo.addJeo(lStackExceptionJeo);
iOutputManager.println("      lExceptionJeo.addJeo(lStackExceptionJeo);", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception", lExceptionServiceJeo});
iOutputManager.println("    iScript.execMethod(\"com.esarks.arm.logging.ExceptionRpt\", \"render\", new Object[]{\"logs.Exception\", lExceptionServiceJeo});", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    if (iMicLog.test(Log._APP)) {
iOutputManager.println("    if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~      lMethodStopDate = new java.util.Date();
iOutputManager.println("      lMethodStopDate = new java.util.Date();", true);
//ScriptWriter~~      iMicLog.println(Log._APP, "Exit " + iScriptFullName + ":" + lMethodSignature + "!Exception caught!" + e.getMessage() + "!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
iOutputManager.println("      iMicLog.println(Log._APP, \"Exit \" + iScriptFullName + \":\" + lMethodSignature + \"!Exception caught!\" + e.getMessage() + \"!Elapsed time = \" + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    return <![$jac:script:xml:return]!>;
iOutputManager.println("    return " + iSymbolTable.translateProperties("[$jac:script:xml:return]") + ";", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~// End: com.esarks.arm.scripts.EndMethod
iOutputManager.println("// End: com.esarks.arm.scripts.EndMethod", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
}

