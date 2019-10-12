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

import  java.io.*;;
//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class EHRM extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected EHRM() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public EHRM(Script aScript) {

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


  try {

    String lFile = "C:\\ArchitectsCompanion\\jac2017\\app\\ehrm\\EHRM.xml";
    FileReader lFileReader = new FileReader(lFile);
    List<GeneratedImage> lList = lFileReader.getGeneratedImages();

  }
  
  catch (Exception lException) {
    System.out.println(lException);
  }

//File source = "C:\\ArchitectsCompanion\\jac2017\\app\\ehrm\\EHRM.xml";
//SourceFileReader reader = new SourceFileReader(source);
//List<GeneratedImage> list = reader.getGeneratedImages();
// Generated files
//File png = list.get(0).getPngFile();

}

}
