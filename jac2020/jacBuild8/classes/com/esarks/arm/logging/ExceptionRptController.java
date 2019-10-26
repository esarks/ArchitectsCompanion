//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.logging;

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
public class ExceptionRptController extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected ExceptionRptController() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public ExceptionRptController(Script aScript) {

    super(aScript);

  }
  
//////////////////////////////////////////////////////////////////////////////

/*<& com.esarks.arm.scripts.Method
   <method name="execute" visibility="public" return="void" >
     <document></document>
     <argument type="String"         name="aTime"             document="" />
     <argument type="String"         name="aModule"           document="" />
     <argument type="String"         name="aMethod"           document="" />
     <argument type="String"         name="aSeverity"         document="" />
     <argument type="String"         name="aLocation"         document="" />
     <argument type="String"         name="aDescription"      document="" />
     <argument type="String"         name="aAction"           document="" />
     <argument type="String"         name="aResolution"       document="" />
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 * @param aTime 
 * @param aModule 
 * @param aMethod 
 * @param aSeverity 
 * @param aLocation 
 * @param aDescription 
 * @param aAction 
 * @param aResolution 
 */
  public void execute( String aTime, String aModule, String aMethod, String aSeverity, String aLocation, String aDescription, String aAction, String aResolution) {
  String lMethodSignature = "execute(String,String,String,String,String,String,String,String)";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method" + "!aTime=" + Log.toString(aTime) + "!aModule=" + Log.toString(aModule) + "!aMethod=" + Log.toString(aMethod) + "!aSeverity=" + Log.toString(aSeverity) + "!aLocation=" + Log.toString(aLocation) + "!aDescription=" + Log.toString(aDescription) + "!aAction=" + Log.toString(aAction) + "!aResolution=" + Log.toString(aResolution));
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

/*
    setContext(iScript.getMasterScript());
    com.esarks.arm.applicationFramework.model.entity.ArmJobSlot lArmJobSlot = (com.esarks.arm.applicationFramework.model.entity.ArmJobSlot) iSymbolTable.getPropertyCollection().getPropertyValue("$mic:com.esarks.arm.applicationFramework.model.entity.ArmJobSlot", 0).getValueObject();
    restoreContext();

    String lJobSlot = Long.toHexString(lArmJobSlot.getSlot());
    String lReserved = Long.toHexString(lArmJobSlot.getReservedPropertyValue().getValueTimestamp().getTime());
    java.util.Date lDate = new java.util.Date();
    String lNow = Long.toHexString(lDate.getTime());
*/

    String lJobSlot = "1";
    String lReserved = new java.util.Date().toString();
    String lNow = lReserved;
    com.esarks.jac.OutputManager lOutputManager = iOutputManager;
    iOutputManager = new com.esarks.jac.OutputManager();

//    openOutput(path(getProperty("$jac:path:exception") + ".") + lJobSlot + "_" + lReserved + "_" + lNow + ".xml");

    String iDebugPath = getProperty("$jac:path:exception");
    String iDebugPathPath = path(getProperty("$jac:path:exception") + ".");
    

    openOutput(path(getProperty("$jac:path:exception")) + "Exception.xml");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<exception>
iOutputManager.println("<exception>", true);
//ScriptWriter~~  <time><<%%>![CDATA[<!%aTime!>]]></time>
iOutputManager.println("  <time><", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
{
//ScriptWriter~~~
iOutputManager.println("![CDATA[" + aTime + "]]></time>", true);
//ScriptWriter~~  <module><<%%>![CDATA[<!%aModule!>]]></module>
iOutputManager.println("  <module><", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
{
//ScriptWriter~~~
iOutputManager.println("![CDATA[" + aModule + "]]></module>", true);
//ScriptWriter~~  <method><<%%>![CDATA[<!%aMethod!>]]></method>
iOutputManager.println("  <method><", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
{
//ScriptWriter~~~
iOutputManager.println("![CDATA[" + aMethod + "]]></method>", true);
//ScriptWriter~~  <severity><<%%>![CDATA[<!%aSeverity!>]]></severity>
iOutputManager.println("  <severity><", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
{
//ScriptWriter~~~
iOutputManager.println("![CDATA[" + aSeverity + "]]></severity>", true);
//ScriptWriter~~  <location><<%%>![CDATA[<!%aLocation!>]]></location>
iOutputManager.println("  <location><", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
{
//ScriptWriter~~~
iOutputManager.println("![CDATA[" + aLocation + "]]></location>", true);
//ScriptWriter~~  <description><<%%>![CDATA[<!%aDescription!>]]></description>
iOutputManager.println("  <description><", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
{
//ScriptWriter~~~
iOutputManager.println("![CDATA[" + aDescription + "]]></description>", true);
//ScriptWriter~~  <action><<%%>![CDATA[<!%aAction!>]]></action>
iOutputManager.println("  <action><", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
{
//ScriptWriter~~~
iOutputManager.println("![CDATA[" + aAction + "]]></action>", true);
//ScriptWriter~~  <resolution><<%%>![CDATA[<!%aResolution!>]]></resolution>
iOutputManager.println("  <resolution><", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
{
//ScriptWriter~~~
iOutputManager.println("![CDATA[" + aResolution + "]]></resolution>", true);
//ScriptWriter~~</exception>
iOutputManager.println("</exception>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    closeOutput();
    iOutputManager = lOutputManager;
    lOutputManager = null;
    if (true) return;
        
    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
    com.esarks.arm.logging.ExceptionJeo lDocumentJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
    lServiceJeo.addJeo(lDocumentJeo);

    lDocumentJeo.setTime(aTime);
    lDocumentJeo.setModule(aModule);
    lDocumentJeo.setSeverity(aSeverity);
    lDocumentJeo.setLocation(aLocation);
    lDocumentJeo.setDescription(aDescription);
    lDocumentJeo.setAction(aAction);
    lDocumentJeo.setResolution(aResolution);

//    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{getProperty("$jac:path:exception") + "." + lJobSlot + "_" + lReserved + "_" + lNow, lServiceJeo});
    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{getProperty("$jac:path:exception") + "." + "Exception", lServiceJeo});

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
