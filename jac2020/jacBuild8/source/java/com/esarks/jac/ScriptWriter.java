//$Section=License$ID=40EFD13C00BB$Preserve=no

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

//  Generated at 2005.06.16 10:19:12.379 AM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: ScriptWriter.java

//$Section=ChangeLog$ID=40EFD13C00BB$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=40EFD13C00BB$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.io.*;
import java.util.*;

//$Section=CustomDeclare$ID=40EFD13C00BB$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=40EFD13C00BB$Preserve=no

//$Section=ClassJavadoc$ID=40EFD13C00BB$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=40EFD13C00BB$Preserve=no
public class ScriptWriter {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private Script iScript;
    private SymbolTable iSymbolTable;
    private PrintWriter iPrintWriter;
    private String iOutputManagerSymbol = "iOutputManager";
    private Map iDocuments = new TreeMap();
    private String iLineToPrint = "";
    private String iSourceLine;
    private int iSourceLineNumber;
    private int iLastSourceLineNumber = -1;

//$Section=CustomClassDeclare$ID=40EFD13C00BB$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

        final int JAVA_CODE = 1;
        final int OUTPUT = 2;
        final int JAVA_SYMBOL = 3;
        final int JAVA_RECURSIVE_SYMBOL = 4;
        final int JAC_SYMBOL = 5;
        final int TRANSLATE_SYMBOL = 6;
        final int EXECSCRIPT = 7;
        final int XML = 8;
        final int CASTSCRIPTHELPER = 9;
        final int CASTSCRIPT = 10;
        final int NOTRANSLATION = 11;
        final int NOTRANSLATIONEXEC = 12;
        final int NOTRANSLATIONXML = 13;
        
