//$Section=License$ID=40F6C2940000$Preserve=no

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

//  Generated at 2009.03.23 06:20:24.687 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: ScriptHelper.java

//$Section=ChangeLog$ID=40F6C2940000$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
                      Author

 * ========================================================================= */

//$Section=Class$ID=40F6C2940000$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.io.*;

//$Section=CustomDeclare$ID=40F6C2940000$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=40F6C2940000$Preserve=no

//$Section=ClassJavadoc$ID=40F6C2940000$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=40F6C2940000$Preserve=no
public class ScriptHelper {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    protected Script iScript;
    protected SymbolTable iSymbolTable;
    protected OutputManager iOutputManager;
    protected PropertyHelper iPropertyHelper;
    protected Log iLog;
    protected String iName;
    protected String iInstance;
    protected Log iErrorLog;

//$Section=CustomClassDeclare$ID=40F6C2940000$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=40F6C2940000$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=40F6C2940000$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=40F6C2940000$Preserve=no
    protected ScriptHelper() {
//$Section=DefaultConstructor$ID=40F6C2940000$Preserve=yes
//$Section=DefaultConstructor$ID=40F6C2940000$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=40F6C2940000$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=40F6C2940000$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=40F6C2940000$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=40F6C2940000$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=40F6C2940000$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=40F6C2940000$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=40F6C2940000$Preserve=yes

        iScript = null;
        iSymbolTable = null;
        iOutputManager = null;
        iPropertyHelper = null;
        iLog = null;

//$Section=DefaultFreeResources$ID=40F6C2940000$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=40F6C5EF00FA$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=40F6C5EF00FA$Preserve=no
    public ScriptHelper( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C5EF00FA$Preserve=yes

        iScript = aScript;
        iSymbolTable = iScript.getSymbolTable();
        iOutputManager = iScript.getOutputManager();
        iPropertyHelper = new PropertyHelper(iScript);
//        iLog = Log.getInstance();

//$Section=Operation$ID=40F6C5EF00FA$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F7C8BC02DE$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aName
 *
 * @param aInstance
 *
 */
//$Section=OperationJavadoc$ID=40F7C8BC02DE$Preserve=no
    public ScriptHelper( Script aScript, String aName, String aInstance ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F7C8BC02DE$Preserve=yes

        iScript = aScript;
        iSymbolTable = iScript.getSymbolTable();
        iOutputManager = iScript.getMasterScript().getOutputManager();
        iPropertyHelper = new PropertyHelper(iScript);
//        iLog = Log.getInstance();
        iName = aName;
        iInstance = aInstance;

//$Section=Operation$ID=40F7C8BC02DE$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C2D80213$Preserve=yes
/**
 *
 * @param aPackage
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C2D80213$Preserve=no
    protected String path( String aPackage ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C2D80213$Preserve=yes

        return iScript.getMasterScript().getSymbolTable().getScriptsFilePath(aPackage);

//$Section=Operation$ID=40F6C2D80213$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C3170186$Preserve=yes
/**
 *
 * @param aPackage
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C3170186$Preserve=no
    protected String workPath( String aPackage ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C3170186$Preserve=yes

        return iScript.getMasterScript().getSymbolTable().getWorkFilePath(aPackage);

//$Section=Operation$ID=40F6C3170186$Preserve=no
    }

//$Section=OperationJavadoc$ID=42C556C400C0$Preserve=yes
/**
 *
 * @param aPackage
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42C556C400C0$Preserve=no
    protected String homePath( String aPackage ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=42C556C400C0$Preserve=yes

        return iScript.getMasterScript().getSymbolTable().getHomeFilePath(aPackage);

//$Section=Operation$ID=42C556C400C0$Preserve=no
    }

//$Section=OperationJavadoc$ID=49C620E30271$Preserve=yes
/**
 *
 * @param aPackage
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=49C620E30271$Preserve=no
    protected String documentPath( String aPackage ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=49C620E30271$Preserve=yes

        return iScript.getMasterScript().getSymbolTable().getDocumentPath(aPackage);

//$Section=Operation$ID=49C620E30271$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C3390167$Preserve=yes
/**
 *
 * @param aOutput
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C3390167$Preserve=no
    protected void appendOutput( String aOutput ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C3390167$Preserve=yes

        iOutputManager.openOutputFile(aOutput, true);

//$Section=Operation$ID=40F6C3390167$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C3630196$Preserve=yes
/**
 *
 * @param aOutput
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C3630196$Preserve=no
    protected boolean openOutput( String aOutput ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C3630196$Preserve=yes

        return iOutputManager.openOutputFile(aOutput, false);

//$Section=Operation$ID=40F6C3630196$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FBFE130157$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FBFE130157$Preserve=no
    protected void closeOutput( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40FBFE130157$Preserve=yes

        iOutputManager.closeOutputFile();

//$Section=Operation$ID=40FBFE130157$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C39E0186$Preserve=yes
/**
 *
 * @param aOutputFile
 *
 * @param aInputFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C39E0186$Preserve=no
    protected void merge( String aOutputFile, String aInputFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C39E0186$Preserve=yes

        Merge.getInstance().doMerge(aOutputFile, aInputFile, iScript);

//$Section=Operation$ID=40F6C39E0186$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C3CE01A5$Preserve=yes
/**
 *
 * @param aSchemaName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C3CE01A5$Preserve=no
    protected void loadXmlSchema( String aSchemaName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C3CE01A5$Preserve=yes

        iSymbolTable.loadXmlSchema(aSchemaName);

//$Section=Operation$ID=40F6C3CE01A5$Preserve=no
    }

//$Section=OperationJavadoc$ID=4112196E03C8$Preserve=yes
/**
 *
 * @param aSchemaName
 *
 * @param aFilePath
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=4112196E03C8$Preserve=no
    protected void loadXmlSchema( String aSchemaName, String aFilePath ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=4112196E03C8$Preserve=yes

        iSymbolTable.loadXmlSchema(aSchemaName, aFilePath);

//$Section=Operation$ID=4112196E03C8$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C3EF00FA$Preserve=yes
/**
 *
 * @param aFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C3EF00FA$Preserve=no
    public void parseXmlSchema( String aFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C3EF00FA$Preserve=yes

        iSymbolTable.parseXmlSchema(path(aFile) + ".xml");

//$Section=Operation$ID=40F6C3EF00FA$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C51A02AF$Preserve=yes
/**
 *
 * @param aFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C51A02AF$Preserve=no
    public void parseXmlSchemaPath( String aFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C51A02AF$Preserve=yes

        iSymbolTable.parseXmlSchema(aFile);

//$Section=Operation$ID=40F6C51A02AF$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C5420128$Preserve=yes
/**
 *
 * @param aFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C5420128$Preserve=no
    public void parseXml( String aFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C5420128$Preserve=yes

        parseXmlPath(path(aFile) + ".xml");

//$Section=Operation$ID=40F6C5420128$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C562032C$Preserve=yes
/**
 *
 * @param aFile
 *
 * @param aRoot
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C562032C$Preserve=no
    public void parseXml( String aFile, String aRoot ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C562032C$Preserve=yes

        parseXmlPath(path(aFile) + ".xml", aRoot);

//$Section=Operation$ID=40F6C562032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C59001D4$Preserve=yes
/**
 *
 * @param aFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C59001D4$Preserve=no
    public void parseXmlPath( String aFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C59001D4$Preserve=yes

        iSymbolTable.parseXml(aFile);

//$Section=Operation$ID=40F6C59001D4$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C59902FD$Preserve=yes
/**
 *
 * @param aFile
 *
 * @param aRoot
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C59902FD$Preserve=no
    public void parseXmlPath( String aFile, String aRoot ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C59902FD$Preserve=yes

        iSymbolTable.parseXml(aFile, aRoot);

//$Section=Operation$ID=40F6C59902FD$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F6C5A800FA$Preserve=yes
/**
 *
 * @param aFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F6C5A800FA$Preserve=no
    protected boolean xmlExists( String aFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F6C5A800FA$Preserve=yes

        File lFile = new File(path(aFile) + ".xml");
        return lFile.exists();

//$Section=Operation$ID=40F6C5A800FA$Preserve=no
    }

//$Section=OperationJavadoc$ID=411F6785000F$Preserve=yes
/**
 *
 * @param aDocumentName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=411F6785000F$Preserve=no
    protected void addDocument( String aDocumentName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=411F6785000F$Preserve=yes

        iOutputManager.addDocument(aDocumentName);

//$Section=Operation$ID=411F6785000F$Preserve=no
    }

//$Section=OperationJavadoc$ID=411F67850011$Preserve=yes
/**
 *
 * @param aDocumentName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=411F67850011$Preserve=no
    protected StringBuffer getDocument( String aDocumentName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=411F67850011$Preserve=yes

        return iOutputManager.getDocument(aDocumentName);

//$Section=Operation$ID=411F67850011$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F7C7C0032C$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aName
 *
 * @param aInstance
 *
 * @param aCreateNewScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F7C7C0032C$Preserve=no
    public synchronized static ScriptHelper getScriptHelper( Script aScript, String aName, String aInstance, boolean aCreateNewScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F7C7C0032C$Preserve=yes

        return getScriptHelper(aScript, aName, aInstance, aCreateNewScript, new ScriptHelperFactory());

//$Section=Operation$ID=40F7C7C0032C$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F7C7C0034B$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aName
 *
 * @param aInstance
 *
 * @param aCreateNewScript
 *
 * @param aScriptHelperFactory
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F7C7C0034B$Preserve=no
    public synchronized static ScriptHelper getScriptHelper( Script aScript, String aName, String aInstance, boolean aCreateNewScript, ScriptHelperFactory aScriptHelperFactory ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40F7C7C0034B$Preserve=yes

        PropertyValues lPropertyValues = aScript.getSymbolTable().getPropertyCollection().getPropertyValues("$jac:scriptHelper:" + aName, false);
        if (lPropertyValues != null) {
            lPropertyValues.resetIterator(0);
            for (int lCount = 1; lCount <= lPropertyValues.size(); lCount++) {
                if (lPropertyValues.get(lCount).getPropertyCollection().getPropertyValues("instance", false).get(0).toString().compareTo(aInstance) == 0) {
                    return (ScriptHelper) lPropertyValues.get(lCount).getValueObject();
                }
            }
        }

        Script lUseScript = aScript;
        if (aCreateNewScript == true) {
            lUseScript = new Script(aScript);
        }
        ScriptHelper lThis = aScriptHelperFactory.getScriptHelper(lUseScript, aName, aInstance);
        aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:scriptHelper:" + aName, new PropertyValue(lThis));
        aScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:scriptHelper:" + aName + ":instance", new PropertyValue(aInstance));
        return lThis;

//$Section=Operation$ID=40F7C7C0034B$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FEA9B5000F$Preserve=yes
/**
 *
 * @param aRuleName
 *
 * @param aPropertyValue
 *
 * @param aFieldName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FEA9B5000F$Preserve=no
    public PropertyValue validateRule( String aRuleName, PropertyValue aPropertyValue, String aFieldName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=40FEA9B5000F$Preserve=yes

        return aPropertyValue;

//$Section=Operation$ID=40FEA9B5000F$Preserve=no
    }

//$Section=OperationJavadoc$ID=425A6EBC02CE$Preserve=yes
/**
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=425A6EBC02CE$Preserve=no
    public void unloadScript( String aScriptName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=425A6EBC02CE$Preserve=yes
        unloadScript(aScriptName, "");
//$Section=Operation$ID=425A6EBC02CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=425A6EBC033C$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aInstance
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=425A6EBC033C$Preserve=no
    public void unloadScript( String aScriptName, String aInstance ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptHelper.");
//$Section=Operation$ID=425A6EBC033C$Preserve=yes
        PropertyValues lPropertyValues = iScript.getMasterScript().getSymbolTable().getPropertyCollection().getPropertyValues("$jac:scriptHelper:" + aScriptName, false);
        if (lPropertyValues != null) {
            lPropertyValues.resetIterator(0);
            for (int lCount = 1; lCount <= lPropertyValues.size(); lCount++) {
                if (lPropertyValues.get(lCount).getPropertyCollection().getPropertyValues("instance", false).get(0).toString().equals(aInstance)) {
                    ((ScriptHelper) lPropertyValues.get(lCount).getValueObject()).freeResources();
                    lPropertyValues.removeAt(lCount);
                    return;
                }
            }
        }
//$Section=Operation$ID=425A6EBC033C$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Script
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40F6C64C0290$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40F6C64C0290$Preserve=no
    public Script getScript() {
//$Section=Attribute get$ID=40F6C64C0290$Preserve=no
        return iScript;
//$Section=Attribute get$ID=40F6C64C0290$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40F6C64C0290$Preserve=no
/**
 * Set accessor method.
 *
 * @param Script the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40F6C64C0290$Preserve=no
    public void setScript(Script aValue) {
//$Section=Attribute set$ID=40F6C64C0290$Preserve=no
        iScript = aValue;
//$Section=Attribute set$ID=40F6C64C0290$Preserve=no
    }
//----------------------------------------------------------------------------
// SymbolTable
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40F6C66D00FA$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40F6C66D00FA$Preserve=no
    public SymbolTable getSymbolTable() {
//$Section=Attribute get$ID=40F6C66D00FA$Preserve=no
        return iSymbolTable;
//$Section=Attribute get$ID=40F6C66D00FA$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40F6C66D00FA$Preserve=no
/**
 * Set accessor method.
 *
 * @param SymbolTable the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40F6C66D00FA$Preserve=no
    public void setSymbolTable(SymbolTable aValue) {
//$Section=Attribute set$ID=40F6C66D00FA$Preserve=no
        iSymbolTable = aValue;
//$Section=Attribute set$ID=40F6C66D00FA$Preserve=no
    }
//----------------------------------------------------------------------------
// OutputManager
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40F6C67F029F$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40F6C67F029F$Preserve=no
    public OutputManager getOutputManager() {
//$Section=Attribute get$ID=40F6C67F029F$Preserve=no
        return iOutputManager;
//$Section=Attribute get$ID=40F6C67F029F$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40F6C67F029F$Preserve=no
/**
 * Set accessor method.
 *
 * @param OutputManager the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40F6C67F029F$Preserve=no
    public void setOutputManager(OutputManager aValue) {
//$Section=Attribute set$ID=40F6C67F029F$Preserve=no
        iOutputManager = aValue;
//$Section=Attribute set$ID=40F6C67F029F$Preserve=no
    }
//----------------------------------------------------------------------------
// PropertyHelper
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40F6C6920213$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40F6C6920213$Preserve=no
    public PropertyHelper getPropertyHelper() {
//$Section=Attribute get$ID=40F6C6920213$Preserve=no
        return iPropertyHelper;
//$Section=Attribute get$ID=40F6C6920213$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40F6C6920213$Preserve=no
/**
 * Set accessor method.
 *
 * @param PropertyHelper the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40F6C6920213$Preserve=no
    public void setPropertyHelper(PropertyHelper aValue) {
//$Section=Attribute set$ID=40F6C6920213$Preserve=no
        iPropertyHelper = aValue;
//$Section=Attribute set$ID=40F6C6920213$Preserve=no
    }
//----------------------------------------------------------------------------
// Name
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40F7C76A035B$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40F7C76A035B$Preserve=no
    public String getName() {
//$Section=Attribute get$ID=40F7C76A035B$Preserve=no
        return iName;
//$Section=Attribute get$ID=40F7C76A035B$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40F7C76A035B$Preserve=no
/**
 * Set accessor method.
 *
 * @param Name the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40F7C76A035B$Preserve=no
    public void setName(String aValue) {
//$Section=Attribute set$ID=40F7C76A035B$Preserve=no
        iName = aValue;
//$Section=Attribute set$ID=40F7C76A035B$Preserve=no
    }
//----------------------------------------------------------------------------
// Instance
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=4133843A000F$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=4133843A000F$Preserve=no
    public String getInstance() {
//$Section=Attribute get$ID=4133843A000F$Preserve=no
        return iInstance;
//$Section=Attribute get$ID=4133843A000F$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=4133843A000F$Preserve=no
/**
 * Set accessor method.
 *
 * @param Instance the value to be set.
 */
//$Section=Attribute setJavadoc$ID=4133843A000F$Preserve=no
    public void setInstance(String aValue) {
//$Section=Attribute set$ID=4133843A000F$Preserve=no
        iInstance = aValue;
//$Section=Attribute set$ID=4133843A000F$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=40F6C2940000$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=40F6C2940000$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=40F6C2940000$Preserve=no

//End of class---------------
}
