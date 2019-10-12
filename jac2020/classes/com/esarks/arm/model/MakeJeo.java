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
public class MakeJeo extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected MakeJeo() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public MakeJeo(Script aScript) {

    super(aScript);

  }

  public void createTable(String aXmlDefinition, String aTable) {
    resetExit();
    try {
//ScriptWriter~~    %>createTableJeo: XML=<!%aXmlDefinition!> Table=<!%aTable!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("createTableJeo: XML=" + aXmlDefinition + " Table=" + aTable + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:createTable!>!set("true");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:createTable")).set("true");
//ScriptWriter~~    <!tables!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).remove();
//ScriptWriter~~    <!views!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views")).remove();
    String lPackage = readTableXml(aXmlDefinition, aTable);
    if (checkExit()) return;
    generateTableJeo(aXmlDefinition, lPackage, aTable);
    closeOutput();
    if (checkExit()) return;
    prepareMerge();
    Merge.getInstance().doMerge(path(lPackage + "." + aTable) + ".script", path(lPackage + "." + aTable) + ".new", iScript.getMasterScript());

    if (openOutput(path(lPackage + "." + aTable) + "_Crud.xml")) {
      generateCrudService(lPackage, aTable);
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(lPackage + "." + aTable) + "_Crud.xml output file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(lPackage + "." + aTable) + "_Crud.xml output file.");
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
//ScriptWriter~~    <!$mic:createView!>!set("true");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:createView")).set("true");
//ScriptWriter~~    %>createViewJeo: XML=<!%aXmlDefinition!> View=<!%aView!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("createViewJeo: XML=" + aXmlDefinition + " View=" + aView + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!tables!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).remove();
//ScriptWriter~~    <!views!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views")).remove();
    String lPackage = readViewXml(aXmlDefinition, aView);
    if (checkExit()) return;
    generateViewJeo(aXmlDefinition, lPackage, aView);
    closeOutput();
    if (checkExit()) return;
    prepareMerge();
    Merge.getInstance().doMerge(path(lPackage + "." + aView) + ".script", path(lPackage + "." + aView) + ".new", iScript.getMasterScript());

    if (openOutput(path(lPackage + "." + aView) + "_Read.xml")) {
      generateReadService(lPackage, aView);
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(lPackage + "." + aView) + "_Read.xml output file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(lPackage + "." + aView) + "_Read.xml output file.");
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

  public void createJeo(String aXmlDefinition, String aJeo) {
    resetExit();
    try {
//ScriptWriter~~    <!$mic:createJeo!>!set("true");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:createJeo")).set("true");
//ScriptWriter~~    %>createJeo: XML=<!%aXmlDefinition!> Jeo=<!%aJeo!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("createJeo: XML=" + aXmlDefinition + " Jeo=" + aJeo + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!jeos!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jeos")).remove();
    String lPackage = readJeoXml(aXmlDefinition, aJeo);
    if (checkExit()) return;
    generateJeo(aXmlDefinition, lPackage, aJeo);
    closeOutput();
    if (checkExit()) return;
    prepareMerge();
    Merge.getInstance().doMerge(path(lPackage + "." + aJeo) + ".script", path(lPackage + "." + aJeo) + ".new", iScript.getMasterScript());
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

  private void prepareMerge() {
    try {
    setContext(iScript.getMasterScript());
//ScriptWriter~~    <!$jac:merge!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge")).remove();
//ScriptWriter~~    <!$jac:merge:sectionMarker!>!reset("//$Section=");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:sectionMarker")).reset("//$Section=");
//ScriptWriter~~    <!$jac:merge:preserveMarker!>!reset("$Preserve=yes");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preserveMarker")).reset("$Preserve=yes");
//ScriptWriter~~    <!$jac:merge:noPreserveMarker!>!reset("$Preserve=no");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:noPreserveMarker")).reset("$Preserve=no");
//ScriptWriter~~    <!$jac:merge:keepPreserveMarker!>!reset("$Preserve=keep");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepPreserveMarker")).reset("$Preserve=keep");
//ScriptWriter~~    <!$jac:merge:discardPreserveMarker!>!reset("$Preserve=discard");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:discardPreserveMarker")).reset("$Preserve=discard");
//ScriptWriter~~    <!$jac:merge:preservePreamble!>!reset("no");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preservePreamble")).reset("no");
//ScriptWriter~~    <!$jac:merge:comments!>!reset("//");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:comments")).reset("//");
//ScriptWriter~~    <!$jac:merge:excludeCompare!>!reset("//  Generated at");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:excludeCompare")).reset("//  Generated at");
//ScriptWriter~~    <!$jac:merge:trimOutput!>!reset("yes");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:trimOutput")).reset("yes");
//ScriptWriter~~    <!$jac:merge:keepSections!>!reset("no");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepSections")).reset("no");
    restoreContext();
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
  
  private String readTableXml(String aXmlDefinition, String aTable) {
    try {
    String lPackage = aXmlDefinition;
    for(int lIdx=aXmlDefinition.length(); lIdx > 0; lIdx--) {
      if (aXmlDefinition.charAt(lIdx-1) == '.') {
        lPackage = aXmlDefinition.substring(0, lIdx-1);
        break;
      }
    }

    try {
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(lPackage + "." + aTable) + ".script");
      // next if statement blocked by "false"
      if (false && lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() > lXmlFile.lastModified()) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("File " + lPackage + "." + aTable + ".script is not stale.  Generation bypassed.");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("File " + lPackage + "." + aTable + ".script is not stale.  Generation bypassed.");
//ScriptWriter~~        <!$jac:event:severity!>!set("info");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("info");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return "";
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
      return "";
    }
                              
    if (!openOutput(path(lPackage + "." + aTable) + ".new")) {
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(lPackage + "." + aTable) + ".new file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(lPackage + "." + aTable) + ".new file for output.");
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
//ScriptWriter~~    <!tables!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
//ScriptWriter~~    if (<!tables!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).size() == 0) {
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

  private String readViewXml(String aXmlDefinition, String aView) {
    try {
    String lPackage = aXmlDefinition;
    for(int lIdx=aXmlDefinition.length(); lIdx > 0; lIdx--) {
      if (aXmlDefinition.charAt(lIdx-1) == '.') {
        lPackage = aXmlDefinition.substring(0, lIdx-1);
        break;
      }
    }

    try {
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(lPackage + "." + aView) + ".script");
      // next if statement blocked by "false"
      if (false && lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() > lXmlFile.lastModified()) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("File " + lPackage + "." + aView + ".script is not stale.  Generation bypassed.");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("File " + lPackage + "." + aView + ".script is not stale.  Generation bypassed.");
//ScriptWriter~~        <!$jac:event:severity!>!set("info");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("info");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return "";
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
      return "";
    }

    if (!openOutput(path(lPackage + "." + aView) + ".new")) {
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(lPackage + "." + aView) + ".new file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(lPackage + "." + aView) + ".new file for output.");
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
//ScriptWriter~~    <!views!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
//ScriptWriter~~    if (<!views!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views")).size() == 0) {
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
    
  private String readJeoXml(String aXmlDefinition, String aJeo) {
    try {
    String lPackage = aXmlDefinition;
    for(int lIdx=aXmlDefinition.length(); lIdx > 0; lIdx--) {
      if (aXmlDefinition.charAt(lIdx-1) == '.') {
        lPackage = aXmlDefinition.substring(0, lIdx-1);
        break;
      }
    }

    try {
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(lPackage + "." + aJeo) + ".script");
      // next if statement blocked by "false"
      if (false && lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() > lXmlFile.lastModified()) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("File " + lPackage + "." + aJeo + ".script is not stale.  Generation bypassed.");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("File " + lPackage + "." + aJeo + ".script is not stale.  Generation bypassed.");
//ScriptWriter~~        <!$jac:event:severity!>!set("info");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("info");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
        setExit();
        return "";
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
      return "";
    }

    if (!openOutput(path(lPackage + "." + aJeo) + ".new")) {
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(lPackage + "." + aJeo) + ".new file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(lPackage + "." + aJeo) + ".new file for output.");
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
//ScriptWriter~~    <!jeos!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jeos")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
//ScriptWriter~~    if (<!jeos!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jeos")).size() == 0) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Could not find <jeos> tag in *.xml file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Could not find <jeos> tag in *.xml file.");
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

  public void generateTableJeo(String aXmlDefinition, String aPackageName, String aTable) {
    if (checkExit()) return;
//ScriptWriter~~    <!$mic:attribute!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).remove();
//ScriptWriter~~    <!$mic:table!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table")).remove();
//ScriptWriter~~    <!$mic:sql!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sql")).remove();
//ScriptWriter~~    <!$mic:primary!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).remove();
//ScriptWriter~~    <!tables:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table")).resetIterator();
//ScriptWriter~~    if (<!tables!>!scan("table:name", aTable) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).scan("table:name", aTable) == false) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Definition for table \"" + aTable + "\" was not found in XML file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Definition for table \"" + aTable + "\" was not found in XML file.");
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
//ScriptWriter~~    <!tables:table:field!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:field")).resetIterator();
//ScriptWriter~~    while (<!tables:table:field!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:field")).next()) {
//ScriptWriter~~      <!$mic:attribute!>!set(<![tables:table:field:name]!>);      
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set(iSymbolTable.translateProperties("[tables:table:field:name]"));      
//ScriptWriter~~      <!$mic:attribute:name!>!set(<![tables:table:field:name]!>);      
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[tables:table:field:name]"));      
//ScriptWriter~~      <!$mic:attribute:mapTo!>!set(<![tables:table:field:name]!>);      
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:mapTo")).set(iSymbolTable.translateProperties("[tables:table:field:name]"));      
//ScriptWriter~~      <!$mic:attribute:type!>!set(<![tables:table:field:type]!>);      
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[tables:table:field:type]"));      
//ScriptWriter~~      <!$mic:attribute:size!>!set(<![tables:table:field:size]!>);      
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[tables:table:field:size]"));      
//ScriptWriter~~      <!$mic:attribute:nullable!>!set(<![tables:table:field:nullable]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set(iSymbolTable.translateProperties("[tables:table:field:nullable]"));
//ScriptWriter~~      <!$mic:attribute:identity!>!set(<![tables:table:field:identity]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:identity")).set(iSymbolTable.translateProperties("[tables:table:field:identity]"));
//ScriptWriter~~      <!$mic:attribute:table!>!set(<![tables:table:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:table")).set(iSymbolTable.translateProperties("[tables:table:name]"));
    }
//ScriptWriter~~    <!tables:table:primary:field!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:primary:field")).resetIterator();
//ScriptWriter~~    while (<!tables:table:primary:field!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:primary:field")).next()) {
//ScriptWriter~~      <!$mic:primary!>!set(<![tables:table:primary:field]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).set(iSymbolTable.translateProperties("[tables:table:primary:field]"));
    }
    generateAttributes(aXmlDefinition, aPackageName, aTable);
  }

  public void generateViewJeo(String aXmlDefinition, String aPackageName, String aView) {
    try {
//ScriptWriter~~    <!$mic:attribute!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).remove();
//ScriptWriter~~    <!$mic:table!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table")).remove();
//ScriptWriter~~    <!$mic:sql!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sql")).remove();
//ScriptWriter~~    <!views:view!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view")).resetIterator();
//ScriptWriter~~    if (<!views!>!scan("view:name", aView) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views")).scan("view:name", aView) == false) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Definition for view \"" + aView + "\" was not found in XML file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Definition for view \"" + aView + "\" was not found in XML file.");
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

//ScriptWriter~~    <!views:view:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table")).resetIterator();
//ScriptWriter~~    while (<!views:view:table!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table")).next()) {

      Jeo lJeoInstance = null;
      String lJeoClassName = "";

      try {
//ScriptWriter~~        if (!<![views:view:table:in]!>.equals("")) {
        if (!iSymbolTable.translateProperties("[views:view:table:in]").equals("")) {
//ScriptWriter~~          lJeoClassName = <![views:view:table:in]!> + "." + <![views:view:table:name]!>;
          lJeoClassName = iSymbolTable.translateProperties("[views:view:table:in]") + "." + iSymbolTable.translateProperties("[views:view:table:name]");
          Class lJeoClass = ClassLoader.getSystemClassLoader().loadClass(lJeoClassName);
          Constructor lConstructor = lJeoClass.getConstructor(new Class[]{});
          lJeoInstance = (Jeo) lConstructor.newInstance(new Object[]{});
        }
      } catch (Exception e) {
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("Non-fatal exception: " + e.getMessage());
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Non-fatal exception: " + e.getMessage());
//ScriptWriter~~        <!$jac:event:severity!>!set("error");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("error");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
      }

      DbConnection lDbConnection = iSymbolTable.getDbConnection();
      lDbConnection.connect(getProperty("jdbcClass"), getProperty("jdbcConnection"), getProperty("jdbcUser"), getProperty("jdbcPassword"));
//ScriptWriter~~      String lTableName = <![views:view:table:name]!>;
      String lTableName = iSymbolTable.translateProperties("[views:view:table:name]");

      for(int lIdx=lTableName.length(); lIdx > 0; lIdx--) {
        if (lTableName.charAt(lIdx-1) == '.') {
          lTableName = lTableName.substring(lIdx);
          break;
        }
      }

      lDbConnection.getColumns(iScript, lTableName);
//ScriptWriter~~      <!$mic:table!>!set(lTableName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table")).set(lTableName);
//ScriptWriter~~      <!$mic:table:in!>!set(<![views:view:table:in]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table:in")).set(iSymbolTable.translateProperties("[views:view:table:in]"));
      
      boolean lHasName = false;
      String lNameView = "hrmConcatName";
      ArrayList lTypeNameList = new ArrayList();
//ScriptWriter~~      <!views:view:table:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column")).resetIterator();
//ScriptWriter~~      while (<!views:view:table:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column")).next()) {

//ScriptWriter~~        if (<!views:view:table:column:isName!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column:isName")).size() > 0) {
          lHasName = true;
//ScriptWriter~~          if (<!views:view:table:column:nameView!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column:nameView")).size() > 0) {
//ScriptWriter~~            lNameView = <![views:view:table:column:nameView]!>;
            lNameView = iSymbolTable.translateProperties("[views:view:table:column:nameView]");
          }
        }
        
//ScriptWriter~~        if (<!views:view:table:column:isType!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column:isType")).size() > 0) {
//ScriptWriter~~          lTypeNameList.add(<![views:view:table:column:name]!> + "Name");
          lTypeNameList.add(iSymbolTable.translateProperties("[views:view:table:column:name]") + "Name");
        }
        
//ScriptWriter~~        <!$mic:attribute!>!set(<![views:view:table:column:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set(iSymbolTable.translateProperties("[views:view:table:column:name]"));
//ScriptWriter~~        <!$mic:attribute:table!>!set(<![views:view:table:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:table")).set(iSymbolTable.translateProperties("[views:view:table:name]"));

//ScriptWriter~~        if (<![views:view:table:column:view]!>.equals("")) {
        if (iSymbolTable.translateProperties("[views:view:table:column:view]").equals("")) {
//ScriptWriter~~          <!$mic:attribute:name!>!set(<![views:view:table:column:name]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[views:view:table:column:name]"));
        } else {
//ScriptWriter~~          <!$mic:attribute:name!>!set(<![views:view:table:column:view]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[views:view:table:column:view]"));
        }

        String lValueType = "";
//ScriptWriter~~//ptm        if (lJeoInstance != null) lValueType = lJeoInstance.getTypeByName(<![$mic:attribute:name]!>);
//ptm        if (lJeoInstance != null) lValueType = lJeoInstance.getTypeByName(iSymbolTable.translateProperties("[$mic:attribute:name]"));
//ScriptWriter~~        if (lJeoInstance != null) lValueType = lJeoInstance.getTypeByName(<![$mic:attribute]!>);
        if (lJeoInstance != null) lValueType = lJeoInstance.getTypeByName(iSymbolTable.translateProperties("[$mic:attribute]"));
        if (lValueType == null || lValueType.equals("")) {
          lValueType = null;
//ScriptWriter~~          String lAttributeName = <![$mic:attribute:name]!>;
          String lAttributeName = iSymbolTable.translateProperties("[$mic:attribute:name]");
          setContext(iScript.getMasterScript());
//ScriptWriter~~          <!$jac:event!>!set("Non-fatal error: Cannot find attribute " + lAttributeName + " in Jeo " + lJeoClassName + ".");
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Non-fatal error: Cannot find attribute " + lAttributeName + " in Jeo " + lJeoClassName + ".");
//ScriptWriter~~          <!$jac:event:severity!>!set("error");
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("error");
//ScriptWriter~~          <!$jac:event:scriptPackage!>!set(iScriptPackage);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~          <!$jac:event:scriptName!>!set(iScriptName);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
          restoreContext();
        }

//ScriptWriter~~        if (<![views:view:table:column:isColumn]!>.equals("false")) {
        if (iSymbolTable.translateProperties("[views:view:table:column:isColumn]").equals("false")) {
//ScriptWriter~~          <!$mic:attribute:type!>!set(<![views:view:table:column:type]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[views:view:table:column:type]"));
//ScriptWriter~~          <!$mic:attribute:size!>!set(<![views:view:table:column:size]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[views:view:table:column:size]"));
//ScriptWriter~~          <!$mic:attribute:nullable!>!set("true");
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set("true");
        } else {
//ScriptWriter~~          <!$mic:attribute:mapTo!>!set(<![views:view:table:column:name]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:mapTo")).set(iSymbolTable.translateProperties("[views:view:table:column:name]"));
//ScriptWriter~~          <!$jac:DbMetaData:Table:" + lTableName + ":Column!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:DbMetaData:Table:" + lTableName + ":Column")).resetIterator();
//ScriptWriter~~          if (<!$jac:DbMetaData:Table:" + lTableName + "!>!scan("Column", <![views:view:table:column:name]!>.toLowerCase()) == false) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:DbMetaData:Table:" + lTableName + "")).scan("Column", iSymbolTable.translateProperties("[views:view:table:column:name]").toLowerCase()) == false) {
            setContext(iScript.getMasterScript());
//ScriptWriter~~            <!$jac:event!>!set("Non-fatal error: Cannot find column (" + <![views:view:table:column:name]!> + ") in table (" + lTableName + ") definition.");
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Non-fatal error: Cannot find column (" + iSymbolTable.translateProperties("[views:view:table:column:name]") + ") in table (" + lTableName + ") definition.");
//ScriptWriter~~            <!$jac:event:severity!>!set("error");
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("error");
//ScriptWriter~~            <!$jac:event:scriptPackage!>!set(iScriptPackage);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~            <!$jac:event:scriptName!>!set(iScriptName);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
            restoreContext();
            continue;
          }
          if (lValueType == null) {
//ScriptWriter~~            <!$mic:attribute:type!>!set(<![$jac:DbMetaData:Table:" + lTableName + ":Column:Type]!>);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[$jac:DbMetaData:Table:" + lTableName + ":Column:Type]"));
//ScriptWriter~~            <!$mic:attribute:size!>!set(<![$jac:DbMetaData:Table:" + lTableName + ":Column:Size]!>);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[$jac:DbMetaData:Table:" + lTableName + ":Column:Size]"));
          } else {
//ScriptWriter~~            <!$mic:attribute:type!>!set(lValueType);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(lValueType);
//ScriptWriter~~            <!$mic:attribute:size!>!set("0");
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set("0");
          }
//ScriptWriter~~          if (<![$jac:DbMetaData:Table:" + lTableName + ":Column:Nullable]!>.equals("yes")) {
          if (iSymbolTable.translateProperties("[$jac:DbMetaData:Table:" + lTableName + ":Column:Nullable]").equals("yes")) {
//ScriptWriter~~            <!$mic:attribute:nullable!>!set("true");
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set("true");
          } else {
//ScriptWriter~~            <!$mic:attribute:nullable!>!set("false");
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set("false");
          }
        }
//ScriptWriter~~        if (!<![views:view:table:column:isColumn]!>.equals("false")) {
        if (!iSymbolTable.translateProperties("[views:view:table:column:isColumn]").equals("false")) {
//ScriptWriter~~          <!$mic:table:attribute!>!set(<![$mic:attribute]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table:attribute")).set(iSymbolTable.translateProperties("[$mic:attribute]"));
//ScriptWriter~~          <!$mic:table:attribute:name!>!set(<![$mic:attribute:name]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table:attribute:name")).set(iSymbolTable.translateProperties("[$mic:attribute:name]"));
//ScriptWriter~~          <!$mic:table:attribute:mapTo!>!set(<![$mic:attribute:mapTo]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table:attribute:mapTo")).set(iSymbolTable.translateProperties("[$mic:attribute:mapTo]"));
        }
      }

      if (lHasName) {
//ScriptWriter~~        <!$mic:attribute!>!set(lNameView);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set(lNameView);
//ScriptWriter~~        <!$mic:attribute:table!>!set(<![views:view:table:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:table")).set(iSymbolTable.translateProperties("[views:view:table:name]"));
//ScriptWriter~~        <!$mic:attribute:name!>!set(lNameView);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(lNameView);
//ScriptWriter~~        <!$mic:attribute:type!>!set("string");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set("string");
//ScriptWriter~~        <!$mic:attribute:size!>!set("0");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set("0");
//ScriptWriter~~        <!$mic:attribute:nullable!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set("true");
      }

      for (int lTypeNameListIdx=0; lTypeNameListIdx < lTypeNameList.size(); lTypeNameListIdx++) {
//ScriptWriter~~        <!$mic:attribute!>!set((String) lTypeNameList.get(lTypeNameListIdx));
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set((String) lTypeNameList.get(lTypeNameListIdx));
//ScriptWriter~~        <!$mic:attribute:table!>!set(<![views:view:table:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:table")).set(iSymbolTable.translateProperties("[views:view:table:name]"));
//ScriptWriter~~        <!$mic:attribute:name!>!set((String) lTypeNameList.get(lTypeNameListIdx));
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set((String) lTypeNameList.get(lTypeNameListIdx));
//ScriptWriter~~        <!$mic:attribute:type!>!set("string");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set("string");
//ScriptWriter~~        <!$mic:attribute:size!>!set("0");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set("0");
//ScriptWriter~~        <!$mic:attribute:nullable!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set("true");
      }
      
//ScriptWriter~~      <!views:view:sql!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:sql")).resetIterator();
//ScriptWriter~~      while (<!views:view:sql!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:sql")).next()) {
//ScriptWriter~~        <!$mic:sql!>!set(<![views:view:sql:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sql")).set(iSymbolTable.translateProperties("[views:view:sql:name]"));
//ScriptWriter~~        <!$mic:sql:sqlText!>!set(<![views:view:sql:sqlText]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sql:sqlText")).set(iSymbolTable.translateProperties("[views:view:sql:sqlText]"));
      }

      if (false) {
//ScriptWriter~~        <!tables!>!remove();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).remove();
//ScriptWriter~~        parseXmlPath(path(<![views:view:table:in]!>) + ".xml");
        parseXmlPath(path(iSymbolTable.translateProperties("[views:view:table:in]")) + ".xml");
//ScriptWriter~~        if (<!tables!>!size() == 0) continue;
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).size() == 0) continue;
//ScriptWriter~~        <!tables:table!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table")).resetIterator();
//ScriptWriter~~        if (<!tables!>!scan("table:name", <![views:view:table:name]!>) == false) continue;
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables")).scan("table:name", iSymbolTable.translateProperties("[views:view:table:name]")) == false) continue;

//ScriptWriter~~        <!views:view:table:column!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column")).resetIterator();
//ScriptWriter~~        while (<!views:view:table:column!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("views:view:table:column")).next()) {
//ScriptWriter~~          <!tables:table:field!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table:field")).resetIterator();
//ScriptWriter~~          if (<!tables:table!>!scan("field:name", <![views:view:table:column:name]!>) == false) continue;
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("tables:table")).scan("field:name", iSymbolTable.translateProperties("[views:view:table:column:name]")) == false) continue;
//ScriptWriter~~          <!$mic:attribute!>!set(<![tables:table:field:name]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set(iSymbolTable.translateProperties("[tables:table:field:name]"));      
//ScriptWriter~~          <!$mic:attribute:name!>!set(<![tables:table:field:name]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[tables:table:field:name]"));      
//ScriptWriter~~          <!$mic:attribute:type!>!set(<![tables:table:field:type]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[tables:table:field:type]"));      
//ScriptWriter~~          <!$mic:attribute:size!>!set(<![tables:table:field:size]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[tables:table:field:size]"));      
//ScriptWriter~~          <!$mic:attribute:nullable!>!set(<![tables:table:field:nullable]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set(iSymbolTable.translateProperties("[tables:table:field:nullable]"));      
        }
      }
    }
    generateAttributes(aXmlDefinition, aPackageName, aView);
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
  
  public void generateJeo(String aXmlDefinition, String aPackageName, String aJeo) {
    try {
//ScriptWriter~~    <!$mic:attribute!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).remove();
//ScriptWriter~~    <!$mic:table!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table")).remove();
//ScriptWriter~~    <!$mic:sql!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sql")).remove();
//ScriptWriter~~    <!jeos:jeo!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jeos:jeo")).resetIterator();
//ScriptWriter~~    if (<!jeos!>!scan("jeo:name", aJeo) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jeos")).scan("jeo:name", aJeo) == false) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set("Definition for jeo \"" + aJeo + "\" was not found in XML file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Definition for jeo \"" + aJeo + "\" was not found in XML file.");
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

//ScriptWriter~~    <!jeos:jeo:field!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jeos:jeo:field")).resetIterator();
//ScriptWriter~~    while (<!jeos:jeo:field!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jeos:jeo:field")).next()) {
//ScriptWriter~~      <!$mic:attribute!>!set(<![jeos:jeo:field:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set(iSymbolTable.translateProperties("[jeos:jeo:field:name]"));
//ScriptWriter~~      <!$mic:attribute:name!>!set(<![jeos:jeo:field:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[jeos:jeo:field:name]"));
//ScriptWriter~~      <!$mic:attribute:mapTo!>!set(<![jeos:jeo:field:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:mapTo")).set(iSymbolTable.translateProperties("[jeos:jeo:field:name]"));
//ScriptWriter~~      <!$mic:attribute:type!>!set(<![jeos:jeo:field:type]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[jeos:jeo:field:type]"));
//ScriptWriter~~      if (<!jeos:jeo:field:size!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jeos:jeo:field:size")).size() > 0) {
//ScriptWriter~~        <!$mic:attribute:size!>!set(<![jeos:jeo:field:size]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[jeos:jeo:field:size]"));
      } else {
//ScriptWriter~~        <!$mic:attribute:size!>!set("0");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set("0");
      }
//ScriptWriter~~      if (<!jeos:jeo:field:nullable!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jeos:jeo:field:nullable")).size() > 0) {
//ScriptWriter~~        <!$mic:attribute:nullable!>!set(<![jeos:jeo:field:nullable]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set(iSymbolTable.translateProperties("[jeos:jeo:field:nullable]"));
      } else {
//ScriptWriter~~        <!$mic:attribute:nullable!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set("true");
      }
    }
    generateAttributes(aXmlDefinition, aPackageName, aJeo);

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

  public void generateAttributes(String aXmlDefinition, String aPackageName, String aClass) {
    try {

    setContext(iScript.getMasterScript());
//ScriptWriter~~    String lDateTime = <![$jac:dateTime]!>;
    String lDateTime = iSymbolTable.translateProperties("[$jac:dateTime]");
    restoreContext();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//$Section=License$Preserve=no
iOutputManager.println("//$Section=License$Preserve=no", true);
//ScriptWriter~~//  Generated at <!%lDateTime!> by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
iOutputManager.println("//  Generated at " + lDateTime + " by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED", true);
//ScriptWriter~~//  XML Definition: <!%aXmlDefinition!>
iOutputManager.println("//  XML Definition: " + aXmlDefinition + "", true);
//ScriptWriter~~//     Module Name: <!%aPackageName!>.<!%aClass!>
iOutputManager.println("//     Module Name: " + aPackageName + "." + aClass + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=ChangeLog$Preserve=yes
iOutputManager.println("//$Section=ChangeLog$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~/* ========================================================================= *
iOutputManager.println("/* ========================================================================= *", true);
//ScriptWriter~~   Contributor        Description
iOutputManager.println("   Contributor        Description", true);
//ScriptWriter~~   ------------------ ------------------------------------------------------
iOutputManager.println("   ------------------ ------------------------------------------------------", true);
//ScriptWriter~~                      Author
iOutputManager.println("                      Author", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~ * ========================================================================= */
iOutputManager.println(" * ========================================================================= */", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Class$Preserve=no
iOutputManager.println("//$Section=Class$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~package <!%aPackageName!>;
iOutputManager.println("package " + aPackageName + ";", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~/**
iOutputManager.println("/**", true);
//ScriptWriter~~ *
iOutputManager.println(" *", true);
//ScriptWriter~~ */
iOutputManager.println(" */", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for generated import delcarations.
iOutputManager.println("// This section is for generated import delcarations.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// Additional Import Declarations
iOutputManager.println("// Additional Import Declarations", true);
//ScriptWriter~~import com.esarks.jac.*;
iOutputManager.println("import com.esarks.jac.*;", true);
//ScriptWriter~~import com.esarks.mic.*;
iOutputManager.println("import com.esarks.mic.*;", true);
//ScriptWriter~~import java.util.*;
iOutputManager.println("import java.util.*;", true);
//ScriptWriter~~import java.lang.reflect.*;
iOutputManager.println("import java.lang.reflect.*;", true);
//ScriptWriter~~import java.io.*;
iOutputManager.println("import java.io.*;", true);
//ScriptWriter~~import java.text.*;
iOutputManager.println("import java.text.*;", true);
//ScriptWriter~~import java.net.*;
iOutputManager.println("import java.net.*;", true);
//ScriptWriter~~import java.sql.*;
iOutputManager.println("import java.sql.*;", true);
//ScriptWriter~~import javax.servlet.*;
iOutputManager.println("import javax.servlet.*;", true);
//ScriptWriter~~import javax.servlet.http.*;
iOutputManager.println("import javax.servlet.http.*;", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=CustomDeclare$Preserve=yes
iOutputManager.println("//$Section=CustomDeclare$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for custom declarations.
iOutputManager.println("// This section is for custom declarations.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=CustomDeclare$Preserve=no
iOutputManager.println("//$Section=CustomDeclare$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~public class <!%aClass!> extends com.esarks.jac.Jeo {
iOutputManager.println("public class " + aClass + " extends com.esarks.jac.Jeo {", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for generated declarations.
iOutputManager.println("// This section is for generated declarations.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// Attributes
iOutputManager.println("// Attributes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~//      String lType = getDbType(<![$mic:attribute:type]!>);
//      String lType = getDbType(iSymbolTable.translateProperties("[$mic:attribute:type]"));
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//<![cap@[$mic:attribute:name]]!>  Type: <![$mic:attribute:type]!>  Size: <![$mic:attribute:size]!>  Nullable: <![$mic:attribute:nullable]!>
iOutputManager.println("//" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "  Type: " + iSymbolTable.translateProperties("[$mic:attribute:type]") + "  Size: " + iSymbolTable.translateProperties("[$mic:attribute:size]") + "  Nullable: " + iSymbolTable.translateProperties("[$mic:attribute:nullable]") + "", true);
//ScriptWriter~~    private PropertyValue i<![cap@[$mic:attribute:name]]!> = new PropertyValue();
iOutputManager.println("    private PropertyValue i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + " = new PropertyValue();", true);
//ScriptWriter~~    private boolean i<![cap@[$mic:attribute:name]]!>IsNullable = <![$mic:attribute:nullable]!>;
iOutputManager.println("    private boolean i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "IsNullable = " + iSymbolTable.translateProperties("[$mic:attribute:nullable]") + ";", true);
//ScriptWriter~~    private boolean i<![cap@[$mic:attribute:name]]!>Update = false;
iOutputManager.println("    private boolean i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Update = false;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (<![$mic:attribute:size]!>.equals("")) {
      if (iSymbolTable.translateProperties("[$mic:attribute:size]").equals("")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    private int i<![cap@[$mic:attribute:name]]!>Size = -1;
iOutputManager.println("    private int i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Size = -1;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    private int i<![cap@[$mic:attribute:name]]!>Size = <![$mic:attribute:size]!>;
iOutputManager.println("    private int i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Size = " + iSymbolTable.translateProperties("[$mic:attribute:size]") + ";", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }

    }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=CustomClassDeclare$Preserve=yes
iOutputManager.println("//$Section=CustomClassDeclare$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for custom class declarations.
iOutputManager.println("// This section is for custom class declarations.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=CustomClassDeclare$Preserve=no
iOutputManager.println("//$Section=CustomClassDeclare$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// Generated constructors.
iOutputManager.println("// Generated constructors.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~/**
iOutputManager.println("/**", true);
//ScriptWriter~~ * Default constructor.
iOutputManager.println(" * Default constructor.", true);
//ScriptWriter~~ */
iOutputManager.println(" */", true);
//ScriptWriter~~    public <!%aClass!>() {
iOutputManager.println("    public " + aClass + "() {", true);
//ScriptWriter~~      super("<!%aPackageName!>.<!%aClass!>");
iOutputManager.println("      super(\"" + aPackageName + "." + aClass + "\");", true);
//ScriptWriter~~//$Section=DefaultConstructor$Preserve=yes
iOutputManager.println("//$Section=DefaultConstructor$Preserve=yes", true);
//ScriptWriter~~//$Section=DefaultConstructor$Preserve=no
iOutputManager.println("//$Section=DefaultConstructor$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~/**
iOutputManager.println("/**", true);
//ScriptWriter~~ *
iOutputManager.println(" *", true);
//ScriptWriter~~ */
iOutputManager.println(" */", true);
//ScriptWriter~~    public <!%aClass!>( Script aScript ) {
iOutputManager.println("    public " + aClass + "( Script aScript ) {", true);
//ScriptWriter~~      super("<!%aPackageName!>.<!%aClass!>", aScript);
iOutputManager.println("      super(\"" + aPackageName + "." + aClass + "\", aScript);", true);
//ScriptWriter~~//$Section=Operation$Jeo( String aScript )$Preserve=yes
iOutputManager.println("//$Section=Operation$Jeo( String aScript )$Preserve=yes", true);
//ScriptWriter~~//$Section=Operation$Jeo( String aScript )$Preserve=no
iOutputManager.println("//$Section=Operation$Jeo( String aScript )$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~/**
iOutputManager.println("/**", true);
//ScriptWriter~~ *
iOutputManager.println(" *", true);
//ScriptWriter~~ */
iOutputManager.println(" */", true);
//ScriptWriter~~    public <!%aClass!>( String aTypeName ) {
iOutputManager.println("    public " + aClass + "( String aTypeName ) {", true);
//ScriptWriter~~      super("<!%aPackageName!>.<!%aClass!>", aTypeName);
iOutputManager.println("      super(\"" + aPackageName + "." + aClass + "\", aTypeName);", true);
//ScriptWriter~~//$Section=Operation$Jeo( String aTypeName )$Preserve=yes
iOutputManager.println("//$Section=Operation$Jeo( String aTypeName )$Preserve=yes", true);
//ScriptWriter~~//$Section=Operation$Jeo( String aTypeName )$Preserve=no
iOutputManager.println("//$Section=Operation$Jeo( String aTypeName )$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~/**
iOutputManager.println("/**", true);
//ScriptWriter~~ *
iOutputManager.println(" *", true);
//ScriptWriter~~ */
iOutputManager.println(" */", true);
//ScriptWriter~~    public <!%aClass!>( String aTypeName, Script aScript ) {
iOutputManager.println("    public " + aClass + "( String aTypeName, Script aScript ) {", true);
//ScriptWriter~~      super("<!%aPackageName!>.<!%aClass!>", aTypeName, aScript);
iOutputManager.println("      super(\"" + aPackageName + "." + aClass + "\", aTypeName, aScript);", true);
//ScriptWriter~~//$Section=Operation$Jeo( String aTypeName, Script aScript )$Preserve=yes
iOutputManager.println("//$Section=Operation$Jeo( String aTypeName, Script aScript )$Preserve=yes", true);
//ScriptWriter~~//$Section=Operation$Jeo( String aTypeName, Script aScript )$Preserve=no
iOutputManager.println("//$Section=Operation$Jeo( String aTypeName, Script aScript )$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// Default finalize is generated.
iOutputManager.println("// Default finalize is generated.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~/**
iOutputManager.println("/**", true);
//ScriptWriter~~ * Default finalize.
iOutputManager.println(" * Default finalize.", true);
//ScriptWriter~~ */
iOutputManager.println(" */", true);
//ScriptWriter~~    public void finalize() {
iOutputManager.println("    public void finalize() {", true);
//ScriptWriter~~    	freeResources();
iOutputManager.println("    	freeResources();", true);
//ScriptWriter~~//$Section=DefaultDestructor$Preserve=yes
iOutputManager.println("//$Section=DefaultDestructor$Preserve=yes", true);
//ScriptWriter~~//$Section=DefaultDestructor$Preserve=no
iOutputManager.println("//$Section=DefaultDestructor$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// Default freeResources is generated.
iOutputManager.println("// Default freeResources is generated.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~/**
iOutputManager.println("/**", true);
//ScriptWriter~~ * Default freeResources.
iOutputManager.println(" * Default freeResources.", true);
//ScriptWriter~~ */
iOutputManager.println(" */", true);
//ScriptWriter~~    public void freeResources() {
iOutputManager.println("    public void freeResources() {", true);
//ScriptWriter~~    	super.freeResources();
iOutputManager.println("    	super.freeResources();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    i<![cap@[$mic:attribute:name]]!> = null;
iOutputManager.println("    i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + " = null;", true);
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
//ScriptWriter~~//$Section=DefaultFreeResources$Preserve=yes
iOutputManager.println("//$Section=DefaultFreeResources$Preserve=yes", true);
//ScriptWriter~~//$Section=DefaultFreeResources$Preserve=no
iOutputManager.println("//$Section=DefaultFreeResources$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for custom operations.
iOutputManager.println("// This section is for custom operations.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~//$Section=CustomOperations$Preserve=yes
iOutputManager.println("//$Section=CustomOperations$Preserve=yes", true);
//ScriptWriter~~//$Section=CustomOperations$Preserve=no
iOutputManager.println("//$Section=CustomOperations$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for mapping views to tables.
iOutputManager.println("// This section is for mapping views to tables.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!$mic:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table")).resetIterator();
//ScriptWriter~~    while (<!$mic:table!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table")).next()) {
//ScriptWriter~~      if (<![$mic:table:in]!>.equals("")) continue;
      if (iSymbolTable.translateProperties("[$mic:table:in]").equals("")) continue;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public <![$mic:table:in]!>.<![$mic:table]!> get<![cap@[$mic:table]]!>() {
iOutputManager.println("  public " + iSymbolTable.translateProperties("[$mic:table:in]") + "." + iSymbolTable.translateProperties("[$mic:table]") + " get" + iSymbolTable.translateProperties("[cap@[$mic:table]]") + "() {", true);
//ScriptWriter~~//$Section=Operation$get<![cap@[$mic:table]]!>()$Preserve=no
iOutputManager.println("//$Section=Operation$get" + iSymbolTable.translateProperties("[cap@[$mic:table]]") + "()$Preserve=no", true);
//ScriptWriter~~    <![$mic:table:in]!>.<![$mic:table]!> l<![cap@[$mic:table]]!> = new <![$mic:table:in]!>.<![$mic:table]!>();
iOutputManager.println("    " + iSymbolTable.translateProperties("[$mic:table:in]") + "." + iSymbolTable.translateProperties("[$mic:table]") + " l" + iSymbolTable.translateProperties("[cap@[$mic:table]]") + " = new " + iSymbolTable.translateProperties("[$mic:table:in]") + "." + iSymbolTable.translateProperties("[$mic:table]") + "();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!$mic:table:attribute!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table:attribute")).resetIterator();
//ScriptWriter~~      while (<!$mic:table:attribute!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table:attribute")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    l<![cap@[$mic:table]]!>.set<![cap@[$mic:table:attribute:mapTo]]!>(get<![cap@[$mic:table:attribute:name]]!>());
iOutputManager.println("    l" + iSymbolTable.translateProperties("[cap@[$mic:table]]") + ".set" + iSymbolTable.translateProperties("[cap@[$mic:table:attribute:mapTo]]") + "(get" + iSymbolTable.translateProperties("[cap@[$mic:table:attribute:name]]") + "());", true);
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
//ScriptWriter~~    return l<![cap@[$mic:table]]!>;
iOutputManager.println("    return l" + iSymbolTable.translateProperties("[cap@[$mic:table]]") + ";", true);
//ScriptWriter~~//$Section=Operation$get<![cap@[$mic:table]]!>()$Preserve=no
iOutputManager.println("//$Section=Operation$get" + iSymbolTable.translateProperties("[cap@[$mic:table]]") + "()$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }

//ScriptWriter~~    if (<!$mic:createJeo!>!size() == 0 || true) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:createJeo")).size() == 0 || true) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for mapping from result sets.
iOutputManager.println("// This section is for mapping from result sets.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void mapFromResultSet( ResultSet aResultSet, boolean aTrim, boolean aSpacesToNull) {
iOutputManager.println("  public void mapFromResultSet( ResultSet aResultSet, boolean aTrim, boolean aSpacesToNull) {", true);
//ScriptWriter~~//$Section=Operation$mapFromResultSet$Preserve=no
iOutputManager.println("//$Section=Operation$mapFromResultSet$Preserve=no", true);
//ScriptWriter~~    mapFromResultSetTable("*", aResultSet, aTrim, aSpacesToNull);
iOutputManager.println("    mapFromResultSetTable(\"*\", aResultSet, aTrim, aSpacesToNull);", true);
//ScriptWriter~~//$Section=Operation$mapFromResultSet$Preserve=no
iOutputManager.println("//$Section=Operation$mapFromResultSet$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~  
iOutputManager.println("  ", true);
//ScriptWriter~~  public void mapFromResultSetTable( String aTable, ResultSet aResultSet, boolean aTrim, boolean aSpacesToNull) {
iOutputManager.println("  public void mapFromResultSetTable( String aTable, ResultSet aResultSet, boolean aTrim, boolean aSpacesToNull) {", true);
//ScriptWriter~~//$Section=Operation$mapFromResultSetTable$Preserve=no
iOutputManager.println("//$Section=Operation$mapFromResultSetTable$Preserve=no", true);
//ScriptWriter~~    String lValue = null;
iOutputManager.println("    String lValue = null;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      String lLastTableName = "*";
//ScriptWriter~~      <!$mic:attribute!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~      while (<!$mic:attribute!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~        if (!lLastTableName.equals(<![$mic:attribute:table]!>)) {
        if (!lLastTableName.equals(iSymbolTable.translateProperties("[$mic:attribute:table]"))) {
          if (!lLastTableName.equals("*")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
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
//ScriptWriter~~      if (aTable.equals("*") || aTable.equals("<![$mic:attribute:table]!>")) {
iOutputManager.println("      if (aTable.equals(\"*\") || aTable.equals(\"" + iSymbolTable.translateProperties("[$mic:attribute:table]") + "\")) {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          lLastTableName = <![$mic:attribute:table]!>;
          lLastTableName = iSymbolTable.translateProperties("[$mic:attribute:table]");
        }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// <![cap@[$mic:attribute:name]]!> in <![$mic:attribute:table]!>
iOutputManager.println("// " + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + " in " + iSymbolTable.translateProperties("[$mic:attribute:table]") + "", true);
//ScriptWriter~~        try {
iOutputManager.println("        try {", true);
//ScriptWriter~~          lValue = aResultSet.getString("<![$mic:attribute:name]!>");
iOutputManager.println("          lValue = aResultSet.getString(\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\");", true);
//ScriptWriter~~          if (aResultSet.wasNull()) {
iOutputManager.println("          if (aResultSet.wasNull()) {", true);
//ScriptWriter~~            set<![cap@[$mic:attribute:name]]!>Null();
iOutputManager.println("            set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null();", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<![$mic:attribute:type]!>.equals("datetime")) {
        if (iSymbolTable.translateProperties("[$mic:attribute:type]").equals("datetime")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            set<![cap@[$mic:attribute:name]]!>(aResultSet.getTimestamp("<![$mic:attribute:name]!>"));
iOutputManager.println("            set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(aResultSet.getTimestamp(\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\"));", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~        } catch (Throwable e) {}
iOutputManager.println("        } catch (Throwable e) {}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            if (aTrim) lValue = lValue.trim();
iOutputManager.println("            if (aTrim) lValue = lValue.trim();", true);
//ScriptWriter~~            if (aSpacesToNull && lValue.length() == 0) {
iOutputManager.println("            if (aSpacesToNull && lValue.length() == 0) {", true);
//ScriptWriter~~              set<![cap@[$mic:attribute:name]]!>Null();
iOutputManager.println("              set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null();", true);
//ScriptWriter~~            } else {
iOutputManager.println("            } else {", true);
//ScriptWriter~~              set<![cap@[$mic:attribute:name]]!>(lValue);
iOutputManager.println("              set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(lValue);", true);
//ScriptWriter~~            }
iOutputManager.println("            }", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~        } catch (Throwable e) {}
iOutputManager.println("        } catch (Throwable e) {}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }
      if (!lLastTableName.equals("*")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
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
//ScriptWriter~~//$Section=Operation$mapFromResultSetTable$Preserve=no
iOutputManager.println("//$Section=Operation$mapFromResultSetTable$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
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
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for mapping from and to Jeo's.
iOutputManager.println("// This section is for mapping from and to Jeo's.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void mapToJeo( Jeo aJeo) {
iOutputManager.println("  public void mapToJeo( Jeo aJeo) {", true);
//ScriptWriter~~//$Section=Operation$mapFromJeo$Preserve=no
iOutputManager.println("//$Section=Operation$mapFromJeo$Preserve=no", true);
//ScriptWriter~~    String lType = null;
iOutputManager.println("    String lType = null;", true);
//ScriptWriter~~    PropertyValue lValue = null;
iOutputManager.println("    PropertyValue lValue = null;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// <![cap@[$mic:attribute:name]]!>
iOutputManager.println("// " + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "", true);
//ScriptWriter~~      try {
iOutputManager.println("      try {", true);
//ScriptWriter~~        lValue = aJeo.getPropertyValueByName("<![$mic:attribute:name]!>");
iOutputManager.println("        lValue = aJeo.getPropertyValueByName(\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\");", true);
//ScriptWriter~~        if (lValue != null) {
iOutputManager.println("        if (lValue != null) {", true);
//ScriptWriter~~          lType = aJeo.getTypeByName("<![$mic:attribute:name]!>");
iOutputManager.println("          lType = aJeo.getTypeByName(\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\");", true);
//ScriptWriter~~          if (!is<![cap@[$mic:attribute:name]]!>Null()) {
iOutputManager.println("          if (!is" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null()) {", true);
//ScriptWriter~~            lValue.reset(lType, get<![cap@[$mic:attribute:name]]!>PropertyValue().toString());
iOutputManager.println("            lValue.reset(lType, get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "PropertyValue().toString());", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~            lValue.reset("null", "");
iOutputManager.println("            lValue.reset(\"null\", \"\");", true);
//ScriptWriter~~          }
iOutputManager.println("          }", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~      } catch(Throwable e) {}
iOutputManager.println("      } catch(Throwable e) {}", true);
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
//ScriptWriter~~//$Section=Operation$mapToJeo$Preserve=no
iOutputManager.println("//$Section=Operation$mapToJeo$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void mapFromJeo( Jeo aJeo) {
iOutputManager.println("  public void mapFromJeo( Jeo aJeo) {", true);
//ScriptWriter~~//$Section=Operation$mapFromJeo$Preserve=no
iOutputManager.println("//$Section=Operation$mapFromJeo$Preserve=no", true);
//ScriptWriter~~    String lType = null;
iOutputManager.println("    String lType = null;", true);
//ScriptWriter~~    PropertyValue lValue = null;
iOutputManager.println("    PropertyValue lValue = null;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// <![cap@[$mic:attribute:name]]!>
iOutputManager.println("// " + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "", true);
//ScriptWriter~~      try {
iOutputManager.println("      try {", true);
//ScriptWriter~~        lValue = aJeo.getPropertyValueByName("<![$mic:attribute:name]!>");
iOutputManager.println("        lValue = aJeo.getPropertyValueByName(\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\");", true);
//ScriptWriter~~        if (lValue != null) {
iOutputManager.println("        if (lValue != null) {", true);
//ScriptWriter~~          set<![cap@[$mic:attribute:name]]!>(lValue);
iOutputManager.println("          set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(lValue);", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~      } catch(Throwable e) {}
iOutputManager.println("      } catch(Throwable e) {}", true);
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
//ScriptWriter~~//$Section=Operation$mapFromJeo$Preserve=no
iOutputManager.println("//$Section=Operation$mapFromJeo$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for the get PropertyValue by attribute string name method.
iOutputManager.println("// This section is for the get PropertyValue by attribute string name method.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public PropertyValue getPropertyValueByName ( String aAttributeName) {
iOutputManager.println("  public PropertyValue getPropertyValueByName ( String aAttributeName) {", true);
//ScriptWriter~~//$Section=Operation$getPropertyValueByName$Preserve=no
iOutputManager.println("//$Section=Operation$getPropertyValueByName$Preserve=no", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      String lLowerName = <![$mic:attribute:name]!>.toLowerCase();
      String lLowerName = iSymbolTable.translateProperties("[$mic:attribute:name]").toLowerCase();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      if (aAttributeName.toLowerCase().equals("<!%lLowerName!>")) {
iOutputManager.println("      if (aAttributeName.toLowerCase().equals(\"" + lLowerName + "\")) {", true);
//ScriptWriter~~        return i<![cap@[$mic:attribute:name]]!>;
iOutputManager.println("        return i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + ";", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
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
//ScriptWriter~~      return null;
iOutputManager.println("      return null;", true);
//ScriptWriter~~//$Section=Operation$getPropertyValueByName$Preserve=no
iOutputManager.println("//$Section=Operation$getPropertyValueByName$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public String getTypeByName ( String aAttributeName) {
iOutputManager.println("  public String getTypeByName ( String aAttributeName) {", true);
//ScriptWriter~~//$Section=Operation$getTypeByName$Preserve=no
iOutputManager.println("//$Section=Operation$getTypeByName$Preserve=no", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      String lLowerName = <![$mic:attribute:name]!>.toLowerCase();
      String lLowerName = iSymbolTable.translateProperties("[$mic:attribute:name]").toLowerCase();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      if (aAttributeName.toLowerCase().equals("<!%lLowerName!>")) {
iOutputManager.println("      if (aAttributeName.toLowerCase().equals(\"" + lLowerName + "\")) {", true);
//ScriptWriter~~        return "<![$mic:attribute:type]!>";
iOutputManager.println("        return \"" + iSymbolTable.translateProperties("[$mic:attribute:type]") + "\";", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
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
//ScriptWriter~~      return null;
iOutputManager.println("      return null;", true);
//ScriptWriter~~//$Section=Operation$getTypeByName$Preserve=no
iOutputManager.println("//$Section=Operation$getTypeByName$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public String getNameByIndex ( int aIndex) {
iOutputManager.println("  public String getNameByIndex ( int aIndex) {", true);
//ScriptWriter~~//$Section=Operation$getNameByIndex$Preserve=no
iOutputManager.println("//$Section=Operation$getNameByIndex$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    switch(aIndex) {
iOutputManager.println("    switch(aIndex) {", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    int lCase = 0;
//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
      lCase++;
//ScriptWriter~~      String lLowerName = <![$mic:attribute:name]!>.toLowerCase();
      String lLowerName = iSymbolTable.translateProperties("[$mic:attribute:name]").toLowerCase();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      case <!%lCase!>: return "<!%lLowerName!>";
iOutputManager.println("      case " + lCase + ": return \"" + lLowerName + "\";", true);
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
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    return null;
iOutputManager.println("    return null;", true);
//ScriptWriter~~//$Section=Operation$getNameByIndex$Preserve=no
iOutputManager.println("//$Section=Operation$getNameByIndex$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section is for generated attribute accessor methods.
iOutputManager.println("// This section is for generated attribute accessor methods.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      String lType = getProperty("dbTypes:" + <![$mic:attribute:type]!> + ":java");
      String lType = getProperty("dbTypes:" + iSymbolTable.translateProperties("[$mic:attribute:type]") + ":java");
      if (lType.equals("")) {
//ScriptWriter~~        String lMicType = <![$mic:attribute:type]!>;
        String lMicType = iSymbolTable.translateProperties("[$mic:attribute:type]");
//ScriptWriter~~        String lMicName = <![$mic:attribute:name]!>;
        String lMicName = iSymbolTable.translateProperties("[$mic:attribute:name]");
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("Cannot find dbTypes:*:java for type \"" + lMicType + "\" at attribute \"" + lMicName + "\"");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Cannot find dbTypes:*:java for type \"" + lMicType + "\" at attribute \"" + lMicName + "\"");
//ScriptWriter~~        <!$jac:event:severity!>!set("error");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("error");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
      }
//ScriptWriter~~      String lGetType = getProperty("dbTypes:" + <![$mic:attribute:type]!> + ":property");
      String lGetType = getProperty("dbTypes:" + iSymbolTable.translateProperties("[$mic:attribute:type]") + ":property");
      if (lGetType.equals("")) {
//ScriptWriter~~        String lMicType = <![$mic:attribute:type]!>;
        String lMicType = iSymbolTable.translateProperties("[$mic:attribute:type]");
//ScriptWriter~~        String lMicName = <![$mic:attribute:name]!>;
        String lMicName = iSymbolTable.translateProperties("[$mic:attribute:name]");
        setContext(iScript.getMasterScript());
//ScriptWriter~~        <!$jac:event!>!set("Cannot find dbTypes:*:property for type \"" + lMicType + "\" at attribute \"" + lMicName + "\"");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Cannot find dbTypes:*:property for type \"" + lMicType + "\" at attribute \"" + lMicName + "\"");
//ScriptWriter~~        <!$jac:event:severity!>!set("error");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("error");
//ScriptWriter~~        <!$jac:event:scriptPackage!>!set(iScriptPackage);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~        <!$jac:event:scriptName!>!set(iScriptName);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
        restoreContext();
      }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// <![cap@[$mic:attribute:name]]!>
iOutputManager.println("// " + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~    public <!%lType!> get<![cap@[$mic:attribute:name]]!>() {
iOutputManager.println("    public " + lType + " get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "() {", true);
//ScriptWriter~~//$Section=Attribute get$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute get$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        return i<![cap@[$mic:attribute:name]]!>.<!%lGetType!>();
iOutputManager.println("        return i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "." + lGetType + "();", true);
//ScriptWriter~~//$Section=Attribute get$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute get$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public void set<![cap@[$mic:attribute:name]]!>(<!%lType!> aValue) {
iOutputManager.println("    public void set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(" + lType + " aValue) {", true);
//ScriptWriter~~//$Section=Attribute set$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute set$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        i<![cap@[$mic:attribute:name]]!>.reset(aValue);
iOutputManager.println("        i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + ".reset(aValue);", true);
//ScriptWriter~~//$Section=Attribute set$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute set$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public void set<![cap@[$mic:attribute:name]]!>(PropertyValue aValue) {
iOutputManager.println("    public void set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(PropertyValue aValue) {", true);
//ScriptWriter~~//$Section=Attribute setPropertyValue$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setPropertyValue$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        if (aValue.getType().equals("null")) {
iOutputManager.println("        if (aValue.getType().equals(\"null\")) {", true);
//ScriptWriter~~          set<![cap@[$mic:attribute:name]]!>Null();
iOutputManager.println("          set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null();", true);
//ScriptWriter~~          return;
iOutputManager.println("          return;", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        set<![cap@[$mic:attribute:name]]!>(aValue.toString());
iOutputManager.println("        set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(aValue.toString());", true);
//ScriptWriter~~//$Section=Attribute setPropertyValue$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setPropertyValue$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public void set<![cap@[$mic:attribute:name]]!>(PropertyValue aValue, String aFormat) {
iOutputManager.println("    public void set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(PropertyValue aValue, String aFormat) {", true);
//ScriptWriter~~//$Section=Attribute setPropertyValueFormat$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setPropertyValueFormat$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        if (aValue.getType().equals("null")) {
iOutputManager.println("        if (aValue.getType().equals(\"null\")) {", true);
//ScriptWriter~~          set<![cap@[$mic:attribute:name]]!>Null();
iOutputManager.println("          set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null();", true);
//ScriptWriter~~          return;
iOutputManager.println("          return;", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
//ScriptWriter~~        set<![cap@[$mic:attribute:name]]!>(aValue.toString(), aFormat);
iOutputManager.println("        set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(aValue.toString(), aFormat);", true);
//ScriptWriter~~//$Section=Attribute setPropertyValueFormat$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setPropertyValueFormat$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    String lSetType = getProperty("dbTypes:" + <![$mic:attribute:type]!> + ":setString");
    String lSetType = getProperty("dbTypes:" + iSymbolTable.translateProperties("[$mic:attribute:type]") + ":setString");
//    if (lSetType.equals("")) {
//ScriptWriter~~//      String lMicType = <![$mic:attribute:type]!>;
//      String lMicType = iSymbolTable.translateProperties("[$mic:attribute:type]");
//ScriptWriter~~//      String lMicName = <![$mic:attribute:name]!>;
//      String lMicName = iSymbolTable.translateProperties("[$mic:attribute:name]");
//      setContext(iScript.getMasterScript());
//ScriptWriter~~//      <!$jac:event!>!set("Cannot find dbTypes:*:setString for type \"" + lMicType + "\" at attribute \"" + lMicName + "\"");
//      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Cannot find dbTypes:*:setString for type \"" + lMicType + "\" at attribute \"" + lMicName + "\"");
//ScriptWriter~~//      <!$jac:event:severity!>!set("error");
//      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("error");
//ScriptWriter~~//      <!$jac:event:scriptPackage!>!set(iScriptPackage);
//      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~//      <!$jac:event:scriptName!>!set(iScriptName);
//      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
//      restoreContext();
//    }
    if (!lSetType.equals("")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    public void set<![cap@[$mic:attribute:name]]!>(String aValue) {
iOutputManager.println("    public void set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(String aValue) {", true);
//ScriptWriter~~//$Section=Attribute setAsString$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setAsString$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        i<![cap@[$mic:attribute:name]]!>.reset("<!%lSetType!>", aValue);
iOutputManager.println("        i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + ".reset(\"" + lSetType + "\", aValue);", true);
//ScriptWriter~~//$Section=Attribute setAsString$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setAsString$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
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
//ScriptWriter~~    public void set<![cap@[$mic:attribute:name]]!>(String aValue, String aType) {
iOutputManager.println("    public void set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(String aValue, String aType) {", true);
//ScriptWriter~~//$Section=Attribute setAsStringType$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setAsStringType$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        i<![cap@[$mic:attribute:name]]!>.reset(aType, aValue);
iOutputManager.println("        i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + ".reset(aType, aValue);", true);
//ScriptWriter~~//$Section=Attribute setAsStringType$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setAsStringType$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public PropertyValue get<![cap@[$mic:attribute:name]]!>PropertyValue() {
iOutputManager.println("    public PropertyValue get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "PropertyValue() {", true);
//ScriptWriter~~//$Section=Attribute getPropertyValue$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute getPropertyValue$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        return i<![cap@[$mic:attribute:name]]!>;
iOutputManager.println("        return i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + ";", true);
//ScriptWriter~~//$Section=Attribute getPropertyValue$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute getPropertyValue$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~//    public String get<![cap@[$mic:attribute:name]]!>Name() {
//    public String getiSymbolTable.translateProperties("[cap@[$mic:attribute:name]]")Name() {
//ScriptWriter~~////$Section=Attribute getName$<![cap@[$mic:attribute:name]]!>$Preserve=no
////$Section=Attribute getName$iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]")$Preserve=no
//ScriptWriter~~//        return "<![$mic:attribute:name]!>";
//        return "iSymbolTable.translateProperties("[$mic:attribute:name]")";
//ScriptWriter~~////$Section=Attribute getName$<![cap@[$mic:attribute:name]]!>$Preserve=no
////$Section=Attribute getName$iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]")$Preserve=no
//    }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    public int size<![cap@[$mic:attribute:name]]!>() {
iOutputManager.println("    public int size" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "() {", true);
//ScriptWriter~~//$Section=Attribute size$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute size$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        return i<![cap@[$mic:attribute:name]]!>Size;
iOutputManager.println("        return i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Size;", true);
//ScriptWriter~~//$Section=Attribute size$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute size$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public boolean is<![cap@[$mic:attribute:name]]!>Nullable() {
iOutputManager.println("    public boolean is" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Nullable() {", true);
//ScriptWriter~~//$Section=Attribute isNullable$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute isNullable$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        return i<![cap@[$mic:attribute:name]]!>IsNullable;
iOutputManager.println("        return i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "IsNullable;", true);
//ScriptWriter~~//$Section=Attribute isNullable$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute isNullable$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public boolean is<![cap@[$mic:attribute:name]]!>Null() {
iOutputManager.println("    public boolean is" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null() {", true);
//ScriptWriter~~//$Section=Attribute isNull$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute isNull$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        if (i<![cap@[$mic:attribute:name]]!>.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
iOutputManager.println("        if (i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + ".getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;", true);
//ScriptWriter~~        return false;
iOutputManager.println("        return false;", true);
//ScriptWriter~~//$Section=Attribute isNull$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute isNull$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public void set<![cap@[$mic:attribute:name]]!>Null() {
iOutputManager.println("    public void set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null() {", true);
//ScriptWriter~~//$Section=Attribute setNull$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setNull$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        i<![cap@[$mic:attribute:name]]!>.reset();
iOutputManager.println("        i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + ".reset();", true);
//ScriptWriter~~//$Section=Attribute setNull$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setNull$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public void set<![cap@[$mic:attribute:name]]!>SpaceToNull() {
iOutputManager.println("    public void set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "SpaceToNull() {", true);
//ScriptWriter~~//$Section=Attribute setSpaceToNull$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setSpaceToNull$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        if (get<![cap@[$mic:attribute:name]]!>PropertyValue().toString().trim().equals("")) set<![cap@[$mic:attribute:name]]!>Null();
iOutputManager.println("        if (get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "PropertyValue().toString().trim().equals(\"\")) set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null();", true);
//ScriptWriter~~//$Section=Attribute setSpaceToNull$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setSpaceToNull$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public void set<![cap@[$mic:attribute:name]]!>Update(boolean aUpdate) {
iOutputManager.println("    public void set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Update(boolean aUpdate) {", true);
//ScriptWriter~~//$Section=Attribute setUpdate$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setUpdate$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        i<![cap@[$mic:attribute:name]]!>Update = aUpdate;
iOutputManager.println("        i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Update = aUpdate;", true);
//ScriptWriter~~//$Section=Attribute setUpdate$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute setUpdate$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public boolean get<![cap@[$mic:attribute:name]]!>Update() {
iOutputManager.println("    public boolean get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Update() {", true);
//ScriptWriter~~//$Section=Attribute getUpdate$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute getUpdate$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        return i<![cap@[$mic:attribute:name]]!>Update;
iOutputManager.println("        return i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Update;", true);
//ScriptWriter~~//$Section=Attribute getUpdate$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute getUpdate$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
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
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Deleted$Preserve=yes
iOutputManager.println("//$Section=Deleted$Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~// This section contains orphaned code from deleted operations.
iOutputManager.println("// This section contains orphaned code from deleted operations.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Deleted$Preserve=no
iOutputManager.println("//$Section=Deleted$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//End of class---------------
iOutputManager.println("//End of class---------------", true);
//ScriptWriter~~}
iOutputManager.println("}", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


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

  public void generateCrudService(String aPackage, String aTableName) {
    try {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <services name="<!%aPackage!>.<!%aTableName!>Crud">
iOutputManager.println("  <services name=\"" + aPackage + "." + aTableName + "Crud\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


// create

    String lAttributeList = "";
    String lQuestionMarks = "";
    String lComma = ",";
    String lIdentity = "";
//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      if (<![$mic:attribute:identity]!>.equals("true")) {
      if (iSymbolTable.translateProperties("[$mic:attribute:identity]").equals("true")) {
//ScriptWriter~~        lIdentity = <![$mic:attribute:name]!>;
        lIdentity = iSymbolTable.translateProperties("[$mic:attribute:name]");
      } else {
//ScriptWriter~~        if (<!$mic:attribute!>!isLast()) lComma = "";
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).isLast()) lComma = "";
//ScriptWriter~~        lAttributeList += <![$mic:attribute:name]!> + lComma;
        lAttributeList += iSymbolTable.translateProperties("[$mic:attribute:name]") + lComma;
        lQuestionMarks += "?" + lComma;
      }
    }
    String lServiceBaseName = aTableName.substring(0,1).toUpperCase() + aTableName.substring(1);
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <service name="batchCreate<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.service">
iOutputManager.println("    <service name=\"batchCreate" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.service\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement>
iOutputManager.println("        <statement>", true);
//ScriptWriter~~          INSERT INTO <!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO " + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.request">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.request\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" iterate="true">
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" iterate=\"true\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      if (<![$mic:attribute:identity]!>.equals("true")) continue;
      if (iSymbolTable.translateProperties("[$mic:attribute:identity]").equals("true")) continue;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <value attribute="<![$mic:attribute:name]!>" />
iOutputManager.println("              <value attribute=\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\" />", true);
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
//ScriptWriter~~            </jeo>
iOutputManager.println("            </jeo>", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </value>
iOutputManager.println("        </value>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    if (lIdentity.length() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <service name="create<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.service">
iOutputManager.println("    <service name=\"create" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.service\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <procedure>
iOutputManager.println("        <procedure>", true);
//ScriptWriter~~          BEGIN
iOutputManager.println("          BEGIN", true);
//ScriptWriter~~          DECLARE @IDENT BIGINT
iOutputManager.println("          DECLARE @IDENT BIGINT", true);
//ScriptWriter~~          INSERT INTO <!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO " + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~          SELECT @IDENT = (SELECT @@IDENTITY)
iOutputManager.println("          SELECT @IDENT = (SELECT @@IDENTITY)", true);
//ScriptWriter~~          SELECT * FROM <!%aTableName!> WHERE <!%lIdentity!> = @IDENT
iOutputManager.println("          SELECT * FROM " + aTableName + " WHERE " + lIdentity + " = @IDENT", true);
//ScriptWriter~~          END
iOutputManager.println("          END", true);
//ScriptWriter~~        </procedure>
iOutputManager.println("        </procedure>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.request">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.request\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>">
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      if (<![$mic:attribute:identity]!>.equals("true")) continue;
      if (iSymbolTable.translateProperties("[$mic:attribute:identity]").equals("true")) continue;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <value attribute="<![$mic:attribute:name]!>" />
iOutputManager.println("              <value attribute=\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\" />", true);
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
//ScriptWriter~~            </jeo>
iOutputManager.println("            </jeo>", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </value>
iOutputManager.println("        </value>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.reply">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.reply\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" iterate="true" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" iterate=\"true\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <service name="create<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.service">
iOutputManager.println("    <service name=\"create" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.service\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <procedure>
iOutputManager.println("        <procedure>", true);
//ScriptWriter~~          BEGIN
iOutputManager.println("          BEGIN", true);
//ScriptWriter~~          INSERT INTO <!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO " + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~          SELECT * FROM <!%aTableName!> WHERE <%
iOutputManager.println("          SELECT * FROM " + aTableName + " WHERE ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!$mic:primary!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).resetIterator();
//ScriptWriter~~    while (<!$mic:primary!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).next()) {
//ScriptWriter~~      if (<!$mic:primary!>!isFirst()) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).isFirst()) {
//ScriptWriter~~        %><![$mic:primary]!>=?<%
        {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[$mic:primary]") + "=?", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
//ScriptWriter~~        %> AND <![$mic:primary]!>=?<%
        {
//ScriptWriter~~~
iOutputManager.println(" AND " + iSymbolTable.translateProperties("[$mic:primary]") + "=?", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
    }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~          END
iOutputManager.println("          END", true);
//ScriptWriter~~        </procedure>
iOutputManager.println("        </procedure>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.request">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.request\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>">
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      if (<![$mic:attribute:identity]!>.equals("true")) continue;
      if (iSymbolTable.translateProperties("[$mic:attribute:identity]").equals("true")) continue;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <value attribute="<![$mic:attribute:name]!>" />
iOutputManager.println("              <value attribute=\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\" />", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    <!$mic:primary!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).resetIterator();
//ScriptWriter~~    while (<!$mic:primary!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <value attribute="<![$mic:primary]!>" />
iOutputManager.println("              <value attribute=\"" + iSymbolTable.translateProperties("[$mic:primary]") + "\" />", true);
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
//ScriptWriter~~            </jeo>
iOutputManager.println("            </jeo>", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </value>
iOutputManager.println("        </value>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.reply">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.reply\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
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
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <service name="uidRead<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.service">
iOutputManager.println("    <service name=\"uidRead" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.service\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement>
iOutputManager.println("        <statement>", true);
//ScriptWriter~~          SELECT * FROM <!%aTableName!>
iOutputManager.println("          SELECT * FROM " + aTableName + "", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <where>
iOutputManager.println("        <where>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.request">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.request\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" >
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" >", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:primary!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).resetIterator();
//ScriptWriter~~    while (<!$mic:primary!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).next()) {
//ScriptWriter~~      if (<!$mic:primary!>!isFirst()) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).isFirst()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <where clause="<![$mic:primary]!>=?" attribute="<![$mic:primary]!>" />
iOutputManager.println("              <where clause=\"" + iSymbolTable.translateProperties("[$mic:primary]") + "=?\" attribute=\"" + iSymbolTable.translateProperties("[$mic:primary]") + "\" />", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <where clause="AND <![$mic:primary]!>=?" attribute="<![$mic:primary]!>" />
iOutputManager.println("              <where clause=\"AND " + iSymbolTable.translateProperties("[$mic:primary]") + "=?\" attribute=\"" + iSymbolTable.translateProperties("[$mic:primary]") + "\" />", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
    }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            </jeo>
iOutputManager.println("            </jeo>", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </where>
iOutputManager.println("        </where>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.reply">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.reply\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <service name="read<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.service">
iOutputManager.println("    <service name=\"read" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.service\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement>
iOutputManager.println("        <statement>", true);
//ScriptWriter~~          SELECT * FROM <!%aTableName!>
iOutputManager.println("          SELECT * FROM " + aTableName + "", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.reply">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.reply\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    String lPrimary = "";
//ScriptWriter~~    <!$mic:primary!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).resetIterator();
//ScriptWriter~~    while (<!$mic:primary!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).next()) {
//ScriptWriter~~      if (<!$mic:primary!>!isFirst()) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).isFirst()) {
//ScriptWriter~~        lPrimary = <![$mic:primary]!> + "=?";
        lPrimary = iSymbolTable.translateProperties("[$mic:primary]") + "=?";
      } else {
//ScriptWriter~~        lPrimary += " AND " + <![$mic:primary]!> + "=?";
        lPrimary += " AND " + iSymbolTable.translateProperties("[$mic:primary]") + "=?";
      }
    }
        
    lAttributeList = "";
//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      if (lPrimary.indexOf(<![$mic:attribute:name]!> + "=?") > -1) {
      if (lPrimary.indexOf(iSymbolTable.translateProperties("[$mic:attribute:name]") + "=?") > -1) {
      } else {
//ScriptWriter~~        lAttributeList += <![$mic:attribute:name]!> + "=?";
        lAttributeList += iSymbolTable.translateProperties("[$mic:attribute:name]") + "=?";
//ScriptWriter~~        if (!<!$mic:attribute!>!isLast()) lAttributeList += ", ";
        if (!iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).isLast()) lAttributeList += ", ";
      }
    }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <service name="uidUpdate<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.service">
iOutputManager.println("    <service name=\"uidUpdate" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.service\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement>
iOutputManager.println("        <statement>", true);
//ScriptWriter~~          UPDATE <!%aTableName!> SET <!%lAttributeList!> WHERE <!%lPrimary!>
iOutputManager.println("          UPDATE " + aTableName + " SET " + lAttributeList + " WHERE " + lPrimary + "", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <update>
iOutputManager.println("        <update>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.request">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.request\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>">
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      if (lPrimary.indexOf(<![$mic:attribute:name]!> + "=?") > -1) {
      if (lPrimary.indexOf(iSymbolTable.translateProperties("[$mic:attribute:name]") + "=?") > -1) {
      } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <value attribute="<![$mic:attribute:name]!>" />
iOutputManager.println("              <value attribute=\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\" />", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
    }
//ScriptWriter~~    <!$mic:primary!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).resetIterator();
//ScriptWriter~~    while (<!$mic:primary!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <value attribute="<![$mic:primary]!>" />
iOutputManager.println("              <value attribute=\"" + iSymbolTable.translateProperties("[$mic:primary]") + "\" />", true);
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
//ScriptWriter~~            </jeo>
iOutputManager.println("            </jeo>", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </update>
iOutputManager.println("        </update>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.reply">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.reply\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>"/>
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\"/>", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  </services>
iOutputManager.println("  </services>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


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

  public void generateReadService(String aPackage, String aViewName) {
    try {
    String lServiceBaseName = aViewName.substring(0,1).toUpperCase() + aViewName.substring(1);

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <services name="<!%aPackage!>.<!%aViewName!>Read">
iOutputManager.println("  <services name=\"" + aPackage + "." + aViewName + "Read\">", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <service name="read<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.service">
iOutputManager.println("    <service name=\"read" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.service\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement>
iOutputManager.println("        <statement>", true);
//ScriptWriter~~          SELECT * FROM <!%aViewName!>
iOutputManager.println("          SELECT * FROM " + aViewName + "", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.reply">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.reply\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aViewName!>" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aViewName + "\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
//ScriptWriter~~  </services>
iOutputManager.println("  </services>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


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
}
