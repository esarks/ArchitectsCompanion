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
public class Service extends com.esarks.jac.ScriptHelper  {


//ScriptWriter~~  private String iScriptPackage = "<#[$jac:script:package]#>";
  private String iScriptPackage = "com.esarks.arm.scripts";
//ScriptWriter~~  private String iScriptName = "<#[$jac:script]#>";
  private String iScriptName = "Service";

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Service() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Service(Script aScript) {

    super(aScript);

  }

  public void execute() {
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// Begin: com.esarks.arm.scripts.Service
iOutputManager.println("// Begin: com.esarks.arm.scripts.Service", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<!$jac:script:xml:script:serviceJeo!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:script:serviceJeo")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <![$jac:script:xml:script:serviceJeo]!>.getRequest().setPropertyValue("scriptFullName", new PropertyValue(iScriptFullName));
iOutputManager.println("    " + iSymbolTable.translateProperties("[$jac:script:xml:script:serviceJeo]") + ".getRequest().setPropertyValue(\"scriptFullName\", new PropertyValue(iScriptFullName));", true);
//ScriptWriter~~    <![$jac:script:xml:script:serviceJeo]!>.getRequest().setPropertyValue("methodSignature", new PropertyValue(lMethodSignature));
iOutputManager.println("    " + iSymbolTable.translateProperties("[$jac:script:xml:script:serviceJeo]") + ".getRequest().setPropertyValue(\"methodSignature\", new PropertyValue(lMethodSignature));", true);
//ScriptWriter~~    <![$jac:script:xml:script:serviceJeo]!>.getRequest().setPropertyValue("methodLocation", new PropertyValue(lMethodLocation));
iOutputManager.println("    " + iSymbolTable.translateProperties("[$jac:script:xml:script:serviceJeo]") + ".getRequest().setPropertyValue(\"methodLocation\", new PropertyValue(lMethodLocation));", true);
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
//ScriptWriter~~    iScript.execMethod(<![$jac:script:xml:script:name]!>.class.getName(), "<![$jac:script:xml:script:method]!>", <%
iOutputManager.println("    iScript.execMethod(" + iSymbolTable.translateProperties("[$jac:script:xml:script:name]") + ".class.getName(), \"" + iSymbolTable.translateProperties("[$jac:script:xml:script:method]") + "\", ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<!$jac:script:xml:script:arguments!>!size() > 0) %>new Object[]{<![$jac:script:xml:script:arguments]!>});<%
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:script:arguments")).size() > 0) {
//ScriptWriter~~~
iOutputManager.println("new Object[]{" + iSymbolTable.translateProperties("[$jac:script:xml:script:arguments]") + "});", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<!$jac:script:xml:script:object!>!size() > 0) %><![$jac:script:xml:script:object]!>);<%
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:script:object")).size() > 0) {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[$jac:script:xml:script:object]") + ");", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<!$jac:script:xml:script:serviceJeo!>!size() > 0) %>new Object[]{<![$jac:script:xml:script:serviceJeo]!>});<%
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:script:serviceJeo")).size() > 0) {
//ScriptWriter~~~
iOutputManager.println("new Object[]{" + iSymbolTable.translateProperties("[$jac:script:xml:script:serviceJeo]") + "});", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>    
{
//ScriptWriter~~~
iOutputManager.println("    ", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<!$jac:script:xml:script:serviceJeo!>!size() > 0 && !<![$jac:script:xml:script:checkError]!>.equals("false")) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:script:serviceJeo")).size() > 0 && !iSymbolTable.translateProperties("[$jac:script:xml:script:checkError]").equals("false")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    if (<![$jac:script:xml:script:serviceJeo]!>.getError() != null && <![$jac:script:xml:script:serviceJeo]!>.getError().getSeverity() < 5) {
iOutputManager.println("    if (" + iSymbolTable.translateProperties("[$jac:script:xml:script:serviceJeo]") + ".getError() != null && " + iSymbolTable.translateProperties("[$jac:script:xml:script:serviceJeo]") + ".getError().getSeverity() < 5) {", true);
//ScriptWriter~~      System.out.println(<![$jac:script:xml:script:serviceJeo]!>.getError().getTitle());
iOutputManager.println("      System.out.println(" + iSymbolTable.translateProperties("[$jac:script:xml:script:serviceJeo]") + ".getError().getTitle());", true);
//ScriptWriter~~      System.out.println(<![$jac:script:xml:script:serviceJeo]!>.getError().getText());
iOutputManager.println("      System.out.println(" + iSymbolTable.translateProperties("[$jac:script:xml:script:serviceJeo]") + ".getError().getText());", true);
//ScriptWriter~~      System.out.println(<![$jac:script:xml:script:serviceJeo]!>.getError().getLocation());
iOutputManager.println("      System.out.println(" + iSymbolTable.translateProperties("[$jac:script:xml:script:serviceJeo]") + ".getError().getLocation());", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    if (<!$jac:script:xml:script:errorReturn!>!size() == 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:script:errorReturn")).size() == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      return;
iOutputManager.println("      return;", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
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
//ScriptWriter~~      <![$jac:script:xml:script:errorReturn]!>
iOutputManager.println("      " + iSymbolTable.translateProperties("[$jac:script:xml:script:errorReturn]") + "", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
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
//ScriptWriter~~// End: com.esarks.arm.scripts.Service
iOutputManager.println("// End: com.esarks.arm.scripts.Service", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
}

