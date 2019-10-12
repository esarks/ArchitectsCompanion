//ScriptWriter~~package <#[$jac:script:package]#>;
package paul.words;

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
public class words extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected words() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public words(Script aScript) {

    super(aScript);

  }

public void execute() {

//ScriptWriter~~%>words v20171005a
{
//ScriptWriter~~~
iOutputManager.println("words v20171005a", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


String s = "Modify VADIR web service to include new data elements (Chapter 63)";

String[] words = s.split("\\W+");

for(int i=0; i<words.length;i++) {
     System.out.println(words[i]);
}

}
}
