//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.util;

import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.sql.*;
//import java.net.*;
//import javax.net.ssl.*;
//import java.security.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.awt.*;
//import javax.swing.*;

import com.esarks.jac.*;
import com.esarks.mic.*;

//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class FileUtil extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected FileUtil() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public FileUtil(Script aScript) {

    super(aScript);

  }

public void execute() {

    String lOaArch = System.getProperty("os.arch");
    String lOaName = System.getProperty("os.name");
    String lOaVersion = System.getProperty("os.version");
//    System.out.println(lOaArch);
//    System.out.println(lOaName);
//    System.out.println(lOaVersion);

    System.out.println("Operating System is " + lOaName);
//ScriptWriter~~    if (!<!mic.element!>!scan("os:name", lOaName)) {
    if (!iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element")).scan("os:name", lOaName)) {
      System.out.println("Exiting due to error finding Operating System command tag.");
      return;
    }   

//ScriptWriter~~    String lOsTag = <![mic.element:os:tag]!>;
    String lOsTag = iSymbolTable.translateProperties("[mic.element:os:tag]");
    if (lOsTag.equals("")) {
      System.out.println("Exiting due to empty Operating System command tag.");
      return;
    }   
    System.out.println("Using tag \"" + lOsTag + "\"");
        
    String lFrom = "";
    String lFromDir = "";
    String lFromType = "";
    String lFromFile = "";
    String lTo = "";
    String lToDir = "";
    String lToType = "";
    String lToFile = "";
    String lName = "";
    
//ScriptWriter~~    <!mic.element:file!>& {
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:file")).resetIterator();
//ScriptWriter~~~
while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:file")).next())  {

//ScriptWriter~~      if (<!mic.element:file:fromHome!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:file:fromHome")).size() > 0) {
//ScriptWriter~~        lFrom = <![mic.element:file:fromHome]!>;
        lFrom = iSymbolTable.translateProperties("[mic.element:file:fromHome]");
//ScriptWriter~~        lFromDir = homePath(<![mic.element:file:fromHome]!>);
        lFromDir = homePath(iSymbolTable.translateProperties("[mic.element:file:fromHome]"));
        lFromType = "home";
      }
//ScriptWriter~~      if (<!mic.element:file:fromWork!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:file:fromWork")).size() > 0) {
//ScriptWriter~~        lFrom = <![mic.element:file:fromWork]!>;
        lFrom = iSymbolTable.translateProperties("[mic.element:file:fromWork]");
//ScriptWriter~~        lFromDir = workPath(<![mic.element:file:fromWork]!>);
        lFromDir = workPath(iSymbolTable.translateProperties("[mic.element:file:fromWork]"));
        lFromType = "work";
      }
//ScriptWriter~~      if (<!mic.element:file:fromScript!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:file:fromScript")).size() > 0) {
//ScriptWriter~~        lFrom = <![mic.element:file:fromScript]!>;
        lFrom = iSymbolTable.translateProperties("[mic.element:file:fromScript]");
//ScriptWriter~~        lFromDir = path(<![mic.element:file:fromScript]!>);
        lFromDir = path(iSymbolTable.translateProperties("[mic.element:file:fromScript]"));
        lFromType = "script";
      }
//ScriptWriter~~      if (<!mic.element:file:toHome!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:file:toHome")).size() > 0) {
//ScriptWriter~~        lTo = <![mic.element:file:toHome]!>;
        lTo = iSymbolTable.translateProperties("[mic.element:file:toHome]");
//ScriptWriter~~        lToDir = homePath(<![mic.element:file:toHome]!>);
        lToDir = homePath(iSymbolTable.translateProperties("[mic.element:file:toHome]"));
        lToType = "home";
      }
//ScriptWriter~~      if (<!mic.element:file:toWork!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:file:toWork")).size() > 0) {
//ScriptWriter~~        lTo = <![mic.element:file:toWork]!>;
        lTo = iSymbolTable.translateProperties("[mic.element:file:toWork]");
//ScriptWriter~~        lToDir = workPath(<![mic.element:file:toWork]!>);
        lToDir = workPath(iSymbolTable.translateProperties("[mic.element:file:toWork]"));
        lToType = "work";
      }
//ScriptWriter~~      if (<!mic.element:file:toScript!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:file:toScript")).size() > 0) {
//ScriptWriter~~        lTo = <![mic.element:file:toScript]!>;
        lTo = iSymbolTable.translateProperties("[mic.element:file:toScript]");
