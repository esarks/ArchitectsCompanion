//ScriptWriter~~package <#[$jac:script:package]#>;
package ehrm.WorkflowTaxonomy;

import com.esarks.jac.*;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.net.*;
import javax.net.ssl.*;
import java.security.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.awt.*;
import javax.swing.*;
import com.esarks.mic.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.*;

//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class WorkflowTaxonomyBuild extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected WorkflowTaxonomyBuild() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public WorkflowTaxonomyBuild(Script aScript) {

    super(aScript);

  }
/*<& com.esarks.arm.scripts.Method
   <method name="execute" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void execute() {
  String lMethodSignature = "execute()";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method");
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![$jac:path:scripts]!><!%path("ehrm.WorkflowTaxonomy.Workflowtaxonomy")!><!%".xml"!>
iOutputManager.println("" + iSymbolTable.translateProperties("[$jac:path:scripts]") + "" + path("ehrm.WorkflowTaxonomy.Workflowtaxonomy") + "" + ".xml" + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  iSymbolTable.parseXml(<![$jac:path:scripts]!> + path("ehrm.WorkflowTaxonomy.Workflowtaxonomy") + ".xml");
  iSymbolTable.parseXml(iSymbolTable.translateProperties("[$jac:path:scripts]") + path("ehrm.WorkflowTaxonomy.Workflowtaxonomy") + ".xml");

  executeExtractComments();
//  executeWorkflowTaxonomyStatus();
//  executeWorkflowTaxonomyComments();
//  executeWorkflowTaxonomy();

/*<& com.esarks.arm.scripts.FinalReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.FinalReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Normal final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;

  } catch (Throwable e) {
    setContext(iScript.getMasterScript());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
    restoreContext();
    setExit();

    iScript.execMethod("com.esarks.arm.logging.ExceptionRptController", "execute", new Object[]{"", iScriptFullName, lMethodSignature, "fatal", lMethodLocation, e.getMessage(), "Unhandled exception.", "Review this exception to determine proper handling."});

    System.out.println("ExceptionRptController called..." + e.getMessage());

    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
    lExceptionServiceJeo.addJeo(lExceptionJeo);
    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
    lExceptionJeo.setTime(lExceptionTimestamp);
    lExceptionJeo.setModule(iScriptFullName);
    lExceptionJeo.setMethod(lMethodSignature);
    lExceptionJeo.setSeverity("unknown");
    lExceptionJeo.setLocation(lMethodLocation);
    lExceptionJeo.setDescription(e.getMessage());
    lExceptionJeo.setAction("unknown");
    lExceptionJeo.setResolution("unknown");

    StackTraceElement[] lStackTraceElements = e.getStackTrace();
    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
      lExceptionJeo.addJeo(lStackExceptionJeo);
    }

    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception_" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});

    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    if (iMicLog.test(Log._ERR)) {
      iMicLog.println(Log._ERR, "ERR-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!" + e.getMessage());
    }
    return;
  }
  }
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */

////////////////////////////////////////////////////////////////////////////////////////////////
/// executeExtractComments
////////////////////////////////////////////////////////////////////////////////////////////////

