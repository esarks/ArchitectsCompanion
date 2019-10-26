//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.jac.make;

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
public class MakeAll extends com.esarks.mic.Component  {

private boolean iForce = false;
private String iGenerateService;
private String iGenerateDdl;
private String iGenerateReport;
private String iGenerateDtable;
private String iGenerateFrame;
private String iGenerateJeo;

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected MakeAll() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public MakeAll(Script aScript) {

    super(aScript);

  }

public void execute(String aScript) {
  execute(aScript, "false");
}

public void execute(String aScript, String aForce) {

  boolean lForce = false;
  if (aForce.equals("true")) {
    lForce = true;
    iForce = true;
    setContext(iScript.getMasterScript());
//ScriptWriter~~    <!$jac:makeAll:force!>!set("true");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:makeAll:force")).set("true");
    restoreContext();
  }

  iGenerateService = "com.esarks.jac.generators.GenerateService";
  iGenerateDdl = "com.esarks.jac.generators.GenerateDdl";
  iGenerateReport = "com.esarks.jac.generators.GenerateReport";
  iGenerateDtable = "com.esarks.jac.generators.GenerateDtable";
  iGenerateFrame = "com.esarks.jac.generators.GenerateFrame";
  iGenerateJeo = "com.esarks.jac.generators.GenerateJeo";

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
  
  System.out.print("Check Dependencies...");
//ScriptWriter~~  <!makeAll:component!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:component")).resetIterator();
//ScriptWriter~~  while (<!makeAll:component!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeAll:component")).next()) {
//ScriptWriter~~    addComponent(<![makeAll:component]!>);
    addComponent(iSymbolTable.translateProperties("[makeAll:component]"));
  }
  System.out.println("");
//  System.out.println(".");

//ScriptWriter~~  <!make!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).resetIterator();
//ScriptWriter~~  while (<!make!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).next()) {
//ScriptWriter~~    if (<![make]!>.equals("ddl")) {
    if (iSymbolTable.translateProperties("[make]").equals("ddl")) {
      makeDdl();
      writeEvents();
//ScriptWriter~~    } else if (<![make]!>.equals("jeo")) {
    } else if (iSymbolTable.translateProperties("[make]").equals("jeo")) {
      makeJeo();
      writeEvents();
//ScriptWriter~~    } else if (<![make]!>.equals("script")) {
    } else if (iSymbolTable.translateProperties("[make]").equals("script")) {
      make();
      writeEvents();
//ScriptWriter~~    } else if (<![make]!>.equals("script2")) {
    } else if (iSymbolTable.translateProperties("[make]").equals("script2")) {
      make2();
      writeEvents();
    }
  }
  
  lStringBuffer3 = iOutputManager.getDocument("makeAll");
  if (!openOutput(path(aScript) + ".log")) {
    System.out.println("Cannot open output log file!");
    if (iOutputManager.getExceptionMessage() != null) System.out.println(iOutputManager.getExceptionMessage());
  }
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
 
//ScriptWriter~~  if (<!make:ddl:script!>!size() == 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script")).size() == 0) {
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
  
//ScriptWriter~~  <!make:ddl:script!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script")).resetIterator();
//ScriptWriter~~  while (<!make:ddl:script!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script")).next()) {
//ScriptWriter~~    if (<!make:ddl:script:entity!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:entity")).size() == 0) {
//ScriptWriter~~      iScript.execMethod(loadScript(<![make:ddl:script]!>), <![make:ddl:script:method]!>, new Object[] {<![make:ddl:script:argument]!>});
      iScript.execMethod(loadScript(iSymbolTable.translateProperties("[make:ddl:script]")), iSymbolTable.translateProperties("[make:ddl:script:method]"), new Object[] {iSymbolTable.translateProperties("[make:ddl:script:argument]")});
      writeEvents();
//      System.out.print(".");
    } else {
//ScriptWriter~~      <!make:ddl:script:entity!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:entity")).resetIterator();
//ScriptWriter~~      while (<!make:ddl:script:entity!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:entity")).next()) {
//ScriptWriter~~        <!makeDdl!>!remove();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("makeDdl")).remove();
//ScriptWriter~~        iScript.execMethod(loadScript(iGenerateDdl), <![make:ddl:script:method]!>, new Object[] {<![make:ddl:script]!>, <![make:ddl:script:entity]!>});
        iScript.execMethod(loadScript(iGenerateDdl), iSymbolTable.translateProperties("[make:ddl:script:method]"), new Object[] {iSymbolTable.translateProperties("[make:ddl:script]"), iSymbolTable.translateProperties("[make:ddl:script:entity]")});
        writeEvents();
//        System.out.print(".");
      }
    }
  }
