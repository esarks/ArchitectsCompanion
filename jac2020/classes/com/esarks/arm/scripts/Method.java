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
public class Method extends com.esarks.jac.ScriptHelper  {


//ScriptWriter~~  private String iScriptPackage = "<#[$jac:script:package]#>";
  private String iScriptPackage = "com.esarks.arm.scripts";
//ScriptWriter~~  private String iScriptName = "<#[$jac:script]#>";
  private String iScriptName = "Method";

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Method() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Method(Script aScript) {

    super(aScript);

  }

  public void execute() {
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~// Begin: com.esarks.arm.scripts.Method
iOutputManager.println("// Begin: com.esarks.arm.scripts.Method", true);
//ScriptWriter~~/**
iOutputManager.println("/**", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  <!$jac:script:xml:method:document!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:document")).resetIterator();
//ScriptWriter~~  while (<!$jac:script:xml:method:document!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:document")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~ * <![$jac:script:xml:method:document]!>
iOutputManager.println(" * " + iSymbolTable.translateProperties("[$jac:script:xml:method:document]") + "", true);
//ScriptWriter~~<%  
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
  
  }
//ScriptWriter~~  <!$jac:script:xml:method:argument!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument")).resetIterator();
//ScriptWriter~~  while (<!$jac:script:xml:method:argument!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument")).next()) {
//ScriptWriter~~    <!$jac:script:xml:method:argument:document!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument:document")).resetIterator();
//ScriptWriter~~    <!$jac:script:xml:method:argument:document!>!next();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument:document")).next();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~ * @param <![$jac:script:xml:method:argument:name]!> <![$jac:script:xml:method:argument:document]!>
iOutputManager.println(" * @param " + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + " " + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:document]") + "", true);
//ScriptWriter~~<%  
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
  
//ScriptWriter~~    while (<![$jac:script:xml:method:argument:document]!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$jac:script:xml:method:argument:document]")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~ *        <![$jac:script:xml:method:argument:document]!>
iOutputManager.println(" *        " + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:document]") + "", true);
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
//ScriptWriter~~ */
iOutputManager.println(" */", true);
//ScriptWriter~~  <![$jac:script:xml:method:visibility]!> <![$jac:script:xml:method:return]!> <![$jac:script:xml:method:name]!>(<%
iOutputManager.println("  " + iSymbolTable.translateProperties("[$jac:script:xml:method:visibility]") + " " + iSymbolTable.translateProperties("[$jac:script:xml:method:return]") + " " + iSymbolTable.translateProperties("[$jac:script:xml:method:name]") + "(", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!$jac:script:xml:method:argument!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument")).resetIterator();
//ScriptWriter~~  String lSignature = <!$jac:script:xml:method:name!>!getValueString() + "(";
  String lSignature = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:name")).getValueString() + "(";
//ScriptWriter~~  while (<!$jac:script:xml:method:argument!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument")).next()) {
//ScriptWriter~~%> <![$jac:script:xml:method:argument:type]!> <![$jac:script:xml:method:argument:name]!><%
{
//ScriptWriter~~~
iOutputManager.println(" " + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:type]") + " " + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    lSignature += <!$jac:script:xml:method:argument:type!>!getValueString();
    lSignature += iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument:type")).getValueString();
//ScriptWriter~~    if (!<!$jac:script:xml:method:argument!>!isLast()) {
    if (!iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument")).isLast()) {
//ScriptWriter~~      %>,<%
      {
//ScriptWriter~~~
iOutputManager.println(",", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      lSignature += ",";
    }
  }
  lSignature += ")";
//ScriptWriter~~%>) {
{
//ScriptWriter~~~
iOutputManager.println(") {", true);
//ScriptWriter~~  String lMethodSignature = "<!%lSignature!>";
iOutputManager.println("  String lMethodSignature = \"" + lSignature + "\";", true);
//ScriptWriter~~  String lMethodLocation = "";
iOutputManager.println("  String lMethodLocation = \"\";", true);
//ScriptWriter~~  java.util.Date lMethodStartDate = null;
iOutputManager.println("  java.util.Date lMethodStartDate = null;", true);
//ScriptWriter~~  java.util.Date lMethodStopDate = null;
iOutputManager.println("  java.util.Date lMethodStopDate = null;", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (!<![$jac:script:xml:method:supressLog]!>.equals("true")) {
  if (!iSymbolTable.translateProperties("[$jac:script:xml:method:supressLog]").equals("true")) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  if (iMicLog.test(Log._APP)) {
iOutputManager.println("  if (iMicLog.test(Log._APP)) {", true);
//ScriptWriter~~    lMethodStartDate = new java.util.Date();
iOutputManager.println("    lMethodStartDate = new java.util.Date();", true);
//ScriptWriter~~    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method"<%
iOutputManager.println("    iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Enter method\"", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  <!$jac:script:xml:method:argument!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument")).resetIterator();
//ScriptWriter~~  while (<!$jac:script:xml:method:argument!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:script:xml:method:argument")).next()) {
//ScriptWriter~~    String lArgType = <![$jac:script:xml:method:argument:type]!>;
    String lArgType = iSymbolTable.translateProperties("[$jac:script:xml:method:argument:type]");
    if (lArgType.equals("boolean")) {
//ScriptWriter~~      %> + "!<![$jac:script:xml:method:argument:name]!>=" + Log.toString(Boolean.toString(<![$jac:script:xml:method:argument:name]!>))<%
      {
//ScriptWriter~~~
iOutputManager.println(" + \"!" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "=\" + Log.toString(Boolean.toString(" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "))", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else if (lArgType.equals("byte")) {
//ScriptWriter~~      %> + "!<![$jac:script:xml:method:argument:name]!>=" + Log.toString(Byte.toString(<![$jac:script:xml:method:argument:name]!>))<%
      {
//ScriptWriter~~~
iOutputManager.println(" + \"!" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "=\" + Log.toString(Byte.toString(" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "))", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else if (lArgType.equals("char")) {
//ScriptWriter~~      %> + "!<![$jac:script:xml:method:argument:name]!>=" + Log.toString(Char.toString(<![$jac:script:xml:method:argument:name]!>))<%
      {
//ScriptWriter~~~
iOutputManager.println(" + \"!" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "=\" + Log.toString(Char.toString(" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "))", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else if (lArgType.equals("double")) {
//ScriptWriter~~      %> + "!<![$jac:script:xml:method:argument:name]!>=" + Log.toString(Double.toString(<![$jac:script:xml:method:argument:name]!>))<%
      {
//ScriptWriter~~~
iOutputManager.println(" + \"!" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "=\" + Log.toString(Double.toString(" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "))", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else if (lArgType.equals("float")) {
//ScriptWriter~~      %> + "!<![$jac:script:xml:method:argument:name]!>=" + Log.toString(Float.toString(<![$jac:script:xml:method:argument:name]!>))<%
      {
//ScriptWriter~~~
iOutputManager.println(" + \"!" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "=\" + Log.toString(Float.toString(" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "))", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else if (lArgType.equals("int")) {
//ScriptWriter~~      %> + "!<![$jac:script:xml:method:argument:name]!>=" + Log.toString(Integer.toString(<![$jac:script:xml:method:argument:name]!>))<%
      {
//ScriptWriter~~~
iOutputManager.println(" + \"!" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "=\" + Log.toString(Integer.toString(" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "))", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else if (lArgType.equals("long")) {
//ScriptWriter~~      %> + "!<![$jac:script:xml:method:argument:name]!>=" + Log.toString(Long.toString(<![$jac:script:xml:method:argument:name]!>))<%
      {
//ScriptWriter~~~
iOutputManager.println(" + \"!" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "=\" + Log.toString(Long.toString(" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "))", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else if (lArgType.equals("short")) {
//ScriptWriter~~      %> + "!<![$jac:script:xml:method:argument:name]!>=" + Log.toString(Short.toString(<![$jac:script:xml:method:argument:name]!>))<%
      {
//ScriptWriter~~~
iOutputManager.println(" + \"!" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "=\" + Log.toString(Short.toString(" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "))", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else {
//ScriptWriter~~      %> + "!<![$jac:script:xml:method:argument:name]!>=" + Log.toString(<![$jac:script:xml:method:argument:name]!>)<%
      {
//ScriptWriter~~~
iOutputManager.println(" + \"!" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + "=\" + Log.toString(" + iSymbolTable.translateProperties("[$jac:script:xml:method:argument:name]") + ")", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
  }
//ScriptWriter~~  %>);
  {
//ScriptWriter~~~
iOutputManager.println(");", true);
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
//ScriptWriter~~  try {<%
iOutputManager.println("  try {", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~  if (<![$jac:script:xml:method:resetExit]!>.equals("false")) {
  if (iSymbolTable.translateProperties("[$jac:script:xml:method:resetExit]").equals("false")) {
  } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  resetExit();<%
iOutputManager.println("  resetExit();", false);
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
//ScriptWriter~~// End: com.esarks.arm.scripts.Method
iOutputManager.println("// End: com.esarks.arm.scripts.Method", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
}

