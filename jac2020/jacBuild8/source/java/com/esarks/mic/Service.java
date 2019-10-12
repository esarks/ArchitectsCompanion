//$Section=License$ID=417A49F50290$Preserve=no

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

//  Generated at 2005.03.17 01:19:03.122 PM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Service.script

//$Section=ChangeLog$ID=417A49F50290$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=417A49F50290$Preserve=no

package com.esarks.mic;

//$Section=ClassJavadoc$ID=417A49F50290$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=417A49F50290$Preserve=no
//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import com.esarks.jac.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
// SuperClass

//$Section=CustomDeclare$ID=417A49F50290$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=417A49F50290$Preserve=no

public class Service extends com.esarks.mic.Component {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A49F50290$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=417A49F50290$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=417A49F50290$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=417A49F50290$Preserve=no
    public Service() {
//$Section=DefaultConstructor$ID=417A49F50290$Preserve=yes
//$Section=DefaultConstructor$ID=417A49F50290$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=417A49F50290$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=417A49F50290$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=417A49F50290$Preserve=yes
//$Section=DefaultDestructor$ID=417A49F50290$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=417A49F50290$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=417A49F50290$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=417A49F50290$Preserve=yes
//$Section=DefaultFreeResources$ID=417A49F50290$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=41A2144201F4$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=41A2144201F4$Preserve=no
    public Service( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Service.");
//$Section=Operation$ID=41A2144201F4$Preserve=yes
         super(aScript);
//$Section=Operation$ID=41A2144201F4$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A0A6CD03D8$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41A0A6CD03D8$Preserve=no
    public DbConnection getDbConnection( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Service.");
//$Section=Operation$ID=41A0A6CD03D8$Preserve=yes
      DbConnection lDbConnection = null;
      lDbConnection = (DbConnection) iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:object:DbConnection")).getValueObject();
      if (lDbConnection == null || lDbConnection.isClosed()) {
        try {
          if (lDbConnection == null) lDbConnection = iSymbolTable.getDbConnection();
          lDbConnection.connect(getProperty("jdbcClass"), getProperty("jdbcConnection"), getProperty("jdbcUser"), getProperty("jdbcPassword"));
          lDbConnection.getConnection().setAutoCommit(true);
          iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$mic:object:DbConnection")).reset(lDbConnection);
        } catch (Throwable e) {
          return null;
        }
      }
      return lDbConnection;
//$Section=Operation$ID=41A0A6CD03D8$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A0A939035B$Preserve=yes
/**
 *
 * @param aService
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41A0A939035B$Preserve=no
    public int getErrorCount( com.esarks.arm.model.jeo.ServiceJeo aService ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Service.");
//$Section=Operation$ID=41A0A939035B$Preserve=yes
        return 0;
//$Section=Operation$ID=41A0A939035B$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A0A9AE036B$Preserve=yes
/**
 *
 * @param aService
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41A0A9AE036B$Preserve=no
    public int getHighestErrorSeverity( com.esarks.arm.model.jeo.ServiceJeo aService ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Service.");
//$Section=Operation$ID=41A0A9AE036B$Preserve=yes
        return 0;
//$Section=Operation$ID=41A0A9AE036B$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=417A49F50290$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A49F50290$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=417A49F50290$Preserve=no

//End of class---------------
}