//ScriptWriter~~        lToDir = path(<![mic.element:file:toScript]!>);
        lToDir = path(iSymbolTable.translateProperties("[mic.element:file:toScript]"));
        lToType = "script";
      }
//ScriptWriter~~      if (<!mic.element:file:name!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:file:name")).size() > 0) {
//ScriptWriter~~        lName = <![mic.element:file:name]!>;
        lName = iSymbolTable.translateProperties("[mic.element:file:name]");
        if (lFromType.equals("home")) lFromFile = homePath(lFrom + ".") + lName;
        if (lFromType.equals("work")) lFromFile = workPath(lFrom + ".") + lName;
        if (lFromType.equals("script")) lFromFile = path(lFrom + ".") + lName;
        if (lToType.equals("home")) lToFile = homePath(lTo + ".") + lName;
        if (lToType.equals("work")) lToFile = workPath(lTo + ".") + lName;
        if (lToType.equals("script")) lToFile = path(lTo + ".") + lName;
      }

//ScriptWriter~~      String lAction = <![mic.element:file:" + lOsTag + "]!>;
      String lAction = iSymbolTable.translateProperties("[mic.element:file:" + lOsTag + "]");
      if (!lAction.equals("")) {
        while (lAction.indexOf("$fromDir") > -1) {
          int lIndexOf = lAction.indexOf("$fromDir");
          lAction = lAction.substring(0, lIndexOf) + lFromDir + lAction.substring(lIndexOf + 8);
        }
        while (lAction.indexOf("$fromFile") > -1) {
          int lIndexOf = lAction.indexOf("$fromFile");
          lAction = lAction.substring(0, lIndexOf) + lFromFile + lAction.substring(lIndexOf + 9);
        }
        while (lAction.indexOf("$toDir") > -1) {
          int lIndexOf = lAction.indexOf("$toDir");
          lAction = lAction.substring(0, lIndexOf) + lToDir + lAction.substring(lIndexOf + 6);
        }
        while (lAction.indexOf("$toFile") > -1) {
          int lIndexOf = lAction.indexOf("$toFile");
          lAction = lAction.substring(0, lIndexOf) + lToFile + lAction.substring(lIndexOf + 7);
        }
        if (command(lAction) != 0) {
//ScriptWriter~~          if (<![mic.element:file:ignore]!>.equals("true")) {
          if (iSymbolTable.translateProperties("[mic.element:file:ignore]").equals("true")) {
          } else {
            return;
          }
        } else {
        }
      }
//ScriptWriter~~      if (<![mic.element:file:pause]!>.equals("true")) {
      if (iSymbolTable.translateProperties("[mic.element:file:pause]").equals("true")) {
        try {
          while (System.in.available() > 0) System.in.read();
          System.out.print("Press ENTER to continue...");
          System.in.read();
          while (System.in.available() > 0) System.in.read();
        } catch (Throwable e) {}
      }
      System.gc();
    }
}

public int command(String aCommand)
    {
        System.out.println(">" + aCommand);
        try
        {
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec(aCommand);
            
            // any error message?
            StreamGobbler errorGobbler = new 
                StreamGobbler(proc.getErrorStream(), "ERR");
                
            // any output?
            StreamGobbler outputGobbler = new 
                StreamGobbler(proc.getInputStream(), "OUT");
                
            // kick them off
            errorGobbler.start();
            outputGobbler.start();
                                    
            // any error???
            int exitVal = proc.waitFor();
            System.out.println("ExitValue: " + exitVal);
            return exitVal;
        } catch (Throwable t)
          {
            t.printStackTrace();
          }
        return 1;
    }


class StreamGobbler extends Thread
{
    InputStream is;
    String type;
    OutputStream os;
    
    StreamGobbler(InputStream is, String type)
    {
        this(is, type, null);
    }

    StreamGobbler(InputStream is, String type, OutputStream redirect)
    {
        this.is = is;
        this.type = type;
        this.os = redirect;
    }
    
    public void run()
    {
        try
        {
            PrintWriter pw = null;
            if (os != null)
                pw = new PrintWriter(os);
                
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line=null;
            while ( (line = br.readLine()) != null)
            {
                if (pw != null)
                    pw.println(line);
                System.out.println(type + ">" + line);    
            }
            if (pw != null)
                pw.flush();
        } catch (IOException ioe)
            {
            ioe.printStackTrace();  
            }
    }
}
}