        private String lLine;
        private int lState = JAVA_CODE;                                 // Keeps track of current state while reading input / creating output
        private int lIdx;                                               // Is the character number of the line being processed
        private int lLineNumber;                                        // Is the line number within the current script
        private char lThisChar, lNextChar, lNextChar1, lNextChar2;      // Current and look-ahead characters of the current line at lIdx
        private String lScriptHelperCast = "";                          // Keeps track of the Script being casted for the next symbol
        private String lScriptCast = "";                                // Keeps track of the Script being casted for the next symbol
        private String lPropertyName = "";                              // Keeps track of the property name being processed (as it's being built)
        private boolean lNeedsPreamble = false;                         // Helps eleminate the need to write extra output print lines
        private String lPreamble = "";                                  // Used with lNeedsPreamble
        private boolean lAddLineNumbers = false;
        private String lScriptFile = "";
        private Stack lStack = new Stack();
        private String lScriptToExec;
        private String lXmlToParse;
        private boolean lBurnChars;
        private boolean lSuppressLf = false;

//$Section=CustomClassDeclare$ID=40EFD13C00BB$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=40EFD13C00BB$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=40EFD13C00BB$Preserve=no
    private ScriptWriter() {
//$Section=DefaultConstructor$ID=40EFD13C00BB$Preserve=yes
//$Section=DefaultConstructor$ID=40EFD13C00BB$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=40EFD13C00BB$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=40EFD13C00BB$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=40EFD13C00BB$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=40EFD13C00BB$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=40EFD13C00BB$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=40EFD13C00BB$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=40EFD13C00BB$Preserve=yes

        iScript = null;
        iSymbolTable = null;
        iPrintWriter = null;

//$Section=DefaultFreeResources$ID=40EFD13C00BB$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=40EFD17F0119$Preserve=yes
/**
 *
 * @param aScript
 *
 * @param aPrintWriter
 *
 */
//$Section=OperationJavadoc$ID=40EFD17F0119$Preserve=no
    public ScriptWriter( Script aScript, PrintWriter aPrintWriter ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=40EFD17F0119$Preserve=yes

        iScript = aScript;
        iSymbolTable = iScript.getSymbolTable();
        iPrintWriter = aPrintWriter;

//$Section=Operation$ID=40EFD17F0119$Preserve=no
    }

//$Section=OperationJavadoc$ID=40EFD1930148$Preserve=yes
/**
 *
 * @param aLine
 *
 * @param aLineNumber
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40EFD1930148$Preserve=no
    public void processLine( String aLine, int aLineNumber ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=40EFD1930148$Preserve=yes

        iSourceLine = aLine;
        iSourceLineNumber = aLineNumber;

//        print(" ");
        if (lState == OUTPUT) {
            print(iOutputManagerSymbol + ".println(\"");
        }

        lLine = aLine;
        lLineNumber = aLineNumber;

        lIdx = 0;
        while (lIdx < lLine.length()) {

            lThisChar = lLine.charAt(lIdx);
            lNextChar = 0;
            if (lIdx + 1 < lLine.length()) lNextChar = lLine.charAt(lIdx + 1);
            lNextChar1 = 0;
            if (lIdx + 2 < lLine.length()) lNextChar1 = lLine.charAt(lIdx + 2);
            lNextChar2 = 0;
            if (lIdx + 3 < lLine.length()) lNextChar2 = lLine.charAt(lIdx + 3);

// <%
            if (lState == JAVA_CODE) {
                if (lThisChar == '<' && lNextChar == '!' && lNextChar1 == '-' && lNextChar2 == '-') {
                    lIdx += 4;
                    print("<!--");
                }
                else if (lThisChar == '<' && lNextChar == ':' && lNextChar1 == ':') {
                    lIdx += 3;
                    lScriptHelperCast = "";
                    pushState(lState);
                    lState = CASTSCRIPTHELPER;
                }
                else if (lThisChar == '<' && lNextChar == ':') {
                    lIdx += 2;
                    lScriptCast = "";
                    pushState(lState);
                    lState = CASTSCRIPT;
                }
                else if (lThisChar == '<' && lNextChar == '!' && lNextChar1 == '%') {
                    lIdx += 3;
                    pushState(lState);
                    lState = JAVA_SYMBOL;
                }
                else if (lThisChar == '<' && lNextChar == '!' && lNextChar1 == '!') {
                    lIdx += 3;
                    pushState(lState);
                    lState = JAVA_RECURSIVE_SYMBOL;
                }
                else if (lThisChar == '<' && lNextChar == '!') {
                    lIdx += 2;
                    pushState(lState);
                    lState = JAC_SYMBOL;
                }
                else if (lThisChar == '<' && lNextChar == '#') {
                    lIdx += 2;
                    pushState(lState);
                    lState = TRANSLATE_SYMBOL;
                }
                else if (lThisChar == '%' && lNextChar == '>') {
                    lIdx += 2;
                    lState = OUTPUT;
                    println("{");
                    print(iOutputManagerSymbol + ".println(\"");
                }
                else if (lThisChar == '%' && lNextChar == '%' && lNextChar1 == '>') {
                    lIdx += 3;
                    pushState(lState);
                    lState = NOTRANSLATION;
                }
                else if (lThisChar == '<' && lNextChar == '&') {
                    lIdx += 2;
                    pushState(lState);
                    lState = EXECSCRIPT;
                    lXmlToParse = "";
                    lScriptToExec = "";
                    lBurnChars = false;
                    lSuppressLf = false;
                    print("/*" + "<&");
                }
                else {
                    lIdx++;
                    print(new Character(lThisChar).toString());
                }
            }
// <&
            else if (lState == EXECSCRIPT) {
                if (lThisChar == '&' && lNextChar == '>') {
                    lState = XML;
                }
                else if (lThisChar == '<') {
                    lState = XML;
                }
                else if (lThisChar < ' ') {
                    lIdx += 1;
                    if (lScriptToExec.length() > 0) {
                        lBurnChars = true;
                    }
                    print(lThisChar);
                }
                else if (lThisChar > ' ' && !lBurnChars) {
                    lIdx += 1;
                    lScriptToExec = lScriptToExec.concat(Character.toString(lThisChar));
                    print(lThisChar);
                }
                else {
                    lIdx += 1;
                    print(lThisChar);
                }
            }
            else if (lState == XML) {
                if (lThisChar == '&' && lNextChar == '>') {
                    println("&>" + "*/");
                    print("/* *** GENERATED SECTION *** Beginning of embedded XML expansion */");
                    lIdx += 2;
                    lState = popState();
                    iSymbolTable.getPropertyCollection().removePropertyValue("$jac:script:xml");
                    if (lXmlToParse.length() > 0) iSymbolTable.parseXml(lXmlToParse, "$jac:script:xml");
                    Object lScriptObject = iScript.loadScript(lScriptToExec, "jac");
                    OutputManager lOutputManager = iScript.getOutputManager();
                    lOutputManager.addDocument("ScriptWriter");
                    iScript.execMethod(lScriptObject, "execute");
                    StringBuffer lStringBuffer = lOutputManager.getDocument("ScriptWriter");
                    println("");
                    print(lStringBuffer.toString());
                    print("/* *** GENERATED SECTION *** End of embedded XML expansion */");
                    lSuppressLf = false;
                }
                else {
                    lIdx += 1;
                    lXmlToParse = lXmlToParse.concat(Character.toString(lThisChar));
                    print(lThisChar);
                }
            }
