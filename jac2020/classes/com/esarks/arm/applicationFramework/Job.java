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
public class Job extends com.esarks.mic.MicScriptHelper {

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

    System.out.println("Job");
    
//ScriptWriter~~    if (<!properties!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("properties")).size() == 0) {
      loadXmlSchema("com.hqsonline.arm.properties.conf", path("com.hqsonline.arm.properties.conf.Schemas") + ".xml");
      parseXmlSchema("com.hqsonline.arm.properties.conf.Properties");
//ScriptWriter~~      boolean lScan = <!properties:com.hqsonline.arm.properties.conf.properties!>!scan("sqlServer");
      boolean lScan = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("properties:com.hqsonline.arm.properties.conf.properties")).scan("sqlServer");
    }

    if (aArgument == null || aArgument.equals("")) {
      iScript.execMethod(loadScript(aScript), aMethod);
    } else {
      iScript.execMethod(loadScript(aScript), aMethod, new Object[]{aArgument});
    }
    
}
}
