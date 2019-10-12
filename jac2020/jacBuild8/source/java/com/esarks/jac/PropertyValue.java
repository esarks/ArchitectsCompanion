//$Section=License$ID=3F9C58CD0035$Preserve=no

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

//  Generated at 2005.05.26 08:38:58.626 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: PropertyValue.java

//$Section=ChangeLog$ID=3F9C58CD0035$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9C58CD0035$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.Date;
import java.sql.*;
import java.text.*;

//$Section=CustomDeclare$ID=3F9C58CD0035$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3F9C58CD0035$Preserve=no

//$Section=ClassJavadoc$ID=3F9C58CD0035$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3F9C58CD0035$Preserve=no
public class PropertyValue {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
    private Object iValueObject;
    private int iValueType;
    private int iTypeAllowed = -1;
    private String iValueClassName;
    private PropertyCollection iPropertyCollection;
    private PropertyValue iExtends;
    public final static int CONST_VALUE_TYPE_NULL = 0;
    public final static int CONST_VALUE_TYPE_BOOLEAN = 1;
    public final static int CONST_VALUE_TYPE_BYTE = 2;
    public final static int CONST_VALUE_TYPE_SHORT = 3;
    public final static int CONST_VALUE_TYPE_INT = 4;
    public final static int CONST_VALUE_TYPE_LONG = 5;
    public final static int CONST_VALUE_TYPE_CHAR = 6;
    public final static int CONST_VALUE_TYPE_FLOAT = 7;
    public final static int CONST_VALUE_TYPE_DOUBLE = 8;
    public final static int CONST_VALUE_TYPE_OBJECT = 9;
    public final static int CONST_VALUE_TYPE_STRING = 10;
    public final static int CONST_VALUE_TYPE_DATE = 11;
    public final static int CONST_VALUE_TYPE_TIME = 12;
    public final static int CONST_VALUE_TYPE_JEO = 13;
    public final static int CONST_VALUE_TYPE_TIMESTAMP = 14;

//$Section=CustomClassDeclare$ID=3F9C58CD0035$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9C58CD0035$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9C58CD0035$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9C58CD0035$Preserve=no
    public PropertyValue() {
//$Section=DefaultConstructor$ID=3F9C58CD0035$Preserve=yes

        iValueObject = null;
        iValueClassName = "null";
        iValueType = CONST_VALUE_TYPE_NULL;

//$Section=DefaultConstructor$ID=3F9C58CD0035$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9C58CD0035$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9C58CD0035$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9C58CD0035$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3F9C58CD0035$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9C58CD0035$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9C58CD0035$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9C58CD0035$Preserve=yes

        iValueObject = null;
        if (iPropertyCollection != null) {
            iPropertyCollection = null;
        }

//$Section=DefaultFreeResources$ID=3F9C58CD0035$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3F9C6DBB0184$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C6DBB0184$Preserve=no
    public PropertyValue( boolean aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6DBB0184$Preserve=yes

        iValueObject = new Boolean(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_BOOLEAN;

//$Section=Operation$ID=3F9C6DBB0184$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C6DE603AD$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C6DE603AD$Preserve=no
    public PropertyValue( byte aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6DE603AD$Preserve=yes

        iValueObject = new Byte(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_BYTE;

//$Section=Operation$ID=3F9C6DE603AD$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C6DE703B8$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C6DE703B8$Preserve=no
    public PropertyValue( short aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6DE703B8$Preserve=yes

        iValueObject = new Short(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_SHORT;

//$Section=Operation$ID=3F9C6DE703B8$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C6DE800B6$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C6DE800B6$Preserve=no
    public PropertyValue( int aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6DE800B6$Preserve=yes

        iValueObject = new Integer(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_INT;

//$Section=Operation$ID=3F9C6DE800B6$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C6DE801D9$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C6DE801D9$Preserve=no
    public PropertyValue( long aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6DE801D9$Preserve=yes

        iValueObject = new Long(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_LONG;

//$Section=Operation$ID=3F9C6DE801D9$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C6DE802C9$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C6DE802C9$Preserve=no
    public PropertyValue( char aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6DE802C9$Preserve=yes

        iValueObject = new Character(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_CHAR;

//$Section=Operation$ID=3F9C6DE802C9$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C6DE803CE$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C6DE803CE$Preserve=no
    public PropertyValue( float aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6DE803CE$Preserve=yes

        iValueObject = new Float(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_FLOAT;

//$Section=Operation$ID=3F9C6DE803CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C6DE900F4$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C6DE900F4$Preserve=no
    public PropertyValue( double aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6DE900F4$Preserve=yes

        iValueObject = new Double(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_DOUBLE;

//$Section=Operation$ID=3F9C6DE900F4$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C6DE90216$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C6DE90216$Preserve=no
    public PropertyValue( Object aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6DE90216$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_OBJECT;
        }

//$Section=Operation$ID=3F9C6DE90216$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C8A0C0264$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3F9C8A0C0264$Preserve=no
    public PropertyValue( String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C8A0C0264$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_STRING;
        }

//$Section=Operation$ID=3F9C8A0C0264$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB18FD5028F$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3FB18FD5028F$Preserve=no
    public PropertyValue( Date aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3FB18FD5028F$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_DATE;
        }
//$Section=Operation$ID=3FB18FD5028F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FC5E40002CA$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3FC5E40002CA$Preserve=no
    public PropertyValue( Time aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3FC5E40002CA$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_TIME;
        }
//$Section=Operation$ID=3FC5E40002CA$Preserve=no
    }

//$Section=OperationJavadoc$ID=4171C7CE01C5$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=4171C7CE01C5$Preserve=no
    public PropertyValue( Jeo aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=4171C7CE01C5$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_JEO;
        }
//$Section=Operation$ID=4171C7CE01C5$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A61E3E00CB$Preserve=yes
/**
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=41A61E3E00CB$Preserve=no
    public PropertyValue( Timestamp aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=41A61E3E00CB$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_TIMESTAMP;
        }
//$Section=Operation$ID=41A61E3E00CB$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB1C4C5033E$Preserve=yes
/**
 *
 * @param aClassName
 *
 * @param aValue
 *
 */
//$Section=OperationJavadoc$ID=3FB1C4C5033E$Preserve=no
    public PropertyValue( String aClassName, String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3FB1C4C5033E$Preserve=yes

            if (aClassName == null || aClassName.compareTo("null") == 0) {
                try {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("boolean") == 0) {
                try {
                    iValueObject = new Boolean(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_BOOLEAN;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("byte") == 0) {
                try {
                    iValueObject = new Byte(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_BYTE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("short") == 0) {
                try {
                    iValueObject = new Short(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_SHORT;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("int") == 0) {
                try {
                    iValueObject = new Integer(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_INT;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("long") == 0) {
                try {
                    iValueObject = new Long(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_LONG;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("char") == 0) {
                try {
                    iValueObject = new Character(aValue.charAt(0));
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_CHAR;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("float") == 0) {
                try {
                    iValueObject = new Float(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_FLOAT;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("double") == 0) {
                try {
                    iValueObject = new Double(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_DOUBLE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("string") == 0) {
                try {
                    iValueObject = aValue;
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_STRING;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("date") == 0) {
                try {
                    iValueObject = new SimpleDateFormat().parse(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_DATE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.startsWith("date:")) {
                try {
                    SimpleDateFormat lSdf = new SimpleDateFormat(aClassName.substring(5));
                    iValueObject = lSdf.parse(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_DATE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("time") == 0) {
                try {
                    iValueObject = Time.valueOf(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_TIME;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.startsWith("time:")) {
                try {
                    SimpleDateFormat lSdf = new SimpleDateFormat(aClassName.substring(5));
                    iValueObject = new Time(lSdf.parse(aValue).getTime());
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_DATE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("jeo") == 0) {
                try {
                    iValueObject = aValue;
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_JEO;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("timestamp") == 0) {
                try {
                    iValueObject = Timestamp.valueOf(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_TIME;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.startsWith("timestamp:")) {
                try {
                    SimpleDateFormat lSdf = new SimpleDateFormat(aClassName.substring(10));
                    iValueObject = new Timestamp(lSdf.parse(aValue).getTime());
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_DATE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else {
                try {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }

//$Section=Operation$ID=3FB1C4C5033E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C6FAD0130$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C6FAD0130$Preserve=no
    public String getValueClassName( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C6FAD0130$Preserve=yes

        return iValueClassName;

//$Section=Operation$ID=3F9C6FAD0130$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C87E7003E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C87E7003E$Preserve=no
    public boolean getValueBoolean( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C87E7003E$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_BOOLEAN) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return ((Boolean) iValueObject).booleanValue();

//$Section=Operation$ID=3F9C87E7003E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C87F9027E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C87F9027E$Preserve=no
    public byte getValueByte( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C87F9027E$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_BYTE) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return ((Byte) iValueObject).byteValue();

//$Section=Operation$ID=3F9C87F9027E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C87FA0398$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C87FA0398$Preserve=no
    public short getValueShort( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C87FA0398$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_SHORT) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return ((Short) iValueObject).shortValue();

//$Section=Operation$ID=3F9C87FA0398$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C87FB00F1$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C87FB00F1$Preserve=no
    public int getValueInt( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C87FB00F1$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_INT) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return ((Integer) iValueObject).intValue();

//$Section=Operation$ID=3F9C87FB00F1$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C87FB0231$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C87FB0231$Preserve=no
    public long getValueLong( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C87FB0231$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_LONG) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return ((Long) iValueObject).longValue();

//$Section=Operation$ID=3F9C87FB0231$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C87FB037C$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C87FB037C$Preserve=no
    public char getValueChar( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C87FB037C$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_CHAR) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return ((Character) iValueObject).charValue();

//$Section=Operation$ID=3F9C87FB037C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C87FC00D4$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C87FC00D4$Preserve=no
    public float getValueFloat( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C87FC00D4$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_FLOAT) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return ((Float) iValueObject).floatValue();

//$Section=Operation$ID=3F9C87FC00D4$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C87FC020A$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C87FC020A$Preserve=no
    public double getValueDouble( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C87FC020A$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_DOUBLE) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return ((Double) iValueObject).doubleValue();

//$Section=Operation$ID=3F9C87FC020A$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C87FC0373$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C87FC0373$Preserve=no
    public String getValueString( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9C87FC0373$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_STRING) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return (String) iValueObject;

//$Section=Operation$ID=3F9C87FC0373$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB18FDD031B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB18FDD031B$Preserve=no
    public java.util.Date getValueDate( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3FB18FDD031B$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_DATE) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return (Date) iValueObject;

//$Section=Operation$ID=3FB18FDD031B$Preserve=no
    }

//$Section=OperationJavadoc$ID=4206236A01C5$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4206236A01C5$Preserve=no
    public java.sql.Date getValueSqlDate( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=4206236A01C5$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_DATE) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return new java.sql.Date(((java.util.Date) iValueObject).getTime());

//$Section=Operation$ID=4206236A01C5$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FC5E41800BC$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FC5E41800BC$Preserve=no
    public Time getValueTime( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3FC5E41800BC$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_TIME) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return (Time) iValueObject;

//$Section=Operation$ID=3FC5E41800BC$Preserve=no
    }

//$Section=OperationJavadoc$ID=4171C77E03B9$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4171C77E03B9$Preserve=no
    public Jeo getValueJeo( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=4171C77E03B9$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_JEO) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return (Jeo) iValueObject;

//$Section=Operation$ID=4171C77E03B9$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A61E6703A9$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41A61E6703A9$Preserve=no
    public Timestamp getValueTimestamp( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=41A61E6703A9$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_TIMESTAMP) {
            throw new RuntimeException("PropertyValue invalid value type requested.");
        }
        return (Timestamp) iValueObject;

//$Section=Operation$ID=41A61E6703A9$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD0186$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD0186$Preserve=no
    public boolean getValueBoolean( boolean aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD0186$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_BOOLEAN) {
            return aDefaultValue;
        }
        return ((Boolean) iValueObject).booleanValue();

//$Section=Operation$ID=423B5ABD0186$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD0196$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD0196$Preserve=no
    public byte getValueByte( byte aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD0196$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_BYTE) {
            return aDefaultValue;
        }
        return ((Byte) iValueObject).byteValue();

//$Section=Operation$ID=423B5ABD0196$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD0197$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD0197$Preserve=no
    public short getValueShort( short aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD0197$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_SHORT) {
            return aDefaultValue;
        }
        return ((Short) iValueObject).shortValue();

//$Section=Operation$ID=423B5ABD0197$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01A5$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01A5$Preserve=no
    public int getValueInt( int aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01A5$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_INT) {
            return aDefaultValue;
        }
        return ((Integer) iValueObject).intValue();

//$Section=Operation$ID=423B5ABD01A5$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01B5$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01B5$Preserve=no
    public long getValueLong( long aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01B5$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_LONG) {
            return aDefaultValue;
        }
        return ((Long) iValueObject).longValue();

//$Section=Operation$ID=423B5ABD01B5$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01B6$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01B6$Preserve=no
    public char getValueChar( char aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01B6$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_CHAR) {
            return aDefaultValue;
        }
        return ((Character) iValueObject).charValue();

//$Section=Operation$ID=423B5ABD01B6$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01C5$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01C5$Preserve=no
    public float getValueFloat( float aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01C5$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_FLOAT) {
            return aDefaultValue;
        }
        return ((Float) iValueObject).floatValue();

//$Section=Operation$ID=423B5ABD01C5$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01C6$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01C6$Preserve=no
    public double getValueDouble( double aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01C6$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_DOUBLE) {
            return aDefaultValue;
        }
        return ((Double) iValueObject).doubleValue();

//$Section=Operation$ID=423B5ABD01C6$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01D4$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01D4$Preserve=no
    public String getValueString( String aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01D4$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_STRING) {
            return aDefaultValue;
        }
        return (String) iValueObject;

//$Section=Operation$ID=423B5ABD01D4$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01E4$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01E4$Preserve=no
    public java.util.Date getValueDate( java.util.Date aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01E4$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_DATE) {
            return aDefaultValue;
        }
        return (Date) iValueObject;

//$Section=Operation$ID=423B5ABD01E4$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01E5$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01E5$Preserve=no
    public java.sql.Date getValueSqlDate( java.sql.Date aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01E5$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_DATE) {
            return aDefaultValue;
        }
        return new java.sql.Date(((java.util.Date) iValueObject).getTime());

//$Section=Operation$ID=423B5ABD01E5$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01F4$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01F4$Preserve=no
    public Time getValueTime( Time aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01F4$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_TIME) {
            return aDefaultValue;
        }
        return (Time) iValueObject;

//$Section=Operation$ID=423B5ABD01F4$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD01F5$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD01F5$Preserve=no
    public Jeo getValueJeo( Jeo aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD01F5$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_JEO) {
            return aDefaultValue;
        }
        return (Jeo) iValueObject;

//$Section=Operation$ID=423B5ABD01F5$Preserve=no
    }

//$Section=OperationJavadoc$ID=423B5ABD0203$Preserve=yes
/**
 *
 * @param aDefaultValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=423B5ABD0203$Preserve=no
    public Timestamp getValueTimestamp( Timestamp aDefaultValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=423B5ABD0203$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_TIMESTAMP) {
            return aDefaultValue;
        }
        return (Timestamp) iValueObject;

//$Section=Operation$ID=423B5ABD0203$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9F6665000F$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9F6665000F$Preserve=no
    public String toString( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3F9F6665000F$Preserve=yes

        switch(iValueType) {

            case CONST_VALUE_TYPE_NULL:
                return "";
            case CONST_VALUE_TYPE_BOOLEAN:
                return ((Boolean) iValueObject).toString();
            case CONST_VALUE_TYPE_BYTE:
                return ((Byte) iValueObject).toString();
            case CONST_VALUE_TYPE_SHORT:
                return ((Short) iValueObject).toString();
            case CONST_VALUE_TYPE_INT:
                return ((Integer) iValueObject).toString();
            case CONST_VALUE_TYPE_LONG:
                return ((Long) iValueObject).toString();
            case CONST_VALUE_TYPE_CHAR:
                return ((Character) iValueObject).toString();
            case CONST_VALUE_TYPE_FLOAT:
                return ((Float) iValueObject).toString();
            case CONST_VALUE_TYPE_DOUBLE:
                return ((Double) iValueObject).toString();
            case CONST_VALUE_TYPE_OBJECT:
                return iValueObject.toString();
//                return iValueObject.getClass().getName();
            case CONST_VALUE_TYPE_STRING:
                return (String) iValueObject;
            case CONST_VALUE_TYPE_DATE:
                return ((Date) iValueObject).toString();
            case CONST_VALUE_TYPE_TIME:
                return ((Time) iValueObject).toString();
            case CONST_VALUE_TYPE_JEO:
                return ((Jeo) iValueObject).getInstanceName();
            case CONST_VALUE_TYPE_TIMESTAMP:
                return ((Timestamp) iValueObject).toString();
        }

        throw new RuntimeException("PropertyValue invalid value type requested.");

//$Section=Operation$ID=3F9F6665000F$Preserve=no
    }

//$Section=OperationJavadoc$ID=4178894402BF$Preserve=yes
/**
 *
 * @param aFormat
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4178894402BF$Preserve=no
    public String toDateString( String aFormat ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=4178894402BF$Preserve=yes

        if (iValueType != CONST_VALUE_TYPE_DATE) {
          String lValue = toString();
          if (lValue.length() == 0) return "";
          if (lValue.length() > 10) lValue = lValue.substring(0,10);
          Date lDate = java.sql.Date.valueOf(lValue);
          SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat(aFormat);
          return lSimpleDateFormat.format(lDate);
        }

//        String lValue = toString();
//        if (lValue.length() == 0) return "";
//        if (lValue.length() > 10) lValue = lValue.substring(0,10);
//        Date lDate = java.sql.Date.valueOf(lValue);

//        ParsePosition lParsePosition = new ParsePosition(0);
//        DateFormat lDateFormat = DateFormat.getDateInstance();
//        lDateFormat.setLenient(false);
//        Date lDate = null;
//        lDate = lDateFormat.parse(lValue, lParsePosition);
//        if (lDate == null) return "";

        SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat(aFormat);
        return lSimpleDateFormat.format((Date) iValueObject);

//$Section=Operation$ID=4178894402BF$Preserve=no
    }

//$Section=OperationJavadoc$ID=41788B080186$Preserve=yes
/**
 *
 * @param aFormat
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41788B080186$Preserve=no
    public String toFormattedString( String aFormat ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=41788B080186$Preserve=yes
        return toString();
//$Section=Operation$ID=41788B080186$Preserve=no
    }

//$Section=OperationJavadoc$ID=4295C2FD0244$Preserve=yes
/**
 *
 * @param aFormat
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4295C2FD0244$Preserve=no
    public String toSortableString( int aPad ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=4295C2FD0244$Preserve=yes
        return toString();
//$Section=Operation$ID=4295C2FD0244$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA126940347$Preserve=yes
/**
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA126940347$Preserve=no
    public int compareTo( PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3FA126940347$Preserve=yes

        if (getValueType() != aPropertyValue.getValueType()) {
            if (getValueType() == CONST_VALUE_TYPE_NULL) return -1;
            if (aPropertyValue.getValueType() == CONST_VALUE_TYPE_NULL) return 1;
            throw new RuntimeException("PropertyValue inconsistent value types in compareTo().");
        }

        switch(iValueType) {

            case CONST_VALUE_TYPE_NULL:
                return 0;
            case CONST_VALUE_TYPE_BOOLEAN:
                if (((Boolean) iValueObject).booleanValue() == ((Boolean) aPropertyValue.getValueObject()).booleanValue()) return 0;
                return -1;
            case CONST_VALUE_TYPE_BYTE:
                return ((Byte) iValueObject).compareTo((Byte) aPropertyValue.getValueObject());
            case CONST_VALUE_TYPE_SHORT:
                return ((Short) iValueObject).compareTo((Short) aPropertyValue.getValueObject());
            case CONST_VALUE_TYPE_INT:
                return ((Integer) iValueObject).compareTo((Integer) aPropertyValue.getValueObject());
            case CONST_VALUE_TYPE_LONG:
                return ((Long) iValueObject).compareTo((Long) aPropertyValue.getValueObject());
            case CONST_VALUE_TYPE_CHAR:
                return ((Character) iValueObject).compareTo((Character) aPropertyValue.getValueObject());
            case CONST_VALUE_TYPE_FLOAT:
                return ((Float) iValueObject).compareTo((Float) aPropertyValue.getValueObject());
            case CONST_VALUE_TYPE_DOUBLE:
                return ((Double) iValueObject).compareTo((Double) aPropertyValue.getValueObject());
            case CONST_VALUE_TYPE_OBJECT:
                throw new RuntimeException("PropertyValue compareTo() on Object not allowed.");
            case CONST_VALUE_TYPE_STRING:
                return ((String) iValueObject).compareTo((String) aPropertyValue.getValueObject());
            case CONST_VALUE_TYPE_DATE:
                return ((Date) iValueObject).compareTo((Date) aPropertyValue.getValueObject());
            case CONST_VALUE_TYPE_TIME:
                return ((Time) iValueObject).toString().compareTo(((Time) aPropertyValue.getValueObject()).toString());
            case CONST_VALUE_TYPE_JEO:
                throw new RuntimeException("PropertyValue compareTo() on Jeo not allowed.");
            case CONST_VALUE_TYPE_TIMESTAMP:
                return ((Timestamp) iValueObject).toString().compareTo(((Timestamp) aPropertyValue.getValueObject()).toString());
        }
        throw new RuntimeException("PropertyValue invalid value type requested.");

//$Section=Operation$ID=3FA126940347$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB1CC6E01F4$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB1CC6E01F4$Preserve=no
    public String getType( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3FB1CC6E01F4$Preserve=yes

        switch(iValueType) {

            case CONST_VALUE_TYPE_NULL:
                return "null";
            case CONST_VALUE_TYPE_BOOLEAN:
                return "boolean";
            case CONST_VALUE_TYPE_BYTE:
                return "byte";
            case CONST_VALUE_TYPE_SHORT:
                return "short";
            case CONST_VALUE_TYPE_INT:
                return "int";
            case CONST_VALUE_TYPE_LONG:
                return "long";
            case CONST_VALUE_TYPE_CHAR:
                return "char";
            case CONST_VALUE_TYPE_FLOAT:
                return "float";
            case CONST_VALUE_TYPE_DOUBLE:
                return "double";
            case CONST_VALUE_TYPE_OBJECT:
                return "object";
            case CONST_VALUE_TYPE_STRING:
                return "string";
            case CONST_VALUE_TYPE_DATE:
                return "date";
            case CONST_VALUE_TYPE_TIME:
                return "time";
            case CONST_VALUE_TYPE_JEO:
                return "jeo";
            case CONST_VALUE_TYPE_TIMESTAMP:
                return "timestamp";
        }
        return "unknown";

//$Section=Operation$ID=3FB1CC6E01F4$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB89D6A0316$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB89D6A0316$Preserve=no
    public String log( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=3FB89D6A0316$Preserve=yes

        if (iExtends != null) {
            return "PropertyValue( " + getType() + ", \"" + toString() + "\" ), extends=" + iExtends.log();
        } else {
            return "PropertyValue( " + getType() + ", \"" + toString() + "\" )";
        }

//$Section=Operation$ID=3FB89D6A0316$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B4038A$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B4038A$Preserve=no
    public void reset( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B4038A$Preserve=yes

        iValueObject = null;
        iValueClassName = "null";
        iValueType = CONST_VALUE_TYPE_NULL;

//$Section=Operation$ID=40FE84B4038A$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B40399$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B40399$Preserve=no
    public void reset( boolean aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B40399$Preserve=yes

        if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_BOOLEAN) {
            throw new RuntimeException("Value type not allowed.");
        }
        iValueObject = new Boolean(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_BOOLEAN;

//$Section=Operation$ID=40FE84B40399$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B4039B$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B4039B$Preserve=no
    public void reset( byte aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B4039B$Preserve=yes

        if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_BYTE) {
            throw new RuntimeException("Value type not allowed.");
        }
        iValueObject = new Byte(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_BYTE;

//$Section=Operation$ID=40FE84B4039B$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B403A9$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B403A9$Preserve=no
    public void reset( short aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B403A9$Preserve=yes

        if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_SHORT) {
            throw new RuntimeException("Value type not allowed.");
        }
        iValueObject = new Short(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_SHORT;

//$Section=Operation$ID=40FE84B403A9$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B403AB$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B403AB$Preserve=no
    public void reset( int aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B403AB$Preserve=yes

        if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_INT) {
            throw new RuntimeException("Value type not allowed.");
        }
        iValueObject = new Integer(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_INT;

//$Section=Operation$ID=40FE84B403AB$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B403B9$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B403B9$Preserve=no
    public void reset( long aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B403B9$Preserve=yes

        if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_LONG) {
            throw new RuntimeException("Value type not allowed.");
        }
        iValueObject = new Long(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_LONG;

//$Section=Operation$ID=40FE84B403B9$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B403BB$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B403BB$Preserve=no
    public void reset( char aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B403BB$Preserve=yes

        if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_CHAR) {
            throw new RuntimeException("Value type not allowed.");
        }
        iValueObject = new Character(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_CHAR;

//$Section=Operation$ID=40FE84B403BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B403C8$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B403C8$Preserve=no
    public void reset( float aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B403C8$Preserve=yes

        if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_FLOAT) {
            throw new RuntimeException("Value type not allowed.");
        }
        iValueObject = new Float(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_FLOAT;

//$Section=Operation$ID=40FE84B403C8$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B403CA$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B403CA$Preserve=no
    public void reset( double aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B403CA$Preserve=yes

        if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_DOUBLE) {
            throw new RuntimeException("Value type not allowed.");
        }
        iValueObject = new Double(aValue);
        iValueClassName = iValueObject.getClass().getName();
        iValueType = CONST_VALUE_TYPE_DOUBLE;

//$Section=Operation$ID=40FE84B403CA$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B403D8$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B403D8$Preserve=no
    public void reset( Object aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B403D8$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_OBJECT) {
                throw new RuntimeException("Value type not allowed.");
            }
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_OBJECT;
        }

//$Section=Operation$ID=40FE84B403D8$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B403DA$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B403DA$Preserve=no
    public void reset( String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B403DA$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_STRING) {
                throw new RuntimeException("Value type not allowed.");
            }
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_STRING;
        }

//$Section=Operation$ID=40FE84B403DA$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B403DC$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B403DC$Preserve=no
    public void reset( Date aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B403DC$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_DATE) {
                throw new RuntimeException("Value type not allowed.");
            }
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_DATE;
        }

//$Section=Operation$ID=40FE84B403DC$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FE84B50000$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FE84B50000$Preserve=no
    public void reset( Time aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=40FE84B50000$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_TIME) {
                throw new RuntimeException("Value type not allowed.");
            }
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_TIME;
        }

//$Section=Operation$ID=40FE84B50000$Preserve=no
    }

//$Section=OperationJavadoc$ID=4171C7EB0251$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4171C7EB0251$Preserve=no
    public void reset( Jeo aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=4171C7EB0251$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_JEO) {
                throw new RuntimeException("Value type not allowed.");
            }
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_JEO;
        }

//$Section=Operation$ID=4171C7EB0251$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A61EBE0251$Preserve=yes
/**
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41A61EBE0251$Preserve=no
    public void reset( Timestamp aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=41A61EBE0251$Preserve=yes

        if (aValue == null) {
            iValueObject = null;
            iValueClassName = "null";
            iValueType = CONST_VALUE_TYPE_NULL;
        } else {
            if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_TIMESTAMP) {
                throw new RuntimeException("Value type not allowed.");
            }
            iValueObject = aValue;
            iValueClassName = iValueObject.getClass().getName();
            iValueType = CONST_VALUE_TYPE_TIMESTAMP;
        }

//$Section=Operation$ID=41A61EBE0251$Preserve=no
    }

//$Section=OperationJavadoc$ID=419C868402CE$Preserve=yes
/**
 *
 * @param aClassName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419C868402CE$Preserve=no
    public void reset( String aClassName, String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PropertyValue.");
//$Section=Operation$ID=419C868402CE$Preserve=yes

            if (aClassName == null || aClassName.compareTo("null") == 0) {
                try {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("boolean") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_BOOLEAN) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new Boolean(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_BOOLEAN;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("byte") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_BYTE) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new Byte(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_BYTE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("short") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_SHORT) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new Short(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_SHORT;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("int") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_INT) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new Integer(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_INT;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("long") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_LONG) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new Long(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_LONG;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("char") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_CHAR) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new Character(aValue.charAt(0));
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_CHAR;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("float") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_FLOAT) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new Float(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_FLOAT;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("double") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_DOUBLE) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new Double(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_DOUBLE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("string") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_STRING) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = aValue;
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_STRING;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("date") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_DATE) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new SimpleDateFormat().parse(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_DATE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.startsWith("date:")) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_DATE) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    SimpleDateFormat lSdf = new SimpleDateFormat(aClassName.substring(5));
                    iValueObject = lSdf.parse(aValue);
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_DATE;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("time") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_TIME) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new java.sql.Time((new SimpleDateFormat().parse(aValue)).getTime());
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_TIME;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.startsWith("time:")) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_TIME) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    SimpleDateFormat lSdf = new SimpleDateFormat(aClassName.substring(5));
                    iValueObject = new java.sql.Time((lSdf.parse(aValue)).getTime());
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_TIME;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("jeo") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_JEO) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = aValue;
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_JEO;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.compareTo("timestamp") == 0) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_TIMESTAMP) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    iValueObject = new java.sql.Timestamp((new SimpleDateFormat().parse(aValue)).getTime());
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_TIMESTAMP;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else if (aClassName.startsWith("timestamp:")) {
                try {
                    if (iTypeAllowed != -1 && iTypeAllowed != CONST_VALUE_TYPE_TIMESTAMP) {
                        throw new RuntimeException("Value type not allowed.");
                    }
                    SimpleDateFormat lSdf = new SimpleDateFormat(aClassName.substring(10));
                    iValueObject = new java.sql.Timestamp((lSdf.parse(aValue)).getTime());
                    iValueClassName = iValueObject.getClass().getName();
                    iValueType = CONST_VALUE_TYPE_TIMESTAMP;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }
            else {
                try {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                } catch (Exception e) {
                    iValueObject = null;
                    iValueClassName = "null";
                    iValueType = CONST_VALUE_TYPE_NULL;
                    return;
                }
            }

//$Section=Operation$ID=419C868402CE$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// ValueObject
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C5A1E0026$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C5A1E0026$Preserve=no
    public Object getValueObject() {
//$Section=Attribute get$ID=3F9C5A1E0026$Preserve=no
        return iValueObject;
//$Section=Attribute get$ID=3F9C5A1E0026$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C5A1E0026$Preserve=no
/**
 * Set accessor method.
 *
 * @param ValueObject the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C5A1E0026$Preserve=no
    public void setValueObject(Object aValue) {
//$Section=Attribute set$ID=3F9C5A1E0026$Preserve=no
        iValueObject = aValue;
//$Section=Attribute set$ID=3F9C5A1E0026$Preserve=no
    }
//----------------------------------------------------------------------------
// ValueType
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C5A2F0142$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C5A2F0142$Preserve=no
    public int getValueType() {
//$Section=Attribute get$ID=3F9C5A2F0142$Preserve=no
        return iValueType;
//$Section=Attribute get$ID=3F9C5A2F0142$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C5A2F0142$Preserve=no
/**
 * Set accessor method.
 *
 * @param ValueType the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C5A2F0142$Preserve=no
    public void setValueType(int aValue) {
//$Section=Attribute set$ID=3F9C5A2F0142$Preserve=no
        iValueType = aValue;
//$Section=Attribute set$ID=3F9C5A2F0142$Preserve=no
    }
//----------------------------------------------------------------------------
// TypeAllowed
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4249C72B037A$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4249C72B037A$Preserve=no
    public int getTypeAllowed() {
//$Section=Attribute get$ID=4249C72B037A$Preserve=no
        return iTypeAllowed;
//$Section=Attribute get$ID=4249C72B037A$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4249C72B037A$Preserve=no
/**
 * Set accessor method.
 *
 * @param TypeAllowed the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4249C72B037A$Preserve=no
    public void setTypeAllowed(int aValue) {
//$Section=Attribute set$ID=4249C72B037A$Preserve=no
        iTypeAllowed = aValue;
//$Section=Attribute set$ID=4249C72B037A$Preserve=no
    }
//----------------------------------------------------------------------------
// PropertyCollection
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9C5A450176$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9C5A450176$Preserve=no
    public PropertyCollection getPropertyCollection() {
//$Section=Attribute get$ID=3F9C5A450176$Preserve=no
        return iPropertyCollection;
//$Section=Attribute get$ID=3F9C5A450176$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9C5A450176$Preserve=no
/**
 * Set accessor method.
 *
 * @param PropertyCollection the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9C5A450176$Preserve=no
    public void setPropertyCollection(PropertyCollection aValue) {
//$Section=Attribute set$ID=3F9C5A450176$Preserve=no
        iPropertyCollection = aValue;
//$Section=Attribute set$ID=3F9C5A450176$Preserve=no
    }
//----------------------------------------------------------------------------
// Extends
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FC00C48032C$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FC00C48032C$Preserve=no
    public PropertyValue getExtends() {
//$Section=Attribute get$ID=3FC00C48032C$Preserve=no
        return iExtends;
//$Section=Attribute get$ID=3FC00C48032C$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FC00C48032C$Preserve=no
/**
 * Set accessor method.
 *
 * @param Extends the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FC00C48032C$Preserve=no
    public void setExtends(PropertyValue aValue) {
//$Section=Attribute set$ID=3FC00C48032C$Preserve=no
        iExtends = aValue;
//$Section=Attribute set$ID=3FC00C48032C$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9C58CD0035$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C58CD0035$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C58CD0035$Preserve=no

//End of class---------------
}
