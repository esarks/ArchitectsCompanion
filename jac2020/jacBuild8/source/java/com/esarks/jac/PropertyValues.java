//$Section=License$ID=3F9C58C60125$Preserve=no

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

//  Generated at 2006.01.15 07:17:16.796 PM EST by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: PropertyValues.java

//$Section=ChangeLog$ID=3F9C58C60125$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9C58C60125$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;

//$Section=CustomDeclare$ID=3F9C58C60125$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3F9C58C60125$Preserve=no

//$Section=ClassJavadoc$ID=3F9C58C60125$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3F9C58C60125$Preserve=no
public class PropertyValues {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
    private String iName;
    private ArrayList iValues = new ArrayList(1);
    private int iLastAccessed = -1;
    private XmlSchemaElement iXmlSchemaElement;

//$Section=CustomClassDeclare$ID=3F9C58C60125$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9C58C60125$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9C58C60125$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9C58C60125$Preserve=no
    private PropertyValues() {
//$Section=DefaultConstructor$ID=3F9C58C60125$Preserve=yes
//$Section=DefaultConstructor$ID=3F9C58C60125$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9C58C60125$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9C58C60125$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9C58C60125$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3F9C58C60125$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9C58C60125$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9C58C60125$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9C58C60125$Preserve=yes

        if (iValues != null) {
            iValues = null;
        }
        iXmlSchemaElement = null;

//$Section=DefaultFreeResources$ID=3F9C58C60125$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3FACE33502A6$Preserve=yes
/**
 *
 * @param aName
 *
 */
//$Section=OperationJavadoc$ID=3FACE33502A6$Preserve=no
    public PropertyValues( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3FACE33502A6$Preserve=yes

        iName = aName;

//$Section=Operation$ID=3FACE33502A6$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C794000B2$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C794000B2$Preserve=no
    public PropertyValue set( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9C794000B2$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.set!iName=" + Log.toString(iName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        PropertyValue lPropertyValue = checkPropertyType(aPropertyValue);
        iValues.add(lPropertyValue);
        iLastAccessed = iValues.size();
        return lPropertyValue;

//$Section=Operation$ID=3F9C794000B2$Preserve=no
    }

//$Section=OperationJavadoc$ID=41266F06004E$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41266F06004E$Preserve=no
    public PropertyValue setPropertyValue( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=41266F06004E$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.set!iName=" + Log.toString(iName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

// This is a "hard" set of the PropertyValue so an entire tree can be inserted (moved from somewhere else).
// It bypasses the checkPropertyType, thus assuring the PropertyValue object passed in is the one getting set.
        iValues.add(aPropertyValue);
        iLastAccessed = iValues.size();
        return aPropertyValue;

//$Section=Operation$ID=41266F06004E$Preserve=no
    }

//$Section=OperationJavadoc$ID=4284A89403E4$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @param aAt
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4284A89403E4$Preserve=no
    public PropertyValue setPropertyValue( PropertyValue aPropertyValue, int aAt ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=4284A89403E4$Preserve=yes

        iValues.set(aAt-1, aPropertyValue);
        return aPropertyValue;

//$Section=Operation$ID=4284A89403E4$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C79640226$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C79640226$Preserve=no
    public PropertyValue reset( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9C79640226$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.reset!iName=" + Log.toString(iName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        iValues.clear();
        iLastAccessed = 0;
        return set(aPropertyValue);

//$Section=Operation$ID=3F9C79640226$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C7971021B$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C7971021B$Preserve=no
    public PropertyValue replace( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9C7971021B$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.replace!iName=" + Log.toString(iName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        int lIndex = iLastAccessed;
        if (lIndex < 1) lIndex = 1;
        if (lIndex > iValues.size()) lIndex=iValues.size();
        if (lIndex <= 0) {
            return set(aPropertyValue);
        }

        iLastAccessed = lIndex;
        PropertyValue lPropertyValue = checkPropertyType(aPropertyValue);
        PropertyValue lSetPropertyValue = (PropertyValue) iValues.get(iLastAccessed - 1);
        lSetPropertyValue.setValueObject(lPropertyValue.getValueObject());
        lSetPropertyValue.setValueType(lPropertyValue.getValueType());
//        iValues.set(iLastAccessed - 1, lPropertyValue);
        return lSetPropertyValue;

//$Section=Operation$ID=3F9C7971021B$Preserve=no
    }

//$Section=OperationJavadoc$ID=41266E2001F4$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41266E2001F4$Preserve=no
    public PropertyValue replacePropertyValue( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=41266E2001F4$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.replacePropertyValue!iName=" + Log.toString(iName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

// This is a "hard" replace of the PropertyValue, so that an entire tree of values can be moved.
// It bypasses the checkPropertyType, thus assuring the PropertyValue object passed in is the one getting set.
        int lIndex = iLastAccessed;
        if (lIndex < 1) lIndex = 1;
        if (lIndex > iValues.size()) lIndex=iValues.size();
        if (lIndex <= 0) {
            return set(aPropertyValue);
        }

        iLastAccessed = lIndex;
        iValues.set(iLastAccessed - 1, aPropertyValue);
        return aPropertyValue;

//$Section=Operation$ID=41266E2001F4$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C798002F9$Preserve=yes
/**
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C798002F9$Preserve=no
    public PropertyValue get( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9C798002F9$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.get!iName=" + Log.toString(iName) + "!aIndex=" + aIndex + "!");

        if (aIndex == 0) aIndex = iLastAccessed;
        if (aIndex < 1) aIndex = 1;
        if (aIndex > iValues.size()) aIndex=iValues.size();
        if (aIndex <= 0) {
            iLastAccessed = 0;
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.get!return null!");
            return null;
        }

        PropertyValue lPropertyValue = null;
        iLastAccessed = aIndex;
        lPropertyValue = (PropertyValue) iValues.get(aIndex - 1);
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.get!lPropertyValue=" + Log.toString(lPropertyValue) + "!");
        return lPropertyValue;

//$Section=Operation$ID=3F9C798002F9$Preserve=no
    }

//$Section=OperationJavadoc$ID=43CAE5D40251$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=43CAE5D40251$Preserve=no
    public void removePropertyValues( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=43CAE5D40251$Preserve=yes

        if (iValues.size() == 0) return;
        if (iLastAccessed <= 0) iLastAccessed = 1;
        PropertyValue lPropertyValue = (PropertyValue) iValues.get(iLastAccessed - 1);
        PropertyCollection lPropertyCollection = lPropertyValue.getPropertyCollection();
        lPropertyCollection.removePropertyValues(aPropertyName);

//$Section=Operation$ID=43CAE5D40251$Preserve=no
    }

//$Section=OperationJavadoc$ID=40E6D7B60196$Preserve=yes
/**
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40E6D7B60196$Preserve=no
    public void removeAt( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=40E6D7B60196$Preserve=yes

//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.removeAt!iName=" + Log.toString(iName) + "!aIndex=" + aIndex + "!");

        if (aIndex == 0) aIndex = iLastAccessed;

        if (aIndex <= 0) {
            return;
        }

        if (aIndex > iValues.size()) {
            return;
        }

        if (aIndex >= iLastAccessed) {
            iLastAccessed--;
            if (iLastAccessed < 0) iLastAccessed = 0;
        }

        iValues.remove(aIndex - 1);

//$Section=Operation$ID=40E6D7B60196$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C79E7003A$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C79E7003A$Preserve=no
    public void remove( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9C79E7003A$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.remove!iName=" + Log.toString(iName) + "!");

        iValues.clear();
        iLastAccessed = 0;

//$Section=Operation$ID=3F9C79E7003A$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C8C590351$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aAdd
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C8C590351$Preserve=no
    public PropertyValues getPropertyValues( String aPropertyName, boolean aAdd ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9C8C590351$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.getPropertyValues!iName=" + Log.toString(iName) + "!aPropertyName=" + Log.toString(aPropertyName) + "!aAdd=" + aAdd + "!iValues.size()=" + iValues.size() + "!iLastAccessed=" + iLastAccessed + "!");

        if (aPropertyName != null && (iValues.size() > 0 || (iValues.size() == 0 && aAdd == true))) {

            if (iValues.size() == 0) {
                // Create a new null property.  This will only happen if aAdd == true.
                set(new PropertyValue());
            }

            if (iLastAccessed <= 0) iLastAccessed = 1;

            PropertyValue lPropertyValue = (PropertyValue) iValues.get(iLastAccessed - 1);

//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Info PropertyValues.getPropertyValues!iLastAccessed=" + iLastAccessed + "!lPropertyValue=" + Log.toString(lPropertyValue) + "!");

            // If the lPropertyValue.getPropertyCollection() is null, then we can't proceed down the symbol name to find a value.
            // Thus, we'll have to return a null...
            // At this time, if we have an extends condition on the current symbol thus far, try to catch it...
            while (lPropertyValue.getPropertyCollection() == null && aAdd == false && lPropertyValue.getExtends() != null) {
//                if (iLog.test(iLogClass, Log._DEBUG))
//                    iLog.println(iLogClass, Log._DEBUG, "Info PropertyValues.getPropertyValues!while...!");
                lPropertyValue = lPropertyValue.getExtends();
            }
            // Test to see if we can call the lPropertyValue.getPropertyCollection() object for continued processing.
            // If there isn't one, and the aAdd is false, the we'll return a false (no symbol found).
            // There shouldn't be an extends on this lPropertyValue, as we would have already tested in the previous while...
            if (lPropertyValue.getPropertyCollection() == null && aAdd == false && lPropertyValue.getExtends() == null) {
//                if (iLog.test(iLogClass, Log._DEBUG))
//                    iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.getPropertyValues!1!return null!");
                return null;
            }
            // If the PropertyValue.getPropertyCollection() is null, but aAdd is true, then proceed to add a PropertyCollection.
            if (lPropertyValue.getPropertyCollection() == null && aAdd == true) {
                lPropertyValue.setPropertyCollection(new PropertyCollection());
            }
            // If here, we know we have a non-null PropertyCollection to continue processing the symbol...
            PropertyCollection lPropertyCollection = lPropertyValue.getPropertyCollection();
            // Call the PropertyCollection's getPropertyValues (back to this method - on another instance...)
            PropertyValues lPropertyValues = lPropertyCollection.getPropertyValues(aPropertyName, aAdd, this);
            // If the lPropetyValues returns null, and we currently have an extends active, then attempt to process on the extends.
            while (lPropertyValues == null && lPropertyValue.getExtends() != null && aAdd == false) {
                lPropertyValue = lPropertyValue.getExtends();
                lPropertyCollection = lPropertyValue.getPropertyCollection();
                // Can't go any further if the PropertyCollection is null...
                if (lPropertyCollection == null) {
//                    if (iLog.test(iLogClass, Log._DEBUG))
//                        iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.getPropertyValues!2!return null!");
                    return null;
                }
                lPropertyValues = lPropertyCollection.getPropertyValues(aPropertyName, aAdd, this);
                if (lPropertyValues == null && lPropertyValue.getExtends() == null) {
//                    if (iLog.test(iLogClass, Log._DEBUG))
//                        iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.getPropertyValues!3!return null!");
                    return null;
                }
                if (lPropertyValues != null) {
//                    if (iLog.test(iLogClass, Log._DEBUG))
//                        iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.getPropertyValues!4!lPropertyValues=" + Log.toString(lPropertyValues) + "!");
                    return lPropertyValues;
                }
            }
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.getPropertyValues!5!lPropertyValues=" + Log.toString(lPropertyValues) + "!");
            return lPropertyValues;
        }

        if (aPropertyName != null && iValues.size() == 0 && aAdd == false) {
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.getPropertyValues!6!return null!");
            return null;
        }

        // End of the symbol tree... return this for PropertyValues
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.getPropertyValues!7!this=" + Log.toString(this) + "!");
        return this;

//$Section=Operation$ID=3F9C8C590351$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE7CD0157$Preserve=yes
/**
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE7CD0157$Preserve=no
    public void resetIterator( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9FE7CD0157$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.resetIterator!iName=" + Log.toString(iName) + "!aIndex=" + aIndex + "!");

        if (aIndex <= 0) {
            iLastAccessed = 0;
            return;
        }
        iLastAccessed = aIndex;
        if (iLastAccessed > iValues.size()) iLastAccessed = iValues.size();

//$Section=Operation$ID=3F9FE7CD0157$Preserve=no
    }

//$Section=OperationJavadoc$ID=40E17C2C03D8$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40E17C2C03D8$Preserve=no
    public boolean resetIterator( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=40E17C2C03D8$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.resetIterator!iName=" + Log.toString(iName) + "!aPropertyValue=" + aPropertyValue.toString() + "!");

        PropertyValue lPropertyValue = null;
        for (iLastAccessed = 1; iLastAccessed <= iValues.size(); iLastAccessed++) {
            lPropertyValue = (PropertyValue) iValues.get(iLastAccessed - 1);
            if (lPropertyValue == aPropertyValue) {
//                if (iLog.test(iLogClass, Log._DEBUG))
//                    iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.resetIterator!return true!");
                return true;
            }
        }
        iLastAccessed = 0;
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.resetIterator!return false!");
        return false;

//$Section=Operation$ID=40E17C2C03D8$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE7CD0161$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE7CD0161$Preserve=no
    public boolean previous( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9FE7CD0161$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.previous!iName=" + Log.toString(iName) + "!");

        iLastAccessed--;
        if (iValues.size() == 0) {
            iLastAccessed = 0;
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.previous!return false!");
            return false;
        }
        if (iLastAccessed < 1) {
            iLastAccessed = 0;
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.previous!return false!");
            return false;
        }
//        if (iLog.test(iLogClass, Log._DEBUG))
//           iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.previous!return true!");
        return true;

//$Section=Operation$ID=3F9FE7CD0161$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE7CD016B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE7CD016B$Preserve=no
    public boolean next( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9FE7CD016B$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.next!iName=" + Log.toString(iName) + "!");

        iLastAccessed++;
        if (iLastAccessed > iValues.size()) {
            iLastAccessed = iValues.size();
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.next!return false!");
            return false;
        }
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.next!return true!");
        return true;

//$Section=Operation$ID=3F9FE7CD016B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE7CD0175$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE7CD0175$Preserve=no
    public boolean isFirst( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9FE7CD0175$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.isFirst!iName=" + Log.toString(iName) + "!");

        if (iValues.size() == 0) {
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.isFirst!return false!");
            return false;
        }
        if (iLastAccessed == 1) {
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.isFirst!return true!");
            return true;
        }
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.isFirst!return false!");
        return false;

//$Section=Operation$ID=3F9FE7CD0175$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9FE7CD017F$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9FE7CD017F$Preserve=no
    public boolean isLast( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3F9FE7CD017F$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.isLast!iName=" + Log.toString(iName) + "!");

        if (iValues.size() == 0) {
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.isLast!return false!");
            return false;
        }
        if (iLastAccessed == iValues.size()) {
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.isLast!return true!");
            return true;
        }
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.isLast!return false!");
        return false;

//$Section=Operation$ID=3F9FE7CD017F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA04102002B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA04102002B$Preserve=no
    public int size( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3FA04102002B$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter/Exit PropertyValues.size!iName=" + Log.toString(iName) + "!iValues.size=" + iValues.size() + "!");

        return iValues.size();

//$Section=Operation$ID=3FA04102002B$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FD500402CE$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FD500402CE$Preserve=no
    public int getIterator( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=40FD500402CE$Preserve=yes

        if (iLastAccessed > iValues.size()) {
            return iValues.size();
        }
        if (iLastAccessed < 0) return 0;
        return iLastAccessed;

//$Section=Operation$ID=40FD500402CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA068CA00E6$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA068CA00E6$Preserve=no
    public boolean findPropertyValue( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3FA068CA00E6$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.findPropertyValue!iName=" + Log.toString(iName) + "!aPropertyName=" + Log.toString(aPropertyName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        if (aPropertyName != null && iLastAccessed > 0) {
            PropertyValue lPropertyValue = (PropertyValue) iValues.get(iLastAccessed - 1);
            if (lPropertyValue.getPropertyCollection() == null) return false;
            PropertyCollection lPropertyCollection = lPropertyValue.getPropertyCollection();
            boolean lReturn=lPropertyCollection.findPropertyValue(aPropertyName, aPropertyValue);
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.findPropertyValue!lReturn=" + lReturn + "!");
            return lReturn;
        }

        PropertyValue lPropertyValue = null;

        for (iLastAccessed = 1; iLastAccessed <= iValues.size(); iLastAccessed++) {
            lPropertyValue = (PropertyValue) iValues.get(iLastAccessed - 1);
            if (lPropertyValue.compareTo(aPropertyValue) == 0) {
//                if (iLog.test(iLogClass, Log._DEBUG))
//                    iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.findPropertyValue!return true!");
                return true;
            }
        }

        iLastAccessed = iValues.size();
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.findPropertyValue!return false!");
        return false;

//$Section=Operation$ID=3FA068CA00E6$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB4F22101CC$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB4F22101CC$Preserve=no
    private PropertyValue checkPropertyType( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=3FB4F22101CC$Preserve=yes
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.checkPropertyType!iName=" + Log.toString(iName) + "!aPropertyValue=" + Log.toString(aPropertyValue) + "!");

        if (iXmlSchemaElement == null) {
//            if (iLog.test(iLogClass, Log._DEBUG))
//                iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.checkPropertyType!iName=" + Log.toString(iName) + "!iXmlSchemaElement is null, aPropertyValue requires no modification");
            return aPropertyValue;
        }

//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Info PropertyValues.checkPropertyType!iName=" + Log.toString(iName) + "!iXmlSchemaElement=" + Log.toString(iXmlSchemaElement) + "!");

        PropertyValue lReturn = iXmlSchemaElement.checkPropertyType(aPropertyValue);
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Exit PropertyValues.checkPropertyType!lReturn=" + Log.toString(lReturn) + "!");
        return lReturn;

//$Section=Operation$ID=3FB4F22101CC$Preserve=no
    }

//$Section=OperationJavadoc$ID=428419FF005D$Preserve=yes
/**
 *
 * @param aItem1
 *
 * @param aItem2
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=428419FF005D$Preserve=no
    public void swap( int aItem1, int aItem2 ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValues.");
//$Section=Operation$ID=428419FF005D$Preserve=yes

        if ((aItem1 < 1 || aItem1 > iValues.size()) ||
            (aItem2 < 1 || aItem2 > iValues.size()) ||
            (aItem1 == aItem2)) return;

        PropertyValue lPropertyValue1 = (PropertyValue) iValues.get(aItem1-1);
        PropertyValue lPropertyValue2 = (PropertyValue) iValues.get(aItem2-1);

        iValues.set(aItem1-1, lPropertyValue2);
        iValues.set(aItem2-1, lPropertyValue1);

//$Section=Operation$ID=428419FF005D$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C7923002E$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C7923002E$Preserve=no
    public String getName() {
//$Section=Attribute get$ID=3F9C7923002E$Preserve=no
        return iName;
//$Section=Attribute get$ID=3F9C7923002E$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C7923002E$Preserve=no
/**
 * Set accessor method.
 *
 * @param Name the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C7923002E$Preserve=no
    public void setName(String aValue) {
//$Section=Attribute set$ID=3F9C7923002E$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=3F9C7923002E$Preserve=no
    }
//----------------------------------------------------------------------------
// Values
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C79230042$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C79230042$Preserve=no
    private ArrayList getValues() {
//$Section=Attribute get$ID=3F9C79230042$Preserve=no
        return iValues;
//$Section=Attribute get$ID=3F9C79230042$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C79230042$Preserve=no
/**
 * Set accessor method.
 *
 * @param Values the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C79230042$Preserve=no
    private void setValues(ArrayList aValue) {
//$Section=Attribute set$ID=3F9C79230042$Preserve=no
        iValues = aValue;
//$Section=Attribute set$ID=3F9C79230042$Preserve=no
    }
//----------------------------------------------------------------------------
// LastAccessed
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C79230056$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C79230056$Preserve=no
    private int getLastAccessed() {
//$Section=Attribute get$ID=3F9C79230056$Preserve=no
        return iLastAccessed;
//$Section=Attribute get$ID=3F9C79230056$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C79230056$Preserve=no
/**
 * Set accessor method.
 *
 * @param LastAccessed the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C79230056$Preserve=no
    private void setLastAccessed(int aValue) {
//$Section=Attribute set$ID=3F9C79230056$Preserve=no
        iLastAccessed = aValue;
//$Section=Attribute set$ID=3F9C79230056$Preserve=no
    }
//----------------------------------------------------------------------------
// XmlSchemaElement
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FB4EF5F019E$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FB4EF5F019E$Preserve=no
    public XmlSchemaElement getXmlSchemaElement() {
//$Section=Attribute get$ID=3FB4EF5F019E$Preserve=no
        return iXmlSchemaElement;
//$Section=Attribute get$ID=3FB4EF5F019E$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FB4EF5F019E$Preserve=no
/**
 * Set accessor method.
 *
 * @param XmlSchemaElement the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FB4EF5F019E$Preserve=no
    public void setXmlSchemaElement(XmlSchemaElement aValue) {
//$Section=Attribute set$ID=3FB4EF5F019E$Preserve=no
        iXmlSchemaElement = aValue;
//$Section=Attribute set$ID=3FB4EF5F019E$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9C58C60125$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C58C60125$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C58C60125$Preserve=no

//End of class---------------
}