//  System.out.println(".");
}

public void makeJeo() {

//ScriptWriter~~  if (<!make:jeo:script!>!size() == 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script")).size() == 0) {
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

//ScriptWriter~~  <!make:jeo:script!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script")).resetIterator();
//ScriptWriter~~  while (<!make:jeo:script!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script")).next()) {
//ScriptWriter~~    <!make:jeo:script:entity!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:entity")).resetIterator();
//ScriptWriter~~    while (<!make:jeo:script:entity!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:entity")).next()) {
//ScriptWriter~~      iScript.execMethod(loadScript(iGenerateJeo), <![make:jeo:script:method]!>, new Object[] {<![make:jeo:script]!>, <![make:jeo:script:entity]!>});
      iScript.execMethod(loadScript(iGenerateJeo), iSymbolTable.translateProperties("[make:jeo:script:method]"), new Object[] {iSymbolTable.translateProperties("[make:jeo:script]"), iSymbolTable.translateProperties("[make:jeo:script:entity]")});
      writeEvents();
//      System.out.print(".");
      String lContext = "jeo";
//ScriptWriter~~      if (iScript.getMasterScript().buildScript(getScriptName(<![make:jeo:script]!>, <![make:jeo:script:entity]!>), lContext, false, iForce) == true) {
      if (iScript.getMasterScript().buildScript(getScriptName(iSymbolTable.translateProperties("[make:jeo:script]"), iSymbolTable.translateProperties("[make:jeo:script:entity]")), lContext, false, iForce) == true) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        String lSourceFile = <![$jac:script:sourceFile]!>;
        String lSourceFile = iSymbolTable.translateProperties("[$jac:script:sourceFile]");
        restoreContext();
//ScriptWriter~~        <!$mic:compile!>!set(lSourceFile);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).set(lSourceFile);
//ScriptWriter~~        <!$mic:compile:script!>!set(<![make:jeo:script]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile:script")).set(iSymbolTable.translateProperties("[make:jeo:script]"));
//ScriptWriter~~        <!$mic:compile:entity!>!set(<![make:jeo:script:entity]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile:entity")).set(iSymbolTable.translateProperties("[make:jeo:script:entity]"));
      }
