package com.esarks.arm.scripts;

import com.esarks.jac.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class FinalReturnMethod extends com.esarks.jac.ScriptHelper  {


  private String iScriptPackage = "com.esarks.arm.scripts";
  private String iScriptName = "FinalReturnMethod";

  protected FinalReturnMethod() {
  }

  public FinalReturnMethod(Script aScript) {

    super(aScript);

  }

  public void execute() {
    
{
iOutputManager.println("", false);
iOutputManager.println("// Begin: com.esarks.arm.scripts.FinalReturnMethod", true);
iOutputManager.println("", false);
}

  if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:script:xml:return:cantBeReached")).size() == 0) {

    if (!iSymbolTable.translateProperties("[$jac:script:xml:return:supressLog]").equals("true")) {
{
iOutputManager.println("", false);
iOutputManager.println("    if (iMicLog.test(Log._APP)) {", true);
iOutputManager.println("      lMethodStopDate = new java.util.Date();", true);
iOutputManager.println("      iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Normal final exit method!Elapsed time = \" + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));", true);
iOutputManager.println("    }", true);
iOutputManager.println("", false);
}

    }
    if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:script:xml:return:normal")).size() > 0) {
{
iOutputManager.println("", false);
iOutputManager.println("    return " + iSymbolTable.translateProperties("[$jac:script:xml:return:normal]") + ";", true);
iOutputManager.println("", false);
}

    }
    if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:script:xml:return:normal")).size() == 0) {
{
iOutputManager.println("", false);
iOutputManager.println("    return;", true);
iOutputManager.println("", false);
}

    }
  }
{
iOutputManager.println("", false);
iOutputManager.println("", true);
iOutputManager.println("  } catch (Throwable e) {", true);
iOutputManager.println("    setContext(iScript.getMasterScript());", true);
iOutputManager.println("    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties(\"$jac:event\")).set(e.getMessage());", true);
iOutputManager.println("    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties(\"$jac:event:severity\")).set(\"fatal\");", true);
iOutputManager.println("    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties(\"$jac:event:scriptPackage\")).set(iScriptPackage);", true);
iOutputManager.println("    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties(\"$jac:event:scriptName\")).set(iScriptName);", true);
iOutputManager.println("    restoreContext();", true);
iOutputManager.println("    setExit();", true);
iOutputManager.println("", true);
iOutputManager.println("    iScript.execMethod(\"com.esarks.arm.logging.ExceptionRptController\", \"execute\", new Object[]{\"\", iScriptFullName, lMethodSignature, \"fatal\", lMethodLocation, e.getMessage(), \"Unhandled exception.\", \"Review this exception to determine proper handling.\"});", true);
iOutputManager.println("", true);
iOutputManager.println("    System.out.println(\"ExceptionRptController called...\" + e.getMessage());", true);
iOutputManager.println("", true);
iOutputManager.println("    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();", true);
iOutputManager.println("    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo(\"detail\");", true);
iOutputManager.println("    lExceptionServiceJeo.addJeo(lExceptionJeo);", true);
iOutputManager.println("    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());", true);
iOutputManager.println("    lExceptionJeo.setTime(lExceptionTimestamp);", true);
iOutputManager.println("    lExceptionJeo.setModule(iScriptFullName);", true);
iOutputManager.println("    lExceptionJeo.setMethod(lMethodSignature);", true);
iOutputManager.println("    lExceptionJeo.setSeverity(\"unknown\");", true);
iOutputManager.println("    lExceptionJeo.setLocation(lMethodLocation);", true);
iOutputManager.println("    lExceptionJeo.setDescription(e.getMessage());", true);
iOutputManager.println("    lExceptionJeo.setAction(\"unknown\");", true);
iOutputManager.println("    lExceptionJeo.setResolution(\"unknown\");", true);
iOutputManager.println("", true);
iOutputManager.println("    StackTraceElement[] lStackTraceElements = e.getStackTrace();", true);
iOutputManager.println("    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {", true);
iOutputManager.println("      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo(\"trace\");", true);
iOutputManager.println("      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());", true);
iOutputManager.println("      lExceptionJeo.addJeo(lStackExceptionJeo);", true);
iOutputManager.println("    }", true);
iOutputManager.println("", true);
iOutputManager.println("    iScript.execMethod(\"com.esarks.arm.logging.ExceptionRpt\", \"render\", new Object[]{\"logs.Exception_\" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});", true);
iOutputManager.println("", true);
iOutputManager.println("    if (iMicLog.test(Log._APP)) {", true);
iOutputManager.println("      lMethodStopDate = new java.util.Date();", true);
iOutputManager.println("      iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Error final exit method!Elapsed time = \" + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));", true);
iOutputManager.println("    }", true);
iOutputManager.println("    if (iMicLog.test(Log._ERR)) {", true);
iOutputManager.println("      iMicLog.println(Log._ERR, \"ERR-\" + iScriptFullName + \":\" + lMethodSignature + \"!Error final exit method!\" + e.getMessage());", true);
iOutputManager.println("    }", true);
iOutputManager.println("", false);
}

  if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:script:xml:return:error")).size() > 0) {
{
iOutputManager.println("", false);
iOutputManager.println("    return " + iSymbolTable.translateProperties("[$jac:script:xml:return:error]") + ";", true);
iOutputManager.println("", false);
}

  } else {
{
iOutputManager.println("", false);
iOutputManager.println("    return;", true);
iOutputManager.println("", false);
}

  }
{
iOutputManager.println("", false);
iOutputManager.println("  }", true);
iOutputManager.println("  }", true);
iOutputManager.println("// End: com.esarks.arm.scripts.FinalReturnMethod", true);
iOutputManager.println("", false);
}

  }
}

