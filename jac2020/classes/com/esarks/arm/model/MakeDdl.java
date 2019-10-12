//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.model;

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
public class MakeDdl extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected MakeDdl() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public MakeDdl(Script aScript) {

    super(aScript);

  }

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

    readTableXml(aXmlDefinition);
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

    readTableXml(aXmlDefinition);
    if (checkExit()) return;
    generateDbTable(aTable);
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

    readViewXml(aXmlDefinition);
    if (checkExit()) return;
    generateDbView(aView);
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

  private void readTableXml(String aXmlDefinition) {
    try {
//ScriptWriter~~    <!tables!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
    if (checkExit()) return;
//ScriptWriter~~    if (<!tables!>!size() == 0) return;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).size() == 0) return;
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

  private void readViewXml(String aXmlDefinition) {
    try {
//ScriptWriter~~    <!views!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
    if (checkExit()) return;
//ScriptWriter~~    if (<!views!>!size() == 0) return;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views")).size() == 0) return;
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
//ScriptWriter~~    <!tables:table:primary!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:primary")).resetIterator();
//ScriptWriter~~    while (<!tables:table:primary!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:primary")).next()) {
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
//ScriptWriter~~      %>  CONSTRAINT <![tables:table:primary:name]!><%
      {
//ScriptWriter~~~
iOutputManager.println("  CONSTRAINT " + iSymbolTable.translateProperties("[tables:table:primary:name]") + "", false);
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

//ScriptWriter~~      <!tables:table:primary:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:primary:field")).resetIterator();
//ScriptWriter~~      while (<!tables:table:primary:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:primary:field")).next()) {
//ScriptWriter~~        %><![tables:table:primary:field]!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[tables:table:primary:field]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!tables:table:primary:field!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:primary:field")).isLast() == false) {
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
      }
    }

//ScriptWriter~~    <!tables:table:unique!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:unique")).resetIterator();
//ScriptWriter~~    while (<!tables:table:unique!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:unique")).next()) {
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
//ScriptWriter~~      %>  CONSTRAINT <![tables:table:unique:name]!><%
      {
//ScriptWriter~~~
iOutputManager.println("  CONSTRAINT " + iSymbolTable.translateProperties("[tables:table:unique:name]") + "", false);
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

//ScriptWriter~~      <!tables:table:unique:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:unique:field")).resetIterator();
//ScriptWriter~~      while (<!tables:table:unique:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:unique:field")).next()) {
//ScriptWriter~~        %><![tables:table:unique:field]!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[tables:table:unique:field]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!tables:table:unique:field!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:unique:field")).isLast() == false) {
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
      }
    }

//ScriptWriter~~    <!tables:table:foreign!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:foreign")).resetIterator();
//ScriptWriter~~    while (<!tables:table:foreign!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:foreign")).next()) {
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
//ScriptWriter~~      %>  CONSTRAINT <![tables:table:foreign:name]!><%
      {
//ScriptWriter~~~
iOutputManager.println("  CONSTRAINT " + iSymbolTable.translateProperties("[tables:table:foreign:name]") + "", false);
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

//ScriptWriter~~      <!tables:table:foreign:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:foreign:field")).resetIterator();
//ScriptWriter~~      while (<!tables:table:foreign:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:foreign:field")).next()) {
//ScriptWriter~~        %><![tables:table:foreign:field]!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[tables:table:foreign:field]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!tables:table:foreign:field!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:foreign:field")).isLast() == false) {
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
      }
//ScriptWriter~~      %> REFERENCES <![tables:table:foreign:references:name]!> (<%
      {
//ScriptWriter~~~
iOutputManager.println(" REFERENCES " + iSymbolTable.translateProperties("[tables:table:foreign:references:name]") + " (", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!tables:table:foreign:references:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:foreign:references:field")).resetIterator();
//ScriptWriter~~      while (<!tables:table:foreign:references:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:foreign:references:field")).next()) {
//ScriptWriter~~        %><![tables:table:foreign:references:field]!><%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[tables:table:foreign:references:field]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!tables:table:foreign:references:field!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:foreign:references:field")).isLast() == false) {
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
      }
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

  private boolean generateDbFields() {
    try {
    boolean lReturn = false;
//ScriptWriter~~    <!tables:table:field!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:field")).resetIterator();
//ScriptWriter~~    while (<!tables:table:field!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:field")).next()) {
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
//ScriptWriter~~      %>  <![tables:table:field:name]!><%
      {
//ScriptWriter~~~
iOutputManager.println("  " + iSymbolTable.translateProperties("[tables:table:field:name]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      String lType = <![tables:table:field:type]!>;
      String lType = iSymbolTable.translateProperties("[tables:table:field:type]");
//ScriptWriter~~      String lIdentity = <![tables:table:field:identity]!>;
      String lIdentity = iSymbolTable.translateProperties("[tables:table:field:identity]");
//ScriptWriter~~      String lSize = <![tables:table:field:size]!>;
      String lSize = iSymbolTable.translateProperties("[tables:table:field:size]");
      if (lIdentity.equals("true")) {
//ScriptWriter~~        %> <!%getDbType(lType, lSize)!> identity (1, 1)<%
        {
//ScriptWriter~~~
iOutputManager.println(" " + getDbType(lType, lSize) + " identity (1, 1)", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
//ScriptWriter~~        %> <!%getDbType(lType, lSize)!><%
        {
//ScriptWriter~~~
iOutputManager.println(" " + getDbType(lType, lSize) + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      if (<![tables:table:field:nullable]!>.compareTo("false") == 0) {
      if (iSymbolTable.translateProperties("[tables:table:field:nullable]").compareTo("false") == 0) {
//ScriptWriter~~        %> NOT NULL<%
        {
//ScriptWriter~~~
iOutputManager.println(" NOT NULL", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      lReturn = true;
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
  
  public void generateDbTable(String aTable) {
    try {
//ScriptWriter~~    <!tables:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table")).resetIterator();
//ScriptWriter~~    if (<!tables!>!scan("table:name", aTable) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).scan("table:name", aTable) == false) {
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
    iOutputManager.addDocument("createTable");
//ScriptWriter~~    %>CREATE TABLE <![tables:table:name]!> (<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("CREATE TABLE " + iSymbolTable.translateProperties("[tables:table:name]") + " (" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    boolean lInsertComma = false;
    lInsertComma = generateDbFields();
    lInsertComma = generateKey(lInsertComma);
//ScriptWriter~~    %>);<!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println(");" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    StringBuffer lStringBuffer = iOutputManager.getDocument("createTable");
//ScriptWriter~~    if (openOutput(path(iScriptPackage + ".ddl." + <![tables:table:name]!>) + ".sql")) {
    if (openOutput(path(iScriptPackage + ".ddl." + iSymbolTable.translateProperties("[tables:table:name]")) + ".sql")) {
//ScriptWriter~~      %><!%lStringBuffer.toString()!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      closeOutput();
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
    
//    DbConnection lDbConnection = iSymbolTable.getDbConnection();
//    lDbConnection.connect(getProperty("jdbcClass"), getProperty("jdbcConnection"), getProperty("jdbcUser"), getProperty("jdbcPassword"));

    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getDbConnection("application");

    PreparedStatement lPreparedStatement;
    lPreparedStatement = lDbConnection.getConnection().prepareStatement(lStringBuffer.toString());
    lPreparedStatement.execute();
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

  public void dropTable(String aTable) {
    try {
//    DbConnection lDbConnection = iSymbolTable.getDbConnection();
//    lDbConnection.connect(getProperty("jdbcClass"), getProperty("jdbcConnection"), getProperty("jdbcUser"), getProperty("jdbcPassword"));

    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getDbConnection("application");

    PreparedStatement lPreparedStatement;
    lPreparedStatement = lDbConnection.getConnection().prepareStatement( "DROP TABLE " + aTable );
    lPreparedStatement.execute();
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

  public void generateDbView(String aView) {
    try {
//ScriptWriter~~    <!views:view!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view")).resetIterator();
//ScriptWriter~~    if (<!views!>!scan("view:name", aView) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views")).scan("view:name", aView) == false) {
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
//    iOutputManager.addDocument("createView");
//ScriptWriter~~    %>CREATE VIEW <![views:view:name]!> AS <!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("CREATE VIEW " + iSymbolTable.translateProperties("[views:view:name]") + " AS " + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %>SELECT <!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("SELECT " + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!views:view:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table")).resetIterator();
    boolean lComma = false;
    String lTables = "FROM ";
//ScriptWriter~~    while (<!views:view:table!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table")).next()) {
      String lFirstName = null;
      String lMiddleName = null;
      String lLastName = null;
      String lSuffixName = null;
      boolean lHasName = false;
      String lNameView = "hrmConcatName";
//ScriptWriter~~      lTables = lTables.concat(<![views:view:table:name]!>);
      lTables = lTables.concat(iSymbolTable.translateProperties("[views:view:table:name]"));
//ScriptWriter~~      if (<!views:view:table:symbolic!>!size() > 0) lTables = lTables.concat(" " + <![views:view:table:symbolic]!>);
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:symbolic")).size() > 0) lTables = lTables.concat(" " + iSymbolTable.translateProperties("[views:view:table:symbolic]"));
//ScriptWriter~~      if (<!views:view:table!>!isLast() == false) lTables = lTables.concat(", ");
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table")).isLast() == false) lTables = lTables.concat(", ");
//ScriptWriter~~      <!views:view:table:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column")).resetIterator();
//ScriptWriter~~      while (<!views:view:table:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column")).next()) {
//ScriptWriter~~        if (lComma == true) %>,<!%"\r\n"!><%
        if (lComma == true) {
//ScriptWriter~~~
iOutputManager.println("," + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        String lPrefix = "";
//ScriptWriter~~        if (<!views:view:table:symbolic!>!size() == 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:symbolic")).size() == 0) {
//ScriptWriter~~          lPrefix = <![views:view:table:name]!>;
          lPrefix = iSymbolTable.translateProperties("[views:view:table:name]");
        } else {
//ScriptWriter~~          lPrefix = <![views:view:table:symbolic]!>;
          lPrefix = iSymbolTable.translateProperties("[views:view:table:symbolic]");
        }
//ScriptWriter~~        if (<!views:view:table:column:name!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column:name")).size() > 0) {
//ScriptWriter~~          if (<![views:view:table:column:isColumn]!>.compareTo("false") == 0) {
          if (iSymbolTable.translateProperties("[views:view:table:column:isColumn]").compareTo("false") == 0) {
//ScriptWriter~~            %>  <%
            {
//ScriptWriter~~~
iOutputManager.println("  ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }else {
//ScriptWriter~~            %>  <!%lPrefix!>.<%
            {
//ScriptWriter~~~
iOutputManager.println("  " + lPrefix + ".", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          %><![views:view:table:column:name]!><%
          {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[views:view:table:column:name]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          if (<!views:view:table:column:view!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column:view")).size() > 0) {
//ScriptWriter~~            %> <![views:view:table:column:view]!><%
            {
//ScriptWriter~~~
iOutputManager.println(" " + iSymbolTable.translateProperties("[views:view:table:column:view]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          if (<![views:view:table:column:isType]!>.compareTo("true") == 0) {
          if (iSymbolTable.translateProperties("[views:view:table:column:isType]").compareTo("true") == 0) {
//ScriptWriter~~            %>,<!%"\r\n"!><%
            {
//ScriptWriter~~~
iOutputManager.println("," + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            %>  dbo.hrmGetTypeName('<![views:view:table:column:name]!>', <%
            {
//ScriptWriter~~~
iOutputManager.println("  dbo.hrmGetTypeName('" + iSymbolTable.translateProperties("[views:view:table:column:name]") + "', ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            if (<!views:view:table:symbolic!>!size() == 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:symbolic")).size() == 0) {
//ScriptWriter~~              %>  <![views:view:table:name]!>.<%
              {
//ScriptWriter~~~
iOutputManager.println("  " + iSymbolTable.translateProperties("[views:view:table:name]") + ".", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            } else {
//ScriptWriter~~              %>  <![views:view:table:symbolic]!>.<%
              {
//ScriptWriter~~~
iOutputManager.println("  " + iSymbolTable.translateProperties("[views:view:table:symbolic]") + ".", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
//ScriptWriter~~            %><![views:view:table:column:name]!>) <![views:view:table:column:name]!>Name<%
            {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[views:view:table:column:name]") + ") " + iSymbolTable.translateProperties("[views:view:table:column:name]") + "Name", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
//ScriptWriter~~          if (<!views:view:table:column:isName!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column:isName")).size() > 0) {
//ScriptWriter~~            if (<!views:view:table:column:nameView!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column:nameView")).size() > 0) {
//ScriptWriter~~              lNameView = <![views:view:table:column:nameView]!>;
              lNameView = iSymbolTable.translateProperties("[views:view:table:column:nameView]");
            }
//ScriptWriter~~            String lNameType = <![views:view:table:column:isName]!>;
            String lNameType = iSymbolTable.translateProperties("[views:view:table:column:isName]");
            if (lNameType.compareTo("first") == 0) {
              lHasName = true;
//ScriptWriter~~              lFirstName = lPrefix + "." + <![views:view:table:column:name]!>;
              lFirstName = lPrefix + "." + iSymbolTable.translateProperties("[views:view:table:column:name]");
            }
            else if (lNameType.compareTo("middle") == 0) {
              lHasName = true;
//ScriptWriter~~              lMiddleName = lPrefix + "." + <![views:view:table:column:name]!>;
              lMiddleName = lPrefix + "." + iSymbolTable.translateProperties("[views:view:table:column:name]");
            }
            else if (lNameType.compareTo("last") == 0) {
              lHasName = true;
//ScriptWriter~~              lLastName = lPrefix + "." + <![views:view:table:column:name]!>;
              lLastName = lPrefix + "." + iSymbolTable.translateProperties("[views:view:table:column:name]");
            }
            else if (lNameType.compareTo("suffix") == 0) {
              lHasName = true;
//ScriptWriter~~              lSuffixName = lPrefix + "." + <![views:view:table:column:name]!>;
              lSuffixName = lPrefix + "." + iSymbolTable.translateProperties("[views:view:table:column:name]");
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

//ScriptWriter~~        %>  dbo.hrmConcatName(<!%lLastName!>, <!%lFirstName!>, <!%lMiddleName!>, <!%lSuffixName!>) <!%lNameView!><%
        {
//ScriptWriter~~~
iOutputManager.println("  dbo.hrmConcatName(" + lLastName + ", " + lFirstName + ", " + lMiddleName + ", " + lSuffixName + ") " + lNameView + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        lComma = true;        
      }
    }
//ScriptWriter~~    if (<!views:view:from!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:from")).size() > 0) {
//ScriptWriter~~      %><!%"\r\n"!>FROM <![views:view:from]!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + "\r\n" + "FROM " + iSymbolTable.translateProperties("[views:view:from]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else {
//ScriptWriter~~      %><!%"\r\n"!><!%lTables!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + "\r\n" + "" + lTables + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    if (<!views:view:where!>!size() > 0) %>WHERE <![views:view:where]!><!%"\r\n"!><%
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:where")).size() > 0) {
//ScriptWriter~~~
iOutputManager.println("WHERE " + iSymbolTable.translateProperties("[views:view:where]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    if (<!views:view:order!>!size() > 0) %>ORDER BY <![views:view:order]!><!%"\r\n"!><%
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:order")).size() > 0) {
//ScriptWriter~~~
iOutputManager.println("ORDER BY " + iSymbolTable.translateProperties("[views:view:order]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    StringBuffer lStringBuffer = iOutputManager.getDocument("createView");
//ScriptWriter~~    if (openOutput(path(iScriptPackage + ".ddl." + <![views:view:name]!>) + ".sql")) {
    if (openOutput(path(iScriptPackage + ".ddl." + iSymbolTable.translateProperties("[views:view:name]")) + ".sql")) {
//ScriptWriter~~      %><!%lStringBuffer.toString()!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + lStringBuffer.toString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      closeOutput();
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

//    DbConnection lDbConnection = iSymbolTable.getDbConnection();
//    lDbConnection.connect(getProperty("jdbcClass"), getProperty("jdbcConnection"), getProperty("jdbcUser"), getProperty("jdbcPassword"));

    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getDbConnection("application");

    PreparedStatement lPreparedStatement;
    lPreparedStatement = lDbConnection.getConnection().prepareStatement(lStringBuffer.toString());
    lPreparedStatement.execute();
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

  public void dropView(String aView) {
    try {
//    DbConnection lDbConnection = iSymbolTable.getDbConnection();
//    lDbConnection.connect(getProperty("jdbcClass"), getProperty("jdbcConnection"), getProperty("jdbcUser"), getProperty("jdbcPassword"));

    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getDbConnection("application");

    PreparedStatement lPreparedStatement;
    lPreparedStatement = lDbConnection.getConnection().prepareStatement( "DROP VIEW " + aView );
    lPreparedStatement.execute();
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
//ScriptWriter~~    %>loadTable: <!%aTable!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("loadTable: " + aTable + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    try {
//    DbConnection lDbConnection = iSymbolTable.getDbConnection();
//    lDbConnection.connect(getProperty("jdbcClass"), getProperty("jdbcConnection"), getProperty("jdbcUser"), getProperty("jdbcPassword"));

    DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
    DbConnection lDbConnection = lDbConnectionFactory.getDbConnection("application");

    PreparedStatement lDeletePreparedStatement = lDbConnection.getConnection().prepareStatement("DELETE FROM " + aTable);
    lDeletePreparedStatement.execute();
    lDeletePreparedStatement.close();
    
//ScriptWriter~~    <!tables:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table")).resetIterator();
//ScriptWriter~~    if (<!tables!>!scan("table:name", aTable) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).scan("table:name", aTable) == false) {
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
//ScriptWriter~~    <!tables:table:row!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:row")).resetIterator();
//ScriptWriter~~    while (<!tables:table:row!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:row")).next()) {
      String lStatement = "INSERT INTO " + aTable + "(";
      String lQuestion = "";
//ScriptWriter~~      <!tables:table:row:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:row:column")).resetIterator();
//ScriptWriter~~      while (<!tables:table:row:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:row:column")).next()) {
//ScriptWriter~~        lStatement = lStatement.concat(<![tables:table:row:column:name]!>);
        lStatement = lStatement.concat(iSymbolTable.translateProperties("[tables:table:row:column:name]"));
        lQuestion = lQuestion.concat("?");
//ScriptWriter~~        if (<!tables:table:row:column!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:row:column")).isLast() == false) {
          lStatement = lStatement.concat(",");
          lQuestion = lQuestion.concat(",");
        }
      }
      lStatement = lStatement.concat(") VALUES (" + lQuestion + ")");

//ScriptWriter~~      %>loadTable:Statement: <!%lStatement!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("loadTable:Statement: " + lStatement + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      PreparedStatement lPreparedStatement;
      lPreparedStatement = lDbConnection.getConnection().prepareStatement(lStatement);
//ScriptWriter~~      <!tables:table:row:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:row:column")).resetIterator();
      int lIdx = 1;
//ScriptWriter~~      while (<!tables:table:row:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:row:column")).next()) {
//ScriptWriter~~        lPreparedStatement.setString(lIdx++, <![tables:table:row:column]!>);
        lPreparedStatement.setString(lIdx++, iSymbolTable.translateProperties("[tables:table:row:column]"));
      }
      lPreparedStatement.execute();
      lPreparedStatement.close();
    }
    } catch (Throwable e) {

//ScriptWriter~~      %>loadTable:Exception: <!%e.getMessage()!><!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("loadTable:Exception: " + e.getMessage() + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


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

}
