//$Section=License$ID=4183C34002BF$Preserve=no

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

//  Generated at 2004.11.05 10:32:32.781 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Frame.java

//$Section=ChangeLog$ID=4183C34002BF$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=4183C34002BF$Preserve=no

package com.esarks.mic;

/**
 *
 */

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;
import com.esarks.jac.*;

//$Section=CustomDeclare$ID=4183C34002BF$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=4183C34002BF$Preserve=no

public class Frame {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    protected String iName;
    protected String iTitle;
    protected Jeo iServiceJeo;
    protected ArrayList iControls = new ArrayList();
    protected ArrayList iErrors;

//$Section=CustomClassDeclare$ID=4183C34002BF$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=4183C34002BF$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

/**
 * Default constructor.
 */
    public Frame() {
//$Section=DefaultConstructor$ID=4183C34002BF$Preserve=yes
//$Section=DefaultConstructor$ID=4183C34002BF$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

/**
 * Default finalize.
 */
    public void finalize() {
//$Section=DefaultDestructor$ID=4183C34002BF$Preserve=yes
//$Section=DefaultDestructor$ID=4183C34002BF$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

/**
 * Default freeResources.
 */
    public void freeResources() {
//$Section=DefaultFreeResources$ID=4183C34002BF$Preserve=yes
//$Section=DefaultFreeResources$ID=4183C34002BF$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
/**
 *
 */
    public void addControl( Control aControl ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=4184C660037A$Preserve=yes
        iControls.add(aControl);
//$Section=Operation$ID=4184C660037A$Preserve=no
    }

/**
 *
 */
    public Control getControl( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=4184C660037C$Preserve=yes
        if (iControls.size() < aIndex + 1) return null;
        return (Control) iControls.get(aIndex);
//$Section=Operation$ID=4184C660037C$Preserve=no
    }

/**
 *
 */
    public Control getControl( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=4189E2270138$Preserve=yes
        for (int lIdx=0; lIdx < iControls.size(); lIdx++) {
            Control lControl = (Control) iControls.get(lIdx);
            if (lControl.getName().compareTo(aName) == 0) return lControl;
        }
        return null;
//$Section=Operation$ID=4189E2270138$Preserve=no
    }

/**
 *
 */
    public int controlSize( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=4184C660038A$Preserve=yes
        return iControls.size();
//$Section=Operation$ID=4184C660038A$Preserve=no
    }

/**
 *
 */
    public void setValue( String aControlName, String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=4187730C034B$Preserve=yes
        Control lControl = getControl(aControlName);
        if (lControl == null) return;
        if (lControl.getType().compareTo("select") == 0 ||
            lControl.getType().compareTo("checkbox") == 0 ||
            lControl.getType().compareTo("radio") == 0) {
            setOptionValue(aControlName, aValue, true);
        } else {
            lControl.getControlValue().setValue(aValue);
        }
//$Section=Operation$ID=4187730C034B$Preserve=no
    }

/**
 *
 */
    public void setColumnValue( String aControlName, String aRowColumn, String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=4188F8F90138$Preserve=yes
        Control lControl = getControl(aControlName);
        if (lControl == null) return;
        if (lControl.getType().compareTo("multirow") != 0) {
            lControl.getControlValue().setValue(aValue);
            return;
        }
        ((MultiRowControl)lControl).setRowColumnValue(aRowColumn, aValue);
//$Section=Operation$ID=4188F8F90138$Preserve=no
    }

/**
 *
 */
    public void setOptionValue( String aControlName, String aValue, boolean aSelected ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=418A519201C5$Preserve=yes
        Control lControl = getControl(aControlName);
        if (lControl == null) return;
        ((OptionControl)lControl).selectControlValue(aValue, aSelected);
//$Section=Operation$ID=418A519201C5$Preserve=no
    }

/**
 *
 */
    public void setOptionValue( String aControlName, String aValue, String aSelected ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=418A52DB035B$Preserve=yes
        if (aSelected.compareTo("1") == 0) {
            setOptionValue(aControlName, aValue, true);
        } else {
            setOptionValue(aControlName, aValue, false);
        }
//$Section=Operation$ID=418A52DB035B$Preserve=no
    }

/**
 *
 */
    public void setDateValue( String aControlName, String aValue, String aMmValue, String aDdValue, String aYyyyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=418A6B59036B$Preserve=yes
        setValue(aControlName, aValue);
        Control lControl = getControl(aControlName);
        if (lControl == null) return;
        if (lControl.getType().compareTo("date") == 0) {
            DateValue lDateValue = (DateValue) lControl.getControlValue();
            lDateValue.setMm(aMmValue);
            lDateValue.setDd(aDdValue);
            lDateValue.setYyyy(aYyyyValue);
        }
//$Section=Operation$ID=418A6B59036B$Preserve=no
    }

/**
 *
 */
    public void clearValue( String aControlName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Frame.");
//$Section=Operation$ID=418A76B90196$Preserve=yes
        Control lControl = getControl(aControlName);
        if (lControl == null) return;
        if (lControl.getType().compareTo("multirow") == 0) {
          ((MultiRowControl)lControl).clearRows();
          return;
        }
        else if (lControl.getType().compareTo("date") == 0) {
          setDateValue(aControlName, "", "", "", "");
          return;
        }
        setValue(aControlName, "");
//$Section=Operation$ID=418A76B90196$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
    public String getName() {
//$Section=Attribute get$ID=4183C38D0000$Preserve=no
        return iName;
//$Section=Attribute get$ID=4183C38D0000$Preserve=no
    }
    public void setName(String aValue) {
//$Section=Attribute set$ID=4183C38D0000$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=4183C38D0000$Preserve=no
    }
//----------------------------------------------------------------------------
// Title
//----------------------------------------------------------------------------
    public String getTitle() {
//$Section=Attribute get$ID=4183C39D02AF$Preserve=no
        return iTitle;
//$Section=Attribute get$ID=4183C39D02AF$Preserve=no
    }
    public void setTitle(String aValue) {
//$Section=Attribute set$ID=4183C39D02AF$Preserve=no
        iTitle = aValue;
//$Section=Attribute set$ID=4183C39D02AF$Preserve=no
    }
//----------------------------------------------------------------------------
// ServiceJeo
//----------------------------------------------------------------------------
    public Jeo getServiceJeo() {
//$Section=Attribute get$ID=4188F4680186$Preserve=no
        return iServiceJeo;
//$Section=Attribute get$ID=4188F4680186$Preserve=no
    }
    public void setServiceJeo(Jeo aValue) {
//$Section=Attribute set$ID=4188F4680186$Preserve=no
        iServiceJeo = aValue;
//$Section=Attribute set$ID=4188F4680186$Preserve=no
    }
//----------------------------------------------------------------------------
// Errors
//----------------------------------------------------------------------------
    public ArrayList getErrors() {
//$Section=Attribute get$ID=418B9CD5032C$Preserve=no
        return iErrors;
//$Section=Attribute get$ID=418B9CD5032C$Preserve=no
    }
    public void setErrors(ArrayList aValue) {
//$Section=Attribute set$ID=418B9CD5032C$Preserve=no
        iErrors = aValue;
//$Section=Attribute set$ID=418B9CD5032C$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=4183C34002BF$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183C34002BF$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4183C34002BF$Preserve=no

//End of class---------------
}