/*<& com.esarks.arm.scripts.Method
   <method name="executeExtractComments" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void executeExtractComments() {
  String lMethodSignature = "executeExtractComments()";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method");
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~%>executeExtractComments v20191013a
{
//ScriptWriter~~~
iOutputManager.println("executeExtractComments v20191013a", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  String lCdata = "<" + "!" + "[CDATA[";
  String lLine;
  boolean lPrint = false;
  String lLastTag="";

//ScriptWriter~~//  iOutputManager.openOutputFile(<![$jac:path:scripts]!> + path("ehrm.WorkflowTaxonomy.WorkflowtaxonomyComments") + ".xml", false);
//  iOutputManager.openOutputFile(iSymbolTable.translateProperties("[$jac:path:scripts]") + path("ehrm.WorkflowTaxonomy.WorkflowtaxonomyComments") + ".xml", false);


//ScriptWriter~~  <!business:wfDiagramsList:wfd!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).resetIterator();
//ScriptWriter~~  while (<!business:wfDiagramsList:wfd!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).next()) {

//ScriptWriter~~    String lFileName = <![business:wfExports:folder]!> + "\\" + <![business:wfExports:[business:wfDiagramsList:wfd:id]:file]!>;
    String lFileName = iSymbolTable.translateProperties("[business:wfExports:folder]") + "\\" + iSymbolTable.translateProperties("[business:wfExports:[business:wfDiagramsList:wfd:id]:file]");
    File lFile = new File(lFileName);
    FileReader lFr = new FileReader(lFile);
    BufferedReader lBr = new BufferedReader(lFr);
    Boolean lComments = false;
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lFileName!>
iOutputManager.println("" + lFileName + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    while((lLine = lBr.readLine()) != null){
     
      if ((lPrint == true) && (lLine.startsWith("Work Step") ||
        lLine.startsWith("System") ||
        lLine.startsWith("Decision") ||
        lLine.startsWith("Start/Stop") ||
        lLine.startsWith("Off Page Reference") ||
        lLine.startsWith("Document") ||
        lLine.startsWith("Swim Lane/Role"))) {

        if (lComments) {
//ScriptWriter~~          <!report:line!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).resetIterator();
//ScriptWriter~~          while (<!report:line!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![report:line]!>
iOutputManager.println("" + iSymbolTable.translateProperties("[report:line]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        }
      }
    }
  }
    
/*<& com.esarks.arm.scripts.FinalReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.FinalReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Normal final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;

  } catch (Throwable e) {
    setContext(iScript.getMasterScript());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
    restoreContext();
    setExit();

    iScript.execMethod("com.esarks.arm.logging.ExceptionRptController", "execute", new Object[]{"", iScriptFullName, lMethodSignature, "fatal", lMethodLocation, e.getMessage(), "Unhandled exception.", "Review this exception to determine proper handling."});

    System.out.println("ExceptionRptController called..." + e.getMessage());

    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
    lExceptionServiceJeo.addJeo(lExceptionJeo);
    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
    lExceptionJeo.setTime(lExceptionTimestamp);
    lExceptionJeo.setModule(iScriptFullName);
    lExceptionJeo.setMethod(lMethodSignature);
    lExceptionJeo.setSeverity("unknown");
    lExceptionJeo.setLocation(lMethodLocation);
    lExceptionJeo.setDescription(e.getMessage());
    lExceptionJeo.setAction("unknown");
    lExceptionJeo.setResolution("unknown");

    StackTraceElement[] lStackTraceElements = e.getStackTrace();
    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
      lExceptionJeo.addJeo(lStackExceptionJeo);
    }

    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception_" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});

    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    if (iMicLog.test(Log._ERR)) {
      iMicLog.println(Log._ERR, "ERR-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!" + e.getMessage());
    }
    return;
  }
  }
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */

