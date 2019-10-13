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
public class GenerateJeo extends com.esarks.mic.Component  {

private boolean iCreateJeo = false;

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected GenerateJeo() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public GenerateJeo(Script aScript) {

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

    iCreateJeo = false;

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
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateJeo") + ".script");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(lPackage + "." + aTable) + ".script");
      File lCrudFile = new File(path(lPackage + "." + aTable) + "Crud_Crud.xml");
      if (lNewFile.exists() && lCrudFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          ((lGeneratorFile.exists() && lNewFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) || !lGeneratorFile.exists())) {
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
        return;
      }
    }

//ScriptWriter~~    <!$mic:createTable!>!set("true");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:createTable")).set("true");
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).remove();
    readTableXml(aXmlDefinition, lPackage, aTable);
    if (checkExit()) return;
    generateTableJeo(aXmlDefinition, lPackage, aTable);
    closeOutput();
    if (checkExit()) return;
    prepareMerge();
    Merge.getInstance().doMerge(path(lPackage + "." + aTable) + ".script", path(lPackage + "." + aTable) + ".new", iScript.getMasterScript());
    if (Merge.getInstance().getExceptionMessage() != null) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(Merge.getInstance().getExceptionMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(Merge.getInstance().getExceptionMessage());
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

    if (openOutput(path(lPackage + "." + aTable) + "Crud_Crud.new")) {
      generateCrudService(lPackage, aTable);
      closeOutput();

      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:merge:sectionMarker!>!reset("<!--$Section=");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:sectionMarker")).reset("<!--$Section=");
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
//ScriptWriter~~      <!$jac:merge:comments!>!reset("<!--");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:comments")).reset("<!--");
//ScriptWriter~~      <!$jac:merge:excludeCompare!>!reset("<!--  Generated at");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:excludeCompare")).reset("<!--  Generated at");
//ScriptWriter~~      <!$jac:merge:trimOutput!>!reset("yes");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:trimOutput")).reset("yes");
//ScriptWriter~~      <!$jac:merge:keepSections!>!reset("no");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepSections")).reset("no");
      restoreContext();

      Merge.getInstance().doMerge(path(lPackage + "." + aTable) + "Crud_Crud.xml", path(lPackage + "." + aTable) + "Crud_Crud.new", iScript.getMasterScript());
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(lPackage + "." + aTable) + "Crud_Crud.xml output file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(lPackage + "." + aTable) + "Crud_Crud.xml output file.");
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

    iCreateJeo = false;

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
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateJeo") + ".script");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(lPackage + "." + aView) + ".script");
      File lReadFile = new File(path(lPackage + "." + aView) + "Read_Crud.xml");
      if (lNewFile.exists() && lReadFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          ((lGeneratorFile.exists() && lNewFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) || !lGeneratorFile.exists())) {
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
        return;
      }
    }
    
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).remove();
    readViewXml(aXmlDefinition, lPackage, aView);
    if (checkExit()) return;
    generateViewJeo(aXmlDefinition, lPackage, aView);
    closeOutput();
    if (checkExit()) return;
    prepareMerge();
    Merge.getInstance().doMerge(path(lPackage + "." + aView) + ".script", path(lPackage + "." + aView) + ".new", iScript.getMasterScript());
    if (Merge.getInstance().getExceptionMessage() != null) {
      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:event!>!set(Merge.getInstance().getExceptionMessage());
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set(Merge.getInstance().getExceptionMessage());
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

    if (openOutput(path(lPackage + "." + aView) + "Read_Crud.new")) {
      generateReadService(lPackage, aView);
      closeOutput();

      setContext(iScript.getMasterScript());
//ScriptWriter~~      <!$jac:merge:sectionMarker!>!reset("<!--$Section=");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:sectionMarker")).reset("<!--$Section=");
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
//ScriptWriter~~      <!$jac:merge:comments!>!reset("<!--");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:comments")).reset("<!--");
//ScriptWriter~~      <!$jac:merge:excludeCompare!>!reset("<!--  Generated at");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:excludeCompare")).reset("<!--  Generated at");
//ScriptWriter~~      <!$jac:merge:trimOutput!>!reset("yes");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:trimOutput")).reset("yes");
//ScriptWriter~~      <!$jac:merge:keepSections!>!reset("no");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepSections")).reset("no");
      restoreContext();

      Merge.getInstance().doMerge(path(lPackage + "." + aView) + "Read_Crud.xml", path(lPackage + "." + aView) + "Read_Crud.new", iScript.getMasterScript());
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(lPackage + "." + aView) + "Read_Crud.xml output file.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(lPackage + "." + aView) + "Read_Crud.xml output file.");
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
//ScriptWriter~~    %>createJeo: XML=<!%aXmlDefinition!> Jeo=<!%aJeo!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("createJeo: XML=" + aXmlDefinition + " Jeo=" + aJeo + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iCreateJeo = true;

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
      File lGeneratorFile = new File(path("com.esarks.jac.generators.GenerateJeo") + ".script");
      File lXmlFile = new File(path(aXmlDefinition) + ".xml");
      File lNewFile = new File(path(lPackage + "." + aJeo) + ".script");
      if (lNewFile.exists() && lXmlFile.exists() && lNewFile.lastModified() >= lXmlFile.lastModified() &&
          ((lGeneratorFile.exists() && lNewFile.exists() && lGeneratorFile.lastModified() <= lNewFile.lastModified()) || !lGeneratorFile.exists())) {
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
        return;
      }
    }
    
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).remove();
    readJeoXml(aXmlDefinition, lPackage, aJeo);
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
  
  private void readTableXml(String aXmlDefinition, String aPackage, String aTable) {
    try {
    if (!openOutput(path(aPackage + "." + aTable) + ".new")) {
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(aPackage + "." + aTable) + ".new file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(aPackage + "." + aTable) + ".new file for output.");
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
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).remove();
    parseXmlDefinition(aXmlDefinition);
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
      return;
    }
    return;
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

  private void readViewXml(String aXmlDefinition, String aPackage, String aView) {
    try {
    if (!openOutput(path(aPackage + "." + aView) + ".new")) {
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(aPackage + "." + aView) + ".new file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(aPackage + "." + aView) + ".new file for output.");
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
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).remove();
    parseXmlDefinition(aXmlDefinition);
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
      return;
    }
    return;
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
    
  private void readJeoXml(String aXmlDefinition, String aPackage, String aJeo) {
    try {
    if (!openOutput(path(aPackage + "." + aJeo) + ".new")) {
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
//ScriptWriter~~      <!$jac:event!>!set("Failed to open " + path(aPackage + "." + aJeo) + ".new file for output.");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Failed to open " + path(aPackage + "." + aJeo) + ".new file for output.");
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
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).size() == 0) {
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
      return;
    }
    return;
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
//ScriptWriter~~    <!$mic:set!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set")).remove();
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table")).resetIterator();
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root!>!scan("table:name", aTable) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).scan("table:name", aTable) == false) {
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
    String lExtends = "com.esarks.jac.Jeo";
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root:table:extends!>!size() != 0) lExtends = <![com.esarks.arm.schemas.ddl.root:table:extends]!>;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:extends")).size() != 0) lExtends = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:extends]");
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table:field!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:field")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:table:field!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:field")).next()) {
//ScriptWriter~~      <!$mic:attribute!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:name]"));
//ScriptWriter~~      <!$mic:attribute:name!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:name]"));
//ScriptWriter~~      <!$mic:attribute:mapTo!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:mapTo")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:name]"));
//ScriptWriter~~      <!$mic:attribute:type!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:type]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:type]"));
//ScriptWriter~~      <!$mic:attribute:stereotype!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:stereotype]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:stereotype")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:stereotype]"));
//ScriptWriter~~      <!$mic:attribute:asDate!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:asDate]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:asDate")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:asDate]"));
//ScriptWriter~~      <!$mic:attribute:size!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:size]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:size]"));
//ScriptWriter~~      <!$mic:attribute:nullable!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:nullable]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:nullable]"));
//ScriptWriter~~      <!$mic:attribute:identity!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:identity]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:identity")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:identity]"));
//ScriptWriter~~      <!$mic:attribute:table!>!set(<![com.esarks.arm.schemas.ddl.root:table:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:table")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:name]"));
    }
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root:table:primary!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:primary")).size() > 0) {
//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:primary:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:primary:field")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:table:primary:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:primary:field")).next()) {
//ScriptWriter~~        <!$mic:primary!>!set(<![com.esarks.arm.schemas.ddl.root:table:primary:field]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:primary:field]"));
      }
    } else {
//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:index!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:index")).resetIterator();
//ScriptWriter~~      if (<![com.esarks.arm.schemas.ddl.root:table:index:type]!>.toLowerCase().startsWith("unique")) {
      if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:type]").toLowerCase().startsWith("unique")) {
