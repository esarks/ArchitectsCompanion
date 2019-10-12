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
public class ParseItems extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected ParseItems() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public ParseItems(Script aScript) {

    super(aScript);

  }

public void execute() {

  parseItems();
  parseSprints();
  
}


public void parseItems() {

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


// Establish Type translation from Excel to XSD

//ScriptWriter~~   <!Type:Boolean!>!set("boolean");
   iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Type:Boolean")).set("boolean");
//ScriptWriter~~   <!Type:DateTime!>!set("dateTime");
   iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Type:DateTime")).set("dateTime");
//ScriptWriter~~   <!Type:Number!>!set("integer");
   iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Type:Number")).set("integer");
//ScriptWriter~~   <!Type:String!>!set("string");
   iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Type:String")).set("string");

// Parse the WorkItems XML exported and converted from Rational RTC

  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\Agile_Transformation\\Kingston\\Experiment v20190605a\\Copy of All Items.xml");

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
              
        int lRow = 0;
//ScriptWriter~~        <!Workbook:Worksheet:Table:Row!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet:Table:Row")).resetIterator();
//ScriptWriter~~        while (<!Workbook:Worksheet:Table:Row!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workbook:Worksheet:Table:Row")).next()) {

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

//ScriptWriter~~  <!Column!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column")).resetIterator();
//ScriptWriter~~  while (<!Column!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Column,<![Column]!>,<![Column:Heading]!>,<![Column:XmlHeading]!>,<![Column:Type]!>,<![Column:XmlType]!>
iOutputManager.println("Column," + iSymbolTable.translateProperties("[Column]") + "," + iSymbolTable.translateProperties("[Column:Heading]") + "," + iSymbolTable.translateProperties("[Column:XmlHeading]") + "," + iSymbolTable.translateProperties("[Column:Type]") + "," + iSymbolTable.translateProperties("[Column:XmlType]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }

  iOutputManager.openOutputFile("C:\\ArchitectsCompanion\\jac2017\\app\\ParseXML\\WorkItems.xml", false);

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<Row>
iOutputManager.println("<Row>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!Column!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column")).resetIterator();
//ScriptWriter~~  while (<!Column!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Column")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<Cell ss:Index="<![Column]!>"><Data><![Column:Heading]!></Data></Cell>
iOutputManager.println("<Cell ss:Index=\"" + iSymbolTable.translateProperties("[Column]") + "\"><Data>" + iSymbolTable.translateProperties("[Column:Heading]") + "</Data></Cell>", true);
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
//ScriptWriter~~</Row>
iOutputManager.println("</Row>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!Workitem!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem")).resetIterator();
//ScriptWriter~~  while (<!Workitem!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Workitem Id <![Workitem:Id]!>
iOutputManager.println("Workitem Id " + iSymbolTable.translateProperties("[Workitem:Id]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!Workitem:Column!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Column")).resetIterator();
//ScriptWriter~~    while (<!Workitem:Column!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Column")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Workitem Column <![Workitem:Column]!> (<![Workitem:Column:Heading]!>) [<![Workitem:Column:Type]!>] <![Workitem:Column:Data]!>
iOutputManager.println("Workitem Column " + iSymbolTable.translateProperties("[Workitem:Column]") + " (" + iSymbolTable.translateProperties("[Workitem:Column:Heading]") + ") [" + iSymbolTable.translateProperties("[Workitem:Column:Type]") + "] " + iSymbolTable.translateProperties("[Workitem:Column:Data]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }
  }

  iOutputManager.closeOutputFile();

}


public void parseSprints() {

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


//ScriptWriter~~  <!sprintFile!>!set("Sprint 1 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 1 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 2 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 2 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 3 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 3 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 4 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 4 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 5 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 5 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 6 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 6 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 7 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 7 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 8 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 8 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 9 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 9 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 10 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 10 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 11 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 11 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 12 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 12 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 13 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 13 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 14 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 14 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 15 Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 15 Backlog.xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 1 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 1 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 2 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 2 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 3 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 3 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 4 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 4 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 5 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 5 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 6 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 6 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 7 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 7 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 8 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 8 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 9 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 9 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 10 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 10 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 11 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 11 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 12 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 12 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 13 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 13 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 14 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 14 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 15 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 15 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 16 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 16 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Sprint 17 Backlog (OY1).xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Sprint 17 Backlog (OY1).xml"); 
//ScriptWriter~~  <!sprintFile!>!set("Product Backlog.xml"); 
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).set("Product Backlog.xml"); 
 
//ScriptWriter~~  <!sprintFile!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).resetIterator();
//ScriptWriter~~  while (<!sprintFile!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprintFile")).next()) {
//ScriptWriter~~  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\Agile_Transformation\\Kingston\\Experiment v20190605a\\Rational 20190603a\\" + <![sprintFile]!>);
  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\Agile_Transformation\\Kingston\\Experiment v20190605a\\Rational 20190603a\\" + iSymbolTable.translateProperties("[sprintFile]"));

//ScriptWriter~~  if (<![Project:StartDate]!>.length() > 1) {
  if (iSymbolTable.translateProperties("[Project:StartDate]").length() > 1) {
//ScriptWriter~~    <!subString1!>!reset(<![Project:StartDate]!>.substring(0,10));
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("subString1")).reset(iSymbolTable.translateProperties("[Project:StartDate]").substring(0,10));
//ScriptWriter~~    <!subString2!>!reset(<![Project:StartDate]!>.substring(11,19));
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("subString2")).reset(iSymbolTable.translateProperties("[Project:StartDate]").substring(11,19));
//ScriptWriter~~    <!StartDate!>!reset(<![subString1]!> + " " + <![subString2]!>);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("StartDate")).reset(iSymbolTable.translateProperties("[subString1]") + " " + iSymbolTable.translateProperties("[subString2]"));
  }
