//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.jac.generators;

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
public class GenerateDdl extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected GenerateDdl() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public GenerateDdl(Script aScript) {

    super(aScript);

  }

//com.esarks.arm.schemas.ddl.root

  public void dropTable(String aXmlDefinition, String aTable) {
    resetExit();
    try {
//ScriptWriter~~    %>dropTable: <!%aXmlDefinition!> - <!%aTable!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("dropTable: " + aXmlDefinition + " - " + aTable + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    String lPackage = readTableXml(aXmlDefinition);
    if (checkExit()) return;
    dropTable(aTable);
    if (checkExit()) return;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  public void createTable(String aXmlDefinition, String aTable) {

    resetExit();
    try {
//ScriptWriter~~    %>createTable: <!%aXmlDefinition!> - <!%aTable!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("createTable: " + aXmlDefinition + " - " + aTable + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    String lPackage = aXmlDefinition;
    for(int lIdx=aXmlDefinition.length(); lIdx > 0; lIdx--) {
      if (aXmlDefinition.charAt(lIdx-1) == '.') {
        lPackage = aXmlDefinition.substring(0, lIdx-1);
        break;
      }
    }

    boolean lForce = false;
    setContext(iScript.getMasterScript());
//ScriptWriter~~    if (<![$jac:makeAll:force]!>.equals("true")) lForce = true;
    if (iSymbolTable.translateProperties("[$jac:makeAll:force]").equals("true")) lForce = true;
    restoreContext();
    if (!lForce) {
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateDdl") + ".script");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(lPackage + "." + aTable) + ".sql");
      if (lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          ((lGeneratorFile.exists() && lNewFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) || !lGeneratorFile.exists())) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("File " + lPackage + "." + aTable + ".sql is not stale.  Generation bypassed.");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("File " + lPackage + "." + aTable + ".sql is not stale.  Generation bypassed.");
//ScriptWriter~~        <!$jac:event:severity!>!set("info");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("info");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return;
      }
    }
    
    readTableXml(aXmlDefinition);
    if (checkExit()) return;
    generateDbTable(aXmlDefinition, lPackage, aTable);
    if (checkExit()) return;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  public void dropView(String aXmlDefinition, String aView) {
    resetExit();
    try {
//ScriptWriter~~    %>dropView: <!%aXmlDefinition!> - <!%aView!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("dropView: " + aXmlDefinition + " - " + aView + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    readViewXml(aXmlDefinition);
    if (checkExit()) return;
    dropView(aView);
    if (checkExit()) return;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  public void createView(String aXmlDefinition, String aView) {
    resetExit();
    try {
//ScriptWriter~~    %>createView: <!%aXmlDefinition!> - <!%aView!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("createView: " + aXmlDefinition + " - " + aView + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    String lPackage = aXmlDefinition;
    for(int lIdx=aXmlDefinition.length(); lIdx > 0; lIdx--) {
      if (aXmlDefinition.charAt(lIdx-1) == '.') {
        lPackage = aXmlDefinition.substring(0, lIdx-1);
        break;
      }
    }

    boolean lForce = false;
    setContext(iScript.getMasterScript());
//ScriptWriter~~    if (<![$jac:makeAll:force]!>.equals("true")) lForce = true;
    if (iSymbolTable.translateProperties("[$jac:makeAll:force]").equals("true")) lForce = true;
    restoreContext();
    if (!lForce) {
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateDdl") + ".script");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(lPackage + "." + aView) + ".sql");
      if (lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          ((lGeneratorFile.exists() && lNewFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) || !lGeneratorFile.exists())) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("File " + lPackage + "." + aView + ".sql is not stale.  Generation bypassed.");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("File " + lPackage + "." + aView + ".sql is not stale.  Generation bypassed.");
//ScriptWriter~~        <!$jac:event:severity!>!set("info");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("info");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return;
      }
    }
    
    readViewXml(aXmlDefinition);
    if (checkExit()) return;
    generateDbView(aXmlDefinition, lPackage, aView);
    if (checkExit()) return;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  public void loadTable(String aXmlDefinition, String aTable) {
    try {
//ScriptWriter~~    %>loadTable: <!%aXmlDefinition!> - <!%aTable!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("loadTable: " + aXmlDefinition + " - " + aTable + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    readTableXml(aXmlDefinition);
    if (checkExit()) return;
    loadTable(aTable);
    if (checkExit()) return;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  public void performSqlFile(String aSqlFile) {
    performSqlFile(aSqlFile, "");
  }

  public void performSqlFile(String aSqlFile, String aDbConnection) {
    resetExit();
    try {
//ScriptWriter~~    %>performSqlFile: <!%aSqlFile!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("performSqlFile: " + aSqlFile + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    FileReader lFileReader = new FileReader(path(aSqlFile) + ".sql");
    BufferedReader lBufferedReader = new BufferedReader(lFileReader);
    LineNumberReader lLineNumberReader = new LineNumberReader(lBufferedReader);
    StringBuffer lStringBuffer = new StringBuffer();
    String lLine;
    while ((lLine = lLineNumberReader.readLine()) != null) {
      lStringBuffer.append(lLine + "\r\n");
    }
    performSqlStatement(lStringBuffer, aDbConnection);
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
      if (e.getMessage().startsWith("[Microsoft][SQLServer 2000 Driver for JDBC][SQLServer]There is already an object named")) {
//ScriptWriter~~        <!$jac:event:severity!>!set("warning");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("warning");
      } else if (e.getMessage().indexOf(" already exists") > -1) {
//ScriptWriter~~        <!$jac:event:severity!>!set("warning");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("warning");
      } else {
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
      }
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }
  
  public void performSqlStatement(StringBuffer aSqlStatement) {
    performSqlStatement(aSqlStatement, "");
  }

  public void performSqlStatement(StringBuffer aSqlStatement, String aDbConnection) {
    try {

    String lSqlStatement = aSqlStatement.toString();
    int lTagSearchIndex = -1;
    while ( (lTagSearchIndex = lSqlStatement.indexOf("$")) > -1) {
      int lSize = lSqlStatement.substring(lTagSearchIndex).indexOf(" ");
      if (lSize == -1) {
        lSize = lSqlStatement.length();
      } else {
        lSize += lTagSearchIndex;
      }
      lSize = lSize;
      lSqlStatement = lSqlStatement.substring(0, lTagSearchIndex) + 
               getObjectPrefix(lSqlStatement.substring(lTagSearchIndex+1, lSize).toLowerCase()) + lSqlStatement.substring(lTagSearchIndex+1, lSize) +
               lSqlStatement.substring(lSize);
    }

    // Get the associated DbConnection of the incoming object name (aDbConnection).
    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(aDbConnection);
    
    if (lDbConnection.getMake()) {
      PreparedStatement lPreparedStatement;
      lPreparedStatement = lDbConnection.getConnection().prepareStatement(lSqlStatement);
      lPreparedStatement.execute();
    }

    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
      if (e.getMessage().startsWith("[Microsoft][SQLServer 2000 Driver for JDBC][SQLServer]There is already an object named")) {
//ScriptWriter~~        <!$jac:event:severity!>!set("warning");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("warning");
      } else {
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
      }
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  private String readTableXml(String aXmlDefinition) {
    try {
    String lPackage = aXmlDefinition;
    for(int lIdx=aXmlDefinition.length(); lIdx > 0; lIdx--) {
      if (aXmlDefinition.charAt(lIdx-1) == '.') {
        lPackage = aXmlDefinition.substring(0, lIdx-1);
        break;
      }
    }
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).remove();
    parseXmlDefinition(aXmlDefinition);
    if (checkExit()) return lPackage;
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).size() == 0) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Could not find <tables> tag in *.xml file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Could not find <tables> tag in *.xml file.");
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return "";
    }
    return lPackage;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return "";
    }
  }

  private String readViewXml(String aXmlDefinition) {
    try {
    String lPackage = aXmlDefinition;
    for(int lIdx=aXmlDefinition.length(); lIdx > 0; lIdx--) {
      if (aXmlDefinition.charAt(lIdx-1) == '.') {
        lPackage = aXmlDefinition.substring(0, lIdx-1);
        break;
      }
    }

//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).remove();
    parseXmlDefinition(aXmlDefinition);
    if (checkExit()) return "";
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).size() == 0) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Could not find <views> tag in *.xml file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Could not find <views> tag in *.xml file.");
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return "";
    }
    return lPackage;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return "";
    }
  }

  private void generateIndexes() {
    try {
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table:index!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:index")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:table:index!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:index")).next()) {

      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %><table border=1 cellpadding=3 cellspacing=0><%
      {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td>Index <![com.esarks.arm.schemas.ddl.root:table:index:type]!></td><td><![com.esarks.arm.schemas.ddl.root:table:index:name]!></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Index " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:type]") + "</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:name]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");

//ScriptWriter~~      %>CREATE <![com.esarks.arm.schemas.ddl.root:table:index:type]!> INDEX <![com.esarks.arm.schemas.ddl.root:table:index:name]!> ON <![com.esarks.arm.schemas.ddl.root:table:name]!> (<%
      {
//ScriptWriter~~~
iOutputManager.println("CREATE " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:type]") + " INDEX " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:name]") + " ON " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:name]") + " (", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:index:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:index:field")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:table:index:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:index:field")).next()) {
//ScriptWriter~~        %><![com.esarks.arm.schemas.ddl.root:table:index:field]!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:field]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:table:index:field!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:index:field")).isLast() == false) {
//ScriptWriter~~          %>, <%
          {
//ScriptWriter~~~
iOutputManager.println(", ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~          %>) <![com.esarks.arm.schemas.ddl.root:table:index:with]!><!%"\r\n"!><%
          {
//ScriptWriter~~~
iOutputManager.println(") " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:with]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        iOutputManager.setDocument("createHtml");
//ScriptWriter~~        %><tr><td>Field</td><td><![com.esarks.arm.schemas.ddl.root:table:index:field]!></td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Field</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:field]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        iOutputManager.setDocument("createTable");
      }
//ScriptWriter~~      if (<!com.esarks.arm.schemas.ddl.root:table:index:with!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:index:with")).size() > 0) {
        iOutputManager.setDocument("createHtml");
//ScriptWriter~~        %><tr><td>With</td><td><![com.esarks.arm.schemas.ddl.root:table:index:with]!></td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td>With</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:with]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        iOutputManager.setDocument("createTable");
      }
      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");
    }
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  private boolean generateKey(boolean aInsertComma) {
    try {
    boolean lReturn = aInsertComma;
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table:primary!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:primary")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:table:primary!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:primary")).next()) {

      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %><table border=1 cellpadding=3 cellspacing=0><%
      {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td>Primary Key</td><td><![com.esarks.arm.schemas.ddl.root:table:primary:name]!></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Primary Key</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:primary:name]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");

      if (lReturn) {
//ScriptWriter~~        %>,<!%"\r\n"!><%
        {
//ScriptWriter~~~
iOutputManager.println("," + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      lReturn = true;
//ScriptWriter~~      %>  CONSTRAINT <![com.esarks.arm.schemas.ddl.root:table:primary:name]!><%
      {
//ScriptWriter~~~
iOutputManager.println("  CONSTRAINT " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:primary:name]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %> PRIMARY KEY (<%
      {
//ScriptWriter~~~
iOutputManager.println(" PRIMARY KEY (", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:primary:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:primary:field")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:table:primary:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:primary:field")).next()) {
//ScriptWriter~~        %><![com.esarks.arm.schemas.ddl.root:table:primary:field]!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:primary:field]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:table:primary:field!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:primary:field")).isLast() == false) {
//ScriptWriter~~          %>, <%
          {
//ScriptWriter~~~
iOutputManager.println(", ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~          %>)<%
          {
//ScriptWriter~~~
iOutputManager.println(")", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        iOutputManager.setDocument("createHtml");
//ScriptWriter~~        %><tr><td>Field</td><td><![com.esarks.arm.schemas.ddl.root:table:primary:field]!></td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Field</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:primary:field]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        iOutputManager.setDocument("createTable");
      }

      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");

    }

//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table:unique!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:unique")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:table:unique!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:unique")).next()) {

      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %><table border=1 cellpadding=3 cellspacing=0><%
      {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td>Unique Constraint</td><td><![com.esarks.arm.schemas.ddl.root:table:unique:name]!></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Unique Constraint</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:unique:name]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");

      if (lReturn) {
//ScriptWriter~~        %>,<!%"\r\n"!><%
        {
//ScriptWriter~~~
iOutputManager.println("," + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      lReturn = true;
//ScriptWriter~~      %>  CONSTRAINT <![com.esarks.arm.schemas.ddl.root:table:unique:name]!><%
      {
//ScriptWriter~~~
iOutputManager.println("  CONSTRAINT " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:unique:name]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %> UNIQUE (<%
      {
//ScriptWriter~~~
iOutputManager.println(" UNIQUE (", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:unique:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:unique:field")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:table:unique:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:unique:field")).next()) {
//ScriptWriter~~        %><![com.esarks.arm.schemas.ddl.root:table:unique:field]!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:unique:field]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:table:unique:field!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:unique:field")).isLast() == false) {
//ScriptWriter~~          %>, <%
          {
//ScriptWriter~~~
iOutputManager.println(", ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~          %>)<%
          {
//ScriptWriter~~~
iOutputManager.println(")", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        iOutputManager.setDocument("createHtml");
//ScriptWriter~~        %><tr><td>Field</td><td><![com.esarks.arm.schemas.ddl.root:table:unique:field]!></td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Field</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:unique:field]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        iOutputManager.setDocument("createTable");
      }

      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");
    }

//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table:foreign!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:foreign")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:table:foreign!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:foreign")).next()) {

      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %><table border=1 cellpadding=3 cellspacing=0><%
      {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td>Foreign Key Constraint</td><td><![com.esarks.arm.schemas.ddl.root:table:foreign:name]!></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Foreign Key Constraint</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:foreign:name]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");

      if (lReturn) {
//ScriptWriter~~        %>,<!%"\r\n"!><%
        {
//ScriptWriter~~~
iOutputManager.println("," + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      lReturn = true;
//ScriptWriter~~      %>  CONSTRAINT <![com.esarks.arm.schemas.ddl.root:table:foreign:name]!><%
      {
//ScriptWriter~~~
iOutputManager.println("  CONSTRAINT " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:foreign:name]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %> FOREIGN KEY (<%
      {
//ScriptWriter~~~
iOutputManager.println(" FOREIGN KEY (", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:foreign:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:foreign:field")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:table:foreign:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:foreign:field")).next()) {
//ScriptWriter~~        %><![com.esarks.arm.schemas.ddl.root:table:foreign:field]!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:foreign:field]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:table:foreign:field!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:foreign:field")).isLast() == false) {
//ScriptWriter~~          %>, <%
          {
//ScriptWriter~~~
iOutputManager.println(", ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~          %>)<%
          {
//ScriptWriter~~~
iOutputManager.println(")", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        iOutputManager.setDocument("createHtml");
//ScriptWriter~~        %><tr><td>Field</td><td><![com.esarks.arm.schemas.ddl.root:table:foreign:field]!></td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Field</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:foreign:field]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        iOutputManager.setDocument("createTable");
      }
//ScriptWriter~~      String lDatabase = getObjectPrefix(<![com.esarks.arm.schemas.ddl.root:table:foreign:references:name]!>.toLowerCase());
      String lDatabase = getObjectPrefix(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:foreign:references:name]").toLowerCase());
//ScriptWriter~~      %> REFERENCES <!%lDatabase!><![com.esarks.arm.schemas.ddl.root:table:foreign:references:name]!> (<%
      {
//ScriptWriter~~~
iOutputManager.println(" REFERENCES " + lDatabase + "" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:foreign:references:name]") + " (", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %><tr><td>References</td><td><!%lDatabase!><![com.esarks.arm.schemas.ddl.root:table:foreign:references:name]!></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td>References</td><td>" + lDatabase + "" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:foreign:references:name]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");

//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:foreign:references:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:foreign:references:field")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:table:foreign:references:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:foreign:references:field")).next()) {
//ScriptWriter~~        %><![com.esarks.arm.schemas.ddl.root:table:foreign:references:field]!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:foreign:references:field]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:table:foreign:references:field!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:foreign:references:field")).isLast() == false) {
//ScriptWriter~~          %>, <%
          {
//ScriptWriter~~~
iOutputManager.println(", ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~          %>)<%
          {
//ScriptWriter~~~
iOutputManager.println(")", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        iOutputManager.setDocument("createHtml");
//ScriptWriter~~        %><tr><td>Field</td><td><![com.esarks.arm.schemas.ddl.root:table:references:field]!></td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td>Field</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:references:field]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        iOutputManager.setDocument("createTable");
      }
      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");
    }

    return false;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return false;
    }
  }

  private boolean generateDbFields(DbConnection aDbConnection) {
    try {
    boolean lReturn = false;
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table:field!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:field")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:table:field!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:field")).next()) {
      if (lReturn) {
//ScriptWriter~~        %>,<!%"\r\n"!><%
        {
//ScriptWriter~~~
iOutputManager.println("," + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        lReturn = false;
      }
//ScriptWriter~~      %>  <![com.esarks.arm.schemas.ddl.root:table:field:name]!><%
      {
//ScriptWriter~~~
iOutputManager.println("  " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:name]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      String lType = <![com.esarks.arm.schemas.ddl.root:table:field:type]!>;
      String lType = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:type]");
//ScriptWriter~~      String lIdentity = <![com.esarks.arm.schemas.ddl.root:table:field:identity]!>;
      String lIdentity = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:identity]");
//ScriptWriter~~      String lSize = <![com.esarks.arm.schemas.ddl.root:table:field:size]!>;
      String lSize = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:size]");

      if (aDbConnection.getStereotype().equals("sqlServer")) {
        if (lIdentity.equals("true")) {
//ScriptWriter~~          %> <!%getDbType(lType, lSize)!> identity (1, 1)<%
          {
//ScriptWriter~~~
iOutputManager.println(" " + getDbType(lType, lSize) + " identity (1, 1)", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~          %> <!%getDbType(lType, lSize)!><%
          {
//ScriptWriter~~~
iOutputManager.println(" " + getDbType(lType, lSize) + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        if (<![com.esarks.arm.schemas.ddl.root:table:field:nullable]!>.compareTo("false") == 0) {
        if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:nullable]").compareTo("false") == 0) {
//ScriptWriter~~          %> NOT NULL<%
          {
//ScriptWriter~~~
iOutputManager.println(" NOT NULL", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }
      
      if (aDbConnection.getStereotype().equals("postgreSql")) {
        if (lIdentity.equals("true")) {
//ScriptWriter~~          %> <!%getDbType(lType, lSize)!> AS IDENTITY<%
          {
//ScriptWriter~~~
iOutputManager.println(" " + getDbType(lType, lSize) + " AS IDENTITY", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~          %> <!%getDbType(lType, lSize)!><%
          {
//ScriptWriter~~~
iOutputManager.println(" " + getDbType(lType, lSize) + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        if (<![com.esarks.arm.schemas.ddl.root:table:field:nullable]!>.compareTo("false") == 0) {
        if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:nullable]").compareTo("false") == 0) {
//ScriptWriter~~          %> NOT NULL<%
          {
//ScriptWriter~~~
iOutputManager.println(" NOT NULL", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }

      if (aDbConnection.getStereotype().equals("mySql")) {
//ScriptWriter~~        %> <!%getDbType(lType, lSize)!><%
        {
//ScriptWriter~~~
iOutputManager.println(" " + getDbType(lType, lSize) + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<![com.esarks.arm.schemas.ddl.root:table:field:nullable]!>.compareTo("false") == 0) {
        if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:nullable]").compareTo("false") == 0) {
//ScriptWriter~~          %> NOT NULL<%
          {
//ScriptWriter~~~
iOutputManager.println(" NOT NULL", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        if (lIdentity.equals("true")) {
//ScriptWriter~~          %> AUTO_INCREMENT<%
          {
//ScriptWriter~~~
iOutputManager.println(" AUTO_INCREMENT", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }

      lReturn = true;
      iOutputManager.setDocument("createHtml");
//ScriptWriter~~      %><tr><td><![com.esarks.arm.schemas.ddl.root:table:field:name]!>&nbsp;</td><td><![com.esarks.arm.schemas.ddl.root:table:field:identity]!>&nbsp;</td><td><![com.esarks.arm.schemas.ddl.root:table:field:type]!>&nbsp;</td><td><![com.esarks.arm.schemas.ddl.root:table:field:size]!>&nbsp;</td><td><!%getDbType(lType, lSize)!>&nbsp;</td><td><![com.esarks.arm.schemas.ddl.root:table:field:nullable]!>&nbsp;</td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:name]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:identity]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:type]") + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:size]") + "&nbsp;</td><td>" + getDbType(lType, lSize) + "&nbsp;</td><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:nullable]") + "&nbsp;</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.setDocument("createTable");
    }
    return lReturn;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return false;
    }
  }
  
  public void generateDbTable(String aXmlDefinition, String aPackage, String aTable) {
    try {
//ScriptWriter~~    %>GenerateDdl:generateDbTable XML=<!%aXmlDefinition!>, Packge=<!%aPackage!>, Table=<!%aTable!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("GenerateDdl:generateDbTable XML=" + aXmlDefinition + ", Packge=" + aPackage + ", Table=" + aTable + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table")).resetIterator();
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root!>!scan("table:name", aTable) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).scan("table:name", aTable) == false) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Cannot find table <!%aTable!> in XML.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Cannot find table iSymbolTable.translateProperties(aTable) in XML.");
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
    setContext(iScript.getMasterScript());
//ScriptWriter~~    String lDateTime = <![$jac:dateTime]!>;
    String lDateTime = iSymbolTable.translateProperties("[$jac:dateTime]");
    restoreContext();
    iOutputManager.addDocument("createTable");
//ScriptWriter~~    %>--  Generated at <!%lDateTime!> by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("--  Generated at " + lDateTime + " by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    iOutputManager.addDocument("createHtml");
//ScriptWriter~~    %><html><%
    {
//ScriptWriter~~~
iOutputManager.println("<html>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.setDocument("createTable");

    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
//ScriptWriter~~    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(<![com.esarks.arm.schemas.ddl.root:table:name]!>.toLowerCase());
    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:name]").toLowerCase());

    iOutputManager.setDocument("createHtml");
//ScriptWriter~~    %><table border=1 cellpadding=3 cellspacing=0><%
    {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td><![com.esarks.arm.schemas.ddl.root:table:name]!></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td>" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:name]") + "</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></table><%
    {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.setDocument("createTable");

//ScriptWriter~~    %>CREATE TABLE <![com.esarks.arm.schemas.ddl.root:table:name]!> (<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("CREATE TABLE " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:name]") + " (" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    boolean lInsertComma = false;

    iOutputManager.setDocument("createHtml");
//ScriptWriter~~    %><table border=1 cellpadding=3 cellspacing=0><%
    {
//ScriptWriter~~~
iOutputManager.println("<table border=1 cellpadding=3 cellspacing=0>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td><b>Field Name</b></td><td><b>Identity</b></td><td><b>Type</b></td><td><b>Size</b></td><td><b>Db Type</b></td><td><b>Nullable</b></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td><b>Field Name</b></td><td><b>Identity</b></td><td><b>Type</b></td><td><b>Size</b></td><td><b>Db Type</b></td><td><b>Nullable</b></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.setDocument("createTable");

    lInsertComma = generateDbFields(lDbConnection);

    iOutputManager.setDocument("createHtml");
//ScriptWriter~~    %></table><%
    {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.setDocument("createTable");

    lInsertComma = generateKey(lInsertComma);
//ScriptWriter~~    %>);<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println(");" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    generateIndexes();

    boolean lForce = false;
    setContext(iScript.getMasterScript());
//ScriptWriter~~    if (<![$jac:makeAll:force]!>.equals("true")) lForce = true;
    if (iSymbolTable.translateProperties("[$jac:makeAll:force]").equals("true")) lForce = true;
    restoreContext();
    if (!lForce) {
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateDdl") + ".script");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(aPackage + "." + aTable) + ".sql");
      if (lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          ((lGeneratorFile.exists() && lNewFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) || !lGeneratorFile.exists())) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("File " + aPackage + "." + aTable + ".sql is not stale.  Generation bypassed.");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("File " + aPackage + "." + aTable + ".sql is not stale.  Generation bypassed.");
//ScriptWriter~~        <!$jac:event:severity!>!set("info");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("info");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return;
      }
    }

    iOutputManager.setDocument("createHtml");
//ScriptWriter~~    %></html><%
    {
//ScriptWriter~~~
iOutputManager.println("</html>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.setDocument("createTable");
    StringBuffer lStringBuffer = iOutputManager.getDocument("createHtml");
    if (openOutput(path(aPackage + "." + aTable) + ".html")) {
//ScriptWriter~~      %><!%lStringBuffer.toString()!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      closeOutput();
    }

    lStringBuffer = iOutputManager.getDocument("createTable");
    if (openOutput(path(aPackage + "." + aTable) + ".new")) {
//ScriptWriter~~      %><!%lStringBuffer.toString()!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      closeOutput();

      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:merge:sectionMarker!>!reset("--$Section=");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:sectionMarker")).reset("--$Section=");
//ScriptWriter~~      <!$jac:merge:preserveMarker!>!reset("$Preserve=yes");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preserveMarker")).reset("$Preserve=yes");
//ScriptWriter~~      <!$jac:merge:noPreserveMarker!>!reset("$Preserve=no");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:noPreserveMarker")).reset("$Preserve=no");
//ScriptWriter~~      <!$jac:merge:keepPreserveMarker!>!reset("$Preserve=keep");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepPreserveMarker")).reset("$Preserve=keep");
//ScriptWriter~~      <!$jac:merge:discardPreserveMarker!>!reset("$Preserve=discard");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:discardPreserveMarker")).reset("$Preserve=discard");
//ScriptWriter~~      <!$jac:merge:preservePreamble!>!reset("no");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preservePreamble")).reset("no");
//ScriptWriter~~      <!$jac:merge:comments!>!reset("--");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:comments")).reset("--");
//ScriptWriter~~      <!$jac:merge:excludeCompare!>!reset("--  Generated at");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:excludeCompare")).reset("--  Generated at");
//ScriptWriter~~      <!$jac:merge:trimOutput!>!reset("yes");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:trimOutput")).reset("yes");
//ScriptWriter~~      <!$jac:merge:keepSections!>!reset("no");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepSections")).reset("no");
      restoreContext();

      Merge.getInstance().doMerge(path(aPackage + "." + aTable) + ".sql", path(aPackage + "." + aTable) + ".new", iScript.getMasterScript());
      if (Merge.getInstance().getExceptionMessage() != null) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set(Merge.getInstance().getExceptionMessage());
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(Merge.getInstance().getExceptionMessage());
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return;      
      }

    } else {
      setContext(iScript.getMasterScript());
      if (iOutputManager.getExceptionMessage() != null) {
//ScriptWriter~~        <!$jac:event!>!set(iOutputManager.getExceptionMessage());
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(iOutputManager.getExceptionMessage());
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      }
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + aPackage + "." + aTable + ".sql output file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + aPackage + "." + aTable + ".sql output file.");
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
    
    if (lDbConnection.getMake()) {
      PreparedStatement lPreparedStatement;
      lPreparedStatement = lDbConnection.getConnection().prepareStatement(lStringBuffer.toString());
      lPreparedStatement.execute();
//ScriptWriter~~      %>...Table created<!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("...Table created" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else {
//ScriptWriter~~      %>...Table create bypassed<!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("...Table create bypassed" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
      if (e.getMessage().startsWith("[Microsoft][SQLServer 2000 Driver for JDBC][SQLServer]There is already an object named")) {
//ScriptWriter~~        <!$jac:event:severity!>!set("warning");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("warning");
      } else {
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
      }
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  public void dropTable(String aTable) {
    try {

    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(aTable.toLowerCase());

    if (lDbConnection.getMake()) {
      PreparedStatement lPreparedStatement;
      lPreparedStatement = lDbConnection.getConnection().prepareStatement( "DROP TABLE " + aTable );
      lPreparedStatement.execute();
    }
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  public void generateDbView(String aXmlDefinition, String aPackage, String aView) {
    try {
//ScriptWriter~~    %>GenerateDdl:generateDbView XML=<!%aXmlDefinition!>, Packge=<!%aPackage!>, View=<!%aView!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("GenerateDdl:generateDbView XML=" + aXmlDefinition + ", Packge=" + aPackage + ", View=" + aView + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:view!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view")).resetIterator();
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root!>!scan("view:name", aView) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).scan("view:name", aView) == false) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Cannot find view <!%aView!> in XML.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Cannot find view iSymbolTable.translateProperties(aView) in XML.");
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
    setContext(iScript.getMasterScript());
//ScriptWriter~~    String lDateTime = <![$jac:dateTime]!>;
    String lDateTime = iSymbolTable.translateProperties("[$jac:dateTime]");
    restoreContext();
    iOutputManager.addDocument("createView");
//ScriptWriter~~    %>--  Generated at <!%lDateTime!> by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("--  Generated at " + lDateTime + " by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    %>CREATE VIEW <![com.esarks.arm.schemas.ddl.root:view:name]!> AS <!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("CREATE VIEW " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:name]") + " AS " + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root:view:select!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:select")).size() > 0) {
//ScriptWriter~~      String lSelect = <![com.esarks.arm.schemas.ddl.root:view:select]!>;
      String lSelect = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:select]");
      int lTagSearchIndex = -1;
      while ( (lTagSearchIndex = lSelect.indexOf("$")) > -1) {
        int lSize = lSelect.substring(lTagSearchIndex).indexOf(" ");
        if (lSize == -1) {
          lSize = lSelect.length();
        } else {
          lSize += lTagSearchIndex;
        }
        lSize = lSize;
        lSelect = lSelect.substring(0, lTagSearchIndex) + 
                 getObjectPrefix(lSelect.substring(lTagSearchIndex+1, lSize).toLowerCase()) + lSelect.substring(lTagSearchIndex+1, lSize) +
                 lSelect.substring(lSize);
      }
//ScriptWriter~~      %><!%lSelect!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + lSelect + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else {
//ScriptWriter~~      %>SELECT <!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("SELECT " + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:view:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table")).resetIterator();
    boolean lComma = false;
    String lTables = "FROM ";
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:view:select!>!size() == 0 && <!com.esarks.arm.schemas.ddl.root:view:table!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:select")).size() == 0 && iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table")).next()) {
      String lFirstName = null;
      String lMiddleName = null;
      String lLastName = null;
      String lSuffixName = null;
      boolean lHasName = false;
      String lNameView = "hrmConcatName";
//ScriptWriter~~//      lTables = lTables.concat(<![com.esarks.arm.schemas.ddl.root:view:table:name]!>);
//      lTables = lTables.concat(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]"));
//ScriptWriter~~      lTables = lTables.concat(getObjectPrefix(<![com.esarks.arm.schemas.ddl.root:view:table:name]!>.toLowerCase()) + <![com.esarks.arm.schemas.ddl.root:view:table:name]!>);
      lTables = lTables.concat(getObjectPrefix(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]").toLowerCase()) + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]"));
//ScriptWriter~~      if (<!com.esarks.arm.schemas.ddl.root:view:table:symbolic!>!size() > 0) lTables = lTables.concat(" " + <![com.esarks.arm.schemas.ddl.root:view:table:symbolic]!>);
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:symbolic")).size() > 0) lTables = lTables.concat(" " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:symbolic]"));
//ScriptWriter~~      if (<!com.esarks.arm.schemas.ddl.root:view:table!>!isLast() == false) lTables = lTables.concat(", ");
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table")).isLast() == false) lTables = lTables.concat(", ");
//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:view:table:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:view:table:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column")).next()) {
        if (lComma == true) {
//ScriptWriter~~          %>,<!%"\r\n"!><%
          {
//ScriptWriter~~~
iOutputManager.println("," + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        String lPrefix = "";
//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:view:table:symbolic!>!size() == 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:symbolic")).size() == 0) {
//ScriptWriter~~          lPrefix = getObjectPrefix(<![com.esarks.arm.schemas.ddl.root:view:table:name]!>.toLowerCase()) + <![com.esarks.arm.schemas.ddl.root:view:table:name]!>;
          lPrefix = getObjectPrefix(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]").toLowerCase()) + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]");
        } else {
//ScriptWriter~~          lPrefix = <![com.esarks.arm.schemas.ddl.root:view:table:symbolic]!>;
          lPrefix = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:symbolic]");
        }
//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:view:table:column:name!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column:name")).size() > 0) {
//ScriptWriter~~          if (<![com.esarks.arm.schemas.ddl.root:view:table:column:isColumn]!>.compareTo("false") == 0) {
          if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:isColumn]").compareTo("false") == 0) {
//ScriptWriter~~            if (<!com.esarks.arm.schemas.ddl.root:view:table:column:prefix!>!size() == 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column:prefix")).size() == 0) {
//ScriptWriter~~              %>  <%
              {
//ScriptWriter~~~
iOutputManager.println("  ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            } else {
//ScriptWriter~~              %>  <![com.esarks.arm.schemas.ddl.root:view:table:column:prefix]!>.<%
              {
//ScriptWriter~~~
iOutputManager.println("  " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:prefix]") + ".", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
          }else {
//ScriptWriter~~            %>  <!%lPrefix!>.<%
            {
//ScriptWriter~~~
iOutputManager.println("  " + lPrefix + ".", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          %><![com.esarks.arm.schemas.ddl.root:view:table:column:name]!><%
          {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          if (<!com.esarks.arm.schemas.ddl.root:view:table:column:view!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column:view")).size() > 0) {
//ScriptWriter~~            %> <![com.esarks.arm.schemas.ddl.root:view:table:column:view]!><%
            {
//ScriptWriter~~~
iOutputManager.println(" " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:view]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          if (<![com.esarks.arm.schemas.ddl.root:view:table:column:isType]!>.compareTo("true") == 0) {
          if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:isType]").compareTo("true") == 0) {
//ScriptWriter~~            %>,<!%"\r\n"!><%
            {
//ScriptWriter~~~
iOutputManager.println("," + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            %>  <!%getObjectPrefix("hrmgettypename")!>hrmGetTypeName('<![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>', <%
            {
//ScriptWriter~~~
iOutputManager.println("  " + getObjectPrefix("hrmgettypename") + "hrmGetTypeName('" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]") + "', ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            if (<!com.esarks.arm.schemas.ddl.root:view:table:symbolic!>!size() == 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:symbolic")).size() == 0) {
//ScriptWriter~~              String lTableName = getObjectPrefix(<![com.esarks.arm.schemas.ddl.root:view:table:name]!>.toLowerCase()) + <![com.esarks.arm.schemas.ddl.root:view:table:name]!>;
              String lTableName = getObjectPrefix(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]").toLowerCase()) + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]");
//ScriptWriter~~              %>  <!%lTableName!>.<%
              {
//ScriptWriter~~~
iOutputManager.println("  " + lTableName + ".", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            } else {
//ScriptWriter~~              %>  <![com.esarks.arm.schemas.ddl.root:view:table:symbolic]!>.<%
              {
//ScriptWriter~~~
iOutputManager.println("  " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:symbolic]") + ".", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~            %><![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>) <![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>Name<%
            {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]") + ") " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]") + "Name", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          if (<!com.esarks.arm.schemas.ddl.root:view:table:column:isName!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column:isName")).size() > 0) {
//ScriptWriter~~            if (<!com.esarks.arm.schemas.ddl.root:view:table:column:nameView!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column:nameView")).size() > 0) {
//ScriptWriter~~              lNameView = <![com.esarks.arm.schemas.ddl.root:view:table:column:nameView]!>;
              lNameView = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:nameView]");
            }
//ScriptWriter~~            String lNameType = <![com.esarks.arm.schemas.ddl.root:view:table:column:isName]!>;
            String lNameType = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:isName]");
            if (lNameType.compareTo("first") == 0) {
              lHasName = true;
//ScriptWriter~~              lFirstName = lPrefix + "." + <![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>;
              lFirstName = lPrefix + "." + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]");
            }
            else if (lNameType.compareTo("middle") == 0) {
              lHasName = true;
//ScriptWriter~~              lMiddleName = lPrefix + "." + <![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>;
              lMiddleName = lPrefix + "." + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]");
            }
            else if (lNameType.compareTo("last") == 0) {
              lHasName = true;
//ScriptWriter~~              lLastName = lPrefix + "." + <![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>;
              lLastName = lPrefix + "." + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]");
            }
            else if (lNameType.compareTo("suffix") == 0) {
              lHasName = true;
//ScriptWriter~~              lSuffixName = lPrefix + "." + <![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>;
              lSuffixName = lPrefix + "." + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]");
            }
          }
          lComma = true;
        }
      }
      if (lHasName == true) {
        if (lFirstName == null) lFirstName = "''";
        if (lMiddleName == null) lMiddleName = "''";
        if (lLastName == null) lLastName = "''";
        if (lSuffixName == null) lSuffixName = "''";
//ScriptWriter~~        if (lComma == true) %>,<!%"\r\n"!><%
        if (lComma == true) {
//ScriptWriter~~~
iOutputManager.println("," + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %>  <!%getObjectPrefix("hrmconcatname")!>hrmConcatName(<!%lLastName!>, <!%lFirstName!>, <!%lMiddleName!>, <!%lSuffixName!>) <!%lNameView!><%
        {
//ScriptWriter~~~
iOutputManager.println("  " + getObjectPrefix("hrmconcatname") + "hrmConcatName(" + lLastName + ", " + lFirstName + ", " + lMiddleName + ", " + lSuffixName + ") " + lNameView + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        lComma = true;        
      }
    }

//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root:view:from!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:from")).size() > 0) {
//ScriptWriter~~      String lFrom = <![com.esarks.arm.schemas.ddl.root:view:from]!>;
      String lFrom = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:from]");
      int lTagSearchIndex = -1;
      while ( (lTagSearchIndex = lFrom.indexOf("$")) > -1) {
        int lSize = lFrom.substring(lTagSearchIndex).indexOf(" ");
        if (lSize == -1) {
          lSize = lFrom.length();
        } else {
          lSize += lTagSearchIndex;
        }
        lSize = lSize;
        lFrom = lFrom.substring(0, lTagSearchIndex) + 
                 getObjectPrefix(lFrom.substring(lTagSearchIndex+1, lSize).toLowerCase()) + lFrom.substring(lTagSearchIndex+1, lSize) +
                 lFrom.substring(lSize);
      }
//ScriptWriter~~      %><!%"\r\n"!>FROM <!%lFrom!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + "\r\n" + "FROM " + lFrom + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else {
//ScriptWriter~~      if (<!com.esarks.arm.schemas.ddl.root:view:select!>!size() == 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:select")).size() == 0) {
//ScriptWriter~~        %><!%"\r\n"!><!%lTables!><!%"\r\n"!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + "\r\n" + "" + lTables + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
    }
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root:view:where!>!size() > 0) %>WHERE <![com.esarks.arm.schemas.ddl.root:view:where]!><!%"\r\n"!><%
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:where")).size() > 0) {
//ScriptWriter~~~
iOutputManager.println("WHERE " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:where]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root:view:order!>!size() > 0) %>ORDER BY <![com.esarks.arm.schemas.ddl.root:view:order]!><!%"\r\n"!><%
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:order")).size() > 0) {
//ScriptWriter~~~
iOutputManager.println("ORDER BY " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:order]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    boolean lForce = false;
    setContext(iScript.getMasterScript());
//ScriptWriter~~    if (<![$jac:makeAll:force]!>.equals("true")) lForce = true;
    if (iSymbolTable.translateProperties("[$jac:makeAll:force]").equals("true")) lForce = true;
    restoreContext();
    if (!lForce) {
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateDdl") + ".script");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(aPackage + "." + aView) + ".sql");
      if (lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          ((lGeneratorFile.exists() && lNewFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) || !lGeneratorFile.exists())) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("File " + aPackage + "." + aView + ".sql is not stale.  Generation bypassed.");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("File " + aPackage + "." + aView + ".sql is not stale.  Generation bypassed.");
//ScriptWriter~~        <!$jac:event:severity!>!set("info");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("info");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return;
      }
    }

    StringBuffer lStringBuffer = iOutputManager.getDocument("createView");
    if (openOutput(path(aPackage + "." + aView) + ".new")) {
//ScriptWriter~~      %><!%lStringBuffer.toString()!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      closeOutput();

      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:merge:sectionMarker!>!reset("--$Section=");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:sectionMarker")).reset("--$Section=");
//ScriptWriter~~      <!$jac:merge:preserveMarker!>!reset("$Preserve=yes");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preserveMarker")).reset("$Preserve=yes");
//ScriptWriter~~      <!$jac:merge:noPreserveMarker!>!reset("$Preserve=no");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:noPreserveMarker")).reset("$Preserve=no");
//ScriptWriter~~      <!$jac:merge:keepPreserveMarker!>!reset("$Preserve=keep");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepPreserveMarker")).reset("$Preserve=keep");
//ScriptWriter~~      <!$jac:merge:discardPreserveMarker!>!reset("$Preserve=discard");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:discardPreserveMarker")).reset("$Preserve=discard");
//ScriptWriter~~      <!$jac:merge:preservePreamble!>!reset("no");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preservePreamble")).reset("no");
//ScriptWriter~~      <!$jac:merge:comments!>!reset("--");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:comments")).reset("--");
//ScriptWriter~~      <!$jac:merge:excludeCompare!>!reset("--  Generated at");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:excludeCompare")).reset("--  Generated at");
//ScriptWriter~~      <!$jac:merge:trimOutput!>!reset("yes");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:trimOutput")).reset("yes");
//ScriptWriter~~      <!$jac:merge:keepSections!>!reset("no");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepSections")).reset("no");
      restoreContext();

      Merge.getInstance().doMerge(path(aPackage + "." + aView) + ".sql", path(aPackage + "." + aView) + ".new", iScript.getMasterScript());
      if (Merge.getInstance().getExceptionMessage() != null) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set(Merge.getInstance().getExceptionMessage());
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(Merge.getInstance().getExceptionMessage());
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return;      
      }

    } else {
      setContext(iScript.getMasterScript());
      if (iOutputManager.getExceptionMessage() != null) {
//ScriptWriter~~        <!$jac:event!>!set(iOutputManager.getExceptionMessage());
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(iOutputManager.getExceptionMessage());
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      }
//ScriptWriter~~      <!$jac:event!>!set("Failed to open *.sql output file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open *.sql output file.");
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }

    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
//ScriptWriter~~    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(<![com.esarks.arm.schemas.ddl.root:view:name]!>.toLowerCase());
    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:name]").toLowerCase());

    if (lDbConnection.getMake()) {
      PreparedStatement lPreparedStatement;
      lPreparedStatement = lDbConnection.getConnection().prepareStatement(lStringBuffer.toString());
      lPreparedStatement.execute();
//ScriptWriter~~      %>...View created<!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("...View created" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else {
//ScriptWriter~~      %>...View create bypassed<!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("...View create bypassed" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
      if (e.getMessage().startsWith("[Microsoft][SQLServer 2000 Driver for JDBC][SQLServer]There is already an object named")) {
//ScriptWriter~~        <!$jac:event:severity!>!set("warning");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("warning");
      } else {
//ScriptWriter~~        <!$jac:event:severity!>!set("fatal");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
      }
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  public void dropView(String aView) {
    try {
    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(aView.toLowerCase());

    if (lDbConnection.getMake()) {
      PreparedStatement lPreparedStatement;
      lPreparedStatement = lDbConnection.getConnection().prepareStatement( "DROP VIEW " + aView );
      lPreparedStatement.execute();
    }
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }

  public void loadTable(String aTable) {
    try {
    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(aTable.toLowerCase());

    PreparedStatement lDeletePreparedStatement = lDbConnection.getConnection().prepareStatement("DELETE FROM " + aTable);
    lDeletePreparedStatement.execute();
    lDeletePreparedStatement.close();
    
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table")).resetIterator();
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root!>!scan("table:name", aTable) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).scan("table:name", aTable) == false) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Cannot find table <!%aTable!> in XML.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Cannot find table iSymbolTable.translateProperties(aTable) in XML.");
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table:row!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:row")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:table:row!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:row")).next()) {
      String lStatement = "INSERT INTO " + aTable + "(";
      String lQuestion = "";
//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:row:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:row:column")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:table:row:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:row:column")).next()) {
//ScriptWriter~~        lStatement = lStatement.concat(<![com.esarks.arm.schemas.ddl.root:table:row:column:name]!>);
        lStatement = lStatement.concat(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:row:column:name]"));
        lQuestion = lQuestion.concat("?");
//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:table:row:column!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:row:column")).isLast() == false) {
          lStatement = lStatement.concat(",");
          lQuestion = lQuestion.concat(",");
        }
      }
      lStatement = lStatement.concat(") VALUES (" + lQuestion + ")");

      PreparedStatement lPreparedStatement;
      lPreparedStatement = lDbConnection.getConnection().prepareStatement(lStatement);
//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:row:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:row:column")).resetIterator();
      int lIdx = 1;
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:table:row:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:row:column")).next()) {
//ScriptWriter~~        lPreparedStatement.setString(lIdx++, <![com.esarks.arm.schemas.ddl.root:table:row:column]!>);
        lPreparedStatement.setString(lIdx++, iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:row:column]"));
      }
      lPreparedStatement.execute();
      lPreparedStatement.close();
    }
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return;
    }
  }
  
  public String getDbType(String aType, String aSize) {
    try {
    String lSize = "";
    if (getProperty("dbTypes:" + aType + ":size").equals("true")) {
      lSize = "(" + aSize + ")";
    }
    return getProperty("dbTypes:" + aType) + lSize;
    } catch (Throwable e) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(e.getMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
//ScriptWriter~~      <!$jac:event:severity!>!set("fatal");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
//ScriptWriter~~      <!$jac:event:scriptPackage!>!set(iScriptPackage);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~      <!$jac:event:scriptName!>!set(iScriptName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
      restoreContext();
      setExit();
      return "";
    }
  }

  private String getObjectPrefix(String aObjectName) {
    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(aObjectName);
    if (lDbConnection == null) return "";
    return lDbConnection.getPrefix();    
  }


  private void parseXmlDefinition(String aXmlDefinition) {
    XmlSchemaFactory lXmlSchemaFactory = iSymbolTable.getXmlSchemaFactory();
    if (lXmlSchemaFactory.getXmlSchemaElement("com.esarks.arm.schemas.ddl.root") == null) {
      loadXmlSchema("com.esarks.arm.schemas.ddl", path("com.esarks.arm.schemas.DdlSchema") + ".xml");
    }
    parseXmlSchema(aXmlDefinition);
  }
}
