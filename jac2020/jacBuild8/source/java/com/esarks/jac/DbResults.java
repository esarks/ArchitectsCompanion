//$Section=License$ID=3CC0E42D00DC$Preserve=no

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

//  Generated at 2005.01.08 01:53:46.640 PM EST by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: DbResults.java

//$Section=ChangeLog$ID=3CC0E42D00DC$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3CC0E42D00DC$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.sql.*;

//$Section=CustomDeclare$ID=3CC0E42D00DC$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3CC0E42D00DC$Preserve=no

//$Section=ClassJavadoc$ID=3CC0E42D00DC$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3CC0E42D00DC$Preserve=no
public class DbResults {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private boolean iSuccess;
    private Exception iException;
    private String iSql;
    private ResultSet iResultSet;
    private ResultSetMetaData iResultSetMetaData;

//$Section=CustomClassDeclare$ID=3CC0E42D00DC$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3CC0E42D00DC$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3CC0E42D00DC$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3CC0E42D00DC$Preserve=no
    public DbResults() {
//$Section=DefaultConstructor$ID=3CC0E42D00DC$Preserve=yes
//$Section=DefaultConstructor$ID=3CC0E42D00DC$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3CC0E42D00DC$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3CC0E42D00DC$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3CC0E42D00DC$Preserve=yes
//$Section=DefaultDestructor$ID=3CC0E42D00DC$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3CC0E42D00DC$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3CC0E42D00DC$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3CC0E42D00DC$Preserve=yes
//$Section=DefaultFreeResources$ID=3CC0E42D00DC$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Success
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3CC0E4370285$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3CC0E4370285$Preserve=no
    public boolean getSuccess() {
//$Section=Attribute get$ID=3CC0E4370285$Preserve=no
        return iSuccess;
//$Section=Attribute get$ID=3CC0E4370285$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3CC0E4370285$Preserve=no
/**
 * Set accessor method.
 *
 * @param Success the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3CC0E4370285$Preserve=no
    public void setSuccess(boolean aValue) {
//$Section=Attribute set$ID=3CC0E4370285$Preserve=no
        iSuccess = aValue;
//$Section=Attribute set$ID=3CC0E4370285$Preserve=no
    }
//----------------------------------------------------------------------------
// Exception
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3CC0E46101EF$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3CC0E46101EF$Preserve=no
    public Exception getException() {
//$Section=Attribute get$ID=3CC0E46101EF$Preserve=no
        return iException;
//$Section=Attribute get$ID=3CC0E46101EF$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3CC0E46101EF$Preserve=no
/**
 * Set accessor method.
 *
 * @param Exception the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3CC0E46101EF$Preserve=no
    public void setException(Exception aValue) {
//$Section=Attribute set$ID=3CC0E46101EF$Preserve=no
        iException = aValue;
//$Section=Attribute set$ID=3CC0E46101EF$Preserve=no
    }
//----------------------------------------------------------------------------
// Sql
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3D8DBCAE02F3$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3D8DBCAE02F3$Preserve=no
    public String getSql() {
//$Section=Attribute get$ID=3D8DBCAE02F3$Preserve=no
        return iSql;
//$Section=Attribute get$ID=3D8DBCAE02F3$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3D8DBCAE02F3$Preserve=no
/**
 * Set accessor method.
 *
 * @param Sql the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3D8DBCAE02F3$Preserve=no
    public void setSql(String aValue) {
//$Section=Attribute set$ID=3D8DBCAE02F3$Preserve=no
        iSql = aValue;
//$Section=Attribute set$ID=3D8DBCAE02F3$Preserve=no
    }
//----------------------------------------------------------------------------
// ResultSet
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3D8DC4E3002E$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3D8DC4E3002E$Preserve=no
    public ResultSet getResultSet() {
//$Section=Attribute get$ID=3D8DC4E3002E$Preserve=no
        return iResultSet;
//$Section=Attribute get$ID=3D8DC4E3002E$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3D8DC4E3002E$Preserve=no
/**
 * Set accessor method.
 *
 * @param ResultSet the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3D8DC4E3002E$Preserve=no
    public void setResultSet(ResultSet aValue) {
//$Section=Attribute set$ID=3D8DC4E3002E$Preserve=no
        iResultSet = aValue;
//$Section=Attribute set$ID=3D8DC4E3002E$Preserve=no
    }
//----------------------------------------------------------------------------
// ResultSetMetaData
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3D8DCBCA031D$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3D8DCBCA031D$Preserve=no
    public ResultSetMetaData getResultSetMetaData() {
//$Section=Attribute get$ID=3D8DCBCA031D$Preserve=no
        return iResultSetMetaData;
//$Section=Attribute get$ID=3D8DCBCA031D$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3D8DCBCA031D$Preserve=no
/**
 * Set accessor method.
 *
 * @param ResultSetMetaData the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3D8DCBCA031D$Preserve=no
    public void setResultSetMetaData(ResultSetMetaData aValue) {
//$Section=Attribute set$ID=3D8DCBCA031D$Preserve=no
        iResultSetMetaData = aValue;
//$Section=Attribute set$ID=3D8DCBCA031D$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3CC0E42D00DC$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3CC0E42D00DC$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3CC0E42D00DC$Preserve=no

//End of class---------------
}
