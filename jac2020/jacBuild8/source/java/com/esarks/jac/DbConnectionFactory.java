//$Section=License$ID=42685D440109$Preserve=no

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

//  Generated at 2005.05.08 09:14:35.062 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: DbConnectionFactory.java

//$Section=ChangeLog$ID=42685D440109$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=42685D440109$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;

//$Section=CustomDeclare$ID=42685D440109$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=42685D440109$Preserve=no

//$Section=ClassJavadoc$ID=42685D440109$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=42685D440109$Preserve=no
public class DbConnectionFactory {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private static DbConnectionFactory iInstance = null;
    private Map iConnectionList = new TreeMap();
    private Map iObjectList = new TreeMap();

//$Section=CustomClassDeclare$ID=42685D440109$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=42685D440109$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=42685D440109$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=42685D440109$Preserve=no
    public DbConnectionFactory() {
//$Section=DefaultConstructor$ID=42685D440109$Preserve=yes
//$Section=DefaultConstructor$ID=42685D440109$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=42685D440109$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=42685D440109$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=42685D440109$Preserve=yes
//$Section=DefaultDestructor$ID=42685D440109$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=42685D440109$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=42685D440109$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=42685D440109$Preserve=yes
//$Section=DefaultFreeResources$ID=42685D440109$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=42685DA5003E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42685DA5003E$Preserve=no
    public synchronized static DbConnectionFactory getInstance( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnectionFactory.");
//$Section=Operation$ID=42685DA5003E$Preserve=yes
        if (iInstance != null) return iInstance;
        iInstance = new DbConnectionFactory();
        return iInstance;
//$Section=Operation$ID=42685DA5003E$Preserve=no
    }

//$Section=OperationJavadoc$ID=42685DC400FA$Preserve=yes
/**
 *
 * @param aDbConnection
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42685DC400FA$Preserve=no
    public synchronized void register( DbConnection aDbConnection ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnectionFactory.");
//$Section=Operation$ID=42685DC400FA$Preserve=yes

        if (iConnectionList == null) iConnectionList = new TreeMap();

        if (iConnectionList.containsKey(aDbConnection.getName()) == false) {
            ArrayList lContainerArrayList = new ArrayList(2);
            iConnectionList.put(aDbConnection.getName(), lContainerArrayList);
            ArrayList lFreeArrayList = new ArrayList();
            ArrayList lReservedArrayList = new ArrayList();
            lContainerArrayList.add(lFreeArrayList);
            lContainerArrayList.add(lReservedArrayList);
            lFreeArrayList.add(aDbConnection);
            aDbConnection.setMyReservedList(lReservedArrayList);
            aDbConnection.setMyFreeList(lFreeArrayList);
            aDbConnection.setIsFree(true);
            return;
        } else {
            ArrayList lContainerArrayList = (ArrayList) iConnectionList.get(aDbConnection.getName());
            ArrayList lFreeArrayList = (ArrayList) lContainerArrayList.get(0);
            ArrayList lReservedArrayList = (ArrayList) lContainerArrayList.get(1);
            lFreeArrayList.add(aDbConnection);
            aDbConnection.setMyReservedList(lReservedArrayList);
            aDbConnection.setMyFreeList(lFreeArrayList);
            aDbConnection.setIsFree(true);
            return;
        }

//$Section=Operation$ID=42685DC400FA$Preserve=no
    }

//$Section=OperationJavadoc$ID=426F682B0021$Preserve=yes
/**
 *
 * @param aDbConnectionName
 *
 * @param aAliasName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=426F682B0021$Preserve=no
    public synchronized void alias( String aDbConnectionName, String aAliasName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnectionFactory.");
//$Section=Operation$ID=426F682B0021$Preserve=yes

        if (iConnectionList == null) iConnectionList = new TreeMap();

        if (iConnectionList.containsKey(aDbConnectionName) == false) {
            return;
        } else {
            if (iConnectionList.containsKey(aAliasName) == true) return;
            ArrayList lContainerArrayList = (ArrayList) iConnectionList.get(aDbConnectionName);
            iConnectionList.put(aAliasName, lContainerArrayList);
            return;
        }

//$Section=Operation$ID=426F682B0021$Preserve=no
    }

//$Section=OperationJavadoc$ID=426E827D039C$Preserve=yes
/**
 *
 * @param aName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=426E827D039C$Preserve=no
    public synchronized DbConnection getDbConnection( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnectionFactory.");
//$Section=Operation$ID=426E827D039C$Preserve=yes

        if (iConnectionList == null) return null;

        if (iConnectionList.containsKey(aName) == true) {
            ArrayList lContainerArrayList = (ArrayList) iConnectionList.get(aName);
            ArrayList lFreeArrayList = (ArrayList) lContainerArrayList.get(0);
            ArrayList lReservedArrayList = (ArrayList) lContainerArrayList.get(1);
            if (lFreeArrayList.size() == 0) return null;
            DbConnection lDbConnection = (DbConnection) lFreeArrayList.get(0);
            return lDbConnection;
        } else {
            return null;
        }

//$Section=Operation$ID=426E827D039C$Preserve=no
    }

//$Section=OperationJavadoc$ID=427E1097005D$Preserve=yes
/**
 *
 * @param aName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=427E1097005D$Preserve=no
    public synchronized int getFreeCount( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnectionFactory.");
//$Section=Operation$ID=427E1097005D$Preserve=yes

        if (iConnectionList == null) return 0;

        if (iConnectionList.containsKey(aName) == true) {
            ArrayList lContainerArrayList = (ArrayList) iConnectionList.get(aName);
            ArrayList lFreeArrayList = (ArrayList) lContainerArrayList.get(0);
            ArrayList lReservedArrayList = (ArrayList) lContainerArrayList.get(1);
            return lFreeArrayList.size();
        } else {
            return 0;
        }

//$Section=Operation$ID=427E1097005D$Preserve=no
    }

//$Section=OperationJavadoc$ID=42685E0903B9$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42685E0903B9$Preserve=no
    public synchronized DbConnection reserveDbConnection( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnectionFactory.");
//$Section=Operation$ID=42685E0903B9$Preserve=yes

        if (iConnectionList == null) return null;

        if (iConnectionList.containsKey(aName) == true) {
            ArrayList lContainerArrayList = (ArrayList) iConnectionList.get(aName);
            ArrayList lFreeArrayList = (ArrayList) lContainerArrayList.get(0);
            ArrayList lReservedArrayList = (ArrayList) lContainerArrayList.get(1);
            if (lFreeArrayList.size() == 0) return null;
            DbConnection lDbConnection = (DbConnection) lFreeArrayList.get(0);
            lFreeArrayList.remove(0);
            lReservedArrayList.add(lDbConnection);
            lDbConnection.setIsFree(false);
            return lDbConnection;
        } else {
            return null;
        }

//$Section=Operation$ID=42685E0903B9$Preserve=no
    }

//$Section=OperationJavadoc$ID=42685E1E037A$Preserve=yes
/**
 *
 * @param aDbConnection
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42685E1E037A$Preserve=no
    public synchronized void unreserveDbConnection( DbConnection aDbConnection ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnectionFactory.");
//$Section=Operation$ID=42685E1E037A$Preserve=yes

        aDbConnection.unReserve();

//$Section=Operation$ID=42685E1E037A$Preserve=no
    }

//$Section=OperationJavadoc$ID=426E87400204$Preserve=yes
/**
 *
 * @param aObjectName
 *
 * @param aDbConnection
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=426E87400204$Preserve=no
    public synchronized void associateObjectConnection( String aObjectName, DbConnection aDbConnection ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnectionFactory.");
//$Section=Operation$ID=426E87400204$Preserve=yes

        if (iObjectList.containsKey(aObjectName)) return;
        iObjectList.put(aObjectName, aDbConnection.getName());

//$Section=Operation$ID=426E87400204$Preserve=no
    }

//$Section=OperationJavadoc$ID=426E8E4F01A1$Preserve=yes
/**
 *
 * @param aObjectName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=426E8E4F01A1$Preserve=no
    public synchronized DbConnection getAssociatedDbConnection( String aObjectName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnectionFactory.");
//$Section=Operation$ID=426E8E4F01A1$Preserve=yes

        if (!iObjectList.containsKey(aObjectName)) return null;
        String lDbConnectionName = (String) iObjectList.get(aObjectName);
        return getDbConnection(lDbConnectionName);

//$Section=Operation$ID=426E8E4F01A1$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=42685D440109$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=42685D440109$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=42685D440109$Preserve=no

//End of class---------------
}
