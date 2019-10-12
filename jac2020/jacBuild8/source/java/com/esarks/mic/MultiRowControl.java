//$Section=License$ID=4183D95E0167$Preserve=no

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

//  Generated at 2004.11.04 01:32:48.328 PM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: MultiRowControl.java

//$Section=ChangeLog$ID=4183D95E0167$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=4183D95E0167$Preserve=no

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

//$Section=CustomDeclare$ID=4183D95E0167$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=4183D95E0167$Preserve=no

public class MultiRowControl extends com.esarks.mic.Control {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private ArrayList iColumns = new ArrayList();

//$Section=CustomClassDeclare$ID=4183D95E0167$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=4183D95E0167$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

/**
 * Default constructor.
 */
    public MultiRowControl() {
//$Section=DefaultConstructor$ID=4183D95E0167$Preserve=yes
//$Section=DefaultConstructor$ID=4183D95E0167$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

/**
 * Default finalize.
 */
    public void finalize() {
//$Section=DefaultDestructor$ID=4183D95E0167$Preserve=yes
//$Section=DefaultDestructor$ID=4183D95E0167$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

/**
 * Default freeResources.
 */
    public void freeResources() {
//$Section=DefaultFreeResources$ID=4183D95E0167$Preserve=yes
//$Section=DefaultFreeResources$ID=4183D95E0167$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
/**
 *
 */
    public void addControlValue( ColumnValue aColumnValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MultiRowControl.");
//$Section=Operation$ID=4183E6630128$Preserve=yes
        iColumns.add(aColumnValue);
//$Section=Operation$ID=4183E6630128$Preserve=no
    }

/**
 *
 */
    public ColumnValue getControlValue( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MultiRowControl.");
//$Section=Operation$ID=4183E6630138$Preserve=yes
        if (iColumns.size() < aIndex +1) return null;
        return (ColumnValue) iColumns.get(aIndex);
//$Section=Operation$ID=4183E6630138$Preserve=no
    }

/**
 *
 */
    public int controlValueSize( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MultiRowControl.");
//$Section=Operation$ID=4183E663013A$Preserve=yes
        return iColumns.size();
//$Section=Operation$ID=4183E663013A$Preserve=no
    }

/**
 *
 */
    public void addRow( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MultiRowControl.");
//$Section=Operation$ID=4188FE8C002E$Preserve=yes
        for (int lIdx=0; lIdx < iColumns.size(); lIdx++) {
            ColumnValue lColumnValue = (ColumnValue) iColumns.get(lIdx);
            lColumnValue.addRow();
        }
//$Section=Operation$ID=4188FE8C002E$Preserve=no
    }

/**
 *
 */
    public void clearRows( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MultiRowControl.");
//$Section=Operation$ID=418A75B80000$Preserve=yes
        for (int lIdx=0; lIdx < iColumns.size(); lIdx++) {
            ColumnValue lColumnValue = (ColumnValue) iColumns.get(lIdx);
            lColumnValue.clearRows();
        }
//$Section=Operation$ID=418A75B80000$Preserve=no
    }

/**
 *
 */
    public void setRowColumnValue( String aColumnName, String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MultiRowControl.");
//$Section=Operation$ID=4188FE960271$Preserve=yes
        for (int lIdx=0; lIdx < iColumns.size(); lIdx++) {
            ColumnValue lColumnValue = (ColumnValue) iColumns.get(lIdx);
            if (lColumnValue.getName().compareTo(aColumnName) == 0) {
                lColumnValue.setValue(aValue);
                return;
            }
        }
//$Section=Operation$ID=4188FE960271$Preserve=no
    }

/**
 *
 */
    public int getRowSize( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MultiRowControl.");
//$Section=Operation$ID=418933B90157$Preserve=yes
        if (iColumns.size() == 0) return 0;
        ColumnValue lColumnValue = (ColumnValue) iColumns.get(0);
        return lColumnValue.getRowSize();
//$Section=Operation$ID=418933B90157$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=4183D95E0167$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183D95E0167$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183D95E0167$Preserve=no

//End of class---------------
}
