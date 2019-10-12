//$Section=License$ID=417A4801001F$Preserve=no

/* ========================================================================= *
 *                                                                           *
 *                       The eSarks Software License                         *
 *                                                                           *
 *           Copyright (c) 2003 Architects of Software Design, Corp.         *
 *                           All rights reserved.                            *
 *                                                                           *
 * ========================================================================= *
 *                                                                           *
 * Redistribution and use in source and binary forms, with or without        *
 * modification, are permitted provided that the following conditions        *
 * are met:                                                                  *
 *                                                                           *
 * 1. Redistributions of source code must retain the above copyright notice, *
 *    this list of conditions and the following disclaimer.                  *
 *                                                                           *
 * 2. Redistributions in binary form must reproduce the above copyright      *
 *    notice, this list of conditions and the following disclaimer in the    *
 *    documentation and/or other materials provided with the distribution.   *
 *                                                                           *
 * 3. The end-user documentation included with the redistribution, if any,   *
 *    must include the following acknowlegement:                             *
 *                                                                           *
 *       "This product includes software developed by                        *
 *        Architects of Software Design, Corp. <http://www.esarks.com/>."    *
 *                                                                           *
 *    Alternately, this acknowlegement may appear in the software itself, if *
 *    and wherever such third-party acknowlegements normally appear.         *
 *                                                                           *
 * 4. The names "eSarks", "jac" or "Architects of Software Design, Corp."    *
 *    must not be used to endorse or promote products derived from this      *
 *    software without prior written permission.  For written permission,    *
 *    please contact <jac@esarks.com>.                                       *
 *                                                                           *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED WARRANTIES *
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY  *
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL   *
 * ARCHITECTS OF SOFTWARE DESIGN, CORP. OR ITS CONTRIBUTORS BE LIABLE FOR    *
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL    *
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS   *
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)     *
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,       *
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN  *
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE           *
 * POSSIBILITY OF SUCH DAMAGE.                                               *
 *                                                                           *
 * ========================================================================= */

//  Generated at 2005.01.08 10:34:33.937 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Model.script

//$Section=ChangeLog$ID=417A4801001F$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=417A4801001F$Preserve=no

package com.esarks.mic;

//$Section=ClassJavadoc$ID=417A4801001F$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=417A4801001F$Preserve=no
//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import com.esarks.jac.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
// SuperClass

//$Section=CustomDeclare$ID=417A4801001F$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=417A4801001F$Preserve=no

