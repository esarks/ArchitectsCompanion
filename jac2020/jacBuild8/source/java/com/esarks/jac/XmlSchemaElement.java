//$Section=License$ID=3FB39E09013E$Preserve=no

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

//  Generated at 2005.07.19 01:19:03.984 PM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: XmlSchemaElement.java

//$Section=ChangeLog$ID=3FB39E09013E$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3FB39E09013E$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;

//$Section=CustomDeclare$ID=3FB39E09013E$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3FB39E09013E$Preserve=no

//$Section=ClassJavadoc$ID=3FB39E09013E$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3FB39E09013E$Preserve=no
public class XmlSchemaElement {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
    private String iName;
    private String iType;
    private int iSize;
    private boolean iTruncateEol = false;
    private boolean iPreserveEmpty = true;
    private boolean iPreserveNewLine = true;
    private String iReplaceNewLine = null;
    private boolean iIsEmpty = false;
    private boolean iPad = false;
    private boolean iTrim = false;
    private boolean iCdata = false;
    private boolean iRecursive = false;
    private boolean iAttribute = false;
    private ScriptHelper iRuleScript;
    private String iRuleName;
    private String iDbTable;
    private String iDbName;
    private String iDbType;
    private boolean iDbNullable = true;
    private boolean iDbPrimaryKey = false;
    private String iExtendsKey = null;
    private XmlSchemaElement iXmlSchemaElement;
    private Map iElements = new TreeMap();
    private ArrayList iElementsList = new ArrayList(1);
    private String iDispatcher;
    private String iPrompt;
    private String iRows;
    private String iCols;

//$Section=CustomClassDeclare$ID=3FB39E09013E$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3FB39E09013E$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3FB39E09013E$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3FB39E09013E$Preserve=no
    public XmlSchemaElement() {
//$Section=DefaultConstructor$ID=3FB39E09013E$Preserve=yes
//$Section=DefaultConstructor$ID=3FB39E09013E$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3FB39E09013E$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3FB39E09013E$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3FB39E09013E$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3FB39E09013E$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3FB39E09013E$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3FB39E09013E$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3FB39E09013E$Preserve=yes

        iXmlSchemaElement = null;
        iElements = null;
        iElementsList = null;

//$Section=DefaultFreeResources$ID=3FB39E09013E$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3FB65338019D$Preserve=yes
/**
 *
 * @param aAs
 *
 * @param aXmlSchemaElement
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB65338019D$Preserve=no
    public void addXmlSchemaElement( String aAs, XmlSchemaElement aXmlSchemaElement ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaElement.");
//$Section=Operation$ID=3FB65338019D$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaElement.addXmlSchemaElement!iName=" + Log.toString(iName) + "!iType=" + Log.toString(iType) + "!aAs=" + Log.toString(aAs) + "!aXmlSchemaElement=" + Log.toString(aXmlSchemaElement) + "!");

        iElements.put(aAs, aXmlSchemaElement);
        iElementsList.add(aXmlSchemaElement);

//$Section=Operation$ID=3FB65338019D$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB4E71301B8$Preserve=yes
/**
 *
 * @param aXmlSchemaElement
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB4E71301B8$Preserve=no
    public void addXmlSchemaElement( XmlSchemaElement aXmlSchemaElement ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaElement.");
//$Section=Operation$ID=3FB4E71301B8$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaElement.addXmlSchemaElement!delgates to other method...!");

        addXmlSchemaElement(aXmlSchemaElement.getName(), aXmlSchemaElement);

//$Section=Operation$ID=3FB4E71301B8$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB3DF9901E2$Preserve=yes
/**
 *
 * @param aName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB3DF9901E2$Preserve=no
    public XmlSchemaElement getXmlSchemaElement( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaElement.");
//$Section=Operation$ID=3FB3DF9901E2$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaElement.getXmlSchemaElement!iName=" + Log.toString(iName) + "!iType=" + Log.toString(iType) + "!aName=" + Log.toString(aName) + "!");

        if (iXmlSchemaElement != null) {
            return iXmlSchemaElement.getXmlSchemaElement(aName);
        }

        if (iName.compareTo(aName) == 0 && iRecursive == true) {
            return this;
        }

        int lIdx = aName.indexOf(":");
        String lLeft = aName;
        String lRight = null;
        if (lIdx > -1) {
            lLeft = aName.substring(0,lIdx);
            lRight = aName.substring(lIdx+1);
        }

        if (iElements.containsKey(lLeft)) {
            XmlSchemaElement lXmlSchemaElement = (XmlSchemaElement) iElements.get(lLeft);
            if (lRight == null) {
                return lXmlSchemaElement;
            } else {
                return lXmlSchemaElement.getXmlSchemaElement(lRight);
            }
        } else {
            return null;
        }

//$Section=Operation$ID=3FB3DF9901E2$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB4F4CF005F$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB4F4CF005F$Preserve=no
    public PropertyValue checkPropertyType( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaElement.");
//$Section=Operation$ID=3FB4F4CF005F$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaElement.checkPropertyType!iName=" + Log.toString(iName) + "!iType=" + Log.toString(iType) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        PropertyValue lReturn = aPropertyValue;
        if (lReturn.getType().compareTo("string") == 0) {
            String lValueString = aPropertyValue.getValueString();
            if (iTruncateEol == true) {
                int lIdx = lValueString.indexOf("\n");
                if (lIdx > -1) {
                    lValueString = lValueString.substring(0, lIdx);
//                    if (iLog.test(iLogClass, Log._DEBUG))
//                        iLog.println(iLogClass, Log._DEBUG, "Info XmlSchemaElement.checkPropertyType!truncating string=" + Log.toString(lReturn) + "!");
                }
                if (iTrim == true) lValueString.trim();
            } else {
                if (iPreserveNewLine == false) {
                    int lFromIdx = 0;
                    int lIdx = lValueString.indexOf("\n", lFromIdx);
                    String lProperty = "";
                    while (lIdx != -1) {
                        if (iTrim == true) {
                            lProperty = lProperty.concat(lValueString.substring(lFromIdx, lIdx).trim());
                        } else {
                            lProperty = lProperty.concat(lValueString.substring(lFromIdx, lIdx));
                        }
                        if (iReplaceNewLine != null) lProperty = lProperty + iReplaceNewLine;
                        lFromIdx = lIdx + 1;
                        lIdx = lValueString.indexOf("\n", lFromIdx);
                    }
                    if (iTrim == true) {
                        lProperty = lProperty.concat(lValueString.substring(lFromIdx).trim());
                    } else {
                        lProperty = lProperty.concat(lValueString.substring(lFromIdx));
                    }
                    lValueString = lProperty;
                }
                if (iTrim == true) lValueString.trim();
            }
            if (iSize > 0 && lValueString.length() > iSize) lValueString = lValueString.substring(0, iSize);
            if (iPad) {
              while (lValueString.length() < iSize) lValueString = lValueString.concat(" ");
            }
            if (lValueString.compareTo(lReturn.getValueString()) != 0) {
                lReturn = new PropertyValue(lValueString);
            }
        }
        else if (iType != null && lReturn.getType().compareTo(iType) == 0) {
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit XmlSchemaElement.checkPropertyType!no conversion necessary!");
        } else {
            lReturn = new PropertyValue(iType, lReturn.toString());
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit XmlSchemaElement.checkPropertyType!lReturn=" + Log.toString(lReturn) + "!");
        }

        if (iRuleScript != null) {
            lReturn = iRuleScript.validateRule(iRuleName, lReturn, iName);
        }

        return lReturn;

//$Section=Operation$ID=3FB4F4CF005F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB837FD0347$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB837FD0347$Preserve=no
    public String log( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaElement.");
//$Section=Operation$ID=3FB837FD0347$Preserve=yes

        return "XmlSchemaElement.log!iName=" + Log.toString(iName) + "!iType=" + Log.toString(iType) +  "!iTruncateEol=" + iTruncateEol + "!iExtendsKey=" + Log.toString(iExtendsKey) + "!iXmlSchemaElement=" + Log.toString(iXmlSchemaElement) + "!";

//$Section=Operation$ID=3FB837FD0347$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FB39EA9026A$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FB39EA9026A$Preserve=no
    public String getName() {
//$Section=Attribute get$ID=3FB39EA9026A$Preserve=no
        return iName;
//$Section=Attribute get$ID=3FB39EA9026A$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FB39EA9026A$Preserve=no
/**
 * Set accessor method.
 *
 * @param Name the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FB39EA9026A$Preserve=no
    public void setName(String aValue) {
//$Section=Attribute set$ID=3FB39EA9026A$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=3FB39EA9026A$Preserve=no
    }
//----------------------------------------------------------------------------
// Type
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FB39ED302A7$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FB39ED302A7$Preserve=no
    public String getType() {
//$Section=Attribute get$ID=3FB39ED302A7$Preserve=no
        return iType;
//$Section=Attribute get$ID=3FB39ED302A7$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FB39ED302A7$Preserve=no
/**
 * Set accessor method.
 *
 * @param Type the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FB39ED302A7$Preserve=no
    public void setType(String aValue) {
//$Section=Attribute set$ID=3FB39ED302A7$Preserve=no
        iType = aValue;
//$Section=Attribute set$ID=3FB39ED302A7$Preserve=no
    }
//----------------------------------------------------------------------------
// Size
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40FE9E03001F$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40FE9E03001F$Preserve=no
    public int getSize() {
//$Section=Attribute get$ID=40FE9E03001F$Preserve=no
        return iSize;
//$Section=Attribute get$ID=40FE9E03001F$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40FE9E03001F$Preserve=no
/**
 * Set accessor method.
 *
 * @param Size the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40FE9E03001F$Preserve=no
    public void setSize(int aValue) {
//$Section=Attribute set$ID=40FE9E03001F$Preserve=no
        iSize = aValue;
//$Section=Attribute set$ID=40FE9E03001F$Preserve=no
    }
//----------------------------------------------------------------------------
// TruncateEol
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FC041300125$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FC041300125$Preserve=no
    public boolean getTruncateEol() {
//$Section=Attribute get$ID=3FC041300125$Preserve=no
        return iTruncateEol;
//$Section=Attribute get$ID=3FC041300125$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FC041300125$Preserve=no
/**
 * Set accessor method.
 *
 * @param TruncateEol the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FC041300125$Preserve=no
    public void setTruncateEol(boolean aValue) {
//$Section=Attribute set$ID=3FC041300125$Preserve=no
        iTruncateEol = aValue;
//$Section=Attribute set$ID=3FC041300125$Preserve=no
    }
//----------------------------------------------------------------------------
// PreserveEmpty
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4294C3A5009C$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4294C3A5009C$Preserve=no
    public boolean getPreserveEmpty() {
//$Section=Attribute get$ID=4294C3A5009C$Preserve=no
        return iPreserveEmpty;
//$Section=Attribute get$ID=4294C3A5009C$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4294C3A5009C$Preserve=no
/**
 * Set accessor method.
 *
 * @param PreserveEmpty the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4294C3A5009C$Preserve=no
    public void setPreserveEmpty(boolean aValue) {
//$Section=Attribute set$ID=4294C3A5009C$Preserve=no
        iPreserveEmpty = aValue;
//$Section=Attribute set$ID=4294C3A5009C$Preserve=no
    }
//----------------------------------------------------------------------------
// PreserveNewLine
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FE8433D0374$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FE8433D0374$Preserve=no
    public boolean getPreserveNewLine() {
//$Section=Attribute get$ID=3FE8433D0374$Preserve=no
        return iPreserveNewLine;
//$Section=Attribute get$ID=3FE8433D0374$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FE8433D0374$Preserve=no
/**
 * Set accessor method.
 *
 * @param PreserveNewLine the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FE8433D0374$Preserve=no
    public void setPreserveNewLine(boolean aValue) {
//$Section=Attribute set$ID=3FE8433D0374$Preserve=no
        iPreserveNewLine = aValue;
//$Section=Attribute set$ID=3FE8433D0374$Preserve=no
    }
//----------------------------------------------------------------------------
// ReplaceNewLine
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FE8A5D20125$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FE8A5D20125$Preserve=no
    public String getReplaceNewLine() {
//$Section=Attribute get$ID=3FE8A5D20125$Preserve=no
        return iReplaceNewLine;
//$Section=Attribute get$ID=3FE8A5D20125$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FE8A5D20125$Preserve=no
/**
 * Set accessor method.
 *
 * @param ReplaceNewLine the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FE8A5D20125$Preserve=no
    public void setReplaceNewLine(String aValue) {
//$Section=Attribute set$ID=3FE8A5D20125$Preserve=yes
        iReplaceNewLine = aValue;
        setPreserveNewLine(false);
//$Section=Attribute set$ID=3FE8A5D20125$Preserve=no
    }
//----------------------------------------------------------------------------
// IsEmpty
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=42985F340109$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=42985F340109$Preserve=no
    public boolean getIsEmpty() {
//$Section=Attribute get$ID=42985F340109$Preserve=no
        return iIsEmpty;
//$Section=Attribute get$ID=42985F340109$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=42985F340109$Preserve=no
/**
 * Set accessor method.
 *
 * @param IsEmpty the value to be set.
 */
//$Section=Attribute setJavadoc$ID=42985F340109$Preserve=no
    public void setIsEmpty(boolean aValue) {
//$Section=Attribute set$ID=42985F340109$Preserve=no
        iIsEmpty = aValue;
//$Section=Attribute set$ID=42985F340109$Preserve=no
    }
//----------------------------------------------------------------------------
// Pad
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40FEB309029F$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40FEB309029F$Preserve=no
    public boolean getPad() {
//$Section=Attribute get$ID=40FEB309029F$Preserve=no
        return iPad;
//$Section=Attribute get$ID=40FEB309029F$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40FEB309029F$Preserve=no
/**
 * Set accessor method.
 *
 * @param Pad the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40FEB309029F$Preserve=no
    public void setPad(boolean aValue) {
//$Section=Attribute set$ID=40FEB309029F$Preserve=no
        iPad = aValue;
//$Section=Attribute set$ID=40FEB309029F$Preserve=no
    }
//----------------------------------------------------------------------------
// Trim
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FE98DED02D6$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FE98DED02D6$Preserve=no
    public boolean getTrim() {
//$Section=Attribute get$ID=3FE98DED02D6$Preserve=no
        return iTrim;
//$Section=Attribute get$ID=3FE98DED02D6$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FE98DED02D6$Preserve=no
/**
 * Set accessor method.
 *
 * @param Trim the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FE98DED02D6$Preserve=no
    public void setTrim(boolean aValue) {
//$Section=Attribute set$ID=3FE98DED02D6$Preserve=no
        iTrim = aValue;
//$Section=Attribute set$ID=3FE98DED02D6$Preserve=no
    }
//----------------------------------------------------------------------------
// Cdata
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=411049AD0203$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=411049AD0203$Preserve=no
    public boolean getCdata() {
//$Section=Attribute get$ID=411049AD0203$Preserve=no
        return iCdata;
//$Section=Attribute get$ID=411049AD0203$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=411049AD0203$Preserve=no
/**
 * Set accessor method.
 *
 * @param Cdata the value to be set.
 */
//$Section=Attribute setJavadoc$ID=411049AD0203$Preserve=no
    public void setCdata(boolean aValue) {
//$Section=Attribute set$ID=411049AD0203$Preserve=no
        iCdata = aValue;
//$Section=Attribute set$ID=411049AD0203$Preserve=no
    }
//----------------------------------------------------------------------------
// Recursive
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=41595DAE00BC$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=41595DAE00BC$Preserve=no
    public boolean getRecursive() {
//$Section=Attribute get$ID=41595DAE00BC$Preserve=no
        return iRecursive;
//$Section=Attribute get$ID=41595DAE00BC$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=41595DAE00BC$Preserve=no
/**
 * Set accessor method.
 *
 * @param Recursive the value to be set.
 */
//$Section=Attribute setJavadoc$ID=41595DAE00BC$Preserve=no
    public void setRecursive(boolean aValue) {
//$Section=Attribute set$ID=41595DAE00BC$Preserve=no
        iRecursive = aValue;
//$Section=Attribute set$ID=41595DAE00BC$Preserve=no
    }
//----------------------------------------------------------------------------
// Attribute
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=415991D702FD$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=415991D702FD$Preserve=no
    public boolean getAttribute() {
//$Section=Attribute get$ID=415991D702FD$Preserve=no
        return iAttribute;
//$Section=Attribute get$ID=415991D702FD$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=415991D702FD$Preserve=no
/**
 * Set accessor method.
 *
 * @param Attribute the value to be set.
 */
//$Section=Attribute setJavadoc$ID=415991D702FD$Preserve=no
    public void setAttribute(boolean aValue) {
//$Section=Attribute set$ID=415991D702FD$Preserve=no
        iAttribute = aValue;
//$Section=Attribute set$ID=415991D702FD$Preserve=no
    }
//----------------------------------------------------------------------------
// RuleScript
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FCFA7E101A5$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FCFA7E101A5$Preserve=no
    public ScriptHelper getRuleScript() {
//$Section=Attribute get$ID=3FCFA7E101A5$Preserve=no
        return iRuleScript;
//$Section=Attribute get$ID=3FCFA7E101A5$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FCFA7E101A5$Preserve=no
/**
 * Set accessor method.
 *
 * @param RuleScript the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FCFA7E101A5$Preserve=no
    public void setRuleScript(ScriptHelper aValue) {
//$Section=Attribute set$ID=3FCFA7E101A5$Preserve=no
        iRuleScript = aValue;
//$Section=Attribute set$ID=3FCFA7E101A5$Preserve=no
    }
//----------------------------------------------------------------------------
// RuleName
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40FEA92E002E$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40FEA92E002E$Preserve=no
    public String getRuleName() {
//$Section=Attribute get$ID=40FEA92E002E$Preserve=no
        return iRuleName;
//$Section=Attribute get$ID=40FEA92E002E$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40FEA92E002E$Preserve=no
/**
 * Set accessor method.
 *
 * @param RuleName the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40FEA92E002E$Preserve=no
    public void setRuleName(String aValue) {
//$Section=Attribute set$ID=40FEA92E002E$Preserve=no
        iRuleName = aValue;
//$Section=Attribute set$ID=40FEA92E002E$Preserve=no
    }
//----------------------------------------------------------------------------
// DbTable
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40F059C60177$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40F059C60177$Preserve=no
    public String getDbTable() {
//$Section=Attribute get$ID=40F059C60177$Preserve=yes
        if (iDbTable == null) return getName();
        return iDbTable;
//$Section=Attribute get$ID=40F059C60177$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40F059C60177$Preserve=no
/**
 * Set accessor method.
 *
 * @param DbTable the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40F059C60177$Preserve=no
    public void setDbTable(String aValue) {
//$Section=Attribute set$ID=40F059C60177$Preserve=no
        iDbTable = aValue;
//$Section=Attribute set$ID=40F059C60177$Preserve=no
    }
//----------------------------------------------------------------------------
// DbName
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FC4CE8802B6$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FC4CE8802B6$Preserve=no
    public String getDbName() {
//$Section=Attribute get$ID=3FC4CE8802B6$Preserve=yes
        if (iDbName == null) return getName();
        return iDbName;
//$Section=Attribute get$ID=3FC4CE8802B6$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FC4CE8802B6$Preserve=no
/**
 * Set accessor method.
 *
 * @param DbName the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FC4CE8802B6$Preserve=no
    public void setDbName(String aValue) {
//$Section=Attribute set$ID=3FC4CE8802B6$Preserve=no
        iDbName = aValue;
//$Section=Attribute set$ID=3FC4CE8802B6$Preserve=no
    }
//----------------------------------------------------------------------------
// DbType
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FC4CE900299$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FC4CE900299$Preserve=no
    public String getDbType() {
//$Section=Attribute get$ID=3FC4CE900299$Preserve=yes
        if (iDbType == null) return getType();
        return iDbType;
//$Section=Attribute get$ID=3FC4CE900299$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FC4CE900299$Preserve=no
/**
 * Set accessor method.
 *
 * @param DbType the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FC4CE900299$Preserve=no
    public void setDbType(String aValue) {
//$Section=Attribute set$ID=3FC4CE900299$Preserve=no
        iDbType = aValue;
//$Section=Attribute set$ID=3FC4CE900299$Preserve=no
    }
//----------------------------------------------------------------------------
// DbNullable
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FC4CE990116$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FC4CE990116$Preserve=no
    public boolean getDbNullable() {
//$Section=Attribute get$ID=3FC4CE990116$Preserve=no
        return iDbNullable;
//$Section=Attribute get$ID=3FC4CE990116$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FC4CE990116$Preserve=no
/**
 * Set accessor method.
 *
 * @param DbNullable the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FC4CE990116$Preserve=no
    public void setDbNullable(boolean aValue) {
//$Section=Attribute set$ID=3FC4CE990116$Preserve=no
        iDbNullable = aValue;
//$Section=Attribute set$ID=3FC4CE990116$Preserve=no
    }
//----------------------------------------------------------------------------
// DbPrimaryKey
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4112615103C8$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4112615103C8$Preserve=no
    public boolean getDbPrimaryKey() {
//$Section=Attribute get$ID=4112615103C8$Preserve=no
        return iDbPrimaryKey;
//$Section=Attribute get$ID=4112615103C8$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4112615103C8$Preserve=no
/**
 * Set accessor method.
 *
 * @param DbPrimaryKey the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4112615103C8$Preserve=no
    public void setDbPrimaryKey(boolean aValue) {
//$Section=Attribute set$ID=4112615103C8$Preserve=no
        iDbPrimaryKey = aValue;
//$Section=Attribute set$ID=4112615103C8$Preserve=no
    }
//----------------------------------------------------------------------------
// ExtendsKey
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FC046650078$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FC046650078$Preserve=no
    public String getExtendsKey() {
//$Section=Attribute get$ID=3FC046650078$Preserve=no
        return iExtendsKey;
//$Section=Attribute get$ID=3FC046650078$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FC046650078$Preserve=no
/**
 * Set accessor method.
 *
 * @param ExtendsKey the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FC046650078$Preserve=no
    public void setExtendsKey(String aValue) {
//$Section=Attribute set$ID=3FC046650078$Preserve=no
        iExtendsKey = aValue;
//$Section=Attribute set$ID=3FC046650078$Preserve=no
    }
//----------------------------------------------------------------------------
// XmlSchemaElement
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FB39EED0087$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FB39EED0087$Preserve=no
    public XmlSchemaElement getXmlSchemaElement() {
//$Section=Attribute get$ID=3FB39EED0087$Preserve=no
        return iXmlSchemaElement;
//$Section=Attribute get$ID=3FB39EED0087$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FB39EED0087$Preserve=no
/**
 * Set accessor method.
 *
 * @param XmlSchemaElement the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FB39EED0087$Preserve=no
    public void setXmlSchemaElement(XmlSchemaElement aValue) {
//$Section=Attribute set$ID=3FB39EED0087$Preserve=no
        iXmlSchemaElement = aValue;
//$Section=Attribute set$ID=3FB39EED0087$Preserve=no
    }
//----------------------------------------------------------------------------
// Elements
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FB3DFA602C7$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FB3DFA602C7$Preserve=no
    public Map getElements() {
//$Section=Attribute get$ID=3FB3DFA602C7$Preserve=no
        return iElements;
//$Section=Attribute get$ID=3FB3DFA602C7$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FB3DFA602C7$Preserve=no
/**
 * Set accessor method.
 *
 * @param Elements the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FB3DFA602C7$Preserve=no
    public void setElements(Map aValue) {
//$Section=Attribute set$ID=3FB3DFA602C7$Preserve=no
        iElements = aValue;
//$Section=Attribute set$ID=3FB3DFA602C7$Preserve=no
    }
//----------------------------------------------------------------------------
// ElementsList
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FB3DFA602C8$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FB3DFA602C8$Preserve=no
    public ArrayList getElementsList() {
//$Section=Attribute get$ID=3FB3DFA602C8$Preserve=no
        return iElementsList;
//$Section=Attribute get$ID=3FB3DFA602C8$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FB3DFA602C8$Preserve=no
/**
 * Set accessor method.
 *
 * @param ElementsList the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FB3DFA602C8$Preserve=no
    public void setElementsList(ArrayList aValue) {
//$Section=Attribute set$ID=3FB3DFA602C8$Preserve=no
        iElementsList = aValue;
//$Section=Attribute set$ID=3FB3DFA602C8$Preserve=no
    }
//----------------------------------------------------------------------------
// Dispatcher
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=42DCF844031C$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=42DCF844031C$Preserve=no
    public String getDispatcher() {
//$Section=Attribute get$ID=42DCF844031C$Preserve=no
        return iDispatcher;
//$Section=Attribute get$ID=42DCF844031C$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=42DCF844031C$Preserve=no
/**
 * Set accessor method.
 *
 * @param Dispatcher the value to be set.
 */
//$Section=Attribute setJavadoc$ID=42DCF844031C$Preserve=no
    public void setDispatcher(String aValue) {
//$Section=Attribute set$ID=42DCF844031C$Preserve=no
        iDispatcher = aValue;
//$Section=Attribute set$ID=42DCF844031C$Preserve=no
    }
//----------------------------------------------------------------------------
// Prompt
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=42DD356D02DE$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=42DD356D02DE$Preserve=no
    public String getPrompt() {
//$Section=Attribute get$ID=42DD356D02DE$Preserve=no
        return iPrompt;
//$Section=Attribute get$ID=42DD356D02DE$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=42DD356D02DE$Preserve=no
/**
 * Set accessor method.
 *
 * @param Prompt the value to be set.
 */
//$Section=Attribute setJavadoc$ID=42DD356D02DE$Preserve=no
    public void setPrompt(String aValue) {
//$Section=Attribute set$ID=42DD356D02DE$Preserve=no
        iPrompt = aValue;
//$Section=Attribute set$ID=42DD356D02DE$Preserve=no
    }
//----------------------------------------------------------------------------
// Rows
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=42DD356E00EA$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=42DD356E00EA$Preserve=no
    public String getRows() {
//$Section=Attribute get$ID=42DD356E00EA$Preserve=no
        return iRows;
//$Section=Attribute get$ID=42DD356E00EA$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=42DD356E00EA$Preserve=no
/**
 * Set accessor method.
 *
 * @param Rows the value to be set.
 */
//$Section=Attribute setJavadoc$ID=42DD356E00EA$Preserve=no
    public void setRows(String aValue) {
//$Section=Attribute set$ID=42DD356E00EA$Preserve=no
        iRows = aValue;
//$Section=Attribute set$ID=42DD356E00EA$Preserve=no
    }
//----------------------------------------------------------------------------
// Cols
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=42DD356E0261$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=42DD356E0261$Preserve=no
    public String getCols() {
//$Section=Attribute get$ID=42DD356E0261$Preserve=no
        return iCols;
//$Section=Attribute get$ID=42DD356E0261$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=42DD356E0261$Preserve=no
/**
 * Set accessor method.
 *
 * @param Cols the value to be set.
 */
//$Section=Attribute setJavadoc$ID=42DD356E0261$Preserve=no
    public void setCols(String aValue) {
//$Section=Attribute set$ID=42DD356E0261$Preserve=no
        iCols = aValue;
//$Section=Attribute set$ID=42DD356E0261$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3FB39E09013E$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FB39E09013E$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FB39E09013E$Preserve=no

//End of class---------------
}
