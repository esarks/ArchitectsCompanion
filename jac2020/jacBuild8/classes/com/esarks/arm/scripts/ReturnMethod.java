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
public class ReturnMethod extends com.esarks.jac.ScriptHelper  {


//ScriptWriter~~  private String iScriptPackage = "<#[$jac:script:package]#>";
  private String iScriptPackage = "com.esarks.arm.scripts";
//ScriptWriter~~  private String iScriptName = "<#[$jac:script]#>";
  private String iScriptName = "ReturnMethod";

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected ReturnMethod() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public ReturnMethod(Script aScript) {

    super(aScript);

  }

  public void execute() {
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// Begin: com.esarks.arm.scripts.ReturnMethod
iOutputManager.println("// Begin: com.esarks.arm.scripts.ReturnMethod", true);
//ScriptWriter~~    if (iMicLog.test(Log._APP)) {
iOutputManager.println("    if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~      lMethodStopDate = new java.util.Date();
iOutputManager.println("      lMethodStopDate = new java.util.Date();", true);
//ScriptWriter~~      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Early exit method!Memo = " + "<![$jac:script:xml:return:memo]!>" + "!Value = " + "<![$jac:script:xml:return]!>" + "!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
iOutputManager.println("      iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Early exit method!Memo = \" + \"" + iSymbolTable.translateProperties("[$jac:script:xml:return:memo]") + "\" + \"!Value = \" + \"" + iSymbolTable.translateProperties("[$jac:script:xml:return]") + "\" + \"!Elapsed time = \" + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<!$jac:script:xml:return!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:return")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    return <![$jac:script:xml:return]!>;
iOutputManager.println("    return " + iSymbolTable.translateProperties("[$jac:script:xml:return]") + ";", true);
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
//ScriptWriter~~    return;
iOutputManager.println("    return;", true);
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
//ScriptWriter~~// End: com.esarks.arm.scripts.FinalReturnMethod
iOutputManager.println("// End: com.esarks.arm.scripts.FinalReturnMethod", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
}

