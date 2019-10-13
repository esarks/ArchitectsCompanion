//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.jac.jrun;

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
public class Jrun extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Jrun() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Jrun(Script aScript) {

    super(aScript);

  }

//////////////////////////////////////////////////////////////////////////////

/*<& com.esarks.arm.scripts.Method
   <method name="executePath" visibility="public" return="void" >
     <document></document>
     <argument type="String" name="aXmlPath"  document="" />
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 * @param aXmlPath 
 */
  public void executePath( String aXmlPath) {
  String lMethodSignature = "executePath(String)";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method" + "!aXmlPath=" + Log.toString(aXmlPath));
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

    execute(path(aXmlPath) + ".jrun");

/*<& com.esarks.arm.scripts.FinalReturnMethod 
  <return suppressExceptionReport="true"/>
&>*/
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
     <argument type="String" name="aXml"  document="" />
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 * @param aXml 
 */
  public void execute( String aXml) {
  String lMethodSignature = "execute(String)";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method" + "!aXml=" + Log.toString(aXml));
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

    try {
    System.out.println("Jrun");

    parseXmlPath(aXml);

    String lClasspath = "";
//ScriptWriter~~    <!jacrun:classpath:path!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:classpath:path")).resetIterator();
//ScriptWriter~~    while (<!jacrun:classpath:path!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:classpath:path")).next()) {
//ScriptWriter~~      lClasspath = lClasspath + path(<![jacrun:classpath:path]!>) + ";";
      lClasspath = lClasspath + path(iSymbolTable.translateProperties("[jacrun:classpath:path]")) + ";";
    }
//ScriptWriter~~    <!jacrun:classpath:workPath!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:classpath:workPath")).resetIterator();
//ScriptWriter~~    while (<!jacrun:classpath:workPath!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:classpath:workPath")).next()) {
//ScriptWriter~~      lClasspath = lClasspath + workPath(<![jacrun:classpath:workPath]!>) + ";";
      lClasspath = lClasspath + workPath(iSymbolTable.translateProperties("[jacrun:classpath:workPath]")) + ";";
    }
//ScriptWriter~~    <!jacrun:classpath:homePath!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:classpath:homePath")).resetIterator();
//ScriptWriter~~    while (<!jacrun:classpath:homePath!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:classpath:homePath")).next()) {
//ScriptWriter~~      lClasspath = lClasspath + homePath(<![jacrun:classpath:homePath]!>) + ";";
      lClasspath = lClasspath + homePath(iSymbolTable.translateProperties("[jacrun:classpath:homePath]")) + ";";
    }
    if (lClasspath.length() > 0) {
      System.setProperty("java.class.path", System.getProperty("java.class.path") + ";" + lClasspath);
      System.out.println("Classpath=" + System.getProperty("java.class.path"));
    }
//    System.out.println("Classpath=" + System.getProperty("java.class.path"));
    
//ScriptWriter~~    <!jacrun:script!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script")).resetIterator();
//ScriptWriter~~    while (<!jacrun:script!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script")).next()) {
//ScriptWriter~~      if (<!jacrun:script:name!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:name")).size() > 0) {
//ScriptWriter~~        int lPause = <!jacrun:script:pause!>!size();
        int lPause = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:pause")).size();
//ScriptWriter~~        if (lPause > 0) pause("At Jrun, before loadScript(" + <![jacrun:script:name]!> + ").  Press ENTER to continue...");
        if (lPause > 0) pause("At Jrun, before loadScript(" + iSymbolTable.translateProperties("[jacrun:script:name]") + ").  Press ENTER to continue...");
        Object lLoadObject = null;
//ScriptWriter~~        if (<!jacrun:script:noScript!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:noScript")).size() > 0) {
          System.out.println("Jrun: noScript set");
//ScriptWriter~~          lLoadObject = iScript.loadScript(<![jacrun:script:name]!>, null);
          lLoadObject = iScript.loadScript(iSymbolTable.translateProperties("[jacrun:script:name]"), null);
        } else {
//ScriptWriter~~          lLoadObject = loadScript(<![jacrun:script:name]!>);
          lLoadObject = loadScript(iSymbolTable.translateProperties("[jacrun:script:name]"));
        }
        if (lLoadObject == null) {
//ScriptWriter~~          System.out.println("Jrun: !WARNING! Cannot open script " + <![jacrun:script:name]!>);
          System.out.println("Jrun: !WARNING! Cannot open script " + iSymbolTable.translateProperties("[jacrun:script:name]"));
        }
//ScriptWriter~~        if (<!jacrun:script:args!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:args")).size() > 0) {
//ScriptWriter~~          System.out.print("Jrun: " + <![jacrun:script:name]!> + "::" + <![jacrun:script:method]!> + "(");
          System.out.print("Jrun: " + iSymbolTable.translateProperties("[jacrun:script:name]") + "::" + iSymbolTable.translateProperties("[jacrun:script:method]") + "(");