// %>
            else if (lState == OUTPUT) {
                if (lThisChar == '\\' && lNextChar == '<') {
                    lIdx += 2;
                    print("<");
                }
                else if (lThisChar == '\\' && lNextChar == '%') {
                    lIdx += 2;
                    print("%");
                }
                else if (lThisChar == '\\' && lNextChar == '"') {
                    lIdx += 2;
                    print("\"");
                }
                else if (lThisChar == '\\' && lNextChar == '\\') {
                    lIdx += 2;
                    print("\\");
                }
                else if (lThisChar == '\\') {
                    lIdx++;
                    print("\\\\");
                }
                else if (lThisChar == '"') {
                    lIdx++;
                    print("\\\"");
                }
                else if (lThisChar == '<' && lNextChar == '!' && lNextChar1 == '-' && lNextChar2 == '-') {
                    lIdx += 4;
                    print("<!--");
                }
                else if (lThisChar == '<' && lNextChar == ':' && lNextChar1 == ':') {
                    lIdx += 3;
                    lScriptHelperCast = "";
                    pushState(lState);
                    lState = CASTSCRIPTHELPER;
                }
                else if (lThisChar == '<' && lNextChar == ':') {
                    lIdx += 2;
                    lScriptCast = "";
                    pushState(lState);
                    lState = CASTSCRIPT;
                }
                else if (lThisChar == '<' && lNextChar == '!' && lNextChar1 == '%') {
                    lIdx += 3;
                    pushState(lState);
                    lState = JAVA_SYMBOL;
                }
                else if (lThisChar == '<' && lNextChar == '!' && lNextChar1 == '!') {
                    lIdx += 3;
                    pushState(lState);
                    lState = JAVA_RECURSIVE_SYMBOL;
                }
                else if (lThisChar == '<' && lNextChar == '!') {
                    lIdx += 2;
                    pushState(lState);
                    lState = JAC_SYMBOL;
                }
                else if (lThisChar == '<' && lNextChar == '#') {
                    lIdx += 2;
                    pushState(lState);
                    lState = TRANSLATE_SYMBOL;
                }
                else if (lThisChar == '<' && lNextChar == '%') {
                    lIdx += 2;
                    lState = JAVA_CODE;
                    println("\", false);");
                    println("}");
                }
                else if (lThisChar == '%' && lNextChar == '%' && lNextChar1 == '>') {
                    lIdx += 3;
                    pushState(lState);
                    lState = NOTRANSLATION;
                }
                else {
                    lIdx++;
                    print(new Character(lThisChar).toString());
                }
            }
// %%>
            else if (lState == NOTRANSLATION) {
                if (lThisChar == '<' && lNextChar == '%' && lNextChar1 == '%') {
                    lIdx += 3;
                    lState = popState();
                }
                else if (lThisChar == '<' && lNextChar == '&' && lNextChar1 == '&') {
                    lIdx += 3;
                    lState = NOTRANSLATIONEXEC;
                    lXmlToParse = "";
                    lScriptToExec = "";
                    lBurnChars = false;
                    lSuppressLf = true;
                }
                else {
                    lIdx++;
                    print(new Character(lThisChar).toString());
                }
            }
