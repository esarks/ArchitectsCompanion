//$Section=License$Preserve=no
//  Generated at 2005.01.29 03:47:52.781 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  XML Definition: com.esarks.arm.model.jeo.Service_Jeo
//     Module Name: com.esarks.arm.model.jeo.error

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

public class error extends com.esarks.jac.Jeo {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes

//Id  Type: string  Size: 0  Nullable: true
    private PropertyValue iId = new PropertyValue();
    private boolean iIdIsNullable = true;
    private boolean iIdUpdate = false;
    private int iIdSize = 0;
//Location  Type: string  Size: 0  Nullable: true
    private PropertyValue iLocation = new PropertyValue();
    private boolean iLocationIsNullable = true;
    private boolean iLocationUpdate = false;
    private int iLocationSize = 0;
//Title  Type: string  Size: 0  Nullable: true
    private PropertyValue iTitle = new PropertyValue();
    private boolean iTitleIsNullable = true;
    private boolean iTitleUpdate = false;
    private int iTitleSize = 0;
//Text  Type: string  Size: 0  Nullable: true
    private PropertyValue iText = new PropertyValue();
    private boolean iTextIsNullable = true;
    private boolean iTextUpdate = false;
    private int iTextSize = 0;
//Resolution  Type: string  Size: 0  Nullable: true
    private PropertyValue iResolution = new PropertyValue();
    private boolean iResolutionIsNullable = true;
    private boolean iResolutionUpdate = false;
    private int iResolutionSize = 0;
//Severity  Type: int  Size: 0  Nullable: true
    private PropertyValue iSeverity = new PropertyValue();
    private boolean iSeverityIsNullable = true;
    private boolean iSeverityUpdate = false;
    private int iSeveritySize = 0;

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
    public error() {
      super("com.esarks.arm.model.jeo.error");
//$Section=DefaultConstructor$Preserve=yes
//$Section=DefaultConstructor$Preserve=no
    }

/**
 *
 */
    public error( Script aScript ) {
      super("com.esarks.arm.model.jeo.error", aScript);
//$Section=Operation$Jeo( String aScript )$Preserve=yes
//$Section=Operation$Jeo( String aScript )$Preserve=no
    }

/**
 *
 */
    public error( String aTypeName ) {
      super("com.esarks.arm.model.jeo.error", aTypeName);
//$Section=Operation$Jeo( String aTypeName )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName )$Preserve=no
    }

/**
 *
 */
    public error( String aTypeName, Script aScript ) {
      super("com.esarks.arm.model.jeo.error", aTypeName, aScript);
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
    iId = null;
    iLocation = null;
    iTitle = null;
    iText = null;
    iResolution = null;
    iSeverity = null;
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
// Id in
        try {
          lValue = aResultSet.getString("id");
          if (aResultSet.wasNull()) {
            setIdNull();
          } else {
            if (aTrim) lValue = lValue.trim();
            if (aSpacesToNull && lValue.length() == 0) {
              setIdNull();
            } else {
              setId(lValue);
            }
          }
        } catch (Throwable e) {}
// Location in
        try {
          lValue = aResultSet.getString("location");
          if (aResultSet.wasNull()) {
            setLocationNull();
          } else {
            if (aTrim) lValue = lValue.trim();
            if (aSpacesToNull && lValue.length() == 0) {
              setLocationNull();
            } else {
              setLocation(lValue);
            }
          }
        } catch (Throwable e) {}
// Title in
        try {
          lValue = aResultSet.getString("title");
          if (aResultSet.wasNull()) {
            setTitleNull();
          } else {
            if (aTrim) lValue = lValue.trim();
            if (aSpacesToNull && lValue.length() == 0) {
              setTitleNull();
            } else {
              setTitle(lValue);
            }
          }
        } catch (Throwable e) {}
// Text in
        try {
          lValue = aResultSet.getString("text");
          if (aResultSet.wasNull()) {
            setTextNull();
          } else {
            if (aTrim) lValue = lValue.trim();
            if (aSpacesToNull && lValue.length() == 0) {
              setTextNull();
            } else {
              setText(lValue);
            }
          }
        } catch (Throwable e) {}
// Resolution in
        try {
          lValue = aResultSet.getString("resolution");
          if (aResultSet.wasNull()) {
            setResolutionNull();
          } else {
            if (aTrim) lValue = lValue.trim();
            if (aSpacesToNull && lValue.length() == 0) {
              setResolutionNull();
            } else {
              setResolution(lValue);
            }
          }
        } catch (Throwable e) {}
// Severity in
        try {
          lValue = aResultSet.getString("severity");
          if (aResultSet.wasNull()) {
            setSeverityNull();
          } else {
            if (aTrim) lValue = lValue.trim();
            if (aSpacesToNull && lValue.length() == 0) {
              setSeverityNull();
            } else {
              setSeverity(lValue);
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
// Id
      try {
        lValue = aJeo.getPropertyValueByName("id");
        if (lValue != null) {
          lType = aJeo.getTypeByName("id");
          if (!isIdNull()) {
            lValue.reset(lType, getIdPropertyValue().toString());
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
// Title
      try {
        lValue = aJeo.getPropertyValueByName("title");
        if (lValue != null) {
          lType = aJeo.getTypeByName("title");
          if (!isTitleNull()) {
            lValue.reset(lType, getTitlePropertyValue().toString());
          } else {
            lValue.reset("null", "");
          }
        }
      } catch(Throwable e) {}
// Text
      try {
        lValue = aJeo.getPropertyValueByName("text");
        if (lValue != null) {
          lType = aJeo.getTypeByName("text");
          if (!isTextNull()) {
            lValue.reset(lType, getTextPropertyValue().toString());
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
//$Section=Operation$mapToJeo$Preserve=no
  }

  public void mapFromJeo( Jeo aJeo) {
//$Section=Operation$mapFromJeo$Preserve=no
    String lType = null;
    PropertyValue lValue = null;
// Id
      try {
        lValue = aJeo.getPropertyValueByName("id");
        if (lValue != null) {
          setId(lValue);
        }
      } catch(Throwable e) {}
// Location
      try {
        lValue = aJeo.getPropertyValueByName("location");
        if (lValue != null) {
          setLocation(lValue);
        }
      } catch(Throwable e) {}
// Title
      try {
        lValue = aJeo.getPropertyValueByName("title");
        if (lValue != null) {
          setTitle(lValue);
        }
      } catch(Throwable e) {}
// Text
      try {
        lValue = aJeo.getPropertyValueByName("text");
        if (lValue != null) {
          setText(lValue);
        }
      } catch(Throwable e) {}
// Resolution
      try {
        lValue = aJeo.getPropertyValueByName("resolution");
        if (lValue != null) {
          setResolution(lValue);
        }
      } catch(Throwable e) {}
// Severity
      try {
        lValue = aJeo.getPropertyValueByName("severity");
        if (lValue != null) {
          setSeverity(lValue);
        }
      } catch(Throwable e) {}
//$Section=Operation$mapFromJeo$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for the get PropertyValue by attribute string name method.
//----------------------------------------------------------------------------

  public PropertyValue getPropertyValueByName ( String aAttributeName) {
//$Section=Operation$getPropertyValueByName$Preserve=no
      if (aAttributeName.toLowerCase().equals("id")) {
        return iId;
      }
      if (aAttributeName.toLowerCase().equals("location")) {
        return iLocation;
      }
      if (aAttributeName.toLowerCase().equals("title")) {
        return iTitle;
      }
      if (aAttributeName.toLowerCase().equals("text")) {
        return iText;
      }
      if (aAttributeName.toLowerCase().equals("resolution")) {
        return iResolution;
      }
      if (aAttributeName.toLowerCase().equals("severity")) {
        return iSeverity;
      }
      return null;
//$Section=Operation$getPropertyValueByName$Preserve=no
  }

  public String getTypeByName ( String aAttributeName) {
//$Section=Operation$getTypeByName$Preserve=no
      if (aAttributeName.toLowerCase().equals("id")) {
        return "string";
      }
      if (aAttributeName.toLowerCase().equals("location")) {
        return "string";
      }
      if (aAttributeName.toLowerCase().equals("title")) {
        return "string";
      }
      if (aAttributeName.toLowerCase().equals("text")) {
        return "string";
      }
      if (aAttributeName.toLowerCase().equals("resolution")) {
        return "string";
      }
      if (aAttributeName.toLowerCase().equals("severity")) {
        return "int";
      }
      return null;
//$Section=Operation$getTypeByName$Preserve=no
  }

  public String getNameByIndex ( int aIndex) {
//$Section=Operation$getNameByIndex$Preserve=no

    switch(aIndex) {
      case 1: return "id";
      case 2: return "location";
      case 3: return "title";
      case 4: return "text";
      case 5: return "resolution";
      case 6: return "severity";
    }
    return null;
//$Section=Operation$getNameByIndex$Preserve=no
  }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------

//----------------------------------------------------------------------------
// Id
//----------------------------------------------------------------------------
    public String getId() {
//$Section=Attribute get$Id$Preserve=no
        return iId.getValueString();
//$Section=Attribute get$Id$Preserve=no
    }
    public void setId(String aValue) {
//$Section=Attribute set$Id$Preserve=no
        iId.reset(aValue);
//$Section=Attribute set$Id$Preserve=no
    }
    public void setId(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Id$Preserve=no
        if (aValue.getType().equals("null")) {
          setIdNull();
          return;
        }
        setId(aValue.toString());
//$Section=Attribute setPropertyValue$Id$Preserve=no
    }
    public void setId(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Id$Preserve=no
        if (aValue.getType().equals("null")) {
          setIdNull();
          return;
        }
        setId(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Id$Preserve=no
    }
    public void setId(String aValue, String aType) {
//$Section=Attribute setAsStringType$Id$Preserve=no
        iId.reset(aType, aValue);
//$Section=Attribute setAsStringType$Id$Preserve=no
    }
    public PropertyValue getIdPropertyValue() {
//$Section=Attribute getPropertyValue$Id$Preserve=no
        return iId;
//$Section=Attribute getPropertyValue$Id$Preserve=no
    }
    public int sizeId() {
//$Section=Attribute size$Id$Preserve=no
        return iIdSize;
//$Section=Attribute size$Id$Preserve=no
    }
    public boolean isIdNullable() {
//$Section=Attribute isNullable$Id$Preserve=no
        return iIdIsNullable;
//$Section=Attribute isNullable$Id$Preserve=no
    }
    public boolean isIdNull() {
//$Section=Attribute isNull$Id$Preserve=no
        if (iId.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Id$Preserve=no
    }
    public void setIdNull() {
//$Section=Attribute setNull$Id$Preserve=no
        iId.reset();
//$Section=Attribute setNull$Id$Preserve=no
    }
    public void setIdSpaceToNull() {
//$Section=Attribute setSpaceToNull$Id$Preserve=no
        if (getIdPropertyValue().toString().trim().equals("")) setIdNull();
//$Section=Attribute setSpaceToNull$Id$Preserve=no
    }
    public void setIdUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Id$Preserve=no
        iIdUpdate = aUpdate;
//$Section=Attribute setUpdate$Id$Preserve=no
    }
    public boolean getIdUpdate() {
//$Section=Attribute getUpdate$Id$Preserve=no
        return iIdUpdate;
//$Section=Attribute getUpdate$Id$Preserve=no
    }

//----------------------------------------------------------------------------
// Location
//----------------------------------------------------------------------------
    public String getLocation() {
//$Section=Attribute get$Location$Preserve=no
        return iLocation.getValueString();
//$Section=Attribute get$Location$Preserve=no
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

//----------------------------------------------------------------------------
// Title
//----------------------------------------------------------------------------
    public String getTitle() {
//$Section=Attribute get$Title$Preserve=no
        return iTitle.getValueString();
//$Section=Attribute get$Title$Preserve=no
    }
    public void setTitle(String aValue) {
//$Section=Attribute set$Title$Preserve=no
        iTitle.reset(aValue);
//$Section=Attribute set$Title$Preserve=no
    }
    public void setTitle(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Title$Preserve=no
        if (aValue.getType().equals("null")) {
          setTitleNull();
          return;
        }
        setTitle(aValue.toString());
//$Section=Attribute setPropertyValue$Title$Preserve=no
    }
    public void setTitle(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Title$Preserve=no
        if (aValue.getType().equals("null")) {
          setTitleNull();
          return;
        }
        setTitle(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Title$Preserve=no
    }
    public void setTitle(String aValue, String aType) {
//$Section=Attribute setAsStringType$Title$Preserve=no
        iTitle.reset(aType, aValue);
//$Section=Attribute setAsStringType$Title$Preserve=no
    }
    public PropertyValue getTitlePropertyValue() {
//$Section=Attribute getPropertyValue$Title$Preserve=no
        return iTitle;
//$Section=Attribute getPropertyValue$Title$Preserve=no
    }
    public int sizeTitle() {
//$Section=Attribute size$Title$Preserve=no
        return iTitleSize;
//$Section=Attribute size$Title$Preserve=no
    }
    public boolean isTitleNullable() {
//$Section=Attribute isNullable$Title$Preserve=no
        return iTitleIsNullable;
//$Section=Attribute isNullable$Title$Preserve=no
    }
    public boolean isTitleNull() {
//$Section=Attribute isNull$Title$Preserve=no
        if (iTitle.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Title$Preserve=no
    }
    public void setTitleNull() {
//$Section=Attribute setNull$Title$Preserve=no
        iTitle.reset();
//$Section=Attribute setNull$Title$Preserve=no
    }
    public void setTitleSpaceToNull() {
//$Section=Attribute setSpaceToNull$Title$Preserve=no
        if (getTitlePropertyValue().toString().trim().equals("")) setTitleNull();
//$Section=Attribute setSpaceToNull$Title$Preserve=no
    }
    public void setTitleUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Title$Preserve=no
        iTitleUpdate = aUpdate;
//$Section=Attribute setUpdate$Title$Preserve=no
    }
    public boolean getTitleUpdate() {
//$Section=Attribute getUpdate$Title$Preserve=no
        return iTitleUpdate;
//$Section=Attribute getUpdate$Title$Preserve=no
    }

//----------------------------------------------------------------------------
// Text
//----------------------------------------------------------------------------
    public String getText() {
//$Section=Attribute get$Text$Preserve=no
        return iText.getValueString();
//$Section=Attribute get$Text$Preserve=no
    }
    public void setText(String aValue) {
//$Section=Attribute set$Text$Preserve=no
        iText.reset(aValue);
//$Section=Attribute set$Text$Preserve=no
    }
    public void setText(PropertyValue aValue) {
//$Section=Attribute setPropertyValue$Text$Preserve=no
        if (aValue.getType().equals("null")) {
          setTextNull();
          return;
        }
        setText(aValue.toString());
//$Section=Attribute setPropertyValue$Text$Preserve=no
    }
    public void setText(PropertyValue aValue, String aFormat) {
//$Section=Attribute setPropertyValueFormat$Text$Preserve=no
        if (aValue.getType().equals("null")) {
          setTextNull();
          return;
        }
        setText(aValue.toString(), aFormat);
//$Section=Attribute setPropertyValueFormat$Text$Preserve=no
    }
    public void setText(String aValue, String aType) {
//$Section=Attribute setAsStringType$Text$Preserve=no
        iText.reset(aType, aValue);
//$Section=Attribute setAsStringType$Text$Preserve=no
    }
    public PropertyValue getTextPropertyValue() {
//$Section=Attribute getPropertyValue$Text$Preserve=no
        return iText;
//$Section=Attribute getPropertyValue$Text$Preserve=no
    }
    public int sizeText() {
//$Section=Attribute size$Text$Preserve=no
        return iTextSize;
//$Section=Attribute size$Text$Preserve=no
    }
    public boolean isTextNullable() {
//$Section=Attribute isNullable$Text$Preserve=no
        return iTextIsNullable;
//$Section=Attribute isNullable$Text$Preserve=no
    }
    public boolean isTextNull() {
//$Section=Attribute isNull$Text$Preserve=no
        if (iText.getValueType() == PropertyValue.CONST_VALUE_TYPE_NULL) return true;
        return false;
//$Section=Attribute isNull$Text$Preserve=no
    }
    public void setTextNull() {
//$Section=Attribute setNull$Text$Preserve=no
        iText.reset();
//$Section=Attribute setNull$Text$Preserve=no
    }
    public void setTextSpaceToNull() {
//$Section=Attribute setSpaceToNull$Text$Preserve=no
        if (getTextPropertyValue().toString().trim().equals("")) setTextNull();
//$Section=Attribute setSpaceToNull$Text$Preserve=no
    }
    public void setTextUpdate(boolean aUpdate) {
//$Section=Attribute setUpdate$Text$Preserve=no
        iTextUpdate = aUpdate;
//$Section=Attribute setUpdate$Text$Preserve=no
    }
    public boolean getTextUpdate() {
//$Section=Attribute getUpdate$Text$Preserve=no
        return iTextUpdate;
//$Section=Attribute getUpdate$Text$Preserve=no
    }

//----------------------------------------------------------------------------
// Resolution
//----------------------------------------------------------------------------
    public String getResolution() {
//$Section=Attribute get$Resolution$Preserve=no
        return iResolution.getValueString();
//$Section=Attribute get$Resolution$Preserve=no
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

//----------------------------------------------------------------------------
// Severity
//----------------------------------------------------------------------------
    public int getSeverity() {
//$Section=Attribute get$Severity$Preserve=no
        return iSeverity.getValueInt();
//$Section=Attribute get$Severity$Preserve=no
    }
    public void setSeverity(int aValue) {
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
    public void setSeverity(String aValue) {
//$Section=Attribute setAsString$Severity$Preserve=no
        iSeverity.reset("int", aValue);
//$Section=Attribute setAsString$Severity$Preserve=no
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


//$Section=Deleted$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$Preserve=no

//End of class---------------
}
