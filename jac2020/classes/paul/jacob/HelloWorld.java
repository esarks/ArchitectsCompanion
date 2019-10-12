//ScriptWriter~~package <#[$jac:script:package]#>;
package paul.jacob;

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

import  com.jacob.activeX.ActiveXComponent;;
import  com.jacob.com.*;;
//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class HelloWorld extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected HelloWorld() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public HelloWorld(Script aScript) {

    super(aScript);

  }
private static final String inputFile = "C:\\ArchitectsCompanion\\jac20120811a\\app\\com\\learning\\paul\\jacob\\Requirements Management Framework-V2.pptx";

public void execute() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Hello World! 1a
iOutputManager.println("Hello World! 1a", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//                iRqPrj = iRqApp.Application.OpenProject(Me.txtRequisiteProProjectFrom.Text, _
//                                                            ReqPro40.enumOpenProjectOptions.eOpenProjOpt_RQSFile, _
//                                                            Me.txtUserFrom.Text, _
//                                                            Me.txtPasswordFrom.Text, _
//                                                            ReqPro40.enumProjectFlags.eProjFlag_Normal, _
//                                                            ReqPro40.enumRelatedProjectOptions.eRelatedProjOption_ConnectAsSpecified)

//        ActiveXComponent ReqPro = new ActiveXComponent("ReqPro40.Application");
//        ActiveXComponent ReqProApplication = ReqPro.getPropertyAsComponent("Application");
//        ReqProApplication.invoke("OpenProject");
//        ComThread.Release();


//        ActiveXComponent wordApp = new ActiveXComponent("Word.Application");
//        wordApp.setProperty("Visible", new Variant(true));
//        ActiveXComponent presentations = slideApp.getPropertyAsComponent("Presentations");
//        ActiveXComponent presentation = presentations.invokeGetComponent("Open",new Variant(inputFile), new Variant(true));
//        ComThread.Release();

       ActiveXComponent slideApp = new ActiveXComponent("PowerPoint.Application");
       slideApp.setProperty("Visible", new Variant(true));
       ActiveXComponent presentations = slideApp.getPropertyAsComponent("Presentations");
       ActiveXComponent presentation = presentations.invokeGetComponent("Open",new Variant(inputFile), new Variant(true));
       ComThread.Release();
            
}
        
}