//ScriptWriter~~        <!com.esarks.arm.schemas.ddl.root:table:index:field!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:index:field")).resetIterator();
//ScriptWriter~~        while (<!com.esarks.arm.schemas.ddl.root:table:index:field!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:index:field")).next()) {
//ScriptWriter~~          <!$mic:primary!>!set(<![com.esarks.arm.schemas.ddl.root:table:index:field]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:primary")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:index:field]"));
        }
      }
    }

//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:table:set!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:set")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:table:set!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:set")).next()) {
//ScriptWriter~~      <!$mic:set!>!set(<![com.esarks.arm.schemas.ddl.root:table:set:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:set:name]"));
//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:table:set:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:set:field")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:table:set:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:set:field")).next()) {
//ScriptWriter~~        <!$mic:set:field!>!set(<![com.esarks.arm.schemas.ddl.root:table:set:field]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set:field")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:set:field]"));
//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:table:set:field:clause!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:set:field:clause")).size() > 0) {
//ScriptWriter~~          <!$mic:set:field:clause!>!set(<![com.esarks.arm.schemas.ddl.root:table:set:field:clause]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set:field:clause")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:set:field:clause]"));
        }
      }
    }
    generateAttributes(aXmlDefinition, aPackageName, aTable, lExtends);
  }

  public void generateViewJeo(String aXmlDefinition, String aPackageName, String aView) {
    try {
//ScriptWriter~~    <!$mic:attribute!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).remove();
//ScriptWriter~~    <!$mic:table!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table")).remove();
//ScriptWriter~~    <!$mic:sql!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sql")).remove();
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:view!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view")).resetIterator();
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root!>!scan("view:name", aView) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).scan("view:name", aView) == false) {
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

    String lExtends = "com.esarks.jac.Jeo";
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root:view:extends!>!size() != 0) lExtends = <![com.esarks.arm.schemas.ddl.root:view:extends]!>;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:extends")).size() != 0) lExtends = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:extends]");

//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:view:table!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:view:table!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table")).next()) {

      Jeo lJeoInstance = null;
      String lJeoClassName = "";

      try {
//ScriptWriter~~        if (!<![com.esarks.arm.schemas.ddl.root:view:table:in]!>.equals("")) {
        if (!iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:in]").equals("")) {
//ScriptWriter~~          lJeoClassName = <![com.esarks.arm.schemas.ddl.root:view:table:in]!> + "." + <![com.esarks.arm.schemas.ddl.root:view:table:name]!>;
          lJeoClassName = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:in]") + "." + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]");
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

      DbConnectionFactory lDbConnectionFactory = DbConnectionFactory.getInstance();
//ScriptWriter~~      DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(<![com.esarks.arm.schemas.ddl.root:view:table:name]!>.toLowerCase());
      DbConnection lDbConnection = lDbConnectionFactory.getAssociatedDbConnection(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]").toLowerCase());

//ScriptWriter~~      String lTableName = <![com.esarks.arm.schemas.ddl.root:view:table:name]!>;
      String lTableName = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]");

      for(int lIdx=lTableName.length(); lIdx > 0; lIdx--) {
        if (lTableName.charAt(lIdx-1) == '.') {
          lTableName = lTableName.substring(lIdx);
          break;
        }
      }

      if (lDbConnection.getMake()) lDbConnection.getColumns(iScript, lTableName);
//ScriptWriter~~      <!$mic:table!>!set(lTableName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table")).set(lTableName);
//ScriptWriter~~      <!$mic:table:in!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:in]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:table:in")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:in]"));
      
      boolean lHasName = false;
      String lNameView = "hrmConcatName";
      ArrayList lTypeNameList = new ArrayList();
//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:view:table:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:view:table:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column")).next()) {

//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:view:table:column:isName!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column:isName")).size() > 0) {
          lHasName = true;
//ScriptWriter~~          if (<!com.esarks.arm.schemas.ddl.root:view:table:column:nameView!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column:nameView")).size() > 0) {
//ScriptWriter~~            lNameView = <![com.esarks.arm.schemas.ddl.root:view:table:column:nameView]!>;
            lNameView = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:nameView]");
          }
        }
        
//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root:view:table:column:isType!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column:isType")).size() > 0) {
//ScriptWriter~~          lTypeNameList.add(<![com.esarks.arm.schemas.ddl.root:view:table:column:name]!> + "Name");
          lTypeNameList.add(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]") + "Name");
        }
        
//ScriptWriter~~        <!$mic:attribute!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]"));
//ScriptWriter~~        <!$mic:attribute:table!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:table")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]"));

//ScriptWriter~~        if (<![com.esarks.arm.schemas.ddl.root:view:table:column:view]!>.equals("")) {
        if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:view]").equals("")) {
//ScriptWriter~~          <!$mic:attribute:name!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]"));
        } else {
//ScriptWriter~~          <!$mic:attribute:name!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:column:view]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:view]"));
        }

        String lValueType = "";
        String lValueStereotype = "";
        if (lJeoInstance != null) {
//ScriptWriter~~          lValueType = lJeoInstance.getTypeByName(<![$mic:attribute]!>);
          lValueType = lJeoInstance.getTypeByName(iSymbolTable.translateProperties("[$mic:attribute]"));
//ScriptWriter~~          lValueStereotype = lJeoInstance.getStereotypeByName(<![$mic:attribute]!>);
          lValueStereotype = lJeoInstance.getStereotypeByName(iSymbolTable.translateProperties("[$mic:attribute]"));
        }
//ScriptWriter~~        if ((lValueType == null || lValueType.equals("")) && (!<![com.esarks.arm.schemas.ddl.root:view:table:column:isColumn]!>.equals("false"))) {
        if ((lValueType == null || lValueType.equals("")) && (!iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:isColumn]").equals("false"))) {
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

//ScriptWriter~~        if (<![com.esarks.arm.schemas.ddl.root:view:table:column:isColumn]!>.equals("false")) {
        if (iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:isColumn]").equals("false")) {
//ScriptWriter~~          <!$mic:attribute:type!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:column:type]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:type]"));
//ScriptWriter~~          <!$mic:attribute:stereotype!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:column:stereotype]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:stereotype")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:stereotype]"));
//ScriptWriter~~          <!$mic:attribute:size!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:column:size]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:size]"));
//ScriptWriter~~          <!$mic:attribute:nullable!>!set("true");
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set("true");
        } else {
//ScriptWriter~~          <!$mic:attribute:mapTo!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:mapTo")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]"));
          if (lDbConnection.getMake()) {
//ScriptWriter~~            <!$jac:DbMetaData:Table:" + lTableName + ":Column!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:DbMetaData:Table:" + lTableName + ":Column")).resetIterator();
//ScriptWriter~~            if (!<!$jac:DbMetaData:Table:" + lTableName + "!>!scan("Column", <![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>.toLowerCase())) {
            if (!iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:DbMetaData:Table:" + lTableName + "")).scan("Column", iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]").toLowerCase())) {
              setContext(iScript.getMasterScript());
//ScriptWriter~~              <!$jac:event!>!set("Non-fatal error: Cannot find column (" + <![com.esarks.arm.schemas.ddl.root:view:table:column:name]!> + ") in table (" + lTableName + ") definition.");
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event")).set("Non-fatal error: Cannot find column (" + iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]") + ") in table (" + lTableName + ") definition.");
//ScriptWriter~~              <!$jac:event:severity!>!set("error");
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:severity")).set("error");
//ScriptWriter~~              <!$jac:event:scriptPackage!>!set(iScriptPackage);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
//ScriptWriter~~              <!$jac:event:scriptName!>!set(iScriptName);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
              restoreContext();
              continue;
            }
          }
          if (lValueType == null) {
//ScriptWriter~~            <!$mic:attribute:type!>!set(<![$jac:DbMetaData:Table:" + lTableName + ":Column:Type]!>);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[$jac:DbMetaData:Table:" + lTableName + ":Column:Type]"));
//ScriptWriter~~            <!$mic:attribute:size!>!set(<![$jac:DbMetaData:Table:" + lTableName + ":Column:Size]!>);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[$jac:DbMetaData:Table:" + lTableName + ":Column:Size]"));
          } else {
//ScriptWriter~~            <!$mic:attribute:type!>!set(lValueType);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(lValueType);
//ScriptWriter~~            <!$mic:attribute:stereotype!>!set(lValueStereotype);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:stereotype")).set(lValueStereotype);
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
//ScriptWriter~~        if (!<![com.esarks.arm.schemas.ddl.root:view:table:column:isColumn]!>.equals("false")) {
        if (!iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:isColumn]").equals("false")) {
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
//ScriptWriter~~        <!$mic:attribute:table!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:table")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]"));
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
//ScriptWriter~~        <!$mic:attribute:table!>!set(<![com.esarks.arm.schemas.ddl.root:view:table:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:table")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]"));
//ScriptWriter~~        <!$mic:attribute:name!>!set((String) lTypeNameList.get(lTypeNameListIdx));
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set((String) lTypeNameList.get(lTypeNameListIdx));
//ScriptWriter~~        <!$mic:attribute:type!>!set("string");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set("string");
//ScriptWriter~~        <!$mic:attribute:size!>!set("0");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set("0");
//ScriptWriter~~        <!$mic:attribute:nullable!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set("true");
      }
      