/*<& com.esarks.arm.scripts.Method
   <method name="executeExtractComments2" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void executeExtractComments2() {
  String lMethodSignature = "executeExtractComments2()";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method");
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~%>EHRM Hello World! v20191013a
{
//ScriptWriter~~~
iOutputManager.println("EHRM Hello World! v20191013a", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  String cdata = "<" + "!" + "[CDATA[";
  String line;
  boolean lPrint = false;
  String lLastTag="";

//ScriptWriter~~  iOutputManager.openOutputFile(<![$jac:path:scripts]!> + path("ehrm.WorkflowTaxonomy.WorkflowtaxonomyComments") + ".xml", false);
  iOutputManager.openOutputFile(iSymbolTable.translateProperties("[$jac:path:scripts]") + path("ehrm.WorkflowTaxonomy.WorkflowtaxonomyComments") + ".xml", false);

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<comments>
iOutputManager.println("<comments>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!business:pdfs:pdf!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:pdfs:pdf")).resetIterator();
//ScriptWriter~~  while (<!business:pdfs:pdf!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:pdfs:pdf")).next()) {

try {

//ScriptWriter~~String fileName = <![business:pdfs:folder]!> + "\\" + <![business:pdfs:pdf:name]!>;
String fileName = iSymbolTable.translateProperties("[business:pdfs:folder]") + "\\" + iSymbolTable.translateProperties("[business:pdfs:pdf:name]");
File file = new File(fileName);
FileReader fr = new FileReader(file);
BufferedReader br = new BufferedReader(fr);

if (lLastTag != "") {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~</<!%lLastTag!>>
iOutputManager.println("</" + lLastTag + ">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

}

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<<![business:pdfs:pdf:id]!>>
iOutputManager.println("<" + iSymbolTable.translateProperties("[business:pdfs:pdf:id]") + ">", true);
//ScriptWriter~~<%  
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
  

//ScriptWriter~~lLastTag = <![business:pdfs:pdf:id]!>;
lLastTag = iSymbolTable.translateProperties("[business:pdfs:pdf:id]");
while((line = br.readLine()) != null){

  if (line.startsWith("Comments:") && lPrint == false) {
    lPrint = true;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<comment><!%cdata!><%
iOutputManager.println("<comment>" + cdata + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }

  if ((lPrint == true) && (line.startsWith("Work Step") ||
      line.startsWith("System") ||
      line.startsWith("Decision") ||
      line.startsWith("Start/Stop") ||
      line.startsWith("Off Page Reference") ||
      line.startsWith("Document") ||
      line.startsWith("© Cerner Corporation.") ||
      line.startsWith("Swim Lane/Role"))) {
      
      lPrint = false;

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~]]></comment>
iOutputManager.println("]]></comment>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }

  if (lPrint) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%line!>
iOutputManager.println("" + line + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
   
}

} catch (IOException lException) 
{
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lException!>
iOutputManager.println("" + lException + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

}

}

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~]]>
iOutputManager.println("]]>", true);
//ScriptWriter~~</<!%lLastTag!>>
iOutputManager.println("</" + lLastTag + ">", true);
//ScriptWriter~~</comments>
iOutputManager.println("</comments>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  iOutputManager.closeOutputFile();
    
/*<& com.esarks.arm.scripts.FinalReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.FinalReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Normal final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;

  } catch (Throwable e) {
    setContext(iScript.getMasterScript());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
    restoreContext();
    setExit();

    iScript.execMethod("com.esarks.arm.logging.ExceptionRptController", "execute", new Object[]{"", iScriptFullName, lMethodSignature, "fatal", lMethodLocation, e.getMessage(), "Unhandled exception.", "Review this exception to determine proper handling."});

    System.out.println("ExceptionRptController called..." + e.getMessage());

    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
    lExceptionServiceJeo.addJeo(lExceptionJeo);
    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
    lExceptionJeo.setTime(lExceptionTimestamp);
    lExceptionJeo.setModule(iScriptFullName);
    lExceptionJeo.setMethod(lMethodSignature);
    lExceptionJeo.setSeverity("unknown");
    lExceptionJeo.setLocation(lMethodLocation);
    lExceptionJeo.setDescription(e.getMessage());
    lExceptionJeo.setAction("unknown");
    lExceptionJeo.setResolution("unknown");

    StackTraceElement[] lStackTraceElements = e.getStackTrace();
    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
      lExceptionJeo.addJeo(lStackExceptionJeo);
    }

    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception_" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});

    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    if (iMicLog.test(Log._ERR)) {
      iMicLog.println(Log._ERR, "ERR-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!" + e.getMessage());
    }
    return;
  }
  }
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */


