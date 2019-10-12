//ScriptWriter~~package <#[$jac:script:package]#>;
package paul.callback;

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
public class Client extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Client() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Client(Script aScript) {

    super(aScript);

  }

public void execute() {

  System.out.println("Client.script");
  paul.callback.Server lServer = new paul.callback.Server();
  lServer.doTheCallback(this);
  
}

public void callbackMethod() {

  System.out.println("Client.script the callbackMethod");

}

public void doNothing() {

}
}