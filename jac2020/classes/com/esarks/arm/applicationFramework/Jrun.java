//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.applicationFramework;

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
public class Jrun extends com.esarks.mic.MicScriptHelper {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Jrun() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Jrun(Script aScript) {

    super(aScript);

  }


  public void execute(String aXml) {

    System.out.println("Jrun");

//ScriptWriter~~    if (<!properties!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("properties")).size() == 0) {
      loadXmlSchema("com.hqsonline.arm.properties.conf", path("com.hqsonline.arm.properties.conf.Schemas") + ".xml");
      parseXmlSchema("com.hqsonline.arm.properties.conf.Properties");
//ScriptWriter~~      boolean lScan = <!properties:com.hqsonline.arm.properties.conf.properties!>!scan("sqlServer");
      boolean lScan = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("properties:com.hqsonline.arm.properties.conf.properties")).scan("sqlServer");
    }

    parseXmlPath(aXml);
//ScriptWriter~~    <!jacrun:script!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script")).resetIterator();
//ScriptWriter~~    while (<!jacrun:script!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script")).next()) {
//ScriptWriter~~      if (<!jacrun:script:name!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:name")).size() > 0) {
//ScriptWriter~~        if (<!jacrun:script:argument!>!size() == 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:script:argument")).size() == 0) {
//ScriptWriter~~          iScript.execMethod(loadScript(<![jacrun:script:name]!>), <![jacrun:script:method]!>);
          iScript.execMethod(loadScript(iSymbolTable.translateProperties("[jacrun:script:name]")), iSymbolTable.translateProperties("[jacrun:script:method]"));
        } else {
//ScriptWriter~~          iScript.execMethod(loadScript(<![jacrun:script:name]!>), <![jacrun:script:method]!>, new Object[]{<![jacrun:script:argument]!>});
          iScript.execMethod(loadScript(iSymbolTable.translateProperties("[jacrun:script:name]")), iSymbolTable.translateProperties("[jacrun:script:method]"), new Object[]{iSymbolTable.translateProperties("[jacrun:script:argument]")});
        }
      } else {
//ScriptWriter~~        if (<!jacrun:argument!>!size() == 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacrun:argument")).size() == 0) {
//ScriptWriter~~          iScript.execMethod(loadScript(<![jacrun:script]!>), <![jacrun:method]!>);
          iScript.execMethod(loadScript(iSymbolTable.translateProperties("[jacrun:script]")), iSymbolTable.translateProperties("[jacrun:method]"));
        } else {
//ScriptWriter~~          iScript.execMethod(loadScript(<![jacrun:script]!>), <![jacrun:method]!>, new Object[]{<![jacrun:argument]!>});
          iScript.execMethod(loadScript(iSymbolTable.translateProperties("[jacrun:script]")), iSymbolTable.translateProperties("[jacrun:method]"), new Object[]{iSymbolTable.translateProperties("[jacrun:argument]")});
        }
      }
    }
  }
}
