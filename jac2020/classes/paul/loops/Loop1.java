//ScriptWriter~~package <#[$jac:script:package]#>;
package paul.loops;

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
public class Loop1 extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Loop1() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Loop1(Script aScript) {

    super(aScript);

  }
public void about() {
    System.out.println("About: Loop1.script v20170722a");
}

public void execute() {

  // Declare a String variable, but do not set it's value
  String lString;

  // Declare an ArrayList and initialize it to an empty list
  ArrayList lArrayList = new ArrayList();

  // Declare an integer for the loop counter, but do not set it's value
  int lIdx;
  
  // Loop four times
  for (lIdx=0; lIdx < 5; lIdx++) {
    // Set the value of lString to be the value of the lIdx counter (converted to a string)
    lString = new Long(lIdx).toString();
    // Print out the value of lString
    System.out.println("lString = " + lString);
    // Add the string the the array list
    lArrayList.add(lString);
  }

  System.out.println("Print out the array list in reverse:");
  
  // Loop in reverse
  for (lIdx=4; lIdx >= 0; lIdx--) {
    // Get the string from from the array list
    lString = (String) lArrayList.get(lIdx);
    // Print out the value of the string
    System.out.println("lString = " + lString);
  }

}
}
