//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.make;

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
public class MakeAll extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected MakeAll() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public MakeAll(Script aScript) {

    super(aScript);

  }
public void execute(String aScript) {

  iOutputManager.setDocument("makeAll");

//ScriptWriter~~%>makeAll using <!%aScript!><!%"\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println("makeAll using " + aScript + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  // Parse the input file.
  parseXmlPath(path(aScript) + ".xml");
  StringBuffer lStringBuffer1 = new StringBuffer();
  StringBuffer lStringBuffer2 = new StringBuffer();
  StringBuffer lStringBuffer3 = new StringBuffer();

//ScriptWriter~~  <!makeAll:componentInventory!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:componentInventory")).resetIterator();
//ScriptWriter~~  while (<!makeAll:componentInventory!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:componentInventory")).next()) {
//ScriptWriter~~    parseXmlPath(path(<![makeAll:componentInventory]!>) + ".xml");
    parseXmlPath(path(iSymbolTable.translateProperties("[makeAll:componentInventory]")) + ".xml");
//ScriptWriter~~    if (<!components!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("components")).size() == 0) {
//ScriptWriter~~      %>** Components file <![makeAll:componentInventory]!> doesn't contain <components> tag.<!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("** Components file " + iSymbolTable.translateProperties("[makeAll:componentInventory]") + " doesn't contain <components> tag." + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
  }
  
  System.out.print("Check Dependencies:");
//ScriptWriter~~  <!makeAll:component!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:component")).resetIterator();
//ScriptWriter~~  while (<!makeAll:component!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:component")).next()) {
//ScriptWriter~~    addComponent(<![makeAll:component]!>);
    addComponent(iSymbolTable.translateProperties("[makeAll:component]"));
  }
  System.out.println(".");

//ScriptWriter~~  <!makeAll:ddl!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl")).resetIterator();
//ScriptWriter~~  while (<!makeAll:ddl!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl")).next()) {
  
    makeDdl();
    writeEvents();

  }
  
  lStringBuffer1 = iOutputManager.getDocument("makeAll");
  iOutputManager.setDocument("makeAll");

//ScriptWriter~~  <!makeAll:jeo!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo")).resetIterator();
//ScriptWriter~~  while (<!makeAll:jeo!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo")).next()) {

    makeJeo();
    writeEvents();

  }
  
  lStringBuffer2 = iOutputManager.getDocument("makeAll");
  iOutputManager.setDocument("makeAll");

//ScriptWriter~~  <!makeAll:make!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make")).resetIterator();
//ScriptWriter~~  while (<!makeAll:make!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make")).next()) {

    make();
    writeEvents();

  }
  
  lStringBuffer3 = iOutputManager.getDocument("makeAll");
  if (!openOutput(path(aScript) + ".log")) {
    System.out.println("Cannot open output log file!");
    if (iOutputManager.getExceptionMessage() != null) System.out.println(iOutputManager.getExceptionMessage());
  }
//ScriptWriter~~  %><!%lStringBuffer1.toString()!><%
  {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer1.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  %><!%lStringBuffer2.toString()!><%
  {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer2.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  %><!%lStringBuffer3.toString()!><%
  {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer3.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  closeOutput();

}


public void makeDdl() {

//ScriptWriter~~%>makeDdl<!%"\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println("makeDdl" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  System.out.print("makeDdl");
  
//ScriptWriter~~  if (<!makeAll:ddl:script!>!size() == 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script")).size() == 0) {
//ScriptWriter~~    %>makeDdl... Nothing to process.<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("makeDdl... Nothing to process." + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    System.out.println(" Nothing to process...");
    return;
  }
  
//ScriptWriter~~  <!makeAll:ddl:script!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script")).resetIterator();
//ScriptWriter~~  while (<!makeAll:ddl:script!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script")).next()) {
//ScriptWriter~~    <!makeAll:ddl:script:entity!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script:entity")).resetIterator();
//ScriptWriter~~    while (<!makeAll:ddl:script:entity!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script:entity")).next()) {
//ScriptWriter~~      <!makeDdl!>!remove();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeDdl")).remove();
//ScriptWriter~~      iScript.execMethod(loadScript("com.esarks.arm.model.MakeDdl"), <![makeAll:ddl:script:method]!>, new Object[] {<![makeAll:ddl:script]!>, <![makeAll:ddl:script:entity]!>});
      iScript.execMethod(loadScript("com.esarks.arm.model.MakeDdl"), iSymbolTable.translateProperties("[makeAll:ddl:script:method]"), new Object[] {iSymbolTable.translateProperties("[makeAll:ddl:script]"), iSymbolTable.translateProperties("[makeAll:ddl:script:entity]")});
      writeEvents();
      System.out.print(".");
    }
  }
  System.out.println(".");
}