//ScriptWriter~~  if (<![Project:FinishDate]!>.length() > 1) {
  if (iSymbolTable.translateProperties("[Project:FinishDate]").length() > 1) {
//ScriptWriter~~    <!subString1!>!reset(<![Project:FinishDate]!>.substring(0,10));
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("subString1")).reset(iSymbolTable.translateProperties("[Project:FinishDate]").substring(0,10));
//ScriptWriter~~    <!subString2!>!reset(<![Project:FinishDate]!>.substring(11,19));
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("subString2")).reset(iSymbolTable.translateProperties("[Project:FinishDate]").substring(11,19));
//ScriptWriter~~    <!FinishDate!>!reset(<![subString1]!> + " " + <![subString2]!>);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("FinishDate")).reset(iSymbolTable.translateProperties("[subString1]") + " " + iSymbolTable.translateProperties("[subString2]"));
  }
 
//ScriptWriter~~  <!sprint!>!set(<![sprintFile]!>);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint")).set(iSymbolTable.translateProperties("[sprintFile]"));
//ScriptWriter~~  <!sprint:name!>!set(<![Project:Name]!>);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint:name")).set(iSymbolTable.translateProperties("[Project:Name]"));
//ScriptWriter~~  <!sprint:startDate!>!set(<![StartDate]!>);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint:startDate")).set(iSymbolTable.translateProperties("[StartDate]"));
//ScriptWriter~~  <!sprint:finishDate!>!set(<![FinishDate]!>);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint:finishDate")).set(iSymbolTable.translateProperties("[FinishDate]"));
//ScriptWriter~~  <!sprint:idList!>!set("");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint:idList")).set("");
  
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![Project:Name]!>,<![StartDate]!>,<![FinishDate]!>
iOutputManager.println("" + iSymbolTable.translateProperties("[Project:Name]") + "," + iSymbolTable.translateProperties("[StartDate]") + "," + iSymbolTable.translateProperties("[FinishDate]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

 
//ScriptWriter~~  <!Project:Tasks!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks")).resetIterator();
//ScriptWriter~~  <!Project:Tasks:Task!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks:Task")).resetIterator();
//ScriptWriter~~  while (<!Project:Tasks:Task!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks:Task")).next()) {

//ScriptWriter~~    <!Project:Tasks:Task:ExtendedAttribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks:Task:ExtendedAttribute")).resetIterator();
//ScriptWriter~~    while (<!Project:Tasks:Task:ExtendedAttribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project:Tasks:Task:ExtendedAttribute")).next()) {

//ScriptWriter~~      if (<![Project:Tasks:Task:ExtendedAttribute:FieldID]!>.equals("188743767")) {
      if (iSymbolTable.translateProperties("[Project:Tasks:Task:ExtendedAttribute:FieldID]").equals("188743767")) {

//ScriptWriter~~        <!sprint:idList:id!>!set(<![Project:Tasks:Task:ExtendedAttribute:Value]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint:idList:id")).set(iSymbolTable.translateProperties("[Project:Tasks:Task:ExtendedAttribute:Value]"));
//ScriptWriter~~        addCounter("dupList", <![Project:Tasks:Task:ExtendedAttribute:Value]!>);
        addCounter("dupList", iSymbolTable.translateProperties("[Project:Tasks:Task:ExtendedAttribute:Value]"));
      }
    }
  }

