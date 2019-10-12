//$Section=License$ID=3FB39E55038C$Preserve=no

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

//  Generated at 2005.04.08 09:15:54.281 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: XmlSchemaFactory.java

//$Section=ChangeLog$ID=3FB39E55038C$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3FB39E55038C$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;

//$Section=CustomDeclare$ID=3FB39E55038C$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3FB39E55038C$Preserve=no

//$Section=ClassJavadoc$ID=3FB39E55038C$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3FB39E55038C$Preserve=no
public class XmlSchemaFactory {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
    private Map iSchemas = new TreeMap();
    private String iFileSeparator;

//$Section=CustomClassDeclare$ID=3FB39E55038C$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3FB39E55038C$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3FB39E55038C$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3FB39E55038C$Preserve=no
    public XmlSchemaFactory() {
//$Section=DefaultConstructor$ID=3FB39E55038C$Preserve=yes

        iFileSeparator = System.getProperty("file.separator");

//$Section=DefaultConstructor$ID=3FB39E55038C$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3FB39E55038C$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3FB39E55038C$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3FB39E55038C$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3FB39E55038C$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3FB39E55038C$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3FB39E55038C$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3FB39E55038C$Preserve=yes

        iLog = null;
        iSchemas = null;

//$Section=DefaultFreeResources$ID=3FB39E55038C$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=411207FF0213$Preserve=yes
/**
 *
 * @param aSchemaName
 *
 * @param aFilePath
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=411207FF0213$Preserve=no
    public void loadXmlSchema( String aSchemaName, String aFilePath ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaFactory.");
//$Section=Operation$ID=411207FF0213$Preserve=yes

        new ParseXmlSchema(aSchemaName, aFilePath, this);

//$Section=Operation$ID=411207FF0213$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB4DEB40365$Preserve=yes
/**
 *
 * @param aSchemaName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB4DEB40365$Preserve=no
    public XmlSchemaElement getXmlSchemaElement( String aSchemaName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaFactory.");
//$Section=Operation$ID=3FB4DEB40365$Preserve=yes

        if (iSchemas.containsKey(aSchemaName)) {
            return (XmlSchemaElement) iSchemas.get(aSchemaName);
        }
        return null;

//$Section=Operation$ID=3FB4DEB40365$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB4CF1E0390$Preserve=yes
/**
 *
 * @param aXmlSchemaElement
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB4CF1E0390$Preserve=no
    protected void insert( XmlSchemaElement aXmlSchemaElement ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter XmlSchemaFactory.");
//$Section=Operation$ID=3FB4CF1E0390$Preserve=yes

//System.err.println("** " + aXmlSchemaElement.getName());

        if (iSchemas.containsKey(aXmlSchemaElement.getName())) {
            iSchemas.remove(aXmlSchemaElement.getName());
            iSchemas.put(aXmlSchemaElement.getName(), aXmlSchemaElement);
        } else {
            iSchemas.put(aXmlSchemaElement.getName(), aXmlSchemaElement);
        }

//$Section=Operation$ID=3FB4CF1E0390$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Schemas
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FB39FB70146$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FB39FB70146$Preserve=no
    public Map getSchemas() {
//$Section=Attribute get$ID=3FB39FB70146$Preserve=no
        return iSchemas;
//$Section=Attribute get$ID=3FB39FB70146$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FB39FB70146$Preserve=no
/**
 * Set accessor method.
 *
 * @param Schemas the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FB39FB70146$Preserve=no
    public void setSchemas(Map aValue) {
//$Section=Attribute set$ID=3FB39FB70146$Preserve=no
        iSchemas = aValue;
//$Section=Attribute set$ID=3FB39FB70146$Preserve=no
    }
//----------------------------------------------------------------------------
// FileSeparator
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FB3D89B0080$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FB3D89B0080$Preserve=no
    public String getFileSeparator() {
//$Section=Attribute get$ID=3FB3D89B0080$Preserve=no
        return iFileSeparator;
//$Section=Attribute get$ID=3FB3D89B0080$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FB3D89B0080$Preserve=no
/**
 * Set accessor method.
 *
 * @param FileSeparator the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FB3D89B0080$Preserve=no
    public void setFileSeparator(String aValue) {
//$Section=Attribute set$ID=3FB3D89B0080$Preserve=no
        iFileSeparator = aValue;
//$Section=Attribute set$ID=3FB3D89B0080$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3FB39E55038C$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FB39E55038C$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FB39E55038C$Preserve=no

//End of class---------------
}
