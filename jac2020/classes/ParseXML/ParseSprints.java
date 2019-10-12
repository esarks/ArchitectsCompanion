//ScriptWriter~~package <#[$jac:script:package]#>;
package ParseXML;

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
public class ParseSprints extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected ParseSprints() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public ParseSprints(Script aScript) {

    super(aScript);

  }

public void execute() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  iOutputManager.openOutputFile(<![mic.element:mapFile]!>, false);
  iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:mapFile]"), false);
  iOutputManager.closeOutputFile();

//ScriptWriter~~  iOutputManager.openOutputFile(<![mic.element:logFile]!>, false);
  iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:logFile]"), false);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~RTC Workitems are contained in <![mic.element:rtcFile]!>.
iOutputManager.println("RTC Workitems are contained in " + iSymbolTable.translateProperties("[mic.element:rtcFile]") + ".", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  iOutputManager.closeOutputFile();

//Number of Rows in Worksheet
  int lRow = 0;

// Establish Type translation from Excel to XSD

//ScriptWriter~~  <!Type:Boolean!>!set("boolean");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Type:Boolean")).set("boolean");
//ScriptWriter~~  <!Type:DateTime!>!set("dateTime");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Type:DateTime")).set("dateTime");
//ScriptWriter~~  <!Type:Number!>!set("integer");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Type:Number")).set("integer");
//ScriptWriter~~  <!Type:String!>!set("string");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Type:String")).set("string");

// Get the data out of the RTC data file

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~mic.element:type = <![mic.element:type]!> : mic.element:rtcFile = <![mic.element:rtcFile]!>
iOutputManager.println("mic.element:type = " + iSymbolTable.translateProperties("[mic.element:type]") + " : mic.element:rtcFile = " + iSymbolTable.translateProperties("[mic.element:rtcFile]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  iSymbolTable.parseXml(<![mic.element:rtcFile]!>);
  iSymbolTable.parseXml(iSymbolTable.translateProperties("[mic.element:rtcFile]"));

// Iterate Workbook

//ScriptWriter~~  <!Workbook!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook")).resetIterator();
//ScriptWriter~~  while (<!Workbook!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Workbook
iOutputManager.println("Workbook", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


// Iterate Worksheet
   
//ScriptWriter~~    <!Workbook:Worksheet!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet")).resetIterator();
//ScriptWriter~~    while (<!Workbook:Worksheet!>!next()) { 
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet")).next()) { 

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Worksheet <![Workbook:Worksheet:ss:Name]!>
iOutputManager.println("Worksheet " + iSymbolTable.translateProperties("[Workbook:Worksheet:ss:Name]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


// Iterate Table
  
//ScriptWriter~~      <!Workbook:Worksheet:Table!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet:Table")).resetIterator();
//ScriptWriter~~      while (<!Workbook:Worksheet:Table!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet:Table")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Table
iOutputManager.println("Table", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


// Iterate Row and keep count
              
//ScriptWriter~~        <!Workbook:Worksheet:Table:Row!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet:Table:Row")).resetIterator();
//ScriptWriter~~        while (<!Workbook:Worksheet:Table:Row!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet:Table:Row")).next()) {

//ScriptWriter~~%>.<%
{
//ScriptWriter~~~
iOutputManager.println(".", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          lRow = lRow + 1;
          if (lRow > 1) {
//ScriptWriter~~            <!Workitem!>!set("");
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem")).set("");
          }

          int lCell = 0;
                  
//ScriptWriter~~          <!Workbook:Worksheet:Table:Row:Cell!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet:Table:Row:Cell")).resetIterator();
//ScriptWriter~~          while (<!Workbook:Worksheet:Table:Row:Cell!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet:Table:Row:Cell")).next()) {

            lCell = lCell + 1;
            
            if (lRow == 1) {

//ScriptWriter~~              <!Column!>!set(lCell);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column")).set(lCell);
//ScriptWriter~~              <!Column:Heading!>!set(<![Workbook:Worksheet:Table:Row:Cell:Data]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column:Heading")).set(iSymbolTable.translateProperties("[Workbook:Worksheet:Table:Row:Cell:Data]"));
//ScriptWriter~~              <!Column:XmlHeading!>!set(<![Column:Heading]!>.replace(' ','_').replace('(','_').replace(')','_').replace('%','P'));
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column:XmlHeading")).set(iSymbolTable.translateProperties("[Column:Heading]").replace(' ','_').replace('(','_').replace(')','_').replace('%','P'));
//ScriptWriter~~              <!Column:Type!>!set("N/A");
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column:Type")).set("N/A");
//ScriptWriter~~              <!Column:XmlType!>!set("string");
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column:XmlType")).set("string");
              
            } else {

//ScriptWriter~~              if (<![Workbook:Worksheet:Table:Row:Cell:ss~Index]!>.equals("")) {
              if (iSymbolTable.translateProperties("[Workbook:Worksheet:Table:Row:Cell:ss~Index]").equals("")) {

              } else {
//ScriptWriter~~                lCell = Integer.parseInt(<![Workbook:Worksheet:Table:Row:Cell:ss~Index]!>);
                lCell = Integer.parseInt(iSymbolTable.translateProperties("[Workbook:Worksheet:Table:Row:Cell:ss~Index]"));
              }

//ScriptWriter~~              <!Workitem:Column!>!set(lCell);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Column")).set(lCell);
//ScriptWriter~~              <!Workitem:Column:Data!>!set(<![Workbook:Worksheet:Table:Row:Cell:Data]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Column:Data")).set(iSymbolTable.translateProperties("[Workbook:Worksheet:Table:Row:Cell:Data]"));
//ScriptWriter~~              <!Workitem:Column:Type!>!set(<![Workbook:Worksheet:Table:Row:Cell:Data:ss~Type]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Column:Type")).set(iSymbolTable.translateProperties("[Workbook:Worksheet:Table:Row:Cell:Data:ss~Type]"));
//ScriptWriter~~              <!Column!>!find(lCell);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column")).find(lCell);
//ScriptWriter~~              <!Column:Type!>!reset(<![Workbook:Worksheet:Table:Row:Cell:Data:ss~Type]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column:Type")).reset(iSymbolTable.translateProperties("[Workbook:Worksheet:Table:Row:Cell:Data:ss~Type]"));
//ScriptWriter~~              <!Column:XmlType!>!reset(<![Type:[Workbook:Worksheet:Table:Row:Cell:Data:ss~Type]]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column:XmlType")).reset(iSymbolTable.translateProperties("[Type:[Workbook:Worksheet:Table:Row:Cell:Data:ss~Type]]"));
//ScriptWriter~~              <!Workitem:Column:Heading!>!set(<![Column:Heading]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Column:Heading")).set(iSymbolTable.translateProperties("[Column:Heading]"));
//ScriptWriter~~              if (lCell == 1) <!Workitem:Id!>!set(<![Workbook:Worksheet:Table:Row:Cell:Data]!>);
              if (lCell == 1) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Id")).set(iSymbolTable.translateProperties("[Workbook:Worksheet:Table:Row:Cell:Data]"));
//ScriptWriter~~              <!Workitem:[Column:Heading]!>!set(<![Workbook:Worksheet:Table:Row:Cell:Data]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:[Column:Heading]")).set(iSymbolTable.translateProperties("[Workbook:Worksheet:Table:Row:Cell:Data]"));
            }
          }
        }
      }
    }
  }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~Rows processed: <!%lRow!>
iOutputManager.println("Rows processed: " + lRow + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  lRow--;

//ScriptWriter~~  iOutputManager.openOutputFile(<![mic.element:logFile]!>, true);
  iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:logFile]"), true);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Number of data rows: <!%lRow!>
iOutputManager.println("Number of data rows: " + lRow + "", true);
//ScriptWriter~~Create a list of Column Names in WorkItemColumns.csv.
iOutputManager.println("Create a list of Column Names in WorkItemColumns.csv.", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  iOutputManager.closeOutputFile();

  iOutputManager.openOutputFile("C:\\ArchitectsCompanion\\jac2017\\app\\ParseXML\\WorkItemColumns.csv", false);

//ScriptWriter~~  <!Column!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column")).resetIterator();
//ScriptWriter~~  while (<!Column!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![Column]!>,<![Column:Heading]!>,<![Column:Type]!>
iOutputManager.println("" + iSymbolTable.translateProperties("[Column]") + "," + iSymbolTable.translateProperties("[Column:Heading]") + "," + iSymbolTable.translateProperties("[Column:Type]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }

  iOutputManager.closeOutputFile();

//ScriptWriter~~  iOutputManager.openOutputFile(<![mic.element:logFile]!>, true);
  iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:logFile]"), true);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Build headers for *_import tables.
iOutputManager.println("Build headers for *_import tables.", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  iOutputManager.closeOutputFile();

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Import Sprints
iOutputManager.println("Import Sprints", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


// Create header rows in _import files

//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_sprint");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_sprint");
  writeHeadingLog("rm_sprint");
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_sprint");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_sprint");
  writeHeading();
  
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_epic");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_epic");
  writeHeadingLog("rm_epic");
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_epic");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_epic");
  writeHeading();
  
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_story");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_story");
  writeHeadingLog("rm_story");
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_story");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_story");
  writeHeading();
  
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_defect");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_defect");
  writeHeadingLog("rm_defect");
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_defect");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_defect");
  writeHeading();

//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_scrum_task");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_scrum_task");
  writeHeadingLog("rm_scrum_task");
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_scrum_task");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_scrum_task");
  writeHeading();