//ScriptWriter~~      if (<![make:jeo:script:compile]!>.compareTo("true") == 0 && <!$mic:compile!>!size() > 0) {
      if (iSymbolTable.translateProperties("[make:jeo:script:compile]").compareTo("true") == 0 && iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size() > 0) {
//ScriptWriter~~        String [] lClassFiles = new String[<!$mic:compile!>!size()];
        String [] lClassFiles = new String[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size()];
        int lIdx = 0;
//ScriptWriter~~        <!$mic:compile!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).resetIterator();
//ScriptWriter~~        while (<!$mic:compile!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).next()) {
//ScriptWriter~~          lClassFiles[lIdx++] = <![$mic:compile]!>;
          lClassFiles[lIdx++] = iSymbolTable.translateProperties("[$mic:compile]");
//ScriptWriter~~          %>Compile: <![$mic:compile]!>, Script: <![$mic:compile:script]!>, Entity: <![$mic:compile:entity]!><!%"\r\n"!><%
          {
//ScriptWriter~~~
iOutputManager.println("Compile: " + iSymbolTable.translateProperties("[$mic:compile]") + ", Script: " + iSymbolTable.translateProperties("[$mic:compile:script]") + ", Entity: " + iSymbolTable.translateProperties("[$mic:compile:entity]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        iScript.compileScripts(lClassFiles);
//ScriptWriter~~        <!$mic:compile!>!remove();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).remove();
        writeEvents();
//        System.out.print(".");
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
//ScriptWriter~~      %>Compile: <![$mic:compile]!>, Script: <![$mic:compile:script]!>, Entity: <![$mic:compile:entity]!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("Compile: " + iSymbolTable.translateProperties("[$mic:compile]") + ", Script: " + iSymbolTable.translateProperties("[$mic:compile:script]") + ", Entity: " + iSymbolTable.translateProperties("[$mic:compile:entity]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
    iScript.compileScripts(lClassFiles);
//ScriptWriter~~    <!$mic:compile!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).remove();
    writeEvents();
//    System.out.print(".");
  }
//  System.out.println(".");
}

public void make() {

//ScriptWriter~~  if (<!make:script!>!size() == 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).size() == 0) {
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

//ScriptWriter~~  <!make:script!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).resetIterator();
//ScriptWriter~~  while (<!make:script!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).next()) {
//ScriptWriter~~    if (<!make:script:method!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:method")).size() > 0) {
//ScriptWriter~~      if (<!make:script:argument!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument")).size() > 0) {
//ScriptWriter~~        if (<!make:script:argument2!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument2")).size() > 0) {
//ScriptWriter~~          iScript.execMethod(loadScript(<![make:script]!>), <![make:script:method]!>, new Object[] {<![make:script:argument]!>,<![make:script:argument2]!>});
          iScript.execMethod(loadScript(iSymbolTable.translateProperties("[make:script]")), iSymbolTable.translateProperties("[make:script:method]"), new Object[] {iSymbolTable.translateProperties("[make:script:argument]"),iSymbolTable.translateProperties("[make:script:argument2]")});
          writeEvents();
        } else {
//ScriptWriter~~          iScript.execMethod(loadScript(<![make:script]!>), <![make:script:method]!>, new Object[] {<![make:script:argument]!>});
          iScript.execMethod(loadScript(iSymbolTable.translateProperties("[make:script]")), iSymbolTable.translateProperties("[make:script:method]"), new Object[] {iSymbolTable.translateProperties("[make:script:argument]")});
          writeEvents();
//        System.out.print(".");
        }
      } else {
//ScriptWriter~~        iScript.execMethod(loadScript(<![make:script]!>), <![make:script:method]!>);
        iScript.execMethod(loadScript(iSymbolTable.translateProperties("[make:script]")), iSymbolTable.translateProperties("[make:script:method]"));
        writeEvents();
//        System.out.print(".");
      }
    } else {
//ScriptWriter~~      String lContext = <![make:script:context]!>;
      String lContext = iSymbolTable.translateProperties("[make:script:context]");
//ScriptWriter~~      if (<![make:script:context]!>.compareTo("?") == 0) {
      if (iSymbolTable.translateProperties("[make:script:context]").compareTo("?") == 0) {
//ScriptWriter~~        File lFile = new File(path(<![make:script]!>) + ".xml");
        File lFile = new File(path(iSymbolTable.translateProperties("[make:script]")) + ".xml");
        if (lFile.exists()) {
//ScriptWriter~~          parseXml(<![make:script]!>);
          parseXml(iSymbolTable.translateProperties("[make:script]"));
//ScriptWriter~~          lContext = "micScript" + <![mic.element:type]!>;
          lContext = "micScript" + iSymbolTable.translateProperties("[mic.element:type]");
        } else {
          lContext = "mic";
        }
      }
//ScriptWriter~~      %>Script.buildScript... <![make:script]!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("Script.buildScript... " + iSymbolTable.translateProperties("[make:script]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (iScript.getMasterScript().buildScript(<![make:script]!>, lContext, false, iForce) == true) {
      if (iScript.getMasterScript().buildScript(iSymbolTable.translateProperties("[make:script]"), lContext, false, iForce) == true) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        String lSourceFile = <![$jac:script:sourceFile]!>;
        String lSourceFile = iSymbolTable.translateProperties("[$jac:script:sourceFile]");
        restoreContext();
//ScriptWriter~~        <!$mic:compile!>!set(lSourceFile);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).set(lSourceFile);
//ScriptWriter~~        <!$mic:compile:script!>!set(<![make:script]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile:script")).set(iSymbolTable.translateProperties("[make:script]"));
      }
