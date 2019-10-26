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

public void execute() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![$jac:path:scripts]!><!%path("ehrm.WorkflowTaxonomy.Workflowtaxonomy")!><!%".xml"!>
iOutputManager.println("" + iSymbolTable.translateProperties("[$jac:path:scripts]") + "" + path("ehrm.WorkflowTaxonomy.Workflowtaxonomy") + "" + ".xml" + "", true);
//ScriptWriter~~<![$jac:path:scripts]!><!%path("ehrm.WorkflowTaxonomy.WorkflowtaxonomyComments")!><!%".xml"!>
iOutputManager.println("" + iSymbolTable.translateProperties("[$jac:path:scripts]") + "" + path("ehrm.WorkflowTaxonomy.WorkflowtaxonomyComments") + "" + ".xml" + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  iSymbolTable.parseXml(<![$jac:path:scripts]!> + path("ehrm.WorkflowTaxonomy.Workflowtaxonomy") + ".xml");
  iSymbolTable.parseXml(iSymbolTable.translateProperties("[$jac:path:scripts]") + path("ehrm.WorkflowTaxonomy.Workflowtaxonomy") + ".xml");
//ScriptWriter~~  iSymbolTable.parseXml(<![$jac:path:scripts]!> + path("ehrm.WorkflowTaxonomy.WorkflowtaxonomyComments") + ".xml");
  iSymbolTable.parseXml(iSymbolTable.translateProperties("[$jac:path:scripts]") + path("ehrm.WorkflowTaxonomy.WorkflowtaxonomyComments") + ".xml");

//ScriptWriter~~  <!business:wfDiagramsList:wfd!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).resetIterator();
//ScriptWriter~~  while (<!business:wfDiagramsList:wfd!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~*** <![business:wfDiagramsList:wfd:id]!> *** <![business:wfDiagramsList:wfd:name]!>
iOutputManager.println("*** " + iSymbolTable.translateProperties("[business:wfDiagramsList:wfd:id]") + " *** " + iSymbolTable.translateProperties("[business:wfDiagramsList:wfd:name]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }
  
//  executeExtractComments();
//  executeWorkflowTaxonomyComments();
  executeWorkflowTaxonomyStatus();
//  executeWorkflowTaxonomyProducts();
//  executeWorkflowTaxonomy();

}
////////////////////////////////////////////////////////////////////////////////////////////////
/// executeExtractComments
////////////////////////////////////////////////////////////////////////////////////////////////

public void executeExtractComments() {

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
  String lLine = "";
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

  try {

//ScriptWriter~~    <!business:wfDiagramsList:wfd!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).resetIterator();
//ScriptWriter~~    while (<!business:wfDiagramsList:wfd!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).next()) {

//ScriptWriter~~      String lFileName = <![business:pdfs:folder]!> + "\\" + <![business:pdfs:[business:wfDiagramsList:wfd:id]:name]!>;
      String lFileName = iSymbolTable.translateProperties("[business:pdfs:folder]") + "\\" + iSymbolTable.translateProperties("[business:pdfs:[business:wfDiagramsList:wfd:id]:name]");
      File lFile = new File(lFileName);
      FileReader lFr = new FileReader(lFile);
      BufferedReader lBr = new BufferedReader(lFr);
      Boolean lComments = false;
//ScriptWriter~~      <!report!>!remove();    
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report")).remove();    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<<![business:wfDiagramsList:wfd:id]!> name="<![business:pdfs:[business:wfDiagramsList:wfd:id]:name]!>">
iOutputManager.println("<" + iSymbolTable.translateProperties("[business:wfDiagramsList:wfd:id]") + " name=\"" + iSymbolTable.translateProperties("[business:pdfs:[business:wfDiagramsList:wfd:id]:name]") + "\">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      while((lLine = lBr.readLine()) != null){

        if (lLine.startsWith("Future State:")) continue; 
        if (lLine.startsWith("Cerner Workflow ID")) continue;
        if (lLine.trim().length() == 0) continue;
        
        lLine = lLine.replace("\"", "'");              
        if ( lLine.startsWith("Comments:")) {
          lComments = true;
//ScriptWriter~~          <!report:line!>!set("\n");
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).set("\n");
//ScriptWriter~~          <!report:line!>!set(lLine);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).set(lLine);
          continue;
        } //if ( lLine.startsWith("Comments:"))

        if ( lLine.startsWith("©")) {
          lLine = lBr.readLine();
          lLine = lBr.readLine();
          lLine = lBr.readLine();
          lLine = lBr.readLine();
          lLine = lBr.readLine();
          lLine = lBr.readLine();
          continue;
        }

        if ( (!lComments) && (lLine.startsWith("Work Step") ||
             lLine.startsWith("System") ||
             lLine.startsWith("Decision") ||
             lLine.startsWith("Start/Stop") ||
             lLine.startsWith("Off Page Reference") ||
             lLine.startsWith("Document") ||
             lLine.startsWith("Swim Lane/Role"))) {
             
//ScriptWriter~~             <!report:line!>!reset(lLine);
             iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).reset(lLine);
             continue;
         } //if ( (!lComments) && (lLine.startsWith("Work Step") ||

        if ( (lComments) && (lLine.startsWith("Work Step") ||
             lLine.startsWith("System") ||
             lLine.startsWith("Decision") ||
             lLine.startsWith("Start/Stop") ||
             lLine.startsWith("Off Page Reference") ||
             lLine.startsWith("Document") ||
             lLine.startsWith("Swim Lane/Role"))) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<comment><!%lCdata!><%             
iOutputManager.println("<comment>" + lCdata + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
             
//ScriptWriter~~            <!report:line!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).resetIterator();
//ScriptWriter~~            while (<!report:line!>!next()) {
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

//ScriptWriter~~            } //while (<!report:line!>!next())
            } //while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).next())
//ScriptWriter~~%>]]></comment>
{
//ScriptWriter~~~
iOutputManager.println("]]></comment>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


             lComments = false;
//ScriptWriter~~             <!report:line!>!reset(lLine);
             iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).reset(lLine);
             continue;
         } //if ( (lComments) && (lLine.startsWith("Work Step") ||

//ScriptWriter~~        <!report:line!>!set(lLine);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).set(lLine);
        
      } //while((lLine = lBr.readLine()) != null)

      if (lComments) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<comment><!%lCdata!><%             
iOutputManager.println("<comment>" + lCdata + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
             
//ScriptWriter~~            <!report:line!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).resetIterator();
//ScriptWriter~~            while (<!report:line!>!next()) {
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

//ScriptWriter~~            } //while (<!report:line!>!next())
            } //while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("report:line")).next())
//ScriptWriter~~%>]]></comment>
{
//ScriptWriter~~~
iOutputManager.println("]]></comment>", true);
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
//ScriptWriter~~</<![business:wfDiagramsList:wfd:id]!>>
iOutputManager.println("</" + iSymbolTable.translateProperties("[business:wfDiagramsList:wfd:id]") + ">", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    } // While
  } catch (IOException lException) {
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

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~</comments>
iOutputManager.println("</comments>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  iOutputManager.closeOutputFile();

}    

////////////////////////////////////////////////////////////////////////////////////////////////
/// executeWorkflowTaxonomyStatus
////////////////////////////////////////////////////////////////////////////////////////////////

public void executeWorkflowTaxonomyStatus() {

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


//ScriptWriter~~  <!business:wfDiagramsList:wfd!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).resetIterator();
//ScriptWriter~~  while (<!business:wfDiagramsList:wfd!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).next()) {


//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:wfDiagramsList:wfd:id]!>,<![business:wfDiagramNames:[business:wfDiagramsList:wfd:id]:name]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:status]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:council]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:dcwRqd]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:dcwCmp]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:ddmRqd]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:ddmCmp]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:build]!>,,,,flow
iOutputManager.println("" + iSymbolTable.translateProperties("[business:wfDiagramsList:wfd:id]") + "," + iSymbolTable.translateProperties("[business:wfDiagramNames:[business:wfDiagramsList:wfd:id]:name]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:status]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:council]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:dcwRqd]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:dcwCmp]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:ddmRqd]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:ddmCmp]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:build]") + ",,,,flow", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow")).resetIterator();
//ScriptWriter~~    while (<!business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow!>!next()) {     
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow")).next()) {     
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow:id]!>,<![business:wfDiagramNames:[business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow:id]:name]!>,,,,,,,,,,,subFlow
iOutputManager.println("" + iSymbolTable.translateProperties("[business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow:id]") + "," + iSymbolTable.translateProperties("[business:wfDiagramNames:[business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow:id]:name]") + ",,,,,,,,,,,subFlow", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
  }

  iOutputManager.closeOutputFile();

}

////////////////////////////////////////////////////////////////////////////////////////////////
/// executeWorkflowTaxonomyProducts
////////////////////////////////////////////////////////////////////////////////////////////////

public void executeWorkflowTaxonomyStatus2() {

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

//ScriptWriter~~    <!business:wfDiagramsList:wfd!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).resetIterator();
//ScriptWriter~~    while (<!business:wfDiagramsList:wfd!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:wfDiagramsList:wfd:id]!>,<![business:wfDiagramsList:wfd:name]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:status]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:council]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:dcwRqd]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:dcwCmp]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:ddmRqd]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:ddmCmp]!>,<![business:wfStates:[business:wfDiagramsList:wfd:id]:build]!>,,,,flow
iOutputManager.println("" + iSymbolTable.translateProperties("[business:wfDiagramsList:wfd:id]") + "," + iSymbolTable.translateProperties("[business:wfDiagramsList:wfd:name]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:status]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:council]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:dcwRqd]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:dcwCmp]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:ddmRqd]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:ddmCmp]") + "," + iSymbolTable.translateProperties("[business:wfStates:[business:wfDiagramsList:wfd:id]:build]") + ",,,,flow", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      <!business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow")).resetIterator();
//ScriptWriter~~      while (<!business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow!>!next()) {     
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow")).next()) {     
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow:id]!>,<![business:wfDiagramNames:[business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow:id]:name]!>,,,,,,,,,,,subFlow
iOutputManager.println("" + iSymbolTable.translateProperties("[business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow:id]") + "," + iSymbolTable.translateProperties("[business:wfDiagramNames:[business:wfSubflows:[business:wfDiagramsList:wfd:id]:subflow:id]:name]") + ",,,,,,,,,,,subFlow", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
    }
  }

  iOutputManager.closeOutputFile();

}

////////////////////////////////////////////////////////////////////////////////////////////////
/// executeWorkflowTaxonomyComments
////////////////////////////////////////////////////////////////////////////////////////////////

public void executeWorkflowTaxonomyComments() {

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

//ScriptWriter~~    <!business:wfDiagramsList:wfd!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).resetIterator();
//ScriptWriter~~    while (<!business:wfDiagramsList:wfd!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:wfDiagramsList:wfd")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:wfDiagramsList:wfd:id]!>,<![business:wfDiagramsList:wfd:name]!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:wfDiagramsList:wfd:id]") + "," + iSymbolTable.translateProperties("[business:wfDiagramsList:wfd:name]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      <!comments:[business:wfDiagramsList:wfd:id]:comment!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("comments:[business:wfDiagramsList:wfd:id]:comment")).resetIterator();
//ScriptWriter~~      while (<!comments:[business:wfDiagramsList:wfd:id]:comment!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("comments:[business:wfDiagramsList:wfd:id]:comment")).next()) {
      
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~,"<![comments:[business:wfDiagramsList:wfd:id]:comment]!>"
iOutputManager.println(",\"" + iSymbolTable.translateProperties("[comments:[business:wfDiagramsList:wfd:id]:comment]") + "\"", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      }
    }
  }

  iOutputManager.closeOutputFile();

}