//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_backlog");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_backlog");
  writeHeadingLog("rm_backlog");
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_backlog");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_backlog");
  writeHeading();

//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_orphan");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_orphan");
  writeHeadingLog("rm_orphan");
//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_orphan");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_orphan");
  writeHeading();

//ScriptWriter~~  iOutputManager.openOutputFile(<![mic.element:logFile]!>, true);
  iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:logFile]"), true);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Process the Sprints from the XML files extracted from RTC.
iOutputManager.println("Process the Sprints from the XML files extracted from RTC.", true);
//ScriptWriter~~Format Sprint dates to yyyy-MM-dd HH:mm:ss.
iOutputManager.println("Format Sprint dates to yyyy-MM-dd HH:mm:ss.", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  iOutputManager.closeOutputFile();
  
//ScriptWriter~~  <!mic.element:sprintFile!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:sprintFile")).resetIterator();
//ScriptWriter~~  while (<!mic.element:sprintFile!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:sprintFile")).next()) {

//ScriptWriter~~    iSymbolTable.parseXml(<![mic.element:sprintFile]!>);
    iSymbolTable.parseXml(iSymbolTable.translateProperties("[mic.element:sprintFile]"));

//ScriptWriter~~    iOutputManager.openOutputFile(<![mic.element:logFile]!>, true);
    iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:logFile]"), true);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Sprint File: <![Project:Name]!>