public void makeJeo() {

//ScriptWriter~~%>makeJeo<!%"\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println("makeJeo" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  System.out.print("makeJeo");

//ScriptWriter~~  if (<!makeAll:jeo:script!>!size() == 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script")).size() == 0) {
//ScriptWriter~~    %>makeJeo... Nothing to process.<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("makeJeo... Nothing to process." + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    System.out.println(" Nothing to process...");
    return;
  }

//ScriptWriter~~  <!makeAll:jeo:script!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script")).resetIterator();
//ScriptWriter~~  while (<!makeAll:jeo:script!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script")).next()) {
//ScriptWriter~~    <!makeAll:jeo:script:entity!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:entity")).resetIterator();
//ScriptWriter~~    while (<!makeAll:jeo:script:entity!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:entity")).next()) {
//ScriptWriter~~      iScript.execMethod(loadScript("com.esarks.arm.model.MakeJeo"), <![makeAll:jeo:script:method]!>, new Object[] {<![makeAll:jeo:script]!>, <![makeAll:jeo:script:entity]!>});
      iScript.execMethod(loadScript("com.esarks.arm.model.MakeJeo"), iSymbolTable.translateProperties("[makeAll:jeo:script:method]"), new Object[] {iSymbolTable.translateProperties("[makeAll:jeo:script]"), iSymbolTable.translateProperties("[makeAll:jeo:script:entity]")});
      writeEvents();
      System.out.print(".");
      String lContext = "jeo";
//ScriptWriter~~      if (iScript.getMasterScript().buildScript(getScriptName(<![makeAll:jeo:script]!>, <![makeAll:jeo:script:entity]!>), lContext, false) == true) {
      if (iScript.getMasterScript().buildScript(getScriptName(iSymbolTable.translateProperties("[makeAll:jeo:script]"), iSymbolTable.translateProperties("[makeAll:jeo:script:entity]")), lContext, false) == true) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        String lSourceFile = <![$jac:script:sourceFile]!>;
        String lSourceFile = iSymbolTable.translateProperties("[$jac:script:sourceFile]");
        restoreContext();
//ScriptWriter~~        <!$mic:compile!>!set(lSourceFile);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).set(lSourceFile);
      }
