//$Section=License$Preserve=no
//  Generated at 2005.07.01 09:58:57.341 AM EDT by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  XML Definition: com.esarks.arm.logging.ExceptionJeo_Jeo
//     Module Name: com.esarks.arm.logging.ExceptionJeo

//$Section=ChangeLog$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$Preserve=no

package com.esarks.arm.logging;

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

public class ExceptionJeo extends com.esarks.jac.Jeo {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes

//Time  Type: datetime  Size: 0  Nullable: true
    private PropertyValue iTime = new PropertyValue();
    private boolean iTimeIsNullable = true;
    private boolean iTimeUpdate = false;
    private int iTimeSize = 0;
//Module  Type: string  Size: 0  Nullable: true
    private PropertyValue iModule = new PropertyValue();
    private boolean iModuleIsNullable = true;
    private boolean iModuleUpdate = false;
    private int iModuleSize = 0;
//Method  Type: string  Size: 0  Nullable: true
    private PropertyValue iMethod = new PropertyValue();
    private boolean iMethodIsNullable = true;
    private boolean iMethodUpdate = false;
    private int iMethodSize = 0;
//Severity  Type: string  Size: 0  Nullable: true
    private PropertyValue iSeverity = new PropertyValue();
    private boolean iSeverityIsNullable = true;
    private boolean iSeverityUpdate = false;
    private int iSeveritySize = 0;
//Location  Type: string  Size: 0  Nullable: true
    private PropertyValue iLocation = new PropertyValue();
    private boolean iLocationIsNullable = true;
    private boolean iLocationUpdate = false;
    private int iLocationSize = 0;
//Description  Type: string  Size: 0  Nullable: true
    private PropertyValue iDescription = new PropertyValue();
    private boolean iDescriptionIsNullable = true;
    private boolean iDescriptionUpdate = false;
    private int iDescriptionSize = 0;
//Action  Type: string  Size: 0  Nullable: true
    private PropertyValue iAction = new PropertyValue();
    private boolean iActionIsNullable = true;
    private boolean iActionUpdate = false;
    private int iActionSize = 0;
//Resolution  Type: string  Size: 0  Nullable: true
    private PropertyValue iResolution = new PropertyValue();
    private boolean iResolutionIsNullable = true;
    private boolean iResolutionUpdate = false;
    private int iResolutionSize = 0;

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
    public ExceptionJeo() {
      super("com.esarks.arm.logging.ExceptionJeo");
//$Section=DefaultConstructor$Preserve=yes
//$Section=DefaultConstructor$Preserve=no
    }

/**
 *
 */
    public ExceptionJeo( com.esarks.jac.JeoFactory aJeoFactory ) {
      super(aJeoFactory);
      init("com.esarks.arm.logging.ExceptionJeo");
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=yes
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=no
    }

/**
 *
 */
    public ExceptionJeo( Script aScript ) {
      super("com.esarks.arm.logging.ExceptionJeo", aScript);
//$Section=Operation$Jeo( String aScript )$Preserve=yes
//$Section=Operation$Jeo( String aScript )$Preserve=no
    }

/**
 *
 */
    public ExceptionJeo( String aTypeName ) {
      super("com.esarks.arm.logging.ExceptionJeo", aTypeName);
//$Section=Operation$Jeo( String aTypeName )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName )$Preserve=no
    }

/**
 *
 */
    public ExceptionJeo( String aTypeName, Script aScript ) {
      super("com.esarks.arm.logging.ExceptionJeo", aTypeName, aScript);
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
    iTime = null;
    iModule = null;
    iMethod = null;
    iSeverity = null;
    iLocation = null;
    iDescription = null;
    iAction = null;
    iResolution = null;
//$Section=DefaultFreeResources$Preserve=yes
//$Section=DefaultFreeResources$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------
//$Section=CustomOperations$Preserve=yes
//$Section=CustomOperations$Preserve=no

    public void init() {
    	super.init();
//Time
    iTime = new PropertyValue();
    iTimeUpdate = false;
//Module
    iModule = new PropertyValue();
    iModuleUpdate = false;
//Method
    iMethod = new PropertyValue();
    iMethodUpdate = false;
//Severity
    iSeverity = new PropertyValue();
    iSeverityUpdate = false;
//Location
    iLocation = new PropertyValue();
    iLocationUpdate = false;
//Description
    iDescription = new PropertyValue();
    iDescriptionUpdate = false;
//Action
    iAction = new PropertyValue();
    iActionUpdate = false;
//Resolution
    iResolution = new PropertyValue();
    iResolutionUpdate = false;
    }

//----------------------------------------------------------------------------
// This section is for mapping views to tables.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for mapping from and to Jeo's.
//----------------------------------------------------------------------------

  public void mapToJeo( Jeo aJeo) {
//$Section=Operation$mapFromJeo$Preserve=no
    String lType = null;
    PropertyValue lValue = null;
// Time
      try {
        lValue = aJeo.getPropertyValueByName("time");
        if (lValue != null) {
          lType = aJeo.getTypeByName("time");
          if (!isTimeNull()) {
            lValue.reset(lType, getTimePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Module
      try {
        lValue = aJeo.getPropertyValueByName("module");
        if (lValue != null) {
          lType = aJeo.getTypeByName("module");
          if (!isModuleNull()) {
            lValue.reset(lType, getModulePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Method
      try {
        lValue = aJeo.getPropertyValueByName("method");
        if (lValue != null) {
          lType = aJeo.getTypeByName("method");
          if (!isMethodNull()) {
            lValue.reset(lType, getMethodPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Severity
      try {
        lValue = aJeo.getPropertyValueByName("severity");
        if (lValue != null) {
          lType = aJeo.getTypeByName("severity");
          if (!isSeverityNull()) {
            lValue.reset(lType, getSeverityPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Location
      try {
        lValue = aJeo.getPropertyValueByName("location");
        if (lValue != null) {
          lType = aJeo.getTypeByName("location");
          if (!isLocationNull()) {
            lValue.reset(lType, getLocationPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Description
      try {
        lValue = aJeo.getPropertyValueByName("description");
        if (lValue != null) {
          lType = aJeo.getTypeByName("description");
          if (!isDescriptionNull()) {
            lValue.reset(lType, getDescriptionPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Action
      try {
        lValue = aJeo.getPropertyValueByName("action");
        if (lValue != null) {
          lType = aJeo.getTypeByName("action");
          if (!isActionNull()) {
            lValue.reset(lType, getActionPropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Resolution
      try {
        lValue = aJeo.getPropertyValueByName("resolution");
        if (lValue != null) {
          lType = aJeo.getTypeByName("resolution");
          if (!isResolutionNull()) {
            lValue.reset(lType, getResolutionPropertyValue().toString());
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
// Time
      try {
        lValue = aJeo.getPropertyValueByName("time");
        if (lValue != null) {
          setTime(lValue);
        }
      } catch(Throwable e) {}
// Module
      try {
        lValue = aJeo.getPropertyValueByName("module");
        if (lValue != null) {
          setModule(lValue);
        }
      } catch(Throwable e) {}
// Method
      try {
        lValue = aJeo.getPropertyValueByName("method");
        if (lValue != null) {
          setMethod(lValue);
        }
      } catch(Throwable e) {}
// Severity
      try {
        lValue = aJeo.getPropertyValueByName("severity");
        if (lValue != null) {
          setSeverity(lValue);
        }
      } catch(Throwable e) {}
// Location
      try {
        lValue = aJeo.getPropertyValueByName("location");
        if (lValue != null) {
          setLocation(lValue);
        }
      } catch(Throwable e) {}
// Description
      try {
        lValue = aJeo.getPropertyValueByName("description");
        if (lValue != null) {
          setDescription(lValue);
        }
      } catch(Throwable e) {}
// Action
      try {
        lValue = aJeo.getPropertyValueByName("action");
        if (lValue != null) {
          setAction(lValue);
        }
      } catch(Throwable e) {}
// Resolution
      try {
        lValue = aJeo.getPropertyValueByName("resolution");
        if (lValue != null) {
          setResolution(lValue);
        }
      } catch(Throwable e) {}
//$Section=Operation$mapFromJeo$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for the get by string name related methods.
//----------------------------------------------------------------------------

  public String getCasedName ( String aAttributeName) {
//$Section=Operation$getCasedName$Preserve=no

    try {
        Method lMethod = this.getClass().getMethod("getAttributeName_" + aAttributeName.toLowerCase(), null);
        return (String) lMethod.invoke(this, null);
    } catch (Throwable e) {
        //System.out.println(e);
        return null;
    }

//$Section=Operation$getCasedName$Preserve=no
  }

  public PropertyValue getPropertyValueByName ( String aAttributeName) {
//$Section=Operation$getPropertyValueByName$Preserve=no

    try {
        Method lMethod = this.getClass().getMethod("get" + getCasedName(aAttributeName) + "PropertyValue", null);
        return (PropertyValue) lMethod.invoke(this, null);
    } catch (Throwable e) {
        //System.out.println(e);
        return null;
    }

//$Section=Operation$getPropertyValueByName$Preserve=no
  }

  public void setStringValueByName ( String aAttributeName, String aValue) {
//$Section=Operation$setStringValueByName$Preserve=no

    try {
        Class lClassParams[] = new Class[]{"".getClass()};
        Object lArguments[] = new Object[] {aValue};
        Method lMethod = this.getClass().getMethod("set" + getCasedName(aAttributeName), lClassParams);
        lMethod.invoke(this, lArguments);
    } catch (Throwable e) {
        //System.out.println(e);
    }

//$Section=Operation$setStringValueByName$Preserve=no
  }

  public String getTypeByName ( String aAttributeName) {
//$Section=Operation$getTypeByName$Preserve=no

    try {
        Method lMethod = this.getClass().getMethod("get" + getCasedName(aAttributeName) + "ValueType", null);
        return (String) lMethod.invoke(this, null);
    } catch (Throwable e) {
        //System.out.println(e);
        return null;
    }

//$Section=Operation$getTypeByName$Preserve=no
  }

  public String getStereotypeByName ( String aAttributeName) {
//$Section=Operation$getStereotypeByName$Preserve=no

    try {
        Method lMethod = this.getClass().getMethod("get" + getCasedName(aAttributeName) + "ValueStereotype", null);
        return (String) lMethod.invoke(this, null);
    } catch (Throwable e) {
        //System.out.println(e);
        return null;
    }

//$Section=Operation$getStereotypeByName$Preserve=no
  }

  public String getNameByIndex ( int aIndex) {
//$Section=Operation$getNameByIndex$Preserve=no

    switch(aIndex) {
      case 1: return "time";
      case 2: return "module";
      case 3: return "method";
      case 4: return "severity";
      case 5: return "location";
      case 6: return "description";
      case 7: return "action";
      case 8: return "resolution";
    }
    return null;
//$Section=Operation$getNameByIndex$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
// Time
//----------------------------------------------------------------------------
    public java.sql.Timestamp getTime() {
//$Section=Attribute get$Time$Preserve=no
        return iTime.getValueTimestamp();
//$Section=Attribute get$Time$Preserve=no
    }
    public java.sql.Timestamp getTime(java.sql.Timestamp aValue) {
//$Section=Attribute get$Time(java.sql.Timestamp)$Preserve=no
      if (isTimeNull()) return aValue;
      return iTime.getValueTimestamp();
//$Section=Attribute get$Time(java.sql.Timestamp)$Preserve=no
    }
    public void setTime(java.sql.Timestamp aValue) {
//$Section=Attribute set$Time$Preserve=no
        iTime.reset(aValue);
//$Section=Attribute set$Time$Preserve=no
    }
    public void setTime(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Time$Preserve=no
        if (aValue.getType().equals("null")) {
          setTimeNull();
          return;
        }
        setTime(aValue.toString());
//$Section=Attribute setPropertyValue$Time$Preserve=no
    }
    public void setTime(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Time$Preserve=no
        if (aValue.getType().equals("null")) {
          setTimeNull();
          return;
        }
        setTime(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Time$Preserve=no
    }
    public void setTime(String aValue) {
//$Section=Attribute setAsString$Time$Preserve=no
        iTime.reset("timestamp:yyyy-MM-dd HH:mm:ss.S", aValue);
//$Section=Attribute setAsString$Time$Preserve=no
    }
    public void setTime(String aValue, String aType) {
//$Section=Attribute setAsStringType$Time$Preserve=no
        iTime.reset(aType, aValue);
//$Section=Attribute setAsStringType$Time$Preserve=no
    }
    public PropertyValue getTimePropertyValue() {
//$Section=Attribute getPropertyValue$Time$Preserve=no
        return iTime;
//$Section=Attribute getPropertyValue$Time$Preserve=no
    }
    public String getAttributeName_time() {
//$Section=Attribute getAttributeName$time$Preserve=no
        return "Time";
//$Section=Attribute getAttributeName_$time$Preserve=no
    }
    public int sizeTime() {
//$Section=Attribute size$Time$Preserve=no
        return iTimeSize;
//$Section=Attribute size$Time$Preserve=no
    }
    public boolean isTimeNullable() {
//$Section=Attribute isNullable$Time$Preserve=no
        return iTimeIsNullable;
//$Section=Attribute isNullable$Time$Preserve=no
    }
    public boolean isTimeNull() {
//$Section=Attribute isNull$Time$Preserve=no
        if (iTime.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Time$Preserve=no
    }
    public void setTimeNull() {
//$Section=Attribute setNull$Time$Preserve=no
        iTime.reset();
//$Section=Attribute setNull$Time$Preserve=no
    }
    public void setTimeSpaceToNull() {
//$Section=Attribute setSpaceToNull$Time$Preserve=no
        if (getTimePropertyValue().toString().trim().equals("")) setTimeNull();
//$Section=Attribute setSpaceToNull$Time$Preserve=no
    }
    public void setTimeUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Time$Preserve=no
        iTimeUpdate = aUpdate;
//$Section=Attribute setUpdate$Time$Preserve=no
    }
    public boolean getTimeUpdate() {
//$Section=Attribute getUpdate$Time$Preserve=no
        return iTimeUpdate;
//$Section=Attribute getUpdate$Time$Preserve=no
    }
    public String getTimeValueType() {
//$Section=Attribute getValueType$Time$Preserve=no
        return "datetime";
//$Section=Attribute getValueType$Time$Preserve=no
    }
    public String getTimeValueStereotype() {
//$Section=Attribute getValueStereotype$Time$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Time$Preserve=no
    }

//----------------------------------------------------------------------------
// Module
//----------------------------------------------------------------------------
    public String getModule() {
//$Section=Attribute get$Module$Preserve=no
        return iModule.getValueString();
//$Section=Attribute get$Module$Preserve=no
    }
    public String getModule(String aValue) {
//$Section=Attribute get$Module(String)$Preserve=no
      if (isModuleNull()) return aValue;
      return iModule.getValueString();
//$Section=Attribute get$Module(String)$Preserve=no
    }
    public void setModule(String aValue) {
//$Section=Attribute set$Module$Preserve=no
        iModule.reset(aValue);
//$Section=Attribute set$Module$Preserve=no
    }
    public void setModule(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Module$Preserve=no
        if (aValue.getType().equals("null")) {
          setModuleNull();
          return;
        }
        setModule(aValue.toString());
//$Section=Attribute setPropertyValue$Module$Preserve=no
    }
    public void setModule(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Module$Preserve=no
        if (aValue.getType().equals("null")) {
          setModuleNull();
          return;
        }
        setModule(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Module$Preserve=no
    }
    public void setModule(String aValue, String aType) {
//$Section=Attribute setAsStringType$Module$Preserve=no
        iModule.reset(aType, aValue);
//$Section=Attribute setAsStringType$Module$Preserve=no
    }
    public PropertyValue getModulePropertyValue() {
//$Section=Attribute getPropertyValue$Module$Preserve=no
        return iModule;
//$Section=Attribute getPropertyValue$Module$Preserve=no
    }
    public String getAttributeName_module() {
//$Section=Attribute getAttributeName$module$Preserve=no
        return "Module";
//$Section=Attribute getAttributeName_$module$Preserve=no
    }
    public int sizeModule() {
//$Section=Attribute size$Module$Preserve=no
        return iModuleSize;
//$Section=Attribute size$Module$Preserve=no
    }
    public boolean isModuleNullable() {
//$Section=Attribute isNullable$Module$Preserve=no
        return iModuleIsNullable;
//$Section=Attribute isNullable$Module$Preserve=no
    }
    public boolean isModuleNull() {
//$Section=Attribute isNull$Module$Preserve=no
        if (iModule.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Module$Preserve=no
    }
    public void setModuleNull() {
//$Section=Attribute setNull$Module$Preserve=no
        iModule.reset();
//$Section=Attribute setNull$Module$Preserve=no
    }
    public void setModuleSpaceToNull() {
//$Section=Attribute setSpaceToNull$Module$Preserve=no
        if (getModulePropertyValue().toString().trim().equals("")) setModuleNull();
//$Section=Attribute setSpaceToNull$Module$Preserve=no
    }
    public void setModuleUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Module$Preserve=no
        iModuleUpdate = aUpdate;
//$Section=Attribute setUpdate$Module$Preserve=no
    }
    public boolean getModuleUpdate() {
//$Section=Attribute getUpdate$Module$Preserve=no
        return iModuleUpdate;
//$Section=Attribute getUpdate$Module$Preserve=no
    }
    public String getModuleValueType() {
//$Section=Attribute getValueType$Module$Preserve=no
        return "string";
//$Section=Attribute getValueType$Module$Preserve=no
    }
    public String getModuleValueStereotype() {
//$Section=Attribute getValueStereotype$Module$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Module$Preserve=no
    }

//----------------------------------------------------------------------------
// Method
//----------------------------------------------------------------------------
    public String getMethod() {
//$Section=Attribute get$Method$Preserve=no
        return iMethod.getValueString();
//$Section=Attribute get$Method$Preserve=no
    }
    public String getMethod(String aValue) {
//$Section=Attribute get$Method(String)$Preserve=no
      if (isMethodNull()) return aValue;
      return iMethod.getValueString();
//$Section=Attribute get$Method(String)$Preserve=no
    }
    public void setMethod(String aValue) {
//$Section=Attribute set$Method$Preserve=no
        iMethod.reset(aValue);
//$Section=Attribute set$Method$Preserve=no
    }
    public void setMethod(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Method$Preserve=no
        if (aValue.getType().equals("null")) {
          setMethodNull();
          return;
        }
        setMethod(aValue.toString());
//$Section=Attribute setPropertyValue$Method$Preserve=no
    }
    public void setMethod(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Method$Preserve=no
        if (aValue.getType().equals("null")) {
          setMethodNull();
          return;
        }
        setMethod(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Method$Preserve=no
    }
    public void setMethod(String aValue, String aType) {
//$Section=Attribute setAsStringType$Method$Preserve=no
        iMethod.reset(aType, aValue);
//$Section=Attribute setAsStringType$Method$Preserve=no
    }
    public PropertyValue getMethodPropertyValue() {
//$Section=Attribute getPropertyValue$Method$Preserve=no
        return iMethod;
//$Section=Attribute getPropertyValue$Method$Preserve=no
    }
    public String getAttributeName_method() {
//$Section=Attribute getAttributeName$method$Preserve=no
        return "Method";
//$Section=Attribute getAttributeName_$method$Preserve=no
    }
    public int sizeMethod() {
//$Section=Attribute size$Method$Preserve=no
        return iMethodSize;
//$Section=Attribute size$Method$Preserve=no
    }
    public boolean isMethodNullable() {
//$Section=Attribute isNullable$Method$Preserve=no
        return iMethodIsNullable;
//$Section=Attribute isNullable$Method$Preserve=no
    }
    public boolean isMethodNull() {
//$Section=Attribute isNull$Method$Preserve=no
        if (iMethod.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Method$Preserve=no
    }
    public void setMethodNull() {
//$Section=Attribute setNull$Method$Preserve=no
        iMethod.reset();
//$Section=Attribute setNull$Method$Preserve=no
    }
    public void setMethodSpaceToNull() {
//$Section=Attribute setSpaceToNull$Method$Preserve=no
        if (getMethodPropertyValue().toString().trim().equals("")) setMethodNull();
//$Section=Attribute setSpaceToNull$Method$Preserve=no
    }
    public void setMethodUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Method$Preserve=no
        iMethodUpdate = aUpdate;
//$Section=Attribute setUpdate$Method$Preserve=no
    }
    public boolean getMethodUpdate() {
//$Section=Attribute getUpdate$Method$Preserve=no
        return iMethodUpdate;
//$Section=Attribute getUpdate$Method$Preserve=no
    }
    public String getMethodValueType() {
//$Section=Attribute getValueType$Method$Preserve=no
        return "string";
//$Section=Attribute getValueType$Method$Preserve=no
    }
    public String getMethodValueStereotype() {
//$Section=Attribute getValueStereotype$Method$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Method$Preserve=no
    }

//----------------------------------------------------------------------------
// Severity
//----------------------------------------------------------------------------
    public String getSeverity() {
//$Section=Attribute get$Severity$Preserve=no
        return iSeverity.getValueString();
//$Section=Attribute get$Severity$Preserve=no
    }
    public String getSeverity(String aValue) {
//$Section=Attribute get$Severity(String)$Preserve=no
      if (isSeverityNull()) return aValue;
      return iSeverity.getValueString();
//$Section=Attribute get$Severity(String)$Preserve=no
    }
    public void setSeverity(String aValue) {
//$Section=Attribute set$Severity$Preserve=no
        iSeverity.reset(aValue);
//$Section=Attribute set$Severity$Preserve=no
    }
    public void setSeverity(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Severity$Preserve=no
        if (aValue.getType().equals("null")) {
          setSeverityNull();
          return;
        }
        setSeverity(aValue.toString());
//$Section=Attribute setPropertyValue$Severity$Preserve=no
    }
    public void setSeverity(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Severity$Preserve=no
        if (aValue.getType().equals("null")) {
          setSeverityNull();
          return;
        }
        setSeverity(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Severity$Preserve=no
    }
    public void setSeverity(String aValue, String aType) {
//$Section=Attribute setAsStringType$Severity$Preserve=no
        iSeverity.reset(aType, aValue);
//$Section=Attribute setAsStringType$Severity$Preserve=no
    }
    public PropertyValue getSeverityPropertyValue() {
//$Section=Attribute getPropertyValue$Severity$Preserve=no
        return iSeverity;
//$Section=Attribute getPropertyValue$Severity$Preserve=no
    }
    public String getAttributeName_severity() {
//$Section=Attribute getAttributeName$severity$Preserve=no
        return "Severity";
//$Section=Attribute getAttributeName_$severity$Preserve=no
    }
    public int sizeSeverity() {
//$Section=Attribute size$Severity$Preserve=no
        return iSeveritySize;
//$Section=Attribute size$Severity$Preserve=no
    }
    public boolean isSeverityNullable() {
//$Section=Attribute isNullable$Severity$Preserve=no
        return iSeverityIsNullable;
//$Section=Attribute isNullable$Severity$Preserve=no
    }
    public boolean isSeverityNull() {
//$Section=Attribute isNull$Severity$Preserve=no
        if (iSeverity.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Severity$Preserve=no
    }
    public void setSeverityNull() {
//$Section=Attribute setNull$Severity$Preserve=no
        iSeverity.reset();
//$Section=Attribute setNull$Severity$Preserve=no
    }
    public void setSeveritySpaceToNull() {
//$Section=Attribute setSpaceToNull$Severity$Preserve=no
        if (getSeverityPropertyValue().toString().trim().equals("")) setSeverityNull();
//$Section=Attribute setSpaceToNull$Severity$Preserve=no
    }
    public void setSeverityUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Severity$Preserve=no
        iSeverityUpdate = aUpdate;
//$Section=Attribute setUpdate$Severity$Preserve=no
    }
    public boolean getSeverityUpdate() {
//$Section=Attribute getUpdate$Severity$Preserve=no
        return iSeverityUpdate;
//$Section=Attribute getUpdate$Severity$Preserve=no
    }
    public String getSeverityValueType() {
//$Section=Attribute getValueType$Severity$Preserve=no
        return "string";
//$Section=Attribute getValueType$Severity$Preserve=no
    }
    public String getSeverityValueStereotype() {
//$Section=Attribute getValueStereotype$Severity$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Severity$Preserve=no
    }

//----------------------------------------------------------------------------
// Location
//----------------------------------------------------------------------------
    public String getLocation() {
//$Section=Attribute get$Location$Preserve=no
        return iLocation.getValueString();
//$Section=Attribute get$Location$Preserve=no
    }
    public String getLocation(String aValue) {
//$Section=Attribute get$Location(String)$Preserve=no
      if (isLocationNull()) return aValue;
      return iLocation.getValueString();
//$Section=Attribute get$Location(String)$Preserve=no
    }
    public void setLocation(String aValue) {
//$Section=Attribute set$Location$Preserve=no
        iLocation.reset(aValue);
//$Section=Attribute set$Location$Preserve=no
    }
    public void setLocation(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Location$Preserve=no
        if (aValue.getType().equals("null")) {
          setLocationNull();
          return;
        }
        setLocation(aValue.toString());
//$Section=Attribute setPropertyValue$Location$Preserve=no
    }
    public void setLocation(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Location$Preserve=no
        if (aValue.getType().equals("null")) {
          setLocationNull();
          return;
        }
        setLocation(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Location$Preserve=no
    }
    public void setLocation(String aValue, String aType) {
//$Section=Attribute setAsStringType$Location$Preserve=no
        iLocation.reset(aType, aValue);
//$Section=Attribute setAsStringType$Location$Preserve=no
    }
    public PropertyValue getLocationPropertyValue() {
//$Section=Attribute getPropertyValue$Location$Preserve=no
        return iLocation;
//$Section=Attribute getPropertyValue$Location$Preserve=no
    }
    public String getAttributeName_location() {
//$Section=Attribute getAttributeName$location$Preserve=no
        return "Location";
//$Section=Attribute getAttributeName_$location$Preserve=no
    }
    public int sizeLocation() {
//$Section=Attribute size$Location$Preserve=no
        return iLocationSize;
//$Section=Attribute size$Location$Preserve=no
    }
    public boolean isLocationNullable() {
//$Section=Attribute isNullable$Location$Preserve=no
        return iLocationIsNullable;
//$Section=Attribute isNullable$Location$Preserve=no
    }
    public boolean isLocationNull() {
//$Section=Attribute isNull$Location$Preserve=no
        if (iLocation.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Location$Preserve=no
    }
    public void setLocationNull() {
//$Section=Attribute setNull$Location$Preserve=no
        iLocation.reset();
//$Section=Attribute setNull$Location$Preserve=no
    }
    public void setLocationSpaceToNull() {
//$Section=Attribute setSpaceToNull$Location$Preserve=no
        if (getLocationPropertyValue().toString().trim().equals("")) setLocationNull();
//$Section=Attribute setSpaceToNull$Location$Preserve=no
    }
    public void setLocationUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Location$Preserve=no
        iLocationUpdate = aUpdate;
//$Section=Attribute setUpdate$Location$Preserve=no
    }
    public boolean getLocationUpdate() {
//$Section=Attribute getUpdate$Location$Preserve=no
        return iLocationUpdate;
//$Section=Attribute getUpdate$Location$Preserve=no
    }
    public String getLocationValueType() {
//$Section=Attribute getValueType$Location$Preserve=no
        return "string";
//$Section=Attribute getValueType$Location$Preserve=no
    }
    public String getLocationValueStereotype() {
//$Section=Attribute getValueStereotype$Location$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Location$Preserve=no
    }

//----------------------------------------------------------------------------
// Description
//----------------------------------------------------------------------------
    public String getDescription() {
//$Section=Attribute get$Description$Preserve=no
        return iDescription.getValueString();
//$Section=Attribute get$Description$Preserve=no
    }
    public String getDescription(String aValue) {
//$Section=Attribute get$Description(String)$Preserve=no
      if (isDescriptionNull()) return aValue;
      return iDescription.getValueString();
//$Section=Attribute get$Description(String)$Preserve=no
    }
    public void setDescription(String aValue) {
//$Section=Attribute set$Description$Preserve=no
        iDescription.reset(aValue);
//$Section=Attribute set$Description$Preserve=no
    }
    public void setDescription(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Description$Preserve=no
        if (aValue.getType().equals("null")) {
          setDescriptionNull();
          return;
        }
        setDescription(aValue.toString());
//$Section=Attribute setPropertyValue$Description$Preserve=no
    }
    public void setDescription(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Description$Preserve=no
        if (aValue.getType().equals("null")) {
          setDescriptionNull();
          return;
        }
        setDescription(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Description$Preserve=no
    }
    public void setDescription(String aValue, String aType) {
//$Section=Attribute setAsStringType$Description$Preserve=no
        iDescription.reset(aType, aValue);
//$Section=Attribute setAsStringType$Description$Preserve=no
    }
    public PropertyValue getDescriptionPropertyValue() {
//$Section=Attribute getPropertyValue$Description$Preserve=no
        return iDescription;
//$Section=Attribute getPropertyValue$Description$Preserve=no
    }
    public String getAttributeName_description() {
//$Section=Attribute getAttributeName$description$Preserve=no
        return "Description";
//$Section=Attribute getAttributeName_$description$Preserve=no
    }
    public int sizeDescription() {
//$Section=Attribute size$Description$Preserve=no
        return iDescriptionSize;
//$Section=Attribute size$Description$Preserve=no
    }
    public boolean isDescriptionNullable() {
//$Section=Attribute isNullable$Description$Preserve=no
        return iDescriptionIsNullable;
//$Section=Attribute isNullable$Description$Preserve=no
    }
    public boolean isDescriptionNull() {
//$Section=Attribute isNull$Description$Preserve=no
        if (iDescription.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Description$Preserve=no
    }
    public void setDescriptionNull() {
//$Section=Attribute setNull$Description$Preserve=no
        iDescription.reset();
//$Section=Attribute setNull$Description$Preserve=no
    }
    public void setDescriptionSpaceToNull() {
//$Section=Attribute setSpaceToNull$Description$Preserve=no
        if (getDescriptionPropertyValue().toString().trim().equals("")) setDescriptionNull();
//$Section=Attribute setSpaceToNull$Description$Preserve=no
    }
    public void setDescriptionUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Description$Preserve=no
        iDescriptionUpdate = aUpdate;
//$Section=Attribute setUpdate$Description$Preserve=no
    }
    public boolean getDescriptionUpdate() {
//$Section=Attribute getUpdate$Description$Preserve=no
        return iDescriptionUpdate;
//$Section=Attribute getUpdate$Description$Preserve=no
    }
    public String getDescriptionValueType() {
//$Section=Attribute getValueType$Description$Preserve=no
        return "string";
//$Section=Attribute getValueType$Description$Preserve=no
    }
    public String getDescriptionValueStereotype() {
//$Section=Attribute getValueStereotype$Description$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Description$Preserve=no
    }

//----------------------------------------------------------------------------
// Action
//----------------------------------------------------------------------------
    public String getAction() {
//$Section=Attribute get$Action$Preserve=no
        return iAction.getValueString();
//$Section=Attribute get$Action$Preserve=no
    }
    public String getAction(String aValue) {
//$Section=Attribute get$Action(String)$Preserve=no
      if (isActionNull()) return aValue;
      return iAction.getValueString();
//$Section=Attribute get$Action(String)$Preserve=no
    }
    public void setAction(String aValue) {
//$Section=Attribute set$Action$Preserve=no
        iAction.reset(aValue);
//$Section=Attribute set$Action$Preserve=no
    }
    public void setAction(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Action$Preserve=no
        if (aValue.getType().equals("null")) {
          setActionNull();
          return;
        }
        setAction(aValue.toString());
//$Section=Attribute setPropertyValue$Action$Preserve=no
    }
    public void setAction(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Action$Preserve=no
        if (aValue.getType().equals("null")) {
          setActionNull();
          return;
        }
        setAction(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Action$Preserve=no
    }
    public void setAction(String aValue, String aType) {
//$Section=Attribute setAsStringType$Action$Preserve=no
        iAction.reset(aType, aValue);
//$Section=Attribute setAsStringType$Action$Preserve=no
    }
    public PropertyValue getActionPropertyValue() {
//$Section=Attribute getPropertyValue$Action$Preserve=no
        return iAction;
//$Section=Attribute getPropertyValue$Action$Preserve=no
    }
    public String getAttributeName_action() {
//$Section=Attribute getAttributeName$action$Preserve=no
        return "Action";
//$Section=Attribute getAttributeName_$action$Preserve=no
    }
    public int sizeAction() {
//$Section=Attribute size$Action$Preserve=no
        return iActionSize;
//$Section=Attribute size$Action$Preserve=no
    }
    public boolean isActionNullable() {
//$Section=Attribute isNullable$Action$Preserve=no
        return iActionIsNullable;
//$Section=Attribute isNullable$Action$Preserve=no
    }
    public boolean isActionNull() {
//$Section=Attribute isNull$Action$Preserve=no
        if (iAction.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Action$Preserve=no
    }
    public void setActionNull() {
//$Section=Attribute setNull$Action$Preserve=no
        iAction.reset();
//$Section=Attribute setNull$Action$Preserve=no
    }
    public void setActionSpaceToNull() {
//$Section=Attribute setSpaceToNull$Action$Preserve=no
        if (getActionPropertyValue().toString().trim().equals("")) setActionNull();
//$Section=Attribute setSpaceToNull$Action$Preserve=no
    }
    public void setActionUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Action$Preserve=no
        iActionUpdate = aUpdate;
//$Section=Attribute setUpdate$Action$Preserve=no
    }
    public boolean getActionUpdate() {
//$Section=Attribute getUpdate$Action$Preserve=no
        return iActionUpdate;
//$Section=Attribute getUpdate$Action$Preserve=no
    }
    public String getActionValueType() {
//$Section=Attribute getValueType$Action$Preserve=no
        return "string";
//$Section=Attribute getValueType$Action$Preserve=no
    }
    public String getActionValueStereotype() {
//$Section=Attribute getValueStereotype$Action$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Action$Preserve=no
    }

//----------------------------------------------------------------------------
// Resolution
//----------------------------------------------------------------------------
    public String getResolution() {
//$Section=Attribute get$Resolution$Preserve=no
        return iResolution.getValueString();
//$Section=Attribute get$Resolution$Preserve=no
    }
    public String getResolution(String aValue) {
//$Section=Attribute get$Resolution(String)$Preserve=no
      if (isResolutionNull()) return aValue;
      return iResolution.getValueString();
//$Section=Attribute get$Resolution(String)$Preserve=no
    }
    public void setResolution(String aValue) {
//$Section=Attribute set$Resolution$Preserve=no
        iResolution.reset(aValue);
//$Section=Attribute set$Resolution$Preserve=no
    }
    public void setResolution(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Resolution$Preserve=no
        if (aValue.getType().equals("null")) {
          setResolutionNull();
          return;
        }
        setResolution(aValue.toString());
//$Section=Attribute setPropertyValue$Resolution$Preserve=no
    }
    public void setResolution(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Resolution$Preserve=no
        if (aValue.getType().equals("null")) {
          setResolutionNull();
          return;
        }
        setResolution(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Resolution$Preserve=no
    }
    public void setResolution(String aValue, String aType) {
//$Section=Attribute setAsStringType$Resolution$Preserve=no
        iResolution.reset(aType, aValue);
//$Section=Attribute setAsStringType$Resolution$Preserve=no
    }
    public PropertyValue getResolutionPropertyValue() {
//$Section=Attribute getPropertyValue$Resolution$Preserve=no
        return iResolution;
//$Section=Attribute getPropertyValue$Resolution$Preserve=no
    }
    public String getAttributeName_resolution() {
//$Section=Attribute getAttributeName$resolution$Preserve=no
        return "Resolution";
//$Section=Attribute getAttributeName_$resolution$Preserve=no
    }
    public int sizeResolution() {
//$Section=Attribute size$Resolution$Preserve=no
        return iResolutionSize;
//$Section=Attribute size$Resolution$Preserve=no
    }
    public boolean isResolutionNullable() {
//$Section=Attribute isNullable$Resolution$Preserve=no
        return iResolutionIsNullable;
//$Section=Attribute isNullable$Resolution$Preserve=no
    }
    public boolean isResolutionNull() {
//$Section=Attribute isNull$Resolution$Preserve=no
        if (iResolution.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Resolution$Preserve=no
    }
    public void setResolutionNull() {
//$Section=Attribute setNull$Resolution$Preserve=no
        iResolution.reset();
//$Section=Attribute setNull$Resolution$Preserve=no
    }
    public void setResolutionSpaceToNull() {
//$Section=Attribute setSpaceToNull$Resolution$Preserve=no
        if (getResolutionPropertyValue().toString().trim().equals("")) setResolutionNull();
//$Section=Attribute setSpaceToNull$Resolution$Preserve=no
    }
    public void setResolutionUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Resolution$Preserve=no
        iResolutionUpdate = aUpdate;
//$Section=Attribute setUpdate$Resolution$Preserve=no
    }
    public boolean getResolutionUpdate() {
//$Section=Attribute getUpdate$Resolution$Preserve=no
        return iResolutionUpdate;
//$Section=Attribute getUpdate$Resolution$Preserve=no
    }
    public String getResolutionValueType() {
//$Section=Attribute getValueType$Resolution$Preserve=no
        return "string";
//$Section=Attribute getValueType$Resolution$Preserve=no
    }
    public String getResolutionValueStereotype() {
//$Section=Attribute getValueStereotype$Resolution$Preserve=no
        return "";
//$Section=Attribute getValueStereotype$Resolution$Preserve=no
    }


//$Section=Deleted$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$Preserve=no

//End of class---------------
}
