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
public class Job extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Job() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Job(Script aScript) {

    super(aScript);

  }

  public void execute(String aScript, String aMethod) {
    execute(aScript, aMethod, null);
  }
  
  public void execute(String aScript, String aMethod, String aArgument) {

    MicScriptHelper lLoadObject = (MicScriptHelper) loadScript(aScript);
    if (lLoadObject == null) {
      System.out.println("Job: !WARNING! Cannot open script " + aScript);
    }

    System.out.println("Job " + aScript + "::" + aMethod + "(" + aArgument + ")");

    parseXmlPath(homePath("bin.Job") + ".xml");

//ScriptWriter~~    String lPropertiesPath = <![mic.element:options:properties]!>;
    String lPropertiesPath = iSymbolTable.translateProperties("[mic.element:options:properties]");
//ScriptWriter~~    String lPropertySet = <![mic.element:options:propertySet]!>;
    String lPropertySet = iSymbolTable.translateProperties("[mic.element:options:propertySet]");
    System.out.println("Job Properties  = " + lPropertiesPath);
    System.out.println("Job PropertySet = " + lPropertySet);
    setContext(iScript.getMasterScript());
    // Search for the Schemas...

    File lSchemaFile = new File(path("com.esarks.arm.schemas.PropertiesSchema") + ".xml");
    if (lSchemaFile.exists()) {
      loadXmlSchema("com.esarks.arm.schemas.properties", path("com.esarks.arm.schemas.PropertiesSchema") + ".xml");
    } else {

      lSchemaFile = new File(homePath("com.esarks.arm.schemas.PropertiesSchema") + ".xml");
      if (lSchemaFile.exists()) {
        loadXmlSchema("com.esarks.arm.schemas.properties", homePath("com.esarks.arm.schemas.PropertiesSchema") + ".xml");
      } else {

        lSchemaFile = new File(workPath("com.esarks.arm.schemas.PropertiesSchema") + ".xml");
        if (lSchemaFile.exists()) {
          loadXmlSchema("com.esarks.arm.schemas.properties", workPath("com.esarks.arm.schemas.PropertiesSchema") + ".xml");
        } else {
          System.out.println("!! WARNING !! PropertiesSchema.xml not found.");
        }
      }
    }

    parseXmlSchemaPath(homePath(lPropertiesPath + ".Properties") + ".xml");
//ScriptWriter~~    boolean lScan = <!com.esarks.arm.schemas.properties.root:property:context!>!scan(lPropertySet);
    boolean lScan = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:context")).scan(lPropertySet);
//ScriptWriter~~    System.out.println("Job Context = " + <![com.esarks.arm.schemas.properties.root:property:context]!>);
    System.out.println("Job Context = " + iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:context]"));

    // Open all the DbConnections possible...
    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
//ScriptWriter~~    <!com.esarks.arm.schemas.properties.root:property:dbConnection!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbConnection")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.properties.root:property:dbConnection!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbConnection")).next()) {
//ScriptWriter~~      String lName = <![com.esarks.arm.schemas.properties.root:property:dbConnection:name]!>;
      String lName = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:name]");
//ScriptWriter~~      String lJdbcClass = <![com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcClass]!>;
      String lJdbcClass = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcClass]");
//ScriptWriter~~      String lJdbcConnection = <![com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcConnection]!>;
      String lJdbcConnection = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcConnection]");
//ScriptWriter~~      String lJdbcUser = <![com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcUser]!>;
      String lJdbcUser = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcUser]");
//ScriptWriter~~      String lJdbcPassword = <![com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcPassword]!>;
      String lJdbcPassword = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:jdbcPassword]");
//ScriptWriter~~      String lDbTypes = <![com.esarks.arm.schemas.properties.root:property:dbConnection:dbTypes]!>;
      String lDbTypes = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:dbTypes]");
//ScriptWriter~~      String lCatalog = <![com.esarks.arm.schemas.properties.root:property:dbConnection:catalog]!>;
      String lCatalog = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:catalog]");
//ScriptWriter~~      String lOwner = <![com.esarks.arm.schemas.properties.root:property:dbConnection:owner]!>;
      String lOwner = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:owner]");
//ScriptWriter~~      String lStereotype = <![com.esarks.arm.schemas.properties.root:property:dbConnection:stereotype]!>;
      String lStereotype = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:stereotype]");
//ScriptWriter~~      String lOpenCountString = <![com.esarks.arm.schemas.properties.root:property:dbConnection:openCount]!>;
      String lOpenCountString = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:openCount]");
//ScriptWriter~~      String iMake = <![com.esarks.arm.schemas.properties.root:property:dbConnection:make]!>;
      String iMake = iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:make]");
      int lOpenCount = 1;
      if (!lOpenCountString.equals("")) lOpenCount = Integer.parseInt(lOpenCountString);

      for (int lIdx=0; lIdx < lOpenCount; lIdx++) {
        DbConnection lDbConnection = new DbConnection(lName);
        lDbConnection.setCatalog(lCatalog);
        lDbConnection.setOwner(lOwner);
        lDbConnection.setDbTypes(lDbTypes);
        lDbConnection.setStereotype(lStereotype);
        if (iMake.equals("false")) lDbConnection.setMake(false);
        lDbConnectionFactory.register(lDbConnection);
        System.out.println("Connection " + lIdx + " at " + lName + "=" + lDbConnection.connect(lJdbcClass, lJdbcConnection, lJdbcUser, lJdbcPassword));
      }
      
//ScriptWriter~~      <!com.esarks.arm.schemas.properties.root:property:dbConnection:alias!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbConnection:alias")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.properties.root:property:dbConnection:alias!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbConnection:alias")).next()) {
//ScriptWriter~~        lDbConnectionFactory.alias(lName, <![com.esarks.arm.schemas.properties.root:property:dbConnection:alias]!>);
        lDbConnectionFactory.alias(lName, iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbConnection:alias]"));
      }

    }

    try {
      // Associate all the objects to a DbConnection...
//ScriptWriter~~      <!com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection")).next()) {
//ScriptWriter~~        DbConnection lDbConnection = lDbConnectionFactory.getDbConnection(<![com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:name]!>);
        DbConnection lDbConnection = lDbConnectionFactory.getDbConnection(iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:name]"));
//ScriptWriter~~        <!com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object")).resetIterator();
//ScriptWriter~~        while (<!com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object")).next()) {
//ScriptWriter~~          lDbConnectionFactory.associateObjectConnection(<![com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object:name]!>, lDbConnection);
          lDbConnectionFactory.associateObjectConnection(iSymbolTable.translateProperties("[com.esarks.arm.schemas.properties.root:property:dbObjects:dbConnection:object:name]"), lDbConnection);
        }
      }
    } catch(Throwable e) {
      System.out.println(e);
      System.out.println("Failed to associate all database objects to a DbConnection.  Please verify the <dbObjects> section of Properties.xml.");
      restoreContext();
      return;
    }
    
    restoreContext();
    
    if (aArgument == null || aArgument.equals("")) {
      iScript.execMethod(lLoadObject, aMethod);
    } else {
      iScript.execMethod(lLoadObject, aMethod, new Object[]{aArgument});
    }
    
}
}
