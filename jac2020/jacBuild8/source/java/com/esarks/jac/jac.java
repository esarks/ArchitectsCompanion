//$Section=License$ID=3F9D93AC0013$Preserve=no

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

//  Generated at 2005.06.29 07:44:46.156 PM EDT by Architect's Companion (c) 1998 - 2004, Architects of Software Design, Corp., ALL RIGHTS RESERVED
//  Module Name: jac.java

//$Section=ChangeLog$ID=3F9D93AC0013$Preserve=yes

/* ========================================================================= *
   Contributor        Description
   ------------------ ------------------------------------------------------
   Paul T. Marshall   Author

 * ========================================================================= */

//$Section=Class$ID=3F9D93AC0013$Preserve=no

package com.esarks.jac;

//----------------------------------------------------------------------------
// This section is for generated import delcarations.
//----------------------------------------------------------------------------
// Additional Import Declarations
import java.text.*;
import java.util.*;

//$Section=CustomDeclare$ID=3F9D93AC0013$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom declarations.
//----------------------------------------------------------------------------

//$Section=CustomDeclare$ID=3F9D93AC0013$Preserve=no

//$Section=ClassJavadoc$ID=3F9D93AC0013$Preserve=yes
/**
 * This processes command line arguments and instantiates a Script.
 * <p>
 * The following command line arguments are handled:
 * <ul>
 * <li>-classpath
 * <li>-home
 * <li>-work
 * <li>-scripts
 * <li>-script
 * <li>-make
 * <li>-method
 * <li>-argument
 * <li>-verify
 * <li>-noverify
 * <li>-debug
 * <li>-debugClass
 * <li>-context
 * </ul>
 */
