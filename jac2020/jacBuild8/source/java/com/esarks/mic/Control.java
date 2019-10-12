//$Section=License$ID=4183C3530203$Preserve=no

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

//  Generated at 2006.02.13 07:49:38.046 AM EST by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Control.java

//$Section=ChangeLog$ID=4183C3530203$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=4183C3530203$Preserve=no

package com.esarks.mic;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations

//$Section=CustomDeclare$ID=4183C3530203$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=4183C3530203$Preserve=no

//$Section=ClassJavadoc$ID=4183C3530203$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=4183C3530203$Preserve=no
public class Control {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    protected String iName = "";
    protected String iType = "";
    protected String iCaption = "";
    protected String iGrid = "";
    protected String iColumn = "";
    protected String iStyle = "";
    protected ControlValue iControlValue = new ControlValue();

//$Section=CustomClassDeclare$ID=4183C3530203$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=4183C3530203$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=4183C3530203$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=4183C3530203$Preserve=no
    public Control() {
//$Section=DefaultConstructor$ID=4183C3530203$Preserve=yes
//$Section=DefaultConstructor$ID=4183C3530203$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=4183C3530203$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=4183C3530203$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=4183C3530203$Preserve=yes
//$Section=DefaultDestructor$ID=4183C3530203$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=4183C3530203$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=4183C3530203$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=4183C3530203$Preserve=yes
//$Section=DefaultFreeResources$ID=4183C3530203$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4183C40502BF$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4183C40502BF$Preserve=no
    public String getName() {
//$Section=Attribute get$ID=4183C40502BF$Preserve=no
        return iName;
//$Section=Attribute get$ID=4183C40502BF$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4183C40502BF$Preserve=no
/**
 * Set accessor method.
 *
 * @param Name the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4183C40502BF$Preserve=no
    public void setName(String aValue) {
//$Section=Attribute set$ID=4183C40502BF$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=4183C40502BF$Preserve=no
    }
//----------------------------------------------------------------------------
// Type
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4183C41703A9$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4183C41703A9$Preserve=no
    public String getType() {
//$Section=Attribute get$ID=4183C41703A9$Preserve=no
        return iType;
//$Section=Attribute get$ID=4183C41703A9$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4183C41703A9$Preserve=no
/**
 * Set accessor method.
 *
 * @param Type the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4183C41703A9$Preserve=no
    public void setType(String aValue) {
//$Section=Attribute set$ID=4183C41703A9$Preserve=no
        iType = aValue;
//$Section=Attribute set$ID=4183C41703A9$Preserve=no
    }
//----------------------------------------------------------------------------
// Caption
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4183C429036B$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4183C429036B$Preserve=no
    public String getCaption() {
//$Section=Attribute get$ID=4183C429036B$Preserve=no
        return iCaption;
//$Section=Attribute get$ID=4183C429036B$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4183C429036B$Preserve=no
/**
 * Set accessor method.
 *
 * @param Caption the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4183C429036B$Preserve=no
    public void setCaption(String aValue) {
//$Section=Attribute set$ID=4183C429036B$Preserve=no
        iCaption = aValue;
//$Section=Attribute set$ID=4183C429036B$Preserve=no
    }
//----------------------------------------------------------------------------
// Grid
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4183C4360222$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4183C4360222$Preserve=no
    public String getGrid() {
//$Section=Attribute get$ID=4183C4360222$Preserve=no
        return iGrid;
//$Section=Attribute get$ID=4183C4360222$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4183C4360222$Preserve=no
/**
 * Set accessor method.
 *
 * @param Grid the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4183C4360222$Preserve=no
    public void setGrid(String aValue) {
//$Section=Attribute set$ID=4183C4360222$Preserve=no
        iGrid = aValue;
//$Section=Attribute set$ID=4183C4360222$Preserve=no
    }
//----------------------------------------------------------------------------
// Column
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4183C43B01C5$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4183C43B01C5$Preserve=no
    public String getColumn() {
//$Section=Attribute get$ID=4183C43B01C5$Preserve=no
        return iColumn;
//$Section=Attribute get$ID=4183C43B01C5$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4183C43B01C5$Preserve=no
/**
 * Set accessor method.
 *
 * @param Column the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4183C43B01C5$Preserve=no
    public void setColumn(String aValue) {
//$Section=Attribute set$ID=4183C43B01C5$Preserve=no
        iColumn = aValue;
//$Section=Attribute set$ID=4183C43B01C5$Preserve=no
    }
//----------------------------------------------------------------------------
// Style
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=43F07FF80399$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=43F07FF80399$Preserve=no
    public String getStyle() {
//$Section=Attribute get$ID=43F07FF80399$Preserve=no
        return iStyle;
//$Section=Attribute get$ID=43F07FF80399$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=43F07FF80399$Preserve=no
/**
 * Set accessor method.
 *
 * @param Style the value to be set.
 */
//$Section=Attribute setJavadoc$ID=43F07FF80399$Preserve=no
    public void setStyle(String aValue) {
//$Section=Attribute set$ID=43F07FF80399$Preserve=no
        iStyle = aValue;
//$Section=Attribute set$ID=43F07FF80399$Preserve=no
    }
//----------------------------------------------------------------------------
// ControlValue
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4183DC4A00AB$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4183DC4A00AB$Preserve=no
    public ControlValue getControlValue() {
//$Section=Attribute get$ID=4183DC4A00AB$Preserve=no
        return iControlValue;
//$Section=Attribute get$ID=4183DC4A00AB$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4183DC4A00AB$Preserve=no
/**
 * Set accessor method.
 *
 * @param ControlValue the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4183DC4A00AB$Preserve=no
    public void setControlValue(ControlValue aValue) {
//$Section=Attribute set$ID=4183DC4A00AB$Preserve=no
        iControlValue = aValue;
//$Section=Attribute set$ID=4183DC4A00AB$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=4183C3530203$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183C3530203$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183C3530203$Preserve=no

//End of class---------------
}
