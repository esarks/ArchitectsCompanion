//$Section=License$ID=3FB6C97701E9$Preserve=no

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

//  Generated at 2005.06.12 08:56:57.484 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Log.java

//$Section=ChangeLog$ID=3FB6C97701E9$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3FB6C97701E9$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;

//$Section=CustomDeclare$ID=3FB6C97701E9$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3FB6C97701E9$Preserve=no

//$Section=ClassJavadoc$ID=3FB6C97701E9$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3FB6C97701E9$Preserve=no
public class Log {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private static Log iInstance;
    private OutputManager iOutputManager;
    public final static byte _EXCEPTION = 1;
    public final static byte _ERR = 2;
    public final static byte _INFO = 3;
    public final static byte _APP = 4;
    public final static byte _DEBUG = 5;
    private byte iCurrentLogLevel;
    private int iCurrentClass;
    private static Map iLogList;
    private long iStartTime;
    private long iStopTime;

//$Section=CustomClassDeclare$ID=3FB6C97701E9$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3FB6C97701E9$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3FB6C97701E9$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3FB6C97701E9$Preserve=no
    private Log() {
//$Section=DefaultConstructor$ID=3FB6C97701E9$Preserve=yes
//$Section=DefaultConstructor$ID=3FB6C97701E9$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3FB6C97701E9$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3FB6C97701E9$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3FB6C97701E9$Preserve=yes
        freeResources();
//$Section=DefaultDestructor$ID=3FB6C97701E9$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3FB6C97701E9$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3FB6C97701E9$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3FB6C97701E9$Preserve=yes
        iOutputManager = null;
//$Section=DefaultFreeResources$ID=3FB6C97701E9$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3FB6C9C50047$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6C9C50047$Preserve=no
    public synchronized static Log getInstance( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB6C9C50047$Preserve=yes

        if (iInstance == null) iInstance=new Log();
        return iInstance;

//$Section=Operation$ID=3FB6C9C50047$Preserve=no
    }

//$Section=OperationJavadoc$ID=41DEB7330148$Preserve=yes
/**
 *
 * @param aLogType
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41DEB7330148$Preserve=no
    public synchronized static Log getInstance( String aLogType ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=41DEB7330148$Preserve=yes

        if (iLogList == null) iLogList = new TreeMap();

        if (iLogList.containsKey(aLogType) == true) {
            return (Log) iLogList.get(aLogType);
        } else {
            Log lInstance = new Log();
            iLogList.put(aLogType, lInstance);
//            if (!aLogType.equals("debugLog")) {
//              if (iLogList.containsKey("debugLog") == true) {
//                Log lInstance = (Log) iLogList.get("debugLog");
//                iInstance.iCurrentLogLevel = lInstance.iCurrentLogLevel;
//                iInstance.iCurrentClass = lInstance.iCurrentClass;
//                iInstance.iOutputManager = lInstance.iOutputManager;
//        }
//            }
            return lInstance;
        }

//$Section=Operation$ID=41DEB7330148$Preserve=no
    }

//$Section=OperationJavadoc$ID=42581FAD02CE$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42581FAD02CE$Preserve=no
    public synchronized static void destroyInstance( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=42581FAD02CE$Preserve=yes
        iInstance = null;
        if (iLogList != null) iLogList.clear();
        iLogList = null;
//$Section=Operation$ID=42581FAD02CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=42AC30AC009C$Preserve=yes
/**
 *
 * @param aInstance
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42AC30AC009C$Preserve=no
    public synchronized static void destroyInstance( Log aInstance ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=42AC30AC009C$Preserve=yes

        if (iLogList.containsValue(aInstance)) {
            aInstance.close();
            iLogList.remove(aInstance);
        }
        
//$Section=Operation$ID=42AC30AC009C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB6CA22011D$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6CA22011D$Preserve=no
    public synchronized void open( String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB6CA22011D$Preserve=yes

        if (iOutputManager == null) iOutputManager = new OutputManager();
        iOutputManager.closeDebugFile();
        iOutputManager.openDebugFile(aFileName, false);
        println(_INFO, "Open log file.");

//$Section=Operation$ID=3FB6CA22011D$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB6CA37014F$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6CA37014F$Preserve=no
    public synchronized void close( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB6CA37014F$Preserve=yes

        if (iOutputManager == null) return;
        iOutputManager.closeDebugFile();
        iOutputManager.freeResources();
        iOutputManager = null;

//$Section=Operation$ID=3FB6CA37014F$Preserve=no
    }

//$Section=OperationJavadoc$ID=41DEF8D4009C$Preserve=yes
/**
 *
 * @param aLogLevel
 *
 * @param aLine
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41DEF8D4009C$Preserve=no
    public synchronized void println( byte aLogLevel, String aLine ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=41DEF8D4009C$Preserve=yes

        println(iCurrentClass, aLogLevel, aLine);

//$Section=Operation$ID=41DEF8D4009C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB6C9EE0353$Preserve=yes
/**
 *
 * @param aClass
 *
 * @param aLogLevel
 *
 * @param aLine
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6C9EE0353$Preserve=no
    public synchronized void println( int aClass, byte aLogLevel, String aLine ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB6C9EE0353$Preserve=yes

        if (iOutputManager == null) return;
        if (test(aClass, aLogLevel)) {
            java.util.Date lDate = new Date();
            if (iStartTime == 0) {
                iOutputManager.debugPrintln(lDate.toString() + ": Start", true);
                iStartTime = lDate.getTime();
            }
            iOutputManager.debugPrintln(Long.toString(lDate.getTime() - iStartTime) + ": " + aLine, true);
        }

//$Section=Operation$ID=3FB6C9EE0353$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB832380112$Preserve=yes
/**
 *
 * @param aLogLevel
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB832380112$Preserve=no
    public synchronized void setLogLevel( byte aLogLevel ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB832380112$Preserve=yes

        iCurrentLogLevel = aLogLevel;

//$Section=Operation$ID=3FB832380112$Preserve=no
    }

//$Section=OperationJavadoc$ID=41DF0ED001E4$Preserve=yes
/**
 *
 * @param aClass
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41DF0ED001E4$Preserve=no
    public synchronized void setClass( int aClass ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=41DF0ED001E4$Preserve=yes

        iCurrentClass = aClass;

//$Section=Operation$ID=41DF0ED001E4$Preserve=no
    }

//$Section=OperationJavadoc$ID=41DEF8BB0157$Preserve=yes
/**
 *
 * @param aLogLevel
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41DEF8BB0157$Preserve=no
    public synchronized boolean test( byte aLogLevel ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=41DEF8BB0157$Preserve=yes

        return test(iCurrentClass, aLogLevel);

//$Section=Operation$ID=41DEF8BB0157$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB8325102BD$Preserve=yes
/**
 *
 * @param aLogClass
 *
 * @param aLogLevel
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB8325102BD$Preserve=no
    public synchronized boolean test( int aLogClass, byte aLogLevel ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB8325102BD$Preserve=yes

        if ((aLogClass & iCurrentClass) == 0) return false;
        if (aLogLevel <= iCurrentLogLevel) return true;
        return false;

//$Section=Operation$ID=3FB8325102BD$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB6E4550171$Preserve=yes
/**
 *
 * @param aString
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6E4550171$Preserve=no
    public synchronized static String toString( String aString ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB6E4550171$Preserve=yes

        if (aString == null) return "(null)";
        return "\"" + aString + "\"";

//$Section=Operation$ID=3FB6E4550171$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB6E51202C8$Preserve=yes
/**
 *
 * @param aObject
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6E51202C8$Preserve=no
    public synchronized static String toString( Object aObject ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB6E51202C8$Preserve=yes

        if (aObject == null) return "(null)";
        return aObject.getClass().getName();

//$Section=Operation$ID=3FB6E51202C8$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB839340087$Preserve=yes
/**
 *
 * @param aObject
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB839340087$Preserve=no
    public synchronized static String toString( XmlSchemaElement aObject ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB839340087$Preserve=yes

        if (aObject == null) return "XmlSchemaElement (null)";
        return aObject.log();

//$Section=Operation$ID=3FB839340087$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB89D97019E$Preserve=yes
/**
 *
 * @param aObject
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB89D97019E$Preserve=no
    public synchronized static String toString( PropertyValue aObject ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=3FB89D97019E$Preserve=yes

        if (aObject == null) return "PropertyValue (null)";
        return aObject.log();

//$Section=Operation$ID=3FB89D97019E$Preserve=no
    }

//$Section=OperationJavadoc$ID=4249684601F4$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4249684601F4$Preserve=no
    public synchronized void start( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=4249684601F4$Preserve=yes
        if (iStartTime > 0) {
            stop();
        }
        java.util.Date lDate = new java.util.Date();
        iStartTime = lDate.getTime();
        println(iCurrentClass, Log._APP, "****** Start Time = " + lDate.toString());
//$Section=Operation$ID=4249684601F4$Preserve=no
    }

//$Section=OperationJavadoc$ID=4249685801E4$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4249685801E4$Preserve=no
    public synchronized void stop( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=4249685801E4$Preserve=yes
        java.util.Date lDate = new java.util.Date();
        iStopTime = lDate.getTime();
        println(iCurrentClass, Log._APP, "****** Elapsed Time = " + Long.toString(iStopTime - iStartTime));
//$Section=Operation$ID=4249685801E4$Preserve=no
    }

//$Section=OperationJavadoc$ID=4249685C01D4$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4249685C01D4$Preserve=no
    public synchronized long getInterval( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Log.");
//$Section=Operation$ID=4249685C01D4$Preserve=yes
        return iStopTime - iStartTime;
//$Section=Operation$ID=4249685C01D4$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3FB6C97701E9$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FB6C97701E9$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FB6C97701E9$Preserve=no

//End of class---------------
}
