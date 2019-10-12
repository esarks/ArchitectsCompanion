//$Section=License$ID=417A4808007D$Preserve=no

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

//  Generated at 2005.07.20 04:25:38.578 AM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Component.script

//$Section=ChangeLog$ID=417A4808007D$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=417A4808007D$Preserve=no

package com.esarks.mic;

//$Section=ClassJavadoc$ID=417A4808007D$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=417A4808007D$Preserve=no
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

//$Section=CustomDeclare$ID=417A4808007D$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=417A4808007D$Preserve=no

public class Component extends com.esarks.mic.Element {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A4808007D$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A4808007D$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=417A4808007D$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=417A4808007D$Preserve=no
    public Component() {
//$Section=DefaultConstructor$ID=417A4808007D$Preserve=yes
//$Section=DefaultConstructor$ID=417A4808007D$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=417A4808007D$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=417A4808007D$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=417A4808007D$Preserve=yes
//$Section=DefaultDestructor$ID=417A4808007D$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=417A4808007D$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=417A4808007D$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=417A4808007D$Preserve=yes
//$Section=DefaultFreeResources$ID=417A4808007D$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=417D9811034B$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=417D9811034B$Preserve=no
    public Component( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=417D9811034B$Preserve=yes
        super(aScript);
//$Section=Operation$ID=417D9811034B$Preserve=no
    }

//$Section=OperationJavadoc$ID=417ECDB7006D$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aLocation
 *
 * @param aTitle
 *
 * @param aDescription
 *
 * @param aResolution
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417ECDB7006D$Preserve=no
    public String formatStandardError( String aScriptName, String aLocation, String aTitle, String aDescription, String aResolution ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=417ECDB7006D$Preserve=yes
    return
    "<table cellpadding=0 cellspacing=0 border=0> " +
    "<tr><td valign=top align=right><b>Title:&nbsp;</b></td><td>" + aTitle + "</td></tr> " +
    "<tr><td valign=top align=right><b>Description:&nbsp;</b></td><td>" + aDescription + "</td></tr> " +
    "<tr><td valign=top align=right><b>Resolution:&nbsp;</b></td><td>" + aResolution + "</td></tr> " +
    "<tr><td valign=top align=right><b>Location:&nbsp;</b></td><td>" + aScriptName + ":" + aLocation + "</td></tr> " +
    "</table>";
//$Section=Operation$ID=417ECDB7006D$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B154E80242$Preserve=yes
/**
 *
 * @param aEvent
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B154E80242$Preserve=no
    public void addListener( String aEvent ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42B154E80242$Preserve=yes
//ScriptWriter~~        if (!<:iScript.getGlobalScript():><!$mic!>!scan("events:name", aEvent)) {
        if (!iPropertyHelper.setPropertyName(iScript.getGlobalScript(), iScript.getGlobalScript().getSymbolTable().translateProperties("$mic")).scan("events:name", aEvent)) {
//ScriptWriter~~          <:iScript.getGlobalScript():><!$mic:events:name!>!set(aEvent);
          iPropertyHelper.setPropertyName(iScript.getGlobalScript(), iScript.getGlobalScript().getSymbolTable().translateProperties("$mic:events:name")).set(aEvent);
        }
//ScriptWriter~~        <:iScript.getGlobalScript():><!$mic:events:name:object!>!set(this);
        iPropertyHelper.setPropertyName(iScript.getGlobalScript(), iScript.getGlobalScript().getSymbolTable().translateProperties("$mic:events:name:object")).set(this);
//$Section=Operation$ID=42B154E80242$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B155360242$Preserve=yes
/**
 *
 * @param aEvent
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B155360242$Preserve=no
    public void removeListener( String aEvent ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42B155360242$Preserve=yes
//$Section=Operation$ID=42B155360242$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B155120251$Preserve=yes
/**
 *
 * @param aEvent
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B155120251$Preserve=no
    public void handleEvent( String aEvent, Jeo aJeo ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42B155120251$Preserve=yes
//$Section=Operation$ID=42B155120251$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B1559A02BF$Preserve=yes
/**
 *
 * @param aEvent
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B1559A02BF$Preserve=no
    public void triggerEvent( String aEvent, Jeo aJeo ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42B1559A02BF$Preserve=yes
//ScriptWriter~~        if (!<:iScript.getGlobalScript():><!$mic!>!scan("events:name", aEvent)) {
        if (!iPropertyHelper.setPropertyName(iScript.getGlobalScript(), iScript.getGlobalScript().getSymbolTable().translateProperties("$mic")).scan("events:name", aEvent)) {
          return;
        }
        ArrayList lArrayList = new ArrayList();
//ScriptWriter~~        <:iScript.getGlobalScript():><!$mic:events:name:object!>& {
        iPropertyHelper.setPropertyName(iScript.getGlobalScript(), iScript.getGlobalScript().getSymbolTable().translateProperties("$mic:events:name:object")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript.getGlobalScript(), iScript.getGlobalScript().getSymbolTable().translateProperties("$mic:events:name:object")).next())  {
//ScriptWriter~~          lArrayList.add(<:iScript.getGlobalScript():><!$mic:events:name:object!>!getValueObject());
          lArrayList.add(iPropertyHelper.setPropertyName(iScript.getGlobalScript(), iScript.getGlobalScript().getSymbolTable().translateProperties("$mic:events:name:object")).getValueObject());
        }
        for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
          ((Component) lArrayList.get(lIdx)).handleEvent(aEvent, aJeo);
        }
//$Section=Operation$ID=42B1559A02BF$Preserve=no
    }

//$Section=OperationJavadoc$ID=42DE09EF00DA$Preserve=yes
/**
 *
 * @param aXmlSchemaElement
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42DE09EF00DA$Preserve=no
    public void visitElements( XmlSchemaElement aXmlSchemaElement ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42DE09EF00DA$Preserve=yes

  visitElements(aXmlSchemaElement, "");

//$Section=Operation$ID=42DE09EF00DA$Preserve=no
    }

//$Section=OperationJavadoc$ID=42DD42520148$Preserve=yes
/**
 *
 * @param aXmlSchemaElement
 *
 * @param aTagPrefix
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42DD42520148$Preserve=no
    public void visitElements( XmlSchemaElement aXmlSchemaElement, String aTagPrefix ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42DD42520148$Preserve=yes

   if (aTagPrefix.equals("")) {
     aTagPrefix = aXmlSchemaElement.getName();
   } else {
     aTagPrefix += ":" + aXmlSchemaElement.getName();
   }

//ScriptWriter~~   <!" + aTagPrefix + "!>& {
   iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + aTagPrefix + "")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + aTagPrefix + "")).next())  {

     ArrayList lArrayList = aXmlSchemaElement.getElementsList();

     if (aXmlSchemaElement.getAttribute()) {
       visitAttribute(aXmlSchemaElement, aTagPrefix);
     } else {
       visitElement(aXmlSchemaElement, aTagPrefix);
     }

     if (aXmlSchemaElement.getAttribute() && lArrayList.size() > 0) {
       System.out.println("**ERROR** Attribute can't have children.");
       return;
     }

     for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
       XmlSchemaElement lXmlSchemaElement = (XmlSchemaElement) lArrayList.get(lIdx);
       visitElements(lXmlSchemaElement, aTagPrefix);
     }

     if (!aXmlSchemaElement.getAttribute()) {
       visitEndAttributes(aXmlSchemaElement, aTagPrefix);
     }

   }

//$Section=Operation$ID=42DD42520148$Preserve=no
    }

//$Section=OperationJavadoc$ID=42DD42B20261$Preserve=yes
/**
 *
 * @param aXmlSchemaElement
 *
 * @param aTagPrefix
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42DD42B20261$Preserve=no
    public void visitElement( XmlSchemaElement aXmlSchemaElement, String aTagPrefix ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42DD42B20261$Preserve=yes
//$Section=Operation$ID=42DD42B20261$Preserve=no
    }

//$Section=OperationJavadoc$ID=42DD42B101D4$Preserve=yes
/**
 *
 * @param aXmlSchemaElement
 *
 * @param aTagPrefix
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42DD42B101D4$Preserve=no
    public void visitAttribute( XmlSchemaElement aXmlSchemaElement, String aTagPrefix ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42DD42B101D4$Preserve=yes
//$Section=Operation$ID=42DD42B101D4$Preserve=no
    }

//$Section=OperationJavadoc$ID=42DD42B30138$Preserve=yes
/**
 *
 * @param aXmlSchemaElement
 *
 * @param aTagPrefix
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42DD42B30138$Preserve=no
    public void visitEndAttributes( XmlSchemaElement aXmlSchemaElement, String aTagPrefix ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42DD42B30138$Preserve=yes
//$Section=Operation$ID=42DD42B30138$Preserve=no
    }

//$Section=OperationJavadoc$ID=42DD4D8602EE$Preserve=yes
/**
 *
 * @param aXmlSchemaElement
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42DD4D8602EE$Preserve=no
    public void persistXml( XmlSchemaElement aXmlSchemaElement ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42DD4D8602EE$Preserve=yes

    persistXml(aXmlSchemaElement, "", "");

//$Section=Operation$ID=42DD4D8602EE$Preserve=no
    }

//$Section=OperationJavadoc$ID=42DD4DB0033C$Preserve=yes
/**
 *
 * @param aXmlSchemaElement
 *
 * @param aTagPrefix
 *
 * @param aIndent
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42DD4DB0033C$Preserve=no
    public void persistXml( XmlSchemaElement aXmlSchemaElement, String aTagPrefix, String aIndent ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Component.");
//$Section=Operation$ID=42DD4DB0033C$Preserve=yes

   String lCdataOpen = "<" + "!" + "[" + "CDATA" + "[";
   String lCdataClose = "]" + "]" + ">";
   String lValue = "";

   if (aTagPrefix.equals("")) {
     aTagPrefix = aXmlSchemaElement.getName();
   } else {
     aTagPrefix += ":" + aXmlSchemaElement.getName();
   }

   boolean lAttribute = aXmlSchemaElement.getAttribute();

//ScriptWriter~~   <!" + aTagPrefix + "!>& {
   iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + aTagPrefix + "")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("" + aTagPrefix + "")).next())  {

     boolean lCloseTag = false;

     ArrayList lArrayList = aXmlSchemaElement.getElementsList();

     if (lAttribute) {
//ScriptWriter~~       lValue = <![" + aTagPrefix + "]!>;
       lValue = iSymbolTable.translateProperties("[" + aTagPrefix + "]");
       if (aXmlSchemaElement.getTrim()) lValue = lValue.trim();
       if (aXmlSchemaElement.getPreserveEmpty() && lValue.equals("")) return;
//ScriptWriter~~       %><!%aXmlSchemaElement.getName()!>="<![" + aTagPrefix + "]!>" <%
       {
//ScriptWriter~~~
iOutputManager.println("" + aXmlSchemaElement.getName() + "=\"" + iSymbolTable.translateProperties("[" + aTagPrefix + "]") + "\" ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

     } else {
//ScriptWriter~~       lValue = <![" + aTagPrefix + "]!>;
       lValue = iSymbolTable.translateProperties("[" + aTagPrefix + "]");
       if (aXmlSchemaElement.getTrim()) lValue = lValue.trim();
       if (aXmlSchemaElement.getIsEmpty()) lValue = "";
       if (aXmlSchemaElement.getPreserveEmpty() && lValue.equals("") && lArrayList.size() == 0) return;
//ScriptWriter~~       %><!%aIndent!><<!%aXmlSchemaElement.getName()!> <%
       {
//ScriptWriter~~~
iOutputManager.println("" + aIndent + "<" + aXmlSchemaElement.getName() + " ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

     }

     if (lAttribute && lArrayList.size() > 0) {
       System.out.println("**ERROR** Attribute can't have children.");
       return;
     }

     for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
       XmlSchemaElement lXmlSchemaElement = (XmlSchemaElement) lArrayList.get(lIdx);

       if (lXmlSchemaElement.getAttribute() == false && lCloseTag == false) {
//ScriptWriter~~         %>><!%lValue!><!%"\r\n"!><%
         {
//ScriptWriter~~~
iOutputManager.println(">" + lValue + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

         lCloseTag = true;
       }
       persistXml(lXmlSchemaElement, aTagPrefix, aIndent + "  ");
     }

     if (!lAttribute && lCloseTag == false) {
       if (aXmlSchemaElement.getIsEmpty()) {
//ScriptWriter~~         %>/><!%"\r\n"!><%
         {
//ScriptWriter~~~
iOutputManager.println("/>" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

         return;
       } else {
//ScriptWriter~~         %>><%
         {
//ScriptWriter~~~
iOutputManager.println(">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

         if (aXmlSchemaElement.getCdata()) {
//ScriptWriter~~           %><!%lCdataOpen!><!%lValue.trim()!><!%lCdataClose!><%
           {
//ScriptWriter~~~
iOutputManager.println("" + lCdataOpen + "" + lValue.trim() + "" + lCdataClose + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

         } else {
//ScriptWriter~~           %><!%lValue!><%
           {
//ScriptWriter~~~
iOutputManager.println("" + lValue + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

         }
//ScriptWriter~~         %><!%"\r\n"!><%
         {
//ScriptWriter~~~
iOutputManager.println("" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

       }
     }
     if (!lAttribute) {
//ScriptWriter~~       %><!%aIndent!></<!%aXmlSchemaElement.getName()!>><!%"\r\n"!><%
       {
//ScriptWriter~~~
iOutputManager.println("" + aIndent + "</" + aXmlSchemaElement.getName() + ">" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

     }
   }

//$Section=Operation$ID=42DD4DB0033C$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=417A4808007D$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A4808007D$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A4808007D$Preserve=no

//End of class---------------
}
