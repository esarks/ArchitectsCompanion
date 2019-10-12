//$Section=License$ID=3FB3952D00A6$Preserve=no

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

//  Generated at 2005.07.21 09:03:48.671 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: ParseXmlSchema.java

//$Section=ChangeLog$ID=3FB3952D00A6$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3FB3952D00A6$Preserve=no

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

//$Section=CustomDeclare$ID=3FB3952D00A6$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3FB3952D00A6$Preserve=no

//$Section=ClassJavadoc$ID=3FB3952D00A6$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3FB3952D00A6$Preserve=no
public class ParseXmlSchema extends DefaultHandler {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
    private Stack iElementStack = new Stack();
    private StringBuffer iElementValue;
    private String iPrefix = new String();
    private ParseXmlElement iParseXmlElement;
    private XmlSchemaFactory iXmlSchemaFactory;
    private XmlSchemaElement iXmlSchemaElementParent;
    private XmlSchemaElement iXmlSchemaElement;
    private Stack iXmlSchemaElementStack = new Stack();
    private String iPackageName;
    private String iSchemaPrefix = "";
    private boolean iFoundSchemaPrefix = false;
    private boolean iFoundSchemasPrefix = false;
    private SymbolTable iSymbolTableSchema;
    private SymbolTable iSymbolTable;
    private boolean iValidate = false;
    private String iExtendsKey = null;

//$Section=CustomClassDeclare$ID=3FB3952D00A6$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3FB3952D00A6$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3FB3952D00A6$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3FB3952D00A6$Preserve=no
    public ParseXmlSchema() {
//$Section=DefaultConstructor$ID=3FB3952D00A6$Preserve=yes
//$Section=DefaultConstructor$ID=3FB3952D00A6$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3FB3952D00A6$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3FB3952D00A6$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3FB3952D00A6$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3FB3952D00A6$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3FB3952D00A6$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3FB3952D00A6$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3FB3952D00A6$Preserve=yes

        if (iElementStack != null) {
            iElementStack.clear();
            iElementStack = null;
        }
        if (iXmlSchemaElementStack != null) {
            iXmlSchemaElementStack.clear();
            iXmlSchemaElementStack = null;
        }

        if (iParseXmlElement != null) {
            iParseXmlElement.freeResources();
            iParseXmlElement = null;
        }
        iXmlSchemaFactory = null;
        iXmlSchemaElementParent = null;
        iXmlSchemaElement = null;

        iSymbolTableSchema = null;

//$Section=DefaultFreeResources$ID=3FB3952D00A6$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3FB395470393$Preserve=yes
/**
 *
 * @param aPackageName
 *
 * @param aFileName
 *
 * @param aXmlSchemaFactory
 *
 */
//$Section=OperationJavadoc$ID=3FB395470393$Preserve=no
    public ParseXmlSchema( String aPackageName, String aFileName, XmlSchemaFactory aXmlSchemaFactory ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB395470393$Preserve=yes

        super();

        iPackageName = aPackageName;
        iXmlSchemaFactory = aXmlSchemaFactory;

        try {
            org.xml.sax.XMLReader lXMLReader = org.xml.sax.helpers.XMLReaderFactory.createXMLReader("org.apache.crimson.parser.XMLReaderImpl");

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
            System.out.println("ParseXmlSchema exception caught.  PackageName=" + aPackageName + ", FileName=" + aFileName);
            System.out.println(lException);

            StackTraceElement[] lStackTraceElements = lException.getStackTrace();
            for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
                System.out.println(lStackTraceElements[lTraceIdx].toString());
            }
        }

        freeResources();

//$Section=Operation$ID=3FB395470393$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB534930224$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @param aSymbolTable
 *
 */
//$Section=OperationJavadoc$ID=3FB534930224$Preserve=no
    public ParseXmlSchema( String aFileName, SymbolTable aSymbolTable ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB534930224$Preserve=yes

        super();

        iSymbolTableSchema = aSymbolTable;
        iSymbolTable = aSymbolTable;
        iXmlSchemaFactory = iSymbolTableSchema.getXmlSchemaFactory();

        try {
            org.xml.sax.XMLReader lXMLReader = org.xml.sax.helpers.XMLReaderFactory.createXMLReader("org.apache.crimson.parser.XMLReaderImpl");

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
            System.out.println("ParseXmlSchema exception caught.  FileName=" + aFileName);
            System.out.println(lException);

            StackTraceElement[] lStackTraceElements = lException.getStackTrace();
            for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
                System.out.println(lStackTraceElements[lTraceIdx].toString());
            }
        }

        freeResources();

//$Section=Operation$ID=3FB534930224$Preserve=no
    }

//$Section=OperationJavadoc$ID=415818C7035B$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @param aSymbolTableSchema
 *
 * @param aSymbolTable
 *
 * @param aValidate
 *
 */
//$Section=OperationJavadoc$ID=415818C7035B$Preserve=no
    public ParseXmlSchema( String aFileName, SymbolTable aSymbolTableSchema, SymbolTable aSymbolTable, boolean aValidate ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=415818C7035B$Preserve=yes

        super();

        iSymbolTableSchema = aSymbolTableSchema;
        iSymbolTable = aSymbolTable;
        iXmlSchemaFactory = iSymbolTableSchema.getXmlSchemaFactory();
        iValidate = aValidate;

        try {
            org.xml.sax.XMLReader lXMLReader = org.xml.sax.helpers.XMLReaderFactory.createXMLReader("org.apache.crimson.parser.XMLReaderImpl");

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
            System.out.println("ParseXmlSchema exception caught.  FileName=" + aFileName);
            System.out.println(lException);

            StackTraceElement[] lStackTraceElements = lException.getStackTrace();
            for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
                System.out.println(lStackTraceElements[lTraceIdx].toString());
            }
        }