//ScriptWriter~~          String lArgs[] = new String[<!jacrun:script:args:arg!>!size()];
          String lArgs[] = new String[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:args:arg")).size()];
//ScriptWriter~~          <!jacrun:script:args:arg!>& {
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:args:arg")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:args:arg")).next())  {
//ScriptWriter~~            lArgs[<!jacrun:script:args:arg!>!getIterator()-1] = argPath("", <![jacrun:script:args:arg]!>);
            lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:args:arg")).getIterator()-1] = argPath("", iSymbolTable.translateProperties("[jacrun:script:args:arg]"));
//ScriptWriter~~            System.out.print(" ^" + lArgs[<!jacrun:script:args:arg!>!getIterator()-1] + "^ ");
            System.out.print(" ^" + lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:args:arg")).getIterator()-1] + "^ ");
          }
          System.out.println(")");
//ScriptWriter~~          iScript.execMethod(lLoadObject, <![jacrun:script:method]!>, new Object[] {lArgs});
          iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[jacrun:script:method]"), new Object[] {lArgs});
        } else {
//ScriptWriter~~          if (<!jacrun:script:argument!>!size() == 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:argument")).size() == 0) {
//ScriptWriter~~            System.out.println("Jrun: " + <![jacrun:script:name]!> + "::" + <![jacrun:script:method]!> + "()");
            System.out.println("Jrun: " + iSymbolTable.translateProperties("[jacrun:script:name]") + "::" + iSymbolTable.translateProperties("[jacrun:script:method]") + "()");
//ScriptWriter~~            iScript.execMethod(lLoadObject, <![jacrun:script:method]!>);
            iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[jacrun:script:method]"));
          } else {
//ScriptWriter~~            if (<![jacrun:script:argument]!>.equals("?this")) <!jacrun:script:argument!>!set(aXml);
            if (iSymbolTable.translateProperties("[jacrun:script:argument]").equals("?this")) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:argument")).set(aXml);
//ScriptWriter~~            if (<![jacrun:script:argument2]!>.equals("?this")) <!jacrun:script:argument2!>!set(aXml);
            if (iSymbolTable.translateProperties("[jacrun:script:argument2]").equals("?this")) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:argument2")).set(aXml);
//ScriptWriter~~            if (<!jacrun:script:argument2!>!size() == 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:argument2")).size() == 0) {
//ScriptWriter~~              System.out.println("Jrun: " + <![jacrun:script:name]!> + "::" + <![jacrun:script:method]!> + "(" + <![jacrun:script:argument]!> + ")");
              System.out.println("Jrun: " + iSymbolTable.translateProperties("[jacrun:script:name]") + "::" + iSymbolTable.translateProperties("[jacrun:script:method]") + "(" + iSymbolTable.translateProperties("[jacrun:script:argument]") + ")");
//ScriptWriter~~              iScript.execMethod(lLoadObject, <![jacrun:script:method]!>, new Object[]{<![jacrun:script:argument]!>});
              iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[jacrun:script:method]"), new Object[]{iSymbolTable.translateProperties("[jacrun:script:argument]")});
            } else {
//ScriptWriter~~              System.out.println("Jrun: " + <![jacrun:script:name]!> + "::" + <![jacrun:script:method]!> + "(" + <![jacrun:script:argument]!> + ", " + <![jacrun:script:argument2]!> + ")");
              System.out.println("Jrun: " + iSymbolTable.translateProperties("[jacrun:script:name]") + "::" + iSymbolTable.translateProperties("[jacrun:script:method]") + "(" + iSymbolTable.translateProperties("[jacrun:script:argument]") + ", " + iSymbolTable.translateProperties("[jacrun:script:argument2]") + ")");
//ScriptWriter~~              iScript.execMethod(lLoadObject, <![jacrun:script:method]!>, new Object[]{<![jacrun:script:argument]!>,<![jacrun:script:argument2]!>});
              iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[jacrun:script:method]"), new Object[]{iSymbolTable.translateProperties("[jacrun:script:argument]"),iSymbolTable.translateProperties("[jacrun:script:argument2]")});
            }
          }
        }
        lLoadObject = null;
//ScriptWriter~~        if (lPause > 0) pause("At Jrun, before unloadScript(" + <![jacrun:script:name]!> + ").  Press ENTER to continue...");
        if (lPause > 0) pause("At Jrun, before unloadScript(" + iSymbolTable.translateProperties("[jacrun:script:name]") + ").  Press ENTER to continue...");
//ScriptWriter~~        unloadScript(<![jacrun:script:name]!>);
        unloadScript(iSymbolTable.translateProperties("[jacrun:script:name]"));