// ... <&&
            else if (lState == NOTRANSLATIONEXEC) {
                if (lThisChar == '&' && lNextChar == '&' && lNextChar1 == '>') {
                    lState = NOTRANSLATIONXML;
                }
                else if (lThisChar == '<') {
                    lState = NOTRANSLATIONXML;
                }
                else if (lThisChar < ' ') {
                    lIdx += 1;
                    if (lScriptToExec.length() > 0) {
                        lBurnChars = true;
                    }
//                    print(lThisChar);
                }
                else if (lThisChar > ' ' && !lBurnChars) {
                    lIdx += 1;
                    lScriptToExec = lScriptToExec.concat(Character.toString(lThisChar));
//                    print(lThisChar);
                }
                else {
                    lIdx += 1;
//                    print(lThisChar);
                }
            }
            else if (lState == NOTRANSLATIONXML) {
                if (lThisChar == '&' && lNextChar == '&' && lNextChar1 == '>') {
                    lIdx += 3;
                    lState = NOTRANSLATION;
                    iSymbolTable.getPropertyCollection().removePropertyValue("$jac:script:xml");
                    if (lXmlToParse.length() > 0) iSymbolTable.parseXml(lXmlToParse, "$jac:script:xml");
                    Object lScriptObject = iScript.loadScript(lScriptToExec, "jac");
                    OutputManager lOutputManager = iScript.getOutputManager();
                    lOutputManager.addDocument("ScriptWriter");
                    iScript.execMethod(lScriptObject, "execute");
                    StringBuffer lStringBuffer = lOutputManager.getDocument("ScriptWriter");
                    println("// *** BEGIN Executing include script " + lScriptToExec);
                    print(lStringBuffer.toString());
                    println("// *** END Executing include script " + lScriptToExec);
                    lSuppressLf = false;
                }
                else {
                    lIdx += 1;
                    lXmlToParse = lXmlToParse.concat(Character.toString(lThisChar));
//                    print(lThisChar);
                }
            }
// <::
            else if (lState == CASTSCRIPTHELPER) {
                if (lThisChar == ':' && lNextChar == '>') {
                    lIdx += 2;
                    lState = popState();
                }
                else {
                    lIdx++;
                    lScriptHelperCast = lScriptHelperCast.concat(Character.toString(lThisChar));
                }
            }
// <:
            else if (lState == CASTSCRIPT) {
                if (lThisChar == ':' && lNextChar == '>') {
                    lIdx += 2;
                    lState = popState();
                }
                else {
                    lIdx++;
                    lScriptCast = lScriptCast.concat(Character.toString(lThisChar));
                }
            }
// <!%
            else if (lState == JAVA_SYMBOL) {
                if (lThisChar == '!' && lNextChar == '>' && lNextChar1 == '!' && lNextChar2 == '!') {
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(getPropertyHelperSymbol() + getSymbolTableSymbol() + ".translateProperties("  + lPropertyName + "))");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                    }
                }
                else if (lThisChar == '!' && lNextChar == '>' && lNextChar1 == '!') {
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(getPropertyHelperSymbol() + getSymbolTableSymbol() + ".translateProperties("  + lPropertyName + ")).");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                    }
                }
                else if (lThisChar == '!' && lNextChar == '>') {
                    lIdx += 2;
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(getSymbolTableSymbol() + ".translateProperties(" + lPropertyName + ")");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                        print("\" + " + lPropertyName + " + \"");
                        lPropertyName = "";
                    }
                }
                else if (lThisChar == '{') {
                    int lIdx2 = lIdx + 1;
                    while (lLine.charAt(lIdx2) != '}') lIdx2++;
                    lPropertyName = lPropertyName.concat(iSymbolTable.translateProperties("[$jac:script:symbol:" + lLine.substring(lIdx + 1, lIdx2) + "]"));
                    lIdx = lIdx2 + 1;
                    resetAllCast();
                }
                else {
                    lIdx++;
                    lPropertyName = lPropertyName.concat(Character.toString(lThisChar));
                }
            }
// <!!
            else if (lState == JAVA_RECURSIVE_SYMBOL) {
                if (lThisChar == '!' && lNextChar == '>' && lNextChar1 == '!' && lNextChar2 == '!') {
                    lIdx += 4;
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(getPropertyHelperSymbol() + getSymbolTableSymbol() + ".recursivelyTranslateProperties(\""  + lPropertyName + "\"))");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                    }
                }
                else if (lThisChar == '!' && lNextChar == '>' && lNextChar1 == '!') {
                    lIdx += 3;
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(getPropertyHelperSymbol() + getSymbolTableSymbol() + ".recursivelyTranslateProperties(\""  + lPropertyName + "\")).");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                    }
                }
                else if (lThisChar == '!' && lNextChar == '>') {
                    lIdx += 2;
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(getSymbolTableSymbol() + ".recursivelyTranslateProperties(\"" + lPropertyName + "\")");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                        print("\" + " + getSymbolTableSymbol() + ".recursivelyTranslateProperties(\""  + lPropertyName + "\") + \"");
                        lPropertyName = "";
                        resetAllCast();
                    }
                }
                else if (lThisChar == '{') {
                    int lIdx2 = lIdx + 1;
                    while (lLine.charAt(lIdx2) != '}') lIdx2++;
                    lPropertyName = lPropertyName.concat("\" + " + iSymbolTable.translateProperties("[$jac:script:symbol:" + lLine.substring(lIdx + 1, lIdx2) + "]") + " + \"");
                    lIdx = lIdx2 + 1;
                    resetAllCast();
                }
                else {
                    lIdx++;
                    lPropertyName = lPropertyName.concat(Character.toString(lThisChar));
                }
            }
