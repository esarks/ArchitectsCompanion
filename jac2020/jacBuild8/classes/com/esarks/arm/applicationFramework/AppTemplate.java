//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.applicationFramework;

import com.esarks.jac.*;
import com.esarks.mic.*;
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

//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class AppTemplate extends com.esarks.mic.View  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected AppTemplate() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public AppTemplate(Script aScript) {

    super(aScript);

  }

//////////////////////////////////////////////////////////////////////////////

/*<& com.esarks.arm.scripts.Method
   <method name="onLoad" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
//ScriptWriter~~~
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
//ScriptWriter~~~
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void onLoad() {
  String lMethodSignature = "onLoad()";
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

    setContext(iScript.getMasterScript());
//ScriptWriter~~    String lPropertySet = <![com.esarks.arm.schemas.router.root:loc:propertySet]!>;
    String lPropertySet = iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:propertySet]");
    System.out.println("AppTemplate PropertySet = " + lPropertySet);
    XmlSchemaFactory lXmlSchemaFactory = iSymbolTable.getXmlSchemaFactory();
    if (lXmlSchemaFactory.getXmlSchemaElement("com.esarks.arm.schemas.properties.root") == null) {
      loadXmlSchema("com.esarks.arm.schemas.properties", path("com.esarks.arm.schemas.PropertiesSchema") + ".xml");
//ScriptWriter~~      parseXmlSchema(<![com.esarks.arm.schemas.router.root:loc:propertySet:path]!>);
      parseXmlSchema(iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:propertySet:path]"));

//ScriptWriter~~      boolean lScan = <!com.esarks.arm.schemas.properties.root:property!>!scan(lPropertySet);
      boolean lScan = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property")).scan(lPropertySet);
      // Open all the DbConnections possible...
      DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
//ScriptWriter~~      <!com.esarks.arm.schemas.properties.root:property:dbConnection!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbConnection")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.properties.root:property:dbConnection!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbConnection")).next()) {
//ScriptWriter~~        String lName = <![com.esarks.arm.schemas.properties.root:property:dbConnection:name]!>;
        String lName = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:name]");
//ScriptWriter~~        String lJdbcClass = <![com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcClass]!>;
        String lJdbcClass = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcClass]");
//ScriptWriter~~        String lJdbcConnection = <![com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcConnection]!>;
        String lJdbcConnection = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcConnection]");
//ScriptWriter~~        String lJdbcUser = <![com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcUser]!>;
        String lJdbcUser = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcUser]");
//ScriptWriter~~        String lJdbcPassword = <![com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcPassword]!>;
        String lJdbcPassword = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcPassword]");
//ScriptWriter~~        String lDbTypes = <![com.esarks.arm.schemas.properties.root:property:dbConnection:dbTypes]!>;
        String lDbTypes = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:dbTypes]");
//ScriptWriter~~        String lCatalog = <![com.esarks.arm.schemas.properties.root:property:dbConnection:catalog]!>;
        String lCatalog = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:catalog]");
//ScriptWriter~~        String lOwner = <![com.esarks.arm.schemas.properties.root:property:dbConnection:owner]!>;
        String lOwner = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:owner]");
//ScriptWriter~~        String lStereotype = <![com.esarks.arm.schemas.properties.root:property:dbConnection:stereotype]!>;
        String lStereotype = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:stereotype]");
//ScriptWriter~~        String lOpenCountString = <![com.esarks.arm.schemas.properties.root:property:dbConnection:openCount]!>;
        String lOpenCountString = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:openCount]");
        int lOpenCount = 1;
        if (!lOpenCountString.equals("")) lOpenCount = Integer.parseInt(lOpenCountString);
  
        for (int lIdx=0; lIdx < lOpenCount; lIdx++) {
          DbConnection lDbConnection = new DbConnection(lName);
          lDbConnection.setCatalog(lCatalog);
          lDbConnection.setOwner(lOwner);
          lDbConnection.setDbTypes(lDbTypes);
          lDbConnection.setStereotype(lStereotype);
          lDbConnectionFactory.register(lDbConnection);
          System.out.println("Connection " + lIdx + " at " + lName + "=" + lDbConnection.connect(lJdbcClass, lJdbcConnection, lJdbcUser, lJdbcPassword));
        }
        
//ScriptWriter~~        <!com.esarks.arm.schemas.properties.root:property:dbConnection:alias!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbConnection:alias")).resetIterator();
//ScriptWriter~~        while (<!com.esarks.arm.schemas.properties.root:property:dbConnection:alias!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbConnection:alias")).next()) {
//ScriptWriter~~          lDbConnectionFactory.alias(lName, <![com.esarks.arm.schemas.properties.root:property:dbConnection:alias]!>);
          lDbConnectionFactory.alias(lName, iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:alias]"));
        }
  
      }
  
      try {
        // Associate all the objects to a DbConnection...
//ScriptWriter~~        <!com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection")).resetIterator();
//ScriptWriter~~        while (<!com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection")).next()) {
//ScriptWriter~~          DbConnection lDbConnection = lDbConnectionFactory.getDbConnection(<![com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:name]!>);
          DbConnection lDbConnection = lDbConnectionFactory.getDbConnection(iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:name]"));
//ScriptWriter~~          <!com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object")).resetIterator();
//ScriptWriter~~          while (<!com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object")).next()) {
//ScriptWriter~~            lDbConnectionFactory.associateObjectConnection(<![com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object:name]!>, lDbConnection);
            lDbConnectionFactory.associateObjectConnection(iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object:name]"), lDbConnection);
          }
        }
      } catch(Throwable e) {
        System.out.println(e);
        System.out.println("Failed to associate all database objects to a DbConnection.  Please verify the <dbObjects> section of Properties.xml.");
        restoreContext();
        return;
      }
    }

//ScriptWriter~~    if (<!com.esarks.arm.schemas.router.root:loc:securityManager!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:securityManager")).size() > 0) {
//ScriptWriter~~      iSecurityManager = (com.esarks.mic.SecurityManager) loadScript(<![com.esarks.arm.schemas.router.root:loc:securityManager]!>);
      iSecurityManager = (com.esarks.mic.SecurityManager) loadScript(iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:securityManager]"));
    } else {
      iSecurityManager = new com.esarks.mic.SecurityManager();
    }

    String lInstance = Long.toString(new java.util.Date().getTime());
    int lInstanceCount = 0;
//ScriptWriter~~    <!com.esarks.arm.schemas.router.root:loc:template:region!>& {
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:template:region")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:template:region")).next())  {
      // Instantiate the region.
//ScriptWriter~~      String lRegion = <![com.esarks.arm.schemas.router.root:loc:template:region]!>;
      String lRegion = iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:template:region]");
//ScriptWriter~~      com.esarks.mic.View lView = (com.esarks.mic.View) loadScript(<![com.esarks.arm.schemas.router.root:loc:" + lRegion + ":script]!>, "com.esarks.schemas.router.loc:" + lRegion);
      com.esarks.mic.View lView = (com.esarks.mic.View) loadScript(iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:" + lRegion + ":script]"), "com.esarks.schemas.router.loc:" + lRegion);
System.out.println("Region: " + lRegion);
//ScriptWriter~~      <!com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add!>& {
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add")).next())  {
//ScriptWriter~~System.out.println("Add: " + <![com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:script]!>);
System.out.println("Add: " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:script]"));

//ScriptWriter~~        if (<!com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:instance!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:instance")).size() > 0) {
//ScriptWriter~~          com.esarks.mic.View lAdd = (com.esarks.mic.View) loadScript(<![com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:script]!>, <![com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:instance]!>);
          com.esarks.mic.View lAdd = (com.esarks.mic.View) loadScript(iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:script]"), iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:instance]"));
          lView.addView(lAdd);
        } else {
//ScriptWriter~~          lView.addView(<![com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:script]!>);
          lView.addView(iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:script]"));
//ScriptWriter~~          if (<![com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:open]!>.equals("true")) lView.openView(<![com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:script]!>);
          if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:open]").equals("true")) lView.openView(iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:" + lRegion + ":add:script]"));
        }
      }      
    }

    restoreContext();

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
   <method name="handlePost" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void handlePost() {
  String lMethodSignature = "handlePost()";
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

//ScriptWriter~~    <!com.esarks.arm.schemas.router.root:loc:template:region!>& {
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:template:region")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:template:region")).next())  {
//ScriptWriter~~      String lRegion = <![com.esarks.arm.schemas.router.root:loc:template:region]!>;
      String lRegion = iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:template:region]");
//ScriptWriter~~      iScript.execMethod(loadScript(<![com.esarks.arm.schemas.router.root:loc:" + lRegion + ":script]!>, lRegion), "handlePost");
      iScript.execMethod(loadScript(iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:" + lRegion + ":script]"), lRegion), "handlePost");
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

    setContext(iScript.getMasterScript());

    ServletRequest lServletRequest = getServletRequest();

    boolean lHrefError = false;
    String lScript = "";
    String lInstance = "";
    String lMethod = "";
    String lArgument = null;
    
    String lHref = lServletRequest.getParameter("href");
    if (lHref != null && lHref != "") {
System.out.println("href = " + lHref);
//ScriptWriter~~      <!$jac:href:id!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id")).resetIterator();
//ScriptWriter~~      if (<!$jac:href!>!scan("id", lHref)) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href")).scan("id", lHref)) {
System.out.println("TRUE");
//ScriptWriter~~        lScript = (String) <![$jac:href:id:script]!>;
        lScript = (String) iSymbolTable.translateProperties("[$jac:href:id:script]");
//ScriptWriter~~        lInstance = (String) <![$jac:href:id:instance]!>;
        lInstance = (String) iSymbolTable.translateProperties("[$jac:href:id:instance]");
//ScriptWriter~~        lMethod = (String) <![$jac:href:id:method]!>;
        lMethod = (String) iSymbolTable.translateProperties("[$jac:href:id:method]");
//ScriptWriter~~        if (<!$jac:href:id:argument!>!size() > 0) lArgument = (String) <![$jac:href:id:argument]!>;
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:argument")).size() > 0) lArgument = (String) iSymbolTable.translateProperties("[$jac:href:id:argument]");
      } else {
System.out.println("FALSE");
        lHrefError = true;
      }
    } else {
//ScriptWriter~~      lScript = <![com.esarks.arm.schemas.router.root:loc:script:path]!>;
      lScript = iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:script:path]");
//ScriptWriter~~      lInstance = <![com.esarks.arm.schemas.router.root:loc:script:instance]!>;
      lInstance = iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:script:instance]");
//ScriptWriter~~      lMethod = <![com.esarks.arm.schemas.router.root:loc:script:method]!>;
      lMethod = iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:script:method]");
//ScriptWriter~~      if (<!com.esarks.arm.schemas.router.root:loc:script:argument!>!size() > 0) lArgument = <![com.esarks.arm.schemas.router.root:loc:script:argument]!>;
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:script:argument")).size() > 0) lArgument = iSymbolTable.translateProperties("[com.esarks.arm.schemas.router.root:loc:script:argument]");
    }

System.out.println("-->1 " + lScript + " " + lInstance + " " + lMethod + " " + lArgument);

    if (!lScript.equals("")) handlePost();

System.out.println("-->2 " + lScript + " " + lInstance + " " + lMethod + " " + lArgument);

    if (!lScript.equals("") && !lMethod.equals("handlePost")) {
      MicScriptHelper lScriptHelper = (MicScriptHelper) loadScript(lScript, lInstance);
      if (true) { // || lScriptHelper.checkSecurity(iSecurityManager)) {        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        if (lArgument == null) {
          iScript.execMethod(lScriptHelper, lMethod);
        } else {
          iScript.execMethod(lScriptHelper, lMethod, new Object[] {lArgument});
        }
      }
    }

System.out.println("-->3 " + lScript + " " + lInstance + " " + lMethod + " " + lArgument);

//ScriptWriter~~    <!$jac:href!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href")).remove();

  restoreContext();

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
   <method name="findRegion" visibility="public" return="boolean" >
     <document></document>
     <argument type="String" name="aRegion" />
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 * @param aRegion 
 */
  public boolean findRegion( String aRegion) {
  String lMethodSignature = "findRegion(String)";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method" + "!aRegion=" + Log.toString(aRegion));
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~  if (<!com.esarks.arm.schemas.router.root:loc:" + aRegion + "!>!size() > 0) return true;
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.router.root:loc:" + aRegion + "")).size() > 0) return true;
  
/*<& com.esarks.arm.scripts.FinalReturnMethod
  <return>
    <normal>false</normal>
    <error>false</error>
  </return>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.FinalReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Normal final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return false;

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
    return false;
  }
  }
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */
  
}
