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
public class HelloWorld extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected HelloWorld() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public HelloWorld(Script aScript) {

    super(aScript);

  }

public void execute() {

//ScriptWriter~~%>Hello World! v2019/06/05a  Type: <![mic.element:type]!>
{
//ScriptWriter~~~
iOutputManager.println("Hello World! v2019/06/05a  Type: " + iSymbolTable.translateProperties("[mic.element:type]") + "", true);
//ScriptWriter~~mic.element:rtcFile = <![mic.element:rtcFile]!>
iOutputManager.println("mic.element:rtcFile = " + iSymbolTable.translateProperties("[mic.element:rtcFile]") + "", true);
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


  
  
  
  

     DateTimeFormatter aformatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
     LocalDateTime ldt = LocalDateTime.parse("2017-07-30T08:00:00", aformatter);
  
     System.out.println("Before : " + ldt);

     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

     String formatDateTime = ldt.format(formatter);

     System.out.println("After : " + formatDateTime);

}
}
