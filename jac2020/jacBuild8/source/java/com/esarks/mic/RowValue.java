//$Section=License$ID=4183E567035B$Preserve=no

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

//  Generated at 2004.11.01 02:01:31.484 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: RowValue.java

//$Section=ChangeLog$ID=4183E567035B$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=4183E567035B$Preserve=no

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

//$Section=CustomDeclare$ID=4183E567035B$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=4183E567035B$Preserve=no

public class RowValue extends com.esarks.mic.ControlValue {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private ArrayList iValues = new ArrayList();

//$Section=CustomClassDeclare$ID=4183E567035B$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=4183E567035B$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

/**
 * Default constructor.
 */
    public RowValue() {
//$Section=DefaultConstructor$ID=4183E567035B$Preserve=yes
//$Section=DefaultConstructor$ID=4183E567035B$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

/**
 * Default finalize.
 */
    public void finalize() {
//$Section=DefaultDestructor$ID=4183E567035B$Preserve=yes
//$Section=DefaultDestructor$ID=4183E567035B$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

/**
 * Default freeResources.
 */
    public void freeResources() {
//$Section=DefaultFreeResources$ID=4183E567035B$Preserve=yes
//$Section=DefaultFreeResources$ID=4183E567035B$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
/**
 *
 */
    public void addValue( ColumnValue aControlValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter RowValue.");
//$Section=Operation$ID=4183E601002E$Preserve=yes
        iValues.add(aControlValue);
//$Section=Operation$ID=4183E601002E$Preserve=no
    }

/**
 *
 */
    public ColumnValue getValue( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter RowValue.");
//$Section=Operation$ID=4183E6010030$Preserve=yes
        if (iValues.size() < aIndex +1) return null;
        return (ColumnValue) iValues.get(aIndex);
//$Section=Operation$ID=4183E6010030$Preserve=no
    }

/**
 *
 */
    public int valueSize( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter RowValue.");
//$Section=Operation$ID=4183E601003E$Preserve=yes
        return iValues.size();
//$Section=Operation$ID=4183E601003E$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=4183E567035B$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183E567035B$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183E567035B$Preserve=no

//End of class---------------
}