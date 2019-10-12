//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.scripts;

import com.esarks.jac.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class IterateReplyJeo extends com.esarks.jac.ScriptHelper  {


//ScriptWriter~~  private String iScriptPackage = "<#[$jac:script:package]#>";
  private String iScriptPackage = "com.esarks.arm.scripts";
//ScriptWriter~~  private String iScriptName = "<#[$jac:script]#>";
  private String iScriptName = "IterateReplyJeo";

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected IterateReplyJeo() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public IterateReplyJeo(Script aScript) {

    super(aScript);

  }

  public void execute() {
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    {
iOutputManager.println("    {", true);
//ScriptWriter~~      ArrayList lArrayList = <![$jac:script:xml:script:jeo]!>.getReply().getJeoByInstanceName(<![$jac:script:xml:script:instance]!>.class.getName());
iOutputManager.println("      ArrayList lArrayList = " + iSymbolTable.translateProperties("[$jac:script:xml:script:jeo]") + ".getReply().getJeoByInstanceName(" + iSymbolTable.translateProperties("[$jac:script:xml:script:instance]") + ".class.getName());", true);
//ScriptWriter~~      for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
iOutputManager.println("      for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {", true);
//ScriptWriter~~        <![$jac:script:xml:script:instance]!> lInstanceJeo = (<![$jac:script:xml:script:instance]!>) lArrayList.get(lIdx);
iOutputManager.println("        " + iSymbolTable.translateProperties("[$jac:script:xml:script:instance]") + " lInstanceJeo = (" + iSymbolTable.translateProperties("[$jac:script:xml:script:instance]") + ") lArrayList.get(lIdx);", true);
//ScriptWriter~~<![$jac:script:xml:script:custom]!>
iOutputManager.println("" + iSymbolTable.translateProperties("[$jac:script:xml:script:custom]") + "", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
}

