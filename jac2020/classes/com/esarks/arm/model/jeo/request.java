//$Section=License$Preserve=no
//  Generated at 2005.01.29 08:57:22.875 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  XML Definition: com.esarks.arm.model.jeo.Service_Jeo
//     Module Name: com.esarks.arm.model.jeo.request

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

public class request extends com.esarks.jac.Jeo {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes

//SelectClause  Type: string  Size: 0  Nullable: true
    private PropertyValue iSelectClause = new PropertyValue();
    private boolean iSelectClauseIsNullable = true;
    private boolean iSelectClauseUpdate = false;
    private int iSelectClauseSize = 0;
//WhereClause  Type: string  Size: 0  Nullable: true
    private PropertyValue iWhereClause = new PropertyValue();
    private boolean iWhereClauseIsNullable = true;
    private boolean iWhereClauseUpdate = false;
    private int iWhereClauseSize = 0;
//OrderClause  Type: string  Size: 0  Nullable: true
    private PropertyValue iOrderClause = new PropertyValue();
    private boolean iOrderClauseIsNullable = true;
    private boolean iOrderClauseUpdate = false;
    private int iOrderClauseSize = 0;

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
    public request() {
      super("com.esarks.arm.model.jeo.request");
//$Section=DefaultConstructor$Preserve=yes
//$Section=DefaultConstructor$Preserve=no
    }

/**
 *
 */
    public request( Script aScript ) {
      super("com.esarks.arm.model.jeo.request", aScript);
//$Section=Operation$Jeo( String aScript )$Preserve=yes
//$Section=Operation$Jeo( String aScript )$Preserve=no
    }

/**
 *
 */
    public request( String aTypeName ) {
      super("com.esarks.arm.model.jeo.request", aTypeName);
//$Section=Operation$Jeo( String aTypeName )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName )$Preserve=no
    }

/**
 *
 */
    public request( String aTypeName, Script aScript ) {
      super("com.esarks.arm.model.jeo.request", aTypeName, aScript);
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
    iSelectClause = null;
    iWhereClause = null;
    iOrderClause = null;
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
      if (aTable.equals("*") || aTable.equals("")) {
// SelectClause in
        try {
          lValue = aResultSet.getString("selectClause");
          if (aResultSet.wasNull()) {
            setSelectClauseNull();
          } else {
            if (aTrim) lValue = lValue.trim();
            if (aSpacesToNull && lValue.length() == 0) {
              setSelectClauseNull();
            } else {
              setSelectClause(lValue);
            }
          }
        } catch (Throwable e) {}
// WhereClause in
        try {
          lValue = aResultSet.getString("whereClause");
          if (aResultSet.wasNull()) {
            setWhereClauseNull();
          } else {
            if (aTrim) lValue = lValue.trim();
            if (aSpacesToNull && lValue.length() == 0) {
              setWhereClauseNull();
            } else {
              setWhereClause(lValue);
            }
          }
        } catch (Throwable e) {}
// OrderClause in
        try {
          lValue = aResultSet.getString("orderClause");
          if (aResultSet.wasNull()) {
            setOrderClauseNull();
          } else {
            if (aTrim) lValue = lValue.trim();
            if (aSpacesToNull && lValue.length() == 0) {
              setOrderClauseNull();
            } else {
              setOrderClause(lValue);
            }
          }
        } catch (Throwable e) {}
      }
//$Section=Operation$mapFromResultSetTable$Preserve=no
  }
//----------------------------------------------------------------------------
// This section is for mapping from and to Jeo's.
//----------------------------------------------------------------------------