/*<& com.esarks.arm.scripts.Method
   <method name="executeWorkflowTaxonomyStatus" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void executeWorkflowTaxonomyStatus() {
  String lMethodSignature = "executeWorkflowTaxonomyStatus()";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method");
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~%>EHRM Hello World! v20190816a
{
//ScriptWriter~~~
iOutputManager.println("EHRM Hello World! v20190816a", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  iOutputManager.openOutputFile("C:\\GitHub\\ArchitectsCompanion\\jac2020\\app\\ehrm\\WorkflowTaxonomy\\WorkflowTaxonomyStatus.csv", false);

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Flow ID,Flow Name,Status,Council,"DCW<!%Character.toString((char) 10)!>Required   ","DCW<!%Character.toString((char) 10)!>Completed   ","DDM<!%Character.toString((char) 10)!>Required   ","DDM<!%Character.toString((char) 10)!>Completed   ","Build in 81930<!%Character.toString((char) 10)!>Completed   ",,,,heading
iOutputManager.println("Flow ID,Flow Name,Status,Council,\"DCW" + Character.toString((char) 10) + "Required   \",\"DCW" + Character.toString((char) 10) + "Completed   \",\"DDM" + Character.toString((char) 10) + "Required   \",\"DDM" + Character.toString((char) 10) + "Completed   \",\"Build in 81930" + Character.toString((char) 10) + "Completed   \",,,,heading", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!business!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business")).resetIterator();
//ScriptWriter~~  while (<!business!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business")).next()) {

//ScriptWriter~~    <!business:wfreport:wf!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfreport:wf")).resetIterator();
//ScriptWriter~~    while (<!business:wfreport:wf!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfreport:wf")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:wfreport:wf:name]!>,<![business:wfds:[business:wfreport:wf:name]:description]!>,<![business:states:[business:wfreport:wf:name]:status]!>,<![business:states:[business:wfreport:wf:name]:council]!>,<![business:states:[business:wfreport:wf:name]:dcwRqd]!>,<![business:states:[business:wfreport:wf:name]:dcwCmp]!>,<![business:states:[business:wfreport:wf:name]:ddmRqd]!>,<![business:states:[business:wfreport:wf:name]:ddmCmp]!>,<![business:states:[business:wfreport:wf:name]:build]!>,,,,flow
iOutputManager.println("" + iSymbolTable.translateProperties("[business:wfreport:wf:name]") + "," + iSymbolTable.translateProperties("[business:wfds:[business:wfreport:wf:name]:description]") + "," + iSymbolTable.translateProperties("[business:states:[business:wfreport:wf:name]:status]") + "," + iSymbolTable.translateProperties("[business:states:[business:wfreport:wf:name]:council]") + "," + iSymbolTable.translateProperties("[business:states:[business:wfreport:wf:name]:dcwRqd]") + "," + iSymbolTable.translateProperties("[business:states:[business:wfreport:wf:name]:dcwCmp]") + "," + iSymbolTable.translateProperties("[business:states:[business:wfreport:wf:name]:ddmRqd]") + "," + iSymbolTable.translateProperties("[business:states:[business:wfreport:wf:name]:ddmCmp]") + "," + iSymbolTable.translateProperties("[business:states:[business:wfreport:wf:name]:build]") + ",,,,flow", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      <!business:wfreport:wf:subflow!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfreport:wf:subflow")).resetIterator();
//ScriptWriter~~      while (<!business:wfreport:wf:subflow!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfreport:wf:subflow")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:wfreport:wf:subflow:name]!>,<![business:wfds:[business:wfreport:wf:subflow:name]:description]!>,,,,,,,,,,,subFlow
iOutputManager.println("" + iSymbolTable.translateProperties("[business:wfreport:wf:subflow:name]") + "," + iSymbolTable.translateProperties("[business:wfds:[business:wfreport:wf:subflow:name]:description]") + ",,,,,,,,,,,subFlow", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }

    }
  }

  iOutputManager.closeOutputFile();

/*<& com.esarks.arm.scripts.FinalReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.FinalReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Normal final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;

  } catch (Throwable e) {
    setContext(iScript.getMasterScript());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
    restoreContext();
    setExit();

    iScript.execMethod("com.esarks.arm.logging.ExceptionRptController", "execute", new Object[]{"", iScriptFullName, lMethodSignature, "fatal", lMethodLocation, e.getMessage(), "Unhandled exception.", "Review this exception to determine proper handling."});

    System.out.println("ExceptionRptController called..." + e.getMessage());

    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
    lExceptionServiceJeo.addJeo(lExceptionJeo);
    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
    lExceptionJeo.setTime(lExceptionTimestamp);
    lExceptionJeo.setModule(iScriptFullName);
    lExceptionJeo.setMethod(lMethodSignature);
    lExceptionJeo.setSeverity("unknown");
    lExceptionJeo.setLocation(lMethodLocation);
    lExceptionJeo.setDescription(e.getMessage());
    lExceptionJeo.setAction("unknown");
    lExceptionJeo.setResolution("unknown");

    StackTraceElement[] lStackTraceElements = e.getStackTrace();
    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
      lExceptionJeo.addJeo(lStackExceptionJeo);
    }

    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception_" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});

    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    if (iMicLog.test(Log._ERR)) {
      iMicLog.println(Log._ERR, "ERR-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!" + e.getMessage());
    }
    return;
  }
  }
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */

/*<& com.esarks.arm.scripts.Method
   <method name="executeWorkflowTaxonomyComments" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void executeWorkflowTaxonomyComments() {
  String lMethodSignature = "executeWorkflowTaxonomyComments()";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method");
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~%>EHRM Hello World! v20190816a
{
//ScriptWriter~~~
iOutputManager.println("EHRM Hello World! v20190816a", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  iOutputManager.openOutputFile("C:\\GitHub\\ArchitectsCompanion\\jac2020\\app\\ehrm\\WorkflowTaxonomy\\WorkflowTaxonomyComments.csv", false);

//ScriptWriter~~  <!business!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business")).resetIterator();
//ScriptWriter~~  while (<!business!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business")).next()) {

//ScriptWriter~~    <!business:wfreport:wf!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfreport:wf")).resetIterator();
//ScriptWriter~~    while (<!business:wfreport:wf!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfreport:wf")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:wfreport:wf:name]!>,<![business:wfds:[business:wfreport:wf:name]:description]!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:wfreport:wf:name]") + "," + iSymbolTable.translateProperties("[business:wfds:[business:wfreport:wf:name]:description]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      <!business:comments:[business:wfreport:wf:name]:comment!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:comments:[business:wfreport:wf:name]:comment")).resetIterator();
//ScriptWriter~~      while (<!business:comments:[business:wfreport:wf:name]:comment!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:comments:[business:wfreport:wf:name]:comment")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~,"<![business:comments:[business:wfreport:wf:name]:comment]!>"
iOutputManager.println(",\"" + iSymbolTable.translateProperties("[business:comments:[business:wfreport:wf:name]:comment]") + "\"", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      }
    }
  }

  iOutputManager.closeOutputFile();

/*<& com.esarks.arm.scripts.FinalReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.FinalReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Normal final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;

  } catch (Throwable e) {
    setContext(iScript.getMasterScript());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
    restoreContext();
    setExit();

    iScript.execMethod("com.esarks.arm.logging.ExceptionRptController", "execute", new Object[]{"", iScriptFullName, lMethodSignature, "fatal", lMethodLocation, e.getMessage(), "Unhandled exception.", "Review this exception to determine proper handling."});

    System.out.println("ExceptionRptController called..." + e.getMessage());

    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
    lExceptionServiceJeo.addJeo(lExceptionJeo);
    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
    lExceptionJeo.setTime(lExceptionTimestamp);
    lExceptionJeo.setModule(iScriptFullName);
    lExceptionJeo.setMethod(lMethodSignature);
    lExceptionJeo.setSeverity("unknown");
    lExceptionJeo.setLocation(lMethodLocation);
    lExceptionJeo.setDescription(e.getMessage());
    lExceptionJeo.setAction("unknown");
    lExceptionJeo.setResolution("unknown");

    StackTraceElement[] lStackTraceElements = e.getStackTrace();
    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
      lExceptionJeo.addJeo(lStackExceptionJeo);
    }

    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception_" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});

    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    if (iMicLog.test(Log._ERR)) {
      iMicLog.println(Log._ERR, "ERR-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!" + e.getMessage());
    }
    return;
  }
  }
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */

