//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.applicationFramework;

import com.esarks.jac.*;
import com.esarks.mic.*;
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

//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class AppFramework extends com.esarks.mic.View {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected AppFramework() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public AppFramework(Script aScript) {

    super(aScript);

  }

  public void execute(MicScriptHelper aMicScriptHelper) {
  
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <table width="100%" valign="top" border="2" cellspacing="0" cellpadding="0">
iOutputManager.println("  <table width=\"100%\" valign=\"top\" border=\"2\" cellspacing=\"0\" cellpadding=\"0\">", true);
//ScriptWriter~~    <tr>
iOutputManager.println("    <tr>", true);
//ScriptWriter~~      <td>
iOutputManager.println("      <td>", true);
//ScriptWriter~~        <table width="100%" valign="top" border="1" cellspacing="0" cellpadding="0" frame="void">
iOutputManager.println("        <table width=\"100%\" valign=\"top\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" frame=\"void\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    if (<![showToolbar]!>.compareTo("false") == 0) {
    if (iSymbolTable.translateProperties("[showToolbar]").compareTo("false") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          <tr bgcolor="#EFEDDE" bordercolor="#EFEDDE">
iOutputManager.println("          <tr bgcolor=\"#EFEDDE\" bordercolor=\"#EFEDDE\">", true);
//ScriptWriter~~            <td height="20">
iOutputManager.println("            <td height=\"20\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    renderHrefTag("*", iScriptFullName, iScriptInstanceName, "showToolbar", null, null);
    renderHrefLink("Show Toolbar");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            </td>
iOutputManager.println("            </td>", true);
//ScriptWriter~~          </tr>
iOutputManager.println("          </tr>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~%>            
{
//ScriptWriter~~~
iOutputManager.println("            ", true);
//ScriptWriter~~          <tr>
iOutputManager.println("          <tr>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    if (<![showToolbar]!>.compareTo("false") != 0) {
    if (iSymbolTable.translateProperties("[showToolbar]").compareTo("false") != 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            <td width="100" bgcolor="lightyellow" bordercolor="lightyellow" valign="top">
iOutputManager.println("            <td width=\"100\" bgcolor=\"lightyellow\" bordercolor=\"lightyellow\" valign=\"top\">", true);
//ScriptWriter~~              <table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0" frame="void" bgcolor="#EFEDDE">
iOutputManager.println("              <table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" frame=\"void\" bgcolor=\"#EFEDDE\">", true);
//ScriptWriter~~                <tr><td width="5"></td><td align="center">
iOutputManager.println("                <tr><td width=\"5\"></td><td align=\"center\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    renderHrefTag("*", iScriptFullName, iScriptInstanceName, "hideToolbar", null, null);
    renderHrefLink("Hide Toolbar");
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~                </td><td width="5"></td></tr>
iOutputManager.println("                </td><td width=\"5\"></td></tr>", true);
//ScriptWriter~~                <tr><td width="5"></td><td height="1" bgcolor="darkgray"></td><td width="5"></td></tr>
iOutputManager.println("                <tr><td width=\"5\"></td><td height=\"1\" bgcolor=\"darkgray\"></td><td width=\"5\"></td></tr>", true);
//ScriptWriter~~              </table>
iOutputManager.println("              </table>", true);
//ScriptWriter~~              <% iScript.execMethod(aMicScriptHelper, "renderSection", new Object[] {"frameToolbar"}); %>
iOutputManager.println("              ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
 iScript.execMethod(aMicScriptHelper, "renderSection", new Object[] {"frameToolbar"}); {
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            </td>
iOutputManager.println("            </td>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~%>            
{
//ScriptWriter~~~
iOutputManager.println("            ", true);
//ScriptWriter~~            <td height="200" valign="top" bgcolor="white" bordercolor="white">
iOutputManager.println("            <td height=\"200\" valign=\"top\" bgcolor=\"white\" bordercolor=\"white\">", true);
//ScriptWriter~~              <% iScript.execMethod(aMicScriptHelper, "renderSection", new Object[] {"frameAppContent"}); %>
iOutputManager.println("              ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
 iScript.execMethod(aMicScriptHelper, "renderSection", new Object[] {"frameAppContent"}); {
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~            </td>
iOutputManager.println("            </td>", true);
//ScriptWriter~~          </tr>
iOutputManager.println("          </tr>", true);
//ScriptWriter~~        </table>
iOutputManager.println("        </table>", true);
//ScriptWriter~~      </td>
iOutputManager.println("      </td>", true);
//ScriptWriter~~    </tr>
iOutputManager.println("    </tr>", true);
//ScriptWriter~~  </table>
iOutputManager.println("  </table>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }

  public void showToolbar() {
//ScriptWriter~~    <!showToolbar!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("showToolbar")).remove();
  }

  public void hideToolbar() {
//ScriptWriter~~    <!showToolbar!>!reset("false");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("showToolbar")).reset("false");
  }
  
}