        freeResources();

//$Section=Operation$ID=415818C7035B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB395470396$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB395470396$Preserve=no
    public void startDocument( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB395470396$Preserve=yes
//$Section=Operation$ID=3FB395470396$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB395470397$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB395470397$Preserve=no
    public void endDocument( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB395470397$Preserve=yes
//$Section=Operation$ID=3FB395470397$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB39547039D$Preserve=yes
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
 * @throws SAXParseException
 *
 */
//$Section=OperationJavadoc$ID=3FB39547039D$Preserve=no
    public void startElement( String aUri, String aName, String aQname, Attributes aAtts ) throws SAXParseException {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB39547039D$Preserve=yes

//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.startElement!aUri=" + Log.toString(aUri) + "!aName=" + Log.toString(aName) + "!aQname=" + Log.toString(aQname) + "!aAtts=" + Log.toString(aAtts) + "!");

        try {
            processXmlElement();
        } catch (SAXParseException e) {
            throw e;
        }

        if (iPrefix.length() > 0) iPrefix = iPrefix.concat(":");
        iPrefix = iPrefix.concat(aName);

        iParseXmlElement = new ParseXmlElement(iPrefix);
        for (int l = 0; l < aAtts.getLength(); l++) {
            ParseXmlElement lParseXmlElement = new ParseXmlElement(iParseXmlElement.getName() + ":" + aAtts.getLocalName(l), aAtts.getValue(l));
            iParseXmlElement.getAttributes().add(lParseXmlElement);
        }

//$Section=Operation$ID=3FB39547039D$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB3954703A2$Preserve=yes
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
//$Section=OperationJavadoc$ID=3FB3954703A2$Preserve=no
    public void endElement( String aUri, String aLocal, String aQname ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB3954703A2$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.endElement!aUri=" + Log.toString(aUri) + "!aLocal=" + Log.toString(aLocal) + "!aQname=" + Log.toString(aQname) + "!");

        try {
            processXmlElement();
        } catch (SAXParseException e) {}

        if (iPrefix.endsWith(":element")) {
            if (iXmlSchemaElementStack.empty()) {
                iXmlSchemaElement = null;
            } else {
                iXmlSchemaElement = (XmlSchemaElement) iXmlSchemaElementStack.pop();
            }
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

//$Section=Operation$ID=3FB3954703A2$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB3954703A6$Preserve=yes
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
//$Section=OperationJavadoc$ID=3FB3954703A6$Preserve=no
    public void characters( char[] aChar, int aStart, int aLength ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB3954703A6$Preserve=yes

        if (iParseXmlElement != null) {
            iParseXmlElement.getValue().append(aChar, aStart, aLength);
        }

//$Section=Operation$ID=3FB3954703A6$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB3954703AA$Preserve=yes
/**
 *
 * @param aTarget
 *
 * @param aData
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB3954703AA$Preserve=no
    public void processingInstruction( String aTarget, String aData ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB3954703AA$Preserve=yes
//$Section=Operation$ID=3FB3954703AA$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB3954703AD$Preserve=yes
/**
 *
 * @param aException
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB3954703AD$Preserve=no
    public void error( SAXParseException aException ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB3954703AD$Preserve=yes
//$Section=Operation$ID=3FB3954703AD$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB3954703AF$Preserve=yes
/**
 *
 * @param aException
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB3954703AF$Preserve=no
    public void fatalError( SAXParseException aException ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB3954703AF$Preserve=yes
//$Section=Operation$ID=3FB3954703AF$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB3954703B1$Preserve=yes
/**
 *
 * @param aException
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB3954703B1$Preserve=no
    public void warning( SAXParseException aException ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB3954703B1$Preserve=yes
//$Section=Operation$ID=3FB3954703B1$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FC0CBE6000E$Preserve=yes
/**
 *
 * @return
 *
 * @throws SAXParseException
 *
 */
//$Section=OperationJavadoc$ID=3FC0CBE6000E$Preserve=no
    private void processXmlElement( ) throws SAXParseException {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FC0CBE6000E$Preserve=yes

//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.processXmlElement!");

        if (iParseXmlElement != null) {

            XmlSchemaElement lXmlSchemaElement = null;
            PropertyValue lPropertyValue = null;
            String lPropertyName = null;

            if (iSymbolTableSchema == null) {
//                parseSchemaElement(iParseXmlElement.getName(), iParseXmlElement.getValue().toString().trim());
                parseSchemaElement(iParseXmlElement.getName(), iParseXmlElement.getValue().toString());
            } else {
                String lTry = "";
                if (iSchemaPrefix.length() > 0) {
                    lTry = iParseXmlElement.getName().substring(iSchemaPrefix.length()+1);
                } else {
                    lTry = iParseXmlElement.getName();
                }
//                if (iLog.test(iLogClass, Log._DEBUG))
//                    iLog.println(iLogClass, Log._DEBUG, "Info ParseXmlSchema.processXmlElement!lTry=" + Log.toString(lTry) + "!");
                lXmlSchemaElement = iXmlSchemaFactory.getXmlSchemaElement(lTry);
//                if (iLog.test(iLogClass, Log._DEBUG))
//                    iLog.println(iLogClass, Log._DEBUG, "Info ParseXmlSchema.processXmlElement!lXmlSchemaElement=" + Log.toString(lXmlSchemaElement) + "!");
                if (lXmlSchemaElement == null) {
                    if (iFoundSchemaPrefix == false) iSchemaPrefix = iParseXmlElement.getName();
                } else {
                    iFoundSchemaPrefix = true;
                    iSymbolTable.getPropertyCollection().assignSchema(iParseXmlElement.getName(), lXmlSchemaElement);
                    if (lXmlSchemaElement.getExtendsKey() != null) {
                        iExtendsKey = lXmlSchemaElement.getExtendsKey();
                    }
                }
                lPropertyName = iParseXmlElement.getName();
                lPropertyValue = new PropertyValue(iParseXmlElement.getValue().toString());
                lPropertyValue = iSymbolTable.getPropertyCollection().addPropertyValue(lPropertyName, lPropertyValue);
            }
            for (int l = 0; l < iParseXmlElement.getAttributes().size(); l++) {
                ParseXmlElement lParseXmlElement = (ParseXmlElement) iParseXmlElement.getAttributes().get(l);

                if (iSymbolTableSchema == null) {
//                    parseSchemaElement(lParseXmlElement.getName(), lParseXmlElement.getValue().toString().trim());
                    parseSchemaElement(lParseXmlElement.getName(), lParseXmlElement.getValue().toString());
                } else {
                    PropertyValue lPropertyValueAttr = new PropertyValue(lParseXmlElement.getValue().toString());
                    lPropertyValueAttr = iSymbolTable.getPropertyCollection().addPropertyValue(lParseXmlElement.getName(), lPropertyValueAttr);

                    // See if Extends processing is necessary...
//                    if (lXmlSchemaElement != null && lXmlSchemaElement.getExtendsKey() != null) {
                    if (iExtendsKey != null) {
//                        if (lParseXmlElement.getName().endsWith(":" + lXmlSchemaElement.getExtendsKey())) {
                        if (lParseXmlElement.getName().endsWith(":" + iExtendsKey)) {
                            if (lPropertyValue.getType().compareTo(lPropertyValueAttr.getType()) == 0) {
                                // Get the "super" PropertyValue to set extends from...
                                if (iSymbolTable.scan(lPropertyName, lPropertyValueAttr)) {
                                    PropertyValue lPropertyValueSuper = iSymbolTable.getPropertyCollection().getPropertyValue(lPropertyName, 0);
                                    lPropertyValue.setExtends(lPropertyValueSuper);
//                                    if (iLog.test(iLogClass, Log._DEBUG))
//                                        iLog.println(iLogClass, Log._DEBUG, "Info ParseXmlSchema.processXmlElement!set extends!lPropertyValue=" + Log.toString(lPropertyValue) + "!lPropertyValueSuper=" + Log.toString(lPropertyValueSuper) + "!");
                                    // Reset the last visited counters so everything is back where it was...
                                    if (iSymbolTable.scan(lPropertyName, lPropertyValue)) {
                                        //Everytying OK!
                                    } else {
                                        //ERROR
                                    }
                                } else {
                                    // ERROR, property not found...
                                }
                            } else {
                                //ERROR mismatched property types
                            }
                        }
                    }
                }
            }
            iParseXmlElement = null;
        }

//$Section=Operation$ID=3FC0CBE6000E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB3FF58015B$Preserve=yes
/**
 *
 * @param aName
 *
 * @param aValue
 *
 * @return
 *
 * @throws SAXParseException
 *
 */
//$Section=OperationJavadoc$ID=3FB3FF58015B$Preserve=no
    private void parseSchemaElement( String aName, String aValue ) throws SAXParseException {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.");
//$Section=Operation$ID=3FB3FF58015B$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlSchema.parseSchemaElement!aName=" + Log.toString(aName) + "!aValue=" + Log.toString(aValue) + "!");

        if (aName.endsWith("schemas")) iFoundSchemasPrefix = true;
        if (iFoundSchemasPrefix == false) return;

        if (aName.endsWith(":element")) {
            iXmlSchemaElement = new XmlSchemaElement();
            iXmlSchemaElementStack.push(iXmlSchemaElement);
        }
        else if (aName.endsWith("element:name")) {
            iXmlSchemaElement.setName(aValue);
            {
                iXmlSchemaElementStack.pop();   //pop this entry (will restore it shortly)
                if (iXmlSchemaElementStack.empty()) {
                    iXmlSchemaElementParent.addXmlSchemaElement(iXmlSchemaElement);
                } else {
                    XmlSchemaElement lXmlSchemaElement = (XmlSchemaElement) iXmlSchemaElementStack.peek();
                    lXmlSchemaElement.addXmlSchemaElement(iXmlSchemaElement);
                }
                iXmlSchemaElementStack.push(iXmlSchemaElement); // restore the current element
            }
        }
        else if (aName.endsWith("element:type")) {
            iXmlSchemaElement.setType(aValue);
        }
        else if (aName.endsWith("element:size")) {
            iXmlSchemaElement.setSize(Integer.parseInt(aValue));
        }
        else if (aName.endsWith("element:truncateEol")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElement.setTruncateEol(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElement.setTruncateEol(false);
        }
        else if (aName.endsWith("element:isEmpty")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElement.setIsEmpty(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElement.setIsEmpty(false);
        }
        else if (aName.endsWith("element:preserveEmpty")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElement.setPreserveEmpty(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElement.setPreserveEmpty(false);
        }
        else if (aName.endsWith("element:preserveNewLine")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElement.setPreserveNewLine(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElement.setPreserveNewLine(false);
        }
        else if (aName.endsWith("element:replaceNewLine")) {
            iXmlSchemaElement.setReplaceNewLine(aValue);
        }
        else if (aName.endsWith("element:attribute")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElement.setAttribute(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElement.setAttribute(false);
        }
        else if (aName.endsWith("element:cdata")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElement.setCdata(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElement.setCdata(false);
        }
        else if (aName.endsWith("element:recursive")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElement.setRecursive(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElement.setRecursive(false);
        }
        else if (aName.endsWith("element:rule")) {
//            iXmlSchemaElement.setRuleScript(aValue);
        }
        else if (aName.endsWith("element:dispatcher")) {
            iXmlSchemaElement.setDispatcher(aValue);
        }
        else if (aName.endsWith("element:prompt")) {
            iXmlSchemaElement.setPrompt(aValue);
        }
        else if (aName.endsWith("element:rows")) {
            iXmlSchemaElement.setRows(aValue);
        }
        else if (aName.endsWith("element:cols")) {
            iXmlSchemaElement.setCols(aValue);
        }
        else if (aName.endsWith("element:dbName")) {
            iXmlSchemaElement.setDbName(aValue);
        }
        else if (aName.endsWith("element:dbType")) {
            iXmlSchemaElement.setDbType(aValue);
        }
        else if (aName.endsWith("element:dbNullable")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElement.setDbNullable(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElement.setDbNullable(false);
        }
        else if (aName.endsWith("element:dbPrimaryKey")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElement.setDbPrimaryKey(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElement.setDbPrimaryKey(false);
        }
        else if (aName.endsWith("element:extendsKey")) {
            iXmlSchemaElement.setExtendsKey(aValue);
        }
        else if (aName.endsWith("element:schema")) {
            XmlSchemaElement lXmlSchemaElement = iXmlSchemaFactory.getXmlSchemaElement(aValue);
            if (lXmlSchemaElement != null) {
                iXmlSchemaElement.setXmlSchemaElement(lXmlSchemaElement);
            } else {
//                if (iLog.test(iLogClass, Log._ERR))
//                    iLog.println(iLogClass, Log._ERR, "Error ParseXmlSchema.parseSchemaElement!at element:schema, did not find schema!");
//                    System.err.println("Error ParseXmlSchema.parseSchemaElement!at element:schema, did not find schema name " + aValue);
            }
        }
        else if (aName.endsWith("schema")) {
            iXmlSchemaElementParent = null;
            iXmlSchemaElement = null;
            iXmlSchemaElementStack.clear();
        }
        else if (aName.endsWith("schema:name")) {
            iXmlSchemaElementParent = new XmlSchemaElement();
            iXmlSchemaElementParent.setName(iPackageName + "." + aValue);
            iXmlSchemaFactory.insert(iXmlSchemaElementParent);
        }
        else if (aName.endsWith("schema:type")) {
            iXmlSchemaElementParent.setType(aValue);
        }
        else if (aName.endsWith("schema:size")) {
            iXmlSchemaElementParent.setSize(Integer.parseInt(aValue));
        }
        else if (aName.endsWith("schema:truncateEol")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElementParent.setTruncateEol(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElementParent.setTruncateEol(false);
        }
        else if (aName.endsWith("schema:isEmpty")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElementParent.setIsEmpty(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElementParent.setIsEmpty(false);
        }
        else if (aName.endsWith("schema:preserveEmpty")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElementParent.setPreserveEmpty(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElementParent.setPreserveEmpty(false);
        }
        else if (aName.endsWith("schema:preserveNewLine")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElementParent.setPreserveNewLine(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElementParent.setPreserveNewLine(false);
        }
        else if (aName.endsWith("schema:replaceNewLine")) {
            iXmlSchemaElementParent.setReplaceNewLine(aValue);
        }
        else if (aName.endsWith("schema:attribute")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElementParent.setAttribute(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElementParent.setAttribute(false);
        }
        else if (aName.endsWith("schema:cdata")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElementParent.setCdata(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElementParent.setCdata(false);
        }
        else if (aName.endsWith("schema:recursive")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElementParent.setRecursive(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElementParent.setRecursive(false);
        }
        else if (aName.endsWith("schema:rule")) {
//            iXmlSchemaElementParent.setRuleScript(aValue);
        }
        else if (aName.endsWith("schema:dispatcher")) {
            iXmlSchemaElementParent.setDispatcher(aValue);
        }
        else if (aName.endsWith("schema:prompt")) {
            iXmlSchemaElementParent.setPrompt(aValue);
        }
        else if (aName.endsWith("schema:rows")) {
            iXmlSchemaElementParent.setRows(aValue);
        }
        else if (aName.endsWith("schema:cols")) {
            iXmlSchemaElementParent.setCols(aValue);
        }
        else if (aName.endsWith("schema:dbTable")) {
            iXmlSchemaElementParent.setDbTable(aValue);
        }
        else if (aName.endsWith("schema:dbName")) {
            iXmlSchemaElementParent.setDbName(aValue);
        }
        else if (aName.endsWith("schema:dbType")) {
            iXmlSchemaElementParent.setDbType(aValue);
        }
        else if (aName.endsWith("schema:dbNullable")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElementParent.setDbNullable(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElementParent.setDbNullable(false);
        }
        else if (aName.endsWith("schema:dbPrimaryKey")) {
            if (aValue.compareTo("true") == 0) iXmlSchemaElementParent.setDbPrimaryKey(true);
            if (aValue.compareTo("false") == 0) iXmlSchemaElementParent.setDbPrimaryKey(false);
        }
        else if (aName.endsWith("schema:extendsKey")) {
            iXmlSchemaElementParent.setExtendsKey(aValue);
        }

//$Section=Operation$ID=3FB3FF58015B$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3FB3952D00A6$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FB3952D00A6$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FB3952D00A6$Preserve=no

//End of class---------------
}
