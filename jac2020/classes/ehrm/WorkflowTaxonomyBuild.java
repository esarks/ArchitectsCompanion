//ScriptWriter~~package <#[$jac:script:package]#>;
package ehrm;

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

//ScriptWriter~~%>EHRM Hello World! v20190816a
{
//ScriptWriter~~~
iOutputManager.println("EHRM Hello World! v20190816a", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  iSymbolTable.parseXml("C:\\ArchitectsCompanion\\jac2017\\app\\ehrm\\WorkflowTaxonomy.xml");

  iOutputManager.openOutputFile("C:\\ArchitectsCompanion\\jac2017\\app\\ehrm\\WorkflowTaxonomy.csv", false);

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
//ScriptWriter~~<![business:major:name]!>,<![business:major:workflow:name]!>,#<!%lWorkflow!>: # Wf Designer = <!%lWorkflowSize!>; # Products = <!%lProdSize!>; # Interfaces = <!%lInterfaceSize!> Page = <![business:major:workflow:page]!>,,,,<![business:major:workflow:date1]!>,<![business:major:workflow:date2]!>,,workflow,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + "," + iSymbolTable.translateProperties("[business:major:workflow:name]") + ",#" + lWorkflow + ": # Wf Designer = " + lWorkflowSize + "; # Products = " + lProdSize + "; # Interfaces = " + lInterfaceSize + " Page = " + iSymbolTable.translateProperties("[business:major:workflow:page]") + ",,,," + iSymbolTable.translateProperties("[business:major:workflow:date1]") + "," + iSymbolTable.translateProperties("[business:major:workflow:date2]") + ",,workflow," + lRow + "", true);
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

if (lIncludeDetail) {          
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![business:major:name]!>,,Wf Designer = <!%lWfd!>,Reviewed = <![business:major:workflow:wfdesigner:reviewed]!>,Phase = <![business:phases:[business:major:workflow:wfdesigner:phase]:description]!>,,,,,wfdesigner,<!%lRow!>
iOutputManager.println("" + iSymbolTable.translateProperties("[business:major:name]") + ",,Wf Designer = " + lWfd + ",Reviewed = " + iSymbolTable.translateProperties("[business:major:workflow:wfdesigner:reviewed]") + ",Phase = " + iSymbolTable.translateProperties("[business:phases:[business:major:workflow:wfdesigner:phase]:description]") + ",,,,,wfdesigner," + lRow + "", true);
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

if (lIncludeDetail) {
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

        }

//ScriptWriter~~        <!business:major:workflow:interface!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:interface")).resetIterator();
//ScriptWriter~~        while (<!business:major:workflow:interface!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("business:major:workflow:interface")).next()) {
          lRow++;
//ScriptWriter~~          String lInterface = <![business:interfaces:[business:major:workflow:interface:name]:description]!>;
          String lInterface = iSymbolTable.translateProperties("[business:interfaces:[business:major:workflow:interface:name]:description]");

if (lIncludeDetail) {
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

  }

  iOutputManager.closeOutputFile();



}

}
