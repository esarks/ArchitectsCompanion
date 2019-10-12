//$Section=License$ID=4203CA910109$Preserve=no

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

//  Generated at 2005.05.12 02:06:13.943 PM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: JeoFactory.java

//$Section=ChangeLog$ID=4203CA910109$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=4203CA910109$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import java.net.*;

//$Section=CustomDeclare$ID=4203CA910109$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=4203CA910109$Preserve=no

//$Section=ClassJavadoc$ID=4203CA910109$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=4203CA910109$Preserve=no
public class JeoFactory {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private ClassLoader iAcClassLoader;
    private static JeoFactory iInstance = null;
    private Map iPathList = new TreeMap();
    private Map iStereotypeList = new TreeMap();

//$Section=CustomClassDeclare$ID=4203CA910109$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=4203CA910109$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=4203CA910109$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=4203CA910109$Preserve=no
    private JeoFactory() {
//$Section=DefaultConstructor$ID=4203CA910109$Preserve=yes
//$Section=DefaultConstructor$ID=4203CA910109$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=4203CA910109$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=4203CA910109$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=4203CA910109$Preserve=yes
//$Section=DefaultDestructor$ID=4203CA910109$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=4203CA910109$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=4203CA910109$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=4203CA910109$Preserve=yes
//$Section=DefaultFreeResources$ID=4203CA910109$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=4204044400DA$Preserve=yes
/**
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4204044400DA$Preserve=no
    public static JeoFactory getInstance( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=4204044400DA$Preserve=yes
// Disable singleton
        if (iInstance != null) return iInstance;
        iInstance = new JeoFactory();
        return iInstance;
//$Section=Operation$ID=4204044400DA$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203CADA0138$Preserve=yes
/**
 *
 * @param aJeoName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4203CADA0138$Preserve=no
    public synchronized Jeo reserveJeo( String aJeoName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=4203CADA0138$Preserve=yes

    Jeo lJeo = newJeo(aJeoName);
    return lJeo;

//$Section=Operation$ID=4203CADA0138$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203D99C00FA$Preserve=yes
/**
 *
 * @param aJeoName
 *
 * @param aInstanceName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4203D99C00FA$Preserve=no
    public synchronized Jeo reserveJeo( String aJeoName, String aInstanceName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=4203D99C00FA$Preserve=yes

    Jeo lJeo = newJeo(aJeoName);
    lJeo.setName(aInstanceName);
    return lJeo;

//$Section=Operation$ID=4203D99C00FA$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203D99F0213$Preserve=yes
/**
 *
 * @param aJeoName
 *
 * @param aInstanceName
 *
 * @param aTypeName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4203D99F0213$Preserve=no
    public synchronized Jeo reserveJeo( String aJeoName, String aInstanceName, String aTypeName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=4203D99F0213$Preserve=yes

    Jeo lJeo = newJeo(aJeoName);
    lJeo.setName(aInstanceName);
    lJeo.setJeoTypeName(aTypeName);
    return lJeo;

//$Section=Operation$ID=4203D99F0213$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203D99F034B$Preserve=yes
/**
 *
 * @param aJeoName
 *
 * @param aInstanceName
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4203D99F034B$Preserve=no
    public synchronized Jeo reserveJeo( String aJeoName, String aInstanceName, Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=4203D99F034B$Preserve=yes

    Jeo lJeo = newJeo(aJeoName);
    lJeo.setName(aInstanceName);
    lJeo.setScript(aScript);
    return lJeo;

//$Section=Operation$ID=4203D99F034B$Preserve=no
    }

//$Section=OperationJavadoc$ID=4203D9A0007D$Preserve=yes
/**
 *
 * @param aJeoName
 *
 * @param aInstanceName
 *
 * @param aTypeName
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4203D9A0007D$Preserve=no
    public synchronized Jeo reserveJeo( String aJeoName, String aInstanceName, String aTypeName, Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=4203D9A0007D$Preserve=yes

    Jeo lJeo = newJeo(aJeoName);
    lJeo.setName(aInstanceName);
    lJeo.setJeoTypeName(aTypeName);
    lJeo.setScript(aScript);
    return lJeo;

//$Section=Operation$ID=4203D9A0007D$Preserve=no
    }

//$Section=OperationJavadoc$ID=42838C7F0186$Preserve=yes
/**
 *
 * @param aJeoName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42838C7F0186$Preserve=no
    private Jeo newJeo( String aJeoName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=42838C7F0186$Preserve=yes

        try {
//            if (iAcClassLoader == null) {
//                File lFile = new File(iScript.getMasterScript().getSymbolTable().getPropertyCollection().getPropertyValue("$jac:path:work", 0).toString() + System.getProperty("file.separator"));
//                URL lUrl = lFile.toURL();
//                iAcClassLoader = new URLClassLoader(new URL[]{lUrl}, ClassLoader.getSystemClassLoader());
//            }
//            Class lExecClass = iAcClassLoader.loadClass(aJeoName);

            Class lExecClass = this.getClass().getClassLoader().loadClass(aJeoName);
            Class lSuperClass = lExecClass.getSuperclass();
// Loading of the superclasses appears to be necessary in both Tomcat and Jetty.  Stand alone doesn't appear to need this...
            while (lSuperClass != null) {
                lSuperClass = lSuperClass.getSuperclass();
            }

            Class lConstructorArray[] = {this.getClass()};
            Constructor lConstructor = lExecClass.getConstructor(lConstructorArray);
            Object lConstructorParams[] = { this };
            Object lInstance = lConstructor.newInstance(lConstructorParams);
            return (Jeo) lInstance;
        } catch (Throwable e) { System.err.println(e);
                                return null; }

//$Section=Operation$ID=42838C7F0186$Preserve=no
    }

//$Section=OperationJavadoc$ID=428399A90266$Preserve=yes
/**
 *
 * @param aName
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=428399A90266$Preserve=no
    public void registerRenderPath( String aName, String aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=428399A90266$Preserve=yes

        if (iPathList.containsKey(aName) == false) {
            iPathList.put(aName, aScript);
        }

//$Section=Operation$ID=428399A90266$Preserve=no
    }

//$Section=OperationJavadoc$ID=42839A600147$Preserve=yes
/**
 *
 * @param aName
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42839A600147$Preserve=no
    public void registerRenderStereotype( String aName, String aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=42839A600147$Preserve=yes

        if (iStereotypeList.containsKey(aName) == false) {
            iStereotypeList.put(aName, aScript);
        }

//$Section=Operation$ID=42839A600147$Preserve=no
    }

//$Section=OperationJavadoc$ID=42839A6A005D$Preserve=yes
/**
 *
 * @param aName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42839A6A005D$Preserve=no
    public String getRenderPath( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=42839A6A005D$Preserve=yes

        int lIdx = 0;
        
        while (true) {

            if (lIdx >= aName.length()) {
                if (iPathList.containsKey(aName)) {
                    return (String) iPathList.get(aName);
                }
                return "";
            }
            
            if (aName.charAt(lIdx) == '.') {
                if (iPathList.containsKey(aName.substring(0, lIdx))) {
                    return (String) iPathList.get(aName.substring(0, lIdx));
                }
            }
            
            lIdx++;

        }

//$Section=Operation$ID=42839A6A005D$Preserve=no
    }

//$Section=OperationJavadoc$ID=42839A8303B7$Preserve=yes
/**
 *
 * @param aName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42839A8303B7$Preserve=no
    public String getRenderStereotype( String aName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter JeoFactory.");
//$Section=Operation$ID=42839A8303B7$Preserve=yes

        if (iStereotypeList.containsKey(aName)) return (String) iStereotypeList.get(aName);
        return "";
        
//$Section=Operation$ID=42839A8303B7$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=4203CA910109$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4203CA910109$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=4203CA910109$Preserve=no

//End of class---------------
}
