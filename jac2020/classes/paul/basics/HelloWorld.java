//ScriptWriter~~package <#[$jac:script:package]#>;
package paul.basics;

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

  String lJsonString = readJson("C:/ArchitectsCompanion/jac2017/app/paul/basics/HelloWorld.json");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%lJsonString!>
iOutputManager.println("" + lJsonString + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  JSONObject lJsonObject = new JSONObject();
  
try {

  JSONParser lParser = new JSONParser();
  lJsonObject = (JSONObject) lParser.parse(lJsonString);

  } catch (org.json.simple.parser.ParseException e) {
 
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%e!>
iOutputManager.println("" + e + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }

  iterateJsonObject(lJsonObject);

}

private String readJson(String aFilePath) {

  String lJsonString = "";
 
  try {
    lJsonString = new String ( Files.readAllBytes( Paths.get(aFilePath) ) );
  } catch (IOException e)
  {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%e!>
iOutputManager.println("" + e + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }

  return lJsonString; 

}


private void iterateJsonObject(JSONObject aJsonObject) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~iterateJsonObject Enter
iOutputManager.println("iterateJsonObject Enter", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


Set<String> keys = aJsonObject.keySet();

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%keys!>
iOutputManager.println("" + keys + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~



}

}