//ScriptWriter~~      %>compile = <![make:script:compile]!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("compile = " + iSymbolTable.translateProperties("[make:script:compile]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (<![make:script:compile]!>.compareTo("true") == 0 && <!$mic:compile!>!size() > 0) {
      if (iSymbolTable.translateProperties("[make:script:compile]").compareTo("true") == 0 && iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size() > 0) {
//ScriptWriter~~        String [] lClassFiles = new String[<!$mic:compile!>!size()];
        String [] lClassFiles = new String[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size()];
        int lIdx = 0;
//ScriptWriter~~        <!$mic:compile!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).resetIterator();
//ScriptWriter~~        while (<!$mic:compile!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).next()) {
//ScriptWriter~~          lClassFiles[lIdx++] = <![$mic:compile]!>;
          lClassFiles[lIdx++] = iSymbolTable.translateProperties("[$mic:compile]");
//ScriptWriter~~          %>Compile: <![$mic:compile]!>, Script: <![$mic:compile:script]!><!%"\r\n"!><%
          {
//ScriptWriter~~~
iOutputManager.println("Compile: " + iSymbolTable.translateProperties("[$mic:compile]") + ", Script: " + iSymbolTable.translateProperties("[$mic:compile:script]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        iScript.compileScripts(lClassFiles);
//ScriptWriter~~        <!$mic:compile!>!remove();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).remove();
        writeEvents();
//        System.out.print(".");
      }
    }
  }
//ScriptWriter~~  if (!true && <!$mic:compile!>!size() > 0) {
  if (!true && iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size() > 0) {
//ScriptWriter~~    String [] lClassFiles = new String[<!$mic:compile!>!size()];
    String [] lClassFiles = new String[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).size()];
    int lIdx = 0;
//ScriptWriter~~    <!$mic:compile!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).resetIterator();
//ScriptWriter~~    while (<!$mic:compile!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).next()) {
//ScriptWriter~~      lClassFiles[lIdx++] = <![$mic:compile]!>;
      lClassFiles[lIdx++] = iSymbolTable.translateProperties("[$mic:compile]");
//ScriptWriter~~      %>Compile: <![$mic:compile]!>, Script: <![$mic:compile:script]!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("Compile: " + iSymbolTable.translateProperties("[$mic:compile]") + ", Script: " + iSymbolTable.translateProperties("[$mic:compile:script]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
    iScript.compileScripts(lClassFiles);
//ScriptWriter~~    <!$mic:compile!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:compile")).remove();
    writeEvents();
//    System.out.print(".");
  }
//  System.out.println(".");
}

public void make2() {

//ScriptWriter~~  if (<!make:script2!>!size() == 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script2")).size() == 0) {
//ScriptWriter~~    %>make2... Nothing to process.<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("make2... Nothing to process." + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    System.out.println(" Nothing to process...");
    return;
  }

//ScriptWriter~~  <!make:script2!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script2")).resetIterator();
//ScriptWriter~~  while (<!make:script2!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script2")).next()) {

    String lLine;
    FileReader lFileReader = null;
    FileOutputStream lFileOutputStream = null;
    PrintWriter lPrintWriter = null;
    int lLineNumber = 0;                                    // Is the line number within the current script

    try {

//ScriptWriter~~        lFileOutputStream = new FileOutputStream(path(<![make:script2]!>) + ".script", false);
        lFileOutputStream = new FileOutputStream(path(iSymbolTable.translateProperties("[make:script2]")) + ".script", false);
        lPrintWriter = new PrintWriter(lFileOutputStream);

    } catch (IOException lException) {
//!!!
    }

    try {

        ScriptWriter lScriptWriter = new ScriptWriter(iScript.getMasterScript(), lPrintWriter);

        try {

//ScriptWriter~~            lFileReader = new FileReader(path(<![make:script2]!>) + ".script2");
            lFileReader = new FileReader(path(iSymbolTable.translateProperties("[make:script2]")) + ".script2");

        } catch (IOException lException) {
//!!!
        }

        BufferedReader lBufferedReader = new BufferedReader(lFileReader);
        LineNumberReader lLineNumberReader = new LineNumberReader(lBufferedReader);

        lLineNumber = 0;

        while ((lLine = lLineNumberReader.readLine()) != null) {

            lLineNumber++;
            iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:script:lineNumber",new PropertyValue(lLineNumber));
            lScriptWriter.processLine(lLine, lLineNumber);
        }
        lLineNumberReader.close();
        lLineNumberReader = null;
        lBufferedReader.close();
        lBufferedReader = null;
        lFileReader.close();
        lFileReader = null;
        lScriptWriter = null;
        lPrintWriter.close();
        lPrintWriter = null;
        lFileOutputStream.close();
        lFileOutputStream = null;

    } catch (IOException lException) {
//!!!
    }
  }
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
//      if (lSeverity.equals("fatal")) System.out.print("!");
//      else if (lSeverity.equals("error")) System.out.print("*");
//      else if (lSeverity.equals("info")) System.out.print("?");
//      else System.out.print("%");
    }
