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
public class Parse extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Parse() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Parse(Script aScript) {

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


}
}
