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

import  java.io.*;
import  net.sourceforge.plantuml.SourceStringReader;
//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class ExamManagementDiagrams extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected ExamManagementDiagrams() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public ExamManagementDiagrams(Script aScript) {

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


/**
* @startuml
* actor Veteran
* actor VSR
* participant "VBA\nCompensation\nClaim" as Claim
* participant "VBA\nGeneric\nEncounter" as VBAGenericEncounter
* actor "VHA Triage\nScheduling" as Triage
* participant "VHA\nChild\nOrder" as VHAChildOrder
* participant "VHA\nAppointment" as VHAAppointment
* participant "C&P Clinic" as Clinic
* actor Clinician
* participant DBQ
* Veteran -> VSR : Submit Claim\nContentions
* VSR -> Claim : CEST
* VSR -> VBAGenericEncounter : Create Generic Order
* VBAGenericEncounter o->o Claim : Generic Order Created Status
* VBAGenericEncounter -> Triage : Get Generic Order
* Triage -> VHAChildOrder : Create Child Order(s)
* VHAChildOrder o->o Claim : Child Order Created Status
* Triage -> VHAAppointment : Create Order Appointment(s)
* VHAAppointment o->o Claim : Appointment Created Status
* VHAAppointment -> Clinic : Prep for Veteran
* Veteran -> Clinic : Veteran Presents
* Clinician -> Veteran : Perform Exam
* Clinician -> DBQ : Complete DBQ
* Clinician -> VHAAppointment : Close Appointment
* Clinician -> VHAChildOrder : Close Order
* VHAChildOrder o->o Claim : Close Order Status
* DBQ o->o Claim : Update eFolder with DBQ
* DBQ o->o Claim : Update Appointment Status

* @enduml
*/

        StringBuilder plantUmlSource = new StringBuilder();
        
        plantUmlSource.append("@startuml\n");

        plantUmlSource.append("Alice -> Bob: Authentication Request\n");

        plantUmlSource.append("Bob --> Alice: Authentication Response\n");

        plantUmlSource.append("@enduml");

//        SourceStringReader reader = new SourceStringReader(plantUmlSource.toString());

//        FileOutputStream output = new FileOutputStream(new File("/your/path/to/plantuml/test.svg"));

//        reader.generateImage(output, new FileFormatOption(FileFormat.SVG, false));
          
//SourceStringReader reader = new SourceStringReader(source);
//final ByteArrayOutputStream os = new ByteArrayOutputStream();
//// Write the first image to "os"
//String desc = reader.generateImage(os, new FileFormatOption(FileFormat.SVG));
//os.close();

//// The XML is stored into svg
//final String svg = new String(os.toByteArray(), Charset.forName("UTF-8"));

}

}