//ScriptWriter~~      <!com.esarks.arm.schemas.ddl.root:view:sql!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:sql")).resetIterator();
//ScriptWriter~~      while (<!com.esarks.arm.schemas.ddl.root:view:sql!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:sql")).next()) {
//ScriptWriter~~        <!$mic:sql!>!set(<![com.esarks.arm.schemas.ddl.root:view:sql:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sql")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:sql:name]"));
//ScriptWriter~~        <!$mic:sql:sqlText!>!set(<![com.esarks.arm.schemas.ddl.root:view:sql:sqlText]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:sql:sqlText")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:sql:sqlText]"));
      }

      if (false) {
//ScriptWriter~~        <!com.esarks.arm.schemas.ddl.root!>!remove();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).remove();
//ScriptWriter~~        parseXmlDefinition(<![com.esarks.arm.schemas.ddl.root:view:table:in]!>);
        parseXmlDefinition(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:in]"));
//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root!>!size() == 0) continue;
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).size() == 0) continue;
//ScriptWriter~~        <!com.esarks.arm.schemas.ddl.root:table!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table")).resetIterator();
//ScriptWriter~~        if (<!com.esarks.arm.schemas.ddl.root!>!scan("table:name", <![com.esarks.arm.schemas.ddl.root:view:table:name]!>) == false) continue;
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).scan("table:name", iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:name]")) == false) continue;

//ScriptWriter~~        <!com.esarks.arm.schemas.ddl.root:view:table:column!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column")).resetIterator();
//ScriptWriter~~        while (<!com.esarks.arm.schemas.ddl.root:view:table:column!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:view:table:column")).next()) {
//ScriptWriter~~          <!com.esarks.arm.schemas.ddl.root:table:field!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table:field")).resetIterator();
//ScriptWriter~~          if (<!com.esarks.arm.schemas.ddl.root:table!>!scan("field:name", <![com.esarks.arm.schemas.ddl.root:view:table:column:name]!>) == false) continue;
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:table")).scan("field:name", iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:view:table:column:name]")) == false) continue;
//ScriptWriter~~          <!$mic:attribute!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:name]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:name]"));      
//ScriptWriter~~          <!$mic:attribute:name!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:name]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:name]"));      
//ScriptWriter~~          <!$mic:attribute:type!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:type]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:type]"));      
//ScriptWriter~~          <!$mic:attribute:size!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:size]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:size]"));      
//ScriptWriter~~          <!$mic:attribute:nullable!>!set(<![com.esarks.arm.schemas.ddl.root:table:field:nullable]!>);      
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:table:field:nullable]"));      
        }
      }
    }
    generateAttributes(aXmlDefinition, aPackageName, aView, lExtends);
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
//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:jeo!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:jeo")).resetIterator();
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root!>!scan("jeo:name", aJeo) == false) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root")).scan("jeo:name", aJeo) == false) {
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

    String lExtends = "com.esarks.jac.Jeo";
//ScriptWriter~~    if (<!com.esarks.arm.schemas.ddl.root:jeo:extends!>!size() != 0) lExtends = <![com.esarks.arm.schemas.ddl.root:jeo:extends]!>;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:jeo:extends")).size() != 0) lExtends = iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:jeo:extends]");

//ScriptWriter~~    <!com.esarks.arm.schemas.ddl.root:jeo:field!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:jeo:field")).resetIterator();
//ScriptWriter~~    while (<!com.esarks.arm.schemas.ddl.root:jeo:field!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:jeo:field")).next()) {
//ScriptWriter~~      <!$mic:attribute!>!set(<![com.esarks.arm.schemas.ddl.root:jeo:field:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:jeo:field:name]"));
//ScriptWriter~~      <!$mic:attribute:name!>!set(<![com.esarks.arm.schemas.ddl.root:jeo:field:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:name")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:jeo:field:name]"));
//ScriptWriter~~      <!$mic:attribute:mapTo!>!set(<![com.esarks.arm.schemas.ddl.root:jeo:field:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:mapTo")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:jeo:field:name]"));
//ScriptWriter~~      <!$mic:attribute:type!>!set(<![com.esarks.arm.schemas.ddl.root:jeo:field:type]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:type")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:jeo:field:type]"));
//ScriptWriter~~      <!$mic:attribute:class!>!set(<![com.esarks.arm.schemas.ddl.root:jeo:field:class]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:class")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:jeo:field:class]"));
//ScriptWriter~~      if (<!com.esarks.arm.schemas.ddl.root:jeo:field:size!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:jeo:field:size")).size() > 0) {
//ScriptWriter~~        <!$mic:attribute:size!>!set(<![com.esarks.arm.schemas.ddl.root:jeo:field:size]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:jeo:field:size]"));
      } else {
//ScriptWriter~~        <!$mic:attribute:size!>!set("0");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:size")).set("0");
      }
