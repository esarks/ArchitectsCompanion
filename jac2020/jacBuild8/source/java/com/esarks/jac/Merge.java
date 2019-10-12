//$Section=License$ID=3FA41F4D021E$Preserve=no

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

//  Generated at 2007.12.01 09:02:11.173 PM EST by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: Merge.java

//$Section=ChangeLog$ID=3FA41F4D021E$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3FA41F4D021E$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.io.*;
import java.util.*;

//$Section=CustomDeclare$ID=3FA41F4D021E$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3FA41F4D021E$Preserve=no

//$Section=ClassJavadoc$ID=3FA41F4D021E$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3FA41F4D021E$Preserve=no
public class Merge {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private static Merge iMerge;
    private HashMap iPreservedItems = new HashMap(500);
    private String iSectionMarker;
    private boolean iPreservePreamble;
    private String iPreserveMarker;
    private String iNoPreserveMarker;
    private String iKeepPreserveMarker;
    private String iDiscardPreserveMarker;
    private boolean iTrimOutput = false;
    private ArrayList iSections = new ArrayList(1);
    private boolean iKeepSections = false;
    private String iExceptionMessage;
    private boolean iUseRtfBookmarks = false;

//$Section=CustomClassDeclare$ID=3FA41F4D021E$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3FA41F4D021E$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3FA41F4D021E$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3FA41F4D021E$Preserve=no
    private Merge() {
//$Section=DefaultConstructor$ID=3FA41F4D021E$Preserve=yes
//$Section=DefaultConstructor$ID=3FA41F4D021E$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3FA41F4D021E$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3FA41F4D021E$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3FA41F4D021E$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3FA41F4D021E$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3FA41F4D021E$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3FA41F4D021E$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3FA41F4D021E$Preserve=yes

        iMerge = null;
        if (iPreservedItems != null) {
            iPreservedItems.clear();
            iPreservedItems = null;
        }
        if (iSections != null) {
            iSections.clear();
            iSections = null;
        }

//$Section=DefaultFreeResources$ID=3FA41F4D021E$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3FA41F7A01FB$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F7A01FB$Preserve=no
    public static Merge getInstance( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=3FA41F7A01FB$Preserve=yes

        if (iMerge == null) iMerge = new Merge();
        return iMerge;

//$Section=Operation$ID=3FA41F7A01FB$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FFE4C60222$Preserve=yes
/**
 *
 * @param aExistingFile
 *
 * @param aNewFile
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FFE4C60222$Preserve=no
    public boolean doMerge( String aExistingFile, String aNewFile, Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=40FFE4C60222$Preserve=yes

        iExceptionMessage = null;
        return doMergeFiles(aExistingFile, aNewFile, aScript, true);

//$Section=Operation$ID=40FFE4C60222$Preserve=no
    }

//$Section=OperationJavadoc$ID=40FFE4B600DA$Preserve=yes
/**
 *
 * @param aExistingFile
 *
 * @param aNewFile
 *
 * @param aScript
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40FFE4B600DA$Preserve=no
    public boolean doMergeToExisting( String aExistingFile, String aNewFile, Script aScript ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=40FFE4B600DA$Preserve=yes

        iExceptionMessage = null;
        return doMergeFiles(aExistingFile, aNewFile, aScript, false);

//$Section=Operation$ID=40FFE4B600DA$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F7A024B$Preserve=yes
/**
 *
 * @param aExistingFile
 *
 * @param aNewFile
 *
 * @param aScript
 *
 * @param aToNew
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F7A024B$Preserve=no
    private boolean doMergeFiles( String aExistingFile, String aNewFile, Script aScript, boolean aToNew ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=3FA41F7A024B$Preserve=yes

        iSectionMarker = aScript.getSymbolTable().translateProperties("[$jac:merge:sectionMarker]");
        iPreserveMarker = aScript.getSymbolTable().translateProperties("[$jac:merge:preserveMarker]");
        iNoPreserveMarker = aScript.getSymbolTable().translateProperties("[$jac:merge:noPreserveMarker]");
        iKeepPreserveMarker = aScript.getSymbolTable().translateProperties("[$jac:merge:keepPreserveMarker]");
        iDiscardPreserveMarker = aScript.getSymbolTable().translateProperties("[$jac:merge:discardPreserveMarker]");

        if (aScript.getSymbolTable().translateProperties("[$jac:merge:trimOutput]").compareTo("yes") == 0) {
            iTrimOutput = true;
        } else {
            iTrimOutput = false;
        }

        if (aScript.getSymbolTable().translateProperties("[$jac:merge:preservePreamble]").compareTo("yes") == 0) {
            iPreservePreamble = true;
        } else {
            iPreservePreamble = false;
        }

        if (aScript.getSymbolTable().translateProperties("[$jac:merge:keepSections]").compareTo("yes") == 0) {
            iKeepSections = true;
        } else {
            iKeepSections = false;
        }

        if (aScript.getSymbolTable().translateProperties("[$jac:merge:useRtfBookmarks]").compareTo("yes") == 0) {
            iUseRtfBookmarks = true;
        } else {
            iUseRtfBookmarks = false;
        }

        if (aToNew == true) {
            readPreserved(aScript, aExistingFile);
        } else {
            readPreserved(aScript, aNewFile);
        }
//        if (aScript.getSymbolTable().getPropertyCollection().getPropertyValue("mergeAsScript", 0).toString().compareTo("yes") == 0) {
//
//            mergeToNew(aExistingFile + ".tmp", aNewFile);
//
//            Script lScript = new Script(aScript);
////            lScript.getSymbolTable().setGlobalProperty("$outputFile", aExistingFile + ".new");
//            aScript.getOutputManager().openOutputFile(aExistingFile + ".new", true);
//            aScript.doScript(aExistingFile + ".tmp");
//            aScript.getOutputManager().closeOutputFile();
//
//            // Remove tmp file
//            File lTmpFile;
//            lTmpFile = new File(aExistingFile + ".tmp");
//            lTmpFile.delete();
//
//        } else {
//            mergeToNew(aExistingFile + ".new", aNewFile);
//        }

        if (aToNew == true) {
            mergeToNew(aExistingFile + ".new", aNewFile);
        } else {
            mergeToNew(aExistingFile + ".new", aExistingFile);
        }

        boolean lReturn = true;

        if (compare(aExistingFile, aExistingFile + ".new", aScript.getSymbolTable().translateProperties("[$jac:merge:excludeCompare]")) == false) {

            File lExistingFile, lBackupFile, lNewFile;

            // Remove previous backup file
            lBackupFile = new File(aExistingFile + ".bak");
            lBackupFile.delete();

            // Rename existing file to backup file
            lExistingFile = new File(aExistingFile);
            lBackupFile = new File(aExistingFile + ".bak");
            lExistingFile.renameTo(lBackupFile);

            // Rename new file to destination
            lNewFile = new File(aExistingFile + ".new");
            lExistingFile = new File(aExistingFile);
            lNewFile.renameTo(lExistingFile);

            lReturn = true;

        } else {

            // Leave the previous backup file

            // Leave the existing file

            // Remove the new file

            // Change the date of the existing file so it won't be evaluated as "stale"
            File lExistingFile = new File(aExistingFile);
            lExistingFile.setLastModified(new Date().getTime());

            File lNewFile = new File(aExistingFile + ".new");
            lNewFile.delete();

            lReturn = false;

        }

        iPreservedItems.clear();
        return lReturn;

//$Section=Operation$ID=3FA41F7A024B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F7A024F$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F7A024F$Preserve=no
    public void readPreserved( Script aScript, String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=3FA41F7A024F$Preserve=yes

        iPreservedItems = readKeep(aScript, aFileName);
        return;

//$Section=Operation$ID=3FA41F7A024F$Preserve=no
    }

//$Section=OperationJavadoc$ID=42250EBF00BB$Preserve=yes
/**
 *
 * @param aFileName
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42250EBF00BB$Preserve=no
    public HashMap readKeep( Script aScript, String aFileName ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=42250EBF00BB$Preserve=yes

        HashMap lPreservedItems = new HashMap(500);
        iSections = new ArrayList(1);

        String lLine;
        PreservedItem lPreservedItem = null;

        boolean lSaveAsPreserved = false;
        boolean lFirstLine = true;

        try {

            File lFile = new File(aFileName);
            if (!lFile.exists()) return lPreservedItems;

            FileReader lFileReader = new FileReader(aFileName);
            BufferedReader lBufferedReader = new BufferedReader(lFileReader);
            LineNumberReader lLineNumberReader = new LineNumberReader(lBufferedReader);

            while ((lLine = lLineNumberReader.readLine()) != null) {

                // First line AND are we preserving the preamble?
                // If so, then create the preamble preserve section.
                if (lFirstLine == true && iPreservePreamble == true) {
                    lFirstLine = false;
                    lPreservedItem = new PreservedItem(iTrimOutput);
                    lPreservedItems.put("$Preamble", lPreservedItem);
                    lSaveAsPreserved = true;
                }

                // Are we preserving text now?
                // If so, we need to save it up to the point of a new marker.
                if (lSaveAsPreserved) {
                    if (iUseRtfBookmarks) {
                        if (lLine.indexOf("{\\*\\bkmk") > -1) {
                            lSaveAsPreserved = false;   // marker exists on the line, turn preserve off
                            lPreservedItem.addString(lLine.substring(0, lLine.indexOf("{\\*\\bkmk")));
                        } else {
                            lPreservedItem.addString(lLine);
                        }
                    } else {
                        if (lLine.indexOf(iSectionMarker) > -1) {
                            lSaveAsPreserved = false;   // marker exists on the line, turn preserve off
                            lPreservedItem.addString(lLine.substring(0, lLine.indexOf(iSectionMarker)));
                        } else {
                            lPreservedItem.addString(lLine);
                        }
                    }
                }

                // Are we preserving text now?
                // If not, test to see if a section with preserved exists to start preserving.
                if (!lSaveAsPreserved) {
                    if (iUseRtfBookmarks) {
                        if (lLine.indexOf("{\\*\\bkmkstart") > -1) {
                            lPreservedItem = new PreservedItem(iTrimOutput);
                            lPreservedItems.put(lLine.substring(lLine.indexOf("{\\*\\bkmk"), lLine.indexOf("}",lLine.indexOf("{\\*\\bkmk"))), lPreservedItem);
                            lPreservedItem.addString(lLine.substring(lLine.indexOf("{\\*\\bkmk")));
                            lPreservedItem.setKeep(false);
                            lSaveAsPreserved = true;
                        }
                    } else {
                        if (lLine.indexOf(iSectionMarker) > -1 && lLine.indexOf(iPreserveMarker) > -1) {
                            lPreservedItem = new PreservedItem(iTrimOutput);
                            lPreservedItems.put(lLine.substring(lLine.indexOf(iSectionMarker), lLine.indexOf(iPreserveMarker)), lPreservedItem);
                            lPreservedItem.addString(lLine.substring(lLine.indexOf(iSectionMarker)));
                            lPreservedItem.setKeep(false);
                            lSaveAsPreserved = true;
                            if (iKeepSections == true) iSections.add(lLine.substring(lLine.indexOf(iSectionMarker), lLine.indexOf(iPreserveMarker)));
                        }
                    }
                }

                // Are we preserving text now?
                // If not, test to see if a section with "keep" preserved exists to start preserving.
                if (!lSaveAsPreserved) {
                    if (iUseRtfBookmarks) {
                    } else {
                        if (lLine.indexOf(iSectionMarker) > -1 && lLine.indexOf(iKeepPreserveMarker) > -1) {
                            lPreservedItem = new PreservedItem(iTrimOutput);
                            lPreservedItems.put(lLine.substring(lLine.indexOf(iSectionMarker), lLine.indexOf(iKeepPreserveMarker)), lPreservedItem);
                            lPreservedItem.addString(lLine.substring(lLine.indexOf(iSectionMarker)));
                            lPreservedItem.setKeep(true);
                            lSaveAsPreserved = true;
                            if (iKeepSections == true) iSections.add(lLine.substring(lLine.indexOf(iSectionMarker), lLine.indexOf(iKeepPreserveMarker)));
                        }
                    }
                }
            }

            lLineNumberReader.close();
            lBufferedReader.close();
            lFileReader.close();

        } catch (IOException e) { iExceptionMessage = e.getMessage(); }

        return lPreservedItems;

//$Section=Operation$ID=42250EBF00BB$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F7A0251$Preserve=yes
/**
 *
 * @param aExistingFile
 *
 * @param aNewFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F7A0251$Preserve=no
    public void mergeToNew( String aExistingFile, String aNewFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=3FA41F7A0251$Preserve=yes

        FileOutputStream lFileOutputStream;
        PrintWriter lPrintWriter;
        try {
            // Create the directory path for the resulting file, should it not exist...
            File lDirectory = new File(aExistingFile);
            String lName = lDirectory.getName();
            String lPath = lDirectory.getPath();
            String lDirPath = lPath.substring(0, lPath.length() - lName.length());
            lDirectory = new File(lDirPath);
            lDirectory.mkdirs();
            lDirectory = null;

            lFileOutputStream = new FileOutputStream(aExistingFile);
            lPrintWriter = new PrintWriter(lFileOutputStream);
        } catch (Exception e) { iExceptionMessage = e.getMessage();
                                return;}

        String lLine;
        PreservedItem lPreservedItem = null;

        boolean lSaveFromNew = true;

        //See if preamble exists
        if (iPreservedItems.containsKey("$Preamble")) {
            lPreservedItem = (PreservedItem) iPreservedItems.get("$Preamble");
            iPreservedItems.remove("$Preamble");
            lPreservedItem.print(lPrintWriter);
            lSaveFromNew = false;
        }

        try {
            FileReader lFileReader = new FileReader(aNewFile);
            BufferedReader lBufferedReader = new BufferedReader(lFileReader);
            LineNumberReader lLineNumberReader = new LineNumberReader(lBufferedReader);

            while ((lLine = lLineNumberReader.readLine()) != null) {

                // Saving from new now?
                // If so, then print up to the section marker (if no section marker println the line).
                if (lSaveFromNew) {
                    if (iUseRtfBookmarks) {
                        if (lLine.indexOf("{\\*\\bkmk") > -1) {
                            if (lLine.indexOf("{\\*\\bkmk") > 0) {
                                lPrintWriter.print(trimRight(lLine.substring(0, lLine.indexOf("{\\*\\bkmk"))));
                            }
                        } else lPrintWriter.println(trimRight(lLine));
                    } else {
                        if (lLine.indexOf(iSectionMarker) > -1) {
                            if (lLine.indexOf(iSectionMarker) > 0) {
                                lPrintWriter.print(trimRight(lLine.substring(0, lLine.indexOf(iSectionMarker))));
                            }
                        } else lPrintWriter.println(trimRight(lLine));
                    }
                }

                // Test for section marker.
                // If yes, then see if the section is in preserved.
                if (iUseRtfBookmarks && lLine.indexOf("{\\*\\bkmk") > -1) {
                    String lKey = lLine;
                    lKey = lLine.substring(lLine.indexOf("{\\*\\bkmk"), lLine.indexOf("}", lLine.indexOf("{\\*\\bkmk")));
                    if (iPreservedItems.containsKey(lKey)) {
                        lSaveFromNew = false;
                        lPreservedItem = (PreservedItem) iPreservedItems.get(lKey);
                        iPreservedItems.remove(lKey);
                        lPreservedItem.print(lPrintWriter);
                    } else {
                        lSaveFromNew = true;
                        lPrintWriter.println(trimRight(lLine.substring(lLine.indexOf("{\\*\\bkmk"))));
                    }
                }
                if (!iUseRtfBookmarks && lLine.indexOf(iSectionMarker) > -1) {
                    String lKey = lLine;
                    if (iDiscardPreserveMarker.length() > 0 && lLine.indexOf(iDiscardPreserveMarker) > -1) {
                        lKey = lLine.substring(lLine.indexOf(iSectionMarker), lLine.indexOf(iDiscardPreserveMarker));
                        lSaveFromNew = false;
                        if (iPreservedItems.containsKey(lKey)) {
                            lPreservedItem = (PreservedItem) iPreservedItems.get(lKey);
                            iPreservedItems.remove(lKey);
                        }
                    } else {
                        if (lLine.indexOf(iPreserveMarker) > -1) lKey = lLine.substring(lLine.indexOf(iSectionMarker), lLine.indexOf(iPreserveMarker));
                        if (lLine.indexOf(iNoPreserveMarker) > -1) lKey = lLine.substring(lLine.indexOf(iSectionMarker), lLine.indexOf(iNoPreserveMarker));
                        if (lLine.indexOf(iKeepPreserveMarker) > -1) lKey = lLine.substring(lLine.indexOf(iSectionMarker), lLine.indexOf(iKeepPreserveMarker));
                        if (iPreservedItems.containsKey(lKey)) {
                            if (iKeepSections == true) {
                                for (int lIdx=0; lIdx < iSections.size(); lIdx++) {
                                    if (((String) iSections.get(lIdx)).compareTo(lKey) != 0) {
                                        lPreservedItem = (PreservedItem) iPreservedItems.get((String) iSections.get(lIdx));
                                        iPreservedItems.remove((String) iSections.get(lIdx));
                                        lPreservedItem.print(lPrintWriter);
                                        iSections.remove(lIdx);
                                        lIdx--;
                                    } else {
                                        iSections.remove(lIdx);
                                        break;
                                    }
                                }
                            }

                            lSaveFromNew = false;
                            lPreservedItem = (PreservedItem) iPreservedItems.get(lKey);
                            iPreservedItems.remove(lKey);
                            if (lPreservedItem.getKeep() == false) {
                                lPreservedItem.print(lPrintWriter);
                            } else {
                                lSaveFromNew = true;
                                lPrintWriter.println(trimRight(lLine.substring(lLine.indexOf(iSectionMarker))));
                            }
                        } else {
                            lSaveFromNew = true;
                            lPrintWriter.println(trimRight(lLine.substring(lLine.indexOf(iSectionMarker))));
                        }
                    }
                }
            }
            lLineNumberReader.close();
            lBufferedReader.close();
            lFileReader.close();
        } catch (IOException e) { iExceptionMessage = e.getMessage(); }

        // do what with the left over preserved items?

        if (iKeepSections == true) {
            for (int lIdx=0; lIdx < iSections.size(); lIdx++) {
                lPreservedItem = (PreservedItem) iPreservedItems.get((String) iSections.get(lIdx));
                iPreservedItems.remove((String) iSections.get(lIdx));
                lPreservedItem.print(lPrintWriter);
            }
        }

        try {
            lPrintWriter.close();
            lFileOutputStream.close();
        } catch (Exception e) { iExceptionMessage = e.getMessage(); }

        return;

//$Section=Operation$ID=3FA41F7A0251$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F7A0255$Preserve=yes
/**
 *
 * @param aNewFile
 *
 * @param aExistingFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F7A0255$Preserve=no
    public void overwriteToNew( String aNewFile, String aExistingFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=3FA41F7A0255$Preserve=yes

        try {
            BufferedInputStream lFileReader = new BufferedInputStream(new FileInputStream(new File(aExistingFile)));
            BufferedOutputStream lFileWriter = new BufferedOutputStream(new FileOutputStream(new File(aNewFile + ".new")));

            int lCharacter;

            while ((lCharacter = lFileReader.read()) != -1) {
                lFileWriter.write(lCharacter);
            }

            lFileReader.close();
            lFileWriter.close();

        } catch (IOException e) { iExceptionMessage = e.getMessage(); }


        File lExistingFile, lBackupFile, lNewFile;

        // Remove previous backup file
        lBackupFile = new File(aNewFile + ".bak");
        lBackupFile.delete();

        // Rename existing file to backup file
        lExistingFile = new File(aNewFile);
        lBackupFile = new File(aNewFile + ".bak");
        lExistingFile.renameTo(lBackupFile);

        // Rename new file to destination
        lNewFile = new File(aNewFile + ".new");
        lExistingFile = new File(aNewFile);
        lNewFile.renameTo(lNewFile);

        return;

//$Section=Operation$ID=3FA41F7A0255$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F7A0258$Preserve=yes
/**
 *
 * @param aNewFile
 *
 * @param aExistingFile
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F7A0258$Preserve=no
    public void append( String aNewFile, String aExistingFile ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=3FA41F7A0258$Preserve=yes

        try {
            BufferedInputStream lFileReader = new BufferedInputStream(new FileInputStream(new File(aExistingFile)));
            BufferedOutputStream lFileWriter = new BufferedOutputStream(new FileOutputStream(new File(aNewFile),true));

            int lCharacter;

            while ((lCharacter = lFileReader.read()) != -1) {
                lFileWriter.write(lCharacter);
            }

            lFileReader.close();
            lFileWriter.close();

        } catch (IOException e) { iExceptionMessage = e.getMessage(); }

//$Section=Operation$ID=3FA41F7A0258$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F7A025B$Preserve=yes
/**
 *
 * @param aExistingFile
 *
 * @param aNewFile
 *
 * @param aComments
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F7A025B$Preserve=no
    public boolean compare( String aExistingFile, String aNewFile, String aComments ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=3FA41F7A025B$Preserve=yes

        String lExistingLine = null;
        String lNewLine = null;

        try {

            File lFile = new File(aExistingFile);
            if (!lFile.exists()) return false;

            LineNumberReader lExistingLineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(aExistingFile)));
            LineNumberReader lNewLineNumberReader = new LineNumberReader(new BufferedReader(new FileReader(aNewFile)));

            while (true) {

                lExistingLine = lExistingLineNumberReader.readLine();
                lNewLine = lNewLineNumberReader.readLine();

                if (lExistingLine == null && lNewLine == null) {
                    lExistingLineNumberReader.close();
                    lNewLineNumberReader.close();
                    return true;
                }

                if (lExistingLine == null || lNewLine == null) {
                    lExistingLineNumberReader.close();
                    lNewLineNumberReader.close();
                    return false;
                }

                if (aComments.length() == 0 || (lExistingLine.startsWith(aComments) == false || lNewLine.startsWith(aComments) == false)) {

                    if (lExistingLine.compareTo(lNewLine) != 0) {
                        lExistingLineNumberReader.close();
                        lNewLineNumberReader.close();
                        return false;
                    }

                }

            }

        } catch (IOException e) { iExceptionMessage = e.getMessage();}

        return false;

//$Section=Operation$ID=3FA41F7A025B$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F7A025F$Preserve=yes
/**
 *
 * @param aStringToTrim
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F7A025F$Preserve=no
    public String trimRight( String aStringToTrim ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter Merge.");
//$Section=Operation$ID=3FA41F7A025F$Preserve=yes

        if (iTrimOutput == false) return aStringToTrim;
        return PreservedItem.trimRight(aStringToTrim);

//$Section=Operation$ID=3FA41F7A025F$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// Sections
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40ECA4270177$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40ECA4270177$Preserve=no
    private ArrayList getSections() {
//$Section=Attribute get$ID=40ECA4270177$Preserve=no
        return iSections;
//$Section=Attribute get$ID=40ECA4270177$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40ECA4270177$Preserve=no
/**
 * Set accessor method.
 *
 * @param Sections the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40ECA4270177$Preserve=no
    private void setSections(ArrayList aValue) {
//$Section=Attribute set$ID=40ECA4270177$Preserve=no
        iSections = aValue;
//$Section=Attribute set$ID=40ECA4270177$Preserve=no
    }
//----------------------------------------------------------------------------
// ExceptionMessage
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=41F562F903C8$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=41F562F903C8$Preserve=no
    public String getExceptionMessage() {
//$Section=Attribute get$ID=41F562F903C8$Preserve=no
        return iExceptionMessage;
//$Section=Attribute get$ID=41F562F903C8$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=41F562F903C8$Preserve=no
/**
 * Set accessor method.
 *
 * @param ExceptionMessage the value to be set.
 */
//$Section=Attribute setJavadoc$ID=41F562F903C8$Preserve=no
    public void setExceptionMessage(String aValue) {
//$Section=Attribute set$ID=41F562F903C8$Preserve=no
        iExceptionMessage = aValue;
//$Section=Attribute set$ID=41F562F903C8$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3FA41F4D021E$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FA41F4D021E$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FA41F4D021E$Preserve=no

//End of class---------------
}