/*<& com.esarks.arm.scripts.Method
   <method name="executeWorkflowTaxonomy" visibility="public" return="void" >
     <document></document>
   </method>
&>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.Method
/**
 * 
 */
  public void executeWorkflowTaxonomy() {
  String lMethodSignature = "executeWorkflowTaxonomy()";
  String lMethodLocation = "";
  java.util.Date lMethodStartDate = null;
  java.util.Date lMethodStopDate = null;
  if (iMicLog.test(Log._APP)) {
    lMethodStartDate = new java.util.Date();
    iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Enter method");
  }
  try {  resetExit();
// End: com.esarks.arm.scripts.Method
/* *** GENERATED SECTION *** End of embedded XML expansion */

//ScriptWriter~~%>EHRM Hello World! v20190816a
{
//ScriptWriter~~~
iOutputManager.println("EHRM Hello World! v20190816a", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  iOutputManager.openOutputFile("C:\\GitHub\\ArchitectsCompanion\\jac2020\\app\\ehrm\\WorkflowTaxonomy\\WorkflowTaxonomy.csv", false);

  int lRow = 0;
  Integer lWorkflow = 0;
  Boolean lIncludeDetail = true;
  
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~,,,,,,Wf Designer,Interfaces
iOutputManager.println(",,,,,,Wf Designer,Interfaces", true);
//ScriptWriter~~<%    
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
    
//ScriptWriter~~  <!business!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business")).resetIterator();
//ScriptWriter~~  while (<!business!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business")).next()) {

//ScriptWriter~~    <!business:major!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major")).resetIterator();
//ScriptWriter~~    while (<!business:major!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major")).next()) {
    lRow++;
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,,,,,,,,,group,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + ",,,,,,,,,group," + lRow + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      <!business:major:workflow!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow")).resetIterator();

//ScriptWriter~~      while (<!business:major:workflow!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow")).next()) {
//ScriptWriter~~        int lWorkflowSize = <!business:major:workflow:wfdesigner!>!size();
        int lWorkflowSize = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:wfdesigner")).size();
//ScriptWriter~~        int lProdSize = <!business:major:workflow:product!>!size();
        int lProdSize = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:product")).size();
//ScriptWriter~~        int lInterfaceSize = <!business:major:workflow:interface!>!size();
        int lInterfaceSize = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:interface")).size();
        lRow++;
        lWorkflow++;

 
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,<![business:major:workflow:name]!>,#<!%lWorkflow!>: # Wf Designer = <!%lWorkflowSize!> Page = <![business:major:workflow:page]!>,,,,<![business:major:workflow:date1]!>,<![business:major:workflow:date2]!>,,workflow,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + "," + iSymbolTable.translateProperties("[business:major:workflow:name]") + ",#" + lWorkflow + ": # Wf Designer = " + lWorkflowSize + " Page = " + iSymbolTable.translateProperties("[business:major:workflow:page]") + ",,,," + iSymbolTable.translateProperties("[business:major:workflow:date1]") + "," + iSymbolTable.translateProperties("[business:major:workflow:date2]") + ",,workflow," + lRow + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~        <!business:major:workflow:wfdesigner!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:wfdesigner")).resetIterator();
//ScriptWriter~~        while (<!business:major:workflow:wfdesigner!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:wfdesigner")).next()) {
          lRow++;
//ScriptWriter~~          String lWfd = <![business:wfds:[business:major:workflow:wfdesigner:name]:description]!>;
          String lWfd = iSymbolTable.translateProperties("[business:wfds:[business:major:workflow:wfdesigner:name]:description]");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,,Wf Designer = <!%lWfd!>,Reviewed = <![business:wfds:[business:major:workflow:wfdesigner:name]:reviewed]!>,Phase = <![business:phases:[business:wfds:[business:major:workflow:wfdesigner:name]:phase]:description]!>,,,,,wfdesigner,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + ",,Wf Designer = " + lWfd + ",Reviewed = " + iSymbolTable.translateProperties("[business:wfds:[business:major:workflow:wfdesigner:name]:reviewed]") + ",Phase = " + iSymbolTable.translateProperties("[business:phases:[business:wfds:[business:major:workflow:wfdesigner:name]:phase]:description]") + ",,,,,wfdesigner," + lRow + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~          <!business:wfds:[business:major:workflow:wfdesigner:name]:product!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfds:[business:major:workflow:wfdesigner:name]:product")).resetIterator();
//ScriptWriter~~          while (<!business:wfds:[business:major:workflow:wfdesigner:name]:product!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfds:[business:major:workflow:wfdesigner:name]:product")).next()) {
            lRow++;
/*
//ScriptWriter~~<![business:major:name]!>,,Product = <![business:products:[business:wfds:[business:major:workflow:wfdesigner:name]:product:name]:description]!> : <![business:wfds:[business:major:workflow:wfdesigner:name]:product:description]!>,Reviewed = <![business:major:workflow:product:reviewed]!>,Phase = <![business:phases:[business:major:workflow:product:phase]:description]!>,,,,,product,<!%lRow!>
iSymbolTable.translateProperties("[business:major:name]"),,Product = iSymbolTable.translateProperties("[business:products:[business:wfds:[business:major:workflow:wfdesigner:name]:product:name]:description]") : iSymbolTable.translateProperties("[business:wfds:[business:major:workflow:wfdesigner:name]:product:description]"),Reviewed = iSymbolTable.translateProperties("[business:major:workflow:product:reviewed]"),Phase = iSymbolTable.translateProperties("[business:phases:[business:major:workflow:product:phase]:description]"),,,,,product,iSymbolTable.translateProperties(lRow)
*/
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,,Product = <![business:products:[business:wfds:[business:major:workflow:wfdesigner:name]:product:name]:description]!> : <![business:wfds:[business:major:workflow:wfdesigner:name]:product:description]!>,,,,,,,product,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + ",,Product = " + iSymbolTable.translateProperties("[business:products:[business:wfds:[business:major:workflow:wfdesigner:name]:product:name]:description]") + " : " + iSymbolTable.translateProperties("[business:wfds:[business:major:workflow:wfdesigner:name]:product:description]") + ",,,,,,,product," + lRow + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }


//ScriptWriter~~          <!business:wfds:[business:major:workflow:wfdesigner:name]:interface!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfds:[business:major:workflow:wfdesigner:name]:interface")).resetIterator();
//ScriptWriter~~          while (<!business:wfds:[business:major:workflow:wfdesigner:name]:interface!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfds:[business:major:workflow:wfdesigner:name]:interface")).next()) {
            lRow++;
/*
//ScriptWriter~~<![business:major:name]!>,,Interface = <![business:interfaces:[business:wfds:[business:major:workflow:wfdesigner:name]:interface:name]:description]!> : <![business:wfds:[business:major:workflow:wfdesigner:name]:interface:description]!>,Reviewed = <![business:major:workflow:interface:reviewed]!>,Phase = <![business:phases:[business:major:workflow:interface:phase]:description]!>,,,,,interface,<!%lRow!>
iSymbolTable.translateProperties("[business:major:name]"),,Interface = iSymbolTable.translateProperties("[business:interfaces:[business:wfds:[business:major:workflow:wfdesigner:name]:interface:name]:description]") : iSymbolTable.translateProperties("[business:wfds:[business:major:workflow:wfdesigner:name]:interface:description]"),Reviewed = iSymbolTable.translateProperties("[business:major:workflow:interface:reviewed]"),Phase = iSymbolTable.translateProperties("[business:phases:[business:major:workflow:interface:phase]:description]"),,,,,interface,iSymbolTable.translateProperties(lRow)
*/
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,,Interface = <![business:interfaces:[business:wfds:[business:major:workflow:wfdesigner:name]:interface:name]:description]!> : <![business:wfds:[business:major:workflow:wfdesigner:name]:interface:description]!>,,,,,,,interface,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + ",,Interface = " + iSymbolTable.translateProperties("[business:interfaces:[business:wfds:[business:major:workflow:wfdesigner:name]:interface:name]:description]") + " : " + iSymbolTable.translateProperties("[business:wfds:[business:major:workflow:wfdesigner:name]:interface:description]") + ",,,,,,,interface," + lRow + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }

        }

//ScriptWriter~~        <!business:major:workflow:product!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:product")).resetIterator();
//ScriptWriter~~        while (<!business:major:workflow:product!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:product")).next()) {
          lRow++;
//ScriptWriter~~          String lProduct = <![business:products:[business:major:workflow:product:name]:description]!> + " <" + <![business:products:[business:major:workflow:product:name]:owner]!> + ">";
          String lProduct = iSymbolTable.translateProperties("[business:products:[business:major:workflow:product:name]:description]") + " <" + iSymbolTable.translateProperties("[business:products:[business:major:workflow:product:name]:owner]") + ">";

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,,Product = <!%lProduct!>,Reviewed = <![business:major:workflow:product:reviewed]!>,Phase = <![business:phases:[business:major:workflow:product:phase]:description]!>,,,,,product,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + ",,Product = " + lProduct + ",Reviewed = " + iSymbolTable.translateProperties("[business:major:workflow:product:reviewed]") + ",Phase = " + iSymbolTable.translateProperties("[business:phases:[business:major:workflow:product:phase]:description]") + ",,,,,product," + lRow + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


        }