iOutputManager.println("Sprint File: " + iSymbolTable.translateProperties("[Project:Name]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.closeOutputFile();
    
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~mic.element:sprintFile = <![mic.element:sprintFile]!> : <![mic.element:sprintFile:number]!>
iOutputManager.println("mic.element:sprintFile = " + iSymbolTable.translateProperties("[mic.element:sprintFile]") + " : " + iSymbolTable.translateProperties("[mic.element:sprintFile:number]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

   
//ScriptWriter~~    if (!<![mic.element:sprintFile:noSprint]!>.equalsIgnoreCase("true")) {  // noSprint != true
    if (!iSymbolTable.translateProperties("[mic.element:sprintFile:noSprint]").equalsIgnoreCase("true")) {  // noSprint != true
    
    DateTimeFormatter lDTF1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    DateTimeFormatter lDTF2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//ScriptWriter~~    LocalDateTime lLDT1 = LocalDateTime.parse(<![Project:StartDate]!>, lDTF1);
    LocalDateTime lLDT1 = LocalDateTime.parse(iSymbolTable.translateProperties("[Project:StartDate]"), lDTF1);
//ScriptWriter~~    <!StartDate!>!reset(lLDT1.format(lDTF2));
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("StartDate")).reset(lLDT1.format(lDTF2));

//ScriptWriter~~    LocalDateTime lLDT2 = LocalDateTime.parse(<![Project:FinishDate]!>, lDTF1);
    LocalDateTime lLDT2 = LocalDateTime.parse(iSymbolTable.translateProperties("[Project:FinishDate]"), lDTF1);
//ScriptWriter~~    <!FinishDate!>!reset(lLDT2.format(lDTF2));
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("FinishDate")).reset(lLDT2.format(lDTF2));

    Duration lDuration = Duration.between(lLDT1, lLDT2);
    Long lSeconds = lDuration.getSeconds();
//ScriptWriter~~    <!Duration!>!reset(lSeconds);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Duration")).reset(lSeconds);

//ScriptWriter~~    <!mic.element:map:type!>!scan("rm_sprint");    
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_sprint");    

    writeData();

    } // noSprint != True
   
// Get all the Sprint Stories and Tasks
 
//ScriptWriter~~    <!Project:Tasks!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks")).resetIterator();
//ScriptWriter~~    <!Project:Tasks:Task!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks:Task")).resetIterator();
//ScriptWriter~~    while (<!Project:Tasks:Task!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks:Task")).next()) {

// Get the Extended Attribute for the Task ID

//ScriptWriter~~      <!Project:Tasks:Task:ExtendedAttribute!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks:Task:ExtendedAttribute")).resetIterator();
//ScriptWriter~~      while (<!Project:Tasks:Task:ExtendedAttribute!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks:Task:ExtendedAttribute")).next()) {

//ScriptWriter~~        if (<![Project:Tasks:Task:ExtendedAttribute:FieldID]!>.equals("188743767")) {
        if (iSymbolTable.translateProperties("[Project:Tasks:Task:ExtendedAttribute:FieldID]").equals("188743767")) {
//ScriptWriter~~          <!Project:Tasks:Task:Id!>!set(<![Project:Tasks:Task:ExtendedAttribute:Value]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks:Task:Id")).set(iSymbolTable.translateProperties("[Project:Tasks:Task:ExtendedAttribute:Value]"));
          continue;
        }
      }

// Find Workitem
//ScriptWriter~~      if (<!Workitem:Id!>!scan(<![Project:Tasks:Task:Id]!>) == false) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Id")).scan(iSymbolTable.translateProperties("[Project:Tasks:Task:Id]")) == false) {
        continue;
      }