//ScriptWriter~~    <!$jac:event!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).remove();
    restoreContext();
}

private void addComponent(String aComponent) {
    
//    System.out.print("?");

    // See if the component is already in the make list...
//ScriptWriter~~    <!$mic:makeComponentList:name!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:makeComponentList:name")).resetIterator();
//ScriptWriter~~    if (<!$mic:makeComponentList!>!scan("name", aComponent)) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:makeComponentList")).scan("name", aComponent)) {
//ScriptWriter~~      %>   previously added           - <!%aComponent!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("   previously added           - " + aComponent + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      return;
    }
    // Add it, so it won't get added during the dependency check (although, that would be a bad condition if another element depends on this one, and this one depends on it)
//ScriptWriter~~    <!$mic:makeComponentList:name!>!set(aComponent);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:makeComponentList:name")).set(aComponent);

//    System.out.print("+");
//ScriptWriter~~    %>Adding Component: <!%aComponent!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("Adding Component: " + aComponent + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    // Find this component's definition and dependencies
//ScriptWriter~~    <!com.esarks.arm.schemas.components.root:component!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.components.root:component")).resetIterator();
//ScriptWriter~~    if (<!com.esarks.arm.schemas.components.root!>!scan("component:name", aComponent)) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.components.root")).scan("component:name", aComponent)) {

      // Save these, as recursion will destory the index to the component item.
//ScriptWriter~~      String lEntity = <![com.esarks.arm.schemas.components.root:component:entity]!>;
      String lEntity = iSymbolTable.translateProperties("[com.esarks.arm.schemas.components.root:component:entity]");
//ScriptWriter~~      String lType = <![com.esarks.arm.schemas.components.root:component:type]!>;
      String lType = iSymbolTable.translateProperties("[com.esarks.arm.schemas.components.root:component:type]");
//ScriptWriter~~      String lSource = <![com.esarks.arm.schemas.components.root:component:source]!>;
      String lSource = iSymbolTable.translateProperties("[com.esarks.arm.schemas.components.root:component:source]");
//ScriptWriter~~      if (<!com.esarks.arm.schemas.components.root:component:source!>!size() == 0) lSource = aComponent;
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.components.root:component:source")).size() == 0) lSource = aComponent;
      String lCompile = "true";
//ScriptWriter~~      if (<!com.esarks.arm.schemas.components.root:component:compile!>!size() > 0) lCompile = <![com.esarks.arm.schemas.components.root:component:compile]!>;
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.components.root:component:compile")).size() > 0) lCompile = iSymbolTable.translateProperties("[com.esarks.arm.schemas.components.root:component:compile]");
//ScriptWriter~~      String lContext = <![com.esarks.arm.schemas.components.root:component:context]!>;
      String lContext = iSymbolTable.translateProperties("[com.esarks.arm.schemas.components.root:component:context]");
//ScriptWriter~~      String lDbConnection = <![com.esarks.arm.schemas.components.root:component:dbConnection]!>;
      String lDbConnection = iSymbolTable.translateProperties("[com.esarks.arm.schemas.components.root:component:dbConnection]");
      // Get dependencies in a list, and process each one...
      ArrayList lArrayList = new ArrayList();
//ScriptWriter~~      <!com.esarks.arm.schemas.components.root:component:dependsOn!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.components.root:component:dependsOn")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.components.root:component:dependsOn!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.components.root:component:dependsOn")).next()) {
//ScriptWriter~~        lArrayList.add(<![com.esarks.arm.schemas.components.root:component:dependsOn:name]!>);
        lArrayList.add(iSymbolTable.translateProperties("[com.esarks.arm.schemas.components.root:component:dependsOn:name]"));
//ScriptWriter~~        %>   depends on                 * <![com.esarks.arm.schemas.components.root:component:dependsOn:name]!><!%"\r\n"!><%
        {
//ScriptWriter~~~
iOutputManager.println("   depends on                 * " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.components.root:component:dependsOn:name]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }

      // Process the dependencies
      for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
        addComponent((String) lArrayList.get(lIdx));
      }

