//$Section=License$ID=417A49EE01E4$Preserve=no

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

//  Generated at 2005.11.26 05:25:14.437 PM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: View.script

//$Section=ChangeLog$ID=417A49EE01E4$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=417A49EE01E4$Preserve=no

package com.esarks.mic;

//$Section=ClassJavadoc$ID=417A49EE01E4$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=417A49EE01E4$Preserve=no
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

//$Section=CustomDeclare$ID=417A49EE01E4$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=417A49EE01E4$Preserve=no

public class View extends com.esarks.mic.Component {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    protected boolean iRender = false;
    protected boolean iMaximized = false;
    protected boolean iHideWindowBar = false;
    protected ArrayList iFrames = new ArrayList();
    protected int iControlSequence = 0;
    protected ArrayList iViewList = new ArrayList();
    private View iParentView;
    private int iInstanceCount = 0;

//$Section=CustomClassDeclare$ID=417A49EE01E4$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A49EE01E4$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=417A49EE01E4$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=417A49EE01E4$Preserve=no
    public View() {
//$Section=DefaultConstructor$ID=417A49EE01E4$Preserve=yes
//$Section=DefaultConstructor$ID=417A49EE01E4$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=417A49EE01E4$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=417A49EE01E4$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=417A49EE01E4$Preserve=yes
//$Section=DefaultDestructor$ID=417A49EE01E4$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=417A49EE01E4$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=417A49EE01E4$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=417A49EE01E4$Preserve=yes
//$Section=DefaultFreeResources$ID=417A49EE01E4$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=417D97E4001F$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=417D97E4001F$Preserve=no
    public View( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D97E4001F$Preserve=yes
        super(aScript);
//$Section=Operation$ID=417D97E4001F$Preserve=no
    }

//$Section=OperationJavadoc$ID=418774930167$Preserve=yes
/**
 *
 * @param aFrame
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=418774930167$Preserve=no
    public Frame getFrame( String aFrame ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=418774930167$Preserve=yes
      Frame lFrame = null;
      for (int lIdx=0; lIdx < iFrames.size(); lIdx++) {
        lFrame = (Frame) iFrames.get(lIdx);
        if (lFrame.getName().compareTo(aFrame) == 0) {
          break;
        }
        lFrame = null;
      }
      return lFrame;
//$Section=Operation$ID=418774930167$Preserve=no
    }

//$Section=OperationJavadoc$ID=4187FEA7004E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4187FEA7004E$Preserve=no
    public void registerFrames( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4187FEA7004E$Preserve=yes
//$Section=Operation$ID=4187FEA7004E$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D4F5903C8$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D4F5903C8$Preserve=no
    public void frameAppContentCustom( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D4F5903C8$Preserve=yes
//ScriptWriter~~    if (<!$mic:frameView!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:frameView")).size() > 0) {
//ScriptWriter~~      frameView(<![$mic:frameView]!>);
      frameView(iSymbolTable.translateProperties("[$mic:frameView]"));
    }
//$Section=Operation$ID=417D4F5903C8$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D50EE01E4$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D50EE01E4$Preserve=no
    public String frameSubTitle( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D50EE01E4$Preserve=yes
    // Calling the parent hideWindowBar caused a reset of the registry entries...and an endless loop.
    // So, now hideWindowBar stores the results for retrieval by a child through getHideWindowBar
//ScriptWriter~~    if (<![mic.element:subTitle]!>.length() == 0 && iParentObject != null) {
    if (iSymbolTable.translateProperties("[mic.element:subTitle]").length() == 0 && iParentObject != null) {
      try {
        View lView = (View) iParentObject;
        if (lView.getHideWindowBar()) return lView.frameSubTitle();
      } catch (Throwable e) {
        return "";
      }
    }
//ScriptWriter~~    return <![mic.element:subTitle]!>;
    return iSymbolTable.translateProperties("[mic.element:subTitle]");
//$Section=Operation$ID=417D50EE01E4$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D511900BB$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D511900BB$Preserve=no
    public void frameHeading( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D511900BB$Preserve=yes
//ScriptWriter~~    %><b><![mic.element:title]!></b><!%frameSubTitle()!><%
    {
//ScriptWriter~~~
iOutputManager.println("<b>" + iSymbolTable.translateProperties("[mic.element:title]") + "</b>" + frameSubTitle() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=417D511900BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D511B036B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D511B036B$Preserve=no
    public void frameWindowBar( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D511B036B$Preserve=yes

    if (hideWindowBar() == true) return;

    String lColor = "Cyan";
    if (hasOpen() == false) lColor = "Green";
//ScriptWriter~~  %>  <tr bgcolor="#EFEDDE" bordercolor="#EFEDDE">
  {
//ScriptWriter~~~
iOutputManager.println("  <tr bgcolor=\"#EFEDDE\" bordercolor=\"#EFEDDE\">", true);
//ScriptWriter~~      <td background="/images/elipse<!%lColor!>Center.gif">
iOutputManager.println("      <td background=\"/images/elipse" + lColor + "Center.gif\">", true);
//ScriptWriter~~        <table width="100%" valign="top" border="0" cellspacing="0" cellpadding="0" frame="void">
iOutputManager.println("        <table width=\"100%\" valign=\"top\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" frame=\"void\">", true);
//ScriptWriter~~          <tr><td width="18" bgcolor="#EFEDDE" bordercolor="#EFEDDE"><img src="/images/elipse<!%lColor!>Left.gif"></td><td height="20" style="color:white;">
iOutputManager.println("          <tr><td width=\"18\" bgcolor=\"#EFEDDE\" bordercolor=\"#EFEDDE\"><img src=\"/images/elipse" + lColor + "Left.gif\"></td><td height=\"20\" style=\"color:white;\">", true);
//ScriptWriter~~            <% frameHeading(); %>
iOutputManager.println("            ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
 frameHeading(); {
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~          </td><td width="18" bgcolor="#EFEDDE" bordercolor="#EFEDDE"><img src="/images/elipse<!%lColor!>Right.gif"></td></tr>
iOutputManager.println("          </td><td width=\"18\" bgcolor=\"#EFEDDE\" bordercolor=\"#EFEDDE\"><img src=\"/images/elipse" + lColor + "Right.gif\"></td></tr>", true);
//ScriptWriter~~        </table>
iOutputManager.println("        </table>", true);
//ScriptWriter~~      </td>
iOutputManager.println("      </td>", true);
//ScriptWriter~~    </tr>
iOutputManager.println("    </tr>", true);
//ScriptWriter~~  <%
iOutputManager.println("  ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=417D511B036B$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D511C00EA$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D511C00EA$Preserve=no
    public void frameMenu( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D511C00EA$Preserve=yes
//$Section=Operation$ID=417D511C00EA$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D515F0109$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D515F0109$Preserve=no
    public void frameToolbar( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D515F0109$Preserve=yes
//ScriptWriter~~    <!mic.element:has!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).resetIterator();
//ScriptWriter~~    while (<!mic.element:has!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).next()) {
//ScriptWriter~~      %><table width="100%" border="0" cellspacing="0" cellpadding="0"><%
      {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td width="5"></td><td height="50" align="center"><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td width=\"5\"></td><td height=\"50\" align=\"center\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      String lHasScriptName = null;
//ScriptWriter~~      if (<![mic.element:has:element]!>.startsWith(".") == true) {
      if (iSymbolTable.translateProperties("[mic.element:has:element]").startsWith(".") == true) {
//ScriptWriter~~        lHasScriptName = iScriptPackage + <![mic.element:has:element]!>;
        lHasScriptName = iScriptPackage + iSymbolTable.translateProperties("[mic.element:has:element]");
      } else {
//ScriptWriter~~        lHasScriptName = <![mic.element:has:element]!>;
        lHasScriptName = iSymbolTable.translateProperties("[mic.element:has:element]");
      }
//ScriptWriter~~      if (<![mic.element:has:method]!>.compareTo("") == 0) {
      if (iSymbolTable.translateProperties("[mic.element:has:method]").compareTo("") == 0) {
        renderHrefTag("*", iScriptFullName, iScriptInstanceName, "openNewInstance", lHasScriptName, null);
      } else {
//ScriptWriter~~        renderHrefTag("*", iScriptFullName, iScriptInstanceName, <![mic.element:has:method]!>, lHasScriptName, null);
        renderHrefTag("*", iScriptFullName, iScriptInstanceName, iSymbolTable.translateProperties("[mic.element:has:method]"), lHasScriptName, null);
      }
//ScriptWriter~~      if (<![mic.element:has:title]!>.compareTo("") == 0) {
      if (iSymbolTable.translateProperties("[mic.element:has:title]").compareTo("") == 0) {
//ScriptWriter~~        renderHrefLink(<![mic.element:has:element]!>);
        renderHrefLink(iSymbolTable.translateProperties("[mic.element:has:element]"));
      } else {
//ScriptWriter~~        renderHrefLink(<![mic.element:has:title]!>);
        renderHrefLink(iSymbolTable.translateProperties("[mic.element:has:title]"));
      }
//ScriptWriter~~      %></td><td width="5"></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("</td><td width=\"5\"></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td width="5"></td><td height="1" bgcolor="darkgray"></td><td width="5"></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td width=\"5\"></td><td height=\"1\" bgcolor=\"darkgray\"></td><td width=\"5\"></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//$Section=Operation$ID=417D515F0109$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D51650242$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D51650242$Preserve=no
    public void frameToolMenu( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D51650242$Preserve=yes

    if (hideWindowBar() == true) return;

//ScriptWriter~~    <!mic.element:has!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).resetIterator();
//ScriptWriter~~    while (<!mic.element:has!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).next()) {
//ScriptWriter~~      %><td><%
      {
//ScriptWriter~~~
iOutputManager.println("<td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      String lHasScriptName = null;
//ScriptWriter~~      if (<![mic.element:has:element]!>.startsWith(".") == true) {
      if (iSymbolTable.translateProperties("[mic.element:has:element]").startsWith(".") == true) {
//ScriptWriter~~        lHasScriptName = iScriptPackage + <![mic.element:has:element]!>;
        lHasScriptName = iScriptPackage + iSymbolTable.translateProperties("[mic.element:has:element]");
      } else {
//ScriptWriter~~        lHasScriptName = <![mic.element:has:element]!>;
        lHasScriptName = iSymbolTable.translateProperties("[mic.element:has:element]");
      }
//ScriptWriter~~      if (<![mic.element:has:hidden]!>.compareTo("true") == 0) {
      if (iSymbolTable.translateProperties("[mic.element:has:hidden]").compareTo("true") == 0) {
//ScriptWriter~~        %><td style="color:red"><![mic.element:has:element]!></td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td style=\"color:red\">" + iSymbolTable.translateProperties("[mic.element:has:element]") + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      } else {
//ScriptWriter~~        if (<![mic.element:has:method]!>.compareTo("") == 0) {
        if (iSymbolTable.translateProperties("[mic.element:has:method]").compareTo("") == 0) {
//ScriptWriter~~          renderHrefTag("*", iScriptFullName, iScriptInstanceName, "openNewInstance", lHasScriptName, null, <![mic.element:has:target]!>);
          renderHrefTag("*", iScriptFullName, iScriptInstanceName, "openNewInstance", lHasScriptName, null, iSymbolTable.translateProperties("[mic.element:has:target]"));
        } else {
//ScriptWriter~~          renderHrefTag("*", iScriptFullName, iScriptInstanceName, <![mic.element:has:method]!>, lHasScriptName, null, <![mic.element:has:target]!>);
          renderHrefTag("*", iScriptFullName, iScriptInstanceName, iSymbolTable.translateProperties("[mic.element:has:method]"), lHasScriptName, null, iSymbolTable.translateProperties("[mic.element:has:target]"));
        }
//ScriptWriter~~        String lTitle = <![mic.element:has:title]!>;
        String lTitle = iSymbolTable.translateProperties("[mic.element:has:title]");
//ScriptWriter~~        if (<![mic.element:has:title]!>.compareTo("") == 0) {
        if (iSymbolTable.translateProperties("[mic.element:has:title]").compareTo("") == 0) {
//ScriptWriter~~          lTitle = <![mic.element:has:element]!>;
          lTitle = iSymbolTable.translateProperties("[mic.element:has:element]");
        }
        renderHrefLink(lTitle);
      }
//ScriptWriter~~      if (<!mic.element:has!>!isLast() == false) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).isLast() == false) {
//ScriptWriter~~        %></td><td width="1" bgcolor="darkgray"></td><%
        {
//ScriptWriter~~~
iOutputManager.println("</td><td width=\"1\" bgcolor=\"darkgray\"></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
    }
/*
//ScriptWriter~~    if (<!mic.element:frame!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:frame")).size() > 0) {
//ScriptWriter~~      if (<!mic.element:has!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:has")).size() > 0) {
//ScriptWriter~~        %></td><td width="1" bgcolor="darkgray"></td><%
        {
//ScriptWriter~~~
iOutputManager.println("</td><td width=\"1\" bgcolor=\"darkgray\"></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
//ScriptWriter~~      <!mic.element:frame!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:frame")).resetIterator();
//ScriptWriter~~      while (<!mic.element:frame!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:frame")).next()) {
//ScriptWriter~~        %><td><%
        {
//ScriptWriter~~~
iOutputManager.println("<td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        renderHrefTag("*", iScriptFullName, iScriptInstanceName, "frameInit", <![mic.element:frame:name]!>, null);
        renderHrefTag("*", iScriptFullName, iScriptInstanceName, "frameInit", iSymbolTable.translateProperties("[mic.element:frame:name]"), null);
//ScriptWriter~~        renderHrefLink(<![mic.element:frame:title]!>);
        renderHrefLink(iSymbolTable.translateProperties("[mic.element:frame:title]"));
//ScriptWriter~~        %></td><%
        {
//ScriptWriter~~~
iOutputManager.println("</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        if (<!mic.element:frame!>!isLast() == false) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:frame")).isLast() == false) {
//ScriptWriter~~          %></td><td width="1" bgcolor="darkgray"></td><%
          {
//ScriptWriter~~~
iOutputManager.println("</td><td width=\"1\" bgcolor=\"darkgray\"></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }
    }
*/
    if (hasOpen() == false) {
      if (getState().compareTo("open") == 0 && getMaximized() == true) {
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
      if (getMaximized() == false) {
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
//$Section=Operation$ID=417D51650242$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D51B900BB$Preserve=yes
/**
 *
 * @param aTemplate
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D51B900BB$Preserve=no
    public void frameAppContent( String aTemplate ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D51B900BB$Preserve=yes
    if (getState().compareTo("init") == 0) return;
    if (getState().compareTo("close") == 0) return;

    if (hasOpen() == false) {

      if (getState().compareTo("open") == 0 && getMaximized() == true) frameAppContentCustom();

    } else {
//ScriptWriter~~      <!$jac:registry:script!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).resetIterator();
//ScriptWriter~~      while (<!$jac:registry:script!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script")).next()) {
//ScriptWriter~~        <!$jac:registry:script:instance!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).resetIterator();
//ScriptWriter~~        while (<!$jac:registry:script:instance!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance")).next()) {
//ScriptWriter~~          MicScriptHelper lContextObject = (MicScriptHelper) <!$jac:registry:script:instance:object!>!getValueObject();
          MicScriptHelper lContextObject = (MicScriptHelper) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:registry:script:instance:object")).getValueObject();
          if (lContextObject.getState().compareTo("open") == 0) {
            MicScriptHelper lMicScriptHelper = (MicScriptHelper) loadScript(aTemplate);
            lMicScriptHelper.execute(lContextObject);
          }
        }
      }
    }
//$Section=Operation$ID=417D51B900BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D51C10177$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D51C10177$Preserve=no
    public void frameAppContent( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D51C10177$Preserve=yes
    frameAppContent("com.esarks.arm.applicationFramework.AppComponent");
//$Section=Operation$ID=417D51C10177$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D51D802CE$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D51D802CE$Preserve=no
    public void frameModelContent( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D51D802CE$Preserve=yes
//$Section=Operation$ID=417D51D802CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D51F301D4$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D51F301D4$Preserve=no
    public void frameStatus( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D51F301D4$Preserve=yes
//$Section=Operation$ID=417D51F301D4$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D51F900CB$Preserve=yes
/**
 *
 * @param aSection
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D51F900CB$Preserve=no
    public void renderSection( String aSection ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D51F900CB$Preserve=yes
    String lMethod = aSection;
//ScriptWriter~~    <!mic.element:renderSection!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:renderSection")).resetIterator();
//ScriptWriter~~    if (<!mic.element!>!scan("renderSection", aSection) == true ) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element")).scan("renderSection", aSection) == true ) {
//ScriptWriter~~      lMethod = <![mic.element:renderSection:method]!>;
      lMethod = iSymbolTable.translateProperties("[mic.element:renderSection:method]");
    }

    iScript.execMethod(this, lMethod);
//$Section=Operation$ID=417D51F900CB$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D541703D8$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D541703D8$Preserve=no
    public void renderTableTop( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D541703D8$Preserve=yes
//ScriptWriter~~    %><table width="100%" border="0" cellspacing="0" cellpadding="0"><%
    {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=417D541703D8$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D54240109$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D54240109$Preserve=no
    public void renderTableBottom( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D54240109$Preserve=yes
//ScriptWriter~~    %></table><%
    {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=417D54240109$Preserve=no
    }

//$Section=OperationJavadoc$ID=42991C08036B$Preserve=yes
/**
 *
 * @param aLoc
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @param aExecArgument
 *
 * @param aAction
 *
 * @param aTarget
 *
 * @param aAnchor
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42991C08036B$Preserve=no
    public void renderHrefTag( String aLoc, String aExecScript, String aInstance, String aExecMethod, String aExecArgument, String aAction, String aTarget, String aAnchor ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=42991C08036B$Preserve=yes

    String lHref = getHrefId();
    setContext(iScript.getMasterScript());
//ScriptWriter~~    <!$jac:href:id!>!set(lHref);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id")).set(lHref);
//ScriptWriter~~    <!$jac:href:id:script!>!set(aExecScript);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:script")).set(aExecScript);
//ScriptWriter~~    <!$jac:href:id:instance!>!set(aInstance);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:instance")).set(aInstance);
//ScriptWriter~~    <!$jac:href:id:method!>!set(aExecMethod);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:method")).set(aExecMethod);
//ScriptWriter~~    if (aExecArgument != null) <!$jac:href:id:argument!>!set(aExecArgument);
    if (aExecArgument != null) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:argument")).set(aExecArgument);
//ScriptWriter~~    if (aAction != null) <!$jac:href:id:action!>!set(aAction);
    if (aAction != null) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:action")).set(aAction);
    restoreContext();

    HttpServletRequest lServletRequest = (HttpServletRequest) getServletRequest();
    if (aAnchor != null) {
//ScriptWriter~~      %><a href="<!%lServletRequest.getRequestURI()!>?loc=<!%aLoc!>&href=<!%lHref!>#<!%aAnchor!>"<%
      {
//ScriptWriter~~~
iOutputManager.println("<a href=\"" + lServletRequest.getRequestURI() + "?loc=" + aLoc + "&href=" + lHref + "#" + aAnchor + "\"", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    } else {
//ScriptWriter~~      %><a href="<!%lServletRequest.getRequestURI()!>?loc=<!%aLoc!>&href=<!%lHref!>"<%
      {
//ScriptWriter~~~
iOutputManager.println("<a href=\"" + lServletRequest.getRequestURI() + "?loc=" + aLoc + "&href=" + lHref + "\"", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
    if (aTarget != null && aTarget.length() > 0) {
//ScriptWriter~~      %> target="<!%aTarget!>"<%
      {
//ScriptWriter~~~
iOutputManager.println(" target=\"" + aTarget + "\"", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    %>><%
    {
//ScriptWriter~~~
iOutputManager.println(">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=42991C08036B$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D5F9A02BF$Preserve=yes
/**
 *
 * @param aLoc
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @param aExecArgument
 *
 * @param aAction
 *
 * @param aTarget
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D5F9A02BF$Preserve=no
    public void renderHrefTag( String aLoc, String aExecScript, String aInstance, String aExecMethod, String aExecArgument, String aAction, String aTarget ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D5F9A02BF$Preserve=yes
    renderHrefTag(aLoc, aExecScript, aInstance, aExecMethod, aExecArgument, aAction, aTarget, null);
//$Section=Operation$ID=417D5F9A02BF$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D561401A5$Preserve=yes
/**
 *
 * @param aLoc
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @param aExecArgument
 *
 * @param aAction
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D561401A5$Preserve=no
    public void renderHrefTag( String aLoc, String aExecScript, String aInstance, String aExecMethod, String aExecArgument, String aAction ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D561401A5$Preserve=yes
    renderHrefTag(aLoc, aExecScript, aInstance, aExecMethod, aExecArgument, aAction, null);
//$Section=Operation$ID=417D561401A5$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D562303C8$Preserve=yes
/**
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @param aExecArgument
 *
 * @param aAction
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D562303C8$Preserve=no
    public void renderHrefTag( String aExecScript, String aInstance, String aExecMethod, String aExecArgument, String aAction ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D562303C8$Preserve=yes
    renderHrefTag("*", aExecScript, aInstance, aExecMethod, aExecArgument, aAction);
//$Section=Operation$ID=417D562303C8$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D56260000$Preserve=yes
/**
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @param aExecArgument
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D56260000$Preserve=no
    public void renderHrefTag( String aExecScript, String aInstance, String aExecMethod, String aExecArgument ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D56260000$Preserve=yes
    renderHrefTag("*", aExecScript, aInstance, aExecMethod, aExecArgument, null);
//$Section=Operation$ID=417D56260000$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D56260119$Preserve=yes
/**
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D56260119$Preserve=no
    public void renderHrefTag( String aExecScript, String aInstance, String aExecMethod ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D56260119$Preserve=yes
    renderHrefTag("*", aExecScript, aInstance, aExecMethod, null, null);
//$Section=Operation$ID=417D56260119$Preserve=no
    }

//$Section=OperationJavadoc$ID=4288FB89033E$Preserve=yes
/**
 *
 * @param aLoc
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @param aExecArgument
 *
 * @param aAction
 *
 * @param aTarget
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4288FB89033E$Preserve=no
    public void renderPostTag( String aLoc, String aExecScript, String aInstance, String aExecMethod, String aExecArgument, String aAction, String aTarget ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4288FB89033E$Preserve=yes

    String lHref = getHrefId();
    setContext(iScript.getMasterScript());
//ScriptWriter~~    <!$jac:href:id!>!set(lHref);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id")).set(lHref);
//ScriptWriter~~    <!$jac:href:id:script!>!set(aExecScript);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:script")).set(aExecScript);
//ScriptWriter~~    <!$jac:href:id:instance!>!set(aInstance);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:instance")).set(aInstance);
//ScriptWriter~~    <!$jac:href:id:method!>!set(aExecMethod);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:method")).set(aExecMethod);
//ScriptWriter~~    if (aExecArgument != null) <!$jac:href:id:argument!>!set(aExecArgument);
    if (aExecArgument != null) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:argument")).set(aExecArgument);
//ScriptWriter~~    if (aAction != null) <!$jac:href:id:action!>!set(aAction);
    if (aAction != null) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id:action")).set(aAction);
    restoreContext();

    HttpServletRequest lServletRequest = (HttpServletRequest) getServletRequest();
//ScriptWriter~~    %>action="<!%lServletRequest.getRequestURI()!>?loc=<!%aLoc!>&href=<!%lHref!>"<%
    {
//ScriptWriter~~~
iOutputManager.println("action=\"" + lServletRequest.getRequestURI() + "?loc=" + aLoc + "&href=" + lHref + "\"", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=4288FB89033E$Preserve=no
    }

//$Section=OperationJavadoc$ID=4288FB890355$Preserve=yes
/**
 *
 * @param aLoc
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @param aExecArgument
 *
 * @param aAction
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4288FB890355$Preserve=no
    public void renderPostTag( String aLoc, String aExecScript, String aInstance, String aExecMethod, String aExecArgument, String aAction ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4288FB890355$Preserve=yes
    renderPostTag(aLoc, aExecScript, aInstance, aExecMethod, aExecArgument, aAction, null);
//$Section=Operation$ID=4288FB890355$Preserve=no
    }

//$Section=OperationJavadoc$ID=4288FB89035E$Preserve=yes
/**
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @param aExecArgument
 *
 * @param aAction
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4288FB89035E$Preserve=no
    public void renderPostTag( String aExecScript, String aInstance, String aExecMethod, String aExecArgument, String aAction ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4288FB89035E$Preserve=yes
    renderPostTag("*", aExecScript, aInstance, aExecMethod, aExecArgument, aAction);
//$Section=Operation$ID=4288FB89035E$Preserve=no
    }

//$Section=OperationJavadoc$ID=4288FB890364$Preserve=yes
/**
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @param aExecArgument
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4288FB890364$Preserve=no
    public void renderPostTag( String aExecScript, String aInstance, String aExecMethod, String aExecArgument ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4288FB890364$Preserve=yes
    renderPostTag("*", aExecScript, aInstance, aExecMethod, aExecArgument, null);
//$Section=Operation$ID=4288FB890364$Preserve=no
    }

//$Section=OperationJavadoc$ID=4288FB89036D$Preserve=yes
/**
 *
 * @param aExecScript
 *
 * @param aInstance
 *
 * @param aExecMethod
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4288FB89036D$Preserve=no
    public void renderPostTag( String aExecScript, String aInstance, String aExecMethod ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4288FB89036D$Preserve=yes
    renderPostTag("*", aExecScript, aInstance, aExecMethod, null, null);
//$Section=Operation$ID=4288FB89036D$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D56260290$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D56260290$Preserve=no
    public void renderHrefProperty( String aPropertyName, String aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D56260290$Preserve=yes
//ScriptWriter~~    %>&<!%aPropertyName!>=<![href@" + aPropertyValue + "]!><%
    {
//ScriptWriter~~~
iOutputManager.println("&" + aPropertyName + "=" + iSymbolTable.translateProperties("[href@" + aPropertyValue + "]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=417D56260290$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D5627008C$Preserve=yes
/**
 *
 * @param aLinkText
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D5627008C$Preserve=no
    public void renderHrefLink( String aLinkText ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D5627008C$Preserve=yes
//ScriptWriter~~    %>"><!%aLinkText!></a><%
    {
//ScriptWriter~~~
iOutputManager.println("\">" + aLinkText + "</a>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=417D5627008C$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D5A0500BB$Preserve=yes
/**
 *
 * @param aFrame
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D5A0500BB$Preserve=no
    public void frameInit( String aFrame ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D5A0500BB$Preserve=yes
    iScript.execMethod(this, "framePreInit_" + aFrame, new Object[]{});
//ScriptWriter~~    <!$mic:context:frame." + aFrame + "!>!reset("");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:context:frame." + aFrame + "")).reset("");
//ScriptWriter~~    <!$mic:frameView!>!reset(aFrame);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:frameView")).reset(aFrame);
    iScript.execMethod(this, "framePostInit_" + aFrame, new Object[]{});
//$Section=Operation$ID=417D5A0500BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D5A19009C$Preserve=yes
/**
 *
 * @param aFrame
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D5A19009C$Preserve=no
    public void frameView( String aFrame ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D5A19009C$Preserve=yes

    Frame lFrame = getFrame(aFrame);
    if (lFrame == null) return;

    iScript.execMethod(this, "framePreView_" + aFrame, new Object[]{});
    if (lFrame.getTitle().length() > 0) {
//ScriptWriter~~      %><table width="100%" border="1" bordercolor="#5555FF" cellspacing="0" cellpadding="0"><%
      {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" border=\"1\" bordercolor=\"#5555FF\" cellspacing=\"0\" cellpadding=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><tr><td bgcolor="#5555FF"><font color="#FFFFFF"><b><!%lFrame.getTitle()!></b></font></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("<tr><td bgcolor=\"#5555FF\"><font color=\"#FFFFFF\"><b>" + lFrame.getTitle() + "</b></font></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }

//ScriptWriter~~    %><table width="100%" border="0" cellspacing="0" cellpadding="0"><%
    {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    ArrayList lErrors = lFrame.getErrors();
    if (lErrors != null && lErrors.size() > 0) {
      boolean lDisplayErrors = false;
      for (int lIdx = 0; lIdx < lErrors.size(); lIdx++) {
        com.esarks.arm.model.jeo.ErrorJeo lError = (com.esarks.arm.model.jeo.ErrorJeo) lErrors.get(lIdx);
        if (lError.getSeverity() >= 10) continue;
        if (lDisplayErrors == false) {
//ScriptWriter~~          %><tr><td><%
          {
//ScriptWriter~~~
iOutputManager.println("<tr><td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><table width="100%" border="1" bordercolor="#770000" bgcolor="#FFCCCC" cellspacing="0" cellpadding="0"><%
          {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" border=\"1\" bordercolor=\"#770000\" bgcolor=\"#FFCCCC\" cellspacing=\"0\" cellpadding=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          lDisplayErrors = true;
        }
//ScriptWriter~~        %><tr bordercolor="#FF9999"><td><font color="#AA0000"><!%lError.getText()!></font></td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr bordercolor=\"#FF9999\"><td><font color=\"#AA0000\">" + lError.getText() + "</font></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      if (lDisplayErrors) {
//ScriptWriter~~        %></table></td></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("</table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
    }
//ScriptWriter~~    %><tr><td bgcolor="#DDDDFF"><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td bgcolor=\"#DDDDFF\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><form name="form" method="post" action="Index.jsp?loc=*"><%
      {
//ScriptWriter~~~
iOutputManager.println("<form name=\"form\" method=\"post\" action=\"Index.jsp?loc=*\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><input type="hidden" name="script" value="<!%iScriptFullName!>"><%
        {
//ScriptWriter~~~
iOutputManager.println("<input type=\"hidden\" name=\"script\" value=\"" + iScriptFullName + "\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><input type="hidden" name="instance" value="<!%iScriptInstanceName!>"><%
        {
//ScriptWriter~~~
iOutputManager.println("<input type=\"hidden\" name=\"instance\" value=\"" + iScriptInstanceName + "\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><input type="hidden" name="method" value="frameProcess"><%
        {
//ScriptWriter~~~
iOutputManager.println("<input type=\"hidden\" name=\"method\" value=\"frameProcess\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><input type="hidden" name="argument" value="<!%aFrame!>"><%
        {
//ScriptWriter~~~
iOutputManager.println("<input type=\"hidden\" name=\"argument\" value=\"" + aFrame + "\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~        %><br><%
        {
//ScriptWriter~~~
iOutputManager.println("<br>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        renderFrame(aFrame);
        iScript.execMethod(this, "frameContentView_" + aFrame, new Object[]{});
//ScriptWriter~~      %></form><%
      {
//ScriptWriter~~~
iOutputManager.println("</form>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %></td></tr></table><%
      {
//ScriptWriter~~~
iOutputManager.println("</td></tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iScript.execMethod(this, "framePostView_" + aFrame, new Object[]{});
//$Section=Operation$ID=417D5A19009C$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D5A260196$Preserve=yes
/**
 *
 * @param aFrame
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D5A260196$Preserve=no
    public void frameProcess( String aFrame ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D5A260196$Preserve=yes

    Frame lFrame = getFrame(aFrame);
    if (lFrame == null) return;

    iScript.execMethod(this, "framePreProcess_" + aFrame, new Object[]{});
    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
    com.esarks.arm.model.jeo.RequestJeo lRequestJeo = lServiceJeo.getRequest();
    lFrame.setServiceJeo(lServiceJeo);
    ServletRequest lServletRequest = getServletRequest();

    for (int lIdx = 0; lIdx < lFrame.controlSize(); lIdx++) {
      Control lControl = (Control) lFrame.getControl(lIdx);
      if (lControl.getType().compareTo("text") == 0) {
        TextControl lTextControl = (TextControl) lControl;
        if (lTextControl.getUppercase()) {
          lTextControl.getControlValue().setValue(lServletRequest.getParameter(lControl.getName()).trim().toUpperCase());
        } else {
          lTextControl.getControlValue().setValue(lServletRequest.getParameter(lControl.getName()).trim());
        }
        if (lTextControl.getControlValue().getValue().equals("")) {
          lRequestJeo.set(lControl.getName(), new PropertyValue());
        } else {
          lRequestJeo.set(lControl.getName(), lTextControl.getControlValue().getValue());
        }
      }
      else if (lControl.getType().compareTo("password") == 0) {
        TextControl lTextControl = (TextControl) lControl;
        lTextControl.getControlValue().setValue(lServletRequest.getParameter(lControl.getName()));
        if (lTextControl.getControlValue().getValue().equals("")) {
          lRequestJeo.set(lControl.getName(), new PropertyValue());
        } else {
          lRequestJeo.set(lControl.getName(), lTextControl.getControlValue().getValue());
        }
      }
      else if (lControl.getType().compareTo("select") == 0) {
        OptionControl lOptionControl = (OptionControl) lControl;
        String lValue = lServletRequest.getParameter(lControl.getName());
        for (int lIdx2=0; lIdx2 < lOptionControl.controlValueSize(); lIdx2++) {
          OptionValue lOptionValue = lOptionControl.getControlValue(lIdx2);
          if (lOptionValue.getValue().compareTo(lValue) == 0) {
            lOptionValue.setSelected(true);
            lRequestJeo.set(lControl.getName() + ":" + lOptionValue.getName(), true);
          } else {
            lOptionValue.setSelected(false);
            lRequestJeo.set(lControl.getName() + ":" + lOptionValue.getName(), false);
          }
        }
      }
      else if (lControl.getType().compareTo("checkbox") == 0) {
        OptionControl lOptionControl = (OptionControl) lControl;
        for (int lIdx2=0; lIdx2 < lOptionControl.controlValueSize(); lIdx2++) {
          OptionValue lOptionValue = lOptionControl.getControlValue(lIdx2);
          String lValue = lServletRequest.getParameter(lControl.getName() + "_" + lOptionValue.getValue());
          if (lValue != null) {
            lOptionValue.setSelected(true);
            lRequestJeo.set(lControl.getName() + ":" + lOptionValue.getName(), true);
          } else {
            lOptionValue.setSelected(false);
            lRequestJeo.set(lControl.getName() + ":" + lOptionValue.getName(), false);
          }
        }
      }
      else if (lControl.getType().compareTo("radio") == 0) {
        OptionControl lOptionControl = (OptionControl) lControl;
        for (int lIdx2=0; lIdx2 < lOptionControl.controlValueSize(); lIdx2++) {
          String lValue = lServletRequest.getParameter(lControl.getName() + lIdx2);
          OptionValue lOptionValue = lOptionControl.getControlValue(lIdx2);
          if (lValue != null) {
            lOptionValue.setSelected(true);
            lRequestJeo.set(lControl.getName() + ":" + lOptionValue.getName(), true);
          } else {
            lOptionValue.setSelected(false);
            lRequestJeo.set(lControl.getName() + ":" + lOptionValue.getName(), false);
          }
        }
      }
      else if (lControl.getType().compareTo("date") == 0) {
        String lControlName = lControl.getName();
        String lDateAsString = lServletRequest.getParameter(lControlName + "_mm") + "/" + lServletRequest.getParameter(lControlName + "_dd") + "/" + lServletRequest.getParameter(lControlName + "_yyyy");
        if (lDateAsString.compareTo("//") == 0) lDateAsString = "";
        SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition lParsePosition = new ParsePosition(0);
        if (lSimpleDateFormat.parse(lDateAsString, lParsePosition) == null) {
          lDateAsString = "";
        }
        DateValue lDateValue = (DateValue) lControl.getControlValue();
        lDateValue.setValue(lDateAsString);
        lDateValue.setMm(lServletRequest.getParameter(lControlName + "_mm"));
        lDateValue.setDd(lServletRequest.getParameter(lControlName + "_dd"));
        lDateValue.setYyyy(lServletRequest.getParameter(lControlName + "_yyyy"));

        lRequestJeo.set(lControl.getName(), lDateAsString);
        lRequestJeo.set(lControl.getName() + ":mm", lDateValue.getMm());
        lRequestJeo.set(lControl.getName() + ":dd", lDateValue.getDd());
        lRequestJeo.set(lControl.getName() + ":yyyy", lDateValue.getYyyy());
      }
      else if (lControl.getType().compareTo("submit") == 0) {
        SubmitControl lSubmitControl = (SubmitControl) lControl;
        for (int lIdx2=0; lIdx2 < lSubmitControl.controlValueSize(); lIdx2++) {
          String lValue = lServletRequest.getParameter(lControl.getName() + lIdx2);
          ButtonValue lButtonValue = lSubmitControl.getControlValue(lIdx2);
          if (lValue != null) {
            lButtonValue.setSelected(true);
            lServiceJeo.setPropertyValue("script", new PropertyValue(lButtonValue.getService()));
            lServiceJeo.setPropertyValue("method", new PropertyValue(lButtonValue.getMethod()));
            lServiceJeo.setPropertyValue("map", new PropertyValue(lButtonValue.getMap()));
            lServiceJeo.setPropertyValue("event", new PropertyValue(lButtonValue.getEvent()));
          } else {
            lButtonValue.setSelected(false);
          }
        }
      }
      else if (lControl.getType().compareTo("data") == 0) {
        lRequestJeo.set(lControl.getName(), lControl.getControlValue().getValue());
      }
    }
    iScript.execMethod(this, "framePostProcess_" + aFrame, new Object[]{});
    if (lServiceJeo.getPropertyValue("suppressService").getValueType() == 0 &&
        lServiceJeo.getPropertyValue("script").getValueType() != 0 && lServiceJeo.getPropertyValue("script").toString().compareTo("") != 0 &&
        lServiceJeo.getPropertyValue("method").getValueType() != 0 && lServiceJeo.getPropertyValue("method").toString().compareTo("") != 0) {
        Object lObject = loadScript(lServiceJeo.getPropertyValue("script").toString(), "");
        iScript.execMethod(lObject, lServiceJeo.getPropertyValue("method").toString(), new Object[] {lServiceJeo});
        if (lServiceJeo.getErrorSize() == 0 || lServiceJeo.getMostSevereError().getSeverity() >= 10) {
          iScript.execMethod(this, lServiceJeo.getPropertyValue("map").toString(), new Object[] {lFrame});
        }
    }
    if (lServiceJeo.getPropertyValue("suppressEvent").getValueType() == 0 &&
        lServiceJeo.getPropertyValue("event").getValueType() != 0 && lServiceJeo.getPropertyValue("event").toString().compareTo("") != 0) {
        iScript.execMethod(this, lServiceJeo.getPropertyValue("event").toString(), new Object[] {lFrame});
    }
    iScript.execMethod(this, "framePostServiceProcess_" + aFrame, new Object[]{});
    lFrame.setErrors(lServiceJeo.getErrors());
    lFrame.setServiceJeo(null);
//$Section=Operation$ID=417D5A260196$Preserve=no
    }

//$Section=OperationJavadoc$ID=417D5CF503C8$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417D5CF503C8$Preserve=no
    public boolean hideWindowBar( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417D5CF503C8$Preserve=yes
    if (getProperty("hideWindowBar").compareTo("true") == 0) {
      if (hasAny() == true && hasOpenEndNode() == true) {
        iHideWindowBar = true;
        return true;
      }
    }
    iHideWindowBar = false;
    return false;
//$Section=Operation$ID=417D5CF503C8$Preserve=no
    }

//$Section=OperationJavadoc$ID=417DDE4102FD$Preserve=yes
/**
 *
 * @param aState
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417DDE4102FD$Preserve=no
    public void setLifeCycleState( String aState ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417DDE4102FD$Preserve=yes

         if (aState.compareTo("init") == 0) {
           iState = aState;
           iRender = false;
           iMaximized = false;
           setLifeCycleState_init();
         }
         else if (iState.compareTo("open") != 0 && aState.compareTo("open") == 0) {
           iState = aState;
           iRender = true;
           iMaximized = true;
           if (iFrames.size() > 0) {
             Frame lFrame = (Frame) iFrames.get(0);
             frameInit(lFrame.getName());
           }
           setLifeCycleState_open();
         }
         else if (aState.compareTo("maximize") == 0) {
           iRender = true;
           iMaximized = true;
         }
         else if (aState.compareTo("minimize") == 0) {
           iRender = true;
           iMaximized = false;
         }
         else if (aState.compareTo("doNotRender") == 0) {
           iRender = false;
         }
         else if (aState.compareTo("render") == 0) {
           iRender = true;
         }
         else if (aState.compareTo("close") == 0) {
           iState = aState;
           iRender = false;
           iMaximized = false;
           if (allowClose() == false) return;
           ((MicScriptHelper)iParentObject).unregister(((MicScriptHelper)iParentObject).getScript(), iScriptFullName, iScriptInstanceName, this);
//ScriptWriter~~           <!$mic!>!remove();
           iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic")).remove();
//ScriptWriter~~           <!mic.element!>!remove();
           iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element")).remove();
           setContext(iScript.getMasterScript());
//ScriptWriter~~           <!$jac:scriptHelper:" + iScriptFullName + "!>!resetIterator();
           iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:scriptHelper:" + iScriptFullName + "")).resetIterator();
//ScriptWriter~~           if (<!$jac:scriptHelper!>!scan(iScriptFullName + ":instance", iScriptInstanceName)) {
           if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:scriptHelper")).scan(iScriptFullName + ":instance", iScriptInstanceName)) {
//ScriptWriter~~             <!$jac:scriptHelper:" + iScriptFullName + "!>!removeValue();
             iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:scriptHelper:" + iScriptFullName + "")).removeValue();
           }
           restoreContext();
           freeResources();
           return;
         }
//$Section=Operation$ID=417DDE4102FD$Preserve=no
    }

//$Section=OperationJavadoc$ID=4182BB000213$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4182BB000213$Preserve=no
    public void setLifeCycleState_init( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4182BB000213$Preserve=yes
      registerFrames();
//$Section=Operation$ID=4182BB000213$Preserve=no
    }

//$Section=OperationJavadoc$ID=4182BB0003C8$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4182BB0003C8$Preserve=no
    public void setLifeCycleState_open( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4182BB0003C8$Preserve=yes
//$Section=Operation$ID=4182BB0003C8$Preserve=no
    }

//$Section=OperationJavadoc$ID=4184E9DF03A9$Preserve=yes
/**
 *
 * @param aControl
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4184E9DF03A9$Preserve=no
    public void renderControlPassword( TextControl aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4184E9DF03A9$Preserve=yes
//ScriptWriter~~    %><tr valign="middle" height="30"><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr valign=\"middle\" height=\"30\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="right"><!%aControl.getCaption()!></td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"right\">" + aControl.getCaption() + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td>&nbsp;&nbsp;&nbsp;</td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td>&nbsp;&nbsp;&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="left"><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"left\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><input type="password" maxlength="<!%aControl.getMaxLength()!>" name="<!%aControl.getName()!>" size="<!%aControl.getSize()!>"<%
    {
//ScriptWriter~~~
iOutputManager.println("<input type=\"password\" maxlength=\"" + aControl.getMaxLength() + "\" name=\"" + aControl.getName() + "\" size=\"" + aControl.getSize() + "\"", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %> value="<!%aControl.getControlValue().getValue()!>"<%
    {
//ScriptWriter~~~
iOutputManager.println(" value=\"" + aControl.getControlValue().getValue() + "\"", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %>><%
    {
//ScriptWriter~~~
iOutputManager.println(">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></td><%
    {
//ScriptWriter~~~
iOutputManager.println("</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=4184E9DF03A9$Preserve=no
    }

//$Section=OperationJavadoc$ID=4184E9DF03B9$Preserve=yes
/**
 *
 * @param aControl
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4184E9DF03B9$Preserve=no
    public void renderControlText( TextControl aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4184E9DF03B9$Preserve=yes
//ScriptWriter~~    %><tr valign="middle" height="30"><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr valign=\"middle\" height=\"30\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="right"><!%aControl.getCaption()!></td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"right\">" + aControl.getCaption() + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td>&nbsp;&nbsp;&nbsp;</td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td>&nbsp;&nbsp;&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="left"><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"left\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><input type="text" maxlength="<!%aControl.getMaxLength()!>" name="<!%aControl.getName()!>" size="<!%aControl.getSize()!>"<%
    {
//ScriptWriter~~~
iOutputManager.println("<input type=\"text\" maxlength=\"" + aControl.getMaxLength() + "\" name=\"" + aControl.getName() + "\" size=\"" + aControl.getSize() + "\"", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %> value="<!%aControl.getControlValue().getValue()!>"<%
    {
//ScriptWriter~~~
iOutputManager.println(" value=\"" + aControl.getControlValue().getValue() + "\"", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %>><%
    {
//ScriptWriter~~~
iOutputManager.println(">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></td><%
    {
//ScriptWriter~~~
iOutputManager.println("</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=4184E9DF03B9$Preserve=no
    }

//$Section=OperationJavadoc$ID=4184E9DF03BB$Preserve=yes
/**
 *
 * @param aControl
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4184E9DF03BB$Preserve=no
    public void renderControlCheckbox( OptionControl aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4184E9DF03BB$Preserve=yes
//ScriptWriter~~    %><tr valign="middle" height="30"><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr valign=\"middle\" height=\"30\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="right"><!%aControl.getCaption()!></td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"right\">" + aControl.getCaption() + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td>&nbsp;&nbsp;&nbsp;</td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td>&nbsp;&nbsp;&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="left"><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"left\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    for (int lIdx = 0; lIdx < aControl.controlValueSize(); lIdx++) {
      OptionValue lOptionValue = aControl.getControlValue(lIdx);
      String lChecked = "";
      if (lOptionValue.getSelected()) lChecked = " checked";
//ScriptWriter~~      %><input type="checkbox" name="<!%aControl.getName()!>_<!%lOptionValue.getValue()!>" value="<!%lOptionValue.getValue()!>" <!%lChecked!>><!%lOptionValue.getName()!><%
      {
//ScriptWriter~~~
iOutputManager.println("<input type=\"checkbox\" name=\"" + aControl.getName() + "_" + lOptionValue.getValue() + "\" value=\"" + lOptionValue.getValue() + "\" " + lChecked + ">" + lOptionValue.getName() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><br><%
      {
//ScriptWriter~~~
iOutputManager.println("<br>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    %><br></td><%
    {
//ScriptWriter~~~
iOutputManager.println("<br></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=4184E9DF03BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=4184E9DF03C8$Preserve=yes
/**
 *
 * @param aControl
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4184E9DF03C8$Preserve=no
    public void renderControlRadio( OptionControl aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4184E9DF03C8$Preserve=yes
//ScriptWriter~~    %><tr valign="middle" height="30"><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr valign=\"middle\" height=\"30\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="right"><!%aControl.getCaption()!></td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"right\">" + aControl.getCaption() + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td>&nbsp;&nbsp;&nbsp;</td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td>&nbsp;&nbsp;&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="left"><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"left\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    for (int lIdx = 0; lIdx < aControl.controlValueSize(); lIdx++) {
      OptionValue lOptionValue = aControl.getControlValue(lIdx);
      String lChecked = "";
      if (lOptionValue.getSelected()) lChecked = " checked";
//ScriptWriter~~      %><input type="radio" name="<!%aControl.getName()!>_<!%lOptionValue.getValue()!>" value="<!%lOptionValue.getValue()!>" <!%lChecked!>><!%lOptionValue.getName()!><%
      {
//ScriptWriter~~~
iOutputManager.println("<input type=\"radio\" name=\"" + aControl.getName() + "_" + lOptionValue.getValue() + "\" value=\"" + lOptionValue.getValue() + "\" " + lChecked + ">" + lOptionValue.getName() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      %><br><%
      {
//ScriptWriter~~~
iOutputManager.println("<br>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    %><br></td><%
    {
//ScriptWriter~~~
iOutputManager.println("<br></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=4184E9DF03C8$Preserve=no
    }

//$Section=OperationJavadoc$ID=4184E9DF03CA$Preserve=yes
/**
 *
 * @param aControl
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4184E9DF03CA$Preserve=no
    public void renderControlSelect( OptionControl aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4184E9DF03CA$Preserve=yes
//ScriptWriter~~    %><tr valign="middle" height="30"><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr valign=\"middle\" height=\"30\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="right"><!%aControl.getCaption()!></td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"right\">" + aControl.getCaption() + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td>&nbsp;&nbsp;&nbsp;</td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td>&nbsp;&nbsp;&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="left"><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"left\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><select name="<!%aControl.getName()!>"><%
    {
//ScriptWriter~~~
iOutputManager.println("<select name=\"" + aControl.getName() + "\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    for (int lIdx = 0; lIdx < aControl.controlValueSize(); lIdx++) {
      OptionValue lOptionValue = aControl.getControlValue(lIdx);
      String lSelected = "";
      if (lOptionValue.getSelected()) lSelected = " selected";
//ScriptWriter~~      %><option value="<!%lOptionValue.getValue()!>" <!%lSelected!>><!%lOptionValue.getName()!></option><%
      {
//ScriptWriter~~~
iOutputManager.println("<option value=\"" + lOptionValue.getValue() + "\" " + lSelected + ">" + lOptionValue.getName() + "</option>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
//ScriptWriter~~    %></select><%
    {
//ScriptWriter~~~
iOutputManager.println("</select>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></td><%
    {
//ScriptWriter~~~
iOutputManager.println("</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=4184E9DF03CA$Preserve=no
    }

//$Section=OperationJavadoc$ID=4184E9DF03D8$Preserve=yes
/**
 *
 * @param aControl
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4184E9DF03D8$Preserve=no
    public void renderControlDate( Control aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4184E9DF03D8$Preserve=yes
    DateValue lDateValue = (DateValue) aControl.getControlValue();
//ScriptWriter~~    %><tr valign="middle" height="49"><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr valign=\"middle\" height=\"49\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="right"><br><!%aControl.getCaption()!></td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"right\"><br>" + aControl.getCaption() + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td>&nbsp;&nbsp;&nbsp;</td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td>&nbsp;&nbsp;&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="top" align="left"><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"top\" align=\"left\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><table cellpadding="0" cellspacing="0" border="0"><%
    {
//ScriptWriter~~~
iOutputManager.println("<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td><div align='center' class='point8'>MM</div></td><td><div align='center' class='point8'>&nbsp;/&nbsp;</div></td><td><div align='center' class='point8'>DD</div></td><td><div align='center' class='point8'>&nbsp;/&nbsp;</div></td><td><div align='center' class='point8'>YYYY</div></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td><div align='center' class='point8'>MM</div></td><td><div align='center' class='point8'>&nbsp;/&nbsp;</div></td><td><div align='center' class='point8'>DD</div></td><td><div align='center' class='point8'>&nbsp;/&nbsp;</div></td><td><div align='center' class='point8'>YYYY</div></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><tr><td><input type='text'<%
    {
//ScriptWriter~~~
iOutputManager.println("<tr><td><input type='text'", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %> value='<!%lDateValue.getMm()!>'<%
    {
//ScriptWriter~~~
iOutputManager.println(" value='" + lDateValue.getMm() + "'", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %> size='3' maxlength='2' name='<!%aControl.getName()!>_mm'></td><td>&nbsp;/&nbsp;</td><td><%
    {
//ScriptWriter~~~
iOutputManager.println(" size='3' maxlength='2' name='" + aControl.getName() + "_mm'></td><td>&nbsp;/&nbsp;</td><td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><input type='text' size='3' maxlength='2' name='<!%aControl.getName()!>_dd'<%
    {
//ScriptWriter~~~
iOutputManager.println("<input type='text' size='3' maxlength='2' name='" + aControl.getName() + "_dd'", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %> value='<!%lDateValue.getDd()!>'<%
    {
//ScriptWriter~~~
iOutputManager.println(" value='" + lDateValue.getDd() + "'", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %>></td><td>&nbsp;/&nbsp;</td><td><input type='text' size='5' maxlength='4' name='<!%aControl.getName()!>_yyyy'<%
    {
//ScriptWriter~~~
iOutputManager.println("></td><td>&nbsp;/&nbsp;</td><td><input type='text' size='5' maxlength='4' name='" + aControl.getName() + "_yyyy'", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %> value='<!%lDateValue.getYyyy()!>'<%
    {
//ScriptWriter~~~
iOutputManager.println(" value='" + lDateValue.getYyyy() + "'", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %>></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></table></td></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</table></td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=4184E9DF03D8$Preserve=no
    }

//$Section=OperationJavadoc$ID=4184E9DF03DA$Preserve=yes
/**
 *
 * @param aControl
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4184E9DF03DA$Preserve=no
    public void renderControlSubmit( SubmitControl aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4184E9DF03DA$Preserve=yes
//ScriptWriter~~    %><tr valign="middle" height="50"><%
    {
//ScriptWriter~~~
iOutputManager.println("<tr valign=\"middle\" height=\"50\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="middle" align="right"></td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"middle\" align=\"right\"></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td>&nbsp;&nbsp;&nbsp;</td><%
    {
//ScriptWriter~~~
iOutputManager.println("<td>&nbsp;&nbsp;&nbsp;</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %><td valign="middle" align="left"><%
    {
//ScriptWriter~~~
iOutputManager.println("<td valign=\"middle\" align=\"left\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    for (int lIdx=0; lIdx < aControl.controlValueSize(); lIdx++) {
      ButtonValue lButtonValue = aControl.getControlValue(lIdx);
      if (lButtonValue.getType().compareTo("submit") == 0) {
//ScriptWriter~~        %><input type="submit" name="<!%aControl.getName()!><!%lIdx!>" value="<!%lButtonValue.getValue()!>">&nbsp;&nbsp;<%
        {
//ScriptWriter~~~
iOutputManager.println("<input type=\"submit\" name=\"" + aControl.getName() + "" + lIdx + "\" value=\"" + lButtonValue.getValue() + "\">&nbsp;&nbsp;", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
      else if (lButtonValue.getType().compareTo("reset") == 0) {
//ScriptWriter~~        %><input type="reset">&nbsp;&nbsp;<%
        {
//ScriptWriter~~~
iOutputManager.println("<input type=\"reset\">&nbsp;&nbsp;", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
    }
//ScriptWriter~~    %></td><%
    {
//ScriptWriter~~~
iOutputManager.println("</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %></tr><%
    {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//$Section=Operation$ID=4184E9DF03DA$Preserve=no
    }

//$Section=OperationJavadoc$ID=4184E9DF03DC$Preserve=yes
/**
 *
 * @param aControl
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4184E9DF03DC$Preserve=no
    public void renderControlMultirow( MultiRowControl aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4184E9DF03DC$Preserve=yes
        renderTableBottom();
//ScriptWriter~~        %><table width="100%" cellpadding="0" cellspacing="4"><%
        {
//ScriptWriter~~~
iOutputManager.println("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"4\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        String lBgColor = "#DDDDFF";
        String lPreFormat = "";
        String lPostFormat = "";

//ScriptWriter~~        %><tr height="5"><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr height=\"5\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        for (int lCol=0; lCol < aControl.controlValueSize(); lCol++) {
            ColumnValue lColumnValue = aControl.getControlValue(lCol);
            if (lColumnValue.getTitle().length() == 0) continue;
//ScriptWriter~~            %><td style="background-color:<!%lBgColor!>;"><%
            {
//ScriptWriter~~~
iOutputManager.println("<td style=\"background-color:" + lBgColor + ";\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            %><b><!%lColumnValue.getTitle()!></b></td><%
            {
//ScriptWriter~~~
iOutputManager.println("<b>" + lColumnValue.getTitle() + "</b></td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        %></tr><%
        {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


        for (int lRow=0; lRow < aControl.getRowSize(); lRow++) {
            if (lBgColor.compareTo("#FFFFFF") == 0) {
              lBgColor = "#DDDDFF";
            } else {
              lBgColor = "#FFFFFF";
            }
//ScriptWriter~~            %><tr height="5"><%
            {
//ScriptWriter~~~
iOutputManager.println("<tr height=\"5\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            for (int lIdx=0; lIdx < aControl.controlValueSize(); lIdx++) {
                ColumnValue lColumnValue = aControl.getControlValue(lIdx);
                if (lColumnValue.getTitle().length() == 0) continue;
//ScriptWriter~~                %><td style="background-color:<!%lBgColor!>;"><%
                {
//ScriptWriter~~~
iOutputManager.println("<td style=\"background-color:" + lBgColor + ";\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                if (lColumnValue.getHrefMethod().length() > 0) {
                  String lArgument = "";
                  for (int lIdx2=0; lIdx2 < aControl.controlValueSize(); lIdx2++) {
                    ColumnValue lArgumentValue = aControl.getControlValue(lIdx2);
                    if (lArgumentValue.getName().compareTo(lColumnValue.getHrefRowColumn()) == 0) {
                      lArgument = lArgumentValue.getValue(lRow);
                      break;
                    }
                  }
//ScriptWriter~~                  %><a href=Index.jsp?loc=*&script=<!%iScriptFullName!>&instance=<!%iScriptInstanceName!>&method=<!%lColumnValue.getHrefMethod()!>&argument=<!%lArgument!>><!%lPreFormat!><!%lColumnValue.getValue(lRow)!><!%lPostFormat!></td><%
                  {
//ScriptWriter~~~
iOutputManager.println("<a href=Index.jsp?loc=*&script=" + iScriptFullName + "&instance=" + iScriptInstanceName + "&method=" + lColumnValue.getHrefMethod() + "&argument=" + lArgument + ">" + lPreFormat + "" + lColumnValue.getValue(lRow) + "" + lPostFormat + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                } else {
//ScriptWriter~~                  %><!%lPreFormat!><!%lColumnValue.getValue(lRow)!><!%lPostFormat!></td><%
                  {
//ScriptWriter~~~
iOutputManager.println("" + lPreFormat + "" + lColumnValue.getValue(lRow) + "" + lPostFormat + "</td>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

                }
            }
//ScriptWriter~~            %></tr><%
            {
//ScriptWriter~~~
iOutputManager.println("</tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
        renderTableBottom();
        renderTableTop();
//$Section=Operation$ID=4184E9DF03DC$Preserve=no
    }

//$Section=OperationJavadoc$ID=4184E9E00002$Preserve=yes
/**
 *
 * @param aControl
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4184E9E00002$Preserve=no
    public void renderControl( Control aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4184E9E00002$Preserve=yes
    if (aControl.getType().compareTo("text") == 0) {
      renderControlText((TextControl) aControl);
    }
    else if (aControl.getType().compareTo("password") == 0) {
      renderControlPassword((TextControl) aControl);
    }
    else if (aControl.getType().compareTo("select") == 0) {
      renderControlSelect((OptionControl) aControl);
    }
    else if (aControl.getType().compareTo("date") == 0) {
      renderControlDate(aControl);
    }
    else if (aControl.getType().compareTo("checkbox") == 0) {
      renderControlCheckbox((OptionControl) aControl);
    }
    else if (aControl.getType().compareTo("radio") == 0) {
      renderControlRadio((OptionControl) aControl);
    }
    else if (aControl.getType().compareTo("submit") == 0) {
      renderControlSubmit((SubmitControl) aControl);
    }
    else if (aControl.getType().compareTo("multirow") == 0) {
      renderControlMultirow((MultiRowControl) aControl);
    }
//$Section=Operation$ID=4184E9E00002$Preserve=no
    }

//$Section=OperationJavadoc$ID=417DE315032C$Preserve=yes
/**
 *
 * @param aFrame
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417DE315032C$Preserve=no
    public void renderFrame( String aFrame ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=417DE315032C$Preserve=yes

    Frame lFrame = getFrame(aFrame);
    if (lFrame == null) return;

    boolean setGrid = true;  // Set grid first time flag
    String lGrid = "";
    String lColumn = "";

    for (int lIdx = 0; lIdx < lFrame.controlSize(); lIdx++) {
      Control lControl = (Control) lFrame.getControl(lIdx);

      if (lControl.getType().compareTo("multirow") == 0) {
        if (((MultiRowControl)lControl).getRowSize() == 0) continue;
      }

      if (setGrid) {
        lGrid = lControl.getGrid();
        lColumn = lControl.getColumn();
        setGrid = false;
        renderTableTop();
//ScriptWriter~~        %><tr><td valign="top"><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td valign=\"top\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        renderTableTop();
      }

      if (lControl.getGrid().compareTo(lGrid) != 0) {
        if (lControl.getGrid().compareTo("") != 0) {
          renderTableBottom();
//ScriptWriter~~          %></td></tr><tr></table><%
          {
//ScriptWriter~~~
iOutputManager.println("</td></tr><tr></table>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          %><hr size="1" color="#5555FF"><%
          {
//ScriptWriter~~~
iOutputManager.println("<hr size=\"1\" color=\"#5555FF\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          renderTableTop();
        }
//ScriptWriter~~        %><tr><td valign="top"><%
        {
//ScriptWriter~~~
iOutputManager.println("<tr><td valign=\"top\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        renderTableTop();
        lGrid = lControl.getGrid();
        lColumn = lControl.getColumn();
      }
      else if (lControl.getColumn().compareTo(lColumn) != 0) {
        lColumn = lControl.getColumn();
        renderTableBottom();
//ScriptWriter~~        %></td><td valign="top"><%
        {
//ScriptWriter~~~
iOutputManager.println("</td><td valign=\"top\">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        renderTableTop();
      }
      renderControl(lControl);
    }
    if (lGrid.compareTo("") != 0) {
      renderTableBottom();
//ScriptWriter~~      %></td></tr><%
      {
//ScriptWriter~~~
iOutputManager.println("</td></tr>", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
    renderTableBottom();


//$Section=Operation$ID=417DE315032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=42889A150203$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42889A150203$Preserve=no
    public String getHrefId( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=42889A150203$Preserve=yes

    setContext(iScript.getMasterScript());
//ScriptWriter~~    String lReturn = Long.toString(new java.util.Date().getTime()) + "_" + Integer.toString(<!$jac:href:id!>!size());
    String lReturn = Long.toString(new java.util.Date().getTime()) + "_" + Integer.toString(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:href:id")).size());
    restoreContext();
    return lReturn;

//$Section=Operation$ID=42889A150203$Preserve=no
    }

//$Section=OperationJavadoc$ID=4299B3180271$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4299B3180271$Preserve=no
    public String getLastControlName( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4299B3180271$Preserve=yes

      return iScriptFullName + "_" + iScriptInstanceName + "_formControl_" + Integer.toString(iControlSequence);

//$Section=Operation$ID=4299B3180271$Preserve=no
    }

//$Section=OperationJavadoc$ID=4299B36403D8$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4299B36403D8$Preserve=no
    public String getNextControlName( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4299B36403D8$Preserve=yes

      String lControlName = iScriptFullName + "_" + iScriptInstanceName + "_formControl_" + Integer.toString(++iControlSequence);
      int lPos;
      while ((lPos = lControlName.indexOf(".")) >= 0) lControlName = lControlName.substring(0, lPos) + "_" + lControlName.substring(lPos+1);
      return lControlName;

//$Section=Operation$ID=4299B36403D8$Preserve=no
    }

//$Section=OperationJavadoc$ID=429C3CF3031C$Preserve=yes
/**
 *
 * @param aKey
 *
 * @param aControlName
 *
 * @param aInputTag
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=429C3CF3031C$Preserve=no
    public void addControl( String aKey, String aControlName, String aInputTag ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=429C3CF3031C$Preserve=yes

        addControl(aKey, aControlName, aInputTag, null);

//$Section=Operation$ID=429C3CF3031C$Preserve=no
    }

//$Section=OperationJavadoc$ID=4299B49D0128$Preserve=yes
/**
 *
 * @param aKey
 *
 * @param aControlName
 *
 * @param aInputTag
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4299B49D0128$Preserve=no
    public void addControl( String aKey, String aControlName, String aInputTag, String aSubmitTag ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4299B49D0128$Preserve=yes

//ScriptWriter~~      String lLocation = <!" + aKey + "!>!getLocation();
      String lLocation = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + aKey + "")).getLocation();
//ScriptWriter~~      <!$mic:controls!>!set(aKey);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls")).set(aKey);
//ScriptWriter~~      <!$mic:controls:location!>!set(lLocation);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:location")).set(lLocation);
//ScriptWriter~~      <!$mic:controls:name!>!set(aControlName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:name")).set(aControlName);
//ScriptWriter~~      <!$mic:controls:inputTag!>!set(aInputTag);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:inputTag")).set(aInputTag);
      if (aSubmitTag != null) {
//ScriptWriter~~        <!$mic:controls:submitTag!>!set(aSubmitTag);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:submitTag")).set(aSubmitTag);
      }
//ScriptWriter~~      %><!%aInputTag!><%
      {
//ScriptWriter~~~
iOutputManager.println("" + aInputTag + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//$Section=Operation$ID=4299B49D0128$Preserve=no
    }

//$Section=OperationJavadoc$ID=429C3BE300BB$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=429C3BE300BB$Preserve=no
    public void handlePost( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=429C3BE300BB$Preserve=yes

    String lLocation = null;
    ServletRequest lServletRequest = getServletRequest();

//JETTY IMPLEMENTATION!!!
    org.mortbay.servlet.MultiPartRequest lMultiPartRequest = null;

//System.out.println(">>lServletRequest.getContentType()=" + lServletRequest.getContentType());

    if (lServletRequest.getContentType().startsWith("multipart/form-data")) {
//ScriptWriter~~      if (<:iScript.getMasterScript():><!$jac:multiPartRequest!>!size() != 0) {
      if (iPropertyHelper.setPropertyName(iScript.getMasterScript(), iScript.getMasterScript().getSymbolTable().translateProperties("$jac:multiPartRequest")).size() != 0) {
//System.out.println("get existing org.mortbay.servlet.MultiPartRequest");
//ScriptWriter~~        lMultiPartRequest = (org.mortbay.servlet.MultiPartRequest) <:iScript.getMasterScript():><!$jac:multiPartRequest!>!getValueObject();
        lMultiPartRequest = (org.mortbay.servlet.MultiPartRequest) iPropertyHelper.setPropertyName(iScript.getMasterScript(), iScript.getMasterScript().getSymbolTable().translateProperties("$jac:multiPartRequest")).getValueObject();
      } else {
//System.out.println("new org.mortbay.servlet.MultiPartRequest");
        try {
          lMultiPartRequest = new org.mortbay.servlet.MultiPartRequest((javax.servlet.http.HttpServletRequest) lServletRequest);
//ScriptWriter~~          <:iScript.getMasterScript():><!$jac:multiPartRequest!>!reset(lMultiPartRequest);
          iPropertyHelper.setPropertyName(iScript.getMasterScript(), iScript.getMasterScript().getSymbolTable().translateProperties("$jac:multiPartRequest")).reset(lMultiPartRequest);

          String lParts[] = lMultiPartRequest.getPartNames();
          if (lParts != null) {
            for (int lIdx=0; lIdx < lParts.length; lIdx++) {
              //System.out.println(">>lParts[" + lIdx + "]=" + lParts[lIdx]);
              //System.out.println(">>lParts[" + lIdx + "].getString=" + lMultiPartRequest.getString(lParts[lIdx]));
              //System.out.println(">>lParts[" + lIdx + "].getFilename=" + lMultiPartRequest.getFilename(lParts[lIdx]));
            }
          } else {
            //System.out.println(">>lParts is null");
          }

        } catch(Exception e) { System.out.println("e=" + e); }
      }
    }

//ScriptWriter~~    <!$mic:controls!>& {
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls")).next())  {
//ScriptWriter~~      //System.out.println("$mic:controls:name=" + <![$mic:controls:name]!>);
      //System.out.println("$mic:controls:name=" + iSymbolTable.translateProperties("[$mic:controls:name]"));
//ScriptWriter~~      String lKey = <![$mic:controls]!>;
      String lKey = iSymbolTable.translateProperties("[$mic:controls]");
//ScriptWriter~~      if (!<!" + lKey + "!>!setLocation(<![$mic:controls:location]!>)) {
      if (!iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + "")).setLocation(iSymbolTable.translateProperties("[$mic:controls:location]"))) {
        if (lMultiPartRequest != null) {
//System.out.println("a");
//ScriptWriter~~          if (lMultiPartRequest.getFilename(<![$mic:controls:name]!>) == null) {
          if (lMultiPartRequest.getFilename(iSymbolTable.translateProperties("[$mic:controls:name]")) == null) {
//ScriptWriter~~            <!" + lKey + "!>!reset(lMultiPartRequest.getString(<![$mic:controls:name]!>));
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + "")).reset(lMultiPartRequest.getString(iSymbolTable.translateProperties("[$mic:controls:name]")));
          } else {
            try {
//ScriptWriter~~              java.io.InputStream lInputStream = lMultiPartRequest.getInputStream(<![$mic:controls:name]!>);
              java.io.InputStream lInputStream = lMultiPartRequest.getInputStream(iSymbolTable.translateProperties("[$mic:controls:name]"));
              byte[] lBytes = new byte[(int) lInputStream.available()];
              lInputStream.read(lBytes);
//ScriptWriter~~              <!" + lKey + "!>!reset(lMultiPartRequest.getFilename(<![$mic:controls:name]!>));
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + "")).reset(lMultiPartRequest.getFilename(iSymbolTable.translateProperties("[$mic:controls:name]")));
//ScriptWriter~~              <!" + lKey + ":byteArray!>!reset(lBytes);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + ":byteArray")).reset(lBytes);
            } catch(Exception e) {}
          }
        } else {
//System.out.println("b");
//ScriptWriter~~          <!" + lKey + "!>!reset(lServletRequest.getParameter(<![$mic:controls:name]!>));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + "")).reset(lServletRequest.getParameter(iSymbolTable.translateProperties("[$mic:controls:name]")));
        }
      } else {
        if (lMultiPartRequest != null) {
//System.out.println("c");
//ScriptWriter~~          if (lMultiPartRequest.getFilename(<![$mic:controls:name]!>) == null) {
          if (lMultiPartRequest.getFilename(iSymbolTable.translateProperties("[$mic:controls:name]")) == null) {
//ScriptWriter~~            <!" + lKey + "!>!replace(lMultiPartRequest.getString(<![$mic:controls:name]!>));
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + "")).replace(lMultiPartRequest.getString(iSymbolTable.translateProperties("[$mic:controls:name]")));
          } else {
            try {
//ScriptWriter~~              java.io.InputStream lInputStream = lMultiPartRequest.getInputStream(<![$mic:controls:name]!>);
              java.io.InputStream lInputStream = lMultiPartRequest.getInputStream(iSymbolTable.translateProperties("[$mic:controls:name]"));
              byte[] lBytes = new byte[(int) lInputStream.available()];
              lInputStream.read(lBytes);
//ScriptWriter~~              <!" + lKey + "!>!replace(lMultiPartRequest.getFilename(<![$mic:controls:name]!>));
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + "")).replace(lMultiPartRequest.getFilename(iSymbolTable.translateProperties("[$mic:controls:name]")));
//ScriptWriter~~              <!" + lKey + ":byteArray!>!replace(lBytes);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + ":byteArray")).replace(lBytes);
            } catch(Exception e) {}
          }
        } else {
//System.out.println("d");
//ScriptWriter~~          <!" + lKey + "!>!replace(lServletRequest.getParameter(<![$mic:controls:name]!>));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + "")).replace(lServletRequest.getParameter(iSymbolTable.translateProperties("[$mic:controls:name]")));
        }
      }
//ScriptWriter~~      if (<!$mic:controls:submitTag!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:submitTag")).size() > 0) {
        if (lMultiPartRequest != null) {
//ScriptWriter~~          if (lMultiPartRequest.contains(<![$mic:controls:name]!>)) {
          if (lMultiPartRequest.contains(iSymbolTable.translateProperties("[$mic:controls:name]"))) {
//System.out.println("e");
//ScriptWriter~~            <!$mic:controls:submitTag:requested!>!reset("true");
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:submitTag:requested")).reset("true");
//ScriptWriter~~            lLocation = <!$mic:controls:submitTag:requested!>!getLocation();
            lLocation = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:submitTag:requested")).getLocation();
          }
        } else {
//ScriptWriter~~          if (lServletRequest.getParameter(<![$mic:controls:name]!>) != null) {
          if (lServletRequest.getParameter(iSymbolTable.translateProperties("[$mic:controls:name]")) != null) {
//System.out.println("f");
//ScriptWriter~~            <!$mic:controls:submitTag:requested!>!reset("true");
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:submitTag:requested")).reset("true");
//ScriptWriter~~            lLocation = <!$mic:controls:submitTag:requested!>!getLocation();
            lLocation = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:submitTag:requested")).getLocation();
          }
        }
      }
    }

    if (lLocation != null) {
//ScriptWriter~~      <!$mic:controls:submitTag:requested!>!setLocation(lLocation);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls:submitTag:requested")).setLocation(lLocation);
//ScriptWriter~~      String lKey = <![$mic:controls]!>;
      String lKey = iSymbolTable.translateProperties("[$mic:controls]");
//ScriptWriter~~      <!" + lKey + "!>!setLocation(<![$mic:controls:location]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + lKey + "")).setLocation(iSymbolTable.translateProperties("[$mic:controls:location]"));
    }

    ArrayList lArrayList = new ArrayList();

    for (int lIdx=0; lIdx < iViewList.size(); lIdx++) {
      com.esarks.mic.View lView = (com.esarks.mic.View) iViewList.get(lIdx);
      lArrayList.add(lView);
    }

    for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
      com.esarks.mic.View lView = (com.esarks.mic.View) lArrayList.get(lIdx);
      lView.handlePost();
    }

//$Section=Operation$ID=429C3BE300BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=429D12A500BB$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=429D12A500BB$Preserve=no
    public void render( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=429D12A500BB$Preserve=yes

//ScriptWriter~~  System.out.println("before $mic:controls!size=" + <!$mic:controls!>!size());
//  System.out.println("before $mic:controls!size=" + iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls")).size());
//ScriptWriter~~  <!$mic:controls!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls")).remove();
//ScriptWriter~~  System.out.println("after $mic:controls!size=" + <!$mic:controls!>!size());
//  System.out.println("after $mic:controls!size=" + iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls")).size());

  for (int lIdx=0; lIdx < iViewList.size(); lIdx++) {
    com.esarks.mic.View lView = (com.esarks.mic.View) iViewList.get(lIdx);
    lView.render();
  }

//$Section=Operation$ID=429D12A500BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=430A315A0222$Preserve=yes
/**
 *
 * @param aJeo
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=430A315A0222$Preserve=no
    public void render( Jeo aJeo ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=430A315A0222$Preserve=yes

//ScriptWriter~~  <!$mic:controls!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls")).remove();

  for (int lIdx=0; lIdx < iViewList.size(); lIdx++) {
    com.esarks.mic.View lView = (com.esarks.mic.View) iViewList.get(lIdx);
    lView.render(aJeo);
  }

//$Section=Operation$ID=430A315A0222$Preserve=no
    }

//$Section=OperationJavadoc$ID=42A1ADAD0399$Preserve=yes
/**
 *
 * @param aView
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42A1ADAD0399$Preserve=no
    public void addView( View aView ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=42A1ADAD0399$Preserve=yes
        for (int lIdx=0; lIdx < iViewList.size(); lIdx++) {
            if ((View) iViewList.get(lIdx) == aView) return;
        }

        iViewList.add(aView);
        aView.setParentView(this);
//$Section=Operation$ID=42A1ADAD0399$Preserve=no
    }

//$Section=OperationJavadoc$ID=42A1D393032C$Preserve=yes
/**
 *
 * @param aView
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42A1D393032C$Preserve=no
    public void removeView( View aView ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=42A1D393032C$Preserve=yes
        for (int lIdx=0; lIdx < iViewList.size(); lIdx++) {
            if ((View) iViewList.get(lIdx) == aView) {
                iViewList.remove(lIdx);
                return;
            }
        }
//$Section=Operation$ID=42A1D393032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=42A1F143038A$Preserve=yes
/**
 *
 * @param aView
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42A1F143038A$Preserve=no
    public void upView( View aView ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=42A1F143038A$Preserve=yes
        for (int lIdx=0; lIdx < iViewList.size(); lIdx++) {
            if ((View) iViewList.get(lIdx) == aView) {
                if (lIdx == 0) return;
                View lView1 = (View) iViewList.get(lIdx);
                View lView2 = (View) iViewList.get(lIdx-1);
                iViewList.set(lIdx, lView2);
                iViewList.set(lIdx-1, lView1);
                return;
            }
        }
//$Section=Operation$ID=42A1F143038A$Preserve=no
    }

//$Section=OperationJavadoc$ID=42A1F1440109$Preserve=yes
/**
 *
 * @param aView
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42A1F1440109$Preserve=no
    public void downView( View aView ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=42A1F1440109$Preserve=yes
        for (int lIdx=0; lIdx < iViewList.size()-1; lIdx++) {
            if ((View) iViewList.get(lIdx) == aView) {
                View lView = (View) iViewList.get(lIdx);
                iViewList.set(lIdx, iViewList.get(lIdx+1));
                iViewList.set(lIdx+1, lView);
                return;
            }
        }
//$Section=Operation$ID=42A1F1440109$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B4B037003E$Preserve=yes
/**
 *
 * @param aView
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B4B037003E$Preserve=no
    public void addView( String aView ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=42B4B037003E$Preserve=yes
//ScriptWriter~~        if (<!$mic!>!scan("view", aView)) return;
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic")).scan("view", aView)) return;
//ScriptWriter~~        <!$mic:view!>!set(aView);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:view")).set(aView);
//$Section=Operation$ID=42B4B037003E$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B4B0DD009C$Preserve=yes
/**
 *
 * @param aView
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B4B0DD009C$Preserve=no
    public void openView( String aView ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=42B4B0DD009C$Preserve=yes
//ScriptWriter~~        if (!<!$mic!>!scan("view", aView)) return;
        if (!iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic")).scan("view", aView)) return;
//ScriptWriter~~        com.esarks.mic.View lAddView = (com.esarks.mic.View) loadScript(<![$mic:view]!>, iScriptFullName + "_" + iScriptInstanceName + "_" + Integer.toString(iInstanceCount++));
        com.esarks.mic.View lAddView = (com.esarks.mic.View) loadScript(iSymbolTable.translateProperties("[$mic:view]"), iScriptFullName + "_" + iScriptInstanceName + "_" + Integer.toString(iInstanceCount++));
        addView(lAddView);
//$Section=Operation$ID=42B4B0DD009C$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B4B0540251$Preserve=yes
/**
 *
 * @param aView
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B4B0540251$Preserve=no
    public void removeView( String aView ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=42B4B0540251$Preserve=yes
//ScriptWriter~~        if (!<!$mic!>!scan("view", aView)) return;
        if (!iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic")).scan("view", aView)) return;
//ScriptWriter~~        <!$mic:view!>!removeValue();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:view")).removeValue();
//$Section=Operation$ID=42B4B0540251$Preserve=no
    }

//$Section=OperationJavadoc$ID=430A057F0222$Preserve=yes
/**
 *
 * @param aEvent
 *
 * @param aJeo
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=430A057F0222$Preserve=no
    public void handleEvent( String aEvent, Jeo aJeo ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=430A057F0222$Preserve=yes
        for (int lIdx=0; lIdx < iViewList.size(); lIdx++) {
          	View lView = (View) iViewList.get(lIdx);
          	lView.handleEvent(aEvent, aJeo);
        }
//$Section=Operation$ID=430A057F0222$Preserve=no
    }

//$Section=OperationJavadoc$ID=4388DEE40261$Preserve=yes
/**
 *
 */
//$Section=OperationJavadoc$ID=4388DEE40261$Preserve=no
    public void resetControls( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter View.");
//$Section=Operation$ID=4388DEE40261$Preserve=yes

//ScriptWriter~~      <!$mic:controls!>!remove();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:controls")).remove();

//$Section=Operation$ID=4388DEE40261$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Render
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=417E37500242$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=417E37500242$Preserve=no
    public boolean getRender() {
//$Section=Attribute get$ID=417E37500242$Preserve=no
        return iRender;
//$Section=Attribute get$ID=417E37500242$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=417E37500242$Preserve=no
/**
 * Set accessor method.
 *
 * @param Render the value to be set.
 */
//$Section=Attribute setJavadoc$ID=417E37500242$Preserve=no
    public void setRender(boolean aValue) {
//$Section=Attribute set$ID=417E37500242$Preserve=no
        iRender = aValue;
//$Section=Attribute set$ID=417E37500242$Preserve=no
    }
//----------------------------------------------------------------------------
// Maximized
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=417E37500243$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=417E37500243$Preserve=no
    public boolean getMaximized() {
//$Section=Attribute get$ID=417E37500243$Preserve=no
        return iMaximized;
//$Section=Attribute get$ID=417E37500243$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=417E37500243$Preserve=no
/**
 * Set accessor method.
 *
 * @param Maximized the value to be set.
 */
//$Section=Attribute setJavadoc$ID=417E37500243$Preserve=no
    public void setMaximized(boolean aValue) {
//$Section=Attribute set$ID=417E37500243$Preserve=no
        iMaximized = aValue;
//$Section=Attribute set$ID=417E37500243$Preserve=no
    }
//----------------------------------------------------------------------------
// HideWindowBar
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=417E376502FD$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=417E376502FD$Preserve=no
    public boolean getHideWindowBar() {
//$Section=Attribute get$ID=417E376502FD$Preserve=no
        return iHideWindowBar;
//$Section=Attribute get$ID=417E376502FD$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=417E376502FD$Preserve=no
/**
 * Set accessor method.
 *
 * @param HideWindowBar the value to be set.
 */
//$Section=Attribute setJavadoc$ID=417E376502FD$Preserve=no
    public void setHideWindowBar(boolean aValue) {
//$Section=Attribute set$ID=417E376502FD$Preserve=no
        iHideWindowBar = aValue;
//$Section=Attribute set$ID=417E376502FD$Preserve=no
    }
//----------------------------------------------------------------------------
// Frames
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4184D10C00CB$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4184D10C00CB$Preserve=no
    public ArrayList getFrames() {
//$Section=Attribute get$ID=4184D10C00CB$Preserve=no
        return iFrames;
//$Section=Attribute get$ID=4184D10C00CB$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4184D10C00CB$Preserve=no
/**
 * Set accessor method.
 *
 * @param Frames the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4184D10C00CB$Preserve=no
    public void setFrames(ArrayList aValue) {
//$Section=Attribute set$ID=4184D10C00CB$Preserve=no
        iFrames = aValue;
//$Section=Attribute set$ID=4184D10C00CB$Preserve=no
    }
//----------------------------------------------------------------------------
// ParentView
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=42A1D01301F4$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=42A1D01301F4$Preserve=no
    public View getParentView() {
//$Section=Attribute get$ID=42A1D01301F4$Preserve=no
        return iParentView;
//$Section=Attribute get$ID=42A1D01301F4$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=42A1D01301F4$Preserve=no
/**
 * Set accessor method.
 *
 * @param ParentView the value to be set.
 */
//$Section=Attribute setJavadoc$ID=42A1D01301F4$Preserve=no
    public void setParentView(View aValue) {
//$Section=Attribute set$ID=42A1D01301F4$Preserve=no
        iParentView = aValue;
//$Section=Attribute set$ID=42A1D01301F4$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=417A49EE01E4$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A49EE01E4$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A49EE01E4$Preserve=no

//End of class---------------
}
