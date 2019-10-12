//$Section=License$ID=3F9C58F70158$Preserve=no

/* ========================================================================= *
 *                                                                           *
 *                       The eSarks Software License                         *
 *                                                                           *
 *        Copyright (c) 1998 - 2003 Architects of Software Design, Corp.     *
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

//  Generated at 2005.04.05 03:13:02.328 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: OutputManager.java

//$Section=ChangeLog$ID=3F9C58F70158$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9C58F70158$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;

//$Section=CustomDeclare$ID=3F9C58F70158$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3F9C58F70158$Preserve=no

//$Section=ClassJavadoc$ID=3F9C58F70158$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3F9C58F70158$Preserve=no
public class OutputManager {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private FileOutputStream iFileOutputStream;
    private PrintWriter iPrintWriter;
    private boolean iClosePrintWriter = true;
    private boolean iIsOpen;
    private FileOutputStream iDebugFileOutputStream;
    private PrintWriter iDebugPrintWriter;
    private boolean iDebugIsOpen;
    private JspWriter iJspWriter;
    private Map iDocuments = new TreeMap();
    private String iDocumentContext = null;
    private Stack iContextStack = new Stack();
    private String iExceptionMessage;

//$Section=CustomClassDeclare$ID=3F9C58F70158$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9C58F70158$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9C58F70158$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9C58F70158$Preserve=no
    public OutputManager() {
//$Section=DefaultConstructor$ID=3F9C58F70158$Preserve=yes

        iIsOpen = false;
        iDebugIsOpen = false;

//$Section=DefaultConstructor$ID=3F9C58F70158$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9C58F70158$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9C58F70158$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9C58F70158$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3F9C58F70158$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9C58F70158$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9C58F70158$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9C58F70158$Preserve=yes

        closeOutputFile();
        closeDebugFile();
        iFileOutputStream = null;
        iPrintWriter = null;
        iDebugFileOutputStream = null;
        iDebugPrintWriter = null;
        iJspWriter = null;
        iIsOpen = false;
        iDebugIsOpen = false;

//$Section=DefaultFreeResources$ID=3F9C58F70158$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3F9D61740293$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @param aAppend
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D61740293$Preserve=no
    public boolean openOutputFile( String aFileName, boolean aAppend ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=3F9D61740293$Preserve=yes

        try {
            closeOutputFile();
            iDocumentContext = null;
            iFileOutputStream = new FileOutputStream(aFileName, aAppend);
            iPrintWriter = new PrintWriter(iFileOutputStream);
            iIsOpen = true;
            iClosePrintWriter = true;
            iExceptionMessage = null;
            return true;
        } catch (Exception e) {iExceptionMessage = e.getMessage();
                               return false;}

//$Section=Operation$ID=3F9D61740293$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9D6174029D$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D6174029D$Preserve=no
    public void closeOutputFile( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=3F9D6174029D$Preserve=yes

        try {
            if (iPrintWriter != null) {
                if (iClosePrintWriter == true) {
                    iPrintWriter.close();
                    iFileOutputStream.close();
                }
                iPrintWriter = null;
                iFileOutputStream = null;
            }
//            if (iJspWriter_isNull == false) {
//                iJspWriter = null;
//                iJspWriter_isNull = true;
//            }
        } catch (Exception e) {System.err.println(e);}

        iIsOpen = false;

        while (!iContextStack.empty()) {
           if (iDocuments.containsKey((String) iContextStack.peek())) {
                iDocumentContext = (String) iContextStack.peek();
                return;
            }
            iContextStack.pop();
        }

//$Section=Operation$ID=3F9D6174029D$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9D6174029E$Preserve=yes
/**
 *
 * @param aLine
 *
 * @param aLineFeed
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D6174029E$Preserve=no
    public void println( String aLine, boolean aLineFeed ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=3F9D6174029E$Preserve=yes

        if (iDocumentContext != null && iDocuments.containsKey(iDocumentContext) == true) {
            StringBuffer lDocument = (StringBuffer) iDocuments.get(iDocumentContext);
            lDocument.append(aLine);
            if (aLineFeed) lDocument.append("\r\n");
            return;
        }

        if (iIsOpen == true) {
            if (aLineFeed == true) {
                iPrintWriter.println(aLine);
                iPrintWriter.flush();
                return;
            }
            iPrintWriter.print(aLine);
            iPrintWriter.flush();
            return;
        }

        if (iJspWriter != null) {
            if (aLineFeed == true) {
                try {
                    iJspWriter.println(aLine);
                }
                catch (IOException e) {}
                return;
            }
            try {
                iJspWriter.print(aLine);
            }
            catch (IOException e) {}
            return;
        }

        if (aLineFeed == true) {
            System.out.println(aLine);
            return;
        }
        System.out.print(aLine);
        return;

//$Section=Operation$ID=3F9D6174029E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9D617402A7$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @param aAppend
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D617402A7$Preserve=no
    public boolean openDebugFile( String aFileName, boolean aAppend ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=3F9D617402A7$Preserve=yes

        try {
            closeDebugFile();
            iDebugFileOutputStream = new FileOutputStream(aFileName, aAppend);
            iDebugPrintWriter = new PrintWriter(iDebugFileOutputStream);
            iDebugIsOpen = true;
            return true;
        } catch (Exception e) {return false;}

//$Section=Operation$ID=3F9D617402A7$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9D617402B1$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D617402B1$Preserve=no
    public void closeDebugFile( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=3F9D617402B1$Preserve=yes

        if (iDebugIsOpen == false) return;
        try {
            iDebugPrintWriter.close();
            iDebugFileOutputStream.close();
            iDebugPrintWriter = null;
            iDebugFileOutputStream = null;
        } catch (Exception e) {}

        iDebugIsOpen = false;

//$Section=Operation$ID=3F9D617402B1$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9D617402B2$Preserve=yes
/**
 *
 * @param aLine
 *
 * @param aLineFeed
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D617402B2$Preserve=no
    public void debugPrintln( String aLine, boolean aLineFeed ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=3F9D617402B2$Preserve=yes

        if (iDebugIsOpen == false) {
            if (iJspWriter != null) return;
            if (aLineFeed == true) {
                System.out.println(aLine);
                return;
            }
            System.out.print(aLine);
            return;
        }

        if (aLineFeed == true) {
            iDebugPrintWriter.println(aLine);
            iDebugPrintWriter.flush();
            return;
        }
        iDebugPrintWriter.print(aLine);
        iDebugPrintWriter.flush();

//$Section=Operation$ID=3F9D617402B2$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9D617402BB$Preserve=yes
/**
 *
 * @param aJspWriter
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D617402BB$Preserve=no
    public void setJspWriter( JspWriter aJspWriter ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=3F9D617402BB$Preserve=yes

        iJspWriter = aJspWriter;

//$Section=Operation$ID=3F9D617402BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=4220FB1C030D$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4220FB1C030D$Preserve=no
    public boolean isJspOpen( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=4220FB1C030D$Preserve=yes
        if (iJspWriter != null) return true;
        return false;
//$Section=Operation$ID=4220FB1C030D$Preserve=no
    }

//$Section=OperationJavadoc$ID=42523A46032C$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42523A46032C$Preserve=no
    public boolean isOpen( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=42523A46032C$Preserve=yes
        return iIsOpen;
//$Section=Operation$ID=42523A46032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=42523A50032C$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42523A50032C$Preserve=no
    public boolean isDocumentOpen( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=42523A50032C$Preserve=yes
        if (iDocumentContext != null && iDocuments.containsKey(iDocumentContext) == true) return true;
        return false;
//$Section=Operation$ID=42523A50032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=42523A5F0242$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42523A5F0242$Preserve=no
    public boolean isAnyOpen( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=42523A5F0242$Preserve=yes
        return (isJspOpen() || isOpen() || isDocumentOpen());
//$Section=Operation$ID=42523A5F0242$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9D617402C5$Preserve=yes
/**
 *
 * @param aPrintWriter
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D617402C5$Preserve=no
    public void setPrintWriter( PrintWriter aPrintWriter ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=3F9D617402C5$Preserve=yes

        iClosePrintWriter = false;
        iPrintWriter = aPrintWriter;
        iIsOpen = true;

//$Section=Operation$ID=3F9D617402C5$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9D617402CF$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D617402CF$Preserve=no
    public void discardInstance( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=3F9D617402CF$Preserve=yes

        closeOutputFile();
        closeDebugFile();
        iPrintWriter = null;
        iJspWriter = null;

//$Section=Operation$ID=3F9D617402CF$Preserve=no
    }

//$Section=OperationJavadoc$ID=4105A8C90242$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4105A8C90242$Preserve=no
    public void clear( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=4105A8C90242$Preserve=yes

    try {
        if (iJspWriter != null) iJspWriter.clearBuffer();
    } catch(Exception e) {}

//$Section=Operation$ID=4105A8C90242$Preserve=no
    }

//$Section=OperationJavadoc$ID=411E962C0157$Preserve=yes
/**
 *
 * @param aDocumentName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=411E962C0157$Preserve=no
    public void addDocument( String aDocumentName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=411E962C0157$Preserve=yes

        StringBuffer lDocument = new StringBuffer();
        iDocuments.put(aDocumentName, lDocument);
        iDocumentContext = aDocumentName;
        iContextStack.push(aDocumentName);

//$Section=Operation$ID=411E962C0157$Preserve=no
    }

//$Section=OperationJavadoc$ID=41E7AD05007D$Preserve=yes
/**
 *
 * @param aDocumentName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41E7AD05007D$Preserve=no
    public void setDocument( String aDocumentName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=41E7AD05007D$Preserve=yes

        if (aDocumentName == null || aDocumentName.equals("")) {
            iDocumentContext = null;
            return;
        }
        if (iDocuments.containsKey(aDocumentName) == true) {
          iDocumentContext = aDocumentName;
          iContextStack.push(aDocumentName);
        } else {
          addDocument(aDocumentName);
        }

//$Section=Operation$ID=41E7AD05007D$Preserve=no
    }

//$Section=OperationJavadoc$ID=411E965302CE$Preserve=yes
/**
 *
 * @param aDocumentName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=411E965302CE$Preserve=no
    public StringBuffer getDocument( String aDocumentName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=411E965302CE$Preserve=yes

        if (iDocuments.containsKey(aDocumentName) == true) {
            StringBuffer lDocument = (StringBuffer) iDocuments.get(aDocumentName);
            iDocuments.remove(aDocumentName);
            while (!iContextStack.empty()) {
                if (iDocuments.containsKey((String) iContextStack.peek())) {
                    iDocumentContext = (String) iContextStack.peek();
                    return lDocument;
                }
                iContextStack.pop();
            }
            iDocumentContext = null;
            return lDocument;
        }
        return new StringBuffer();

//$Section=Operation$ID=411E965302CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=41E8B7B302AF$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41E8B7B302AF$Preserve=no
    public String popDocument( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter OutputManager.");
//$Section=Operation$ID=41E8B7B302AF$Preserve=yes

        if (iContextStack.empty()) {
            iDocumentContext = null;
            return null;
        }
        iContextStack.pop();
        if (iContextStack.empty()) {
            iDocumentContext = null;
            return null;
        } else {
            iDocumentContext = (String) iContextStack.peek();
            return iDocumentContext;
        }

//$Section=Operation$ID=41E8B7B302AF$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// ExceptionMessage
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=41F54F8302AF$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=41F54F8302AF$Preserve=no
    public String getExceptionMessage() {
//$Section=Attribute get$ID=41F54F8302AF$Preserve=no
        return iExceptionMessage;
//$Section=Attribute get$ID=41F54F8302AF$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=41F54F8302AF$Preserve=no
/**
 * Set accessor method.
 *
 * @param ExceptionMessage the value to be set.
 */
//$Section=Attribute setJavadoc$ID=41F54F8302AF$Preserve=no
    public void setExceptionMessage(String aValue) {
//$Section=Attribute set$ID=41F54F8302AF$Preserve=no
        iExceptionMessage = aValue;
//$Section=Attribute set$ID=41F54F8302AF$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9C58F70158$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C58F70158$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C58F70158$Preserve=no

//End of class---------------
}