//ScriptWriter~~        if (lPause > 0) pause("At Jrun, after unloadScript(" + <![jacrun:script:name]!> + ").  Press ENTER to continue...");
        if (lPause > 0) pause("At Jrun, after unloadScript(" + iSymbolTable.translateProperties("[jacrun:script:name]") + ").  Press ENTER to continue...");
      } else {
//ScriptWriter~~        int lPause = <!jacrun:pause!>!size();
        int lPause = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:pause")).size();
//ScriptWriter~~        if (lPause > 0) pause("At Jrun, before loadScript(" + <![jacrun:script]!> + ").  Press ENTER to continue...");
        if (lPause > 0) pause("At Jrun, before loadScript(" + iSymbolTable.translateProperties("[jacrun:script]") + ").  Press ENTER to continue...");
        Object lLoadObject = null;
//ScriptWriter~~        if (<!jacrun:noScript!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:noScript")).size() > 0) {
          System.out.println("Jrun: noScript set");
//ScriptWriter~~          lLoadObject = iScript.loadScript(<![jacrun:script]!>, null);
          lLoadObject = iScript.loadScript(iSymbolTable.translateProperties("[jacrun:script]"), null);
        } else {
//ScriptWriter~~          lLoadObject = loadScript(<![jacrun:script]!>);
          lLoadObject = loadScript(iSymbolTable.translateProperties("[jacrun:script]"));
        }
        if (lLoadObject == null) {
//ScriptWriter~~          System.out.println("Jrun: !WARNING! Cannot open script " + <![jacrun:script]!>);
          System.out.println("Jrun: !WARNING! Cannot open script " + iSymbolTable.translateProperties("[jacrun:script]"));
        }
//ScriptWriter~~        if (<!jacrun:args!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:args")).size() > 0) {
//ScriptWriter~~          System.out.print("Jrun: " + <![jacrun:script]!> + "::" + <![jacrun:method]!> + "(");
          System.out.print("Jrun: " + iSymbolTable.translateProperties("[jacrun:script]") + "::" + iSymbolTable.translateProperties("[jacrun:method]") + "(");
//ScriptWriter~~          String lArgs[] = new String[<!jacrun:args:arg!>!size()];
          String lArgs[] = new String[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:args:arg")).size()];
//ScriptWriter~~          <!jacrun:args:arg!>& {
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:args:arg")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:args:arg")).next())  {
//ScriptWriter~~            lArgs[<!jacrun:args:arg!>!getIterator()-1] = argPath("", <![jacrun:args:arg]!>);
            lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:args:arg")).getIterator()-1] = argPath("", iSymbolTable.translateProperties("[jacrun:args:arg]"));
//ScriptWriter~~            System.out.print(" ^" + lArgs[<!jacrun:args:arg!>!getIterator()-1] + "^ ");
            System.out.print(" ^" + lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:args:arg")).getIterator()-1] + "^ ");
          }
          System.out.println(")");
//ScriptWriter~~          iScript.execMethod(lLoadObject, <![jacrun:method]!>, new Object[] {lArgs});
          iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[jacrun:method]"), new Object[] {lArgs});
        } else {
//ScriptWriter~~          if (<!jacrun:argument!>!size() == 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:argument")).size() == 0) {
//ScriptWriter~~            System.out.println("Jrun: " + <![jacrun:script]!> + "::" + <![jacrun:method]!> + "()");
            System.out.println("Jrun: " + iSymbolTable.translateProperties("[jacrun:script]") + "::" + iSymbolTable.translateProperties("[jacrun:method]") + "()");
//ScriptWriter~~            iScript.execMethod(lLoadObject, <![jacrun:method]!>);
            iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[jacrun:method]"));
          } else {
//ScriptWriter~~            if (<![jacrun:argument]!>.equals("?this")) <!jacrun:argument!>!set(aXml);
            if (iSymbolTable.translateProperties("[jacrun:argument]").equals("?this")) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:argument")).set(aXml);
//ScriptWriter~~            if (<![jacrun:argument2]!>.equals("?this")) <!jacrun:argument2!>!set(aXml);
            if (iSymbolTable.translateProperties("[jacrun:argument2]").equals("?this")) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:argument2")).set(aXml);
//ScriptWriter~~            if (<!jacrun:argument2!>!size() == 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:argument2")).size() == 0) {
//ScriptWriter~~              System.out.println("Jrun: " + <![jacrun:script]!> + "::" + <![jacrun:method]!> + "(" + <![jacrun:argument]!> + ")");
              System.out.println("Jrun: " + iSymbolTable.translateProperties("[jacrun:script]") + "::" + iSymbolTable.translateProperties("[jacrun:method]") + "(" + iSymbolTable.translateProperties("[jacrun:argument]") + ")");
//ScriptWriter~~              iScript.execMethod(lLoadObject, <![jacrun:method]!>, new Object[]{<![jacrun:argument]!>});
              iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[jacrun:method]"), new Object[]{iSymbolTable.translateProperties("[jacrun:argument]")});
            } else {
//ScriptWriter~~              System.out.println("Jrun: " + <![jacrun:script]!> + "::" + <![jacrun:method]!> + "(" + <![jacrun:argument]!> + ", " + <![jacrun:argument2]!> + ")");
              System.out.println("Jrun: " + iSymbolTable.translateProperties("[jacrun:script]") + "::" + iSymbolTable.translateProperties("[jacrun:method]") + "(" + iSymbolTable.translateProperties("[jacrun:argument]") + ", " + iSymbolTable.translateProperties("[jacrun:argument2]") + ")");
//ScriptWriter~~              iScript.execMethod(lLoadObject, <![jacrun:method]!>, new Object[]{<![jacrun:argument]!>,<![jacrun:argument2]!>});
              iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[jacrun:method]"), new Object[]{iSymbolTable.translateProperties("[jacrun:argument]"),iSymbolTable.translateProperties("[jacrun:argument2]")});
            }
          }
        }
        lLoadObject = null;
