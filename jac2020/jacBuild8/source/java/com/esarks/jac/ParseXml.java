//$Section=License$ID=3F9C989E0358$Preserve=no

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

//  Generated at 2005.04.08 09:10:57.656 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: ParseXml.java

//$Section=ChangeLog$ID=3F9C989E0358$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9C989E0358$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;
import java.io.*;
import org.xml.sax.*;
import org.xml.sax.ext.*;
import org.xml.sax.helpers.*;

//$Section=CustomDeclare$ID=3F9C989E0358$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3F9C989E0358$Preserve=no

//$Section=ClassJavadoc$ID=3F9C989E0358$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3F9C989E0358$Preserve=no
public class ParseXml extends DefaultHandler {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
    private SymbolTable iSymbolTable;
    private StringBuffer iElementValue;
    private String iPrefix = new String();
    private ParseXmlElement iParseXmlElement;

//$Section=CustomClassDeclare$ID=3F9C989E0358$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9C989E0358$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9C989E0358$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9C989E0358$Preserve=no
    private ParseXml() {
//$Section=DefaultConstructor$ID=3F9C989E0358$Preserve=yes
//$Section=DefaultConstructor$ID=3F9C989E0358$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9C989E0358$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9C989E0358$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9C989E0358$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3F9C989E0358$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9C989E0358$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9C989E0358$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9C989E0358$Preserve=yes

        iSymbolTable = null;
        if (iParseXmlElement != null) {
            iParseXmlElement.freeResources();
            iParseXmlElement = null;
        }

//$Section=DefaultFreeResources$ID=3F9C989E0358$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3FB51C1003C3$Preserve=yes
/**
 *
 * @param aSymbolTable
 *
 * @param aFileName
 *
 * @param aRootProperty
 *
 */
//$Section=OperationJavadoc$ID=3FB51C1003C3$Preserve=no
    public ParseXml( SymbolTable aSymbolTable, String aFileName, String aRootProperty ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3FB51C1003C3$Preserve=yes

        super();

        iSymbolTable = aSymbolTable;
        if (aRootProperty != null) iPrefix = new String(aRootProperty);

        try {

            org.xml.sax.XMLReader lXMLReader = org.xml.sax.helpers.XMLReaderFactory.createXMLReader("org.apache.crimson.parser.XMLReaderImpl");
//            org.xml.sax.XMLReader lXMLReader = org.xml.sax.helpers.XMLReaderFactory.createXMLReader("com.bluecast.xml.Piccolo");
//            org.xml.sax.XMLReader lXMLReader = org.xml.sax.helpers.XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");

            lXMLReader.setContentHandler(this);
            lXMLReader.setErrorHandler(this);

            if (aFileName.startsWith("<") == true) {
              StringReader lStringReader = new StringReader(aFileName);
              lXMLReader.parse(new InputSource(lStringReader));
            } else {
              FileReader lFileReader = new FileReader(aFileName);
              lXMLReader.parse(new InputSource(lFileReader));
            }
        }

        catch (Exception lException) {
            System.out.println("ParseXml exception caught.  FileName=" + aFileName);
            System.out.println(lException);
        }

        freeResources();

//$Section=Operation$ID=3FB51C1003C3$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C98DF013E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C98DF013E$Preserve=no
    public void startDocument( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3F9C98DF013E$Preserve=yes
//$Section=Operation$ID=3F9C98DF013E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C98DF0148$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C98DF0148$Preserve=no
    public void endDocument( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3F9C98DF0148$Preserve=yes
//$Section=Operation$ID=3F9C98DF0148$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C98DF0152$Preserve=yes
/**
 *
 * @param aUri
 *
 * @param aName
 *
 * @param aQname
 *
 * @param aAtts
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C98DF0152$Preserve=no
    public void startElement( String aUri, String aName, String aQname, Attributes aAtts ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3F9C98DF0152$Preserve=yes

        if (iParseXmlElement != null) {
            iSymbolTable.getPropertyCollection().addPropertyValue(iParseXmlElement.getName(), new PropertyValue(iParseXmlElement.getValue().toString()));
            for (int l = 0; l < iParseXmlElement.getAttributes().size(); l++) {
                ParseXmlElement lParseXmlElement = (ParseXmlElement) iParseXmlElement.getAttributes().get(l);
                iSymbolTable.getPropertyCollection().addPropertyValue(lParseXmlElement.getName(), new PropertyValue(lParseXmlElement.getValue().toString()));
            }
            iParseXmlElement = null;
        }

        if (iPrefix.length() > 0) iPrefix = iPrefix.concat(":");

        String lName = aName;
        if (!aName.equals(aQname)) {
            lName = aQname.substring(0, aQname.length() - aName.length() - 1) + "~" + aName;
        }
        
        iPrefix = iPrefix.concat(lName);

        iParseXmlElement = new ParseXmlElement(iPrefix);
        for (int l = 0; l < aAtts.getLength(); l++) {
            lName = aAtts.getQName(l);
            int lNameIdx = lName.indexOf(":");
            if (lNameIdx >= 0) {
                lName = aAtts.getQName(l).substring(0, lNameIdx) + "~" + aAtts.getQName(l).substring(lNameIdx + 1);
            }
            ParseXmlElement lParseXmlElement = new ParseXmlElement(iParseXmlElement.getName() + ":" + lName, aAtts.getValue(l));
            iParseXmlElement.getAttributes().add(lParseXmlElement);
        }

//$Section=Operation$ID=3F9C98DF0152$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C98DF0166$Preserve=yes
/**
 *
 * @param aUri
 *
 * @param aLocal
 *
 * @param aQname
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C98DF0166$Preserve=no
    public void endElement( String aUri, String aLocal, String aQname ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3F9C98DF0166$Preserve=yes

        if (iParseXmlElement != null) {
            iSymbolTable.getPropertyCollection().addPropertyValue(iParseXmlElement.getName(), new PropertyValue(iParseXmlElement.getValue().toString()));
            for (int l = 0; l < iParseXmlElement.getAttributes().size(); l++) {
                ParseXmlElement lParseXmlElement = (ParseXmlElement) iParseXmlElement.getAttributes().get(l);
                iSymbolTable.getPropertyCollection().addPropertyValue(lParseXmlElement.getName(), new PropertyValue(lParseXmlElement.getValue().toString()));
            }
            iParseXmlElement = null;
        }

        String lRight = iPrefix;
        String lColon = "";
        iPrefix = "";
        int lIdx = lRight.indexOf(":");
        while (lIdx > -1) {
            iPrefix = iPrefix + lColon + lRight.substring(0, lIdx);
            lRight = lRight.substring(lIdx+1);
            lIdx = lRight.indexOf(":");
            lColon = ":";
        }

//$Section=Operation$ID=3F9C98DF0166$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C98DF0170$Preserve=yes
/**
 *
 * @param aChar
 *
 * @param aStart
 *
 * @param aLength
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C98DF0170$Preserve=no
    public void characters( char[] aChar, int aStart, int aLength ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3F9C98DF0170$Preserve=yes

        if (iParseXmlElement != null) {
            iParseXmlElement.getValue().append(aChar, aStart, aLength);
        } else {
            PropertyValue lPropertyValue = iSymbolTable.getPropertyCollection().getPropertyValue(iPrefix, 0);
            lPropertyValue.reset(lPropertyValue.getValueString() + new String(aChar, aStart, aLength));
        }

//$Section=Operation$ID=3F9C98DF0170$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C98DF017A$Preserve=yes
/**
 *
 * @param aTarget
 *
 * @param aData
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C98DF017A$Preserve=no
    public void processingInstruction( String aTarget, String aData ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3F9C98DF017A$Preserve=yes
//$Section=Operation$ID=3F9C98DF017A$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C98DF018E$Preserve=yes
/**
 *
 * @param aException
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C98DF018E$Preserve=no
    public void error( SAXParseException aException ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3F9C98DF018E$Preserve=yes
//$Section=Operation$ID=3F9C98DF018E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C98DF0198$Preserve=yes
/**
 *
 * @param aException
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C98DF0198$Preserve=no
    public void fatalError( SAXParseException aException ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3F9C98DF0198$Preserve=yes
//$Section=Operation$ID=3F9C98DF0198$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C98DF01AD$Preserve=yes
/**
 *
 * @param aException
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C98DF01AD$Preserve=no
    public void warning( SAXParseException aException ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXml.");
//$Section=Operation$ID=3F9C98DF01AD$Preserve=yes
//$Section=Operation$ID=3F9C98DF01AD$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9C989E0358$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C989E0358$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C989E0358$Preserve=no

//End of class---------------
}