//ScriptWriter~~      %>   added                      + <!%aComponent!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("   added                      + " + aComponent + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      /// Now add the component

      if (lType.equals("SqlTable")) {
//DbTable
        String lPackage = lSource;
        for(int lIdx=lSource.length(); lIdx > 0; lIdx--) {
          if (lSource.charAt(lIdx-1) == '.') {
            lPackage = lSource.substring(0, lIdx-1);
            break;
          }
        }
//ScriptWriter~~        <!make!>!set("ddl");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("ddl");
//ScriptWriter~~        <!make:ddl:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script")).set(lSource);
//ScriptWriter~~        <!make:ddl:script:entity!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:entity")).set(aComponent);
//ScriptWriter~~        <!make:ddl:script:method!>!set("createTable");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:method")).set("createTable");
//ScriptWriter~~        <!make!>!set("jeo");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("jeo");
//ScriptWriter~~        <!make:jeo:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script")).set(lSource);
//ScriptWriter~~        <!make:jeo:script:entity!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:entity")).set(aComponent);
//ScriptWriter~~        <!make:jeo:script:method!>!set("createTable");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:method")).set("createTable");
//ScriptWriter~~        <!make:jeo:script:compile!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:compile")).set("true");
//Services
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set(iGenerateService);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(iGenerateService);
//ScriptWriter~~        <!make:script:method!>!set("generateServices");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:method")).set("generateServices");
//ScriptWriter~~        <!make:script:argument!>!set(lPackage + "." + aComponent + "Crud_Crud");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument")).set(lPackage + "." + aComponent + "Crud_Crud");
//ScriptWriter~~        <!make:script!>!set(lPackage + "." + aComponent + "Crud");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(lPackage + "." + aComponent + "Crud");
//ScriptWriter~~        <!make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set("?");
      }
      else if (lType.equals("SqlView")) {
//DbView
        String lPackage = lSource;
        for(int lIdx=lSource.length(); lIdx > 0; lIdx--) {
          if (lSource.charAt(lIdx-1) == '.') {
            lPackage = lSource.substring(0, lIdx-1);
            break;
          }
        }
//ScriptWriter~~        <!make!>!set("ddl");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("ddl");
//ScriptWriter~~        <!make:ddl:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script")).set(lSource);
//ScriptWriter~~        <!make:ddl:script:entity!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:entity")).set(aComponent);
//ScriptWriter~~        <!make:ddl:script:method!>!set("createView");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:method")).set("createView");
//ScriptWriter~~        <!make!>!set("jeo");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("jeo");
//ScriptWriter~~        <!make:jeo:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script")).set(lSource);
//ScriptWriter~~        <!make:jeo:script:entity!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:entity")).set(aComponent);
//ScriptWriter~~        <!make:jeo:script:method!>!set("createView");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:method")).set("createView");
//ScriptWriter~~        <!make:jeo:script:compile!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:compile")).set("true");
//Services
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set(iGenerateService);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(iGenerateService);
//ScriptWriter~~        <!make:script:method!>!set("generateServices");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:method")).set("generateServices");
//ScriptWriter~~        <!make:script:argument!>!set(lPackage + "." + aComponent + "Read_Crud");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument")).set(lPackage + "." + aComponent + "Read_Crud");
//ScriptWriter~~        <!make:script!>!set(lPackage + "." + aComponent + "Read");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(lPackage + "." + aComponent + "Read");
//ScriptWriter~~        <!make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set("?");
      }
      else if (lType.equals("DropSqlTable")) {
//ScriptWriter~~        <!make!>!set("ddl");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("ddl");
//ScriptWriter~~        <!make:ddl:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script")).set(lSource);
//ScriptWriter~~        <!make:ddl:script:entity!>!set(lEntity);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:entity")).set(lEntity);
//ScriptWriter~~        <!make:ddl:script:method!>!set("dropTable");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:method")).set("dropTable");
      }
      else if (lType.equals("DropSqlView")) {
//ScriptWriter~~        <!make!>!set("ddl");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("ddl");
//ScriptWriter~~        <!make:ddl:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script")).set(lSource);
//ScriptWriter~~        <!make:ddl:script:entity!>!set(lEntity);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:entity")).set(lEntity);
//ScriptWriter~~        <!make:ddl:script:method!>!set("dropView");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:ddl:script:method")).set("dropView");
      }
      else if (lType.equals("DbSql")) {
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set(iGenerateDdl);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(iGenerateDdl);
//ScriptWriter~~        <!make:script:method!>!set("performSqlFile");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:method")).set("performSqlFile");
//ScriptWriter~~        <!make:script:argument!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument")).set(lSource);
//ScriptWriter~~        <!make:script:argument2!>!set(lDbConnection);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument2")).set(lDbConnection);
      }
      else if (lType.equals("Jeo")) {
//ScriptWriter~~        <!make!>!set("jeo");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("jeo");
//ScriptWriter~~        <!make:jeo:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script")).set(lSource);
        if (lEntity.equals("")) {
//ScriptWriter~~          <!make:jeo:script:entity!>!set(aComponent);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:entity")).set(aComponent);
        } else {
//ScriptWriter~~          <!make:jeo:script:entity!>!set(lEntity);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:entity")).set(lEntity);
        }
//ScriptWriter~~        <!make:jeo:script:method!>!set("createJeo");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:method")).set("createJeo");
//ScriptWriter~~        <!make:jeo:script:compile!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:jeo:script:compile")).set("true");
      }
      else if (lType.equals("Services")) {
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set(iGenerateService);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(iGenerateService);
//ScriptWriter~~        <!make:script:method!>!set("generateServices");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:method")).set("generateServices");
//ScriptWriter~~        <!make:script:argument!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument")).set(lSource);
//ScriptWriter~~        <!make:script!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(aComponent);
//ScriptWriter~~        <!make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set("?");
      }
      else if (lType.equals("Report")) {
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set(iGenerateReport);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(iGenerateReport);
//ScriptWriter~~        <!make:script:method!>!set("generateReport");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:method")).set("generateReport");
//ScriptWriter~~        <!make:script:argument!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument")).set(lSource);
//ScriptWriter~~        <!make:script!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(aComponent);
//ScriptWriter~~        <!make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set("?");
      }
      else if (lType.equals("Dtable")) {
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set(iGenerateDtable);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(iGenerateDtable);
//ScriptWriter~~        <!make:script:method!>!set("generateDtable");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:method")).set("generateDtable");
//ScriptWriter~~        <!make:script:argument!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument")).set(lSource);
//ScriptWriter~~        <!make:script!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(aComponent);
//ScriptWriter~~        <!make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set("?");
      }
      else if (lType.equals("Rule")) {
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set("com.esarks.arm.rule.GenerateRule");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set("com.esarks.arm.rule.GenerateRule");
//ScriptWriter~~        <!make:script:method!>!set("generateRule");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:method")).set("generateRule");
//ScriptWriter~~        <!make:script:argument!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument")).set(lSource);
//ScriptWriter~~        <!make:script!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(aComponent);
//ScriptWriter~~        <!make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set("?");
      }
      else if (lType.equals("View")) {
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set(iGenerateFrame);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(iGenerateFrame);
//ScriptWriter~~        <!make:script:method!>!set("generateFrames");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:method")).set("generateFrames");
//ScriptWriter~~        <!make:script:argument!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:argument")).set(lSource);
//ScriptWriter~~        <!make:script!>!set(aComponent);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(aComponent);
//ScriptWriter~~        <!make:script:context!>!set("?");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set("?");
      }
      else if (lType.equals("Script2")) {
//ScriptWriter~~        <!make!>!set("script2");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script2");
//ScriptWriter~~        <!make:script2!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script2")).set(lSource);
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(lSource);
        if (lContext.equals("")) {
//ScriptWriter~~          <!make:script:context!>!set("?");
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set("?");
        } else {
//ScriptWriter~~          <!make:script:context!>!set(lContext);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set(lContext);
        }
//ScriptWriter~~        <!make:script:compile!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:compile")).set("true");
      }
      else if (lType.equals("Script")) {
//ScriptWriter~~        <!make!>!set("script");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make")).set("script");
//ScriptWriter~~        <!make:script!>!set(lSource);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script")).set(lSource);
        if (lContext.equals("")) {
//ScriptWriter~~          <!make:script:context!>!set("?");
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set("?");
        } else {
//ScriptWriter~~          <!make:script:context!>!set(lContext);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:context")).set(lContext);
        }
//ScriptWriter~~        <!make:script:compile!>!set(lCompile);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("make:script:compile")).set(lCompile);
      }
      else {
      }
    }
}
}