////////////////////////////////////////////////////////////////////////////////////////////////
/// executeWorkflowTaxonomy
////////////////////////////////////////////////////////////////////////////////////////////////

public void executeWorkflowTaxonomy() {

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

  int lRow = 1;
  
//ScriptWriter~~  <!business:major!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major")).resetIterator();
//ScriptWriter~~  while (<!business:major!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,,,,,,,,,group,<!%lRow++!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + ",,,,,,,,,group," + lRow++ + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!business:major:workflow!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow")).resetIterator();
//ScriptWriter~~    while (<!business:major:workflow!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,<![business:major:workflow:name]!>,,,,,<![business:major:workflow:date1]!>,<![business:major:workflow:date2]!>,,workflow,<!%lRow++!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + "," + iSymbolTable.translateProperties("[business:major:workflow:name]") + ",,,,," + iSymbolTable.translateProperties("[business:major:workflow:date1]") + "," + iSymbolTable.translateProperties("[business:major:workflow:date2]") + ",,workflow," + lRow++ + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      <!business:major:workflow:wfdesigner!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:wfdesigner")).resetIterator();
//ScriptWriter~~      while (<!business:major:workflow:wfdesigner!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:wfdesigner")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,,(<![business:major:workflow:wfdesigner:name]!>) <![business:wfDiagramNames:[business:major:workflow:wfdesigner:name]:name]!>,,,,,,,wfdesigner,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + ",,(" + iSymbolTable.translateProperties("[business:major:workflow:wfdesigner:name]") + ") " + iSymbolTable.translateProperties("[business:wfDiagramNames:[business:major:workflow:wfdesigner:name]:name]") + ",,,,,,,wfdesigner," + lRow + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      } // while (<!business:major:workflow:wfdesigner!>!next())
      } // while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:wfdesigner")).next())
//ScriptWriter~~    } // while (<!business:major:workflow!>!next())
    } // while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow")).next())
//ScriptWriter~~  } // while (<!business:major!>!next())
  } // while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major")).next())

  iOutputManager.closeOutputFile();

}

}
