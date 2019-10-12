//$Section=License$ID=3F9C9AF00366$Preserve=no

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
//  Module Name: ParseXmlElement.java

//$Section=ChangeLog$ID=3F9C9AF00366$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9C9AF00366$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;

//$Section=CustomDeclare$ID=3F9C9AF00366$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3F9C9AF00366$Preserve=no

//$Section=ClassJavadoc$ID=3F9C9AF00366$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3F9C9AF00366$Preserve=no
public class ParseXmlElement {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
    private String iName = new String();
    private StringBuffer iValue = new StringBuffer();
    private ArrayList iAttributes = new ArrayList();

//$Section=CustomClassDeclare$ID=3F9C9AF00366$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9C9AF00366$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9C9AF00366$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9C9AF00366$Preserve=no
    public ParseXmlElement() {
//$Section=DefaultConstructor$ID=3F9C9AF00366$Preserve=yes
//$Section=DefaultConstructor$ID=3F9C9AF00366$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9C9AF00366$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9C9AF00366$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9C9AF00366$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3F9C9AF00366$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9C9AF00366$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9C9AF00366$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9C9AF00366$Preserve=yes

        if (iAttributes != null) {
            iAttributes.clear();
            iAttributes = null;
        }

//$Section=DefaultFreeResources$ID=3F9C9AF00366$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3F9C9B2B004A$Preserve=yes
/**
 *
 * @param aName
 *
 */
//$Section=OperationJavadoc$ID=3F9C9B2B004A$Preserve=no
    public ParseXmlElement( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlElement.");
//$Section=Operation$ID=3F9C9B2B004A$Preserve=yes

        iName = aName;

//$Section=Operation$ID=3F9C9B2B004A$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C9B2B004C$Preserve=yes
/**
 *
 * @param aName
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C9B2B004C$Preserve=no
    public ParseXmlElement( String aName, String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ParseXmlElement.");
//$Section=Operation$ID=3F9C9B2B004C$Preserve=yes

        iName = aName;
        iValue.append(aValue);

//$Section=Operation$ID=3F9C9B2B004C$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C9B340309$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C9B340309$Preserve=no
    public String getName() {
//$Section=Attribute get$ID=3F9C9B340309$Preserve=no
        return iName;
//$Section=Attribute get$ID=3F9C9B340309$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C9B340309$Preserve=no
/**
 * Set accessor method.
 *
 * @param Name the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C9B340309$Preserve=no
    public void setName(String aValue) {
//$Section=Attribute set$ID=3F9C9B340309$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=3F9C9B340309$Preserve=no
    }
//----------------------------------------------------------------------------
// Value
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C9B340313$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C9B340313$Preserve=no
    public StringBuffer getValue() {
//$Section=Attribute get$ID=3F9C9B340313$Preserve=no
        return iValue;
//$Section=Attribute get$ID=3F9C9B340313$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C9B340313$Preserve=no
/**
 * Set accessor method.
 *
 * @param Value the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C9B340313$Preserve=no
    public void setValue(StringBuffer aValue) {
//$Section=Attribute set$ID=3F9C9B340313$Preserve=no
        iValue = aValue;
//$Section=Attribute set$ID=3F9C9B340313$Preserve=no
    }
//----------------------------------------------------------------------------
// Attributes
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C9B340314$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C9B340314$Preserve=no
    public ArrayList getAttributes() {
//$Section=Attribute get$ID=3F9C9B340314$Preserve=no
        return iAttributes;
//$Section=Attribute get$ID=3F9C9B340314$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C9B340314$Preserve=no
/**
 * Set accessor method.
 *
 * @param Attributes the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C9B340314$Preserve=no
    public void setAttributes(ArrayList aValue) {
//$Section=Attribute set$ID=3F9C9B340314$Preserve=no
        iAttributes = aValue;
//$Section=Attribute set$ID=3F9C9B340314$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9C9AF00366$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C9AF00366$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C9AF00366$Preserve=no

//End of class---------------
}
