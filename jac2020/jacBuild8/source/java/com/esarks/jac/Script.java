//$Section=License$ID=3F9C588102FD$Preserve=no

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

//  Generated at 2005.06.13 05:50:31.421 PM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Script.java

//$Section=ChangeLog$ID=3F9C588102FD$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9C588102FD$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import java.net.*;
import java.text.*;
import javax.crypto.*;
import javax.crypto.spec.*;

//$Section=CustomDeclare$ID=3F9C588102FD$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

import java.awt.*;
import javax.swing.*;

//$Section=CustomDeclare$ID=3F9C588102FD$Preserve=no

//$Section=ClassJavadoc$ID=3F9C588102FD$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3F9C588102FD$Preserve=no
public class Script {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Log iLog;
    private int iLogClass = 0;
    public static int iInstance = 0;
    public static int iMaxInstance = 0;
    private String iThisInstance;
    private SymbolTable iSymbolTable;
    private OutputManager iOutputManager;
    private String iFileSeparator;
    private Script iParentScript;
    private Script iGlobalScript = null;
    private boolean iReverseMerge = true;
    private ClassLoader iAcClassLoader;

//$Section=CustomClassDeclare$ID=3F9C588102FD$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9C588102FD$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9C588102FD$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9C588102FD$Preserve=no
    private Script() {
//$Section=DefaultConstructor$ID=3F9C588102FD$Preserve=yes

        iInstance++;
        if (iInstance > iMaxInstance) iMaxInstance = iInstance;
        iFileSeparator = System.getProperty("file.separator");
        iOutputManager = new OutputManager();
        iSymbolTable = new SymbolTable();
        iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:result",new PropertyValue("true"));

//$Section=DefaultConstructor$ID=3F9C588102FD$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9C588102FD$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9C588102FD$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9C588102FD$Preserve=yes

        freeResources();
        iInstance--;

//$Section=DefaultDestructor$ID=3F9C588102FD$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9C588102FD$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9C588102FD$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9C588102FD$Preserve=yes

        iSymbolTable = null;
        iOutputManager = null;
        iAcClassLoader = null;
        iParentScript = null;
        iGlobalScript = null;
        
//$Section=DefaultFreeResources$ID=3F9C588102FD$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3F9D2E8C00F9$Preserve=yes
/**
 *
 * @param aLicensePath
 *
 */
//$Section=OperationJavadoc$ID=3F9D2E8C00F9$Preserve=no
    public Script( String aLicensePath ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3F9D2E8C00F9$Preserve=yes

        if (aLicensePath.toLowerCase().equals("copyright architects of software design, corp.")) {
            iInstance++;
            if (iInstance > iMaxInstance) iMaxInstance = iInstance;
            iFileSeparator = System.getProperty("file.separator");
            iOutputManager = new OutputManager();
            iSymbolTable = new SymbolTable();
            iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:result",new PropertyValue("true"));
            return;
        }
        
System.err.println("License Path: " + aLicensePath);

        iInstance++;
        if (iInstance > iMaxInstance) iMaxInstance = iInstance;

        iFileSeparator = System.getProperty("file.separator");

        iOutputManager = new OutputManager();

        iSymbolTable = new SymbolTable();
//        iSymbolTable.loadingXml(true);
        iSymbolTable.parseXml(aLicensePath);

        try {
          InetAddress lAddress = InetAddress.getLocalHost();
        } catch (Exception lException) {
            iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:result",new PropertyValue("exception"));
            iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:exception",new PropertyValue(lException.getMessage()));
System.err.println("ERROR: Exception validating license.");
            try {
                while (System.in.available() > 0) System.in.read();
                System.out.print("Press ENTER to continue...");
                System.in.read();
                while (System.in.available() > 0) System.in.read();
            } catch (Throwable e) {}
            iSymbolTable = null;
            return;
        }

        PBEKeySpec lPBEKeySpec;
        PBEParameterSpec lPBEParamSpec;
        SecretKeyFactory lSecretKeyFactory;

        // Salt must be eight bytes long.
        //String lSaltString = "ac500000";
        String lSaltString = "ac500001";
        byte[] lSalt = lSaltString.getBytes();

        int lCount = 5;

//System.out.print("Licensed to: ");
//System.out.println(iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:name", 0).getValueString());

        String lCheck =
            iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:from", 0).getValueString() +
            iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:to", 0).getValueString() +
            iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:options", 0).getValueString() +
            iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:host", 0).getValueString() +
            iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:email", 0).getValueString() +
            iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:name", 0).getValueString();
        char[] lCheckChar = new char[lCheck.length()];
        lCheck.getChars(0, lCheck.length(), lCheckChar, 0);

        try {
            lPBEParamSpec = new PBEParameterSpec(lSalt, lCount);
            lPBEKeySpec = new PBEKeySpec(lCheckChar);
            lSecretKeyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
            SecretKey lSecretKey = lSecretKeyFactory.generateSecret(lPBEKeySpec);
            Cipher lCipher = Cipher.getInstance("PBEWithMD5AndDES");
            lCipher.init(Cipher.ENCRYPT_MODE, lSecretKey, lPBEParamSpec);
            byte[] lClearText = new String(lCheck).getBytes();
            byte[] lCipherText = lCipher.doFinal(lClearText);
            String lCipherString = new Long(lCipherText.length).toString();
            for (int l=0; l<lCipherText.length; l++) {
                lCipherString = lCipherString.concat(new Byte(lCipherText[l]).toString()) + new Long(l).toString();
            }
            if (lCipherString.compareTo(iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:key", 0).getValueString()) != 0) {
                iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:result",new PropertyValue("false"));
System.err.println("ERROR: Invalid license.");
                try {
                    while (System.in.available() > 0) System.in.read();
                    System.out.print("Press ENTER to continue...");
                    System.in.read();
                    while (System.in.available() > 0) System.in.read();
                } catch (Throwable e) {}
                iSymbolTable = null;
                return;
            } else {
                iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:result",new PropertyValue("true"));
            }

            InetAddress lAddress = InetAddress.getLocalHost();
            if (iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:host", 0).getValueString().length() > 0 &&
              lAddress.getHostName().toLowerCase().compareTo(iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:host", 0).getValueString()) != 0) {
System.err.println("ERROR: Invalid host.");
                try {
                    while (System.in.available() > 0) System.in.read();
                    System.out.print("Press ENTER to continue...");
                    System.in.read();
                    while (System.in.available() > 0) System.in.read();
                } catch (Throwable e) {}
                iSymbolTable = null;
                return;
            }

            java.util.Date lToday = new java.util.Date(System.currentTimeMillis());
            SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
            String lTodayString = lSimpleDateFormat.format(lToday);
            if (iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:to", 0).getValueString().length() > 0 &&
                lTodayString.compareTo(iSymbolTable.getPropertyCollection().getPropertyValue("license:jac:to", 0).getValueString()) > 0) {
                iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:result",new PropertyValue("expired"));
System.err.println("ERROR: Expired license.");
                try {
                    while (System.in.available() > 0) System.in.read();
                    System.out.print("Press ENTER to continue...");
                    System.in.read();
                    while (System.in.available() > 0) System.in.read();
                } catch (Throwable e) {}
                iSymbolTable = null;
                return;
            }

        } catch (Exception lException) {
            iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:result",new PropertyValue("exception"));
            iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:exception",new PropertyValue(lException.getMessage()));
System.err.println("ERROR: Exception validating license.");
                try {
                    while (System.in.available() > 0) System.in.read();
                    System.out.print("Press ENTER to continue...");
                    System.in.read();
                    while (System.in.available() > 0) System.in.read();
                } catch (Throwable e) {}
            iSymbolTable = null;
            return;
        }
//        System.out.println("License Verified.");
//        iSymbolTable.loadingXml(false);

//$Section=Operation$ID=3F9D2E8C00F9$Preserve=no
    }

//$Section=OperationJavadoc$ID=40DE054D01E4$Preserve=yes
/**
 *
 * @param aScript
 *
 */
//$Section=OperationJavadoc$ID=40DE054D01E4$Preserve=no
    public Script( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=40DE054D01E4$Preserve=yes

        iInstance++;
        if (iInstance > iMaxInstance) iMaxInstance = iInstance;

        iParentScript = aScript;

        iFileSeparator = System.getProperty("file.separator");

        iOutputManager = aScript.getOutputManager();

        iSymbolTable = new SymbolTable();
        iSymbolTable.getPropertyCollection().resetPropertyValue("license:jac:result",new PropertyValue("true"));

//$Section=Operation$ID=40DE054D01E4$Preserve=no
    }

//$Section=OperationJavadoc$ID=424E4CAC0290$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aContext
 *
 * @param aCompile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=424E4CAC0290$Preserve=no
    public boolean buildScript( String aScriptName, String aContext, boolean aCompile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=424E4CAC0290$Preserve=yes
        // Support previous prototype... defaulting aForceMake = false.
        return buildScript(aScriptName, aContext, aCompile, false);
//$Section=Operation$ID=424E4CAC0290$Preserve=no
    }

//$Section=OperationJavadoc$ID=418150150203$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aContext
 *
 * @param aCompile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=418150150203$Preserve=no
    public boolean buildScript( String aScriptName, String aContext, boolean aCompile, boolean aForceMake ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=418150150203$Preserve=yes

//System.err.println("Build " + aScriptName);

//        if (aScriptName.trim().length() == 0) {
//            System.err.println("Requested null script... returning null.");
//            return null;
//        }

        // Make sure context isn't coming in blank...
        if (aContext == null || aContext.length() == 0) aContext = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:context", 0).toString();

        boolean lCantMake = false;
        boolean lStale = false;
        if (aForceMake) lStale = true;
        String lLine;

        String lHomePath = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:path:home", 0).toString();
        String lWorkPath = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:path:work", 0).toString();
        String lScriptPath = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:path:scripts", 0).toString();

        String lPackageName = "";
        String lPackagePath = "";
        String lScriptName = aScriptName;

        {
            int lLastDot = -1;
            for (int lIdx = aScriptName.length() - 1; lIdx >= 0; lIdx--) {
                if (aScriptName.charAt(lIdx) == '.') {
                    lLastDot = lIdx;
                    break;
                }
            }

            if (lLastDot > -1) {
                lPackageName = aScriptName.substring(0, lLastDot);
                lPackagePath = lPackageName;
                lScriptName = aScriptName.substring(lLastDot + 1);
            }

            iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script", new PropertyValue(lScriptName));
            iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:package", new PropertyValue(lPackagePath));

            int lIdx = lPackagePath.indexOf(".");
            while (lIdx > -1) {
                lPackagePath = lPackagePath.substring(0,lIdx) + iFileSeparator + lPackagePath.substring(lIdx+1);
                lIdx = lPackagePath.indexOf(".");
            }
            iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:path", new PropertyValue(lPackagePath));
        }

// Check existance of primary source .xml and parse it.  Not used at this time... Prefer setting through primary source methods.
//        File lXmlFile = new File(lScriptPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".xml");
//        if (lXmlFile.exists()) {
//            iSymbolTable.parseXml(lScriptPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".xml");
//        }

        File lMakeFile = new File(lScriptPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".make");
        if (!lMakeFile.exists()) {
            lMakeFile = new File(lHomePath + iFileSeparator + "conf" + iFileSeparator + aContext + ".make");
        }

        File lClassFile = new File(lWorkPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".class");

        if (!lClassFile.exists()) lStale = true;
        if (lStale == false && lMakeFile.exists() && lClassFile.exists() && lMakeFile.lastModified() > lClassFile.lastModified()) lStale = true;
        if (!lMakeFile.exists()) lCantMake = true;

        File lPrimarySourceFile = new File(lScriptPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".script");
        boolean lHasSource = false;  // Used to determine if the primary source file contains source directives.  Will override .make files.
        boolean lHasXml = false;

        if (lPrimarySourceFile.exists()) {
            try {
                File lJavaFile = new File(lWorkPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".java");

                if (iReverseMerge == false && lJavaFile.exists() && lJavaFile.lastModified() > lPrimarySourceFile.lastModified()) lJavaFile.setLastModified(lPrimarySourceFile.lastModified());

                if (iReverseMerge && lJavaFile.exists() && lJavaFile.lastModified() > lPrimarySourceFile.lastModified()) {

                    boolean lReverseMergeThisFile = false;
                    Frame lFrame = new Frame();
                    int lResult = JOptionPane.showConfirmDialog(lFrame, "Do you want to Reverse Merge " + lPrimarySourceFile.getName() + "?");
                    switch (lResult) {
                        case JOptionPane.YES_OPTION:
                            lReverseMergeThisFile = true;
                            break;
                        case JOptionPane.NO_OPTION:
                            lJavaFile.setLastModified(lPrimarySourceFile.lastModified());
                            lReverseMergeThisFile = false;
                            break;
                        case JOptionPane.CANCEL_OPTION:
                            lJavaFile.setLastModified(lPrimarySourceFile.lastModified());
                            lReverseMergeThisFile = false;
                            iReverseMerge = false;
                            break;
                    }
                    lFrame.dispose();

                    if (lReverseMergeThisFile) {
                        if (!iOutputManager.isJspOpen()) iOutputManager.println("Reverse Merging " + lPrimarySourceFile.getName(), true);
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:sectionMarker", new PropertyValue("//$Sec" + "tion="));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:preserveMarker", new PropertyValue("$Pres" + "erve=yes"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:noPreserveMarker", new PropertyValue("$Pres" + "erve=no"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:keepPreserveMarker", new PropertyValue("$Pres" + "erve=keep"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:discardPreserveMarker", new PropertyValue("$Pres" + "erve=discard"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:preservePreamble", new PropertyValue("no"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:comments", new PropertyValue("//"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:commentsBegin", new PropertyValue("/*"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:commentsEnd", new PropertyValue("*/"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:reverseMergeMarker", new PropertyValue("$Reverse" + "Merge=yes"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:reverseMergeNoPreserveMarker", new PropertyValue("$Reverse" + "Merge=no"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:excludeCompare", new PropertyValue("//  Gener" + "ated at"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:trimOutput", new PropertyValue("yes"));
                        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:keepSections", new PropertyValue("no"));
                        Merge.getInstance().doMergeToExisting(lPrimarySourceFile.getAbsolutePath(), lJavaFile.getAbsolutePath(), this);
//                        lJavaFile.setLastModified(lPrimarySourceFile.lastModified());
                    }
                }

                FileReader lFileReader = new FileReader(lPrimarySourceFile);
                BufferedReader lBufferedReader = new BufferedReader(lFileReader);
                LineNumberReader lLineNumberReader = new LineNumberReader(lBufferedReader);
                boolean lStop = false;
                while ((lLine = lLineNumberReader.readLine()) != null && lStop == false) {
                    if (lLine.startsWith("source ") || lLine.startsWith("script ")) {
                        lHasSource = true;
                        String lFileName = iSymbolTable.translateProperties((lLine.substring(7)).trim());
                        if (lLine.startsWith("script ")) {
                            lFileName = iSymbolTable.getScriptsFilePath(lFileName) + ".script";
                        }
                        iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:source", new PropertyValue(lFileName));
                        File lSourceFile = new File(lFileName);
                        if (!lSourceFile.exists()) lCantMake = true;
                        if (lSourceFile.exists() && lClassFile.exists() && lSourceFile.lastModified() > lClassFile.lastModified()) lStale = true;
                    }
                    else if (lLine.startsWith("xml <")) {
                        lHasXml = true;
                        iSymbolTable.parseXml(lLine.substring(4));
                    }
                    else if (lLine.startsWith("import ")) {
                        iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:import", new PropertyValue(lLine.substring(6)));
                    }
                    else if (lLine.startsWith("var ")) {
                        iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:var", new PropertyValue(lLine.substring(4)));
                    }
                    else if (lLine.startsWith("extends ")) {
                        if (iSymbolTable.getPropertyCollection().getPropertyValues("$jac:script:extends", false) == null) {
//                            iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:extends", new PropertyValue("extends " + lLine.substring(8)));
                          iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:extends", new PropertyValue(lLine.substring(8)));
                        }
                    }
                    else if (lLine.startsWith("implements ")) {
                        if (iSymbolTable.getPropertyCollection().getPropertyValues("$jac:script:implements", false) == null) {
                            iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:implements", new PropertyValue("implements " + lLine.substring(11)));
                        }
                    }
                    else if (lLine.startsWith("set ")) {
                        lHasXml = true;
                        int lEqualsAt = lLine.indexOf("=");
                        if (iSymbolTable.getPropertyCollection().getPropertyValues(lLine.substring(4,lEqualsAt), false) == null) {
                            iSymbolTable.getPropertyCollection().addPropertyValue(lLine.substring(4,lEqualsAt), new PropertyValue(lLine.substring(lEqualsAt+1)));
                        }
                    }
                    else if (lLine.startsWith("make ")) {
                        lHasXml = true;
                        String lFileName = iSymbolTable.translateProperties((lLine.substring(5)).trim());
                        lMakeFile = new File(iSymbolTable.translateProperties((lLine.substring(5)).trim()));
                        if (lStale == false && lMakeFile.exists() && lClassFile.exists() && lMakeFile.lastModified() > lClassFile.lastModified()) lStale = true;
                        if (!lMakeFile.exists()) lCantMake = true;
                    }
                    else if (lLine.startsWith("context ")) {
                        lHasXml = true;
                        lMakeFile = new File(lHomePath + iFileSeparator + "conf" + iFileSeparator + lLine.substring(8).trim() + ".make");
                        if (lStale == false && lMakeFile.exists() && lClassFile.exists() && lMakeFile.lastModified() > lClassFile.lastModified()) lStale = true;
                        if (!lMakeFile.exists()) lCantMake = true;
                    }
                    else if (lLine.startsWith("load ")) {
                        int lCommaAt = lLine.indexOf(",");
                        loadScript(lLine.substring(5,lCommaAt),lLine.substring(lCommaAt+1));
                    }
//                    else if (lLine.startsWith("extends ")) {
//                        loadScript(lLine.substring(8));
//                        iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:extends", new PropertyValue(lLine.substring(8)));
//                    }
                    else if (lLine.startsWith("merge ")) {
                        iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:merge", new PropertyValue(lLine.substring(6)));
//    Merge.getInstance().doMerge(existingFile, newFile, this);
                    }
                    else if ((lHasSource == true || lHasXml == true) && lLine.startsWith("end")) {
                        lStop = true;
                    }
                    else {
                        lStop = true;
                    }
                }

                lLineNumberReader.close();
                lLineNumberReader = null;
                lBufferedReader.close();
                lBufferedReader = null;
                lFileReader.close();
                lFileReader = null;

                PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues("$jac:script:merge", false);
                if (lPropertyValues != null) {
                    // Split the text below to keep the keywords from triggering errors during generation
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:sectionMarker", new PropertyValue("//$Sec" + "tion="));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:preserveMarker", new PropertyValue("$Pres" + "erve=yes"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:noPreserveMarker", new PropertyValue("$Pres" + "erve=no"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:keepPreserveMarker", new PropertyValue("$Pres" + "erve=keep"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:discardPreserveMarker", new PropertyValue("$Pres" + "erve=discard"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:preservePreamble", new PropertyValue("yes"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:comments", new PropertyValue("//"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:excludeCompare", new PropertyValue("//  Gener" + "ated at"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:trimOutput", new PropertyValue("yes"));
                    iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:merge:keepSections", new PropertyValue("no"));

                    lPropertyValues.resetIterator(0);
                    while (lPropertyValues.next()) {
System.out.println(">>" + lPrimarySourceFile.getName());
System.out.println(">>" + lPrimarySourceFile.getAbsolutePath());
System.out.println(">>" + lPrimarySourceFile.getCanonicalPath());
System.out.println(">>" + iSymbolTable.getScriptsFilePath(lPropertyValues.get(0).toString()) + ".script");

                        if (Merge.getInstance().doMergeToExisting(lPrimarySourceFile.getAbsolutePath(), iSymbolTable.getScriptsFilePath(lPropertyValues.get(0).toString()) + ".script", this) == true) lStale = true;
                    }
                }

                if (lHasSource == true && lCantMake == false && lStale == true) {
                    makeScript(aScriptName, aCompile);
                }

            } catch (Exception e) {if (!iOutputManager.isJspOpen()) iOutputManager.println(e.getMessage(), true);
                                   if (!iOutputManager.isJspOpen()) iOutputManager.println("Error trying to validate script (1).", true);}
        }

        if (lMakeFile.exists() && lHasSource == false) {
            try {
                FileReader lFileReader = new FileReader(lMakeFile);
                BufferedReader lBufferedReader = new BufferedReader(lFileReader);
                LineNumberReader lLineNumberReader = new LineNumberReader(lBufferedReader);
                while ((lLine = lLineNumberReader.readLine()) != null) {
                    if (lLine.startsWith("source ") || lLine.startsWith("script ")) {
                        String lFileName = iSymbolTable.translateProperties((lLine.substring(7)).trim());
                        if (lLine.startsWith("script ")) {
                            lFileName = iSymbolTable.getScriptsFilePath(lFileName) + ".script";
                        }
                        File lSourceFile = new File(lFileName);
                        if (!lSourceFile.exists()) {
                            lCantMake = true;
                        } else {
                            iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:source", new PropertyValue(lFileName));
                            if (lClassFile.exists() && lSourceFile.lastModified() > lClassFile.lastModified()) lStale = true;
                        }
//                        if (lSourceFile.exists()) {
//                            iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:source", new PropertyValue(lFileName));
//                        } else {
// Allow non-existant sources to proceed with make...
//                            lCantMake = true;
//                        }
//                        if (lSourceFile.exists() && lClassFile.exists() && lSourceFile.lastModified() > lClassFile.lastModified()) lStale = true;
                    }
                    else if (lLine.startsWith("xml <")) {
                        iSymbolTable.parseXml(lLine.substring(4));
                    }
                    else if (lLine.startsWith("import ")) {
                        iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:import", new PropertyValue(lLine.substring(6)));
                    }
                    else if (lLine.startsWith("var ")) {
                        iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:var", new PropertyValue(lLine.substring(4)));
                    }
                    else if (lLine.startsWith("set ")) {
                        int lEqualsAt = lLine.indexOf("=");
                        if (iSymbolTable.getPropertyCollection().getPropertyValues(lLine.substring(4,lEqualsAt), false) == null) {
                            iSymbolTable.getPropertyCollection().addPropertyValue(lLine.substring(4,lEqualsAt), new PropertyValue(lLine.substring(lEqualsAt+1)));
                        }
                    }
                    else if (lLine.startsWith("load ")) {
                        int lCommaAt = lLine.indexOf(",");
                        loadScript(lLine.substring(5,lCommaAt),lLine.substring(lCommaAt+1));
                    }
                    else if (lLine.startsWith("extends ")) {
                        if (iSymbolTable.getPropertyCollection().getPropertyValues("$jac:script:extends", false) == null) {
                            iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:extends", new PropertyValue("extends " + lLine.substring(8)));
                        }
                    }
                    else if (lLine.startsWith("implements ")) {
                        if (iSymbolTable.getPropertyCollection().getPropertyValues("$jac:script:implements", false) == null) {
                            iSymbolTable.getPropertyCollection().addPropertyValue("$jac:script:implements", new PropertyValue("implements " + lLine.substring(11)));
                        }
                    }
                }

                lLineNumberReader.close();
                lLineNumberReader = null;
                lBufferedReader.close();
                lBufferedReader = null;
                lFileReader.close();
                lFileReader = null;

                if (lCantMake == false && lStale == true) {
                    makeScript(aScriptName, aCompile);
                } else {
//                    if (lCantMake == true) iOutputManager.println("<!-- Error making... CantMake = true -->", true);
                    lStale = false;
                }

            } catch (Exception e) {if (!iOutputManager.isJspOpen()) iOutputManager.println(e.getMessage(), true);
                                   if (!iOutputManager.isJspOpen()) iOutputManager.println("Error tring to validate script (2).", true);}
        }

        return lStale;

//$Section=Operation$ID=418150150203$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C5C3900FD$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aCompile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C5C3900FD$Preserve=no
    public void makeScript( String aScriptName, boolean aCompile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3F9C5C3900FD$Preserve=yes

        if (!iOutputManager.isJspOpen()) iOutputManager.println("Making " + iSymbolTable.getPropertyCollection().getPropertyValue("$jac:script", 0).toString(), true);
        if (iOutputManager.isAnyOpen()) System.out.println("Making " + iSymbolTable.getPropertyCollection().getPropertyValue("$jac:script", 0).toString());

        HashMap lSectionItems = new HashMap(100);
        String lLine;
        FileReader lFileReader;
        FileOutputStream lFileOutputStream;
        PrintWriter lPrintWriter;
        FileOutputStream lListFileOutputStream;
        PrintWriter lListPrintWriter;
        File lPrimarySourceFile;
        File lJavaFile;
        int lLineNumber = 0;                                    // Is the line number within the current script

        String lWorkPath = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:path:work", 0).toString();
        String lScriptPath = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:path:scripts", 0).toString();
        String lScriptName = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:script", 0).toString();
        String lPackagePath = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:script:path", 0).toString();
        String lScriptFile = "";

        try {

            File lDirectory = new File(lWorkPath + iFileSeparator + lPackagePath);
            lDirectory.mkdirs();
            lDirectory = null;

            lFileOutputStream = new FileOutputStream(lWorkPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".java", false);
            lPrintWriter = new PrintWriter(lFileOutputStream);

            lListFileOutputStream = new FileOutputStream(lWorkPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".txt", false);
            lListPrintWriter = new PrintWriter(lListFileOutputStream);

        } catch (IOException lException) {

            String lErrMsg = "Warning: Cannot open file. " + lException;
            if (!iOutputManager.isJspOpen()) iOutputManager.println(lErrMsg, true);
            throw new RuntimeException(lErrMsg);
        }

        try {

            ScriptWriter lScriptWriter = new ScriptWriter(this, lPrintWriter);
            PropertyValues lPropertyValues = iSymbolTable.getPropertyCollection().getPropertyValues("$jac:script:source", false);
            lPropertyValues.resetIterator(0);
            while (lPropertyValues.next()) {

                lScriptFile = lPropertyValues.get(0).toString();

                try {

                    lFileReader = new FileReader(lPropertyValues.get(0).toString());

                } catch (IOException lException) {

                    String lErrMsg = "Warning: Cannot open file " + lPropertyValues.get(0).toString() + ". " + lException;
                    if (!iOutputManager.isJspOpen()) iOutputManager.println(lErrMsg, true);
                    throw new RuntimeException(lErrMsg);
                }

                BufferedReader lBufferedReader = new BufferedReader(lFileReader);
                LineNumberReader lLineNumberReader = new LineNumberReader(lBufferedReader);

                lLineNumber = 0;

                boolean lCheckForSource = true;
                boolean lHasSource = false;

                while ((lLine = lLineNumberReader.readLine()) != null) {

                    lLineNumber++;
                    lListPrintWriter.println(lPropertyValues.get(0).toString() + ":" + lLineNumber + ": " + lLine);
                    lListPrintWriter.flush();

                    // Burn the "source" lines if any exist
                    if (lCheckForSource == true && (lLine.startsWith("source ") == true ||
                                                    lLine.startsWith("xml <") == true ||
                                                    lLine.startsWith("import ") == true ||
                                                    lLine.startsWith("var ") == true ||
                                                    lLine.startsWith("set ") == true ||
                                                    lLine.startsWith("make ") == true ||
                                                    lLine.startsWith("context ") == true ||
                                                    lLine.startsWith("load ") == true ||
                                                    lLine.startsWith("extends ") == true ||
                                                    lLine.startsWith("implements ") == true ||
                                                    lLine.startsWith("merge ") == true)) {
                        lHasSource = true;
                        // found source line at beginning of file... ignore consecutive source lines
                    }
                    else if (lCheckForSource == true && lHasSource == true && lLine.startsWith("end") == true) {
                        // ignore this line
                    }
                    else if (lCheckForSource == true) {
                        // done checking for source lines... process this line and rest of file normally
                        lCheckForSource = false;
                    }

                    if (lCheckForSource == false) {

                        if (lLine.startsWith("<#import#>") == true) {
                            PropertyValues lImportValues = iSymbolTable.getPropertyCollection().getPropertyValues("$jac:script:import", false);
                            if (lImportValues != null) {
                                lImportValues.resetIterator(0);
                                while (lImportValues.next()) {
                                    lPrintWriter.println("import " + lImportValues.get(0).toString() + ";");
                                }
                            }
                        } else if (lLine.startsWith("<#var#>") == true) {
                            PropertyValues lVarValues = iSymbolTable.getPropertyCollection().getPropertyValues("$jac:script:var", false);
                            if (lVarValues != null) {
                                lVarValues.resetIterator(0);
                                while (lVarValues.next()) {
                                    lPrintWriter.println(lVarValues.get(0).toString());
                                }
                            }
                        } else {
                          iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:script:lineNumber",new PropertyValue(lLineNumber));
                          lScriptWriter.processLine(lLine, lLineNumber);
                        }
                    }
                }
                lLineNumberReader.close();
                lLineNumberReader = null;
                lBufferedReader.close();
                lBufferedReader = null;
                lFileReader.close();
                lFileReader = null;
            }
            lScriptWriter = null;
            lPrintWriter.close();
            lPrintWriter = null;
            lFileOutputStream.close();
            lFileOutputStream = null;
            lListPrintWriter.close();
            lListPrintWriter = null;
            lListFileOutputStream.close();
            lListFileOutputStream = null;

            lPrimarySourceFile = new File(lScriptPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".script");
            lJavaFile = new File(lWorkPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".java");
            lJavaFile.setLastModified(lPrimarySourceFile.lastModified());

        } catch (IOException lException) {
            String lErrMsg = "Warning: Error reading script file. " + lException;
            throw new RuntimeException(lErrMsg);
        }

        String lSourceName = lWorkPath + iFileSeparator + lPackagePath + iFileSeparator + lScriptName + ".java";
        iSymbolTable.getPropertyCollection().resetPropertyValue("$jac:script:sourceFile", new PropertyValue(lSourceName));
        if (aCompile) compileScript(lSourceName);

        return;

//$Section=Operation$ID=3F9C5C3900FD$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FF944502CE$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aSectionItems
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FF944502CE$Preserve=no
    public void readSections( String aScriptName, HashMap aSectionItems ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=40FF944502CE$Preserve=yes

        String lFileName = getSymbolTable().getScriptsFilePath(aScriptName) + ".script";
        String lLine;
        PreservedItem lPreservedItem = null;

        boolean lSave = false;

        String lSectionMarker="//$section=";
        boolean lTrimOutput=true;

        try {

            LineNumberReader lLineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(lFileName)));

            while ((lLine = lLineNumberReader.readLine()) != null) {

                // Are we preserving text now?
                // If so, we need to save it up to the point of a new marker.
                if (lSave) {
                    if (lLine.indexOf(lSectionMarker) > -1) {
                        lSave = false;   // marker exists on the line, turn preserve off
                        lPreservedItem.addString(lLine.substring(0, lLine.indexOf(lSectionMarker)));
                    } else {
                        lPreservedItem.addString(lLine);
                    }
                }

                // Are we preserving text now?
                // If not, test to see if a section with preserved exists to start preserving.
                if (!lSave) {
                    if (lLine.indexOf(lSectionMarker) > -1) {
                        lPreservedItem = new PreservedItem(lTrimOutput);
                        aSectionItems.put(aScriptName + " " + lLine.substring(lLine.indexOf(lSectionMarker)+2).trim(), lPreservedItem);
                        lSave = true;
                    }
                }
            }

            lLineNumberReader.close();

        } catch (IOException lException) {}

        return;

//$Section=Operation$ID=40FF944502CE$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C5C9D0093$Preserve=yes
/**
 *
 * @param aClassFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C5C9D0093$Preserve=no
    public void compileScript( String aClassFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3F9C5C9D0093$Preserve=yes

        String lClasspath = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:path:classpath", 0).toString();
        String lDebug = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:debug", 0).toString();
        if (lDebug.equals("")) lDebug = "-g:none";

        String [] lSource = null;
        if (lClasspath.length() > 0) {
            lSource = new String[]{ "-classpath", lClasspath, "-g", new String(aClassFile)};
        } else {
            lSource = new String[]{ "-g", new String(aClassFile)};
        }
        ByteArrayOutputStream lByteArrayOutputStream = new ByteArrayOutputStream();

        try {
            String aErrorFile = aClassFile.substring(0, aClassFile.length() - 5) + ".err";
            FileOutputStream lFileOutputStream = new FileOutputStream(aErrorFile);
            PrintStream lPrintStream = new PrintStream(lFileOutputStream);
            PrintStream lSavePrintStream = System.err;
            System.setErr(lPrintStream);

//        com.sun.tools.javac.Main lMain = new com.sun.tools.javac.Main();
//        lMain.compile(lSource);

            if (com.sun.tools.javac.Main.compile(lSource) != 0) {
                lPrintStream.close();
                lFileOutputStream.close();
                System.setErr(lSavePrintStream);

                try {
                    String lLine;
                    FileReader lFileReader = new FileReader(aClassFile.substring(0, aClassFile.length() - 5) + ".err");
                    BufferedReader lBufferedReader = new BufferedReader(lFileReader);
                    LineNumberReader lLineNumberReader = new LineNumberReader(lBufferedReader);
                    if (iOutputManager.isJspOpen()) iOutputManager.println("<pre>", true);
                    iOutputManager.println("*classpath* " + lSource[1], true);
                    iOutputManager.println("*error* Compile Errors *********************************************************************", true);
                    if (iOutputManager.isAnyOpen()) System.out.println("***** Compile Errors *****");
                    while ((lLine = lLineNumberReader.readLine()) != null) {
                        iOutputManager.println(lLine, true);
                        if (iOutputManager.isAnyOpen()) System.out.println(lLine);
                    }
                    if (iOutputManager.isJspOpen()) iOutputManager.println("</pre>", true);

                    Thread.sleep(10000);
                
                } catch (IOException lException) {}

            } else {
                lPrintStream.close();
                lFileOutputStream.close();
                System.setErr(lSavePrintStream);
//                delete(aClassFile);
//                delete(aErrorFile);
//                delete(aClassFile.substring(0, aClassFile.length() - 5) + ".txt");
            }
        } catch (Exception e) {System.out.println(e.getMessage());}

//$Section=Operation$ID=3F9C5C9D0093$Preserve=no
    }

//$Section=OperationJavadoc$ID=41814BC200FA$Preserve=yes
/**
 *
 * @param aClassFiles
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41814BC200FA$Preserve=no
    public void compileScripts( String[] aClassFiles ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=41814BC200FA$Preserve=yes

        if (!iOutputManager.isJspOpen()) iOutputManager.println("Compiling " + Integer.toString(aClassFiles.length) + " Scripts...", true);
        if (iOutputManager.isJspOpen()) System.out.println("Compiling " + Integer.toString(aClassFiles.length) + " Scripts...");
        for (int lIdxCount=0; lIdxCount < aClassFiles.length; lIdxCount++) {
          if (!iOutputManager.isJspOpen()) iOutputManager.println(Integer.toString(lIdxCount+1) + ". " + aClassFiles[lIdxCount], true);
          if (iOutputManager.isJspOpen()) System.out.println(Integer.toString(lIdxCount+1) + ". " + aClassFiles[lIdxCount]);
        }

        String lClasspath = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:path:classpath", 0).toString();
        String [] lSource = null;
        if (lClasspath.length() > 0) {
//            lSource = new String[]{ "-classpath", lClasspath, "-g", new String(aClassFile)};
            lSource = new String[1 + (aClassFiles.length * 2)];
            lSource[0] = "-classpath";
            lSource[1] = lClasspath;
            int lIdxPut = 2;
            lSource[lIdxPut++] = "-g";
            for (int lIdx = 0; lIdx < aClassFiles.length; lIdx++) {
                lSource[lIdxPut++] = aClassFiles[lIdx];
            }
        } else {
//            lSource = new String[]{ "-g", new String(aClassFile)};
//System.out.println("aClassFiles.length = " + aClassFiles.length);
            lSource = new String[(aClassFiles.length) + 1];
            int lIdxPut = 0;
            lSource[lIdxPut++] = "-g";
//            lSource[lIdxPut++] = "-verbose";
            for (int lIdx = 0; lIdx < aClassFiles.length; lIdx++) {
                lSource[lIdxPut++] = aClassFiles[lIdx];
            }
        }
        ByteArrayOutputStream lByteArrayOutputStream = new ByteArrayOutputStream();

        try {
            String aErrorFile = aClassFiles[0].substring(0, aClassFiles[0].length() - 5) + ".err";
            FileOutputStream lFileOutputStream = new FileOutputStream(aErrorFile);
            PrintStream lPrintStream = new PrintStream(lFileOutputStream);
            PrintStream lSavePrintStream = System.err;
            System.setErr(lPrintStream);

//        com.sun.tools.javac.Main lMain = new com.sun.tools.javac.Main();
//        lMain.compile(lSource);

            if (com.sun.tools.javac.Main.compile(lSource) != 0) {
                lPrintStream.close();
                lFileOutputStream.close();
                System.setErr(lSavePrintStream);

                try {
                    String lLine;
                    FileReader lFileReader = new FileReader(aClassFiles[0].substring(0, aClassFiles[0].length() - 5) + ".err");
                    BufferedReader lBufferedReader = new BufferedReader(lFileReader);
                    LineNumberReader lLineNumberReader = new LineNumberReader(lBufferedReader);
                    if (iOutputManager.isJspOpen()) iOutputManager.println("<pre>", true);
                    iOutputManager.println("*error* Compile Errors *********************************************************************", true);
                    if (iOutputManager.isAnyOpen()) System.out.println("***** Compile Errors *****");
                    while ((lLine = lLineNumberReader.readLine()) != null) {
                        iOutputManager.println(lLine, true);
                        if (iOutputManager.isAnyOpen()) System.out.println(lLine);
                    }
                    if (iOutputManager.isJspOpen()) iOutputManager.println("</pre>", true);

                    Thread.sleep(10000);
                
                } catch (IOException lException) {}

            } else {
                lPrintStream.close();
                lFileOutputStream.close();
                System.setErr(lSavePrintStream);
                for (int lIdx = 0; lIdx < aClassFiles.length; lIdx++) {
//                    delete(aClassFiles[lIdx]);
//                    delete(aClassFiles[lIdx].substring(0, aClassFiles[lIdx].length() - 5) + ".txt");
                }
//                delete(aErrorFile);
            }
        } catch (Throwable e) {
            if (!iOutputManager.isJspOpen()) iOutputManager.println(e.getMessage(), true);
            System.out.println(e.getMessage());
        }

//$Section=Operation$ID=41814BC200FA$Preserve=no
    }

//$Section=OperationJavadoc$ID=40E411D400CB$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40E411D400CB$Preserve=no
    public Object loadScript( String aScriptName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=40E411D400CB$Preserve=yes

        return loadScript(aScriptName, iSymbolTable.getPropertyCollection().getPropertyValue("$jac:context", 0).toString());

//$Section=Operation$ID=40E411D400CB$Preserve=no
    }

//$Section=OperationJavadoc$ID=3F9C5CEF034E$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aContext
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3F9C5CEF034E$Preserve=no
    public Object loadScript( String aScriptName, String aContext ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3F9C5CEF034E$Preserve=yes

        if (aScriptName.trim().length() == 0) {
            if (!iOutputManager.isJspOpen()) iOutputManager.println("loadScript: Requested null script... returning null.", true);
            if (iOutputManager.isJspOpen()) System.out.println("loadScript: Requested null script... returning null.");
            return null;
        }

        if (aContext != null && !iSymbolTable.getPropertyCollection().getPropertyValue("$jac:compile", 0).toString().equals("false")) {
            boolean lStale = buildScript(aScriptName, aContext, true);
        }
        
        try {
// Always create a new classloader.  Not the most efficient...but keeps classes fresh.

            String lWorkPath = iSymbolTable.getPropertyCollection().getPropertyValue("$jac:path:work", 0).toString();

/* This works with Tomcat and Jetty...however it won't cause Jetty classes to get reloaded.
   Tomcat classes do when the containter context is reloaded (which means the other method works just as good).
               if (iAcClassLoader == null || lStale == true) {
                File lFile = new File(lWorkPath + iFileSeparator);
                URL lUrl = lFile.toURL();
//                iAcClassLoader = new URLClassLoader(new URL[]{lUrl}, ClassLoader.getSystemClassLoader());
                iAcClassLoader = new URLClassLoader(new URL[]{lUrl}, this.getClass().getClassLoader());
            }
//            if (lStale == true) {
//                File lFile = new File(lWorkPath + iFileSeparator);
//                URL lUrl = lFile.toURL();
//                iAcClassLoader = new URLClassLoader(new URL[]{lUrl}, iAcClassLoader.getParent());
//            }

            Class lExecClass = iAcClassLoader.loadClass(aScriptName);
            Class lSuperClass = lExecClass.getSuperclass();
            while (lSuperClass != null) {
                lSuperClass = lSuperClass.getSuperclass();
            }
*/

// This method works for non-web, Tomcat, and Jetty.

            Class lExecClass = this.getClass().getClassLoader().loadClass(aScriptName);
            Class lSuperClass = lExecClass.getSuperclass();
// Loading of the superclasses appears to be necessary in both Tomcat and Jetty.  Stand alone doesn't appear to need this...
            while (lSuperClass != null) {
                lSuperClass = lSuperClass.getSuperclass();
            }
            
            Constructor lConstructor = null;
            Object lInstance = null;
            
            try {
              Class lConstructorArray[] = {this.getClass()};
              lConstructor = lExecClass.getConstructor(lConstructorArray);
              Object lConstructorParams[] = { this };
              lInstance = lConstructor.newInstance(lConstructorParams);
            } catch (Exception e) {
              lConstructor = lExecClass.getConstructor(new Class[]{});
              lInstance = lConstructor.newInstance(new Object[]{});
            }

//            PropertyValue lPropertyValue = new PropertyValue(lInstance);
//            if (aPropertyName != null) iSymbolTable.getPropertyCollection().addPropertyValue(aPropertyName, lPropertyValue);

            iSymbolTable.getPropertyCollection().removePropertyValue("$jac:script");
            return lInstance;
        } catch (Exception e) {if (!iOutputManager.isJspOpen()) iOutputManager.println(e.getMessage(), true);
                               if (iOutputManager.isJspOpen()) System.out.println(e.getMessage());
                               iSymbolTable.getPropertyCollection().removePropertyValue("$jac:script");
                               return null;
                              }

//$Section=Operation$ID=3F9C5CEF034E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA7861C0310$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aMethodName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA7861C0310$Preserve=no
    public void execMethod( String aScriptName, String aMethodName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3FA7861C0310$Preserve=yes

        execMethod(loadScript(aScriptName), aMethodName);

//$Section=Operation$ID=3FA7861C0310$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FAEB72F001E$Preserve=yes
/**
 *
 * @param aScriptName
 *
 * @param aMethodName
 *
 * @param aArguments
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FAEB72F001E$Preserve=no
    public void execMethod( String aScriptName, String aMethodName, Object[] aArguments ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3FAEB72F001E$Preserve=yes

        execMethod(loadScript(aScriptName), aMethodName, aArguments);

//$Section=Operation$ID=3FAEB72F001E$Preserve=no
    }

//$Section=OperationJavadoc$ID=40E5C79A0222$Preserve=yes
/**
 *
 * @param aScriptObject
 *
 * @param aMethodName
 *
 * @param aArguments
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40E5C79A0222$Preserve=no
    public void execMethod( Object aScriptObject, String aMethodName, Object[] aArguments ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=40E5C79A0222$Preserve=yes

        try {
            Class lClassParams[] = new Class[aArguments.length];
            for (int l=0; l < aArguments.length; l++) {
                if (aArguments[l] != null) {
                    lClassParams[l] = aArguments[l].getClass();
                }
            }
            Method lMethod = aScriptObject.getClass().getMethod(aMethodName, lClassParams);
            lMethod.invoke(aScriptObject, aArguments);
        } catch (Throwable e) {
            String lE = e.getMessage();
                       }

//$Section=Operation$ID=40E5C79A0222$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA9399F025E$Preserve=yes
/**
 *
 * @param aScriptObject
 *
 * @param aMethodName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA9399F025E$Preserve=no
    public void execMethod( Object aScriptObject, String aMethodName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3FA9399F025E$Preserve=yes

        try {
            Method lMethod = aScriptObject.getClass().getMethod(aMethodName, (Class<?>[]) null);
            lMethod.invoke(aScriptObject, (Object[]) null);
        } catch (Throwable e) {if (!iOutputManager.isJspOpen()) iOutputManager.println(e.getMessage(), true);
                               }

//$Section=Operation$ID=3FA9399F025E$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA03F27023B$Preserve=yes
/**
 *
 * @param aExistingFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA03F27023B$Preserve=no
    public void delete( String aExistingFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3FA03F27023B$Preserve=yes

        File lFile = new File(aExistingFile);
        lFile.delete();

//$Section=Operation$ID=3FA03F27023B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB6D654023F$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6D654023F$Preserve=no
    public void openDebug( String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3FB6D654023F$Preserve=yes

        //iLog.open(aFileName);
        //iLog.println(0, Log._DEBUG, "Script.openDebug(\"" + aFileName + "\")");

//$Section=Operation$ID=3FB6D654023F$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FB6D66C00B3$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FB6D66C00B3$Preserve=no
    public void closeDebug( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=3FB6D66C00B3$Preserve=yes

        iLog.close();

//$Section=Operation$ID=3FB6D66C00B3$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F62E9E02EE$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F62E9E02EE$Preserve=no
    public Script getMasterScript( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=40F62E9E02EE$Preserve=yes

        if (iParentScript == null) {
            return this;
        } else {
            return iParentScript.getMasterScript();
        }

//$Section=Operation$ID=40F62E9E02EE$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F62EAE0280$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F62EAE0280$Preserve=no
    public Script getParentScript( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=40F62EAE0280$Preserve=yes

        return iParentScript;

//$Section=Operation$ID=40F62EAE0280$Preserve=no
    }

//$Section=OperationJavadoc$ID=42ADEFAE0149$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42ADEFAE0149$Preserve=no
    public Script getGlobalScript( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=42ADEFAE0149$Preserve=yes

        if (iParentScript != null) return iParentScript.getGlobalScript();
        if (iGlobalScript != null) return iGlobalScript;
        return this;

//$Section=Operation$ID=42ADEFAE0149$Preserve=no
    }

//$Section=OperationJavadoc$ID=42ADF01C01D5$Preserve=yes
/**
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42ADF01C01D5$Preserve=no
    public void setGlobalScript( Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=42ADF01C01D5$Preserve=yes

        iGlobalScript = aScript;

//$Section=Operation$ID=42ADF01C01D5$Preserve=no
    }

//$Section=OperationJavadoc$ID=42ADFF94003E$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42ADFF94003E$Preserve=no
    public Script globalScriptFactory( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Script.");
//$Section=Operation$ID=42ADFF94003E$Preserve=yes

        return new Script();

//$Section=Operation$ID=42ADFF94003E$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// SymbolTable
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9D2C9803DF$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9D2C9803DF$Preserve=no
    public SymbolTable getSymbolTable() {
//$Section=Attribute get$ID=3F9D2C9803DF$Preserve=no
        return iSymbolTable;
//$Section=Attribute get$ID=3F9D2C9803DF$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3F9D2C9803DF$Preserve=no
/**
 * Set accessor method.
 *
 * @param SymbolTable the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9D2C9803DF$Preserve=no
    public void setSymbolTable(SymbolTable aValue) {
//$Section=Attribute set$ID=3F9D2C9803DF$Preserve=no
        iSymbolTable = aValue;
//$Section=Attribute set$ID=3F9D2C9803DF$Preserve=no
    }
//----------------------------------------------------------------------------
// OutputManager
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3F9D639303AC$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3F9D639303AC$Preserve=no
    public OutputManager getOutputManager() {
//$Section=Attribute get$ID=3F9D639303AC$Preserve=no
        return iOutputManager;
//$Section=Attribute get$ID=3F9D639303AC$Preserve=no
   }
//$Section=Attribute setJavadoc$ID=3F9D639303AC$Preserve=no
/**
 * Set accessor method.
 *
 * @param OutputManager the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3F9D639303AC$Preserve=no
    public void setOutputManager(OutputManager aValue) {
//$Section=Attribute set$ID=3F9D639303AC$Preserve=no
        iOutputManager = aValue;
//$Section=Attribute set$ID=3F9D639303AC$Preserve=no
    }
//----------------------------------------------------------------------------
// FileSeparator
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FA77C0A0309$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FA77C0A0309$Preserve=no
    public String getFileSeparator() {
//$Section=Attribute get$ID=3FA77C0A0309$Preserve=no
        return iFileSeparator;
//$Section=Attribute get$ID=3FA77C0A0309$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FA77C0A0309$Preserve=no
/**
 * Set accessor method.
 *
 * @param FileSeparator the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FA77C0A0309$Preserve=no
    public void setFileSeparator(String aValue) {
//$Section=Attribute set$ID=3FA77C0A0309$Preserve=no
        iFileSeparator = aValue;
//$Section=Attribute set$ID=3FA77C0A0309$Preserve=no
    }
//----------------------------------------------------------------------------
// AcClassLoader
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FAA2983021D$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FAA2983021D$Preserve=no
    public ClassLoader getAcClassLoader() {
//$Section=Attribute get$ID=3FAA2983021D$Preserve=no
        return iAcClassLoader;
//$Section=Attribute get$ID=3FAA2983021D$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FAA2983021D$Preserve=no
/**
 * Set accessor method.
 *
 * @param AcClassLoader the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FAA2983021D$Preserve=no
    public void setAcClassLoader(ClassLoader aValue) {
//$Section=Attribute set$ID=3FAA2983021D$Preserve=no
        iAcClassLoader = aValue;
//$Section=Attribute set$ID=3FAA2983021D$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9C588102FD$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C588102FD$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9C588102FD$Preserve=no

//End of class---------------
}