//ScriptWriter~~      if (<![makeAll:jeo:script:compile]!>.compareTo("true") == 0 && <!$mic:compile!>!size() > 0) {
      if (iSymbolTable.translateProperties("[makeAll:jeo:script:compile]").compareTo("true") == 0 && iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size() > 0) {
//ScriptWriter~~        String [] lClassFiles = new String[<!$mic:compile!>!size()];
        String [] lClassFiles = new String[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size()];
        int lIdx = 0;
//ScriptWriter~~        <!$mic:compile!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).resetIterator();
//ScriptWriter~~        while (<!$mic:compile!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).next()) {
//ScriptWriter~~          lClassFiles[lIdx++] = <![$mic:compile]!>;
          lClassFiles[lIdx++] = iSymbolTable.translateProperties("[$mic:compile]");
//ScriptWriter~~          %>Compile <![$mic:compile]!><!%"\r\n"!><%
          {
//ScriptWriter~~~
iOutputManager.println("Compile " + iSymbolTable.translateProperties("[$mic:compile]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        iScript.compileScripts(lClassFiles);
//ScriptWriter~~        <!$mic:compile!>!remove();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).remove();
        writeEvents();
        System.out.print(".");
      }
    }
  }
//ScriptWriter~~  if (<!$mic:compile!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size() > 0) {
//ScriptWriter~~    String [] lClassFiles = new String[<!$mic:compile!>!size()];
    String [] lClassFiles = new String[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size()];
    int lIdx = 0;
//ScriptWriter~~    <!$mic:compile!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).resetIterator();
//ScriptWriter~~    while (<!$mic:compile!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).next()) {
//ScriptWriter~~      lClassFiles[lIdx++] = <![$mic:compile]!>;
      lClassFiles[lIdx++] = iSymbolTable.translateProperties("[$mic:compile]");
//ScriptWriter~~      %>Compile <![$mic:compile]!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("Compile " + iSymbolTable.translateProperties("[$mic:compile]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
    iScript.compileScripts(lClassFiles);
//ScriptWriter~~    <!$mic:compile!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).remove();
    writeEvents();
    System.out.print(".");
  }
  System.out.println(".");
}

public void make() {

//ScriptWriter~~%>make<!%"\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println("make" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  System.out.print("make");

//ScriptWriter~~  if (<!makeAll:make:script!>!size() == 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).size() == 0) {
//ScriptWriter~~    %>make... Nothing to process.<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("make... Nothing to process." + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    System.out.println(" Nothing to process...");
    return;
  }

//ScriptWriter~~  <!makeAll:make:script!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).resetIterator();
//ScriptWriter~~  while (<!makeAll:make:script!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).next()) {
//ScriptWriter~~    if (<!makeAll:make:script:method!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:method")).size() > 0) {
//ScriptWriter~~      if (<!makeAll:make:script:argument!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:argument")).size() > 0) {
//ScriptWriter~~        iScript.execMethod(loadScript(<![makeAll:make:script]!>), <![makeAll:make:script:method]!>, new Object[] {<![makeAll:make:script:argument]!>});
        iScript.execMethod(loadScript(iSymbolTable.translateProperties("[makeAll:make:script]")), iSymbolTable.translateProperties("[makeAll:make:script:method]"), new Object[] {iSymbolTable.translateProperties("[makeAll:make:script:argument]")});
        writeEvents();
        System.out.print(".");
      } else {
//ScriptWriter~~        iScript.execMethod(loadScript(<![makeAll:make:script]!>), <![makeAll:make:script:method]!>);
        iScript.execMethod(loadScript(iSymbolTable.translateProperties("[makeAll:make:script]")), iSymbolTable.translateProperties("[makeAll:make:script:method]"));
        writeEvents();
        System.out.print(".");
      }
    } else {
//ScriptWriter~~      String lContext = <![makeAll:make:script:context]!>;
      String lContext = iSymbolTable.translateProperties("[makeAll:make:script:context]");
//ScriptWriter~~      if (<![makeAll:make:script:context]!>.compareTo("?") == 0) {
      if (iSymbolTable.translateProperties("[makeAll:make:script:context]").compareTo("?") == 0) {
//ScriptWriter~~        parseXml(<![makeAll:make:script]!>);
        parseXml(iSymbolTable.translateProperties("[makeAll:make:script]"));
//ScriptWriter~~        lContext = "micScript" + <![mic.element:type]!>;
        lContext = "micScript" + iSymbolTable.translateProperties("[mic.element:type]");
      }
//ScriptWriter~~      if (iScript.getMasterScript().buildScript(<![makeAll:make:script]!>, lContext, false) == true) {
      if (iScript.getMasterScript().buildScript(iSymbolTable.translateProperties("[makeAll:make:script]"), lContext, false) == true) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        String lSourceFile = <![$jac:script:sourceFile]!>;
        String lSourceFile = iSymbolTable.translateProperties("[$jac:script:sourceFile]");
        restoreContext();
//ScriptWriter~~        <!$mic:compile!>!set(lSourceFile);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).set(lSourceFile);
      }