//ScriptWriter~~    iOutputManager.openOutputFile(<![mic.element:logFile]!>, true);
    iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:logFile]"), true);

//ScriptWriter~~          String lLogColumn = <![Workitem:Summary]!>;
          String lLogColumn = iSymbolTable.translateProperties("[Workitem:Summary]");
          lLogColumn = "\"" + lLogColumn.replaceAll("\"", "\"\"") + "\"";
          
          String lUsed = "";
//ScriptWriter~~          if (<![Workitem:Used]!>.equalsIgnoreCase("true")) lUsed = "Used in Future Sprint";
          if (iSymbolTable.translateProperties("[Workitem:Used]").equalsIgnoreCase("true")) lUsed = "Used in Future Sprint";

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~,<![Project:Tasks:Task:Id]!>,<![Workitem:Type]!>,<![Workitem:Parent]!>,<!%lUsed!>,<!%lLogColumn!>
iOutputManager.println("," + iSymbolTable.translateProperties("[Project:Tasks:Task:Id]") + "," + iSymbolTable.translateProperties("[Workitem:Type]") + "," + iSymbolTable.translateProperties("[Workitem:Parent]") + "," + lUsed + "," + lLogColumn + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    iOutputManager.closeOutputFile();

// Check if this has already been used.

//ScriptWriter~~      if (<![Workitem:Used]!>.equalsIgnoreCase("true")) continue;
      if (iSymbolTable.translateProperties("[Workitem:Used]").equalsIgnoreCase("true")) continue;
//ScriptWriter~~      <!Workitem:Used!>!reset("true");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Used")).reset("true");

//ScriptWriter~~      <!mic.element:map:type!>!scan("rm_story");    
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_story");    
//ScriptWriter~~      if (<![Workitem:Type]!>.equalsIgnoreCase("Epic")) <!mic.element:map:type!>!scan("rm_epic");
      if (iSymbolTable.translateProperties("[Workitem:Type]").equalsIgnoreCase("Epic")) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_epic");
//ScriptWriter~~      if (<![Workitem:Type]!>.equalsIgnoreCase("Defect")) <!mic.element:map:type!>!scan("rm_defect");
      if (iSymbolTable.translateProperties("[Workitem:Type]").equalsIgnoreCase("Defect")) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_defect");
//ScriptWriter~~      if (<![Workitem:Type]!>.equalsIgnoreCase("Task")) <!mic.element:map:type!>!scan("rm_scrum_task");
      if (iSymbolTable.translateProperties("[Workitem:Type]").equalsIgnoreCase("Task")) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_scrum_task");
//ScriptWriter~~//      if (<![mic.element:sprintFile:noSprint]!>.equalsIgnoreCase("true")) <!mic.element:map:type!>!scan("rm_backlog");
//      if (iSymbolTable.translateProperties("[mic.element:sprintFile:noSprint]").equalsIgnoreCase("true")) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_backlog");
       
      writeData();
      
    }
     
