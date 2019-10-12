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
public class AppComponent extends com.esarks.mic.View {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected AppComponent() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public AppComponent(Script aScript) {

    super(aScript);

  }

  public void execute(MicScriptHelper aMicScriptHelper) {
  
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  <table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0" frame="void">
iOutputManager.println("  <table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" frame=\"void\">", true);
//ScriptWriter~~  <tr><td width="3"></td><td width="3" bgcolor="blue"></td><td>
iOutputManager.println("  <tr><td width=\"3\"></td><td width=\"3\" bgcolor=\"blue\"></td><td>", true);
//ScriptWriter~~  <table width="100%" valign="top" border="1" cellspacing="0" cellpadding="0">
iOutputManager.println("  <table width=\"100%\" valign=\"top\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">", true);
//ScriptWriter~~    <% iScript.execMethod(aMicScriptHelper, "renderSection", new Object[] {"frameWindowBar"}); %>
iOutputManager.println("    ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
 iScript.execMethod(aMicScriptHelper, "renderSection", new Object[] {"frameWindowBar"}); {
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <tr bgcolor="#EFEDDE" bordercolor="#EFEDDE">
iOutputManager.println("    <tr bgcolor=\"#EFEDDE\" bordercolor=\"#EFEDDE\">", true);
//ScriptWriter~~      <td>
iOutputManager.println("      <td>", true);
//ScriptWriter~~        <table height="20" border="0" cellspacing="3" cellpadding="0" frame="void">
iOutputManager.println("        <table height=\"20\" border=\"0\" cellspacing=\"3\" cellpadding=\"0\" frame=\"void\">", true);
//ScriptWriter~~          <tr>
iOutputManager.println("          <tr>", true);
//ScriptWriter~~            <% iScript.execMethod(aMicScriptHelper, "renderSection", new Object[] {"frameToolMenu"}); %>
iOutputManager.println("            ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
 iScript.execMethod(aMicScriptHelper, "renderSection", new Object[] {"frameToolMenu"}); {
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          </tr>
iOutputManager.println("          </tr>", true);
//ScriptWriter~~        </table>
iOutputManager.println("        </table>", true);
//ScriptWriter~~      </td>
iOutputManager.println("      </td>", true);
//ScriptWriter~~    </tr>
iOutputManager.println("    </tr>", true);
//ScriptWriter~~    <tr>
iOutputManager.println("    <tr>", true);
//ScriptWriter~~      <td>
iOutputManager.println("      <td>", true);
//ScriptWriter~~        <table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0" frame="void">
iOutputManager.println("        <table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" frame=\"void\">", true);
//ScriptWriter~~          <tr>
iOutputManager.println("          <tr>", true);
//ScriptWriter~~            <td valign="top" bgcolor="white" bordercolor="white">
iOutputManager.println("            <td valign=\"top\" bgcolor=\"white\" bordercolor=\"white\">", true);
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
//ScriptWriter~~  </td></tr></table>
iOutputManager.println("  </td></tr></table>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }
}