//ScriptWriter~~      if (<![makeAll:make:script:compile]!>.compareTo("true") == 0 && <!$mic:compile!>!size() > 0) {
      if (iSymbolTable.translateProperties("[makeAll:make:script:compile]").compareTo("true") == 0 && iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size() > 0) {
//ScriptWriter~~        String [] lClassFiles = new String[<!$mic:compile!>!size()];
        String [] lClassFiles = new String[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size()];
        int lIdx = 0;
//ScriptWriter~~        <!$mic:compile!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).resetIterator();
//ScriptWriter~~        while (<!$mic:compile!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).next()) {
//ScriptWriter~~          lClassFiles[lIdx++] = <![$mic:compile]!>;
          lClassFiles[lIdx++] = iSymbolTable.translateProperties("[$mic:compile]");
//ScriptWriter~~          %>Compile <![$mic:compile]!><!%"\r\n"!><%
          {
//ScriptWriter~~~
iOutputManager.println("Compile " + iSymbolTable.translateProperties("[$mic:compile]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        iScript.compileScripts(lClassFiles);
//ScriptWriter~~        <!$mic:compile!>!remove();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).remove();
        writeEvents();
        System.out.print(".");
      }
    }
  }
//ScriptWriter~~  if (<!$mic:compile!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size() > 0) {
//ScriptWriter~~    String [] lClassFiles = new String[<!$mic:compile!>!size()];
    String [] lClassFiles = new String[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size()];
    int lIdx = 0;
//ScriptWriter~~    <!$mic:compile!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).resetIterator();
//ScriptWriter~~    while (<!$mic:compile!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).next()) {
//ScriptWriter~~      lClassFiles[lIdx++] = <![$mic:compile]!>;
      lClassFiles[lIdx++] = iSymbolTable.translateProperties("[$mic:compile]");
//ScriptWriter~~      %>Compile <![$mic:compile]!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("Compile " + iSymbolTable.translateProperties("[$mic:compile]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
    iScript.compileScripts(lClassFiles);
//ScriptWriter~~    <!$mic:compile!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).remove();
    writeEvents();
    System.out.print(".");
  }
  System.out.println(".");
}

private String getScriptName(String aXmlDefinition, String aTable) {
  String lPackage = aXmlDefinition;
  for(int lIdx=aXmlDefinition.length(); lIdx > 0; lIdx--) {
    if (aXmlDefinition.charAt(lIdx-1) == '.') {
      lPackage = aXmlDefinition.substring(0, lIdx-1);
      break;
    }
  }
  return lPackage + "." + aTable;
}

private void writeEvents() {
    iOutputManager.setDocument("makeAll");
    setContext(iScript.getMasterScript());
//ScriptWriter~~    <!$jac:event!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).resetIterator();
//ScriptWriter~~    while (<!$jac:event!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).next()) {
//ScriptWriter~~      %>*<![$jac:event:severity]!>* <![$jac:event]!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("*" + iSymbolTable.translateProperties("[$jac:event:severity]") + "* " + iSymbolTable.translateProperties("[$jac:event]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      String lSeverity = <![$jac:event:severity]!>;
      String lSeverity = iSymbolTable.translateProperties("[$jac:event:severity]");
      if (lSeverity.equals("fatal")) System.out.print("!");
      else if (lSeverity.equals("error")) System.out.print("*");
      else if (lSeverity.equals("info")) System.out.print("?");
      else System.out.print("%");
    }