//ScriptWriter~~  <!Project!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project")).remove();
  }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Orphans
iOutputManager.println("Orphans", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  iOutputManager.openOutputFile(<![mic.element:logFile]!>, true);
  iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:logFile]"), true);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Orphans (Workitems not contained in a Sprint or Backlog)
iOutputManager.println("Orphans (Workitems not contained in a Sprint or Backlog)", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  iOutputManager.closeOutputFile();

  int lCount = 0;
  int lTotal = 0;

//ScriptWriter~~  <!mic.element:map:type!>!scan("rm_orphan");    
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:type")).scan("rm_orphan");    
  
//ScriptWriter~~  <!Workitem!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem")).resetIterator();
//ScriptWriter~~  while (<!Workitem!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem")).next()) {

    lTotal++;
//ScriptWriter~~    if (<![Workitem:Used]!>.equalsIgnoreCase("true")) continue;
    if (iSymbolTable.translateProperties("[Workitem:Used]").equalsIgnoreCase("true")) continue;

    {
//ScriptWriter~~      iOutputManager.openOutputFile(<![mic.element:logFile]!>, true);
      iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:logFile]"), true);

//ScriptWriter~~      String lLogColumn = <![Workitem:Summary]!>;
      String lLogColumn = iSymbolTable.translateProperties("[Workitem:Summary]");
      lLogColumn = "\"" + lLogColumn.replaceAll("\"", "\"\"") + "\"";

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~,<![Workitem:Id]!>,<![Workitem:Type]!>,<![Workitem:Parent]!>,<!%lLogColumn!>
iOutputManager.println("," + iSymbolTable.translateProperties("[Workitem:Id]") + "," + iSymbolTable.translateProperties("[Workitem:Type]") + "," + iSymbolTable.translateProperties("[Workitem:Parent]") + "," + lLogColumn + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      iOutputManager.closeOutputFile();
    }
         
    lCount++;

    writeData();
  }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Total = <!%lTotal!> Orphans = <!%lCount!>
iOutputManager.println("Total = " + lTotal + " Orphans = " + lCount + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  
}