// <!
            else if (lState == JAC_SYMBOL) {
                if (lThisChar == '!' && lNextChar == '>' && lNextChar1 == '!' && lNextChar2 == '!') {
                    lIdx += 4;
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(getPropertyHelperSymbol() + getSymbolTableSymbol() + ".translateProperties(\""  + lPropertyName + "\"))");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                    }
                }
                else if (lThisChar == '!' && lNextChar == '>' && lNextChar1 == '!') {
                    lIdx += 3;
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(getPropertyHelperSymbol() + getSymbolTableSymbol() + ".translateProperties(\""  + lPropertyName + "\")).");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                    }
                }
                else if (peekState() == JAVA_CODE && lThisChar == '!' && lNextChar == '>' && lNextChar1 == '&') {
                    lIdx += 3;
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        println(getPropertyHelperSymbol() + getSymbolTableSymbol() + ".translateProperties(\""  + lPropertyName + "\")).resetIterator();");
                        print("while(" + getPropertyHelperSymbol() + getSymbolTableSymbol() + ".translateProperties(\""  + lPropertyName + "\")).next()) ");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                    }
                }
                else if (lThisChar == '!' && lNextChar == '>') {
                    lIdx += 2;
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(getSymbolTableSymbol() + ".translateProperties(\"" + lPropertyName + "\")");
                        lPropertyName = "";
                        resetAllCast();
                    }
                    else if (lState == OUTPUT) {
                        print("\" + " + getSymbolTableSymbol() + ".translateProperties(\""  + lPropertyName + "\") + \"");
                        lPropertyName = "";
                        resetAllCast();
                    }
                }
                else if (lThisChar == '{') {
                    int lIdx2 = lIdx + 1;
                    while (lLine.charAt(lIdx2) != '}') lIdx2++;
                    lPropertyName = lPropertyName.concat("\" + " + iSymbolTable.translateProperties("[$jac:script:symbol:" + lLine.substring(lIdx + 1, lIdx2) + "]") + " + \"");
                    lIdx = lIdx2 + 1;
                }
                else {
                    lIdx++;
                    lPropertyName = lPropertyName.concat(Character.toString(lThisChar));
                }
            }
// <#
            else if (lState == TRANSLATE_SYMBOL) {
                if (lThisChar == '#' && lNextChar == '>') {
                    lIdx += 2;
                    lState = popState();
                    if (lState == JAVA_CODE) {
                        print(iSymbolTable.translateProperties(lPropertyName));
                        lPropertyName = "";
                    }
                    else if (lState == OUTPUT) {
                        print(iSymbolTable.translateProperties(lPropertyName));
                        lPropertyName = "";
                    }
                }
                else {
                    lIdx++;
                    lPropertyName = lPropertyName.concat(Character.toString(lThisChar));
                }
            }
        }
        if (lState == OUTPUT) {
                if (lLine.endsWith("%>") == true) {
                    println("\", false);");
                } else {
                    println("\", true);");
                }
        }
//        else if (lState == JAVA_CODE && lIdx > 0) {
        else {
                if (!lSuppressLf) println("");
        }

