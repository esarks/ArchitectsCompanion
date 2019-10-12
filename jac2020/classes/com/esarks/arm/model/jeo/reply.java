//$Section=License$Preserve=no
//  Generated at 2005.01.07 01:29:15.843 PM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  XML Definition: com.esarks.arm.model.jeo.Service_Jeo
//     Module Name: com.esarks.arm.model.jeo.reply

//$Section=ChangeLog$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$Preserve=no

package com.esarks.arm.model.jeo;

/**
 *
 */

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import com.esarks.jac.*;
import com.esarks.mic.*;
import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.net.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

//$Section=CustomDeclare$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$Preserve=no

public class reply extends com.esarks.jac.Jeo {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes


//$Section=CustomClassDeclare$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$Preserve=no

//----------------------------------------------------------------------------
// Generated constructors.
//----------------------------------------------------------------------------

/**
 * Default constructor.
 */
    public reply() {
      super("com.esarks.arm.model.jeo.reply");
//$Section=DefaultConstructor$Preserve=yes
//$Section=DefaultConstructor$Preserve=no
    }

/**
 *
 */
    public reply( Script aScript ) {
      super("com.esarks.arm.model.jeo.reply", aScript);
//$Section=Operation$Jeo( String aScript )$Preserve=yes
//$Section=Operation$Jeo( String aScript )$Preserve=no
    }

/**
 *
 */
    public reply( String aTypeName ) {
      super("com.esarks.arm.model.jeo.reply", aTypeName);
//$Section=Operation$Jeo( String aTypeName )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName )$Preserve=no
    }

/**
 *
 */
    public reply( String aTypeName, Script aScript ) {
      super("com.esarks.arm.model.jeo.reply", aTypeName, aScript);
//$Section=Operation$Jeo( String aTypeName, Script aScript )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName, Script aScript )$Preserve=no
    }

//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

/**
 * Default finalize.
 */
    public void finalize() {
    	freeResources();
//$Section=DefaultDestructor$Preserve=yes
//$Section=DefaultDestructor$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

/**
 * Default freeResources.
 */
    public void freeResources() {
    	super.freeResources();
//$Section=DefaultFreeResources$Preserve=yes
//$Section=DefaultFreeResources$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------
//$Section=CustomOperations$Preserve=yes
//$Section=CustomOperations$Preserve=no

//----------------------------------------------------------------------------
// This section is for mapping views to tables.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for mapping from result sets.
//----------------------------------------------------------------------------

  public void mapFromResultSet( ResultSet aResultSet, boolean aTrim, boolean aSpacesToNull) {
//$Section=Operation$mapFromResultSet$Preserve=no
    mapFromResultSetTable("*", aResultSet, aTrim, aSpacesToNull);
//$Section=Operation$mapFromResultSet$Preserve=no
  }

  public void mapFromResultSetTable( String aTable, ResultSet aResultSet, boolean aTrim, boolean aSpacesToNull) {
//$Section=Operation$mapFromResultSetTable$Preserve=no
    String lValue = null;
//$Section=Operation$mapFromResultSetTable$Preserve=no
  }
//----------------------------------------------------------------------------
// This section is for mapping from and to Jeo's.
//----------------------------------------------------------------------------

  public void mapToJeo( Jeo aJeo) {
//$Section=Operation$mapFromJeo$Preserve=no
    String lType = null;
    PropertyValue lValue = null;
//$Section=Operation$mapToJeo$Preserve=no
  }

  public void mapFromJeo( Jeo aJeo) {
//$Section=Operation$mapFromJeo$Preserve=no
    String lType = null;
    PropertyValue lValue = null;
//$Section=Operation$mapFromJeo$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for the get PropertyValue by attribute string name method.
//----------------------------------------------------------------------------

  public PropertyValue getPropertyValueByName ( String aAttributeName) {
//$Section=Operation$getPropertyValueByName$Preserve=no
      return null;
//$Section=Operation$getPropertyValueByName$Preserve=no
  }

  public String getTypeByName ( String aAttributeName) {
//$Section=Operation$getTypeByName$Preserve=no
      return null;
//$Section=Operation$getTypeByName$Preserve=no
  }

  public String getNameByIndex ( int aIndex) {
//$Section=Operation$getNameByIndex$Preserve=no

    switch(aIndex) {
    }
    return null;
//$Section=Operation$getNameByIndex$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------


//$Section=Deleted$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$Preserve=no

//End of class---------------
}