//ScriptWriter~~        <!business:major:workflow:interface!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:interface")).resetIterator();
//ScriptWriter~~        while (<!business:major:workflow:interface!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:interface")).next()) {
          lRow++;
//ScriptWriter~~          String lInterface = <![business:interfaces:[business:major:workflow:interface:name]:description]!>;
          String lInterface = iSymbolTable.translateProperties("[business:interfaces:[business:major:workflow:interface:name]:description]");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,,Interface = <!%lInterface!>,Reviewed = <![business:major:workflow:interface:reviewed]!>,Phase = <![business:phases:[business:major:workflow:interface:phase]:description]!>,,,,,interface,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + ",,Interface = " + lInterface + ",Reviewed = " + iSymbolTable.translateProperties("[business:major:workflow:interface:reviewed]") + ",Phase = " + iSymbolTable.translateProperties("[business:phases:[business:major:workflow:interface:phase]:description]") + ",,,,,interface," + lRow + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }

      }

    }

  }

  iOutputManager.closeOutputFile();

/*<& com.esarks.arm.scripts.FinalReturnMethod &>*/
/* *** GENERATED SECTION *** Beginning of embedded XML expansion */
// Begin: com.esarks.arm.scripts.FinalReturnMethod
    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Normal final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    return;

  } catch (Throwable e) {
    setContext(iScript.getMasterScript());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event")).set(e.getMessage());
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:severity")).set("fatal");
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptPackage")).set(iScriptPackage);
    iPropertyHelper.setPropertyName(iSymbolTable.translateProperties("$jac:event:scriptName")).set(iScriptName);
    restoreContext();
    setExit();

    iScript.execMethod("com.esarks.arm.logging.ExceptionRptController", "execute", new Object[]{"", iScriptFullName, lMethodSignature, "fatal", lMethodLocation, e.getMessage(), "Unhandled exception.", "Review this exception to determine proper handling."});

    System.out.println("ExceptionRptController called..." + e.getMessage());

    com.esarks.arm.model.jeo.ServiceJeo lExceptionServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
    com.esarks.arm.logging.ExceptionJeo lExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("detail");
    lExceptionServiceJeo.addJeo(lExceptionJeo);
    java.sql.Timestamp lExceptionTimestamp = new java.sql.Timestamp(new java.util.Date().getTime());
    lExceptionJeo.setTime(lExceptionTimestamp);
    lExceptionJeo.setModule(iScriptFullName);
    lExceptionJeo.setMethod(lMethodSignature);
    lExceptionJeo.setSeverity("unknown");
    lExceptionJeo.setLocation(lMethodLocation);
    lExceptionJeo.setDescription(e.getMessage());
    lExceptionJeo.setAction("unknown");
    lExceptionJeo.setResolution("unknown");

    StackTraceElement[] lStackTraceElements = e.getStackTrace();
    for (int lTraceIdx=0; lTraceIdx < lStackTraceElements.length; lTraceIdx++) {
      com.esarks.arm.logging.ExceptionJeo lStackExceptionJeo = new com.esarks.arm.logging.ExceptionJeo("trace");
      lStackExceptionJeo.setDescription(lStackTraceElements[lTraceIdx].toString());
      lExceptionJeo.addJeo(lStackExceptionJeo);
    }

    iScript.execMethod("com.esarks.arm.logging.ExceptionRpt", "render", new Object[]{"logs.Exception_" + Long.toString(new java.util.Date().getTime()), lExceptionServiceJeo});

    if (iMicLog.test(Log._APP)) {
      lMethodStopDate = new java.util.Date();
      iMicLog.println(Log._APP, "APP-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!Elapsed time = " + Long.toString(lMethodStopDate.getTime() - lMethodStartDate.getTime()));
    }
    if (iMicLog.test(Log._ERR)) {
      iMicLog.println(Log._ERR, "ERR-" + iScriptFullName + ":" + lMethodSignature + "!Error final exit method!" + e.getMessage());
    }
    return;
  }
  }
// End: com.esarks.arm.scripts.FinalReturnMethod
/* *** GENERATED SECTION *** End of embedded XML expansion */

}