//$Section=Operation$ID=40EFD1930148$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B07BC603D8$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B07BC603D8$Preserve=no
    private String getPropertyHelperSymbol( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=42B07BC603D8$Preserve=yes
        if (lScriptHelperCast.equals("") && lScriptCast.equals("")) return "iPropertyHelper.setPropertyName(iScript, ";
        String lReturn = "";
        if (!lScriptHelperCast.equals("")) {
            lReturn = "iPropertyHelper.setPropertyName(" + lScriptHelperCast + ".getScript(), ";
        } else {
            lReturn = "iPropertyHelper.setPropertyName(" + lScriptCast + ", ";
        }
        return lReturn;
//$Section=Operation$ID=42B07BC603D8$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B00B7C0213$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B00B7C0213$Preserve=no
    private String getSymbolTableSymbol( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=42B00B7C0213$Preserve=yes
        if (lScriptHelperCast.equals("") && lScriptCast.equals("")) return "iSymbolTable";
        String lReturn = "";
        if (!lScriptHelperCast.equals("")) {
            lReturn = lScriptHelperCast + ".getSymbolTable()";
        } else {
            lReturn = lScriptCast + ".getSymbolTable()";
        }
        return lReturn;
//$Section=Operation$ID=42B00B7C0213$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B1889801AA$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B1889801AA$Preserve=no
    private void resetAllCast( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=42B1889801AA$Preserve=yes
        resetScriptHelperCast();
        resetScriptCast();
//$Section=Operation$ID=42B1889801AA$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B1886F02F2$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B1886F02F2$Preserve=no
    private void resetScriptHelperCast( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=42B1886F02F2$Preserve=yes
        lScriptHelperCast = "";
//$Section=Operation$ID=42B1886F02F2$Preserve=no
    }

//$Section=OperationJavadoc$ID=42B18887017B$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=42B18887017B$Preserve=no
    private void resetScriptCast( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=42B18887017B$Preserve=yes
        lScriptCast = "";
//$Section=Operation$ID=42B18887017B$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F01A6401A5$Preserve=yes
/**
 *
 * @param aState
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F01A6401A5$Preserve=no
    private void pushState( int aState ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=40F01A6401A5$Preserve=yes

        lStack.push(new Integer(aState));

//$Section=Operation$ID=40F01A6401A5$Preserve=no
    }

//$Section=OperationJavadoc$ID=40F01A7D0251$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=40F01A7D0251$Preserve=no
    private int popState( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=40F01A7D0251$Preserve=yes

        if (lStack.isEmpty() == true) return 0;
        return ((Integer) lStack.pop()).intValue();

//$Section=Operation$ID=40F01A7D0251$Preserve=no
    }

//$Section=OperationJavadoc$ID=428DF77603A6$Preserve=yes
/**
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=428DF77603A6$Preserve=no
    private int peekState( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=428DF77603A6$Preserve=yes

        if (lStack.isEmpty() == true) return 0;
        return ((Integer) lStack.peek()).intValue();

//$Section=Operation$ID=428DF77603A6$Preserve=no
    }

//$Section=OperationJavadoc$ID=41FED6FC01E4$Preserve=yes
/**
 *
 * @param aLine
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41FED6FC01E4$Preserve=no
    private void print( String aLine ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=41FED6FC01E4$Preserve=yes
            iLineToPrint += aLine;
//            iPrintWriter.print(aLine);
//$Section=Operation$ID=41FED6FC01E4$Preserve=no
    }

//$Section=OperationJavadoc$ID=424D93A20203$Preserve=yes
/**
 *
 * @param aChar
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=424D93A20203$Preserve=no
    private void print( char aChar ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=424D93A20203$Preserve=yes
            iLineToPrint += Character.toString(aChar);
//        iPrintWriter.print(aChar);
//$Section=Operation$ID=424D93A20203$Preserve=no
    }

//$Section=OperationJavadoc$ID=41FED71302CE$Preserve=yes
/**
 *
 * @param aLine
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=41FED71302CE$Preserve=no
    private void println( String aLine ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter ScriptWriter.");
//$Section=Operation$ID=41FED71302CE$Preserve=yes
            if (lState == NOTRANSLATION || lState == NOTRANSLATIONEXEC || lState == NOTRANSLATIONXML) {
              iSourceLine = null;
            }
            if (iSourceLine != null && lState != EXECSCRIPT && lState != XML && !iLineToPrint.startsWith("/* *** GENERATED SECTION *** ") && !iSourceLine.equals(iLineToPrint)) {
                iPrintWriter.println("//ScriptWriter~~" + iSourceLine);
                iLastSourceLineNumber = iSourceLineNumber;
            } else {
                if (iSourceLine == null && iLastSourceLineNumber == iSourceLineNumber) {
                    iPrintWriter.println("//ScriptWriter~~~");
                }
            }
            iSourceLine = null;
            iLineToPrint += aLine;
            iPrintWriter.println(iLineToPrint);
            iLineToPrint = "";
//            iPrintWriter.println(aLine);
//$Section=Operation$ID=41FED71302CE$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=40EFD13C00BB$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=40EFD13C00BB$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=40EFD13C00BB$Preserve=no

//End of class---------------
}
