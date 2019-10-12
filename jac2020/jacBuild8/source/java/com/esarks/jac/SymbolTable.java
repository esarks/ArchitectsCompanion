//$Section=License$ID=3F9C589503D8$Preserve=no

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

//  Generated at 2009.03.23 06:14:59.703 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: SymbolTable.java

//$Section=ChangeLog$ID=3F9C589503D8$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9C589503D8$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.text.*;
import javax.servlet.*;

//$Section=CustomDeclare$ID=3F9C589503D8$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3F9C589503D8$Preserve=no

//$Section=ClassJavadoc$ID=3F9C589503D8$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3F9C589503D8$Preserve=no
public class SymbolTable {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
    private PropertyCollection iPropertyCollection = new PropertyCollection();
    private long iStartTime;
    private static boolean iLicenseVerified;
    private static boolean iLimitRunningTime;
    private static int iForgiveCounter;
    private static boolean iLoadingXml;
    private ServletRequest iServletRequest;
    private DbConnection iDbConnection;
    private XmlSchemaFactory iXmlSchemaFactory;
    private String iFileSeparator;

//$Section=CustomClassDeclare$ID=3F9C589503D8$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9C589503D8$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9C589503D8$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9C589503D8$Preserve=no
    public SymbolTable() {
//$Section=DefaultConstructor$ID=3F9C589503D8$Preserve=yes

        iFileSeparator = System.getProperty("file.separator");
        iXmlSchemaFactory = new XmlSchemaFactory();

//$Section=DefaultConstructor$ID=3F9C589503D8$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9C589503D8$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9C589503D8$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9C589503D8$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3F9C589503D8$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9C589503D8$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9C589503D8$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9C589503D8$Preserve=yes

        if (iPropertyCollection != null) {
            iPropertyCollection = null;
        }
        iServletRequest = null;
        if (iDbConnection != null) {
            iDbConnection = null;
        }
        if (iXmlSchemaFactory != null) {
            iXmlSchemaFactory = null;
        }

//$Section=DefaultFreeResources$ID=3F9C589503D8$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=4113E35B032C$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4113E35B032C$Preserve=no
    public void freeDbConnection( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=4113E35B032C$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.freeDbConnection!");

        if (iDbConnection == null) {
            return;
        }
        iDbConnection.returnToPool();

//$Section=Operation$ID=4113E35B032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C97EC0211$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C97EC0211$Preserve=no
    public void parseXml( String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3F9C97EC0211$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.parseXml!aFileName=" + Log.toString(aFileName) + "!");

        parseXml(aFileName, null);

//$Section=Operation$ID=3F9C97EC0211$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F1D9580222$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @param aRootName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F1D9580222$Preserve=no
    public void parseXml( String aFileName, String aRootName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=40F1D9580222$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.parseXml!aFileName=" + Log.toString(aFileName) + "!aRootName=" + Log.toString(aRootName) + "!");

//        ParseXml lParseXml = new ParseXml(this, aFileName, aRootName);
        ParseXml lParseXml = new ParseXml(this, aFileName, aRootName);
        lParseXml.freeResources();

//$Section=Operation$ID=40F1D9580222$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9D264F038B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9D264F038B$Preserve=no
    public PropertyCollection getPropertyCollection( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3F9D264F038B$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.getPropertyCollection!");

        return iPropertyCollection;

//$Section=Operation$ID=3F9D264F038B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB4D7C601A2$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aSchemaName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB4D7C601A2$Preserve=no
    public void assignSchema( String aPropertyName, String aSchemaName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3FB4D7C601A2$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.assignSchema!aPropertyName=" + Log.toString(aPropertyName) + "!aSchemaName=" + Log.toString(aSchemaName) + "!");

        XmlSchemaElement lXmlSchemaElement = getXmlSchemaFactory().getXmlSchemaElement(aSchemaName);
        if (lXmlSchemaElement == null) return;
        iPropertyCollection.assignSchema(aPropertyName, lXmlSchemaElement);

//  symbolTable.getXmlSchemaFactory().getXmlSchema("Demo.Schema.test");


//$Section=Operation$ID=3FB4D7C601A2$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB6021C009B$Preserve=yes
/**
 *
 * @param aSchemaName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6021C009B$Preserve=no
    public void loadXmlSchema( String aSchemaName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3FB6021C009B$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.loadXmlSchema!aSchemaName=" + Log.toString(aSchemaName) + "!");

        loadXmlSchema(aSchemaName, getScriptsFilePath(aSchemaName) + ".xml");

//$Section=Operation$ID=3FB6021C009B$Preserve=no
    }

//$Section=OperationJavadoc$ID=411218410177$Preserve=yes
/**
 *
 * @param aSchemaName
 *
 * @param aFilePath
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=411218410177$Preserve=no
    public void loadXmlSchema( String aSchemaName, String aFilePath ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=411218410177$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.loadXmlSchema!aSchemaName=" + Log.toString(aSchemaName) + "!aFilePath=" + Log.toString(aFilePath));

        getXmlSchemaFactory().loadXmlSchema(aSchemaName, aFilePath);

//$Section=Operation$ID=411218410177$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB538D1015D$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB538D1015D$Preserve=no
    public void parseXmlSchema( String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3FB538D1015D$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.parseXmlSchema!aFileName=" + Log.toString(aFileName) + "!");

        ParseXmlSchema lParseXmlSchema = new ParseXmlSchema(aFileName, this);
        lParseXmlSchema.freeResources();

//$Section=Operation$ID=3FB538D1015D$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9EF05301D5$Preserve=yes
/**
 *
 * @param aToTranslate
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9EF05301D5$Preserve=no
    public String translateProperties( String aToTranslate ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3F9EF05301D5$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.translateProperties!aToTranslate=" + Log.toString(aToTranslate) + "!");

        String lResult = aToTranslate;
        String lPropertyName;
        String lPropertyValue;
        String lStartDelimeter = "[";
        String lEndDelimeter = "]";
        String lEscapeCharacter = "\\";
        String lSpaces = "                                                                                                    ";

        int lIdxSlash;
        int lSlashCount;

        int lIdx=lResult.length()-1,
            lEndIdx=-1,
            lStartIdx=-1;

        while (lIdx > -1) {

            if (lIdx == 0) {
                if (lResult.charAt(0) == ']') lEndIdx = lIdx;
                if (lResult.charAt(0) == '[') lStartIdx = lIdx;
            } else {
                if (lResult.charAt(lIdx) == ']' && lResult.charAt(lIdx - 1) != '\\') lEndIdx = lIdx;
                if (lResult.charAt(lIdx) == '[') {
                    lIdxSlash = lIdx - 1;
                    lSlashCount = 0;
                    while (lIdxSlash >=0 && lResult.charAt(lIdxSlash) == '\\') {
                        lSlashCount++;
                        if (lSlashCount == 2) lSlashCount = 0;
                        lIdxSlash--;
                    }
                    if (lSlashCount == 0) lStartIdx = lIdx;
                }
                if (lResult.charAt(lIdx) == '\\' && lResult.charAt(lIdx - 1) == '\\') {
                    lResult = lResult.substring(0, lIdx - 1) + lResult.substring(lIdx);
                    lIdx--;
                    if (lEndIdx > lIdx) lEndIdx--;
                    if (lStartIdx > lIdx) lStartIdx--;
                }
            }

            if (lStartIdx > -1 && lEndIdx > lStartIdx) {

                lPropertyName = lResult.substring(lStartIdx+1, lEndIdx);
                lPropertyValue = "";
                if (lPropertyName.startsWith("cap@")) {
                    lPropertyValue = lPropertyName.substring(4,5).toUpperCase() + lPropertyName.substring(5);

                } else if (lPropertyName.startsWith("tohtml@")) {
                    String lTemp = lPropertyName.substring(7);
                    int lTempIdx = lTemp.indexOf("{");
                    while (lTempIdx > -1) {
                        lTemp = lTemp.substring(0,lTempIdx) + "<" + lTemp.substring(lTempIdx+1);
                        lTempIdx = lTemp.indexOf("{");
                    }
                    lTempIdx = lTemp.indexOf("}");
                    while (lTempIdx > -1) {
                        lTemp = lTemp.substring(0,lTempIdx) + ">" + lTemp.substring(lTempIdx+1);
                        lTempIdx = lTemp.indexOf("}");
                    }
                    lPropertyValue = lTemp;

                } else if (lPropertyName.startsWith("html@")) {
                    String lTemp = lPropertyName.substring(5);
                    int lTempIdx = lTemp.indexOf("&");
                    while (lTempIdx > -1) {
                        lTemp = lTemp.substring(0,lTempIdx) + "&amp;" + lTemp.substring(lTempIdx+1);
                        lTempIdx = lTemp.indexOf("&", lTempIdx + 1);
                    }
                    lTempIdx = lTemp.indexOf("<");
                    while (lTempIdx > -1) {
                        lTemp = lTemp.substring(0,lTempIdx) + "&lt;" + lTemp.substring(lTempIdx+1);
                        lTempIdx = lTemp.indexOf("<");
                    }
                    lTempIdx = lTemp.indexOf(">");
                    while (lTempIdx > -1) {
                        lTemp = lTemp.substring(0,lTempIdx) + "&gt;" + lTemp.substring(lTempIdx+1);
                        lTempIdx = lTemp.indexOf(">");
                    }
                    lTempIdx = lTemp.indexOf("\"");
                    while (lTempIdx > -1) {
                        lTemp = lTemp.substring(0,lTempIdx) + "&quot;" + lTemp.substring(lTempIdx+1);
                        lTempIdx = lTemp.indexOf("\"");
                    }
                    lTempIdx = lTemp.indexOf("'");
                    while (lTempIdx > -1) {
                        lTemp = lTemp.substring(0,lTempIdx) + "&apos;" + lTemp.substring(lTempIdx+1);
                        lTempIdx = lTemp.indexOf("'");
                    }
                    lPropertyValue = lTemp;

                } else if (lPropertyName.startsWith("href@")) {
                    String lTemp = lPropertyName.substring(5);
                    for (int i=0; i < lTemp.length(); i++) {
                        if (!Character.isLetterOrDigit(lTemp.charAt(i))) {
                            char lChar = lTemp.charAt(i);
                            String lHex = Integer.toHexString((int) lChar);
                            if (lHex.length() == 1) lHex = "0".concat(lHex);
                            lTemp = lTemp.substring(0, i) + "%" + lHex + lTemp.substring(i+1);
                        }
                    }
                    lPropertyValue = lTemp;

                } else if (lPropertyName.startsWith("number@")) {

                    try {
                        NumberFormat lNumberFormat = NumberFormat.getInstance();

                        Object[] larguments = { lNumberFormat.parse(lPropertyName.substring(7)) };
                        lPropertyValue = MessageFormat.format(getPropertyCollection().getPropertyValue("$numberFormat", 0).toString(), larguments);

                    } catch (Exception lException) {lPropertyValue="";}

                } else if (lPropertyName.startsWith("currency@")) {

                    try {
                        NumberFormat lNumberFormat = NumberFormat.getInstance();

                        Object[] larguments = { lNumberFormat.parse(lPropertyName.substring(9)) };
                        lPropertyValue = MessageFormat.format(getPropertyCollection().getPropertyValue("$currencyFormat", 0).toString(), larguments);

                    } catch (Exception lException) {lPropertyValue="";}

                } else if (lPropertyName.startsWith("date@")) {

                    try {
                        SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat(getPropertyCollection().getPropertyValue("$inputDateFormat", 0).toString());
                        java.util.Date lDate = lSimpleDateFormat.parse(lPropertyName.substring(5), new ParsePosition(0));

                        lSimpleDateFormat.applyPattern(getPropertyCollection().getPropertyValue("$outputDateFormat", 0).toString());
                        lPropertyValue = lSimpleDateFormat.format(lDate);

                        //DateFormat lDateFormat = DateFormat.getDateInstance();
                        //lPropertyValue = lDateFormat.format(lDate);

                    } catch (Exception lException) {lPropertyValue="";}

//                } else if (lPropertyName.startsWith("pad@")) {

                } else if (lPropertyName.startsWith("servletRequest@")) {

//TODO: this...
//                    lPropertyValue = aSymbolTable.getRequestParameter(lPropertyName.substring(15));
                    lPropertyValue = "";

                } else if (lPropertyName.startsWith("uid@")) {

//                    long lNewTime = System.currentTimeMillis();
//                    while (iLastUniqueId == lNewTime) {
//                        lNewTime = System.currentTimeMillis();
//                    }
//                    iLastUniqueId = lNewTime;
//                    lPropertyValue = Long.toHexString(iLastUniqueId);

                } else if (lPropertyName.startsWith("sqlColumn@")) {

                    try {
                        lPropertyValue = new PropertyValue(iDbConnection.getResultSet().getObject(lPropertyName.substring(10))).toString();
//                        lPropertyValue = getDbConnection(true).getResultSet().getString(lPropertyName.substring(10));
//                        if (lPropertyValue == null) {
//                            lPropertyValue = "";
//                        }
                    } catch (Exception lException) {lPropertyValue="";}

                } else if (lPropertyName.startsWith("sqlColumnAt@")) {
                    try {
                        lPropertyValue = new PropertyValue(iDbConnection.getResultSet().getObject(Long.valueOf(lPropertyName.substring(12)).intValue())).toString();
//                        lPropertyValue = getDbConnection(true).getResultSet().getString(Long.valueOf((lPropertyName.substring(12))).intValue());
//                        if (lPropertyValue == null) {
//                            lPropertyValue = "";
//                        }
                    } catch (Exception lException) {lPropertyValue="";}
                } else if (lPropertyName.startsWith("sqlColumnNameAt@")) {
                    try {
                        lPropertyValue = new PropertyValue(iDbConnection.getResultSetMetaData().getColumnName(Long.valueOf(lPropertyName.substring(16)).intValue())).toString();
//                        lPropertyValue = getDbConnection(true).getResultSetMetaData().getColumnName(Long.valueOf((lPropertyName.substring(16))).intValue());
//                        if (lPropertyValue == null) {
//                            lPropertyValue = "";
//                        }
                    } catch (Exception lException) {lPropertyValue="";}
                } else
                {
                    lPropertyValue = getPropertyCollection().getPropertyValue(lPropertyName, 0).toString();
                }
                if (lResult.indexOf(lEndDelimeter, lEndIdx+1) > -1) {
                    lResult = lResult.substring(0, lStartIdx) + lPropertyValue + lResult.substring(lEndIdx+1);
                    lIdx = lResult.length() + 1;
                } else {
                    lResult = lResult.substring(0, lStartIdx) + lPropertyValue + lResult.substring(lEndIdx+1);
                    lIdx = lStartIdx;
                }
                lStartIdx = -1;
                lEndIdx = -1;
            }

            lIdx--;
            if (lIdx >= lResult.length()) lIdx = lResult.length() - 1;
        }

        return lResult;

//$Section=Operation$ID=3F9EF05301D5$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9EF0530207$Preserve=yes
/**
 *
 * @param aToTranslate
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9EF0530207$Preserve=no
    public String recursivelyTranslateProperties( String aToTranslate ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3F9EF0530207$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.recursivelyTranslateProperties!aToTranslate=" + Log.toString(aToTranslate) + "!");

        String lResult = translateProperties(aToTranslate);
        if (aToTranslate.compareTo(lResult) == 0) return aToTranslate;
        return recursivelyTranslateProperties(lResult);

//$Section=Operation$ID=3F9EF0530207$Preserve=no
    }

//$Section=OperationJavadoc$ID=4295EC67023E$Preserve=yes
/**
 *
 * @param aPropertyRoot
 *
 * @param aPropertySort
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4295EC67023E$Preserve=no
    public void sort( String aPropertyRoot, String aPropertySort ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=4295EC67023E$Preserve=yes
        sort(aPropertyRoot, aPropertySort, true);
//$Section=Operation$ID=4295EC67023E$Preserve=no
    }

//$Section=OperationJavadoc$ID=428413150310$Preserve=yes
/**
 *
 * @param aPropertyRoot
 *
 * @param aPropertySort
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=428413150310$Preserve=no
    public void sort( String aPropertyRoot, String aPropertySort, boolean aAscending ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=428413150310$Preserve=yes

        PropertyValues lPropertyValues = getPropertyCollection().getPropertyValues(aPropertyRoot, false);
        qsort(lPropertyValues, 1, lPropertyValues.size(), aPropertySort, aAscending);

    }

    private void qsort(PropertyValues aPropertyValues, int aLo, int aHi, String aSortField, boolean aAscending) {

        int lLo = aLo;
        int lHi = aHi;

        int lP = (lLo + lHi) / 2;
        PropertyValue lPivot = aPropertyValues.get(lP);
        PropertyValue lPivotSort = aPropertyValues.get(lP).getPropertyCollection().getPropertyValues(aSortField, false).get(0);

        do {
            while (comparePropertyValues(aPropertyValues, lLo, lPivotSort, aSortField, aAscending) < 0) {
                lLo++;
            }

            while (comparePropertyValues(aPropertyValues, lHi, lPivotSort, aSortField, aAscending) > 0) {
                lHi--;
            }

            if (lLo <= lHi) {

                    aPropertyValues.swap(lLo, lHi);
                    lLo++;
                    lHi--;
            }
        } while (lLo <= lHi);

        if (aLo < lHi) qsort(aPropertyValues, aLo, lHi, aSortField, aAscending);
        if (lLo < aHi) qsort(aPropertyValues, lLo, aHi, aSortField, aAscending);

    }

    private int comparePropertyValues(PropertyValues aPropertyValues, PropertyValue aLo, int aHi, String aSortField, boolean aAscending) {
        PropertyValue lLo = aLo;
        PropertyValue lHi = aPropertyValues.get(aHi).getPropertyCollection().getPropertyValues(aSortField, false).get(0);
        int lMult = 1;
        if (!aAscending) lMult = -1;
        return lLo.compareTo(lHi) * lMult;
    }

    private int comparePropertyValues(PropertyValues aPropertyValues, int aLo, PropertyValue aHi, String aSortField, boolean aAscending) {
        PropertyValue lLo = aPropertyValues.get(aLo).getPropertyCollection().getPropertyValues(aSortField, false).get(0);
        PropertyValue lHi = aHi;
        int lMult = 1;
        if (!aAscending) lMult = -1;
        return lLo.compareTo(lHi) * lMult;
    }

    private int comparePropertyValues(PropertyValues aPropertyValues, int aLo, int aHi, String aSortField, boolean aAscending) {
        PropertyValue lLo = aPropertyValues.get(aLo).getPropertyCollection().getPropertyValues(aSortField, false).get(0);
        PropertyValue lHi = aPropertyValues.get(aHi).getPropertyCollection().getPropertyValues(aSortField, false).get(0);
        int lMult = 1;
        if (!aAscending) lMult = -1;
        return lLo.compareTo(lHi) * lMult;

//$Section=Operation$ID=428413150310$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA067B5008D$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA067B5008D$Preserve=no
    public boolean find( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3FA067B5008D$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.find!aPropertyName=" + Log.toString(aPropertyName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        return iPropertyCollection.findPropertyValue(aPropertyName, aPropertyValue);

//$Section=Operation$ID=3FA067B5008D$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA06A1A0021$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA06A1A0021$Preserve=no
    public boolean scan( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3FA06A1A0021$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.scan!aPropertyName=" + Log.toString(aPropertyName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        return scan("", aPropertyName, aPropertyValue);

//$Section=Operation$ID=3FA06A1A0021$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA06AA800D9$Preserve=yes
/**
 *
 * @param aLeft
 *
 * @param aRight
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA06AA800D9$Preserve=no
    private boolean scan( String aLeft, String aRight, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3FA06AA800D9$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.scan!aLeft=" + Log.toString(aLeft) + "!aRight=" + Log.toString(aRight) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        // This method performs a complete symbol table scan for the requested item.

        String lLeft, lRight;

        int lIdx = aRight.indexOf(":");
        if (lIdx > -1) {
            lLeft = "";
            if (aLeft.length() > 0) lLeft = aLeft.concat(":");
            lLeft = lLeft.concat(aRight.substring(0, lIdx));
            lRight = aRight.substring(lIdx+1);
        } else {
            lLeft = aLeft + ":" + aRight;
            lRight = "";
        }

        PropertyValues lPropertyValues = getPropertyCollection().getPropertyValues(lLeft, false);
        int lSize = 0;
        if (lPropertyValues != null) lSize = lPropertyValues.size();

        for (int lItem=1; lItem <= lSize; lItem++) {
            lPropertyValues.resetIterator(lItem);
            if (lRight.length() > 0) {
                if (scan(lLeft, lRight, aPropertyValue) == true) {
//                    if (iLog.test(iLogClass, Log._DEBUG))
//                        iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.scan!return true!");
                    return true;
                }
            } else {
                boolean lReturn = find(lLeft, aPropertyValue);
//                if (iLog.test(iLogClass, Log._DEBUG))
//                    iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.scan!lReturn=" + lReturn + "!");
                return lReturn;
            }
        }

//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.scan!return false!");
        return false;

//$Section=Operation$ID=3FA06AA800D9$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB3D92300FD$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB3D92300FD$Preserve=no
    public XmlSchemaFactory getXmlSchemaFactory( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3FB3D92300FD$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.getXmlSchemaFactory!");

        return iXmlSchemaFactory;

//$Section=Operation$ID=3FB3D92300FD$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FBCC01F036A$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FBCC01F036A$Preserve=no
    public String getScriptsFilePath( String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=3FBCC01F036A$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.getScriptsFilePath!aFileName=" + Log.toString(aFileName) + "!");

        String lScriptPath = getPropertyCollection().getPropertyValue("$jac:path:scripts", 0).toString();

        String lPackageName = "";
        String lPackagePath = "";
        String lFileName = aFileName;

        {
            int lLastDot = -1;
            for (int lIdx = aFileName.length() - 1; lIdx >= 0; lIdx--) {
                if (aFileName.charAt(lIdx) == '.') {
                    lLastDot = lIdx;
                    break;
                }
            }

            if (lLastDot > -1) {
                lPackageName = aFileName.substring(0, lLastDot);
                lPackagePath = lPackageName;
                lFileName = aFileName.substring(lLastDot + 1);
            }

            int lIdx = lPackagePath.indexOf(".");
            while (lIdx > -1) {
                lPackagePath = lPackagePath.substring(0,lIdx) + iFileSeparator + lPackagePath.substring(lIdx+1);
                lIdx = lPackagePath.indexOf(".");
            }
        }

        String lReturn = lScriptPath + iFileSeparator + lPackagePath + iFileSeparator + lFileName;
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.getScriptsFilePath!lReturn=" + Log.toString(lReturn) + "!");
        return lReturn;

//$Section=Operation$ID=3FBCC01F036A$Preserve=no
    }

//$Section=OperationJavadoc$ID=40EAB392036B$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40EAB392036B$Preserve=no
    public String getWorkFilePath( String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=40EAB392036B$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.getWorkFilePath!aFileName=" + Log.toString(aFileName) + "!");

        String lWorkPath = getPropertyCollection().getPropertyValue("$jac:path:work", 0).toString();

        String lPackageName = "";
        String lPackagePath = "";
        String lFileName = aFileName;

        {
            int lLastDot = -1;
            for (int lIdx = aFileName.length() - 1; lIdx >= 0; lIdx--) {
                if (aFileName.charAt(lIdx) == '.') {
                    lLastDot = lIdx;
                    break;
                }
            }

            if (lLastDot > -1) {
                lPackageName = aFileName.substring(0, lLastDot);
                lPackagePath = lPackageName;
                lFileName = aFileName.substring(lLastDot + 1);
            }

            int lIdx = lPackagePath.indexOf(".");
            while (lIdx > -1) {
                lPackagePath = lPackagePath.substring(0,lIdx) + iFileSeparator + lPackagePath.substring(lIdx+1);
                lIdx = lPackagePath.indexOf(".");
            }
        }

        String lReturn = lWorkPath + iFileSeparator + lPackagePath + iFileSeparator + lFileName;
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.getWorkFilePath!lReturn=" + Log.toString(lReturn) + "!");
        return lReturn;

//$Section=Operation$ID=40EAB392036B$Preserve=no
    }

//$Section=OperationJavadoc$ID=42C556A400DE$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42C556A400DE$Preserve=no
    public String getHomeFilePath( String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=42C556A400DE$Preserve=yes

        String lHomePath = getPropertyCollection().getPropertyValue("$jac:path:home", 0).toString();

        String lPackageName = "";
        String lPackagePath = "";
        String lFileName = aFileName;

        {
            int lLastDot = -1;
            for (int lIdx = aFileName.length() - 1; lIdx >= 0; lIdx--) {
                if (aFileName.charAt(lIdx) == '.') {
                    lLastDot = lIdx;
                    break;
                }
            }

            if (lLastDot > -1) {
                lPackageName = aFileName.substring(0, lLastDot);
                lPackagePath = lPackageName;
                lFileName = aFileName.substring(lLastDot + 1);
            }

            int lIdx = lPackagePath.indexOf(".");
            while (lIdx > -1) {
                lPackagePath = lPackagePath.substring(0,lIdx) + iFileSeparator + lPackagePath.substring(lIdx+1);
                lIdx = lPackagePath.indexOf(".");
            }
        }

        String lReturn = lHomePath + iFileSeparator + lPackagePath + iFileSeparator + lFileName;
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.getWorkFilePath!lReturn=" + Log.toString(lReturn) + "!");
        return lReturn;

//$Section=Operation$ID=42C556A400DE$Preserve=no
    }

//$Section=OperationJavadoc$ID=49C6202B0222$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=49C6202B0222$Preserve=no
    public String getDocumentPath( String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=49C6202B0222$Preserve=yes

        String lDocumentPath = getPropertyCollection().getPropertyValue("$jac:path:document", 0).toString();

        String lPackageName = "";
        String lPackagePath = "";
        String lFileName = aFileName;

        {
            int lLastDot = -1;
            for (int lIdx = aFileName.length() - 1; lIdx >= 0; lIdx--) {
                if (aFileName.charAt(lIdx) == '.') {
                    lLastDot = lIdx;
                    break;
                }
            }

            if (lLastDot > -1) {
                lPackageName = aFileName.substring(0, lLastDot);
                lPackagePath = lPackageName;
                lFileName = aFileName.substring(lLastDot + 1);
            }

            int lIdx = lPackagePath.indexOf(".");
            while (lIdx > -1) {
                lPackagePath = lPackagePath.substring(0,lIdx) + iFileSeparator + lPackagePath.substring(lIdx+1);
                lIdx = lPackagePath.indexOf(".");
            }
        }

        String lReturn = lDocumentPath + iFileSeparator + lPackagePath + iFileSeparator + lFileName;
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit SymbolTable.getWorkFilePath!lReturn=" + Log.toString(lReturn) + "!");
        return lReturn;

//$Section=Operation$ID=49C6202B0222$Preserve=no
    }

//$Section=OperationJavadoc$ID=42D6EDF60177$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42D6EDF60177$Preserve=no
    public String getLocation( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=42D6EDF60177$Preserve=yes

        String lLocation = "";
        String lPropertyName = aPropertyName + ":";
        int lPos = -1;
        while ((lPos = lPropertyName.indexOf(":", lPos+1)) > -1) {
            PropertyValues lPropertyValues = getPropertyCollection().getPropertyValues(lPropertyName.substring(0, lPos), false);
            if (lLocation.length() > 0) lLocation += ":";
            if (lPropertyValues == null) {
                lLocation += "0";
            } else {
                lLocation += Integer.toString(lPropertyValues.getIterator());
            }
        }
        return lLocation;

//$Section=Operation$ID=42D6EDF60177$Preserve=no
    }

//$Section=OperationJavadoc$ID=42D6EDF60178$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aLocation
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42D6EDF60178$Preserve=no
    public boolean setLocation( String aPropertyName, String aLocation ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter SymbolTable.");
//$Section=Operation$ID=42D6EDF60178$Preserve=yes

        String lPropertyName = aPropertyName + ":";
        String lLocation = aLocation + ":";
        int lPropertyPos = -1;
        int lLocationPos = -1;
        int lLastLocationPos = lLocationPos;
        while ((lPropertyPos = lPropertyName.indexOf(":", lPropertyPos+1)) > -1) {
            if ((lLocationPos = lLocation.indexOf(":", lLocationPos+1)) == -1) return false;
            PropertyValues lPropertyValues = getPropertyCollection().getPropertyValues(lPropertyName.substring(0, lPropertyPos), false);
            if (lPropertyValues == null) return false;
            lPropertyValues.resetIterator(Integer.parseInt(lLocation.substring(lLastLocationPos+1, lLocationPos)));
            lLastLocationPos = lLocationPos;
            if (lLastLocationPos+1 >= lLocation.length()) return true;
        }
        return true;

//$Section=Operation$ID=42D6EDF60178$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// ServletRequest
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C952302AC$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C952302AC$Preserve=no
    public ServletRequest getServletRequest() {
//$Section=Attribute get$ID=3F9C952302AC$Preserve=no
        return iServletRequest;
//$Section=Attribute get$ID=3F9C952302AC$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C952302AC$Preserve=no
/**
 * Set accessor method.
 *
 * @param ServletRequest the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C952302AC$Preserve=no
    public void setServletRequest(ServletRequest aValue) {
//$Section=Attribute set$ID=3F9C952302AC$Preserve=no
        iServletRequest = aValue;
//$Section=Attribute set$ID=3F9C952302AC$Preserve=no
    }
//----------------------------------------------------------------------------
// DbConnection
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FAD590003D3$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FAD590003D3$Preserve=no
    public DbConnection getDbConnection() {
//$Section=Attribute get$ID=3FAD590003D3$Preserve=no
        return iDbConnection;
//$Section=Attribute get$ID=3FAD590003D3$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FAD590003D3$Preserve=no
/**
 * Set accessor method.
 *
 * @param DbConnection the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FAD590003D3$Preserve=no
    public void setDbConnection(DbConnection aValue) {
//$Section=Attribute set$ID=3FAD590003D3$Preserve=no
        iDbConnection = aValue;
//$Section=Attribute set$ID=3FAD590003D3$Preserve=no
    }
//----------------------------------------------------------------------------
// FileSeparator
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FBCC1E20264$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FBCC1E20264$Preserve=no
    public String getFileSeparator() {
//$Section=Attribute get$ID=3FBCC1E20264$Preserve=no
        return iFileSeparator;
//$Section=Attribute get$ID=3FBCC1E20264$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FBCC1E20264$Preserve=no
/**
 * Set accessor method.
 *
 * @param FileSeparator the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FBCC1E20264$Preserve=no
    public void setFileSeparator(String aValue) {
//$Section=Attribute set$ID=3FBCC1E20264$Preserve=no
        iFileSeparator = aValue;
//$Section=Attribute set$ID=3FBCC1E20264$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9C589503D8$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C589503D8$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C589503D8$Preserve=no

//End of class---------------
}