public class Model extends com.esarks.mic.View {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A4801001F$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A4801001F$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=417A4801001F$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=417A4801001F$Preserve=no
    public Model() {
//$Section=DefaultConstructor$ID=417A4801001F$Preserve=yes
//$Section=DefaultConstructor$ID=417A4801001F$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=417A4801001F$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=417A4801001F$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=417A4801001F$Preserve=yes
//$Section=DefaultDestructor$ID=417A4801001F$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=417A4801001F$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=417A4801001F$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=417A4801001F$Preserve=yes
//$Section=DefaultFreeResources$ID=417A4801001F$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=417E9FD20399$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=417E9FD20399$Preserve=no
    public Model( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Model.");
//$Section=Operation$ID=417E9FD20399$Preserve=yes
        super(aScript);
//$Section=Operation$ID=417E9FD20399$Preserve=no
    }

//$Section=OperationJavadoc$ID=417E5B7403B9$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417E5B7403B9$Preserve=no
    public void frameAppContentCustom( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Model.");
//$Section=Operation$ID=417E5B7403B9$Preserve=yes
//ScriptWriter~~    %><table width="100%" border="0" cellspacing="0" cellpadding="0"><%
    {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td><br><b>Documentation:</b><br><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td><br><b>Documentation:</b><br>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><!![mic.element:documentation]!><%
    {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.recursivelyTranslateProperties("[mic.element:documentation]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    renderHrefTag(iScriptFullName, iScriptInstanceName, "editDocumentationInit");
    renderHrefLink("<small>Edit Documentation</small>");
//ScriptWriter~~    %></tr></td><%
    {
//ScriptWriter~~~
iOutputManager.println("</tr></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></table><%
    {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    if (<!mic.element:has!>!size() == 0) return;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).size() == 0) return;
//ScriptWriter~~    %><table width="100%" border="0" cellspacing="0" cellpadding="0"><%
    {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td><br><b>Has Elements:</b><br><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td><br><b>Has Elements:</b><br>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!mic.element:has!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).resetIterator();
//ScriptWriter~~    while (<!mic.element:has!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).next()) {
      String lHasName = null;
//ScriptWriter~~      if (<!mic.element:has:element!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has:element")).size() > 0) {
//ScriptWriter~~        lHasName = <![mic.element:has:element]!>;
        lHasName = iSymbolTable.translateProperties("[mic.element:has:element]");
      }
//ScriptWriter~~      if (<!mic.element:has:link!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has:link")).size() > 0) {
//ScriptWriter~~        lHasName = <![mic.element:has:link]!>;
        lHasName = iSymbolTable.translateProperties("[mic.element:has:link]");
      }
//ScriptWriter~~      if (<!mic.element:has:file!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has:file")).size() > 0) {
//ScriptWriter~~        lHasName = <![mic.element:has:file]!>;
        lHasName = iSymbolTable.translateProperties("[mic.element:has:file]");
        setContext(iScript.getMasterScript());
//ScriptWriter~~        %><br><img src="<![micImages:Package]!>"> <%
        {
//ScriptWriter~~~
iOutputManager.println("<br><img src=\"" + iSymbolTable.translateProperties("[micImages:Package]") + "\"> ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        restoreContext();
//ScriptWriter~~        %>File <!%lHasName!><%
        {
//ScriptWriter~~~
iOutputManager.println("File " + lHasName + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
        if (lHasName != null && lHasName.startsWith(".")) lHasName = iScriptPackage + lHasName;
        if (scriptHelperExists(lHasName) == false) {
          MicScriptHelper lObject = (MicScriptHelper) loadScript(lHasName, "", false);
          lObject.setParent(iScriptFullName, iScriptInstanceName, this);
          register(iScript, lHasName, "", lObject);
        }
        Script lHasScript = getMicScriptHelper(lHasName).getScript();
        setContext(lHasScript);
//ScriptWriter~~        String lIcon = <![mic.element:type]!>;
        String lIcon = iSymbolTable.translateProperties("[mic.element:type]");
//ScriptWriter~~        if (<![mic.element:icon]!>.length() > 0) lIcon = <![mic.element:icon]!>;
        if (iSymbolTable.translateProperties("[mic.element:icon]").length() > 0) lIcon = iSymbolTable.translateProperties("[mic.element:icon]");
        restoreContext();
        setContext(iScript.getMasterScript());
//ScriptWriter~~        %><br><img src="<!%getImage(lIcon)!>"> <%
        {
//ScriptWriter~~~
iOutputManager.println("<br><img src=\"" + getImage(lIcon) + "\"> ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        restoreContext();
        setContext(lHasScript);
        renderHrefTag("*", iScriptFullName, iScriptInstanceName, "openNewInstance", lHasName, null);
//ScriptWriter~~        renderHrefLink("***" + <![mic.element:title]!>);
        renderHrefLink("***" + iSymbolTable.translateProperties("[mic.element:title]"));
        restoreContext();
      }
    }
//ScriptWriter~~    %></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></table><%
    {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//$Section=Operation$ID=417E5B7403B9$Preserve=no
    }

//$Section=OperationJavadoc$ID=417EA81C006D$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417EA81C006D$Preserve=no
    public void frameToolMenu( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Model.");
//$Section=Operation$ID=417EA81C006D$Preserve=yes
    if (hideWindowBar() == true) return;
    if (hasOpen() == false) {
      if (getState().compareTo("open") == 0) {
//ScriptWriter~~        %></td><td width="1" bgcolor="darkgray"></td><%
        {
//ScriptWriter~~~
iOutputManager.println("</td><td width=\"1\" bgcolor=\"darkgray\"></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        renderHrefTag("*", iScriptFullName, iScriptInstanceName, "setLifeCycleState", "minimize", null);
        renderHrefLink("Minimize");
//ScriptWriter~~        %></td><%
        {
//ScriptWriter~~~
iOutputManager.println("</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      if (getState().compareTo("minimize") == 0) {
//ScriptWriter~~        %></td><td width="1" bgcolor="darkgray"></td><%
        {
//ScriptWriter~~~
iOutputManager.println("</td><td width=\"1\" bgcolor=\"darkgray\"></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        renderHrefTag("*", iScriptFullName, iScriptInstanceName, "setLifeCycleState", "maximize", null);
        renderHrefLink("Maximize");
//ScriptWriter~~        %></td><%
        {
//ScriptWriter~~~
iOutputManager.println("</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      %></td><td width="1" bgcolor="darkgray"></td><%
      {
//ScriptWriter~~~
iOutputManager.println("</td><td width=\"1\" bgcolor=\"darkgray\"></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      renderHrefTag("*", iScriptFullName, iScriptInstanceName, "setLifeCycleState", "close", null);
      renderHrefLink("Close");
//ScriptWriter~~      %></td><%
      {
//ScriptWriter~~~
iOutputManager.println("</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//$Section=Operation$ID=417EA81C006D$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=417A4801001F$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A4801001F$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A4801001F$Preserve=no

//End of class---------------
}