//ScriptWriter~~      if (<!com.esarks.arm.schemas.ddl.root:jeo:field:nullable!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("com.esarks.arm.schemas.ddl.root:jeo:field:nullable")).size() > 0) {
//ScriptWriter~~        <!$mic:attribute:nullable!>!set(<![com.esarks.arm.schemas.ddl.root:jeo:field:nullable]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set(iSymbolTable.translateProperties("[com.esarks.arm.schemas.ddl.root:jeo:field:nullable]"));
      } else {
//ScriptWriter~~        <!$mic:attribute:nullable!>!set("true");
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:nullable")).set("true");
      }
    }

    generateAttributes(aXmlDefinition, aPackageName, aJeo, lExtends);

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

  public void generateAttributes(String aXmlDefinition, String aPackageName, String aClass, String aExtends) {
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
//ScriptWriter~~public class <!%aClass!> extends <!%aExtends!> {
iOutputManager.println("public class " + aClass + " extends " + aExtends + " {", true);
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
//ScriptWriter~~      iInstanceName = "<!%aPackageName!>.<!%aClass!>";
iOutputManager.println("      iInstanceName = \"" + aPackageName + "." + aClass + "\";", true);
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
//ScriptWriter~~    public <!%aClass!>( com.esarks.jac.JeoFactory aJeoFactory ) {
iOutputManager.println("    public " + aClass + "( com.esarks.jac.JeoFactory aJeoFactory ) {", true);
//ScriptWriter~~      iInstanceName = "<!%aPackageName!>.<!%aClass!>";
iOutputManager.println("      iInstanceName = \"" + aPackageName + "." + aClass + "\";", true);
//ScriptWriter~~//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=yes
iOutputManager.println("//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=yes", true);
//ScriptWriter~~//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=no
iOutputManager.println("//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=no", true);
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
//ScriptWriter~~      super("", aScript);
iOutputManager.println("      super(\"\", aScript);", true);
//ScriptWriter~~      iInstanceName = "<!%aPackageName!>.<!%aClass!>";
iOutputManager.println("      iInstanceName = \"" + aPackageName + "." + aClass + "\";", true);
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
//ScriptWriter~~      iInstanceName = "<!%aPackageName!>.<!%aClass!>";
iOutputManager.println("      iInstanceName = \"" + aPackageName + "." + aClass + "\";", true);
//ScriptWriter~~      iJeoTypeName = aTypeName;
iOutputManager.println("      iJeoTypeName = aTypeName;", true);
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
//ScriptWriter~~      super("", aScript);
iOutputManager.println("      super(\"\", aScript);", true);
//ScriptWriter~~      iInstanceName = "<!%aPackageName!>.<!%aClass!>";
iOutputManager.println("      iInstanceName = \"" + aPackageName + "." + aClass + "\";", true);
//ScriptWriter~~      iJeoTypeName = aTypeName;
iOutputManager.println("      iJeoTypeName = aTypeName;", true);
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
//ScriptWriter~~    public void init() {
iOutputManager.println("    public void init() {", true);
//ScriptWriter~~    	super.init();
iOutputManager.println("    	super.init();", true);
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
//ScriptWriter~~//<![cap@[$mic:attribute:name]]!>
iOutputManager.println("//" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "", true);
//ScriptWriter~~    i<![cap@[$mic:attribute:name]]!> = new PropertyValue();
iOutputManager.println("    i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + " = new PropertyValue();", true);
//ScriptWriter~~    i<![cap@[$mic:attribute:name]]!>Update = false;
iOutputManager.println("    i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Update = false;", true);
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
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//  <![$mic:table:in]!>.<![$mic:table]!> l<![cap@[$mic:table]]!> = (<![$mic:table:in]!>.<![$mic:table]!>) com.esarks.jac.JeoFactory.getInstance(iScript).reserveJeo("<![$mic:table:in]!>.<![$mic:table]!>");
iOutputManager.println("//  " + iSymbolTable.translateProperties("[$mic:table:in]") + "." + iSymbolTable.translateProperties("[$mic:table]") + " l" + iSymbolTable.translateProperties("[cap@[$mic:table]]") + " = (" + iSymbolTable.translateProperties("[$mic:table:in]") + "." + iSymbolTable.translateProperties("[$mic:table]") + ") com.esarks.jac.JeoFactory.getInstance(iScript).reserveJeo(\"" + iSymbolTable.translateProperties("[$mic:table:in]") + "." + iSymbolTable.translateProperties("[$mic:table]") + "\");", true);
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
//ScriptWriter~~    l<![cap@[$mic:table]]!>.set<![cap@[$mic:table:attribute:mapTo]]!>(get<![cap@[$mic:table:attribute:name]]!>PropertyValue());
iOutputManager.println("    l" + iSymbolTable.translateProperties("[cap@[$mic:table]]") + ".set" + iSymbolTable.translateProperties("[cap@[$mic:table:attribute:mapTo]]") + "(get" + iSymbolTable.translateProperties("[cap@[$mic:table:attribute:name]]") + "PropertyValue());", true);
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

    if (!iCreateJeo) {
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
iOutputManager.println("", true);
//ScriptWriter~~  public void mapFromResultSetTable( String aTable, ResultSet aResultSet, boolean aTrim, boolean aSpacesToNull) {
iOutputManager.println("  public void mapFromResultSetTable( String aTable, ResultSet aResultSet, boolean aTrim, boolean aSpacesToNull) {", true);
//ScriptWriter~~    // DEPRECATED METHOD!!!!
iOutputManager.println("    // DEPRECATED METHOD!!!!", true);
//ScriptWriter~~    // Use of Trim and SpacesToNull is not functional.
iOutputManager.println("    // Use of Trim and SpacesToNull is not functional.", true);
//ScriptWriter~~    mapFromResultSetTable(aTable, aResultSet);
iOutputManager.println("    mapFromResultSetTable(aTable, aResultSet);", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~  
iOutputManager.println("  ", true);
//ScriptWriter~~  public void mapFromResultSetTable( String aTable, ResultSet aResultSet) {
iOutputManager.println("  public void mapFromResultSetTable( String aTable, ResultSet aResultSet) {", true);
//ScriptWriter~~//$Section=Operation$mapFromResultSetTable$Preserve=no
iOutputManager.println("//$Section=Operation$mapFromResultSetTable$Preserve=no", true);
//ScriptWriter~~//    String lValue = null;
iOutputManager.println("//    String lValue = null;", true);
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
//ScriptWriter~~        String lJavaType = getProperty("dbTypes:" + <![$mic:attribute:type]!> + ":java");
        String lJavaType = getProperty("dbTypes:" + iSymbolTable.translateProperties("[$mic:attribute:type]") + ":java");
//ScriptWriter~~        String lJdbcType = getProperty("dbTypes:" + <![$mic:attribute:type]!> + ":jdbc");
        String lJdbcType = getProperty("dbTypes:" + iSymbolTable.translateProperties("[$mic:attribute:type]") + ":jdbc");
        
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// <![cap@[$mic:attribute:name]]!> in <![$mic:attribute:table]!>
iOutputManager.println("// " + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + " in " + iSymbolTable.translateProperties("[$mic:attribute:table]") + "", true);
//ScriptWriter~~        try {
iOutputManager.println("        try {", true);
//ScriptWriter~~          <!%lJavaType!> lValue = aResultSet.get<!%lJdbcType!>("<![$mic:attribute:name]!>");
iOutputManager.println("          " + lJavaType + " lValue = aResultSet.get" + lJdbcType + "(\"" + iSymbolTable.translateProperties("[$mic:attribute:name]") + "\");", true);
//ScriptWriter~~          if (aResultSet.wasNull()) {
iOutputManager.println("          if (aResultSet.wasNull()) {", true);
//ScriptWriter~~            set<![cap@[$mic:attribute:name]]!>Null();
iOutputManager.println("            set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null();", true);
//ScriptWriter~~          } else {
iOutputManager.println("          } else {", true);
//ScriptWriter~~            set<![cap@[$mic:attribute:name]]!>(lValue);
iOutputManager.println("            set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(lValue);", true);
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
//ScriptWriter~~// This section is for the get by string name related methods.
iOutputManager.println("// This section is for the get by string name related methods.", true);
//ScriptWriter~~//----------------------------------------------------------------------------
iOutputManager.println("//----------------------------------------------------------------------------", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public String getCasedName ( String aAttributeName) {
iOutputManager.println("  public String getCasedName ( String aAttributeName) {", true);
//ScriptWriter~~//$Section=Operation$getCasedName$Preserve=no
iOutputManager.println("//$Section=Operation$getCasedName$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    try {
iOutputManager.println("    try {", true);
//ScriptWriter~~        Method lMethod = this.getClass().getMethod("getAttributeName_" + aAttributeName.toLowerCase(), null);
iOutputManager.println("        Method lMethod = this.getClass().getMethod(\"getAttributeName_\" + aAttributeName.toLowerCase(), null);", true);
//ScriptWriter~~        return (String) lMethod.invoke(this, null);
iOutputManager.println("        return (String) lMethod.invoke(this, null);", true);
//ScriptWriter~~    } catch (Throwable e) {
iOutputManager.println("    } catch (Throwable e) {", true);
//ScriptWriter~~        //System.out.println(e);
iOutputManager.println("        //System.out.println(e);", true);
//ScriptWriter~~        return null;
iOutputManager.println("        return null;", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Operation$getCasedName$Preserve=no
iOutputManager.println("//$Section=Operation$getCasedName$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public PropertyValue getPropertyValueByName ( String aAttributeName) {
iOutputManager.println("  public PropertyValue getPropertyValueByName ( String aAttributeName) {", true);
//ScriptWriter~~//$Section=Operation$getPropertyValueByName$Preserve=no
iOutputManager.println("//$Section=Operation$getPropertyValueByName$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    try {
iOutputManager.println("    try {", true);
//ScriptWriter~~        Method lMethod = this.getClass().getMethod("get" + getCasedName(aAttributeName) + "PropertyValue", null);
iOutputManager.println("        Method lMethod = this.getClass().getMethod(\"get\" + getCasedName(aAttributeName) + \"PropertyValue\", null);", true);
//ScriptWriter~~        return (PropertyValue) lMethod.invoke(this, null);
iOutputManager.println("        return (PropertyValue) lMethod.invoke(this, null);", true);
//ScriptWriter~~    } catch (Throwable e) {
iOutputManager.println("    } catch (Throwable e) {", true);
//ScriptWriter~~        //System.out.println(e);
iOutputManager.println("        //System.out.println(e);", true);
//ScriptWriter~~        return null;
iOutputManager.println("        return null;", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Operation$getPropertyValueByName$Preserve=no
iOutputManager.println("//$Section=Operation$getPropertyValueByName$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void setStringValueByName ( String aAttributeName, String aValue) {
iOutputManager.println("  public void setStringValueByName ( String aAttributeName, String aValue) {", true);
//ScriptWriter~~//$Section=Operation$setStringValueByName$Preserve=no
iOutputManager.println("//$Section=Operation$setStringValueByName$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    try {
iOutputManager.println("    try {", true);
//ScriptWriter~~        Class lClassParams[] = new Class[]{"".getClass()};
iOutputManager.println("        Class lClassParams[] = new Class[]{\"\".getClass()};", true);
//ScriptWriter~~        Object lArguments[] = new Object[] {aValue};
iOutputManager.println("        Object lArguments[] = new Object[] {aValue};", true);
//ScriptWriter~~        Method lMethod = this.getClass().getMethod("set" + getCasedName(aAttributeName), lClassParams);
iOutputManager.println("        Method lMethod = this.getClass().getMethod(\"set\" + getCasedName(aAttributeName), lClassParams);", true);
//ScriptWriter~~        lMethod.invoke(this, lArguments);
iOutputManager.println("        lMethod.invoke(this, lArguments);", true);
//ScriptWriter~~    } catch (Throwable e) {
iOutputManager.println("    } catch (Throwable e) {", true);
//ScriptWriter~~        //System.out.println(e);
iOutputManager.println("        //System.out.println(e);", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Operation$setStringValueByName$Preserve=no
iOutputManager.println("//$Section=Operation$setStringValueByName$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public String getTypeByName ( String aAttributeName) {
iOutputManager.println("  public String getTypeByName ( String aAttributeName) {", true);
//ScriptWriter~~//$Section=Operation$getTypeByName$Preserve=no
iOutputManager.println("//$Section=Operation$getTypeByName$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    try {
iOutputManager.println("    try {", true);
//ScriptWriter~~        Method lMethod = this.getClass().getMethod("get" + getCasedName(aAttributeName) + "ValueType", null);
iOutputManager.println("        Method lMethod = this.getClass().getMethod(\"get\" + getCasedName(aAttributeName) + \"ValueType\", null);", true);
//ScriptWriter~~        return (String) lMethod.invoke(this, null);
iOutputManager.println("        return (String) lMethod.invoke(this, null);", true);
//ScriptWriter~~    } catch (Throwable e) {
iOutputManager.println("    } catch (Throwable e) {", true);
//ScriptWriter~~        //System.out.println(e);
iOutputManager.println("        //System.out.println(e);", true);
//ScriptWriter~~        return null;
iOutputManager.println("        return null;", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Operation$getTypeByName$Preserve=no
iOutputManager.println("//$Section=Operation$getTypeByName$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public String getStereotypeByName ( String aAttributeName) {
iOutputManager.println("  public String getStereotypeByName ( String aAttributeName) {", true);
//ScriptWriter~~//$Section=Operation$getStereotypeByName$Preserve=no
iOutputManager.println("//$Section=Operation$getStereotypeByName$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    try {
iOutputManager.println("    try {", true);
//ScriptWriter~~        Method lMethod = this.getClass().getMethod("get" + getCasedName(aAttributeName) + "ValueStereotype", null);
iOutputManager.println("        Method lMethod = this.getClass().getMethod(\"get\" + getCasedName(aAttributeName) + \"ValueStereotype\", null);", true);
//ScriptWriter~~        return (String) lMethod.invoke(this, null);
iOutputManager.println("        return (String) lMethod.invoke(this, null);", true);
//ScriptWriter~~    } catch (Throwable e) {
iOutputManager.println("    } catch (Throwable e) {", true);
//ScriptWriter~~        //System.out.println(e);
iOutputManager.println("        //System.out.println(e);", true);
//ScriptWriter~~        return null;
iOutputManager.println("        return null;", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Operation$getStereotypeByName$Preserve=no
iOutputManager.println("//$Section=Operation$getStereotypeByName$Preserve=no", true);
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
//ScriptWriter~~  public String getXml ( ) {
iOutputManager.println("  public String getXml ( ) {", true);
//ScriptWriter~~//$Section=Operation$getXml$Preserve=no
iOutputManager.println("//$Section=Operation$getXml$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    StringBuffer lXml = new StringBuffer("<jeo name='<!%aPackageName!>.<!%aClass!>'>");
iOutputManager.println("    StringBuffer lXml = new StringBuffer(\"<jeo name='" + aPackageName + "." + aClass + "'>\");", true);
//ScriptWriter~~    String lCdataBegin = "<" + "!" + "[CDATA[";
iOutputManager.println("    String lCdataBegin = \"<\" + \"!\" + \"[CDATA[\";", true);
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
//ScriptWriter~~// Field: <![cap@[$mic:attribute:name]]!>
iOutputManager.println("// Field: " + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "", true);
//ScriptWriter~~    lXml.append("<field name='<![cap@[$mic:attribute:name]]!>' type='<![$mic:attribute:type]!>'>");
iOutputManager.println("    lXml.append(\"<field name='" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "' type='" + iSymbolTable.translateProperties("[$mic:attribute:type]") + "'>\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (<![$mic:attribute:type]!>.equals("string")) {
      if (iSymbolTable.translateProperties("[$mic:attribute:type]").equals("string")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    lXml.append(lCdataBegin).append(get<![cap@[$mic:attribute:name]]!>PropertyValue().toString()).append("]]>").append("</field>");
iOutputManager.println("    lXml.append(lCdataBegin).append(get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "PropertyValue().toString()).append(\"]]>\").append(\"</field>\");", true);
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
//ScriptWriter~~    lXml.append(get<![cap@[$mic:attribute:name]]!>PropertyValue().toString()).append("</field>");
iOutputManager.println("    lXml.append(get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "PropertyValue().toString()).append(\"</field>\");", true);
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
//ScriptWriter~~    lXml.append("</jeo>");
iOutputManager.println("    lXml.append(\"</jeo>\");", true);
//ScriptWriter~~    return lXml.toString();
iOutputManager.println("    return lXml.toString();", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=Operation$getXml$Preserve=no
iOutputManager.println("//$Section=Operation$getXml$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public boolean isJeoEqual ( Jeo aJeo) {
iOutputManager.println("  public boolean isJeoEqual ( Jeo aJeo) {", true);
//ScriptWriter~~//$Section=Operation$isJeoEqual$Preserve=no
iOutputManager.println("//$Section=Operation$isJeoEqual$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    PropertyValue lThisValue = null;
iOutputManager.println("    PropertyValue lThisValue = null;", true);
//ScriptWriter~~    PropertyValue lThatValue = null;
iOutputManager.println("    PropertyValue lThatValue = null;", true);
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
//ScriptWriter~~    lThisValue = this.getPropertyValueByName("<!%lLowerName!>");
iOutputManager.println("    lThisValue = this.getPropertyValueByName(\"" + lLowerName + "\");", true);
//ScriptWriter~~    lThatValue = aJeo.getPropertyValueByName("<!%lLowerName!>");
iOutputManager.println("    lThatValue = aJeo.getPropertyValueByName(\"" + lLowerName + "\");", true);
//ScriptWriter~~    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;
iOutputManager.println("    if (lThisValue.getValueType() != lThatValue.getValueType()) return false;", true);
//ScriptWriter~~    if (lThisValue.compareTo(lThatValue) != 0) return false;
iOutputManager.println("    if (lThisValue.compareTo(lThatValue) != 0) return false;", true);
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
//ScriptWriter~~    return true;
iOutputManager.println("    return true;", true);
//ScriptWriter~~//$Section=Operation$isJeoEqual$Preserve=no
iOutputManager.println("//$Section=Operation$isJeoEqual$Preserve=no", true);
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
      String lCastConvert = "";
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
//ScriptWriter~~      if (lType.equals("Object") && <!$mic:attribute:class!>!size() > 0) {
      if (lType.equals("Object") && iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute:class")).size() > 0) {
//ScriptWriter~~        lType = <![$mic:attribute:class]!>;
        lType = iSymbolTable.translateProperties("[$mic:attribute:class]");
        lCastConvert = "(" + lType + ")";
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
//ScriptWriter~~        return <!%lCastConvert!>i<![cap@[$mic:attribute:name]]!>.<!%lGetType!>();
iOutputManager.println("        return " + lCastConvert + "i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "." + lGetType + "();", true);
//ScriptWriter~~//$Section=Attribute get$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute get$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public <!%lType!> get<![cap@[$mic:attribute:name]]!>(<!%lType!> aValue) {
iOutputManager.println("    public " + lType + " get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(" + lType + " aValue) {", true);
//ScriptWriter~~//$Section=Attribute get$<![cap@[$mic:attribute:name]]!>(<!%lType!>)$Preserve=no
iOutputManager.println("//$Section=Attribute get$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(" + lType + ")$Preserve=no", true);
//ScriptWriter~~      if (is<![cap@[$mic:attribute:name]]!>Null()) return aValue;
iOutputManager.println("      if (is" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null()) return aValue;", true);
//ScriptWriter~~      return <!%lCastConvert!>i<![cap@[$mic:attribute:name]]!>.<!%lGetType!>();
iOutputManager.println("      return " + lCastConvert + "i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "." + lGetType + "();", true);
//ScriptWriter~~//$Section=Attribute get$<![cap@[$mic:attribute:name]]!>(<!%lType!>)$Preserve=no
iOutputManager.println("//$Section=Attribute get$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(" + lType + ")$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (<![$mic:attribute:type]!>.equals("string") && <![$mic:attribute:stereotype]!>.startsWith("date:")) {
      if (iSymbolTable.translateProperties("[$mic:attribute:type]").equals("string") && iSymbolTable.translateProperties("[$mic:attribute:stereotype]").startsWith("date:")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    public java.util.Date get<![cap@[$mic:attribute:name]]!>AsDate() {
iOutputManager.println("    public java.util.Date get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate() {", true);
//ScriptWriter~~//$Section=Attribute get$<![cap@[$mic:attribute:name]]!>AsDate$Preserve=no
iOutputManager.println("//$Section=Attribute get$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate$Preserve=no", true);
//ScriptWriter~~      try {
iOutputManager.println("      try {", true);
//ScriptWriter~~        PropertyValue lDateValue = new PropertyValue("<![$mic:attribute:stereotype]!>", i<![cap@[$mic:attribute:name]]!>.getValueString());
iOutputManager.println("        PropertyValue lDateValue = new PropertyValue(\"" + iSymbolTable.translateProperties("[$mic:attribute:stereotype]") + "\", i" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + ".getValueString());", true);
//ScriptWriter~~        return lDateValue.getValueDate();
iOutputManager.println("        return lDateValue.getValueDate();", true);
//ScriptWriter~~      } catch (Throwable e) {
iOutputManager.println("      } catch (Throwable e) {", true);
//ScriptWriter~~        throw new RuntimeException("Date conversion failed.");
iOutputManager.println("        throw new RuntimeException(\"Date conversion failed.\");", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~//$Section=Attribute get$<![cap@[$mic:attribute:name]]!>AsDate$Preserve=no
iOutputManager.println("//$Section=Attribute get$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public java.util.Date get<![cap@[$mic:attribute:name]]!>AsDate(java.util.Date aValue) {
iOutputManager.println("    public java.util.Date get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate(java.util.Date aValue) {", true);
//ScriptWriter~~//$Section=Attribute get$<![cap@[$mic:attribute:name]]!>AsDate(java.util.Date)$Preserve=no
iOutputManager.println("//$Section=Attribute get$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate(java.util.Date)$Preserve=no", true);
//ScriptWriter~~      if (is<![cap@[$mic:attribute:name]]!>Null()) return aValue;
iOutputManager.println("      if (is" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "Null()) return aValue;", true);
//ScriptWriter~~      return get<![cap@[$mic:attribute:name]]!>AsDate();
iOutputManager.println("      return get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate();", true);
//ScriptWriter~~//$Section=Attribute get$<![cap@[$mic:attribute:name]]!>AsDate(java.util.Date)$Preserve=no
iOutputManager.println("//$Section=Attribute get$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate(java.util.Date)$Preserve=no", true);
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
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (<![$mic:attribute:type]!>.equals("string") && <![$mic:attribute:stereotype]!>.startsWith("date:")) {
      if (iSymbolTable.translateProperties("[$mic:attribute:type]").equals("string") && iSymbolTable.translateProperties("[$mic:attribute:stereotype]").startsWith("date:")) {
//ScriptWriter~~        String lAsDateFormat = <![$mic:attribute:stereotype]!>.substring(5);
        String lAsDateFormat = iSymbolTable.translateProperties("[$mic:attribute:stereotype]").substring(5);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    public void set<![cap@[$mic:attribute:name]]!>AsDate(java.util.Date aValue) {
iOutputManager.println("    public void set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate(java.util.Date aValue) {", true);
//ScriptWriter~~//$Section=Attribute set$<![cap@[$mic:attribute:name]]!>AsDate$Preserve=no
iOutputManager.println("//$Section=Attribute set$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate$Preserve=no", true);
//ScriptWriter~~        PropertyValue lDateValue = new PropertyValue(aValue);
iOutputManager.println("        PropertyValue lDateValue = new PropertyValue(aValue);", true);
//ScriptWriter~~        set<![cap@[$mic:attribute:name]]!>(lDateValue.toDateString("<!%lAsDateFormat!>"));
iOutputManager.println("        set" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "(lDateValue.toDateString(\"" + lAsDateFormat + "\"));", true);
//ScriptWriter~~//$Section=Attribute set$<![cap@[$mic:attribute:name]]!>AsDate$Preserve=no
iOutputManager.println("//$Section=Attribute set$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "AsDate$Preserve=no", true);
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

//ScriptWriter~~  String lAllLower = <![$mic:attribute:name]!>.toLowerCase();
  String lAllLower = iSymbolTable.translateProperties("[$mic:attribute:name]").toLowerCase();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    public String getAttributeName_<!%lAllLower!>() {
iOutputManager.println("    public String getAttributeName_" + lAllLower + "() {", true);
//ScriptWriter~~//$Section=Attribute getAttributeName$<!%lAllLower!>$Preserve=no
iOutputManager.println("//$Section=Attribute getAttributeName$" + lAllLower + "$Preserve=no", true);
//ScriptWriter~~        return "<![cap@[$mic:attribute:name]]!>";
iOutputManager.println("        return \"" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "\";", true);
//ScriptWriter~~//$Section=Attribute getAttributeName_$<!%lAllLower!>$Preserve=no
iOutputManager.println("//$Section=Attribute getAttributeName_$" + lAllLower + "$Preserve=no", true);
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
//ScriptWriter~~    public String get<![cap@[$mic:attribute:name]]!>ValueType() {
iOutputManager.println("    public String get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "ValueType() {", true);
//ScriptWriter~~//$Section=Attribute getValueType$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute getValueType$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        return "<![$mic:attribute:type]!>";
iOutputManager.println("        return \"" + iSymbolTable.translateProperties("[$mic:attribute:type]") + "\";", true);
//ScriptWriter~~//$Section=Attribute getValueType$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute getValueType$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    public String get<![cap@[$mic:attribute:name]]!>ValueStereotype() {
iOutputManager.println("    public String get" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "ValueStereotype() {", true);
//ScriptWriter~~//$Section=Attribute getValueStereotype$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute getValueStereotype$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
//ScriptWriter~~        return "<![$mic:attribute:stereotype]!>";
iOutputManager.println("        return \"" + iSymbolTable.translateProperties("[$mic:attribute:stereotype]") + "\";", true);
//ScriptWriter~~//$Section=Attribute getValueStereotype$<![cap@[$mic:attribute:name]]!>$Preserve=no
iOutputManager.println("//$Section=Attribute getValueStereotype$" + iSymbolTable.translateProperties("[cap@[$mic:attribute:name]]") + "$Preserve=no", true);
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
//ScriptWriter~~  <com.esarks.arm.schemas.services.root name="<!%aPackage!>.<!%aTableName!>Crud">
iOutputManager.println("  <com.esarks.arm.schemas.services.root name=\"" + aPackage + "." + aTableName + "Crud\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


// create

    String lAttributeList = "";
    String lAttributeListWithIdent = "";
    String lQuestionMarks = "";
    String lQuestionMarksWithIdent = "";
    String lIdentity = "";
//ScriptWriter~~    <!$mic:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).resetIterator();
//ScriptWriter~~    while (<!$mic:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:attribute")).next()) {
//ScriptWriter~~      if (<![$mic:attribute:identity]!>.equals("true")) {
      if (iSymbolTable.translateProperties("[$mic:attribute:identity]").equals("true")) {
//ScriptWriter~~        lIdentity = <![$mic:attribute:name]!>;
        lIdentity = iSymbolTable.translateProperties("[$mic:attribute:name]");
        if (!lAttributeListWithIdent.equals("")) lAttributeListWithIdent += ",";
        if (!lQuestionMarksWithIdent.equals("")) lQuestionMarksWithIdent += ",";
//ScriptWriter~~        lAttributeListWithIdent += <![$mic:attribute:name]!>;
        lAttributeListWithIdent += iSymbolTable.translateProperties("[$mic:attribute:name]");
        lQuestionMarksWithIdent += "?";
      } else {
        if (!lAttributeList.equals("")) lAttributeList += ",";
        if (!lQuestionMarks.equals("")) lQuestionMarks += ",";
//ScriptWriter~~        lAttributeList += <![$mic:attribute:name]!>;
        lAttributeList += iSymbolTable.translateProperties("[$mic:attribute:name]");
        lQuestionMarks += "?";
        if (!lAttributeListWithIdent.equals("")) lAttributeListWithIdent += ",";
        if (!lQuestionMarksWithIdent.equals("")) lQuestionMarksWithIdent += ",";
//ScriptWriter~~        lAttributeListWithIdent += <![$mic:attribute:name]!>;
        lAttributeListWithIdent += iSymbolTable.translateProperties("[$mic:attribute:name]");
        lQuestionMarksWithIdent += "?";
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
//ScriptWriter~~    <service name="batchCreate<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"batchCreate" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~    <service name="batchCreate<!%lServiceBaseName!>WithIdentity" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"batchCreate" + lServiceBaseName + "WithIdentity\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement stereotype="sqlServer" type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement stereotype=\"sqlServer\" type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          SET IDENTITY_INSERT $<!%aTableName!> ON
iOutputManager.println("          SET IDENTITY_INSERT $" + aTableName + " ON", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeListWithIdent!>) VALUES (<!%lQuestionMarksWithIdent!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeListWithIdent + ") VALUES (" + lQuestionMarksWithIdent + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <statement stereotype="postgreSql" type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement stereotype=\"postgreSql\" type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeListWithIdent!>) VALUES (<!%lQuestionMarksWithIdent!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeListWithIdent + ") VALUES (" + lQuestionMarksWithIdent + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <statement stereotype="mySql" type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement stereotype=\"mySql\" type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeListWithIdent!>) VALUES (<!%lQuestionMarksWithIdent!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeListWithIdent + ") VALUES (" + lQuestionMarksWithIdent + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~    <service name="create<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"create" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql stereotype="sqlServer">
iOutputManager.println("      <sql stereotype=\"sqlServer\">", true);
//ScriptWriter~~        <statement type="CallableStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"CallableStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          BEGIN
iOutputManager.println("          BEGIN", true);
//ScriptWriter~~          DECLARE @IDENT BIGINT
iOutputManager.println("          DECLARE @IDENT BIGINT", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~          SELECT @IDENT = (SELECT @@IDENTITY)
iOutputManager.println("          SELECT @IDENT = (SELECT @@IDENTITY)", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> WHERE <!%lIdentity!> = @IDENT
iOutputManager.println("          SELECT * FROM $" + aTableName + " WHERE " + lIdentity + " = @IDENT", true);
//ScriptWriter~~          END
iOutputManager.println("          END", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" iterate="true" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" iterate=\"true\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="postgreSql">
iOutputManager.println("      <sql stereotype=\"postgreSql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="postgreSql">
iOutputManager.println("      <sql stereotype=\"postgreSql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> WHERE <!%lIdentity!> = LAST_INSERT_ID()
iOutputManager.println("          SELECT * FROM $" + aTableName + " WHERE " + lIdentity + " = LAST_INSERT_ID()", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" iterate="true" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" iterate=\"true\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="mySql">
iOutputManager.println("      <sql stereotype=\"mySql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="mySql">
iOutputManager.println("      <sql stereotype=\"mySql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> WHERE <!%lIdentity!> = LAST_INSERT_ID()
iOutputManager.println("          SELECT * FROM $" + aTableName + " WHERE " + lIdentity + " = LAST_INSERT_ID()", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
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
//ScriptWriter~~    <service name="create<!%lServiceBaseName!>WithIdentity" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"create" + lServiceBaseName + "WithIdentity\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql stereotype="sqlServer">
iOutputManager.println("      <sql stereotype=\"sqlServer\">", true);
//ScriptWriter~~        <statement type="CallableStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"CallableStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          BEGIN
iOutputManager.println("          BEGIN", true);
//ScriptWriter~~          DECLARE @IDENT BIGINT
iOutputManager.println("          DECLARE @IDENT BIGINT", true);
//ScriptWriter~~          SET IDENTITY_INSERT $<!%aTableName!> ON
iOutputManager.println("          SET IDENTITY_INSERT $" + aTableName + " ON", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeListWithIdent!>) VALUES (<!%lQuestionMarksWithIdent!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeListWithIdent + ") VALUES (" + lQuestionMarksWithIdent + ")", true);
//ScriptWriter~~          SELECT @IDENT = (SELECT @@IDENTITY)
iOutputManager.println("          SELECT @IDENT = (SELECT @@IDENTITY)", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> WHERE <!%lIdentity!> = @IDENT
iOutputManager.println("          SELECT * FROM $" + aTableName + " WHERE " + lIdentity + " = @IDENT", true);
//ScriptWriter~~          END
iOutputManager.println("          END", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" iterate="true" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" iterate=\"true\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="postgreSql">
iOutputManager.println("      <sql stereotype=\"postgreSql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeListWithIdent!>) VALUES (<!%lQuestionMarksWithIdent!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeListWithIdent + ") VALUES (" + lQuestionMarksWithIdent + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="postgreSql">
iOutputManager.println("      <sql stereotype=\"postgreSql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> WHERE <!%lIdentity!> = NOT IMPLEMENTED
iOutputManager.println("          SELECT * FROM $" + aTableName + " WHERE " + lIdentity + " = NOT IMPLEMENTED", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" iterate="true" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" iterate=\"true\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="mySql">
iOutputManager.println("      <sql stereotype=\"mySql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeListWithIdent!>) VALUES (<!%lQuestionMarksWithIdent!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeListWithIdent + ") VALUES (" + lQuestionMarksWithIdent + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="mySql">
iOutputManager.println("      <sql stereotype=\"mySql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> WHERE <!%lIdentity!> = NOT IMPLEMENTED
iOutputManager.println("          SELECT * FROM $" + aTableName + " WHERE " + lIdentity + " = NOT IMPLEMENTED", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
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
//ScriptWriter~~    <service name="create<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"create" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql stereotype="sqlServer">
iOutputManager.println("      <sql stereotype=\"sqlServer\">", true);
//ScriptWriter~~        <statement type="CallableStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"CallableStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          BEGIN
iOutputManager.println("          BEGIN", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> WHERE <%
iOutputManager.println("          SELECT * FROM $" + aTableName + " WHERE ", false);
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
//ScriptWriter~~          END
iOutputManager.println("          END", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="postgreSql">
iOutputManager.println("      <sql stereotype=\"postgreSql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="postgreSql">
iOutputManager.println("      <sql stereotype=\"postgreSql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> WHERE <%
iOutputManager.println("          SELECT * FROM $" + aTableName + " WHERE ", false);
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
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>">
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

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
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" />
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" />", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </result>
iOutputManager.println("        </result>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="mySql">
iOutputManager.println("      <sql stereotype=\"mySql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          INSERT INTO $<!%aTableName!> (<!%lAttributeList!>) VALUES (<!%lQuestionMarks!>)
iOutputManager.println("          INSERT INTO $" + aTableName + " (" + lAttributeList + ") VALUES (" + lQuestionMarks + ")", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~      <sql stereotype="mySql">
iOutputManager.println("      <sql stereotype=\"mySql\">", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> WHERE <%
iOutputManager.println("          SELECT * FROM $" + aTableName + " WHERE ", false);
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
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>">
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

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
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
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
//ScriptWriter~~    <service name="uidRead<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"uidRead" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT * FROM $<!%aTableName!> $*where
iOutputManager.println("          SELECT * FROM $" + aTableName + " $*where", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <where>
iOutputManager.println("        <where>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
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
//ScriptWriter~~    <service name="read<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"read" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT $*top * FROM $<!%aTableName!> $*where $*order $*limit
iOutputManager.println("          SELECT $*top * FROM $" + aTableName + " $*where $*order $*limit", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
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
      if (lPrimary.equals("")) {
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
        if (lAttributeList.equals("")) {
//ScriptWriter~~          lAttributeList += <![$mic:attribute:name]!> + "=?";
          lAttributeList += iSymbolTable.translateProperties("[$mic:attribute:name]") + "=?";
        } else {
//ScriptWriter~~          lAttributeList += ", " + <![$mic:attribute:name]!> + "=?";
          lAttributeList += ", " + iSymbolTable.translateProperties("[$mic:attribute:name]") + "=?";
        }
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
//ScriptWriter~~    <service name="delete<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"delete" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          DELETE FROM $<!%aTableName!>
iOutputManager.println("          DELETE FROM $" + aTableName + "", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <where>
iOutputManager.println("        <where>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
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
//ScriptWriter~~    <service name="uidUpdate<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"uidUpdate" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeUpdate">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeUpdate\">", true);
//ScriptWriter~~          UPDATE $<!%aTableName!> SET <!%lAttributeList!> WHERE <!%lPrimary!>
iOutputManager.println("          UPDATE $" + aTableName + " SET " + lAttributeList + " WHERE " + lPrimary + "", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <value>
iOutputManager.println("        <value>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
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
//ScriptWriter~~        </value>
iOutputManager.println("        </value>", true);
//ScriptWriter~~        <count>
iOutputManager.println("        <count>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
//ScriptWriter~~          </jeo>
iOutputManager.println("          </jeo>", true);
//ScriptWriter~~        </count>
iOutputManager.println("        </count>", true);
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!$mic:set!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set")).resetIterator();
//ScriptWriter~~    while (<!$mic:set!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~<!-- -->
iOutputManager.println("<!-- -->", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~    <service name="setRead<![$mic:set]!>" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"setRead" + iSymbolTable.translateProperties("[$mic:set]") + "\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT $*top * FROM $<!%aTableName!> $*where $*order $*limit
iOutputManager.println("          SELECT $*top * FROM $" + aTableName + " $*where $*order $*limit", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <where>
iOutputManager.println("        <where>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.RequestJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.RequestJeo\">", true);
//ScriptWriter~~            <jeo name="<!%aPackage!>.<!%aTableName!>" >
iOutputManager.println("            <jeo name=\"" + aPackage + "." + aTableName + "\" >", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      <!$mic:set:field!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set:field")).resetIterator();
//ScriptWriter~~      while (<!$mic:set:field!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set:field")).next()) {
//ScriptWriter~~        if (<!$mic:set:field:clause!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set:field:clause")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <where clause="<![$mic:set:field:clause]!>" attribute="<![$mic:set:field]!>" />
iOutputManager.println("              <where clause=\"" + iSymbolTable.translateProperties("[$mic:set:field:clause]") + "\" attribute=\"" + iSymbolTable.translateProperties("[$mic:set:field]") + "\" />", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~          if (<!$mic:set:field!>!isFirst()) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:set:field")).isFirst()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~              <where clause="<![$mic:set:field]!>=?" attribute="<![$mic:set:field]!>" />
iOutputManager.println("              <where clause=\"" + iSymbolTable.translateProperties("[$mic:set:field]") + "=?\" attribute=\"" + iSymbolTable.translateProperties("[$mic:set:field]") + "\" />", true);
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
//ScriptWriter~~              <where clause="AND <![$mic:set:field]!>=?" attribute="<![$mic:set:field]!>" />
iOutputManager.println("              <where clause=\"AND " + iSymbolTable.translateProperties("[$mic:set:field]") + "=?\" attribute=\"" + iSymbolTable.translateProperties("[$mic:set:field]") + "\" />", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
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
//ScriptWriter~~      </sql>
iOutputManager.println("      </sql>", true);
//ScriptWriter~~    </service>
iOutputManager.println("    </service>", true);
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
//ScriptWriter~~  </com.esarks.arm.schemas.services.root>
iOutputManager.println("  </com.esarks.arm.schemas.services.root>", true);
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
//ScriptWriter~~  <com.esarks.arm.schemas.services.root name="<!%aPackage!>.<!%aViewName!>Read">
iOutputManager.println("  <com.esarks.arm.schemas.services.root name=\"" + aPackage + "." + aViewName + "Read\">", true);
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
//ScriptWriter~~    <service name="read<!%lServiceBaseName!>" jeo="com.esarks.arm.model.jeo.ServiceJeo">
iOutputManager.println("    <service name=\"read" + lServiceBaseName + "\" jeo=\"com.esarks.arm.model.jeo.ServiceJeo\">", true);
//ScriptWriter~~      <sql>
iOutputManager.println("      <sql>", true);
//ScriptWriter~~        <statement type="PreparedStatement" method="executeQuery">
iOutputManager.println("        <statement type=\"PreparedStatement\" method=\"executeQuery\">", true);
//ScriptWriter~~          SELECT $*top * FROM $<!%aViewName!> $*where $*order $*limit
iOutputManager.println("          SELECT $*top * FROM $" + aViewName + " $*where $*order $*limit", true);
//ScriptWriter~~        </statement>
iOutputManager.println("        </statement>", true);
//ScriptWriter~~        <result>
iOutputManager.println("        <result>", true);
//ScriptWriter~~          <jeo name="com.esarks.arm.model.jeo.ReplyJeo">
iOutputManager.println("          <jeo name=\"com.esarks.arm.model.jeo.ReplyJeo\">", true);
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
//ScriptWriter~~  </com.esarks.arm.schemas.services.root>
iOutputManager.println("  </com.esarks.arm.schemas.services.root>", true);
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

  private void parseXmlDefinition(String aXmlDefinition) {
    XmlSchemaFactory lXmlSchemaFactory = iSymbolTable.getXmlSchemaFactory();
    if (lXmlSchemaFactory.getXmlSchemaElement("com.esarks.arm.schemas.ddl.root") == null) {
      loadXmlSchema("com.esarks.arm.schemas.ddl", path("com.esarks.arm.schemas.DdlSchema") + ".xml");
    }
    parseXmlSchema(aXmlDefinition);
  }
}