private void writeHeadingLog(String aName) {


//ScriptWriter~~      iOutputManager.openOutputFile(<![mic.element:mapFile]!>, true);
      iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:mapFile]"), true);

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~*** Data Maps for <!%aName!> ***
iOutputManager.println("*** Data Maps for " + aName + " ***", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      String lColumn = "";
      String lComma = "";

//ScriptWriter~~      <!mic.element:map:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:column")).resetIterator();
//ScriptWriter~~      while (<!mic.element:map:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:column")).next()) {

//ScriptWriter~~        if (<![mic.element:map:column:constant]!>.length() > 0) {
        if (iSymbolTable.translateProperties("[mic.element:map:column:constant]").length() > 0) {

//ScriptWriter~~          lColumn = "\"" + <![mic.element:map:column:constant]!> + "\"";
          lColumn = "\"" + iSymbolTable.translateProperties("[mic.element:map:column:constant]") + "\"";

//ScriptWriter~~        } else if (<![mic.element:map:column:rule]!>.length() > 0) {
        } else if (iSymbolTable.translateProperties("[mic.element:map:column:rule]").length() > 0) {

//ScriptWriter~~          if (<![mic.element:sprintFile:number]!>.length() > 0) {
          if (iSymbolTable.translateProperties("[mic.element:sprintFile:number]").length() > 0) {
            lColumn = "\"false\"";
          } else {
            lColumn = "\"true\"";
          }

        } else {

//ScriptWriter~~          lColumn = <![mic.element:map:column:from]!>;
          lColumn = iSymbolTable.translateProperties("[mic.element:map:column:from]");

        }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lColumn!>,<![mic.element:map:column:to]!>
iOutputManager.println("" + lColumn + "," + iSymbolTable.translateProperties("[mic.element:map:column:to]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        lComma = ",";
      }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.closeOutputFile();

}

private void writeHeading() {

//ScriptWriter~~      iOutputManager.openOutputFile(<![mic.element:map:file]!>, false);
      iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:map:file]"), false);

      String lColumn = "";
      String lComma = "";

//ScriptWriter~~      <!mic.element:map:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:column")).resetIterator();
//ScriptWriter~~      while (<!mic.element:map:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:column")).next()) {

//ScriptWriter~~        lColumn = <![mic.element:map:column:to]!>;
        lColumn = iSymbolTable.translateProperties("[mic.element:map:column:to]");

//ScriptWriter~~%><!%lComma!><!%lColumn!><%
{
//ScriptWriter~~~
iOutputManager.println("" + lComma + "" + lColumn + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


        lComma = ",";
      }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      iOutputManager.closeOutputFile();

}

private void writeData() {

//ScriptWriter~~      iOutputManager.openOutputFile(<![mic.element:map:file]!>, true);
      iOutputManager.openOutputFile(iSymbolTable.translateProperties("[mic.element:map:file]"), true);

      String lColumn = "";
      String lComma = "";

//ScriptWriter~~      <!mic.element:map:column!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:column")).resetIterator();
//ScriptWriter~~      while (<!mic.element:map:column!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:map:column")).next()) {

//ScriptWriter~~        if (<![mic.element:map:column:constant]!>.length() > 0) {
        if (iSymbolTable.translateProperties("[mic.element:map:column:constant]").length() > 0) {

//ScriptWriter~~          lColumn = <![mic.element:map:column:constant]!>;
          lColumn = iSymbolTable.translateProperties("[mic.element:map:column:constant]");

//ScriptWriter~~        } else if (<![mic.element:map:column:rule]!>.length() > 0) {
        } else if (iSymbolTable.translateProperties("[mic.element:map:column:rule]").length() > 0) {

//ScriptWriter~~          if (<![mic.element:sprintFile:number]!>.length() > 0) {
          if (iSymbolTable.translateProperties("[mic.element:sprintFile:number]").length() > 0) {
            lColumn = "\"false\"";
          } else {
            lColumn = "\"true\"";
          }

        } else {

//ScriptWriter~~          lColumn = <![[mic.element:map:column:from]]!>;
          lColumn = iSymbolTable.translateProperties("[[mic.element:map:column:from]]");
//ScriptWriter~~          if (<![mic.element:map:column:string]!>.equalsIgnoreCase("true")) {
          if (iSymbolTable.translateProperties("[mic.element:map:column:string]").equalsIgnoreCase("true")) {
            lColumn = "\"" + lColumn.replaceAll("\"", "\"\"") + "\"";
          }

        }
//ScriptWriter~~%><!%lComma!><!%lColumn!><%
{
//ScriptWriter~~~
iOutputManager.println("" + lComma + "" + lColumn + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        lComma = ",";
      }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


      iOutputManager.closeOutputFile();

}

}
