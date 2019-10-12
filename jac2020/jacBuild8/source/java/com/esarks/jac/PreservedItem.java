//$Section=License$ID=3FA41F570132$Preserve=no

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

//  Generated at 2005.04.01 03:51:53.968 PM EST by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: PreservedItem.java

//$Section=ChangeLog$ID=3FA41F570132$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3FA41F570132$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.io.*;
import java.util.*;

//$Section=CustomDeclare$ID=3FA41F570132$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3FA41F570132$Preserve=no

//$Section=ClassJavadoc$ID=3FA41F570132$Preserve=yes
/**
 *
 */
//$Section=ClassJavadoc$ID=3FA41F570132$Preserve=no
public class PreservedItem {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private ArrayList iArrayList = new ArrayList(100);
    private boolean iTrimOutput = false;
    private boolean iKeep = false;
    private int iReverseMergeState = 0;
    private int iInsertLf = 0;

//$Section=CustomClassDeclare$ID=3FA41F570132$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3FA41F570132$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3FA41F570132$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3FA41F570132$Preserve=no
    private PreservedItem() {
//$Section=DefaultConstructor$ID=3FA41F570132$Preserve=yes
//$Section=DefaultConstructor$ID=3FA41F570132$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3FA41F570132$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3FA41F570132$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3FA41F570132$Preserve=yes

        freeResources();

//$Section=DefaultDestructor$ID=3FA41F570132$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3FA41F570132$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3FA41F570132$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3FA41F570132$Preserve=yes

        if (iArrayList != null) {
            iArrayList.clear();
            iArrayList = null;
        }

//$Section=DefaultFreeResources$ID=3FA41F570132$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3FA41F9C024A$Preserve=yes
/**
 *
 * @param aTrimOutput
 *
 */
//$Section=OperationJavadoc$ID=3FA41F9C024A$Preserve=no
    public PreservedItem( boolean aTrimOutput ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PreservedItem.");
//$Section=Operation$ID=3FA41F9C024A$Preserve=yes

        iTrimOutput = aTrimOutput;

//$Section=Operation$ID=3FA41F9C024A$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F9C024C$Preserve=yes
/**
 *
 * @param aString
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F9C024C$Preserve=no
    public void addString( String aString ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PreservedItem.");
//$Section=Operation$ID=3FA41F9C024C$Preserve=yes

        iArrayList.add(aString);

//$Section=Operation$ID=3FA41F9C024C$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F9C0254$Preserve=yes
/**
 *
 * @param aPrintWriter
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F9C0254$Preserve=no
    public void print( PrintWriter aPrintWriter ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PreservedItem.");
//$Section=Operation$ID=3FA41F9C0254$Preserve=yes

        for (int lIdx=0; lIdx < iArrayList.size(); lIdx++) {
            String lOut = trim(reverseMergeFilter((String) iArrayList.get(lIdx)));
            if (lIdx + 1 == iArrayList.size())
                aPrintWriter.print(lOut);
                else {
                  if (iInsertLf == 0) {
                    aPrintWriter.println(lOut);
                  } else {
                    aPrintWriter.print(lOut);
                  }
                }
        }

//$Section=Operation$ID=3FA41F9C0254$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F9C03DB$Preserve=yes
/**
 *
 * @param aStringToTrim
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F9C03DB$Preserve=no
    private String trim( String aStringToTrim ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PreservedItem.");
//$Section=Operation$ID=3FA41F9C03DB$Preserve=yes

        if (iTrimOutput == false) return aStringToTrim;
        return PreservedItem.trimRight(aStringToTrim);

//$Section=Operation$ID=3FA41F9C03DB$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA41F9C03DD$Preserve=yes
/**
 *
 * @param aStringToTrim
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=3FA41F9C03DD$Preserve=no
    public static String trimRight( String aStringToTrim ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PreservedItem.");
//$Section=Operation$ID=3FA41F9C03DD$Preserve=yes

        int lIdx = aStringToTrim.length() - 1;
        while (lIdx >= 0 && (aStringToTrim.charAt(lIdx) == ' ' || aStringToTrim.charAt(lIdx) == '\t')) {
            lIdx--;
        }
        if (lIdx < 0) return "";
        return aStringToTrim.substring(0, lIdx + 1);

//$Section=Operation$ID=3FA41F9C03DD$Preserve=no
    }

//$Section=OperationJavadoc$ID=424D70650290$Preserve=yes
/**
 *
 * @param aString
 *
 * @return
 *
 */
//$Section=OperationJavadoc$ID=424D70650290$Preserve=no
    public String reverseMergeFilter( String aString ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter PreservedItem.");
//$Section=Operation$ID=424D70650290$Preserve=yes

        int lIndexOf = -1;
        switch(iReverseMergeState) {
        case 0:  // normal
//            if (iInsertLf == 2) iInsertLf = 0;
            if (iInsertLf == 1) iInsertLf = 0;
            if ((lIndexOf = aString.indexOf("/*" + "<&")) == -1 &&
                !aString.startsWith("//ScriptWriter~~")) return aString;
            if (lIndexOf == -1) {
              iReverseMergeState = 3;
            } else {
              iReverseMergeState = 1;
            }
            if (lIndexOf > -1) {
              if (lIndexOf == 0) {
                String lTemp = reverseMergeFilter(aString.substring(lIndexOf+2));
                return lTemp;
              } else {
                String lTemp = aString.substring(0, lIndexOf) + reverseMergeFilter(aString.substring(lIndexOf+2));
                return lTemp;
              }
            } else {
                String lTemp = aString.substring(16);
                if (lTemp.startsWith("/*" + "<&")) {
                  iInsertLf = 1;
                  return "";
                }
                if (aString.equals("//ScriptWriter~~~")) {
                  iInsertLf = 1;
                  return "";
                }
                return lTemp;
            }
        case 1:  // found /* <&, looking for &> */
            if ((lIndexOf = aString.indexOf("&>" + "*/")) == -1) return aString;
            iReverseMergeState = 2;
            if (lIndexOf == 0) {
              if (lIndexOf + 4 >= aString.length()) return "&>";
              String lTemp = "&>" + reverseMergeFilter(aString.substring(lIndexOf+4));
              return lTemp;
            } else {
              if (lIndexOf + 4 >= aString.length()) return aString.substring(0, lIndexOf+2);
              String lTemp = aString.substring(0, lIndexOf+2) + reverseMergeFilter(aString.substring(lIndexOf));
              return lTemp;
            }
        case 2:  // looking for /* End of JAC Expansion */
            iInsertLf = 1;
            if ((lIndexOf = aString.indexOf("/* *** GENERATED SECTION ***" + " End of embedded XML expansion */")) == -1) return "";
            iReverseMergeState = 0;
            return "";
        case 3:  // burn the string
            iInsertLf = 1;
            iReverseMergeState = 0;
            return "";
        }

        return "";
//$Section=Operation$ID=424D70650290$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// ArrayList
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=3FA41F950268$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=3FA41F950268$Preserve=no
    protected ArrayList getArrayList() {
//$Section=Attribute get$ID=3FA41F950268$Preserve=no
        return iArrayList;
//$Section=Attribute get$ID=3FA41F950268$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=3FA41F950268$Preserve=no
/**
 * Set accessor method.
 *
 * @param ArrayList the value to be set.
 */
//$Section=Attribute setJavadoc$ID=3FA41F950268$Preserve=no
    protected void setArrayList(ArrayList aValue) {
//$Section=Attribute set$ID=3FA41F950268$Preserve=no
        iArrayList = aValue;
//$Section=Attribute set$ID=3FA41F950268$Preserve=no
    }
//----------------------------------------------------------------------------
// Keep
//----------------------------------------------------------------------------
//$Section=Attribute getJavadoc$ID=40ECABEB0232$Preserve=no
/**
 * Get accessor method.
 *
 * @return the value.
 */
//$Section=Attribute getJavadoc$ID=40ECABEB0232$Preserve=no
    public boolean getKeep() {
//$Section=Attribute get$ID=40ECABEB0232$Preserve=no
        return iKeep;
//$Section=Attribute get$ID=40ECABEB0232$Preserve=no
    }
//$Section=Attribute setJavadoc$ID=40ECABEB0232$Preserve=no
/**
 * Set accessor method.
 *
 * @param Keep the value to be set.
 */
//$Section=Attribute setJavadoc$ID=40ECABEB0232$Preserve=no
    public void setKeep(boolean aValue) {
//$Section=Attribute set$ID=40ECABEB0232$Preserve=no
        iKeep = aValue;
//$Section=Attribute set$ID=40ECABEB0232$Preserve=no
    }
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3FA41F570132$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FA41F570132$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3FA41F570132$Preserve=no

//End of class---------------
}
