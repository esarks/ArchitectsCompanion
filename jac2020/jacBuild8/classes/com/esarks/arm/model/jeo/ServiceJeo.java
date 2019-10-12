//$Section=License$Preserve=no
//  Generated at 2005.12.24 12:42:49.687 AM EST by Architect's Companion (c) 2003, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  XML Definition: com.esarks.arm.model.jeo.Service_Jeo
//     Module Name: com.esarks.arm.model.jeo.ServiceJeo

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

public class ServiceJeo extends com.esarks.jac.Jeo {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes


//$Section=CustomClassDeclare$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

    private com.esarks.arm.model.jeo.RequestJeo iRequest = new com.esarks.arm.model.jeo.RequestJeo();
    private com.esarks.arm.model.jeo.ReplyJeo iReply = new com.esarks.arm.model.jeo.ReplyJeo();
    private com.esarks.arm.model.jeo.ErrorJeo iError = null;
    private boolean iSuppressException = false;

//$Section=CustomClassDeclare$Preserve=no

//----------------------------------------------------------------------------
// Generated constructors.
//----------------------------------------------------------------------------

/**
 * Default constructor.
 */
    public ServiceJeo() {
      iInstanceName = "com.esarks.arm.model.jeo.ServiceJeo";
//$Section=DefaultConstructor$Preserve=yes
      addJeo(iRequest);
      addJeo(iReply);
//$Section=DefaultConstructor$Preserve=no
    }

/**
 *
 */
    public ServiceJeo( com.esarks.jac.JeoFactory aJeoFactory ) {
      iInstanceName = "com.esarks.arm.model.jeo.ServiceJeo";
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=yes
//$Section=Operation$Jeo( JeoFactory aJeoFactory )$Preserve=no
    }

/**
 *
 */
    public ServiceJeo( Script aScript ) {
      super("", aScript);
      iInstanceName = "com.esarks.arm.model.jeo.ServiceJeo";
//$Section=Operation$Jeo( String aScript )$Preserve=yes
//$Section=Operation$Jeo( String aScript )$Preserve=no
    }

/**
 *
 */
    public ServiceJeo( String aTypeName ) {
      iInstanceName = "com.esarks.arm.model.jeo.ServiceJeo";
      iJeoTypeName = aTypeName;
//$Section=Operation$Jeo( String aTypeName )$Preserve=yes
//$Section=Operation$Jeo( String aTypeName )$Preserve=no
    }

/**
 *
 */
    public ServiceJeo( String aTypeName, Script aScript ) {
      super("", aScript);
      iInstanceName = "com.esarks.arm.model.jeo.ServiceJeo";
      iJeoTypeName = aTypeName;
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

  public void morphJeo(com.esarks.arm.model.jeo.ServiceJeo aServiceJeo) {
    iJeoCollection = aServiceJeo.iJeoCollection;
    iProperties = aServiceJeo.iProperties;
    iRequest = aServiceJeo.iRequest;
    iReply = aServiceJeo.iReply;
    iError = aServiceJeo.iError;
  }

  public void setJeoCollection(ArrayList aJeoCollection) {
    iJeoCollection = aJeoCollection;
  }

  public void setProperties(Map aProperties) {
    iProperties = aProperties;
  }

  public void setRequest(RequestJeo aRequest) {
    iRequest = aRequest;
  }

  public void setReply(ReplyJeo aReply) {
    iReply = aReply;
  }

  public void setError(ErrorJeo aError) {
    iError = aError;
  }

  public com.esarks.arm.model.jeo.RequestJeo getRequest() {
    return iRequest;
  }

  public com.esarks.arm.model.jeo.ReplyJeo getReply() {
    return iReply;
  }

  public com.esarks.arm.model.jeo.ErrorJeo getError() {
    return iError;
  }

  public com.esarks.arm.model.jeo.ErrorJeo addError() {
    iError = new com.esarks.arm.model.jeo.ErrorJeo();
    addJeo(iError);
    return iError;
  }

  public com.esarks.arm.model.jeo.ErrorJeo addError(com.esarks.arm.model.jeo.ErrorJeo aErrorJeo) {
    iError = aErrorJeo;
    addJeo(iError);
    return iError;
  }

  public com.esarks.arm.model.jeo.ErrorJeo getMostSevereError() {
    com.esarks.arm.model.jeo.ErrorJeo lReturnError = null;
    iError = null;
    ArrayList lArrayList = getErrors();
    if (lArrayList == null || lArrayList.size() == 0) return lReturnError;
    int lSevere = 99;
    for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
      com.esarks.arm.model.jeo.ErrorJeo lError = (com.esarks.arm.model.jeo.ErrorJeo) lArrayList.get(lIdx);
      if (lError.getSeverity() < lSevere) {
        lSevere = lError.getSeverity();
        lReturnError = lError;
      }
    }
    iError = lReturnError;
    return lReturnError;
  }

  public int getErrorSize() {
    return getJeoByInstanceNameSize("com.esarks.arm.model.jeo.ErrorJeo");
  }

  public ArrayList getErrors() {
    return getJeoByInstanceName("com.esarks.arm.model.jeo.ErrorJeo");
  }

  public void setErrorId(String aValue) {
    if (iError == null) return;
    iError.setId(aValue);
  }

  public void setErrorLocation(String aValue) {
    if (iError == null) return;
    iError.setLocation(aValue);
  }

  public void setErrorTitle(String aValue) {
    if (iError == null) return;
    iError.setTitle(aValue);
  }

  public void setErrorText(String aValue) {
    if (iError == null) return;
    iError.setText(aValue);
  }

  public void setErrorResolution(String aValue) {
    if (iError == null) return;
    iError.setResolution(aValue);
  }

  public void setErrorSeverity(int aValue) {
    if (iError == null) return;
    iError.setSeverity(aValue);
  }

  public boolean getSuppressException() {
    return iSuppressException;
  }

  public void setSuppressException(boolean aValue) {
    iSuppressException = aValue;
  }

//$Section=CustomOperations$Preserve=no

    public void init() {
    	super.init();
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
//$Section=Operation$mapToJeo$Preserve=no
  }

  public void mapFromJeo( Jeo aJeo) {
//$Section=Operation$mapFromJeo$Preserve=no
    String lType = null;
    PropertyValue lValue = null;
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
    }
    return null;
//$Section=Operation$getNameByIndex$Preserve=no
  }

  public String getXml ( ) {
//$Section=Operation$getXml$Preserve=no

    StringBuffer lXml = new StringBuffer("<jeo name='com.esarks.arm.model.jeo.ServiceJeo'>");
    String lCdataBegin = "<" + "!" + "[CDATA[";
    lXml.append("</jeo>");
    return lXml.toString();

//$Section=Operation$getXml$Preserve=no
  }

  public boolean isJeoEqual ( Jeo aJeo) {
//$Section=Operation$isJeoEqual$Preserve=no

    PropertyValue lThisValue = null;
    PropertyValue lThatValue = null;
    return true;
//$Section=Operation$isJeoEqual$Preserve=no
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
