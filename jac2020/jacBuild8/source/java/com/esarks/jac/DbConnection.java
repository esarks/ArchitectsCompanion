//$Section=License$ID=3CC0E0F303CD$Preserve=no

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

//  Generated at 2005.07.06 06:35:17.203 PM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: DbConnection.java

//$Section=ChangeLog$ID=3CC0E0F303CD$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3CC0E0F303CD$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.sql.*;
import java.util.*;

//$Section=CustomDeclare$ID=3CC0E0F303CD$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3CC0E0F303CD$Preserve=no

//$Section=ClassJavadoc$ID=3CC0E0F303CD$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3CC0E0F303CD$Preserve=no
public class DbConnection {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Connection iConnection;
    private boolean iSuccess;
    private Exception iException;
    private String iSql;
    private ResultSet iResultSet;
    private ResultSetMetaData iResultSetMetaData;
    private static ArrayList iPool = new ArrayList(20);
    private static Map iConnectionList;
    private String iName = null;
    private ArrayList iMyFreeList = null;
    private ArrayList iMyReservedList = null;
    private boolean iIsFree = true;
    private String iCatalog;
    private String iOwner;
    private String iDbTypes;
    private String iStereotype;
    private String iClassName;
    private String iConnectionString;
    private String iUser;
    private boolean iMake = true;

//$Section=CustomClassDeclare$ID=3CC0E0F303CD$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3CC0E0F303CD$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3CC0E0F303CD$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3CC0E0F303CD$Preserve=no
    private DbConnection() {
//$Section=DefaultConstructor$ID=3CC0E0F303CD$Preserve=yes
//$Section=DefaultConstructor$ID=3CC0E0F303CD$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3CC0E0F303CD$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3CC0E0F303CD$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3CC0E0F303CD$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3CC0E0F303CD$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3CC0E0F303CD$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3CC0E0F303CD$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3CC0E0F303CD$Preserve=yes

        if (iResultSet != null) {
            try {
                iResultSet.close();
                iResultSet = null;
            } catch (Exception e) {}
        }
        iResultSetMetaData = null;
        if (iConnection != null) {
            try {
                iConnection.close();
                iConnection = null;
            } catch (Exception e) {}
        }
        iException = null;
        iResultSetMetaData = null;
        iPool = null;

//$Section=DefaultFreeResources$ID=3CC0E0F303CD$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=426BA295032C$Preserve=yes
/**
 *
 * @param aName
 *
 */
//$Section=OperationJavadoc$ID=426BA295032C$Preserve=no
    public DbConnection( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=426BA295032C$Preserve=yes
        iName = aName;
//$Section=Operation$ID=426BA295032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=4113DC8F035B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4113DC8F035B$Preserve=no
    public static DbConnection getInstance( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=4113DC8F035B$Preserve=yes

//        if (iPool.size() == 0) {
//            DbConnection lDbConnection = new DbConnection();
//            iPool.add(lDbConnection);
//            return lDbConnection;
//        }
//
//        DbConnection lDbConnection = (DbConnection) iPool.remove(0);
//        return lDbConnection;

          DbConnection lDbConnection = new DbConnection();
          return lDbConnection;

//$Section=Operation$ID=4113DC8F035B$Preserve=no
    }

//$Section=OperationJavadoc$ID=425FDDF9010A$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=425FDDF9010A$Preserve=no
    public static DbConnection getInstance( String aInstanceName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=425FDDF9010A$Preserve=yes

        if (iConnectionList == null) iConnectionList = new TreeMap();

        if (iConnectionList.containsKey(aInstanceName) == true) {
            return (DbConnection) iConnectionList.get(aInstanceName);
        } else {
            DbConnection lInstance = new DbConnection();
            iConnectionList.put(aInstanceName, lInstance);
            return lInstance;
        }

//$Section=Operation$ID=425FDDF9010A$Preserve=no
    }

//$Section=OperationJavadoc$ID=3CC0E4160350$Preserve=yes
/**
 *
 * @param aClassName
 *
 * @param aConnectionString
 *
 * @param aUser
 *
 * @param aPassword
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3CC0E4160350$Preserve=no
    public boolean connect( String aClassName, String aConnectionString, String aUser, String aPassword ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=3CC0E4160350$Preserve=yes

        try {
            iClassName = aClassName;
            iConnectionString = aConnectionString;
            iUser = aUser;

            Class.forName(aClassName);
            setConnection(DriverManager.getConnection(aConnectionString, aUser, aPassword));

        } catch (Exception e)
        {
            System.out.println("Exception caught in DbConnection.connect()");
            System.out.println(e);
            setSuccess(false);
            setException(e);
            return false;
        }

        setSuccess(true);
        setException(null);
        return true;

//$Section=Operation$ID=3CC0E4160350$Preserve=no
    }

//$Section=OperationJavadoc$ID=4162AEBB01F4$Preserve=yes
/**
 *
 * @param aBoolean
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4162AEBB01F4$Preserve=no
    public void setAutoCommit( boolean aBoolean ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=4162AEBB01F4$Preserve=yes

        try {
            iConnection.setAutoCommit(aBoolean);
        } catch (Exception e) {}

//$Section=Operation$ID=4162AEBB01F4$Preserve=no
    }

//$Section=OperationJavadoc$ID=3CC0E4BD010B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3CC0E4BD010B$Preserve=no
    public void close( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=3CC0E4BD010B$Preserve=yes

        try
        {
            getConnection().close();
            setSuccess(true);
            setException(null);
        } catch (Exception e)
        {
            setSuccess(false);
            setException(e);
        }

//$Section=Operation$ID=3CC0E4BD010B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3D8DBB5B03E6$Preserve=yes
/**
 *
 * @param aSql
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3D8DBB5B03E6$Preserve=no
    public void executeStatement( String aSql ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=3D8DBB5B03E6$Preserve=yes

        try
        {
            Statement lStatement = getConnection().createStatement();
            setResultSet(lStatement.executeQuery(aSql));
            setResultSetMetaData(getResultSet().getMetaData());
            setSql(aSql);
            setSuccess(true);
            setException(null);
        }
        catch (Exception e)
        {
            System.out.println("Exception caught in DbConnection.executeStatement()");
            System.out.println(e);
            setSuccess(false);
            setException(e);
        }

//$Section=Operation$ID=3D8DBB5B03E6$Preserve=no
    }

//$Section=OperationJavadoc$ID=3E1826FF02FA$Preserve=yes
/**
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3E1826FF02FA$Preserve=no
    public void getCatalogs( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=3E1826FF02FA$Preserve=yes

        try {
            DatabaseMetaData lDatabaseMetaData = getConnection().getMetaData();
            ResultSet lResultSet = lDatabaseMetaData.getCatalogs();

            setResultSet(lDatabaseMetaData.getCatalogs());
            setResultSetMetaData(getResultSet().getMetaData());

            aScript.getSymbolTable().getPropertyCollection().removePropertyValues("$jac:DbMetaData:Catalog");
            while (lResultSet.next()) {
                aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:DbMetaData:Catalog", new PropertyValue(lResultSet.getObject("TABLE_CAT")));
//                aScriptContext.setLocalProperty("DbMetaData:Catalog", lResultSet.getString("TABLE_CAT"));
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception caught in DbConnection.getCatalogs()");
            System.out.println(e);
            setSuccess(false);
            setException(e);
        }

//$Section=Operation$ID=3E1826FF02FA$Preserve=no
    }

//$Section=OperationJavadoc$ID=3E18342A031F$Preserve=yes
/**
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3E18342A031F$Preserve=no
    public void getSchemas( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=3E18342A031F$Preserve=yes

        try {
            DatabaseMetaData lDatabaseMetaData = getConnection().getMetaData();
            ResultSet lResultSet = lDatabaseMetaData.getSchemas();

            setResultSet(lDatabaseMetaData.getSchemas());
            setResultSetMetaData(getResultSet().getMetaData());

            aScript.getSymbolTable().getPropertyCollection().removePropertyValues("$jac:DbMetaData:Schema");
            while (lResultSet.next()) {
                aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:DbMetaData:Schema", new PropertyValue(lResultSet.getObject("TABLE_SCHEM")));
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception caught in DbConnection.getSchemas()");
            System.out.println(e);
            setSuccess(false);
            setException(e);
        }

//$Section=Operation$ID=3E18342A031F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3E1844FE01E3$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aTablePattern
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3E1844FE01E3$Preserve=no
    public void getTables( Script aScript, String aTablePattern ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=3E1844FE01E3$Preserve=yes

        try {
            DatabaseMetaData lDatabaseMetaData = getConnection().getMetaData();
            ResultSet lResultSet = lDatabaseMetaData.getTables(null, null, aTablePattern, null);

            setResultSet(lDatabaseMetaData.getTables(null, null, aTablePattern, null));
            setResultSetMetaData(getResultSet().getMetaData());

            aScript.getSymbolTable().getPropertyCollection().removePropertyValues("$jac:DbMetaData:Tables");
            while (lResultSet.next()) {
                aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:DbMetaData:Tables", new PropertyValue(lResultSet.getObject("TABLE_NAME")));
                aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:DbMetaData:Tables:Type", new PropertyValue(lResultSet.getObject("TABLE_TYPE")));
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception caught in DbConnection.getTables()");
            System.out.println(e);
            setSuccess(false);
            setException(e);
        }

//$Section=Operation$ID=3E1844FE01E3$Preserve=no
    }

//$Section=OperationJavadoc$ID=3E17504001D0$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aTableName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3E17504001D0$Preserve=no
    public void getColumns( Script aScript, String aTableName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=3E17504001D0$Preserve=yes

        try {
            DatabaseMetaData lDatabaseMetaData = getConnection().getMetaData();
            ResultSet lResultSet = lDatabaseMetaData.getColumns(null, null, aTableName, "%");

            setResultSet(lDatabaseMetaData.getColumns(null, null, aTableName, "%"));
            setResultSetMetaData(getResultSet().getMetaData());

            aScript.getSymbolTable().getPropertyCollection().removePropertyValues("$jac:DbMetaData:Table:" + aTableName);

            while (lResultSet.next()) {
                aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:DbMetaData:Table:" + aTableName + ":Column", new PropertyValue(((String)lResultSet.getObject("COLUMN_NAME")).toLowerCase()));
                aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:DbMetaData:Table:" + aTableName + ":Column:Type", new PropertyValue(((String)lResultSet.getObject("TYPE_NAME")).toLowerCase()));
                aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:DbMetaData:Table:" + aTableName + ":Column:Size", new PropertyValue(lResultSet.getObject("COLUMN_SIZE")));
                aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:DbMetaData:Table:" + aTableName + ":Column:Decimal", new PropertyValue(lResultSet.getObject("DECIMAL_DIGITS")));
                aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:DbMetaData:Table:" + aTableName + ":Column:Nullable", new PropertyValue(((String)lResultSet.getObject("IS_NULLABLE")).toLowerCase()));
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception caught in DbConnection.getTableMetaData()");
            System.out.println(e);
            setSuccess(false);
            setException(e);
        }

//$Section=Operation$ID=3E17504001D0$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FAD5DEA029C$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FAD5DEA029C$Preserve=no
    public boolean next( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=3FAD5DEA029C$Preserve=yes

        try {
            return iResultSet.next();
        } catch (Exception e) { return false; }

//$Section=Operation$ID=3FAD5DEA029C$Preserve=no
    }

//$Section=OperationJavadoc$ID=4113E0C60222$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4113E0C60222$Preserve=no
    public void returnToPool( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=4113E0C60222$Preserve=yes

        iPool.add(this);

//$Section=Operation$ID=4113E0C60222$Preserve=no
    }

//$Section=OperationJavadoc$ID=41AFB99902CE$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41AFB99902CE$Preserve=no
    public void commit( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=41AFB99902CE$Preserve=yes

        try {
            iConnection.commit();
        } catch (Exception e) {}

//$Section=Operation$ID=41AFB99902CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=41AFB9A700AB$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41AFB9A700AB$Preserve=no
    public void rollback( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=41AFB9A700AB$Preserve=yes

        try {
            iConnection.rollback();
        } catch (Exception e) {}

//$Section=Operation$ID=41AFB9A700AB$Preserve=no
    }

//$Section=OperationJavadoc$ID=41B13F990261$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41B13F990261$Preserve=no
    public boolean isClosed( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=41B13F990261$Preserve=yes

        try {
            return iConnection.isClosed();
        } catch (Exception e) {}
        return false;

//$Section=Operation$ID=41B13F990261$Preserve=no
    }

//$Section=OperationJavadoc$ID=4228EDE303A9$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4228EDE303A9$Preserve=no
    public boolean isValidationModel( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=4228EDE303A9$Preserve=yes
        return false;
//$Section=Operation$ID=4228EDE303A9$Preserve=no
    }

//$Section=OperationJavadoc$ID=426C325702FD$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=426C325702FD$Preserve=no
    public void unReserve( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=426C325702FD$Preserve=yes

        if (iIsFree) return;
        if (iMyReservedList == null) return;
        if (!iMyReservedList.contains(this)) return;
        iMyReservedList.remove(iMyReservedList.indexOf(this));
        iMyFreeList.add(this);
        iIsFree = true;
        return;

//$Section=Operation$ID=426C325702FD$Preserve=no
    }

//$Section=OperationJavadoc$ID=426E940402B6$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=426E940402B6$Preserve=no
    public String getPrefix( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter DbConnection.");
//$Section=Operation$ID=426E940402B6$Preserve=yes

        String lReturn = "";
        if (!iCatalog.equals("")) lReturn += iCatalog + ".";
        if (!iOwner.equals("")) lReturn += iOwner + ".";
        return lReturn;

//$Section=Operation$ID=426E940402B6$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Connection
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3CC0E4D60003$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3CC0E4D60003$Preserve=no
    public Connection getConnection() {
//$Section=Attribute get$ID=3CC0E4D60003$Preserve=no
        return iConnection;
//$Section=Attribute get$ID=3CC0E4D60003$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3CC0E4D60003$Preserve=no
/**
 * Set accessor method.
 *
 * @param Connection the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3CC0E4D60003$Preserve=no
    public void setConnection(Connection aValue) {
//$Section=Attribute set$ID=3CC0E4D60003$Preserve=no
        iConnection = aValue;
//$Section=Attribute set$ID=3CC0E4D60003$Preserve=no
    }
//----------------------------------------------------------------------------
// Success
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3D8DF05D0096$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3D8DF05D0096$Preserve=no
    public boolean getSuccess() {
//$Section=Attribute get$ID=3D8DF05D0096$Preserve=no
        return iSuccess;
//$Section=Attribute get$ID=3D8DF05D0096$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3D8DF05D0096$Preserve=no
/**
 * Set accessor method.
 *
 * @param Success the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3D8DF05D0096$Preserve=no
    public void setSuccess(boolean aValue) {
//$Section=Attribute set$ID=3D8DF05D0096$Preserve=no
        iSuccess = aValue;
//$Section=Attribute set$ID=3D8DF05D0096$Preserve=no
    }
//----------------------------------------------------------------------------
// Exception
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3D8DF05D00AA$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3D8DF05D00AA$Preserve=no
    public Exception getException() {
//$Section=Attribute get$ID=3D8DF05D00AA$Preserve=no
        return iException;
//$Section=Attribute get$ID=3D8DF05D00AA$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3D8DF05D00AA$Preserve=no
/**
 * Set accessor method.
 *
 * @param Exception the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3D8DF05D00AA$Preserve=no
    public void setException(Exception aValue) {
//$Section=Attribute set$ID=3D8DF05D00AA$Preserve=no
        iException = aValue;
//$Section=Attribute set$ID=3D8DF05D00AA$Preserve=no
    }
//----------------------------------------------------------------------------
// Sql
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3D8DF05D00BE$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3D8DF05D00BE$Preserve=no
    public String getSql() {
//$Section=Attribute get$ID=3D8DF05D00BE$Preserve=no
        return iSql;
//$Section=Attribute get$ID=3D8DF05D00BE$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3D8DF05D00BE$Preserve=no
/**
 * Set accessor method.
 *
 * @param Sql the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3D8DF05D00BE$Preserve=no
    public void setSql(String aValue) {
//$Section=Attribute set$ID=3D8DF05D00BE$Preserve=no
        iSql = aValue;
//$Section=Attribute set$ID=3D8DF05D00BE$Preserve=no
    }
//----------------------------------------------------------------------------
// ResultSet
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3D8DF05D00D2$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3D8DF05D00D2$Preserve=no
    public ResultSet getResultSet() {
//$Section=Attribute get$ID=3D8DF05D00D2$Preserve=no
        return iResultSet;
//$Section=Attribute get$ID=3D8DF05D00D2$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3D8DF05D00D2$Preserve=no
/**
 * Set accessor method.
 *
 * @param ResultSet the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3D8DF05D00D2$Preserve=no
    public void setResultSet(ResultSet aValue) {
//$Section=Attribute set$ID=3D8DF05D00D2$Preserve=no
        iResultSet = aValue;
//$Section=Attribute set$ID=3D8DF05D00D2$Preserve=no
    }
//----------------------------------------------------------------------------
// ResultSetMetaData
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3D8DF05D00E6$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3D8DF05D00E6$Preserve=no
    public ResultSetMetaData getResultSetMetaData() {
//$Section=Attribute get$ID=3D8DF05D00E6$Preserve=no
        return iResultSetMetaData;
//$Section=Attribute get$ID=3D8DF05D00E6$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3D8DF05D00E6$Preserve=no
/**
 * Set accessor method.
 *
 * @param ResultSetMetaData the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3D8DF05D00E6$Preserve=no
    public void setResultSetMetaData(ResultSetMetaData aValue) {
//$Section=Attribute set$ID=3D8DF05D00E6$Preserve=no
        iResultSetMetaData = aValue;
//$Section=Attribute set$ID=3D8DF05D00E6$Preserve=no
    }
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426BA20B003E$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426BA20B003E$Preserve=no
    public String getName() {
//$Section=Attribute get$ID=426BA20B003E$Preserve=no
        return iName;
//$Section=Attribute get$ID=426BA20B003E$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426BA20B003E$Preserve=no
/**
 * Set accessor method.
 *
 * @param Name the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426BA20B003E$Preserve=no
    public void setName(String aValue) {
//$Section=Attribute set$ID=426BA20B003E$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=426BA20B003E$Preserve=no
    }
//----------------------------------------------------------------------------
// MyFreeList
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426BA5790399$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426BA5790399$Preserve=no
    public ArrayList getMyFreeList() {
//$Section=Attribute get$ID=426BA5790399$Preserve=no
        return iMyFreeList;
//$Section=Attribute get$ID=426BA5790399$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426BA5790399$Preserve=no
/**
 * Set accessor method.
 *
 * @param MyFreeList the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426BA5790399$Preserve=no
    public void setMyFreeList(ArrayList aValue) {
//$Section=Attribute set$ID=426BA5790399$Preserve=no
        iMyFreeList = aValue;
//$Section=Attribute set$ID=426BA5790399$Preserve=no
    }
//----------------------------------------------------------------------------
// MyReservedList
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426BA57B0203$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426BA57B0203$Preserve=no
    public ArrayList getMyReservedList() {
//$Section=Attribute get$ID=426BA57B0203$Preserve=no
        return iMyReservedList;
//$Section=Attribute get$ID=426BA57B0203$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426BA57B0203$Preserve=no
/**
 * Set accessor method.
 *
 * @param MyReservedList the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426BA57B0203$Preserve=no
    public void setMyReservedList(ArrayList aValue) {
//$Section=Attribute set$ID=426BA57B0203$Preserve=no
        iMyReservedList = aValue;
//$Section=Attribute set$ID=426BA57B0203$Preserve=no
    }
//----------------------------------------------------------------------------
// IsFree
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426BA621009C$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426BA621009C$Preserve=no
    public boolean getIsFree() {
//$Section=Attribute get$ID=426BA621009C$Preserve=no
        return iIsFree;
//$Section=Attribute get$ID=426BA621009C$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426BA621009C$Preserve=no
/**
 * Set accessor method.
 *
 * @param IsFree the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426BA621009C$Preserve=no
    public void setIsFree(boolean aValue) {
//$Section=Attribute set$ID=426BA621009C$Preserve=no
        iIsFree = aValue;
//$Section=Attribute set$ID=426BA621009C$Preserve=no
    }
//----------------------------------------------------------------------------
// Catalog
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426E9152014E$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426E9152014E$Preserve=no
    public String getCatalog() {
//$Section=Attribute get$ID=426E9152014E$Preserve=no
        return iCatalog;
//$Section=Attribute get$ID=426E9152014E$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426E9152014E$Preserve=no
/**
 * Set accessor method.
 *
 * @param Catalog the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426E9152014E$Preserve=no
    public void setCatalog(String aValue) {
//$Section=Attribute set$ID=426E9152014E$Preserve=no
        iCatalog = aValue;
//$Section=Attribute set$ID=426E9152014E$Preserve=no
    }
//----------------------------------------------------------------------------
// Owner
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426E915E020A$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426E915E020A$Preserve=no
    public String getOwner() {
//$Section=Attribute get$ID=426E915E020A$Preserve=no
        return iOwner;
//$Section=Attribute get$ID=426E915E020A$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426E915E020A$Preserve=no
/**
 * Set accessor method.
 *
 * @param Owner the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426E915E020A$Preserve=no
    public void setOwner(String aValue) {
//$Section=Attribute set$ID=426E915E020A$Preserve=no
        iOwner = aValue;
//$Section=Attribute set$ID=426E915E020A$Preserve=no
    }
//----------------------------------------------------------------------------
// DbTypes
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426E915E0333$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426E915E0333$Preserve=no
    public String getDbTypes() {
//$Section=Attribute get$ID=426E915E0333$Preserve=no
        return iDbTypes;
//$Section=Attribute get$ID=426E915E0333$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426E915E0333$Preserve=no
/**
 * Set accessor method.
 *
 * @param DbTypes the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426E915E0333$Preserve=no
    public void setDbTypes(String aValue) {
//$Section=Attribute set$ID=426E915E0333$Preserve=no
        iDbTypes = aValue;
//$Section=Attribute set$ID=426E915E0333$Preserve=no
    }
//----------------------------------------------------------------------------
// Stereotype
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426E91EF0141$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426E91EF0141$Preserve=no
    public String getStereotype() {
//$Section=Attribute get$ID=426E91EF0141$Preserve=no
        return iStereotype;
//$Section=Attribute get$ID=426E91EF0141$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426E91EF0141$Preserve=no
/**
 * Set accessor method.
 *
 * @param Stereotype the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426E91EF0141$Preserve=no
    public void setStereotype(String aValue) {
//$Section=Attribute set$ID=426E91EF0141$Preserve=no
        iStereotype = aValue;
//$Section=Attribute set$ID=426E91EF0141$Preserve=no
    }
//----------------------------------------------------------------------------
// ClassName
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426EBFF1007D$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426EBFF1007D$Preserve=no
    public String getClassName() {
//$Section=Attribute get$ID=426EBFF1007D$Preserve=no
        return iClassName;
//$Section=Attribute get$ID=426EBFF1007D$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426EBFF1007D$Preserve=no
/**
 * Set accessor method.
 *
 * @param ClassName the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426EBFF1007D$Preserve=no
    public void setClassName(String aValue) {
//$Section=Attribute set$ID=426EBFF1007D$Preserve=no
        iClassName = aValue;
//$Section=Attribute set$ID=426EBFF1007D$Preserve=no
    }
//----------------------------------------------------------------------------
// ConnectionString
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426EC038004E$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426EC038004E$Preserve=no
    public String getConnectionString() {
//$Section=Attribute get$ID=426EC038004E$Preserve=no
        return iConnectionString;
//$Section=Attribute get$ID=426EC038004E$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426EC038004E$Preserve=no
/**
 * Set accessor method.
 *
 * @param ConnectionString the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426EC038004E$Preserve=no
    public void setConnectionString(String aValue) {
//$Section=Attribute set$ID=426EC038004E$Preserve=no
        iConnectionString = aValue;
//$Section=Attribute set$ID=426EC038004E$Preserve=no
    }
//----------------------------------------------------------------------------
// User
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=426EC0380186$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=426EC0380186$Preserve=no
    public String getUser() {
//$Section=Attribute get$ID=426EC0380186$Preserve=no
        return iUser;
//$Section=Attribute get$ID=426EC0380186$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=426EC0380186$Preserve=no
/**
 * Set accessor method.
 *
 * @param User the value to be set.
 */
//$Section=Attribute setJavadoc$ID=426EC0380186$Preserve=no
    public void setUser(String aValue) {
//$Section=Attribute set$ID=426EC0380186$Preserve=no
        iUser = aValue;
//$Section=Attribute set$ID=426EC0380186$Preserve=no
    }
//----------------------------------------------------------------------------
// Make
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=42CC5C1400CB$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=42CC5C1400CB$Preserve=no
    public boolean getMake() {
//$Section=Attribute get$ID=42CC5C1400CB$Preserve=no
        return iMake;
//$Section=Attribute get$ID=42CC5C1400CB$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=42CC5C1400CB$Preserve=no
/**
 * Set accessor method.
 *
 * @param Make the value to be set.
 */
//$Section=Attribute setJavadoc$ID=42CC5C1400CB$Preserve=no
    public void setMake(boolean aValue) {
//$Section=Attribute set$ID=42CC5C1400CB$Preserve=no
        iMake = aValue;
//$Section=Attribute set$ID=42CC5C1400CB$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3CC0E0F303CD$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3CC0E0F303CD$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3CC0E0F303CD$Preserve=no

//End of class---------------
}
