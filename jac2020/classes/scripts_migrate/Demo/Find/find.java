//ScriptWriter~~package <#[$jac:script:package]#>;
package scripts_migrate.Demo.Find;

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
public class find extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected find() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public find(Script aScript) {

    super(aScript);

  }

public void execute() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~***************************************
iOutputManager.println("***************************************", true);
//ScriptWriter~~***************************************
iOutputManager.println("***************************************", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


/**************************************
  Set data values
***************************************/

//ScriptWriter~~  <!record!>!set(12345);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record")).set(12345);
//ScriptWriter~~  <!record:name:last!>!set("Smith");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:name:last")).set("Smith");
//ScriptWriter~~  <!record:name:first!>!set("John");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:name:first")).set("John");
//ScriptWriter~~  <!record:phone:type!>!set("work");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).set("work");
//ScriptWriter~~  <!record:phone:number!>!set("333-1111");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).set("333-1111");
//ScriptWriter~~  <!record:phone:type!>!set("home");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).set("home");
//ScriptWriter~~  <!record:phone:number!>!set("333-2222");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).set("333-2222");
//ScriptWriter~~  <!record:phone:type!>!set("mobile");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).set("mobile");
//ScriptWriter~~  <!record:phone:number!>!set("333-3333");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).set("333-3333");

//ScriptWriter~~  <!record!>!set(12346);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record")).set(12346);
//ScriptWriter~~  <!record:name:last!>!set("Doe");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:name:last")).set("Doe");
//ScriptWriter~~  <!record:name:first!>!set("Jane");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:name:first")).set("Jane");
//ScriptWriter~~  <!record:phone:type!>!set("work");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).set("work");
//ScriptWriter~~  <!record:phone:number!>!set("444-1111");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).set("444-1111");
//ScriptWriter~~  <!record:phone:type!>!set("home");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).set("home");
//ScriptWriter~~  <!record:phone:number!>!set("444-2222");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).set("444-2222");
//ScriptWriter~~  <!record:phone:type!>!set("mobile");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).set("mobile");
//ScriptWriter~~  <!record:phone:number!>!set("444-3333");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).set("444-3333");

//ScriptWriter~~  <!record!>!set(12347);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record")).set(12347);
//ScriptWriter~~  <!record:name:first!>!set("Johnnie");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:name:first")).set("Johnnie");
//ScriptWriter~~  <!record:phone:type!>!set("work");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).set("work");
//ScriptWriter~~  <!record:phone:number!>!set("555-1111");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).set("555-1111");
//ScriptWriter~~  <!record:phone:type!>!set("home");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).set("home");
//ScriptWriter~~  <!record:phone:number!>!set("555-2222");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).set("555-2222");
//ScriptWriter~~  <!record:phone:type!>!set("mobile");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).set("mobile");
//ScriptWriter~~  <!record:phone:number!>!set("555-3333");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).set("555-3333");

// Reset iterator
//ScriptWriter~~  <!record!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record")).resetIterator();

//ScriptWriter~~  while (<!record!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~1. Record = <![record]!>
iOutputManager.println("1. Record = " + iSymbolTable.translateProperties("[record]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    if (<!record:phone:type!>!find("home") == true) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:type")).find("home") == true) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~FIND 2. Home Phone Number = <![record:phone:number]!>
iOutputManager.println("FIND 2. Home Phone Number = " + iSymbolTable.translateProperties("[record:phone:number]") + "", true);
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
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~Trying find:
iOutputManager.println("Trying find:", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  if (<!record:phone:number!>!find("444-1111") == true) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).find("444-1111") == true) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~3. Matching Phone Number Found = <![record]!>
iOutputManager.println("3. Matching Phone Number Found = " + iSymbolTable.translateProperties("[record]") + "", true);
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
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~Trying scan:
iOutputManager.println("Trying scan:", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  if (<!record:phone:number!>!scan("444-1111") == true) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:phone:number")).scan("444-1111") == true) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~4. Matching Phone Number Found = <![record]!>
iOutputManager.println("4. Matching Phone Number Found = " + iSymbolTable.translateProperties("[record]") + "", true);
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
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~***************************************
iOutputManager.println("***************************************", true);
//ScriptWriter~~***************************************
iOutputManager.println("***************************************", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


}
}
