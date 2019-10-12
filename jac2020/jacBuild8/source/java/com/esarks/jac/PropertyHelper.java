//$Section=License$ID=3F9FC59F0322$Preserve=no

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

//  Generated at 2005.06.16 09:39:50.193 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: PropertyHelper.java

//$Section=ChangeLog$ID=3F9FC59F0322$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9FC59F0322$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.Stack;
import java.util.Date;
import java.sql.*;

//$Section=CustomDeclare$ID=3F9FC59F0322$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3F9FC59F0322$Preserve=no

//$Section=ClassJavadoc$ID=3F9FC59F0322$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3F9FC59F0322$Preserve=no
public class PropertyHelper {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private String iPropertyName;
    private Stack iPropertyNameStack = new Stack();
    private Script iScript;
    private SymbolTable iSymbolTable;

//$Section=CustomClassDeclare$ID=3F9FC59F0322$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9FC59F0322$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9FC59F0322$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9FC59F0322$Preserve=no
    private PropertyHelper() {
//$Section=DefaultConstructor$ID=3F9FC59F0322$Preserve=yes
//$Section=DefaultConstructor$ID=3F9FC59F0322$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9FC59F0322$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9FC59F0322$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9FC59F0322$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3F9FC59F0322$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9FC59F0322$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9FC59F0322$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9FC59F0322$Preserve=yes

        if (iPropertyNameStack != null) {
            iPropertyNameStack.empty();
            iPropertyNameStack = null;
        }
        iScript = null;
        iSymbolTable = null;

//$Section=DefaultFreeResources$ID=3F9FC59F0322$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3F9FDA26006B$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=3F9FDA26006B$Preserve=no
    public PropertyHelper( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FDA26006B$Preserve=yes

        iScript = aScript;
        iSymbolTable = aScript.getSymbolTable();

//$Section=Operation$ID=3F9FDA26006B$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F5760701C5$Preserve=yes
/**
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F5760701C5$Preserve=no
    public void resetScript( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F5760701C5$Preserve=yes

        iScript = aScript;
        iSymbolTable = aScript.getSymbolTable();
        iPropertyNameStack = new Stack();

//$Section=Operation$ID=40F5760701C5$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC62C0339$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC62C0339$Preserve=no
    public PropertyHelper setPropertyName( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC62C0339$Preserve=yes

        iPropertyName = aPropertyName;
        iPropertyNameStack.push(aPropertyName);
        return this;

//$Section=Operation$ID=3F9FC62C0339$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B17F660308$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B17F660308$Preserve=no
    public PropertyHelper setPropertyName( Script aScript, String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=42B17F660308$Preserve=yes
        setScript(aScript);
        setSymbolTable(aScript.getSymbolTable());
        return setPropertyName(aPropertyName);
//$Section=Operation$ID=42B17F660308$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FAD29D00289$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FAD29D00289$Preserve=no
    private void popPropertyName( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FAD29D00289$Preserve=yes

        try {
            iPropertyName = (String) iPropertyNameStack.pop();
        } catch (Throwable e) {System.err.println("Exception in popPropertyName()\n" + e);}

//$Section=Operation$ID=3FAD29D00289$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8B003A3$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8B003A3$Preserve=no
    public void set( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8B003A3$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue());
        } catch (Throwable e) {System.err.println("Exception in set()\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8B003A3$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8EC0301$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8EC0301$Preserve=no
    public void set( boolean aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8EC0301$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(boolean)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8EC0301$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8EF0173$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8EF0173$Preserve=no
    public void set( byte aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8EF0173$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(byte)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8EF0173$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8F00098$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8F00098$Preserve=no
    public void set( short aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8F00098$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(short)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8F00098$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8F00265$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8F00265$Preserve=no
    public void set( int aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8F00265$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(int)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8F00265$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8F003C3$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8F003C3$Preserve=no
    public void set( long aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8F003C3$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(long)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8F003C3$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8F1011C$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8F1011C$Preserve=no
    public void set( char aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8F1011C$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(char)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8F1011C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8F10248$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8F10248$Preserve=no
    public void set( float aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8F10248$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(float)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8F10248$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8F10388$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8F10388$Preserve=no
    public void set( double aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8F10388$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(double)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8F10388$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8F200E1$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8F200E1$Preserve=no
    public void set( Object aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8F200E1$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(Object)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8F200E1$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC8F601C3$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC8F601C3$Preserve=no
    public void set( String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC8F601C3$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC8F601C3$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB190B300A2$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB190B300A2$Preserve=no
    public void set( Date aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB190B300A2$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FB190B300A2$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FC5E4C8023B$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FC5E4C8023B$Preserve=no
    public void set( Time aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FC5E4C8023B$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in set(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FC5E4C8023B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB1C13D0262$Preserve=yes
/**
 * Adds a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB1C13D0262$Preserve=no
    public void set( PropertyValue aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB1C13D0262$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, aValue);
        } catch (Throwable e) {System.err.println("Exception in set(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FB1C13D0262$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC910027F$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC910027F$Preserve=no
    public void reset( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC910027F$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue());
        } catch (Throwable e) {System.err.println("Exception in reset()\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC910027F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC91701B6$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC91701B6$Preserve=no
    public void reset( boolean aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC91701B6$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(boolean)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC91701B6$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC91F01F4$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC91F01F4$Preserve=no
    public void reset( byte aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC91F01F4$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(byte)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC91F01F4$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC92400B1$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC92400B1$Preserve=no
    public void reset( short aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC92400B1$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(short)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC92400B1$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC92401C9$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC92401C9$Preserve=no
    public void reset( int aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC92401C9$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(int)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC92401C9$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC92402A5$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC92402A5$Preserve=no
    public void reset( long aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC92402A5$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(long)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC92402A5$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9240382$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9240382$Preserve=no
    public void reset( char aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9240382$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(char)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC9240382$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9250076$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9250076$Preserve=no
    public void reset( float aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9250076$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(float)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC9250076$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9250166$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9250166$Preserve=no
    public void reset( double aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9250166$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(double)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC9250166$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC925024D$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC925024D$Preserve=no
    public void reset( Object aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC925024D$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(Object)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC925024D$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC925035B$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC925035B$Preserve=no
    public void reset( String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC925035B$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC925035B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB190BA026F$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB190BA026F$Preserve=no
    public void reset( Date aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB190BA026F$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FB190BA026F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FC5E4D10180$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FC5E4D10180$Preserve=no
    public void reset( Time aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FC5E4D10180$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in reset(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FC5E4D10180$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB1C1450232$Preserve=yes
/**
 * Clears the value list before adding a value to the value list of the referenced property previously set by setPropertyName.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB1C1450232$Preserve=no
    public void reset( PropertyValue aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB1C1450232$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().resetPropertyValue(iPropertyName, aValue);
        } catch (Throwable e) {System.err.println("Exception in reset(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FB1C1450232$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC92D0032$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC92D0032$Preserve=no
    public void replace( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC92D0032$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue());
        } catch (Throwable e) {System.err.println("Exception in replace()\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC92D0032$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93302C5$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93302C5$Preserve=no
    public void replace( boolean aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93302C5$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(boolean)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93302C5$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93902C4$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93902C4$Preserve=no
    public void replace( byte aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93902C4$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(byte)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93902C4$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93A01F3$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93A01F3$Preserve=no
    public void replace( short aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93A01F3$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(short)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93A01F3$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93A0347$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93A0347$Preserve=no
    public void replace( int aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93A0347$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(int)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93A0347$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93B0064$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93B0064$Preserve=no
    public void replace( long aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93B0064$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(long)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93B0064$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93B0172$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93B0172$Preserve=no
    public void replace( char aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93B0172$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(char)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93B0172$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93B028B$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93B028B$Preserve=no
    public void replace( float aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93B028B$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(float)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93B028B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93C0001$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93C0001$Preserve=no
    public void replace( double aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93C0001$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(double)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93C0001$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93C0137$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93C0137$Preserve=no
    public void replace( Object aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93C0137$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(Object)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93C0137$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC93C028C$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC93C028C$Preserve=no
    public void replace( String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC93C028C$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC93C028C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB190C3009B$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB190C3009B$Preserve=no
    public void replace( Date aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB190C3009B$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FB190C3009B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FC5E4D8022A$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FC5E4D8022A$Preserve=no
    public void replace( Time aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FC5E4D8022A$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, new PropertyValue(aValue));
        } catch (Throwable e) {System.err.println("Exception in replace(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FC5E4D8022A$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB1C14D011B$Preserve=yes
/**
 * Replaces the current value in the value list of the referenced property previously set by setPropertyName.  <p>The "current" value index is held within PropertyValues.
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB1C14D011B$Preserve=no
    public void replace( PropertyValue aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB1C14D011B$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().replacePropertyValue(iPropertyName, aValue);
        } catch (Throwable e) {System.err.println("Exception in replace(String)\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FB1C14D011B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9A6009A$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9A6009A$Preserve=no
    public void remove( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9A6009A$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().removePropertyValues(iPropertyName);
        } catch (Throwable e) {System.err.println("Exception in remove()\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3F9FC9A6009A$Preserve=no
    }

//$Section=OperationJavadoc$ID=40E6D86A02FD$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40E6D86A02FD$Preserve=no
    public void removeValue( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40E6D86A02FD$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().removePropertyValue(iPropertyName);
        } catch (Throwable e) {System.err.println("Exception in removeValue()\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=40E6D86A02FD$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE0064$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE0064$Preserve=no
    public int getValueType( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE0064$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueType();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return -1;
                              }

//$Section=Operation$ID=3F9FC9FE0064$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE006E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE006E$Preserve=no
    public String getValueClassName( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE006E$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueClassName();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return "";
                              }

//$Section=Operation$ID=3F9FC9FE006E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE006F$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE006F$Preserve=no
    public boolean getValueBoolean( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE006F$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueBoolean();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3F9FC9FE006F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE0078$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE0078$Preserve=no
    public byte getValueByte( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE0078$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueByte();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=3F9FC9FE0078$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE0079$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE0079$Preserve=no
    public short getValueShort( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE0079$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueShort();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=3F9FC9FE0079$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE0082$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE0082$Preserve=no
    public int getValueInt( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE0082$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueInt();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=3F9FC9FE0082$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE008C$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE008C$Preserve=no
    public long getValueLong( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE008C$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueLong();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=3F9FC9FE008C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE008D$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE008D$Preserve=no
    public char getValueChar( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE008D$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueChar();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return (char) 0;
                              }

//$Section=Operation$ID=3F9FC9FE008D$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE0096$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE0096$Preserve=no
    public float getValueFloat( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE0096$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueFloat();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=3F9FC9FE0096$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE0097$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE0097$Preserve=no
    public double getValueDouble( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE0097$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueDouble();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=3F9FC9FE0097$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE00A0$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE00A0$Preserve=no
    public Object getValueObject( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE00A0$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueObject();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=3F9FC9FE00A0$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE00AA$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE00AA$Preserve=no
    public String getValueString( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE00AA$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueString();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return "";
                              }

//$Section=Operation$ID=3F9FC9FE00AA$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB191ED011C$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB191ED011C$Preserve=no
    public java.util.Date getValueDate( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB191ED011C$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueDate();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=3FB191ED011C$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63400280$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63400280$Preserve=no
    public java.sql.Date getValueSqlDate( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63400280$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueSqlDate();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B63400280$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FC5E4E501F7$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FC5E4E501F7$Preserve=no
    public Time getValueTime( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FC5E4E501F7$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueTime();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=3FC5E4E501F7$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63880399$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63880399$Preserve=no
    public Jeo getValueJeo( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63880399$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueJeo();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B63880399$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B638A004E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B638A004E$Preserve=no
    public Timestamp getValueTimestamp( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B638A004E$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueTimestamp();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B638A004E$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE0251$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE0251$Preserve=no
    public boolean getValueBoolean( boolean aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE0251$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueBoolean(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=423B63CE0251$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE0252$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE0252$Preserve=no
    public byte getValueByte( byte aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE0252$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueByte(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=423B63CE0252$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE0261$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE0261$Preserve=no
    public short getValueShort( short aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE0261$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueShort(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=423B63CE0261$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE0262$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE0262$Preserve=no
    public int getValueInt( int aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE0262$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueInt(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=423B63CE0262$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE0271$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE0271$Preserve=no
    public long getValueLong( long aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE0271$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueLong(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=423B63CE0271$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE0280$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE0280$Preserve=no
    public char getValueChar( char aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE0280$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueChar(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return ' ';
                              }

//$Section=Operation$ID=423B63CE0280$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE0281$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE0281$Preserve=no
    public float getValueFloat( float aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE0281$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueFloat(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return (float)0.0;
                              }

//$Section=Operation$ID=423B63CE0281$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE0290$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE0290$Preserve=no
    public double getValueDouble( double aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE0290$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueDouble(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0.0;
                              }

//$Section=Operation$ID=423B63CE0290$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE0291$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE0291$Preserve=no
    public Object getValueObject( Object aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE0291$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueObject();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B63CE0291$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE029F$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE029F$Preserve=no
    public String getValueString( String aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE029F$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueString(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B63CE029F$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE02AF$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE02AF$Preserve=no
    public java.util.Date getValueDate( java.util.Date aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE02AF$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueDate(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B63CE02AF$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE02B0$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE02B0$Preserve=no
    public java.sql.Date getValueSqlDate( java.sql.Date aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE02B0$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueSqlDate(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B63CE02B0$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE02BF$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE02BF$Preserve=no
    public Time getValueTime( Time aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE02BF$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueTime(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B63CE02BF$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE02C0$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE02C0$Preserve=no
    public Jeo getValueJeo( Jeo aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE02C0$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueJeo(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B63CE02C0$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B63CE02CE$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B63CE02CE$Preserve=no
    public Timestamp getValueTimestamp( Timestamp aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=423B63CE02CE$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getValueTimestamp(aDefaultValue);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=423B63CE02CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA1919C0225$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA1919C0225$Preserve=no
    public PropertyValue getPropertyValue( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA1919C0225$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=3FA1919C0225$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB5162E0133$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB5162E0133$Preserve=no
    public String getType( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB5162E0133$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getType();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=3FB5162E0133$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FC9FE00AB$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FC9FE00AB$Preserve=no
    public String toString( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FC9FE00AB$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).toString();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return "";
                              }
//$Section=Operation$ID=3F9FC9FE00AB$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE6EA02C3$Preserve=yes
/**
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE6EA02C3$Preserve=no
    public boolean resetIterator( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FE6EA02C3$Preserve=yes

        try {
            popPropertyName();
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues(iPropertyName, false);
            if (lPropertyValues == null) return false;
            lPropertyValues.resetIterator(aIndex);
            return true;
        } catch (Throwable e) {System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);}
        return false;

//$Section=Operation$ID=3F9FE6EA02C3$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA042140147$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA042140147$Preserve=no
    public boolean resetIterator( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA042140147$Preserve=yes

        try {
            return resetIterator(0);
        } catch (Throwable e) {System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);}
        return false;

//$Section=Operation$ID=3FA042140147$Preserve=no
    }

//$Section=OperationJavadoc$ID=40E17E3000CB$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40E17E3000CB$Preserve=no
    public boolean resetIterator( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40E17E3000CB$Preserve=yes

        try {
            popPropertyName();
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues(iPropertyName, false);
            if (lPropertyValues == null) return false;
            return lPropertyValues.resetIterator(aPropertyValue);
        } catch (Throwable e) {System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);}
        return false;

//$Section=Operation$ID=40E17E3000CB$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE6FE0268$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE6FE0268$Preserve=no
    public boolean previous( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FE6FE0268$Preserve=yes

        try {
            popPropertyName();
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues(iPropertyName, false);
            if (lPropertyValues == null) return false;
            return lPropertyValues.previous();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3F9FE6FE0268$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE7060364$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE7060364$Preserve=no
    public boolean next( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FE7060364$Preserve=yes

        try {
            popPropertyName();
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues(iPropertyName, false);
            if (lPropertyValues == null) return false;
            return lPropertyValues.next();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3F9FE7060364$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE797034E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE797034E$Preserve=no
    public boolean isFirst( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FE797034E$Preserve=yes

        try {
            popPropertyName();
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues(iPropertyName, false);
            if (lPropertyValues == null) return false;
            return lPropertyValues.isFirst();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3F9FE797034E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE79E02A4$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE79E02A4$Preserve=no
    public boolean isLast( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3F9FE79E02A4$Preserve=yes

        try {
            popPropertyName();
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues(iPropertyName, false);
            if (lPropertyValues == null) return false;
            return lPropertyValues.isLast();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3F9FE79E02A4$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA040E9033C$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA040E9033C$Preserve=no
    public int size( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA040E9033C$Preserve=yes

        try {
            popPropertyName();
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues(iPropertyName, false);
            if (lPropertyValues == null) return 0;
            return lPropertyValues.size();
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return 0;
                              }

//$Section=Operation$ID=3FA040E9033C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11DFD0074$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11DFD0074$Preserve=no
    public boolean scan( String aPropertyName, boolean aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11DFD0074$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11DFD0074$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11DFE0089$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11DFE0089$Preserve=no
    public boolean scan( String aPropertyName, byte aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11DFE0089$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11DFE0089$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11DFE01A1$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11DFE01A1$Preserve=no
    public boolean scan( String aPropertyName, short aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11DFE01A1$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11DFE01A1$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11DFE0288$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11DFE0288$Preserve=no
    public boolean scan( String aPropertyName, int aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11DFE0288$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11DFE0288$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11DFE035A$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11DFE035A$Preserve=no
    public boolean scan( String aPropertyName, long aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11DFE035A$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11DFE035A$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11DFF003A$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11DFF003A$Preserve=no
    public boolean scan( String aPropertyName, char aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11DFF003A$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11DFF003A$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11DFF00F9$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11DFF00F9$Preserve=no
    public boolean scan( String aPropertyName, float aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11DFF00F9$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11DFF00F9$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11DFF01C1$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11DFF01C1$Preserve=no
    public boolean scan( String aPropertyName, double aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11DFF01C1$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11DFF01C1$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11DFF027F$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11DFF027F$Preserve=no
    public boolean scan( String aPropertyName, Object aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11DFF027F$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11DFF027F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E070399$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E070399$Preserve=no
    public boolean scan( String aPropertyName, String aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E070399$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E070399$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB190CB02F5$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB190CB02F5$Preserve=no
    public boolean scan( String aPropertyName, Date aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB190CB02F5$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FB190CB02F5$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FC5E4EB015F$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FC5E4EB015F$Preserve=no
    public boolean scan( String aPropertyName, Time aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FC5E4EB015F$Preserve=yes

        try {
            popPropertyName();
            if (iPropertyName.length() == 0) return iSymbolTable.getPropertyCollection().scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
            PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection().getPropertyValue(iPropertyName, 0).getPropertyCollection();
            if (lPropertyCollection == null) return false;
            return lPropertyCollection.scanPropertyValue(aPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FC5E4EB015F$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B420005D$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B420005D$Preserve=no
    public boolean scan( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B420005D$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue());
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B420005D$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B420005F$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B420005F$Preserve=no
    public boolean scan( boolean aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B420005F$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B420005F$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B420006D$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B420006D$Preserve=no
    public boolean scan( byte aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B420006D$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B420006D$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B4200070$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B4200070$Preserve=no
    public boolean scan( short aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B4200070$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B4200070$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B4200073$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B4200073$Preserve=no
    public boolean scan( int aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B4200073$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B4200073$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B420007D$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B420007D$Preserve=no
    public boolean scan( long aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B420007D$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B420007D$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B4200080$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B4200080$Preserve=no
    public boolean scan( char aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B4200080$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B4200080$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B4200083$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B4200083$Preserve=no
    public boolean scan( float aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B4200083$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B4200083$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B420008C$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B420008C$Preserve=no
    public boolean scan( double aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B420008C$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B420008C$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B420008F$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B420008F$Preserve=no
    public boolean scan( Object aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B420008F$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B420008F$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B4200092$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B4200092$Preserve=no
    public boolean scan( String aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B4200092$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B4200092$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B420009C$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B420009C$Preserve=no
    public boolean scan( Date aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B420009C$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B420009C$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3B420009F$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3B420009F$Preserve=no
    public boolean scan( Time aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3B420009F$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.scan(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=40F3B420009F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E310281$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E310281$Preserve=no
    public boolean find( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E310281$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue());
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E310281$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E3E00B3$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E3E00B3$Preserve=no
    public boolean find( boolean aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E3E00B3$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E3E00B3$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E3E03C0$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E3E03C0$Preserve=no
    public boolean find( byte aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E3E03C0$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E3E03C0$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E3F0097$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E3F0097$Preserve=no
    public boolean find( short aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E3F0097$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E3F0097$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E3F0141$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E3F0141$Preserve=no
    public boolean find( int aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E3F0141$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E3F0141$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E3F01EB$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E3F01EB$Preserve=no
    public boolean find( long aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E3F01EB$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E3F01EB$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E3F0295$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E3F0295$Preserve=no
    public boolean find( char aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E3F0295$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E3F0295$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E3F0336$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E3F0336$Preserve=no
    public boolean find( float aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E3F0336$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E3F0336$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E3F03E0$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E3F03E0$Preserve=no
    public boolean find( double aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E3F03E0$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E3F03E0$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E40008E$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E40008E$Preserve=no
    public boolean find( Object aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E40008E$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E40008E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA11E400124$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA11E400124$Preserve=no
    public boolean find( String aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA11E400124$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FA11E400124$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB190CE0105$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB190CE0105$Preserve=no
    public boolean find( Date aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB190CE0105$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FB190CE0105$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FC5E4EE0376$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FC5E4EE0376$Preserve=no
    public boolean find( Time aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FC5E4EE0376$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.find(iPropertyName, new PropertyValue(aPropertyValue));
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return false;
                              }

//$Section=Operation$ID=3FC5E4EE0376$Preserve=no
    }

//$Section=OperationJavadoc$ID=4295F5ED0379$Preserve=yes
/**
 *
 * @param aPropertySort
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4295F5ED0379$Preserve=no
    public void sort( String aPropertySort ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=4295F5ED0379$Preserve=yes
        sort(aPropertySort, true);
//$Section=Operation$ID=4295F5ED0379$Preserve=no
    }

//$Section=OperationJavadoc$ID=42841E18008C$Preserve=yes
/**
 *
 * @param aPropertyRoot
 *
 * @param aPropertySort
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42841E18008C$Preserve=no
    public void sort( String aPropertySort, boolean aAscending ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=42841E18008C$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.sort(iPropertyName, aPropertySort, aAscending);
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                              }

//$Section=Operation$ID=42841E18008C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA168880218$Preserve=yes
/**
 *
 * @param aAliasName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA168880218$Preserve=no
    public void alias( String aAliasName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA168880218$Preserve=yes

        try {
            popPropertyName();
            iSymbolTable.getPropertyCollection().aliasProperty(aAliasName, iPropertyName);
        } catch (Throwable e) {System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FA168880218$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FD5137035B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FD5137035B$Preserve=no
    public int getIterator( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40FD5137035B$Preserve=yes

        try {
            popPropertyName();
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues(iPropertyName, false);
            if (lPropertyValues == null) return 0;
            return lPropertyValues.getIterator();
        } catch (Throwable e) {System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);}
        return 0;

//$Section=Operation$ID=40FD5137035B$Preserve=no
    }

//$Section=OperationJavadoc$ID=429259FD003E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=429259FD003E$Preserve=no
    public String getLocation( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=429259FD003E$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.getLocation(iPropertyName);
        } catch (Throwable e) {System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);}
        return "";

//$Section=Operation$ID=429259FD003E$Preserve=no
    }

//$Section=OperationJavadoc$ID=429340030229$Preserve=yes
/**
 *
 * @param aLocation
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=429340030229$Preserve=no
    public boolean setLocation( String aLocation ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=429340030229$Preserve=yes

        try {
            popPropertyName();
            return iSymbolTable.setLocation(iPropertyName, aLocation);
        } catch (Throwable e) {System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);}
        return false;

//$Section=Operation$ID=429340030229$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA18B2702A0$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA18B2702A0$Preserve=no
    public void loadScript( String aScriptName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA18B2702A0$Preserve=yes

        popPropertyName();
        iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(iScript.loadScript(aScriptName)));

//$Section=Operation$ID=3FA18B2702A0$Preserve=no
    }

//$Section=OperationJavadoc$ID=40E44C380157$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aContext
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40E44C380157$Preserve=no
    public void loadScript( String aScriptName, String aContext ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40E44C380157$Preserve=yes

        popPropertyName();
        iSymbolTable.getPropertyCollection().addPropertyValue(iPropertyName, new PropertyValue(iScript.loadScript(aScriptName, aContext)));

//$Section=Operation$ID=40E44C380157$Preserve=no
    }

//$Section=OperationJavadoc$ID=40E5C6E101A5$Preserve=yes
/**
 *
 * @param aMethodName
 *
 * @param aArguments
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40E5C6E101A5$Preserve=no
    public void execMethod( String aMethodName, Object[] aArguments ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40E5C6E101A5$Preserve=yes

        // Don't popPropertyName, because this will be done on the getValueObject call.
        iScript.execMethod(getValueObject(), aMethodName, aArguments);

//$Section=Operation$ID=40E5C6E101A5$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA783540009$Preserve=yes
/**
 *
 * @param aMethodName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA783540009$Preserve=no
    public void execMethod( String aMethodName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FA783540009$Preserve=yes

        // Don't popPropertyName, because this will be done on the getValueObject call.
        iScript.execMethod(getValueObject(), aMethodName);

//$Section=Operation$ID=3FA783540009$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB6354A02FE$Preserve=yes
/**
 *
 * @param aSchemaName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6354A02FE$Preserve=no
    public void assignSchema( String aSchemaName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=3FB6354A02FE$Preserve=yes

        try {
            popPropertyName();
            XmlSchemaElement lXmlSchemaElement = iSymbolTable.getXmlSchemaFactory().getXmlSchemaElement(aSchemaName);
            if (lXmlSchemaElement == null) {
//ERROR!!!
                return;
            }
            iSymbolTable.getPropertyCollection().assignSchema(iPropertyName, lXmlSchemaElement);
        } catch (Throwable e) {System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);}

//$Section=Operation$ID=3FB6354A02FE$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F3D8FD000F$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F3D8FD000F$Preserve=no
    public String getPropertyName( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=40F3D8FD000F$Preserve=yes

        try {
            popPropertyName();
            return iPropertyName;
        } catch (Throwable e) {
                                System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);
                                return null;
                              }

//$Section=Operation$ID=40F3D8FD000F$Preserve=no
    }

//$Section=OperationJavadoc$ID=4293E0E4034B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4293E0E4034B$Preserve=no
    public XmlSchemaElement getXmlSchemaElement( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyHelper.");
//$Section=Operation$ID=4293E0E4034B$Preserve=yes

        try {
            popPropertyName();
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues(iPropertyName, false);
            if (lPropertyValues == null) return null;
            return lPropertyValues.getXmlSchemaElement();
        } catch (Throwable e) {System.err.println("Exception in ()\nPropertyName = " + iPropertyName + "\n" + e);}
        return null;

//$Section=Operation$ID=4293E0E4034B$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Script
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FA3DEF3039C$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FA3DEF3039C$Preserve=no
    public Script getScript() {
//$Section=Attribute get$ID=3FA3DEF3039C$Preserve=no
        return iScript;
//$Section=Attribute get$ID=3FA3DEF3039C$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FA3DEF3039C$Preserve=no
/**
 * Set accessor method.
 *
 * @param Script the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FA3DEF3039C$Preserve=no
    public void setScript(Script aValue) {
//$Section=Attribute set$ID=3FA3DEF3039C$Preserve=no
        iScript = aValue;
//$Section=Attribute set$ID=3FA3DEF3039C$Preserve=no
    }
//----------------------------------------------------------------------------
// SymbolTable
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9FD04C0250$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9FD04C0250$Preserve=no
    public SymbolTable getSymbolTable() {
//$Section=Attribute get$ID=3F9FD04C0250$Preserve=no
        return iSymbolTable;
//$Section=Attribute get$ID=3F9FD04C0250$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9FD04C0250$Preserve=no
/**
 * Set accessor method.
 *
 * @param SymbolTable the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9FD04C0250$Preserve=no
    public void setSymbolTable(SymbolTable aValue) {
//$Section=Attribute set$ID=3F9FD04C0250$Preserve=no
        iSymbolTable = aValue;
//$Section=Attribute set$ID=3F9FD04C0250$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9FC59F0322$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9FC59F0322$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9FC59F0322$Preserve=no

//End of class---------------
}