  public void mapToJeo( Jeo aJeo) {
//$Section=Operation$mapFromJeo$Preserve=no
    String lType = null;
    PropertyValue lValue = null;
// SelectClause
      try {
        lValue = aJeo.getPropertyValueByName("selectClause");
        if (lValue != null) {
          lType = aJeo.getTypeByName("selectClause");
          if (!isSelectClauseNull()) {
            lValue.reset(lType, getSelectClausePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// WhereClause
      try {
        lValue = aJeo.getPropertyValueByName("whereClause");
        if (lValue != null) {
          lType = aJeo.getTypeByName("whereClause");
          if (!isWhereClauseNull()) {
            lValue.reset(lType, getWhereClausePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// OrderClause
      try {
        lValue = aJeo.getPropertyValueByName("orderClause");
        if (lValue != null) {
          lType = aJeo.getTypeByName("orderClause");
          if (!isOrderClauseNull()) {
            lValue.reset(lType, getOrderClausePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
//$Section=Operation$mapToJeo$Preserve=no
  }

  public void mapFromJeo( Jeo aJeo) {
//$Section=Operation$mapFromJeo$Preserve=no
    String lType = null;
    PropertyValue lValue = null;
// SelectClause
      try {
        lValue = aJeo.getPropertyValueByName("selectClause");
        if (lValue != null) {
          setSelectClause(lValue);
        }
      } catch(Throwable e) {}
// WhereClause
      try {
        lValue = aJeo.getPropertyValueByName("whereClause");
        if (lValue != null) {
          setWhereClause(lValue);
        }
      } catch(Throwable e) {}
// OrderClause
      try {
        lValue = aJeo.getPropertyValueByName("orderClause");
        if (lValue != null) {
          setOrderClause(lValue);
        }
      } catch(Throwable e) {}
//$Section=Operation$mapFromJeo$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for the get PropertyValue by attribute string name method.
//----------------------------------------------------------------------------

  public PropertyValue getPropertyValueByName ( String aAttributeName) {
//$Section=Operation$getPropertyValueByName$Preserve=no
      if (aAttributeName.toLowerCase().equals("selectclause")) {
        return iSelectClause;
      }
      if (aAttributeName.toLowerCase().equals("whereclause")) {
        return iWhereClause;
      }
      if (aAttributeName.toLowerCase().equals("orderclause")) {
        return iOrderClause;
      }
      return null;
//$Section=Operation$getPropertyValueByName$Preserve=no
  }

  public String getTypeByName ( String aAttributeName) {
//$Section=Operation$getTypeByName$Preserve=no
      if (aAttributeName.toLowerCase().equals("selectclause")) {
        return "string";
      }
      if (aAttributeName.toLowerCase().equals("whereclause")) {
        return "string";
      }
      if (aAttributeName.toLowerCase().equals("orderclause")) {
        return "string";
      }
      return null;
//$Section=Operation$getTypeByName$Preserve=no
  }

  public String getNameByIndex ( int aIndex) {
//$Section=Operation$getNameByIndex$Preserve=no

    switch(aIndex) {
      case 1: return "selectclause";
      case 2: return "whereclause";
      case 3: return "orderclause";
    }
    return null;
//$Section=Operation$getNameByIndex$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
// SelectClause
//----------------------------------------------------------------------------
    public String getSelectClause() {
//$Section=Attribute get$SelectClause$Preserve=no
        return iSelectClause.getValueString();
//$Section=Attribute get$SelectClause$Preserve=no
    }
    public void setSelectClause(String aValue) {
//$Section=Attribute set$SelectClause$Preserve=no
        iSelectClause.reset(aValue);
//$Section=Attribute set$SelectClause$Preserve=no
    }
    public void setSelectClause(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$SelectClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setSelectClauseNull();
          return;
        }
        setSelectClause(aValue.toString());
//$Section=Attribute setPropertyValue$SelectClause$Preserve=no
    }
    public void setSelectClause(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$SelectClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setSelectClauseNull();
          return;
        }
        setSelectClause(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$SelectClause$Preserve=no
    }
    public void setSelectClause(String aValue, String aType) {
//$Section=Attribute setAsStringType$SelectClause$Preserve=no
        iSelectClause.reset(aType, aValue);
//$Section=Attribute setAsStringType$SelectClause$Preserve=no
    }
    public PropertyValue getSelectClausePropertyValue() {
//$Section=Attribute getPropertyValue$SelectClause$Preserve=no
        return iSelectClause;
//$Section=Attribute getPropertyValue$SelectClause$Preserve=no
    }
    public int sizeSelectClause() {
//$Section=Attribute size$SelectClause$Preserve=no
        return iSelectClauseSize;
//$Section=Attribute size$SelectClause$Preserve=no
    }
    public boolean isSelectClauseNullable() {
//$Section=Attribute isNullable$SelectClause$Preserve=no
        return iSelectClauseIsNullable;
//$Section=Attribute isNullable$SelectClause$Preserve=no
    }
    public boolean isSelectClauseNull() {
//$Section=Attribute isNull$SelectClause$Preserve=no
        if (iSelectClause.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$SelectClause$Preserve=no
    }
    public void setSelectClauseNull() {
//$Section=Attribute setNull$SelectClause$Preserve=no
        iSelectClause.reset();
//$Section=Attribute setNull$SelectClause$Preserve=no
    }
    public void setSelectClauseSpaceToNull() {
//$Section=Attribute setSpaceToNull$SelectClause$Preserve=no
        if (getSelectClausePropertyValue().toString().trim().equals("")) setSelectClauseNull();
//$Section=Attribute setSpaceToNull$SelectClause$Preserve=no
    }
    public void setSelectClauseUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$SelectClause$Preserve=no
        iSelectClauseUpdate = aUpdate;
//$Section=Attribute setUpdate$SelectClause$Preserve=no
    }
    public boolean getSelectClauseUpdate() {
//$Section=Attribute getUpdate$SelectClause$Preserve=no
        return iSelectClauseUpdate;
//$Section=Attribute getUpdate$SelectClause$Preserve=no
    }

//----------------------------------------------------------------------------
// WhereClause
//----------------------------------------------------------------------------
    public String getWhereClause() {
//$Section=Attribute get$WhereClause$Preserve=no
        return iWhereClause.getValueString();
//$Section=Attribute get$WhereClause$Preserve=no
    }
    public void setWhereClause(String aValue) {
//$Section=Attribute set$WhereClause$Preserve=no
        iWhereClause.reset(aValue);
//$Section=Attribute set$WhereClause$Preserve=no
    }
    public void setWhereClause(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$WhereClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setWhereClauseNull();
          return;
        }
        setWhereClause(aValue.toString());
//$Section=Attribute setPropertyValue$WhereClause$Preserve=no
    }
    public void setWhereClause(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$WhereClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setWhereClauseNull();
          return;
        }
        setWhereClause(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$WhereClause$Preserve=no
    }
    public void setWhereClause(String aValue, String aType) {
//$Section=Attribute setAsStringType$WhereClause$Preserve=no
        iWhereClause.reset(aType, aValue);
//$Section=Attribute setAsStringType$WhereClause$Preserve=no
    }
    public PropertyValue getWhereClausePropertyValue() {
//$Section=Attribute getPropertyValue$WhereClause$Preserve=no
        return iWhereClause;
//$Section=Attribute getPropertyValue$WhereClause$Preserve=no
    }
    public int sizeWhereClause() {
//$Section=Attribute size$WhereClause$Preserve=no
        return iWhereClauseSize;
//$Section=Attribute size$WhereClause$Preserve=no
    }
    public boolean isWhereClauseNullable() {
//$Section=Attribute isNullable$WhereClause$Preserve=no
        return iWhereClauseIsNullable;
//$Section=Attribute isNullable$WhereClause$Preserve=no
    }
    public boolean isWhereClauseNull() {
//$Section=Attribute isNull$WhereClause$Preserve=no
        if (iWhereClause.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$WhereClause$Preserve=no
    }
    public void setWhereClauseNull() {
//$Section=Attribute setNull$WhereClause$Preserve=no
        iWhereClause.reset();
//$Section=Attribute setNull$WhereClause$Preserve=no
    }
    public void setWhereClauseSpaceToNull() {
//$Section=Attribute setSpaceToNull$WhereClause$Preserve=no
        if (getWhereClausePropertyValue().toString().trim().equals("")) setWhereClauseNull();
//$Section=Attribute setSpaceToNull$WhereClause$Preserve=no
    }
    public void setWhereClauseUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$WhereClause$Preserve=no
        iWhereClauseUpdate = aUpdate;
//$Section=Attribute setUpdate$WhereClause$Preserve=no
    }
    public boolean getWhereClauseUpdate() {
//$Section=Attribute getUpdate$WhereClause$Preserve=no
        return iWhereClauseUpdate;
//$Section=Attribute getUpdate$WhereClause$Preserve=no
    }

//----------------------------------------------------------------------------
// OrderClause
//----------------------------------------------------------------------------
    public String getOrderClause() {
//$Section=Attribute get$OrderClause$Preserve=no
        return iOrderClause.getValueString();
//$Section=Attribute get$OrderClause$Preserve=no
    }
    public void setOrderClause(String aValue) {
//$Section=Attribute set$OrderClause$Preserve=no
        iOrderClause.reset(aValue);
//$Section=Attribute set$OrderClause$Preserve=no
    }
    public void setOrderClause(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$OrderClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setOrderClauseNull();
          return;
        }
        setOrderClause(aValue.toString());
//$Section=Attribute setPropertyValue$OrderClause$Preserve=no
    }
    public void setOrderClause(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$OrderClause$Preserve=no
        if (aValue.getType().equals("null")) {
          setOrderClauseNull();
          return;
        }
        setOrderClause(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$OrderClause$Preserve=no
    }
    public void setOrderClause(String aValue, String aType) {
//$Section=Attribute setAsStringType$OrderClause$Preserve=no
        iOrderClause.reset(aType, aValue);
//$Section=Attribute setAsStringType$OrderClause$Preserve=no
    }
    public PropertyValue getOrderClausePropertyValue() {
//$Section=Attribute getPropertyValue$OrderClause$Preserve=no
        return iOrderClause;
//$Section=Attribute getPropertyValue$OrderClause$Preserve=no
    }
    public int sizeOrderClause() {
//$Section=Attribute size$OrderClause$Preserve=no
        return iOrderClauseSize;
//$Section=Attribute size$OrderClause$Preserve=no
    }
    public boolean isOrderClauseNullable() {
//$Section=Attribute isNullable$OrderClause$Preserve=no
        return iOrderClauseIsNullable;
//$Section=Attribute isNullable$OrderClause$Preserve=no
    }
    public boolean isOrderClauseNull() {
//$Section=Attribute isNull$OrderClause$Preserve=no
        if (iOrderClause.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$OrderClause$Preserve=no
    }
    public void setOrderClauseNull() {
//$Section=Attribute setNull$OrderClause$Preserve=no
        iOrderClause.reset();
//$Section=Attribute setNull$OrderClause$Preserve=no
    }
    public void setOrderClauseSpaceToNull() {
//$Section=Attribute setSpaceToNull$OrderClause$Preserve=no
        if (getOrderClausePropertyValue().toString().trim().equals("")) setOrderClauseNull();
//$Section=Attribute setSpaceToNull$OrderClause$Preserve=no
    }
    public void setOrderClauseUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$OrderClause$Preserve=no
        iOrderClauseUpdate = aUpdate;
//$Section=Attribute setUpdate$OrderClause$Preserve=no
    }
    public boolean getOrderClauseUpdate() {
//$Section=Attribute getUpdate$OrderClause$Preserve=no
        return iOrderClauseUpdate;
//$Section=Attribute getUpdate$OrderClause$Preserve=no
    }


//$Section=Deleted$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$Preserve=no

//End of class---------------
}
