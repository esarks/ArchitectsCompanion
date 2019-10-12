//$Section=License$ID=4161400602FD$Preserve=no

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

//  Generated at 2005.11.10 11:09:02.859 AM EST by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Jeo.java

//$Section=ChangeLog$ID=4161400602FD$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=4161400602FD$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.util.*;
import java.sql.Time;
import java.sql.Timestamp;
// SuperClass

//$Section=CustomDeclare$ID=4161400602FD$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=4161400602FD$Preserve=no

//$Section=ClassJavadoc$ID=4161400602FD$Preserve=yes
/**
 * Java Entity Object (JEO), pronounced Jay-Oh, is a data wrapper and collection object which can be extended to provide application-specific data services.
 */
//$Section=ClassJavadoc$ID=4161400602FD$Preserve=no
public class Jeo extends com.esarks.jac.ScriptHelper {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    protected String iJeoTypeName;
    protected ArrayList iJeoCollection;
    protected String iInstanceName;
    protected Map iProperties;
    protected JeoFactory iJeoFactory;
    protected boolean iIsReserved = false;

//$Section=CustomClassDeclare$ID=4161400602FD$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=4161400602FD$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=4161400602FD$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=4161400602FD$Preserve=no
    public Jeo() {
//$Section=DefaultConstructor$ID=4161400602FD$Preserve=yes
//$Section=DefaultConstructor$ID=4161400602FD$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=4161400602FD$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=4161400602FD$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=4161400602FD$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=4161400602FD$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=4161400602FD$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=4161400602FD$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=4161400602FD$Preserve=yes
        iJeoCollection = null;
        iProperties = null;
//$Section=DefaultFreeResources$ID=4161400602FD$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=4203D7620251$Preserve=yes
/**
 *
 * @param aJeoFactory
 *
 */
//$Section=OperationJavadoc$ID=4203D7620251$Preserve=no
    public Jeo( JeoFactory aJeoFactory ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4203D7620251$Preserve=yes
        iJeoFactory = aJeoFactory;
//$Section=Operation$ID=4203D7620251$Preserve=no
    }

//$Section=OperationJavadoc$ID=416C97160036$Preserve=yes
/**
 * Construct an instance by name.
 *
 * @param aInstanceName The name given to this instance.
 *
 */
//$Section=OperationJavadoc$ID=416C97160036$Preserve=no
    public Jeo( String aInstanceName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=416C97160036$Preserve=yes
        iInstanceName = aInstanceName;
//$Section=Operation$ID=416C97160036$Preserve=no
    }

//$Section=OperationJavadoc$ID=4193F4C600BB$Preserve=yes
/**
 * Construct an instance by name and define the allowed type of Jeo which can be added to this Jeo's collection via <code>addJeo</code>.
 *
 * @param aInstanceName The logical name given to this instance.
 *
 * @param aTypeName The type name of Jeo's which are allowed to be added via <code>addJeo</code>.
 *
 */
//$Section=OperationJavadoc$ID=4193F4C600BB$Preserve=no
    public Jeo( String aInstanceName, String aTypeName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4193F4C600BB$Preserve=yes
        iInstanceName = aInstanceName;
        iJeoTypeName = aTypeName;
//$Section=Operation$ID=4193F4C600BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=41CDB62A030D$Preserve=yes
/**
 * Construct an instance by name and pass a constructed <code>Script</code>.
 *
 * @param aInstanceName The logical name given to this instance.
 *
 * @param aScript To be used by sub-classed instances.  The Jeo superclass has no dependency on nor does it use
 *                a <code>Script</code> object.  This is provided for subclasses that may need to perform <code>Script</code> related functions.
 *
 */
//$Section=OperationJavadoc$ID=41CDB62A030D$Preserve=no
    public Jeo( String aInstanceName, Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41CDB62A030D$Preserve=yes
        super(aScript);
        iInstanceName = aInstanceName;
//$Section=Operation$ID=41CDB62A030D$Preserve=no
    }

//$Section=OperationJavadoc$ID=41CDB62A030F$Preserve=yes
/**
 * Construct an instance by name, define the allowed type of Jeo which can be added to this Jeo's collection via <code>addJeo</code> and
 * pass a constructed <code>Script</code>.
 *
 * @param aInstanceName The logical name given to this instance.
 *
 * @param aTypeName The type name of Jeo's which are allowed to be added via <code>addJeo</code>.
 *
 * @param aScript To be used by sub-classed instances.  The Jeo superclass has no dependency on nor does it use
 *                a <code>Script</code> object.  This is provided for subclasses that may need to perform <code>Script</code> related functions.
 *
 */
//$Section=OperationJavadoc$ID=41CDB62A030F$Preserve=no
    public Jeo( String aInstanceName, String aTypeName, Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41CDB62A030F$Preserve=yes
        super(aScript);
        iInstanceName = aInstanceName;
        iJeoTypeName = aTypeName;
//$Section=Operation$ID=41CDB62A030F$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203FF3E038A$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4203FF3E038A$Preserve=no
    public void init( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4203FF3E038A$Preserve=yes
        iJeoTypeName = null;
        iJeoCollection = null;
        iInstanceName = null;
        iProperties = null;
        iScript = null;
        iSymbolTable = null;
        iOutputManager = null;
        iPropertyHelper = null;
        iIsReserved = false;
//$Section=Operation$ID=4203FF3E038A$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203D72502BF$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 */
//$Section=OperationJavadoc$ID=4203D72502BF$Preserve=no
    public void init( String aInstanceName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4203D72502BF$Preserve=yes
        iInstanceName = aInstanceName;
//$Section=Operation$ID=4203D72502BF$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203D72502C1$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @param aTypeName
 *
 */
//$Section=OperationJavadoc$ID=4203D72502C1$Preserve=no
    public void init( String aInstanceName, String aTypeName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4203D72502C1$Preserve=yes
        iInstanceName = aInstanceName;
        iJeoTypeName = aTypeName;
//$Section=Operation$ID=4203D72502C1$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203D72502CE$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=4203D72502CE$Preserve=no
    public void init( String aInstanceName, Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4203D72502CE$Preserve=yes
        iScript = aScript;
        iSymbolTable = iScript.getSymbolTable();
        iOutputManager = iScript.getOutputManager();
        iPropertyHelper = new PropertyHelper(iScript);
//        iLog = Log.getInstance();
        iInstanceName = aInstanceName;
//$Section=Operation$ID=4203D72502CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203D72502D1$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @param aTypeName
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=4203D72502D1$Preserve=no
    public void init( String aInstanceName, String aTypeName, Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4203D72502D1$Preserve=yes
        iScript = aScript;
        iSymbolTable = iScript.getSymbolTable();
        iOutputManager = iScript.getOutputManager();
        iPropertyHelper = new PropertyHelper(iScript);
//        iLog = Log.getInstance();
        iInstanceName = aInstanceName;
        iJeoTypeName = aTypeName;
//$Section=Operation$ID=4203D72502D1$Preserve=no
    }

//$Section=OperationJavadoc$ID=4161416502FD$Preserve=yes
/**
 * Return the Jeo type allowed in <code>addJeo</code> for this instance.
 *
 * @return The type name.
 *
 */
//$Section=OperationJavadoc$ID=4161416502FD$Preserve=no
    public String getJeoType( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4161416502FD$Preserve=yes
        return iJeoTypeName;
//$Section=Operation$ID=4161416502FD$Preserve=no
    }

//$Section=OperationJavadoc$ID=4161417303B9$Preserve=yes
/**
 * Add a Jeo to this instance's collection of Jeo's.
 *
 * @param aJeo
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4161417303B9$Preserve=no
    public void addJeo( Jeo aJeo ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4161417303B9$Preserve=yes
        if (iJeoTypeName != null && !iJeoTypeName.equals("")) {
            if (aJeo.getJeoType().equals(iJeoTypeName)) {
                getJeoCollection().add(aJeo);
            } else {
                //THROW EXCEPTION HERE
            }
        }
        getJeoCollection().add(aJeo);
//$Section=Operation$ID=4161417303B9$Preserve=no
    }

//$Section=OperationJavadoc$ID=424ABB1E02DE$Preserve=yes
/**
 *
 * @param aJeo
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=424ABB1E02DE$Preserve=no
    public void addJeo( ArrayList aArrayList ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=424ABB1E02DE$Preserve=yes
        for (int lIdx=0; lIdx < aArrayList.size(); lIdx++) {
            addJeo((Jeo) aArrayList.get(lIdx));
        }
//$Section=Operation$ID=424ABB1E02DE$Preserve=no
    }

//$Section=OperationJavadoc$ID=419764950186$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419764950186$Preserve=no
    public Jeo createJeo( String aInstanceName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419764950186$Preserve=yes
        Jeo lNewJeo = new Jeo(aInstanceName);
        addJeo(lNewJeo);
        return lNewJeo;
//$Section=Operation$ID=419764950186$Preserve=no
    }

//$Section=OperationJavadoc$ID=419764E9000F$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @param aTypeName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419764E9000F$Preserve=no
    public Jeo createJeo( String aInstanceName, String aTypeName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419764E9000F$Preserve=yes
        Jeo lNewJeo = new Jeo(aInstanceName, aTypeName);
        addJeo(lNewJeo);
        return lNewJeo;
//$Section=Operation$ID=419764E9000F$Preserve=no
    }

//$Section=OperationJavadoc$ID=416141CF00FA$Preserve=yes
/**
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=416141CF00FA$Preserve=no
    public void removeJeoAt( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=416141CF00FA$Preserve=yes
        if (aIndex >= 0 && aIndex < getJeoCollection().size()) {
            getJeoCollection().remove(aIndex);
        }
//$Section=Operation$ID=416141CF00FA$Preserve=no
    }

//$Section=OperationJavadoc$ID=417134320232$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=417134320232$Preserve=no
    public void removeJeoByInstanceName( String aInstanceName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=417134320232$Preserve=yes
        int lIdx = 0;
        while (lIdx < getJeoCollection().size()) {
            Jeo lJeo = (Jeo) getJeoCollection().get(lIdx);
            if (lJeo.getInstanceName().compareTo(aInstanceName) == 0) {
                getJeoCollection().remove(lIdx);
            } else {
                lIdx++;
            }
        }
//$Section=Operation$ID=417134320232$Preserve=no
    }

//$Section=OperationJavadoc$ID=4161419802CE$Preserve=yes
/**
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4161419802CE$Preserve=no
    public Jeo getJeoAt( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4161419802CE$Preserve=yes
        if (aIndex >= 0 && aIndex < getJeoCollection().size()) {
            return (Jeo) getJeoCollection().get(aIndex);
        }
        return null;
//$Section=Operation$ID=4161419802CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=41635E2102D4$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41635E2102D4$Preserve=no
    public ArrayList getJeoByInstanceName( String aInstanceName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41635E2102D4$Preserve=yes
        ArrayList lArrayList = new ArrayList();
        for (int lIdx=0; lIdx < getJeoCollection().size(); lIdx++) {
            Jeo lJeo = (Jeo) getJeoCollection().get(lIdx);
            if (lJeo.getInstanceName() != null && lJeo.getInstanceName().compareTo(aInstanceName) == 0) {
                lArrayList.add(lJeo);
            }
        }
        return lArrayList;
//$Section=Operation$ID=41635E2102D4$Preserve=no
    }

//$Section=OperationJavadoc$ID=4171345E0186$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4171345E0186$Preserve=no
    public Jeo getJeoByInstanceNameAt( String aInstanceName, int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4171345E0186$Preserve=yes
        ArrayList lArrayList = getJeoByInstanceName(aInstanceName);
        if (aIndex >= 0 && aIndex < lArrayList.size()) return (Jeo) lArrayList.get(aIndex);
        return null;
//$Section=Operation$ID=4171345E0186$Preserve=no
    }

//$Section=OperationJavadoc$ID=41CD67F4032C$Preserve=yes
/**
 *
 * @param aTypeName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41CD67F4032C$Preserve=no
    public ArrayList getJeoByTypeName( String aTypeName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41CD67F4032C$Preserve=yes
        ArrayList lArrayList = new ArrayList();
        for (int lIdx=0; lIdx < getJeoCollection().size(); lIdx++) {
            Jeo lJeo = (Jeo) getJeoCollection().get(lIdx);
            if (lJeo.getJeoType() != null && lJeo.getJeoType().compareTo(aTypeName) == 0) {
                lArrayList.add(lJeo);
            }
        }
        return lArrayList;
//$Section=Operation$ID=41CD67F4032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=41CD67F4032E$Preserve=yes
/**
 *
 * @param aTypeName
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41CD67F4032E$Preserve=no
    public Jeo getJeoByTypeNameAt( String aTypeName, int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41CD67F4032E$Preserve=yes
        ArrayList lArrayList = getJeoByTypeName(aTypeName);
        if (aIndex >= 0 && aIndex < lArrayList.size()) return (Jeo) lArrayList.get(aIndex);
        return null;
//$Section=Operation$ID=41CD67F4032E$Preserve=no
    }

//$Section=OperationJavadoc$ID=416144A403A9$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=416144A403A9$Preserve=no
    public int getJeoSize( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=416144A403A9$Preserve=yes
        return getJeoCollection().size();
//$Section=Operation$ID=416144A403A9$Preserve=no
    }

//$Section=OperationJavadoc$ID=41713492030D$Preserve=yes
/**
 *
 * @param aInstanceName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41713492030D$Preserve=no
    public int getJeoByInstanceNameSize( String aInstanceName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41713492030D$Preserve=yes
        return getJeoByInstanceName(aInstanceName).size();
//$Section=Operation$ID=41713492030D$Preserve=no
    }

//$Section=OperationJavadoc$ID=416145CD00BB$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=416145CD00BB$Preserve=no
    public void emptyJeo( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=416145CD00BB$Preserve=yes
        getJeoCollection().clear();
//$Section=Operation$ID=416145CD00BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=4163D535031C$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4163D535031C$Preserve=no
    public PropertyValue getPropertyValue( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4163D535031C$Preserve=yes

        if (iProperties == null || iProperties.containsKey(aPropertyName) == false) {
            return new PropertyValue();
        }
        return (PropertyValue) iProperties.get(aPropertyName);

//$Section=Operation$ID=4163D535031C$Preserve=no
    }

//$Section=OperationJavadoc$ID=4163D55C01D4$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4163D55C01D4$Preserve=no
    public void setPropertyValue( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4163D55C01D4$Preserve=yes

        if (iProperties == null) {
            iProperties = new TreeMap();
        }
        if (iProperties.containsKey(aPropertyName) == true) {
            iProperties.remove(aPropertyName);
        }
        iProperties.put(aPropertyName, aPropertyValue);

//$Section=Operation$ID=4163D55C01D4$Preserve=no
    }

//$Section=OperationJavadoc$ID=416436930128$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=416436930128$Preserve=no
    public void removePropertyValue( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=416436930128$Preserve=yes
        if (iProperties.containsKey(aPropertyName) == true) {
            iProperties.remove(aPropertyName);
        }
//$Section=Operation$ID=416436930128$Preserve=no
    }

//$Section=OperationJavadoc$ID=418738680242$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=418738680242$Preserve=no
    public PropertyValue getJeoAsPropertyValue( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=418738680242$Preserve=yes
        Jeo lJeo = getJeoByInstanceNameAt(aPropertyName, 0);
        if (lJeo == null) return new PropertyValue();
        return lJeo.getPropertyValue("value");
//$Section=Operation$ID=418738680242$Preserve=no
    }

//$Section=OperationJavadoc$ID=418738A702AF$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aPropertyValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=418738A702AF$Preserve=no
    public void setJeoAsPropertyValue( String aPropertyName, PropertyValue aPropertyValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=418738A702AF$Preserve=yes
        Jeo lJeo = new Jeo(aPropertyName);
        lJeo.setPropertyValue("value", new PropertyValue(aPropertyValue));
        addJeo(lJeo);
//$Section=Operation$ID=418738A702AF$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700222$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700222$Preserve=no
    public void set( String aPropertyName, boolean aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700222$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700222$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700224$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700224$Preserve=no
    public void set( String aPropertyName, byte aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700224$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700224$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700232$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700232$Preserve=no
    public void set( String aPropertyName, short aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700232$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700232$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700234$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700234$Preserve=no
    public void set( String aPropertyName, int aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700234$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700234$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700236$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700236$Preserve=no
    public void set( String aPropertyName, long aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700236$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700236$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700242$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700242$Preserve=no
    public void set( String aPropertyName, char aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700242$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700242$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700244$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700244$Preserve=no
    public void set( String aPropertyName, float aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700244$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700244$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700246$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700246$Preserve=no
    public void set( String aPropertyName, double aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700246$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700246$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700251$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700251$Preserve=no
    public void set( String aPropertyName, Object aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700251$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700251$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700253$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700253$Preserve=no
    public void set( String aPropertyName, String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700253$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700253$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700261$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700261$Preserve=no
    public void set( String aPropertyName, Date aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700261$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700261$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700263$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700263$Preserve=no
    public void set( String aPropertyName, Time aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700263$Preserve=yes
        PropertyValue lPropertyValue = new PropertyValue(aValue);
        setPropertyValue(aPropertyName, lPropertyValue);
//$Section=Operation$ID=419769700263$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A61F220109$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41A61F220109$Preserve=no
    public void set( String aPropertyName, Timestamp aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41A61F220109$Preserve=yes
//$Section=Operation$ID=41A61F220109$Preserve=no
    }

//$Section=OperationJavadoc$ID=419769700265$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=419769700265$Preserve=no
    public void set( String aPropertyName, PropertyValue aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=419769700265$Preserve=yes
        setPropertyValue(aPropertyName, aValue);
//$Section=Operation$ID=419769700265$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E02CE$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E02CE$Preserve=no
    public int getValueType( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E02CE$Preserve=yes
return 0;
//$Section=Operation$ID=4197699E02CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E02CF$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E02CF$Preserve=no
    public String getValueClassName( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E02CF$Preserve=yes
return "";
//$Section=Operation$ID=4197699E02CF$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E02DE$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E02DE$Preserve=no
    public boolean getValueBoolean( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E02DE$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueBoolean();
//$Section=Operation$ID=4197699E02DE$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E02FD$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E02FD$Preserve=no
    public byte getValueByte( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E02FD$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueByte();
//$Section=Operation$ID=4197699E02FD$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E02FE$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E02FE$Preserve=no
    public short getValueShort( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E02FE$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueShort();
//$Section=Operation$ID=4197699E02FE$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E030D$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E030D$Preserve=no
    public int getValueInt( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E030D$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueInt();
//$Section=Operation$ID=4197699E030D$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E030E$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E030E$Preserve=no
    public long getValueLong( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E030E$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueLong();
//$Section=Operation$ID=4197699E030E$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E031C$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E031C$Preserve=no
    public char getValueChar( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E031C$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueChar();
//$Section=Operation$ID=4197699E031C$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E031D$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E031D$Preserve=no
    public float getValueFloat( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E031D$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueFloat();
//$Section=Operation$ID=4197699E031D$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E031E$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E031E$Preserve=no
    public double getValueDouble( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E031E$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueDouble();
//$Section=Operation$ID=4197699E031E$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E032C$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E032C$Preserve=no
    public Object getValueObject( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E032C$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueObject();
//$Section=Operation$ID=4197699E032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E032D$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E032D$Preserve=no
    public String getValueString( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E032D$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueString();
//$Section=Operation$ID=4197699E032D$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E032E$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E032E$Preserve=no
    public Date getValueDate( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E032E$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueDate();
//$Section=Operation$ID=4197699E032E$Preserve=no
    }

//$Section=OperationJavadoc$ID=4197699E033C$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4197699E033C$Preserve=no
    public Time getValueTime( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4197699E033C$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueTime();
//$Section=Operation$ID=4197699E033C$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A61F4302CE$Preserve=yes
/**
 *
 * @param aPropertyName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41A61F4302CE$Preserve=no
    public Timestamp getValueTimestamp( String aPropertyName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41A61F4302CE$Preserve=yes
        PropertyValue lPropertyValue = getPropertyValue(aPropertyName);
        return lPropertyValue.getValueTimestamp();
//$Section=Operation$ID=41A61F4302CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=422CC11801F4$Preserve=yes
/**
 *
 * @param aIndex
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=422CC11801F4$Preserve=no
    public String getNameByIndex( int aIndex ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=422CC11801F4$Preserve=yes
        return null;
//$Section=Operation$ID=422CC11801F4$Preserve=no
    }

//$Section=OperationJavadoc$ID=43736FD90232$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=43736FD90232$Preserve=no
    public String getXml( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=43736FD90232$Preserve=yes
        return "";
//$Section=Operation$ID=43736FD90232$Preserve=no
    }

//$Section=OperationJavadoc$ID=4249442B005D$Preserve=yes
/**
 *
 * @param aAttributeName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4249442B005D$Preserve=no
    public String getCasedName( String aAttributeName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4249442B005D$Preserve=yes
        return null;
//$Section=Operation$ID=4249442B005D$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A330E4037A$Preserve=yes
/**
 *
 * @param aAttributeName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41A330E4037A$Preserve=no
    public PropertyValue getPropertyValueByName( String aAttributeName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41A330E4037A$Preserve=yes
        return getPropertyValue(aAttributeName);
//$Section=Operation$ID=41A330E4037A$Preserve=no
    }

//$Section=OperationJavadoc$ID=41A338B602CE$Preserve=yes
/**
 *
 * @param aAttributeName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41A338B602CE$Preserve=no
    public String getTypeByName( String aAttributeName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41A338B602CE$Preserve=yes
        return null;
//$Section=Operation$ID=41A338B602CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=4252D740006D$Preserve=yes
/**
 *
 * @param aAttributeName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4252D740006D$Preserve=no
    public String getStereotypeByName( String aAttributeName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4252D740006D$Preserve=yes
        return null;
//$Section=Operation$ID=4252D740006D$Preserve=no
    }

//$Section=OperationJavadoc$ID=422CD488006D$Preserve=yes
/**
 *
 * @param aName
 *
 * @param aValue
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=422CD488006D$Preserve=no
    public void setStringValueByName( String aName, String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=422CD488006D$Preserve=yes
//$Section=Operation$ID=422CD488006D$Preserve=no
    }

//$Section=OperationJavadoc$ID=41CDB32D0261$Preserve=yes
/**
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41CDB32D0261$Preserve=no
    public void setScript( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=41CDB32D0261$Preserve=yes
        iScript = aScript;
        iSymbolTable = iScript.getSymbolTable();
        iOutputManager = iScript.getOutputManager();
        iPropertyHelper = new PropertyHelper(iScript);
//        iLog = Log.getInstance();
//$Section=Operation$ID=41CDB32D0261$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203CE4B00EA$Preserve=yes
/**
 *
 * @param aJeoFactory
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4203CE4B00EA$Preserve=no
    public void reserve( JeoFactory aJeoFactory ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4203CE4B00EA$Preserve=yes
        iJeoFactory = aJeoFactory;
        iIsReserved = true;
//$Section=Operation$ID=4203CE4B00EA$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203CE8102EE$Preserve=yes
/**
 *
 * @param aJeoFactory
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4203CE8102EE$Preserve=no
    public void unreserve( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4203CE8102EE$Preserve=yes
//$Section=Operation$ID=4203CE8102EE$Preserve=no
    }

//$Section=OperationJavadoc$ID=42494279008C$Preserve=yes
/**
 *
 * @param aLogLevel
 *
 * @param aLog
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42494279008C$Preserve=no
    public void log( byte aLogLevel, Log aLog ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=42494279008C$Preserve=yes
        if (!aLog.test(aLogLevel)) return;

        aLog.println(aLogLevel, "==Jeo===================================================================================================================");
        aLog.println(aLogLevel, this.toString());
        String lPropertyName = "";
        int lPropertyIndex = 1;
        while ((lPropertyName = getNameByIndex(lPropertyIndex)) != null) {
            PropertyValue lPropertyValue = getPropertyValueByName(lPropertyName);
            String lCasedName = getCasedName(lPropertyName);
            int lSub = 30 - lCasedName.length();
            if (lSub < 0) lSub = 0;
            lCasedName = lCasedName + "...............................".substring(0, lSub);
            if (lPropertyValue != null && lPropertyValue.getValueType() != PropertyValue.CONST_VALUE_TYPE_NULL) {
                aLog.println(aLogLevel, lCasedName + "[" + lPropertyValue.toString() + "] as " + lPropertyValue.getType());
            } else {
//                aLog.println(aLogLevel, lCasedName + "<NULL>");
            }
            lPropertyIndex++;
        }
        int lPropertiesSize = 0;
        if (iProperties != null) lPropertiesSize = iProperties.size();
        aLog.println(aLogLevel, "Property collection size: " + Integer.toString(lPropertiesSize) + " Jeo collection size: " + Integer.toString(getJeoCollection().size()));
        aLog.println(aLogLevel, "--Jeo-------------------------------------------------------------------------------------------------------------------");

//$Section=Operation$ID=42494279008C$Preserve=no
    }

//$Section=OperationJavadoc$ID=4252B1210128$Preserve=yes
/**
 *
 * @param aLogLevel
 *
 * @param aLog
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4252B1210128$Preserve=no
    public void logRecursive( byte aLogLevel, Log aLog ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4252B1210128$Preserve=yes
        if (!aLog.test(aLogLevel)) return;
        log(aLogLevel, aLog);
        if (getJeoCollection().size() == 0) return;
        for (int lIdx=0; lIdx < getJeoCollection().size(); lIdx++) {
            aLog.println(aLogLevel, "Printing Jeo at index " + Integer.toString(lIdx) + " in parent " + this.toString());
            Jeo lJeo = (Jeo) getJeoCollection().get(lIdx);
            lJeo.logRecursive(aLogLevel, aLog);
        }
//$Section=Operation$ID=4252B1210128$Preserve=no
    }

//$Section=OperationJavadoc$ID=4295F27703AB$Preserve=yes
/**
 *
 * @param aArrayList
 *
 * @param aField
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4295F27703AB$Preserve=no
    public static void sort( ArrayList aArrayList, String aField ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4295F27703AB$Preserve=yes
        Jeo.sort(aArrayList, aField, true);
//$Section=Operation$ID=4295F27703AB$Preserve=no
    }

//$Section=OperationJavadoc$ID=4296340C01F1$Preserve=yes
/**
 *
 * @param aArrayList
 *
 * @param aField
 *
 * @param aAscending
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4296340C01F1$Preserve=no
    public static void sort( ArrayList aArrayList, String aField, boolean aAscending ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4296340C01F1$Preserve=yes

        Jeo.sort(aArrayList, aField, "", aAscending);

//$Section=Operation$ID=4296340C01F1$Preserve=no
    }

//$Section=OperationJavadoc$ID=4295BB6C00E8$Preserve=yes
/**
 *
 * @param aField
 *
 * @param aAscending
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4295BB6C00E8$Preserve=no
    public static void sort( ArrayList aArrayList, String aField, String aFormat, boolean aAscending ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Jeo.");
//$Section=Operation$ID=4295BB6C00E8$Preserve=yes

        if (aArrayList.size() == 0) return;
        Jeo.qsort(aArrayList, 0, aArrayList.size() - 1, aField, aAscending);

    }

    private static void qsort(ArrayList aJeoArrayList, int aLo, int aHi, String aSortField, boolean aAscending) {

        int lLo = aLo;
        int lHi = aHi;

        int lP = (lLo + lHi) / 2;
        Jeo lPivot = (Jeo) aJeoArrayList.get(lP);
        PropertyValue lPivotSort = getSortPropertyValue(lPivot, aSortField);

        do {
            while (comparePropertyValues(aJeoArrayList, lLo, lPivotSort, aSortField, aAscending) < 0) {
                lLo++;
            }

            while (comparePropertyValues(aJeoArrayList, lHi, lPivotSort, aSortField, aAscending) > 0) {
                lHi--;
            }

            if (lLo <= lHi) {

                    Jeo lA = (Jeo) aJeoArrayList.get(lLo);
                    Jeo lB = (Jeo) aJeoArrayList.get(lHi);
                    aJeoArrayList.set(lHi, lA);
                    aJeoArrayList.set(lLo, lB);
                    lLo++;
                    lHi--;
            }
        } while (lLo <= lHi);

        if (aLo < lHi) qsort(aJeoArrayList, aLo, lHi, aSortField, aAscending);
        if (lLo < aHi) qsort(aJeoArrayList, lLo, aHi, aSortField, aAscending);

    }

    private static PropertyValue getSortPropertyValue(Jeo aJeo, String aField) {
        PropertyValue lPropertyValue = aJeo.getPropertyValueByName(aField);
        if (lPropertyValue == null) {
            lPropertyValue = aJeo.getPropertyValue(aField);
            if (lPropertyValue == null) lPropertyValue = new PropertyValue();
        }
        return lPropertyValue;
    }

    private static int comparePropertyValues(ArrayList aJeoArrayList, PropertyValue aLo, int aHi, String aSortField, boolean aAscending) {
        PropertyValue lLo = aLo;
        PropertyValue lHi = getSortPropertyValue((Jeo) aJeoArrayList.get(aHi), aSortField);
        int lMult = 1;
        if (!aAscending) lMult = -1;
        return lLo.compareTo(lHi) * lMult;
    }

    private static int comparePropertyValues(ArrayList aJeoArrayList, int aLo, PropertyValue aHi, String aSortField, boolean aAscending) {
        PropertyValue lLo = getSortPropertyValue((Jeo) aJeoArrayList.get(aLo), aSortField);
        PropertyValue lHi = aHi;
        int lMult = 1;
        if (!aAscending) lMult = -1;
        return lLo.compareTo(lHi) * lMult;
    }

    private static int comparePropertyValues(ArrayList aJeoArrayList, int aLo, int aHi, String aSortField, boolean aAscending) {
        PropertyValue lLo = getSortPropertyValue((Jeo) aJeoArrayList.get(aLo), aSortField);
        PropertyValue lHi = getSortPropertyValue((Jeo) aJeoArrayList.get(aHi), aSortField);
        int lMult = 1;
        if (!aAscending) lMult = -1;
        return lLo.compareTo(lHi) * lMult;

//$Section=Operation$ID=4295BB6C00E8$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// JeoTypeName
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4161407D031C$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4161407D031C$Preserve=no
    public String getJeoTypeName() {
//$Section=Attribute get$ID=4161407D031C$Preserve=no
        return iJeoTypeName;
//$Section=Attribute get$ID=4161407D031C$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4161407D031C$Preserve=no
/**
 * Set accessor method.
 *
 * @param JeoTypeName the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4161407D031C$Preserve=no
    public void setJeoTypeName(String aValue) {
//$Section=Attribute set$ID=4161407D031C$Preserve=no
        iJeoTypeName = aValue;
//$Section=Attribute set$ID=4161407D031C$Preserve=no
    }
//----------------------------------------------------------------------------
// JeoCollection
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4161413B03D8$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4161413B03D8$Preserve=no
    protected ArrayList getJeoCollection() {
//$Section=Attribute get$ID=4161413B03D8$Preserve=yes
        if (iJeoCollection == null) iJeoCollection = new ArrayList();
        return iJeoCollection;
//$Section=Attribute get$ID=4161413B03D8$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4161413B03D8$Preserve=no
/**
 * Set accessor method.
 *
 * @param JeoCollection the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4161413B03D8$Preserve=no
    protected void setJeoCollection(ArrayList aValue) {
//$Section=Attribute set$ID=4161413B03D8$Preserve=no
        iJeoCollection = aValue;
//$Section=Attribute set$ID=4161413B03D8$Preserve=no
    }
//----------------------------------------------------------------------------
// InstanceName
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=41635D87014E$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=41635D87014E$Preserve=no
    public String getInstanceName() {
//$Section=Attribute get$ID=41635D87014E$Preserve=no
        return iInstanceName;
//$Section=Attribute get$ID=41635D87014E$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=41635D87014E$Preserve=no
/**
 * Set accessor method.
 *
 * @param InstanceName the value to be set.
 */
//$Section=Attribute setJavadoc$ID=41635D87014E$Preserve=no
    public void setInstanceName(String aValue) {
//$Section=Attribute set$ID=41635D87014E$Preserve=no
        iInstanceName = aValue;
//$Section=Attribute set$ID=41635D87014E$Preserve=no
    }
//----------------------------------------------------------------------------
// Properties
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4163D5220251$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4163D5220251$Preserve=no
    public Map getProperties() {
//$Section=Attribute get$ID=4163D5220251$Preserve=no
        return iProperties;
//$Section=Attribute get$ID=4163D5220251$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4163D5220251$Preserve=no
/**
 * Set accessor method.
 *
 * @param Properties the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4163D5220251$Preserve=no
    public void setProperties(Map aValue) {
//$Section=Attribute set$ID=4163D5220251$Preserve=no
        iProperties = aValue;
//$Section=Attribute set$ID=4163D5220251$Preserve=no
    }
//----------------------------------------------------------------------------
// JeoFactory
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4203D77B01F4$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4203D77B01F4$Preserve=no
    public JeoFactory getJeoFactory() {
//$Section=Attribute get$ID=4203D77B01F4$Preserve=no
        return iJeoFactory;
//$Section=Attribute get$ID=4203D77B01F4$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4203D77B01F4$Preserve=no
/**
 * Set accessor method.
 *
 * @param JeoFactory the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4203D77B01F4$Preserve=no
    public void setJeoFactory(JeoFactory aValue) {
//$Section=Attribute set$ID=4203D77B01F4$Preserve=no
        iJeoFactory = aValue;
//$Section=Attribute set$ID=4203D77B01F4$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=4161400602FD$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4161400602FD$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4161400602FD$Preserve=no

//End of class---------------
}
