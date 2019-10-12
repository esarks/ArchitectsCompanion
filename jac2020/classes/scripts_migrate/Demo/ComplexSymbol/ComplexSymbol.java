//ScriptWriter~~package <#[$jac:script:package]#>;
package scripts_migrate.Demo.ComplexSymbol;

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
public class ComplexSymbol extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected ComplexSymbol() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public ComplexSymbol(Script aScript) {

    super(aScript);

  }

public void execute() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
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

//ScriptWriter~~  <!record!>!set(12346);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record")).set(12346);
//ScriptWriter~~  <!record:name:last!>!set("Doe");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:name:last")).set("Doe");
//ScriptWriter~~  <!record:name:first!>!set("Jane");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:name:first")).set("Jane");

//ScriptWriter~~  <!record!>!set(12347);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record")).set(12347);
//ScriptWriter~~  <!record:name:first!>!set("Johnnie");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:name:first")).set("Johnnie");

// Reset iterator
//ScriptWriter~~  <!record!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record")).resetIterator();

/**************************************
  Iterate through data
***************************************/
//ScriptWriter~~  while (<!record!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~1. Record number = <![record]!>
iOutputManager.println("1. Record number = " + iSymbolTable.translateProperties("[record]") + "", true);
//ScriptWriter~~2. Name = <![record:name:last]!><%
iOutputManager.println("2. Name = " + iSymbolTable.translateProperties("[record:name:last]") + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  if (<!record:name:last!>!size() > 0) %>, <%
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("record:name:last")).size() > 0) {
//ScriptWriter~~~
iOutputManager.println(", ", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![record:name:first]!>
iOutputManager.println("" + iSymbolTable.translateProperties("[record:name:first]") + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
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
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


}
}