//ScriptWriter~~  <!Project!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Project")).remove();
  }

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

 
  iOutputManager.openOutputFile("C:\\ArchitectsCompanion\\jac2017\\app\\ParseXML\\SprintsList.csv", false);

//ScriptWriter~~  <!sprint!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint")).resetIterator();
//ScriptWriter~~  while (<!sprint!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![sprint]!>,<![sprint:name]!>,<![sprint:startDate]!>,<![sprint:finishDate]!>
iOutputManager.println("" + iSymbolTable.translateProperties("[sprint]") + "," + iSymbolTable.translateProperties("[sprint:name]") + "," + iSymbolTable.translateProperties("[sprint:startDate]") + "," + iSymbolTable.translateProperties("[sprint:finishDate]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }

  iOutputManager.closeOutputFile();

  iOutputManager.openOutputFile("C:\\ArchitectsCompanion\\jac2017\\app\\ParseXML\\SprintsListIds.csv", false);

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~File Name,Sprint Name,Planned For,ID,Type,Status,Parent ID,Parent Type,Count,Summary
iOutputManager.println("File Name,Sprint Name,Planned For,ID,Type,Status,Parent ID,Parent Type,Count,Summary", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!sprint!>!resetIterator();  
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint")).resetIterator();  
//ScriptWriter~~  while (<!sprint!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~***********
iOutputManager.println("***********", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!sprint:idList:id!>!resetIterator();  
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint:idList:id")).resetIterator();  
//ScriptWriter~~    while (<!sprint:idList:id!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sprint:idList:id")).next()) {

//ScriptWriter~~      <!Workitem:Id!>!scan(<![sprint:idList:id]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Id")).scan(iSymbolTable.translateProperties("[sprint:idList:id]"));
//ScriptWriter~~      <!Workitem!>!alias("aWorkitem");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem")).alias("aWorkitem");
//ScriptWriter~~      <!Workitem:Id!>!scan(<![Workitem:Parent ID]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem:Id")).scan(iSymbolTable.translateProperties("[Workitem:Parent ID]"));
//ScriptWriter~~      <!Workitem!>!alias("bWorkitem");
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("Workitem")).alias("bWorkitem");

//ScriptWriter~~      <!dupList:id!>!scan(<![sprint:idList:id]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("dupList:id")).scan(iSymbolTable.translateProperties("[sprint:idList:id]"));

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![sprint]!>,<![sprint:name]!>,<![aWorkitem:Planned For]!>,<![sprint:idList:id]!>,<![aWorkitem:Type]!>,<![aWorkitem:Status]!>,<![aWorkitem:Parent ID]!>,<![bWorkitem:Type]!>,<![dupList:id:count]!>,"<![aWorkitem:Summary]!>"
iOutputManager.println("" + iSymbolTable.translateProperties("[sprint]") + "," + iSymbolTable.translateProperties("[sprint:name]") + "," + iSymbolTable.translateProperties("[aWorkitem:Planned For]") + "," + iSymbolTable.translateProperties("[sprint:idList:id]") + "," + iSymbolTable.translateProperties("[aWorkitem:Type]") + "," + iSymbolTable.translateProperties("[aWorkitem:Status]") + "," + iSymbolTable.translateProperties("[aWorkitem:Parent ID]") + "," + iSymbolTable.translateProperties("[bWorkitem:Type]") + "," + iSymbolTable.translateProperties("[dupList:id:count]") + ",\"" + iSymbolTable.translateProperties("[aWorkitem:Summary]") + "\"", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    }
  }

  iOutputManager.closeOutputFile();
  
}

public void addCounter(String aList, String aId) {

//ScriptWriter~~<!temp1!>!reset(aList);
iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("temp1")).reset(aList);

//ScriptWriter~~if (<![temp1]:id!>!scan(aId)) {
if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[temp1]:id")).scan(aId)) {

//ScriptWriter~~int lValue = Integer.parseInt(<![[temp1]:id:count]!>) + 1;
int lValue = Integer.parseInt(iSymbolTable.translateProperties("[[temp1]:id:count]")) + 1;

//ScriptWriter~~<![temp1]:id:count!>!reset(new Integer(lValue));
iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[temp1]:id:count")).reset(new Integer(lValue));

} else {

//ScriptWriter~~<![temp1]:id!>!set(aId);
iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[temp1]:id")).set(aId);
//ScriptWriter~~<![temp1]:id:count!>!set(new Integer(1));
iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[temp1]:id:count")).set(new Integer(1));

}

}

}
