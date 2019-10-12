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


public class ReturnMethod extends com.esarks.jac.ScriptHelper  {


  private String iScriptPackage = "com.esarks.arm.scripts";
  private String iScriptName = "ReturnMethod";

  protected ReturnMethod() {
  }

  public ReturnMethod(Script aScript) {

    super(aScript);

  }

  public void execute() {
    
{
iOutputManager.println("", false);
iOutputManager.println("// Begin: com.esarks.arm.scripts.ReturnMethod", true);
iOutputManager.println("    if (iMicLog.test(Log._APP)) {", true);
iOutputManager.println("      lMethodStopDate = new java.util.Date();", true);
iOutputManager.println("      iMicLog.println(Log._APP, \"APP-\" + iScriptFullName + \":\" + lMethodSignature + \"!Early exit method!Memo = \" + \"" + iSymbolTable.translateProperties("[$jac:script:xml:return:memo]") + "\" + \"!Value = \" + \"" + iSymbolTable.translateProperties("[$jac:script:xml:return]") + "\" + \"!Elapsed time = \" + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));", true);
iOutputManager.println("    }", true);
iOutputManager.println("", false);
}

  if (iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:script:xml:return")).size() > 0) {
{
iOutputManager.println("", false);
iOutputManager.println("    return " + iSymbolTable.translateProperties("[$jac:script:xml:return]") + ";", true);
iOutputManager.println("", false);
}

  } else {
{
iOutputManager.println("", false);
iOutputManager.println("    return;", true);
iOutputManager.println("", false);
}

  }
{
iOutputManager.println("", false);
iOutputManager.println("// End: com.esarks.arm.scripts.FinalReturnMethod", true);
iOutputManager.println("", false);
}

  }
}