//ScriptWriter~~        if (lPause > 0) pause("At Jrun, before unloadScript(" + <![jacrun:script]!> + ").  Press ENTER to continue...");
        if (lPause > 0) pause("At Jrun, before unloadScript(" + iSymbolTable.translateProperties("[jacrun:script]") + ").  Press ENTER to continue...");
//ScriptWriter~~        unloadScript(<![jacrun:script]!>);
        unloadScript(iSymbolTable.translateProperties("[jacrun:script]"));
//ScriptWriter~~        if (lPause > 0) pause("At Jrun, after unloadScript(" + <![jacrun:script]!> + ").  Press ENTER to continue...");
        if (lPause > 0) pause("At Jrun, after unloadScript(" + iSymbolTable.translateProperties("[jacrun:script]") + ").  Press ENTER to continue...");
      }
    }

    } catch(Throwable e) {
      System.out.println(e);
    }

/*<& com.esarks.arm.scripts.FinalReturnMethod 
  <return suppressExceptionReport="true"/>
&>*/
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
   <method name="pause" visibility="private" return="void" >
     <document></document>
     <argument type="String" name="aPrompt"  document="" />
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 * @param aPrompt 
 */
  private void pause( String aPrompt) {
  String lMethodSignature = "pause(String)";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method" + "!aPrompt=" + Log.toString(aPrompt));
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

  try {
      while (System.in.available() > 0) System.in.read();
      System.out.print(aPrompt);
      System.in.read();
      while (System.in.available() > 0) System.in.read();
  } catch (Throwable e) {}

/*<& com.esarks.arm.scripts.FinalReturnMethod 
  <return suppressExceptionReport="true"/>
&>*/
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
   <method name="argPath" visibility="private" return="String" >
     <document></document>
     <argument type="String" name="aType"  document="" />
     <argument type="String" name="aString"  document="" />
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 * @param aType 
 * @param aString 
 */
  private String argPath( String aType, String aString) {
  String lMethodSignature = "argPath(String,String)";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method" + "!aType=" + Log.toString(aType) + "!aString=" + Log.toString(aString));
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

  if (aType.equals("")) aString = argPath("path", aString);
  if (aType.equals("path")) aString = argPath("workPath", aString);
  if (aType.equals("workPath")) aString = argPath("homePath", aString);

  int lAt = 0;
  while ((lAt = aString.indexOf("$" + aType + "(")) != -1) {
    int lClose = aString.indexOf(")", lAt);
    if (lClose == -1) return aString;

    String lPath = aString.substring(lAt + aType.length() + 2, lClose);
    if (aType.equals("path")) lPath = path(lPath);
    if (aType.equals("homePath")) lPath = homePath(lPath);
    if (aType.equals("workPath")) lPath = workPath(lPath);

    if (lAt > 0) {
      aString = aString.substring(0, lAt) + lPath + aString.substring(lClose + 1);
    } else {
      aString = lPath + aString.substring(lClose + 1);
    }

  }

/*<& com.esarks.arm.scripts.FinalReturnMethod
  <return suppressExceptionReport="true">
    <normal>aString</normal>
    <error>""</error>
  </return>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.FinalReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Normal final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return aString;

  } catch (Throwable e) {
    setContext(iScript.getMasterScript());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
    restoreContext();
    setExit();

    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    if (iMicLog.test(Log._ERR)) {
      iMicLog.println(Log._ERR, "ERR-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!" + e.getMessage());
    }
    return "";
  }
  }
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */
}