//ScriptWriter~~    <!$jac:event!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).remove();
    restoreContext();
}

private void addComponent(String aComponent) {
    
    System.out.print("?");

    // See if the component is already in the make list...
//ScriptWriter~~    <!$mic:makeComponentList:name!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:makeComponentList:name")).resetIterator();
//ScriptWriter~~    if (<!$mic:makeComponentList!>!scan("name", aComponent)) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:makeComponentList")).scan("name", aComponent)) {
//ScriptWriter~~      %>                  - <!%aComponent!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("                  - " + aComponent + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      return;
    }
    // Add it, so it won't get added during the dependency check (although, that would be a bad condition if another element depends on this one, and this one depends on it)
//ScriptWriter~~    <!$mic:makeComponentList:name!>!set(aComponent);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:makeComponentList:name")).set(aComponent);

    System.out.print("+");
//ScriptWriter~~    %>Adding Component: <!%aComponent!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("Adding Component: " + aComponent + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    // Find this component's definition and dependencies
//ScriptWriter~~    <!components:component!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("components:component")).resetIterator();
//ScriptWriter~~    if (<!components!>!scan("component:name", aComponent)) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("components")).scan("component:name", aComponent)) {

      // Save these, as recursion will destory the index to the component item.
//ScriptWriter~~      String lEntity = <![components:component:entity]!>;
      String lEntity = iSymbolTable.translateProperties("[components:component:entity]");
//ScriptWriter~~      String lType = <![components:component:type]!>;
      String lType = iSymbolTable.translateProperties("[components:component:type]");
//ScriptWriter~~      String lSource = <![components:component:source]!>;
      String lSource = iSymbolTable.translateProperties("[components:component:source]");
//ScriptWriter~~      if (<!components:component:source!>!size() == 0) lSource = aComponent;
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("components:component:source")).size() == 0) lSource = aComponent;

      // Get dependencies in a list, and process each one...
      ArrayList lArrayList = new ArrayList();
//ScriptWriter~~      <!components:component:dependsOn!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("components:component:dependsOn")).resetIterator();
//ScriptWriter~~      while (<!components:component:dependsOn!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("components:component:dependsOn")).next()) {
//ScriptWriter~~        lArrayList.add(<![components:component:dependsOn:name]!>);
        lArrayList.add(iSymbolTable.translateProperties("[components:component:dependsOn:name]"));
