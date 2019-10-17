//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.demonstrations.DynamicScript;

import com.esarks.jac.*;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.*;

//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class Start extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Start() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Start(Script aScript) {

    super(aScript);

  }
/*<& com.esarks.arm.scripts.Method
   <method name="execute" visibility="public" return="void" >
     <document>Execute method</document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * Execute method
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

  // Open with delete of prior file

  openOutput(path("com.esarks.demonstrations.DynamicScript.") +  "MyScript.script");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<& com.esarks.arm.scripts.Method
iOutputManager.println("<& com.esarks.arm.scripts.Method", true);
//ScriptWriter~~   <method name="execute" visibility="public" return="void" >
iOutputManager.println("   <method name=\"execute\" visibility=\"public\" return=\"void\" >", true);
//ScriptWriter~~     <document>Execute method</document>
iOutputManager.println("     <document>Execute method</document>", true);
//ScriptWriter~~   </method>
iOutputManager.println("   </method>", true);
//ScriptWriter~~&>
iOutputManager.println("&>", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!%"%" + ">"!>
iOutputManager.println("" + "%" + ">" + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~***********************************
iOutputManager.println("***********************************", true);
//ScriptWriter~~***********************************
iOutputManager.println("***********************************", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~Hello World!
iOutputManager.println("Hello World!", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~***********************************
iOutputManager.println("***********************************", true);
//ScriptWriter~~***********************************
iOutputManager.println("***********************************", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!%"<" + "%"!>
iOutputManager.println("" + "<" + "%" + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<& com.esarks.arm.scripts.FinalReturnMethod &>
iOutputManager.println("<& com.esarks.arm.scripts.FinalReturnMethod &>", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  closeOutput();

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~***********************************
iOutputManager.println("***********************************", true);
//ScriptWriter~~***********************************
iOutputManager.println("***********************************", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~Print this before running the other script...
iOutputManager.println("Print this before running the other script...", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!%path("com.esarks.demonstrations.DynamicScript.")!>
iOutputManager.println("" + path("com.esarks.demonstrations.DynamicScript.") + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~***********************************
iOutputManager.println("***********************************", true);
//ScriptWriter~~***********************************
iOutputManager.println("***********************************", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  // Compile and run the script

  iScript.execMethod("com.esarks.demonstrations.DynamicScript.MyScript", "execute");
  
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
