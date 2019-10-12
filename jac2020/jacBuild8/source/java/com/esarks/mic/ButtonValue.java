//$Section=License$ID=4183DA7801E4$Preserve=no

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

//  Generated at 2004.11.05 09:04:40.312 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: ButtonValue.java

//$Section=ChangeLog$ID=4183DA7801E4$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=4183DA7801E4$Preserve=no

package com.esarks.mic;

/**
 *
 */

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
// SuperClass

//$Section=CustomDeclare$ID=4183DA7801E4$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=4183DA7801E4$Preserve=no

public class ButtonValue extends com.esarks.mic.ControlValue {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private String iType;
    private String iName;
    private String iValue;
    private String iEvent;
    private String iService;
    private String iMethod;
    private String iMap;
    private boolean iSelected = false;

//$Section=CustomClassDeclare$ID=4183DA7801E4$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=4183DA7801E4$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

/**
 * Default constructor.
 */
    public ButtonValue() {
//$Section=DefaultConstructor$ID=4183DA7801E4$Preserve=yes
//$Section=DefaultConstructor$ID=4183DA7801E4$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

/**
 * Default finalize.
 */
    public void finalize() {
//$Section=DefaultDestructor$ID=4183DA7801E4$Preserve=yes
//$Section=DefaultDestructor$ID=4183DA7801E4$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

/**
 * Default freeResources.
 */
    public void freeResources() {
//$Section=DefaultFreeResources$ID=4183DA7801E4$Preserve=yes
//$Section=DefaultFreeResources$ID=4183DA7801E4$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Type
//----------------------------------------------------------------------------
    public String getType() {
//$Section=Attribute get$ID=4183DA9002CE$Preserve=no
        return iType;
//$Section=Attribute get$ID=4183DA9002CE$Preserve=no
    }
    public void setType(String aValue) {
//$Section=Attribute set$ID=4183DA9002CE$Preserve=no
        iType = aValue;
//$Section=Attribute set$ID=4183DA9002CE$Preserve=no
    }
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
    public String getName() {
//$Section=Attribute get$ID=4183DAA2031C$Preserve=no
        return iName;
//$Section=Attribute get$ID=4183DAA2031C$Preserve=no
    }
    public void setName(String aValue) {
//$Section=Attribute set$ID=4183DAA2031C$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=4183DAA2031C$Preserve=no
    }
//----------------------------------------------------------------------------
// Value
//----------------------------------------------------------------------------
    public String getValue() {
//$Section=Attribute get$ID=4183DACA01A5$Preserve=no
        return iValue;
//$Section=Attribute get$ID=4183DACA01A5$Preserve=no
    }
    public void setValue(String aValue) {
//$Section=Attribute set$ID=4183DACA01A5$Preserve=no
        iValue = aValue;
//$Section=Attribute set$ID=4183DACA01A5$Preserve=no
    }
//----------------------------------------------------------------------------
// Event
//----------------------------------------------------------------------------
    public String getEvent() {
//$Section=Attribute get$ID=418B885B0271$Preserve=no
        return iEvent;
//$Section=Attribute get$ID=418B885B0271$Preserve=no
    }
    public void setEvent(String aValue) {
//$Section=Attribute set$ID=418B885B0271$Preserve=no
        iEvent = aValue;
//$Section=Attribute set$ID=418B885B0271$Preserve=no
    }
//----------------------------------------------------------------------------
// Service
//----------------------------------------------------------------------------
    public String getService() {
//$Section=Attribute get$ID=4183DAA40280$Preserve=no
        return iService;
//$Section=Attribute get$ID=4183DAA40280$Preserve=no
    }
    public void setService(String aValue) {
//$Section=Attribute set$ID=4183DAA40280$Preserve=no
        iService = aValue;
//$Section=Attribute set$ID=4183DAA40280$Preserve=no
    }
//----------------------------------------------------------------------------
// Method
//----------------------------------------------------------------------------
    public String getMethod() {
//$Section=Attribute get$ID=4183DAA7032C$Preserve=no
        return iMethod;
//$Section=Attribute get$ID=4183DAA7032C$Preserve=no
    }
    public void setMethod(String aValue) {
//$Section=Attribute set$ID=4183DAA7032C$Preserve=no
        iMethod = aValue;
//$Section=Attribute set$ID=4183DAA7032C$Preserve=no
    }
//----------------------------------------------------------------------------
// Map
//----------------------------------------------------------------------------
    public String getMap() {
//$Section=Attribute get$ID=418A971602EE$Preserve=no
        return iMap;
//$Section=Attribute get$ID=418A971602EE$Preserve=no
    }
    public void setMap(String aValue) {
//$Section=Attribute set$ID=418A971602EE$Preserve=no
        iMap = aValue;
//$Section=Attribute set$ID=418A971602EE$Preserve=no
    }
//----------------------------------------------------------------------------
// Selected
//----------------------------------------------------------------------------
    public boolean getSelected() {
//$Section=Attribute get$ID=4183DD1300BB$Preserve=no
        return iSelected;
//$Section=Attribute get$ID=4183DD1300BB$Preserve=no
    }
    public void setSelected(boolean aValue) {
//$Section=Attribute set$ID=4183DD1300BB$Preserve=no
        iSelected = aValue;
//$Section=Attribute set$ID=4183DD1300BB$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=4183DA7801E4$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183DA7801E4$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183DA7801E4$Preserve=no

//End of class---------------
}
