//$Section=License$ID=4185DE4600FA$Preserve=no

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

//  Generated at 2004.11.04 01:33:45.046 PM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: ColumnValue.java

//$Section=ChangeLog$ID=4185DE4600FA$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=4185DE4600FA$Preserve=no

package com.esarks.mic;

/**
 *
 */

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;
// SuperClass

//$Section=CustomDeclare$ID=4185DE4600FA$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=4185DE4600FA$Preserve=no

public class ColumnValue extends com.esarks.mic.ControlValue {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private String iTitle;
    private String iName;
    private String iHrefMethod;
    private String iHrefRowColumn;
    private ArrayList iValues = new ArrayList();

//$Section=CustomClassDeclare$ID=4185DE4600FA$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=4185DE4600FA$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

/**
 * Default constructor.
 */
    public ColumnValue() {
//$Section=DefaultConstructor$ID=4185DE4600FA$Preserve=yes
//$Section=DefaultConstructor$ID=4185DE4600FA$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

/**
 * Default finalize.
 */
    public void finalize() {
//$Section=DefaultDestructor$ID=4185DE4600FA$Preserve=yes
//$Section=DefaultDestructor$ID=4185DE4600FA$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

/**
 * Default freeResources.
 */
    public void freeResources() {
//$Section=DefaultFreeResources$ID=4185DE4600FA$Preserve=yes
//$Section=DefaultFreeResources$ID=4185DE4600FA$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
/**
 *
 */
    public void addRow( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ColumnValue.");
//$Section=Operation$ID=41892EBC0222$Preserve=yes
        iValues.add("");
//$Section=Operation$ID=41892EBC0222$Preserve=no
    }

/**
 *
 */
    public void clearRows( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ColumnValue.");
//$Section=Operation$ID=418A75FA030D$Preserve=yes
        iValues.clear();
//$Section=Operation$ID=418A75FA030D$Preserve=no
    }

/**
 *
 */
    public void setValue( String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ColumnValue.");
//$Section=Operation$ID=41892E4E0148$Preserve=yes
        if (iValues.size() == 0) {
            iValues.add(aValue);
            return;
        }
        iValues.set(iValues.size() - 1, aValue);
//$Section=Operation$ID=41892E4E0148$Preserve=no
    }

/**
 *
 */
    public String getValue( int aRow ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ColumnValue.");
//$Section=Operation$ID=4189312E0138$Preserve=yes
        if (aRow > iValues.size() -1) return "";
        return (String) iValues.get(aRow);
//$Section=Operation$ID=4189312E0138$Preserve=no
    }

/**
 *
 */
    public int getRowSize( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ColumnValue.");
//$Section=Operation$ID=4189342C0000$Preserve=yes
        return iValues.size();
//$Section=Operation$ID=4189342C0000$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Title
//----------------------------------------------------------------------------
    public String getTitle() {
//$Section=Attribute get$ID=4185DE70001F$Preserve=no
        return iTitle;
//$Section=Attribute get$ID=4185DE70001F$Preserve=no
    }
    public void setTitle(String aValue) {
//$Section=Attribute set$ID=4185DE70001F$Preserve=no
        iTitle = aValue;
//$Section=Attribute set$ID=4185DE70001F$Preserve=no
    }
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
    public String getName() {
//$Section=Attribute get$ID=4185DE77029F$Preserve=no
        return iName;
//$Section=Attribute get$ID=4185DE77029F$Preserve=no
    }
    public void setName(String aValue) {
//$Section=Attribute set$ID=4185DE77029F$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=4185DE77029F$Preserve=no
    }
//----------------------------------------------------------------------------
// HrefMethod
//----------------------------------------------------------------------------
    public String getHrefMethod() {
//$Section=Attribute get$ID=4189E91C0157$Preserve=no
        return iHrefMethod;
//$Section=Attribute get$ID=4189E91C0157$Preserve=no
    }
    public void setHrefMethod(String aValue) {
//$Section=Attribute set$ID=4189E91C0157$Preserve=no
        iHrefMethod = aValue;
//$Section=Attribute set$ID=4189E91C0157$Preserve=no
    }
//----------------------------------------------------------------------------
// HrefRowColumn
//----------------------------------------------------------------------------
    public String getHrefRowColumn() {
//$Section=Attribute get$ID=4189E91C02CE$Preserve=no
        return iHrefRowColumn;
//$Section=Attribute get$ID=4189E91C02CE$Preserve=no
    }
    public void setHrefRowColumn(String aValue) {
//$Section=Attribute set$ID=4189E91C02CE$Preserve=no
        iHrefRowColumn = aValue;
//$Section=Attribute set$ID=4189E91C02CE$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=4185DE4600FA$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4185DE4600FA$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4185DE4600FA$Preserve=no

//End of class---------------
}
