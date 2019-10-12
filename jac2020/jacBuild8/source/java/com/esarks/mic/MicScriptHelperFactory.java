//$Section=License$ID=417A47F0002E$Preserve=no

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

//  Generated at 2005.01.08 10:34:33.937 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: MicScriptHelperFactory.script

//$Section=ChangeLog$ID=417A47F0002E$Preserve=yes

 /* ========================================================================= *
    Contributor        Description
    ------------------ ------------------------------------------------------
                       Author

  * ========================================================================= */

//$Section=Class$ID=417A47F0002E$Preserve=no

package com.esarks.mic;

//$Section=ClassJavadoc$ID=417A47F0002E$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=417A47F0002E$Preserve=no
//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import com.esarks.jac.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.net.*;
// SuperClass
import com.esarks.jac.ScriptHelperFactory;

//$Section=CustomDeclare$ID=417A47F0002E$Preserve=yes

 //----------------------------------------------------------------------------
 // This section is for custom declarations.
 //----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=417A47F0002E$Preserve=no

public class MicScriptHelperFactory extends com.esarks.jac.ScriptHelperFactory {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A47F0002E$Preserve=yes

 //----------------------------------------------------------------------------
 // This section is for custom class declarations.
 //----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A47F0002E$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=417A47F0002E$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=417A47F0002E$Preserve=no
    public MicScriptHelperFactory() {
//$Section=DefaultConstructor$ID=417A47F0002E$Preserve=yes
//$Section=DefaultConstructor$ID=417A47F0002E$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=417A47F0002E$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=417A47F0002E$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=417A47F0002E$Preserve=yes
//$Section=DefaultDestructor$ID=417A47F0002E$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=417A47F0002E$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=417A47F0002E$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=417A47F0002E$Preserve=yes
//$Section=DefaultFreeResources$ID=417A47F0002E$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=417A5A050222$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aName
 *
 * @param aInstance
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417A5A050222$Preserve=no
    public ScriptHelper getScriptHelper( Script aScript, String aName, String aInstance ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter MicScriptHelperFactory.");
//$Section=Operation$ID=417A5A050222$Preserve=yes
       return (ScriptHelper) new MicScriptHelper(aScript, aName, aInstance);
//$Section=Operation$ID=417A5A050222$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=417A47F0002E$Preserve=yes

 //----------------------------------------------------------------------------
 // This section is for custom operations.
 //----------------------------------------------------------------------------

//$Section=Deleted$ID=417A47F0002E$Preserve=yes

 //----------------------------------------------------------------------------
 // This section contains orphaned code from deleted operations.
 //----------------------------------------------------------------------------

//$Section=Deleted$ID=417A47F0002E$Preserve=no

//End of class---------------
}