//$Section=ClassJavadoc$ID=3F9D93AC0013$Preserve=no
public class jac {

//----------------------------------------------------------------------------
// This section is for generated declarations.
//----------------------------------------------------------------------------
// Attributes
    private String iClasspath = "";
    private String iHomeDirectory = "";
    private String iWorkDirectory = "";
    private String iScriptsDirectory = "";
    private String iScriptName = "";
    private String iMakeName = "";
    private String iMethodName = "execute";
    private ArrayList iMethodArg = new ArrayList();
    private boolean iVerifyScripts = true;
    private byte iDebug = 0;
    private int iDebugClass = 0;
    private String iContext = "jac";
    private String iDebugInstance;
    private String iDebugPath;
    private boolean iPause = false;
    private boolean iCompile = true;

//$Section=CustomClassDeclare$ID=3F9D93AC0013$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom class declarations.
//----------------------------------------------------------------------------

//$Section=CustomClassDeclare$ID=3F9D93AC0013$Preserve=no

//----------------------------------------------------------------------------
// Default constructor is generated.
//----------------------------------------------------------------------------

//$Section=DefaultConstructorJavadoc$ID=3F9D93AC0013$Preserve=no
/**
 * Default constructor.
 */
//$Section=DefaultConstructorJavadoc$ID=3F9D93AC0013$Preserve=no
    public jac() {
//$Section=DefaultConstructor$ID=3F9D93AC0013$Preserve=yes
//$Section=DefaultConstructor$ID=3F9D93AC0013$Preserve=no
    }
//----------------------------------------------------------------------------
// Default finalize is generated.
//----------------------------------------------------------------------------

//$Section=DefaultDestructorJavadoc$ID=3F9D93AC0013$Preserve=no
/**
 * Default finalize.
 */
//$Section=DefaultDestructorJavadoc$ID=3F9D93AC0013$Preserve=no
    public void finalize() {
//$Section=DefaultDestructor$ID=3F9D93AC0013$Preserve=yes
        freeResources();
//$Section=DefaultDestructor$ID=3F9D93AC0013$Preserve=no
    }

//----------------------------------------------------------------------------
// Default freeResources is generated.
//----------------------------------------------------------------------------

//$Section=DefaultFreeResourcesJavadoc$ID=3F9D93AC0013$Preserve=no
/**
 * Default freeResources.
 */
//$Section=DefaultFreeResourcesJavadoc$ID=3F9D93AC0013$Preserve=no
    public void freeResources() {
//$Section=DefaultFreeResources$ID=3F9D93AC0013$Preserve=yes
        iMethodArg.clear();
        iMethodArg = null;
//$Section=DefaultFreeResources$ID=3F9D93AC0013$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated operations.
//----------------------------------------------------------------------------
//$Section=OperationJavadoc$ID=3F9D943B01AA$Preserve=yes
/**
 * Instantiates a <code>jac</code> object and invokes <code>processAttribute</code> for each command line argument.
 *
 * @param args The command line arguments passed from the Java runtime.
 *
 */
//$Section=OperationJavadoc$ID=3F9D943B01AA$Preserve=no
    public static void main( String[] args ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter jac.");
//$Section=Operation$ID=3F9D943B01AA$Preserve=yes

        System.out.println("Architects Companion");
        System.out.println("jac v2009.02.01");
        System.out.println("(c) Copyright 2009-2019, Architects of Software Design, Corp.  ALL RIGHTS RESERVED.");

        jac ljac = new jac();

        int lIdx = 0;

        try {
            while (lIdx < args.length) {
                if (args[lIdx].compareTo("-classpath") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("classpath", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-home") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("home", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-work") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("work", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-scripts") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("scripts", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-script") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("script", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-make") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("make", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-method") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("method", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-argument") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("argument", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-verify") == 0) {
                    ljac.processAttribute("verify", "");
                    lIdx++;
                }
                else if (args[lIdx].compareTo("-noverify") == 0) {
                    ljac.processAttribute("noverify", "");
                    lIdx++;
                }
                else if (args[lIdx].compareTo("-debug") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("debug", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-debugClass") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("debugClass", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-debugInstance") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("debugInstance", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-debugPath") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("debugPath", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-context") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("context", args[lIdx+1]);
                    lIdx += 2;
                }
                else if (args[lIdx].compareTo("-pause") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("pause", "");
                    lIdx++;
                }
                else if (args[lIdx].compareTo("-nocompile") == 0 && args[lIdx+1] != null) {
                    ljac.processAttribute("nocompile", "");
                    lIdx++;
                }
                else {
                    lIdx++;
                }
            }
        } catch(Exception e) {}

        boolean lPause = ljac.iPause;
        Script lScript = ljac.getScript();
        lScript.freeResources();
        lScript = null;
        Log.destroyInstance();
        ljac.freeResources();
        ljac = null;
        System.gc();
        if (lPause) {
            try {
                while (System.in.available() > 0) System.in.read();
                System.out.print("At end of jac:main().  Press ENTER to continue...");
                System.in.read();
                while (System.in.available() > 0) System.in.read();
            } catch (Throwable e) {}
        }

//$Section=Operation$ID=3F9D943B01AA$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA69FAC0106$Preserve=yes
/**
 * Process a command line argument.
 *
 * @param aAttribute A known attribute name.  One of <code>classpath</code>, <code>home</code>, <code>work</code>, <code>scripts</code>,
 *                   <code>script</code>, <code>make</code>, <code>method</code>, <code>argument</code>, <code>noverify</code>, <code>verify</code>,
 *                   <code>debug</code>, <code>debugClass</code>, <code>context</code>.
 *
 * @param aValue The attribute value.
 *
 */
//$Section=OperationJavadoc$ID=3FA69FAC0106$Preserve=no
    public void processAttribute( String aAttribute, String aValue ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter jac.");
//$Section=Operation$ID=3FA69FAC0106$Preserve=yes

        if (aAttribute.compareTo("classpath") == 0) {
            iClasspath = aValue;
        }
        else if (aAttribute.compareTo("home") == 0) {
            iHomeDirectory = aValue;
        }
        else if (aAttribute.compareTo("work") == 0) {
            iWorkDirectory = aValue;
        }
        else if (aAttribute.compareTo("scripts") == 0) {
            iScriptsDirectory = aValue;
        }
        else if (aAttribute.compareTo("script") == 0) {
            iScriptName = aValue;
        }
        else if (aAttribute.compareTo("make") == 0) {
            iMakeName = aValue;
        }
        else if (aAttribute.compareTo("method") == 0) {
            iMethodName = aValue;
        }
        else if (aAttribute.compareTo("argument") == 0) {
            iMethodArg.add(aValue);
        }
        else if (aAttribute.compareTo("noverify") == 0) {
            iVerifyScripts = false;
        }
        else if (aAttribute.compareTo("verify") == 0) {
            iVerifyScripts = true;
        }
        else if (aAttribute.compareTo("debug") == 0) {
            iDebug = Byte.parseByte(aValue);
        }
        else if (aAttribute.compareTo("debugClass") == 0) {
            iDebugClass = Integer.parseInt(aValue);
        }
        else if (aAttribute.compareTo("debugInstance") == 0) {
            iDebugInstance = aValue;
        }
        else if (aAttribute.compareTo("debugPath") == 0) {
            iDebugPath = aValue;
        }
        else if (aAttribute.compareTo("context") == 0) {
            iContext = aValue;
        }
        else if (aAttribute.compareTo("pause") == 0) {
            iPause = true;
        }
        else if (aAttribute.compareTo("nocompile") == 0) {
            iCompile = false;
        }

//$Section=Operation$ID=3FA69FAC0106$Preserve=no
    }

//$Section=OperationJavadoc$ID=3FA69FEB0021$Preserve=yes
/**
 * Instantiates a <code>Script</code>.
 *
 * @return The instantiated <code>Script</code>.
 *
 */
//$Section=OperationJavadoc$ID=3FA69FEB0021$Preserve=no
    public Script getScript( ) {
//        if (iLog.test(iLogClass, Log._DEBUG))
//            iLog.println(iLogClass, Log._DEBUG, "Enter jac.");
//$Section=Operation$ID=3FA69FEB0021$Preserve=yes

//        Log.getInstance().setLogLevel(iDebug);
//        Log.getInstance().setClass(iDebugClass);

        String lFileSeparator = System.getProperty("file.separator");
//        Script lScript = new Script(iHomeDirectory + lFileSeparator + "license.xml");
//        lScript.openDebug(iHomeDirectory + lFileSeparator + "jac.log");

        String lInstance = iDebugInstance;
        Log lLog = null;
        if (iDebugInstance != null && iDebugInstance.length() > 0 && iDebugPath != null && iDebugPath.length() > 0) {
            if (iDebugInstance.equals("?date")) {
                lInstance = Long.toString(System.currentTimeMillis());
            }
            lLog = Log.getInstance(lInstance);
            lLog.setLogLevel(iDebug);
            lLog.setClass(iDebugClass);
            if (iDebug > 0) {
                lLog.open(iDebugPath + lFileSeparator + lInstance + "_" + Long.toString(System.currentTimeMillis()) + ".log");
//                lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:log:instance", new PropertyValue(lInstance));
                lLog.println(Log._INFO, "DEBUG-com.esarks.jac.jac:getScript()!Log opened by jac!Debug=" + Byte.toString(iDebug) + "!DebugClass=" + Integer.toString(iDebugClass));
            }
        }

        Script lScript = new Script(iHomeDirectory + lFileSeparator + "license.xml");
        lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:log:instance", new PropertyValue(lInstance));

//        lScript.getSymbolTable().getPropertyCollection().removePropertyValues("$jac");
        lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:context", new PropertyValue(iContext));
        if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:context=" + iContext);
        lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:path:classpath", new PropertyValue(iClasspath));
        if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:path:classpath=" + iClasspath);

        lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:path:home", new PropertyValue(iHomeDirectory));
        if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:path:home=" + iHomeDirectory);
        if (iWorkDirectory.compareTo("") != 0) {
            lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:path:work", new PropertyValue(iWorkDirectory));
            if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:path:work=" + iWorkDirectory);
        } else {
            lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:path:work", new PropertyValue(iHomeDirectory + lFileSeparator + "work"));
            if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:path:work=" + iHomeDirectory + lFileSeparator + "work");
        }
        if (iScriptsDirectory.compareTo("") != 0) {
            lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:path:scripts", new PropertyValue(iScriptsDirectory));
            if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:path:scripts=" + iScriptsDirectory);
        } else {
            lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:path:scripts", new PropertyValue(iHomeDirectory + lFileSeparator + "scripts"));
            if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:path:scripts=" + iHomeDirectory + lFileSeparator + "scripts");
        }
        lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:path:document", new PropertyValue(System.getProperty("user.home")));
        if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:path:document=" + System.getProperty("user.home"));

        lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:fileSeparator", new PropertyValue(lFileSeparator));
        if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:fileSeparator=" + lFileSeparator);
        lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:verifyScripts", new PropertyValue(iVerifyScripts));
        if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:verifyScripts=" + iVerifyScripts);
        if (iCompile) {
          lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:compile", new PropertyValue("true"));
          if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:compile=true");
        } else {
          lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:compile", new PropertyValue("false"));
          if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:compile=false");
        }

        String lTodayString = "";
        try {
            SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss.SSS a z");
            lTodayString = lSimpleDateFormat.format(new java.util.Date(System.currentTimeMillis()));
        } catch (Exception e) {}
        lScript.getSymbolTable().getPropertyCollection().addPropertyValue("$jac:dateTime", new PropertyValue(lTodayString));
        if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!$jac:dateTime=" + lTodayString);
        if (iMakeName.compareTo("") != 0) {
//            lScript.makeScript(iMakeName);
        }
        if (iScriptName.compareTo("") != 0) {
            if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!Script=" + iScriptName);
            if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!Method=" + iMethodName);
            if (iMethodArg.size() == 0) {
                if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!Calling Script.execMethod without arguments...");
                lScript.execMethod(iScriptName, iMethodName);
            } else {
                Object[] lArguments = new Object[iMethodArg.size()];
                for (int lIdx=0; lIdx < iMethodArg.size(); lIdx++) {
                    if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!Argument=" + iMethodArg.get(lIdx));
                    lArguments[lIdx] = (Object) iMethodArg.get(lIdx);
                }
                if (lLog != null) lLog.println(Log._DEBUG, "DEBUG-com.esarks.jac.jac:getScript()!Calling Script.execMethod with arguments...");
                lScript.execMethod(iScriptName, iMethodName, lArguments);
            }
        }

        return lScript;

//$Section=Operation$ID=3FA69FEB0021$Preserve=no
    }

//----------------------------------------------------------------------------
// This section is for generated attribute accessor methods.
//----------------------------------------------------------------------------
//----------------------------------------------------------------------------
// This section is for generated association accessor methods.
//----------------------------------------------------------------------------
//$Section=CustomOperations$ID=3F9D93AC0013$Preserve=yes

//----------------------------------------------------------------------------
// This section is for custom operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9D93AC0013$Preserve=yes

//----------------------------------------------------------------------------
// This section contains orphaned code from deleted operations.
//----------------------------------------------------------------------------

//$Section=Deleted$ID=3F9D93AC0013$Preserve=no

//End of class---------------
}