//ScriptWriter~~        %>                  * <![components:component:dependsOn:name]!><!%"\r\n"!><%
        {
//ScriptWriter~~~
iOutputManager.println("                  * " + iSymbolTable.translateProperties("[components:component:dependsOn:name]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }

      // Process the dependencies
      for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
        addComponent((String) lArrayList.get(lIdx));
      }

//ScriptWriter~~      %>                  + <!%aComponent!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("                  + " + aComponent + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      /// Now add the component
      if (lType.equals("DbTable")) {
//ScriptWriter~~        <!makeAll:ddl:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script")).set(lSource);
        if (lEntity.equals("")) {
//ScriptWriter~~          <!makeAll:ddl:script:entity!>!set(aComponent);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script:entity")).set(aComponent);
        } else {
//ScriptWriter~~          <!makeAll:ddl:script:entity!>!set(lEntity);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script:entity")).set(lEntity);
        }
//ScriptWriter~~        <!makeAll:ddl:script:method!>!set("createTable");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script:method")).set("createTable");
//ScriptWriter~~        <!makeAll:jeo:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script")).set(lSource);
        if (lEntity.equals("")) {
//ScriptWriter~~          <!makeAll:jeo:script:entity!>!set(aComponent);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:entity")).set(aComponent);
        } else {
//ScriptWriter~~          <!makeAll:jeo:script:entity!>!set(lEntity);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:entity")).set(lEntity);
        }
//ScriptWriter~~        <!makeAll:jeo:script:method!>!set("createTable");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:method")).set("createTable");
//ScriptWriter~~        <!makeAll:jeo:script:compile!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:compile")).set("true");
      }
      else if (lType.equals("DbView")) {
//ScriptWriter~~        <!makeAll:ddl:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script")).set(lSource);
        if (lEntity.equals("")) {
//ScriptWriter~~          <!makeAll:ddl:script:entity!>!set(aComponent);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script:entity")).set(aComponent);
        } else {
//ScriptWriter~~          <!makeAll:ddl:script:entity!>!set(lEntity);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script:entity")).set(lEntity);
        }
//ScriptWriter~~        <!makeAll:ddl:script:method!>!set("createView");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:ddl:script:method")).set("createView");
//ScriptWriter~~        <!makeAll:jeo:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script")).set(lSource);
        if (lEntity.equals("")) {
//ScriptWriter~~          <!makeAll:jeo:script:entity!>!set(aComponent);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:entity")).set(aComponent);
        } else {
//ScriptWriter~~          <!makeAll:jeo:script:entity!>!set(lEntity);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:entity")).set(lEntity);
        }
//ScriptWriter~~        <!makeAll:jeo:script:method!>!set("createView");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:method")).set("createView");
//ScriptWriter~~        <!makeAll:jeo:script:compile!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:compile")).set("true");
      }
      else if (lType.equals("Jeo")) {
//ScriptWriter~~        <!makeAll:jeo:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script")).set(lSource);
        if (lEntity.equals("")) {
//ScriptWriter~~          <!makeAll:jeo:script:entity!>!set(aComponent);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:entity")).set(aComponent);
        } else {
//ScriptWriter~~          <!makeAll:jeo:script:entity!>!set(lEntity);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:entity")).set(lEntity);
        }
//ScriptWriter~~        <!makeAll:jeo:script:method!>!set("createJeo");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:method")).set("createJeo");
//ScriptWriter~~        <!makeAll:jeo:script:compile!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:jeo:script:compile")).set("true");
      }
      else if (lType.equals("Services")) {
//ScriptWriter~~        <!makeAll:make:script!>!set("com.esarks.arm.model.GenerateService");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).set("com.esarks.arm.model.GenerateService");
//ScriptWriter~~        <!makeAll:make:script:method!>!set("generateServices");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:method")).set("generateServices");
//ScriptWriter~~        <!makeAll:make:script:argument!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:argument")).set(lSource);
//ScriptWriter~~        <!makeAll:make:script!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).set(aComponent);
//ScriptWriter~~        <!makeAll:make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:context")).set("?");
      }
      else if (lType.equals("Report")) {
//ScriptWriter~~        <!makeAll:make:script!>!set("com.esarks.arm.report.GenerateReport");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).set("com.esarks.arm.report.GenerateReport");
//ScriptWriter~~        <!makeAll:make:script:method!>!set("generateReport");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:method")).set("generateReport");
//ScriptWriter~~        <!makeAll:make:script:argument!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:argument")).set(lSource);
//ScriptWriter~~        <!makeAll:make:script!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).set(aComponent);
//ScriptWriter~~        <!makeAll:make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:context")).set("?");
      }
/*
      else if (lType.equals("View")) {
//ScriptWriter~~        <!makeAll:make:script!>!set();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).set();
//ScriptWriter~~        <!makeAll:make:script:method!>!set();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:method")).set();
//ScriptWriter~~        <!makeAll:make:script:argument!>!set();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:argument")).set();
//ScriptWriter~~        <!makeAll:make:script!>!set();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).set();
//ScriptWriter~~        <!makeAll:make:script:context!>!set();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:context")).set();
      }
*/
      else if (lType.equals("Script")) {
//ScriptWriter~~        <!makeAll:make:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script")).set(lSource);
//ScriptWriter~~        <!makeAll:make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:make:script:context")).set("?");
      }
      else {
      }
    }
}
}
