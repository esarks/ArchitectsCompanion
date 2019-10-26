//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.scripts;

import com.esarks.jac.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
//import java.sql.*;
//import javax.servlet.*;
//import javax.servlet.http.*;
//import javax.servlet.jsp.*;

//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class GetEffectiveDate extends com.esarks.jac.ScriptHelper  {


//ScriptWriter~~  private String iScriptPackage = "<#[$jac:script:package]#>";
  private String iScriptPackage = "com.esarks.arm.scripts";
//ScriptWriter~~  private String iScriptName = "<#[$jac:script]#>";
  private String iScriptName = "GetEffectiveDate";

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected GetEffectiveDate() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public GetEffectiveDate(Script aScript) {

    super(aScript);

  }

  public void execute() {
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    com.hqsonline.hrm.model.businessObjects.EffectiveDate lEffectiveDate = (com.hqsonline.hrm.model.businessObjects.EffectiveDate) loadScript(com.hqsonline.hrm.model.businessObjects.EffectiveDate.class.getName());
iOutputManager.println("    com.hqsonline.hrm.model.businessObjects.EffectiveDate lEffectiveDate = (com.hqsonline.hrm.model.businessObjects.EffectiveDate) loadScript(com.hqsonline.hrm.model.businessObjects.EffectiveDate.class.getName());", true);
//ScriptWriter~~    java.util.Date <![$jac:script:xml:date]!> = lEffectiveDate.getEffectiveDate();
iOutputManager.println("    java.util.Date " + iSymbolTable.translateProperties("[$jac:script:xml:date]") + " = lEffectiveDate.getEffectiveDate();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
}

