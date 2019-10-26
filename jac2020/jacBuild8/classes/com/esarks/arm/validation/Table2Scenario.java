//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.validation;

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

import  com.esarks.arm.model.jeo.*;
//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class Table2Scenario extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Table2Scenario() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Table2Scenario(Script aScript) {

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

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~DEPRECATED METHOD!!  com.esarks.arm.validation.Table2Scenario:execute() is a deprecated method.  Please use exportScenario().
iOutputManager.println("DEPRECATED METHOD!!  com.esarks.arm.validation.Table2Scenario:execute() is a deprecated method.  Please use exportScenario().", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  exportScenario();
  
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

//////////////////////////////////////////////////////////////////////////////

/*<& com.esarks.arm.scripts.Method
   <method name="execute" visibility="public" return="void" >
     <document></document>
     <argument type="String"         name="aXmlScenario"        document="" />
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 * @param aXmlScenario 
 */
  public void execute( String aXmlScenario) {
  String lMethodSignature = "execute(String)";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method" + "!aXmlScenario=" + Log.toString(aXmlScenario));
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~DEPRECATED METHOD!!  com.esarks.arm.validation.Table2Scenario:execute(String) is a deprecated method.  Please use importScenario(String).
iOutputManager.println("DEPRECATED METHOD!!  com.esarks.arm.validation.Table2Scenario:execute(String) is a deprecated method.  Please use importScenario(String).", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  importScenario(aXmlScenario);
  
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

//////////////////////////////////////////////////////////////////////////////

/*<& com.esarks.arm.scripts.Method
   <method name="exportScenario" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void exportScenario() {
  String lMethodSignature = "exportScenario()";
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

  exportScenario(null);

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

//////////////////////////////////////////////////////////////////////////////

/*<& com.esarks.arm.scripts.Method
   <method name="exportScenario" visibility="public" return="void" >
     <document></document>
     <argument type="String"         name="aXmlScenario"        document="" />
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 * @param aXmlScenario 
 */
  public void exportScenario( String aXmlScenario) {
  String lMethodSignature = "exportScenario(String)";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method" + "!aXmlScenario=" + Log.toString(aXmlScenario));
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~    if (<!mic.element:tables!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:tables")).size() == 0) {
      /*<& com.esarks.arm.scripts.ReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.ReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Early exit method!Memo = " + "" + "!Value = " + "" + "!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */
    }
    
    if (aXmlScenario != null) {
      openOutput(path(aXmlScenario) + ".xml");
    } else {
//ScriptWriter~~      openOutput(path(<![mic.element:tables:name]!>) + ".xml");
      openOutput(path(iSymbolTable.translateProperties("[mic.element:tables:name]")) + ".xml");
    }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<scenario>
iOutputManager.println("<scenario>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    
//ScriptWriter~~    <!mic.element:tables:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:tables:table")).resetIterator();
//ScriptWriter~~    while (<!mic.element:tables:table!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:tables:table")).next()) {

      ServiceJeo lServiceJeo = new ServiceJeo();
//ScriptWriter~~      if (<!mic.element:tables:table:where!>!size() > 0) lServiceJeo.getRequest().setWhereClause(<![mic.element:tables:table:where]!>);
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:tables:table:where")).size() > 0) lServiceJeo.getRequest().setWhereClause(iSymbolTable.translateProperties("[mic.element:tables:table:where]"));
//ScriptWriter~~      iScript.execMethod(<![mic.element:tables:table:service]!>, "read" + <![mic.element:tables:table:name]!>, new Object[]{lServiceJeo});
      iScript.execMethod(iSymbolTable.translateProperties("[mic.element:tables:table:service]"), "read" + iSymbolTable.translateProperties("[mic.element:tables:table:name]"), new Object[]{lServiceJeo});

      if (lServiceJeo.getError() != null && lServiceJeo.getError().getSeverity() < 4) {
        System.out.println(lServiceJeo.getError().getTitle());
        System.out.println(lServiceJeo.getError().getText());
        System.out.println(lServiceJeo.getError().getLocation());
        /*<& com.esarks.arm.scripts.ReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.ReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Early exit method!Memo = " + "" + "!Value = " + "" + "!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */
      }

//ScriptWriter~~      ArrayList lArrayList = lServiceJeo.getReply().getJeoByInstanceName(<![mic.element:tables:table:jeo]!>);
      ArrayList lArrayList = lServiceJeo.getReply().getJeoByInstanceName(iSymbolTable.translateProperties("[mic.element:tables:table:jeo]"));
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <table name="<![mic.element:tables:table:name]!>" jeo="<![mic.element:tables:table:jeo]!>" service="<![mic.element:tables:table:service]!>" >
iOutputManager.println("  <table name=\"" + iSymbolTable.translateProperties("[mic.element:tables:table:name]") + "\" jeo=\"" + iSymbolTable.translateProperties("[mic.element:tables:table:jeo]") + "\" service=\"" + iSymbolTable.translateProperties("[mic.element:tables:table:service]") + "\" >", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <row>
iOutputManager.println("    <row>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        Jeo lJeo = (Jeo) lArrayList.get(lIdx);
        lJeo.log(Log._APP, iMicLog);
        String lPropertyName = "";
        int lPropertyIndex = 1;
        while ((lPropertyName = lJeo.getNameByIndex(lPropertyIndex)) != null) {
          PropertyValue lPropertyValue = lJeo.getPropertyValueByName(lPropertyName);
          if (lPropertyValue != null && lPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      <attribute name="<!%lPropertyName!>" value="<!%lPropertyValue.toString()!>" />
iOutputManager.println("      <attribute name=\"" + lPropertyName + "\" value=\"" + lPropertyValue.toString() + "\" />", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
          lPropertyIndex++;
        }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    </row>
iOutputManager.println("    </row>", true);
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
//ScriptWriter~~  </table>
iOutputManager.println("  </table>", true);
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
//ScriptWriter~~</scenario>
iOutputManager.println("</scenario>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    closeOutput();
    
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
  
//////////////////////////////////////////////////////////////////////////////

/*<& com.esarks.arm.scripts.Method
   <method name="importScenario" visibility="public" return="void" >
     <document></document>
     <argument type="String"         name="aXmlScenario"        document="" />
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 * @param aXmlScenario 
 */
  public void importScenario( String aXmlScenario) {
  String lMethodSignature = "importScenario(String)";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method" + "!aXmlScenario=" + Log.toString(aXmlScenario));
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~    <!scenario!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario")).remove();
    parseXmlPath(path(aXmlScenario) + ".xml");
//ScriptWriter~~    if (<!scenario!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario")).size() == 0) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Could not find <scenario> tag in *.xml file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Could not find <scenario> tag in *.xml file.");
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      /*<& com.esarks.arm.scripts.ReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.ReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Early exit method!Memo = " + "" + "!Value = " + "" + "!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */
    }

//ScriptWriter~~    <!scenario:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario:table")).resetIterator();
//ScriptWriter~~    while (<!scenario:table!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario:table")).next()) {
//ScriptWriter~~      if (<![scenario:table:delete]!>.equals("true")) {
      if (iSymbolTable.translateProperties("[scenario:table:delete]").equals("true")) {

//        DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
//ScriptWriter~~//        DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(<![scenario:table:name]!>.toLowerCase());
//        DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(iSymbolTable.translateProperties("[scenario:table:name]").toLowerCase());
//ScriptWriter~~        StringBuffer lSql = new StringBuffer("DELETE " + <![scenario:table:name]!>);
        StringBuffer lSql = new StringBuffer("DELETE " + iSymbolTable.translateProperties("[scenario:table:name]"));
        System.out.println(lSql);
//ScriptWriter~~        iScript.execMethod("com.esarks.jac.generators.GenerateDdl", "performSqlStatement", new Object[]{lSql, <![scenario:table:name]!>.toLowerCase()});
        iScript.execMethod("com.esarks.jac.generators.GenerateDdl", "performSqlStatement", new Object[]{lSql, iSymbolTable.translateProperties("[scenario:table:name]").toLowerCase()});
        setContext(iScript.getMasterScript());
//ScriptWriter~~        if (<!$jac:event!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).size() > 0) {
//ScriptWriter~~          System.out.println(<![$jac:event]!>);
          System.out.println(iSymbolTable.translateProperties("[$jac:event]"));
//ScriptWriter~~          <!$jac:event!>!remove();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).remove();
        }
        restoreContext();
      }
//ScriptWriter~~      if (<!scenario:table:row!>!size() == 0) continue;
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario:table:row")).size() == 0) continue;
      ServiceJeo lServiceJeo = new ServiceJeo();
//ScriptWriter~~      <!scenario:table:row!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario:table:row")).resetIterator();
//ScriptWriter~~      while (<!scenario:table:row!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario:table:row")).next()) {
//ScriptWriter~~        Jeo lJeo = com.esarks.jac.JeoFactory.getInstance().reserveJeo(<![scenario:table:jeo]!>);
        Jeo lJeo = com.esarks.jac.JeoFactory.getInstance().reserveJeo(iSymbolTable.translateProperties("[scenario:table:jeo]"));
//ScriptWriter~~        <!scenario:table:row:attribute!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario:table:row:attribute")).resetIterator();
//ScriptWriter~~        while (<!scenario:table:row:attribute!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario:table:row:attribute")).next()) {
//ScriptWriter~~          if (<!scenario:table:row:attribute:today!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario:table:row:attribute:today")).size() > 0) {
            Calendar lCalendar = Calendar.getInstance();
            lCalendar.setTime(new java.util.Date());
            int lYear = lCalendar.get(lCalendar.YEAR);
            int lMonth = lCalendar.get(lCalendar.MONTH);
            int lDay = lCalendar.get(lCalendar.DAY_OF_MONTH);
            lCalendar.setTimeInMillis((long) 0); // Make sure no miliseconds
            lCalendar.set(lYear, lMonth, lDay, 0, 0, 0);
//ScriptWriter~~            lCalendar.add(Calendar.DATE, Integer.parseInt(<![scenario:table:row:attribute:today]!>));
            lCalendar.add(Calendar.DATE, Integer.parseInt(iSymbolTable.translateProperties("[scenario:table:row:attribute:today]")));
            PropertyValue lDatePropertyValue = new PropertyValue(lCalendar.getTime());
//ScriptWriter~~            if (lJeo.getTypeByName(<![scenario:table:row:attribute:name]!>).equals("datetime")) {
            if (lJeo.getTypeByName(iSymbolTable.translateProperties("[scenario:table:row:attribute:name]")).equals("datetime")) {
//ScriptWriter~~              lJeo.setStringValueByName(<![scenario:table:row:attribute:name]!>, lDatePropertyValue.toDateString("yyyy-MM-dd HH:mm:ss.S"));
              lJeo.setStringValueByName(iSymbolTable.translateProperties("[scenario:table:row:attribute:name]"), lDatePropertyValue.toDateString("yyyy-MM-dd HH:mm:ss.S"));
            } else {
//ScriptWriter~~              if (lJeo.getStereotypeByName(<![scenario:table:row:attribute:name]!>).equals("date:yyyyMMdd")) {
              if (lJeo.getStereotypeByName(iSymbolTable.translateProperties("[scenario:table:row:attribute:name]")).equals("date:yyyyMMdd")) {
//ScriptWriter~~                lJeo.setStringValueByName(<![scenario:table:row:attribute:name]!>, lDatePropertyValue.toDateString("yyyyMMdd"));
                lJeo.setStringValueByName(iSymbolTable.translateProperties("[scenario:table:row:attribute:name]"), lDatePropertyValue.toDateString("yyyyMMdd"));
              }
            }
          } else {
//ScriptWriter~~            lJeo.setStringValueByName(<![scenario:table:row:attribute:name]!>, <![scenario:table:row:attribute:value]!>);
            lJeo.setStringValueByName(iSymbolTable.translateProperties("[scenario:table:row:attribute:name]"), iSymbolTable.translateProperties("[scenario:table:row:attribute:value]"));
          }
        }
        lServiceJeo.getRequest().addJeo(lJeo);
      }
//ScriptWriter~~      if (<!scenario:table:method!>!size() == 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("scenario:table:method")).size() == 0) {
//ScriptWriter~~        iScript.execMethod(<![scenario:table:service]!>, "batchCreate" + <![scenario:table:name]!>, new Object[]{lServiceJeo});
        iScript.execMethod(iSymbolTable.translateProperties("[scenario:table:service]"), "batchCreate" + iSymbolTable.translateProperties("[scenario:table:name]"), new Object[]{lServiceJeo});
      } else {
//ScriptWriter~~        iScript.execMethod(<![scenario:table:service]!>, <![scenario:table:method]!>, new Object[]{lServiceJeo});
        iScript.execMethod(iSymbolTable.translateProperties("[scenario:table:service]"), iSymbolTable.translateProperties("[scenario:table:method]"), new Object[]{lServiceJeo});
      }
      if (lServiceJeo.getError() != null && lServiceJeo.getError().getSeverity() < 5) {
        System.out.println(lServiceJeo.getError().getTitle());
        System.out.println(lServiceJeo.getError().getText());
        System.out.println(lServiceJeo.getError().getLocation());
      }
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
