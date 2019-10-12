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

import  java.io.File;
import  java.io.FileNotFoundException;
import  java.io.FileOutputStream;
import  java.io.IOException;
import  java.io.OutputStream;
import  java.io.IOException;;
import  java.text.SimpleDateFormat;;
import  java.util.Date;;
import  ca.uhn.hl7v2.DefaultHapiContext;
import  ca.uhn.hl7v2.HL7Exception;
import  ca.uhn.hl7v2.HapiContext;
import  ca.uhn.hl7v2.parser.Parser;
import  ca.uhn.hl7v2.model.Message;
import  ca.uhn.hl7v2.validation.builder.support.DefaultValidationBuilder;
import  ca.uhn.hl7v2.validation.builder.support.NoValidationBuilder;
import  ca.uhn.hl7v2.model.DataTypeException;;
import  ca.uhn.hl7v2.model.v23.datatype.PL;
import  ca.uhn.hl7v2.model.v23.datatype.XAD;
import  ca.uhn.hl7v2.model.v23.datatype.XCN;
import  ca.uhn.hl7v2.model.v23.datatype.XPN;
import  ca.uhn.hl7v2.model.v23.message.SIU_S12;
import  ca.uhn.hl7v2.model.v23.message.SIU_S13;
import  ca.uhn.hl7v2.model.v23.message.SIU_S14;
import  ca.uhn.hl7v2.model.v23.message.SIU_S15;
import  ca.uhn.hl7v2.model.v23.message.SIU_S16;
import  ca.uhn.hl7v2.model.v23.message.SIU_S17;
import  ca.uhn.hl7v2.model.v23.message.SIU_S18;
import  ca.uhn.hl7v2.model.v23.message.SIU_S19;
import  ca.uhn.hl7v2.model.v23.message.SIU_S20;
import  ca.uhn.hl7v2.model.v23.message.SIU_S21;
import  ca.uhn.hl7v2.model.v23.message.SIU_S22;
import  ca.uhn.hl7v2.model.v23.message.SIU_S23;
import  ca.uhn.hl7v2.model.v23.message.SIU_S24;
import  ca.uhn.hl7v2.model.v23.message.SIU_S26;
import  ca.uhn.hl7v2.model.v23.segment.MSH;
import  ca.uhn.hl7v2.model.v23.segment.SCH;
import  ca.uhn.hl7v2.model.v23.segment.NTE;
import  ca.uhn.hl7v2.model.v23.segment.PID;
import  ca.uhn.hl7v2.model.v23.segment.PV1;
import  ca.uhn.hl7v2.model.v23.segment.PV2;
import  ca.uhn.hl7v2.model.v23.segment.OBX;
import  ca.uhn.hl7v2.model.v23.segment.DG1;
import  ca.uhn.hl7v2.model.v23.segment.RGS;
import  ca.uhn.hl7v2.model.v23.segment.AIS;
import  ca.uhn.hl7v2.model.v23.message.ORM_O01;
import  ca.uhn.hl7v2.model.v23.message.ORR_O02;
import  ca.uhn.hl7v2.model.v23.message.ORU_R01;
import  ca.uhn.hl7v2.model.v23.group.ORU_R01_OBSERVATION;
//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class Hapi extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Hapi() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Hapi(Script aScript) {

    super(aScript);

  }
      
public HapiContext iHapiContext = new DefaultHapiContext();
public int iSequence = 0;

public void execute() {


//    iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\Disability_Benefit_Questionnaire_Claims-2.0rc2.iepd\\XMLsamples\\2.0\\MinimalGenericDbq.xml");

//    iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\Disability_Benefit_Questionnaire_Claims-2.0rc2.iepd\\XMLsamples\\2.0\\GenericDbqWithEnhancements.xml");
    iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\Disability_Benefit_Questionnaire_Claims-2.0rc2.iepd\\XMLsamples\\2.0\\GeneralMedicalSeparationHealthAssessmentSample.xml");
//    iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\HL7\\SHA_DBQ_v19_3.xml");
//    iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\HL7\\DBQ\\Disability_Benefit_Questionnaire_Claims-2.0rc2.iepd\\XMLsamples\\2.0\\GeneralMedicalSeparationHealthAssessmentSample.xml");
//  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\ExamManagement-3.0rc5.iepd\\XMLschemas\\exchange\\ExamManagement-3.0.xsd");
//  iSymbolTable.parseXml("C:\\ArchitectsCompanion\\jac2017\\app\\ehrm\\HapiTest.xml");
//  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\ExamManagement-3.0rc5.iepd\\XMLsamples\\3.0\\basic_exam_schedule_request\\1_ExamSchedulingRequestCreatedEvent.xml");
//  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\ExamManageme//nt-3.0rc5.iepd\\XMLsamples\\3.0\\basic_exam_schedule_request\\1_ExamSchedulingRequestCreatedEvent_HL7Map.xml");
//  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\ExamManageme//nt-3.0rc5.iepd\\XMLsamples\\3.0\\basic_exam_schedule_request\\1_ExamSchedulingRequestCreatedEvent.xml");

//  PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection();

//  iterateSymbolTable(iSymbolTable.getPropertyCollection(), "em~ExamManagementEventNotification", "");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~A1:A2=<![A1:A2]!>
iOutputManager.println("A1:A2=" + iSymbolTable.translateProperties("[A1:A2]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//<A1 A2="2" A3="3">1
//  <A4 A5="5"/>4
//  <A6>6</A6>
//</A1>

  PropertyCollection lPropertyCollection = iSymbolTable.getPropertyCollection(); 
  PropertyValues lPropertyValues = lPropertyCollection.getPropertyValues("cld~Claim", false);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~lPropertyValues = <!%lPropertyValues.getName()!>
iOutputManager.println("lPropertyValues = " + lPropertyValues.getName() + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  iOutputManager.openOutputFile("C:\\ArchitectsCompanion\\jac2017\\app\\ehrm\\HapiOut2 GeneralMedicalSeparationHealthAssessmentSample.csv", false);
  iOutputManager.closeOutputFile();


//  iOutputManager.openOutputFile("C:\\ArchitectsCompanion\\jac2017\\app\\ehrm\\HapiOut.xml", false);
  iteratePropertyValues(lPropertyValues, lPropertyValues.getName(), "");
//  iOutputManager.closeOutputFile();

//  iteratePropertyValue(lPropertyValue, "ExamManagementEventNotification", "");
//  iterateSymbolTable(iSymbolTable);

//  iOutputManager.closeOutputFile();

}

public void iterateSymbolTableB(SymbolTable aSymbolTable) {

// Get the root PropertyCollection from SymbolTable

  PropertyCollection lPropertyCollection = aSymbolTable.getPropertyCollection(); 

// Get the LinkedHashMap from the PropertyCollection object; then Set; then Iterator
// This will allow iteration in FIFO order
  LinkedHashMap lMap = (LinkedHashMap) lPropertyCollection.getProperties();
  Set lSet = lMap.entrySet();
  Iterator lIterator = lSet.iterator();


  while (lIterator.hasNext()) {
    PropertyValues lPropertyValues = (PropertyValues) ((Map.Entry)lIterator.next()).getValue();

    lPropertyValues.resetIterator(0);
    int lSize = lPropertyValues.size();

    for (int lIdx = 1; lIdx <= lSize; lIdx++) {
      PropertyValue lPropertyValue = lPropertyValues.get(lIdx);
      Object lValueObject = lPropertyValue.getValueObject();
      PropertyCollection lPropertyCollection2 = lPropertyValue.getPropertyCollection();
      if (lPropertyCollection2 != null) {
        iteratePropertyCollection(lPropertyCollection2, lPropertyValues.getName(), " ");
      }
    }
  }  
}

public void iterateSymbolTable(SymbolTable aSymbolTable) {

// Symbol table has a PropertyCollection

  PropertyCollection lPropertyCollection = aSymbolTable.getPropertyCollection(); 
  iteratePropertyCollection(lPropertyCollection, lPropertyCollection.getName(), " ");
  
}

public void iteratePropertyCollection(PropertyCollection aPropertyCollection, String aName, String aIndent) {

// PropertyCollection has Name and LinkedHashList of Named PropertyValues

  LinkedHashMap lMap = (LinkedHashMap) aPropertyCollection.getProperties();
  Set lSet = lMap.entrySet();
  Iterator lIterator = lSet.iterator();

  while (lIterator.hasNext()) {
    PropertyValues lPropertyValues = (PropertyValues) ((Map.Entry)lIterator.next()).getValue();
    iteratePropertyValues(lPropertyValues, lPropertyValues.getName(), aIndent + " ");
  }

}

public void iteratePropertyValues(PropertyValues aPropertyValues, String aName, String aIndent) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  iSequence++;
  int lSequence = iSequence;
      
  int lChar = aName.indexOf('~');
  if (lChar > -1) {
    aName = aName.substring(lChar+1);
  }
  
  aPropertyValues.resetIterator(0);
  int lSize = aPropertyValues.size();

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%aIndent!><<!%aName!>><%
iOutputManager.println("" + aIndent + "<" + aName + ">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  for (int lIdx = 1; lIdx <= lSize; lIdx++) {
    PropertyValue lPropertyValue = aPropertyValues.get(lIdx);
    iteratePropertyValue(lPropertyValue, aName, aIndent + " ");
  }

//ScriptWriter~~//<HL7 Message="" Segment=""/></<!%aName!>>
//<HL7 Message="" Segment=""/></iSymbolTable.translateProperties(aName)>

  if (lSequence == iSequence) {
//ScriptWriter~~%>@@@@</<!%aName!>><%
{
//ScriptWriter~~~
iOutputManager.println("@@@@</" + aName + ">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<!%aIndent!></<!%aName!>><%
iOutputManager.println("" + aIndent + "</" + aName + ">", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }
  
}

public void iteratePropertyValue(PropertyValue aPropertyValue, String aName, String aIndent) {

  Object lValueObject = aPropertyValue.getValueObject();

//ScriptWriter~~//<!%lValueObject!>
//iSymbolTable.translateProperties(lValueObject)
//ScriptWriter~~%>%%%%<!%aName!>****<!%aPropertyValue.getValueString()!><%
{
//ScriptWriter~~~
iOutputManager.println("%%%%" + aName + "****" + aPropertyValue.getValueString() + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  if (aName.trim().length() > 0 && aPropertyValue.getValueString().trim().length() > 0) {
  iOutputManager.openOutputFile("C:\\ArchitectsCompanion\\jac2017\\app\\ehrm\\HapiOut2 GeneralMedicalSeparationHealthAssessmentSample.csv", true);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%aName!>,<!%aPropertyValue.getValueString()!>
iOutputManager.println("" + aName + "," + aPropertyValue.getValueString() + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  iOutputManager.closeOutputFile();
} else if (aName.trim().length() > 0 && aPropertyValue.getValueString().trim().length() == 0) {
  iOutputManager.openOutputFile("C:\\ArchitectsCompanion\\jac2017\\app\\ehrm\\HapiOut2 GeneralMedicalSeparationHealthAssessmentSample.csv", true);
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<!%aName!>
iOutputManager.println("" + aName + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  iOutputManager.closeOutputFile();
}

  PropertyCollection lPropertyCollection = aPropertyValue.getPropertyCollection();
  if (lPropertyCollection != null) {
    iteratePropertyCollection(lPropertyCollection, aName, aIndent + " ");
  }
  
}



public void executexx() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~schemaLocation                ** <![em~ExamManagementEventNotification:xsi~schemaLocation]!> **
iOutputManager.println("schemaLocation                ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:xsi~schemaLocation]") + " **", true);
//ScriptWriter~~participatingSystemName       ** <![em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName]!> **
iOutputManager.println("participatingSystemName       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName]") + " **", true);
//ScriptWriter~~-hl7Msg                       ** <![em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName:hl7:Message]!> **
iOutputManager.println("-hl7Msg                       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName:hl7:Message]") + " **", true);
//ScriptWriter~~-hl7Seg                       ** <![em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName:hl7:Segment]!> **
iOutputManager.println("-hl7Seg                       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName:hl7:Segment]") + " **", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~participatingSystemName       ** <![em~ExamManagementEventNotification:em~Destination:participatingSystemName]!> ** VBA Contractor
iOutputManager.println("participatingSystemName       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~Destination:participatingSystemName]") + " ** VBA Contractor", true);
//ScriptWriter~~contractorName                ** <![em~ExamManagementEventNotification:em~Destination:contractorName]!> ** QTC1
iOutputManager.println("contractorName                ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~Destination:contractorName]") + " ** QTC1", true);
//ScriptWriter~~                              
iOutputManager.println("                              ", true);
//ScriptWriter~~eventUuid                     ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:eventUuid]!> **
iOutputManager.println("eventUuid                     ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:eventUuid]") + " **", true);
//ScriptWriter~~eventDtg                      ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:eventDtg]!> **
iOutputManager.println("eventDtg                      ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:eventDtg]") + " **", true);
//ScriptWriter~~modelVersion                  ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:modelVersion]!> **
iOutputManager.println("modelVersion                  ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:modelVersion]") + " **", true);
//ScriptWriter~~previousEventUuid             ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:previousEventUuid]!> **
iOutputManager.println("previousEventUuid             ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:previousEventUuid]") + " **", true);
//ScriptWriter~~examSchedulingRequestUuid     ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:examSchedulingRequestUuid]!> **
iOutputManager.println("examSchedulingRequestUuid     ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:examSchedulingRequestUuid]") + " **", true);
//ScriptWriter~~-hl7Msg                       ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:examSchedulingRequestUuid:hl7:Message]!> **
iOutputManager.println("-hl7Msg                       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:examSchedulingRequestUuid:hl7:Message]") + " **", true);
//ScriptWriter~~-hl7Seg                       ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:examSchedulingRequestUuid:hl7:Segment]!> **
iOutputManager.println("-hl7Seg                       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:examSchedulingRequestUuid:hl7:Segment]") + " **", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~participatingSystemName       ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~EventSource:participatingSystemName]!> ** VBMS2
iOutputManager.println("participatingSystemName       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~EventSource:participatingSystemName]") + " ** VBMS2", true);
//ScriptWriter~~-hl7Msg                       ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~EventSource:participatingSystemName:hl7:Message]!> **
iOutputManager.println("-hl7Msg                       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~EventSource:participatingSystemName:hl7:Message]") + " **", true);
//ScriptWriter~~-hl7Seg                       ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~EventSource:participatingSystemName:hl7:Segment]!> **
iOutputManager.println("-hl7Seg                       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~EventSource:participatingSystemName:hl7:Segment]") + " **", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~PostDischargeClaimInformation ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:claimDate]!> **
iOutputManager.println("PostDischargeClaimInformation ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:claimDate]") + " **", true);
//ScriptWriter~~-VeteranServiceMemberInfo     ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:em~VeteranServiceMemberInfo:fullName]!> **
iOutputManager.println("-VeteranServiceMemberInfo     ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:em~VeteranServiceMemberInfo:fullName]") + " **", true);
//ScriptWriter~~--Address                     ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:em~VeteranServiceMemberInfo:em~Address:em~Address1]!> **
iOutputManager.println("--Address                     ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:em~VeteranServiceMemberInfo:em~Address:em~Address1]") + " **", true);
//ScriptWriter~~--Phone                       ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:em~VeteranServiceMemberInfo:em~Phone:primaryPhone]!> **
iOutputManager.println("--Phone                       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:em~VeteranServiceMemberInfo:em~Phone:primaryPhone]") + " **", true);
//ScriptWriter~~--PeriodsOfService            ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:em~VeteranServiceMemberInfo:em~PeriodsOfService:em~Period:branchOfService]!> **
iOutputManager.println("--PeriodsOfService            ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~PostDischargeClaimInformation:em~VeteranServiceMemberInfo:em~PeriodsOfService:em~Period:branchOfService]") + " **", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~ExamRelatedContentions        ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:examRelatedContentionUuid]!> **
iOutputManager.println("ExamRelatedContentions        ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:examRelatedContentionUuid]") + " **", true);
//ScriptWriter~~-ContentionName               ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~ContentionName]!> **
iOutputManager.println("-ContentionName               ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~ContentionName]") + " **", true);
//ScriptWriter~~-Classification               ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~Classification:code]!> **
iOutputManager.println("-Classification               ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~Classification:code]") + " **", true);
//ScriptWriter~~--name                        ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~Classification:name]!> **
iOutputManager.println("--name                        ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~Classification:name]") + " **", true);
//ScriptWriter~~-DbqRequest                   ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~DbqRequests:em~DbqRequest:name]!> **
iOutputManager.println("-DbqRequest                   ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~DbqRequests:em~DbqRequest:name]") + " **", true);
//ScriptWriter~~--NarrativeEntry              ** <![em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~DbqRequests:em~DbqRequest:em~NarrativeEntry]!> **
iOutputManager.println("--NarrativeEntry              ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~ExamSchedulingRequestCreatedEvent:em~ExamRelatedContentions:em~ExamRelatedContention:em~DbqRequests:em~DbqRequest:em~NarrativeEntry]") + " **", true);
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

public SIU_S12 createSIU_S12Message(String aSendingApplication,
                                    String aSendingFacility,
                                    String aReceivingApplication,
                                    String aReceivingFacility
                                   ) {

  SIU_S12 lSIU_S12 = null;
  
  try {
    lSIU_S12 = new SIU_S12();

    MSH lmshSegment = lSIU_S12.getMSH();
    lmshSegment.getFieldSeparator().setValue("|");
    lmshSegment.getEncodingCharacters().setValue("^~\\&");
//ScriptWriter~~    lmshSegment.getSendingApplication().getNamespaceID().setValue(<![em~ExamManagementEventNotification:em~Destination:participatingSystemName]!>);
    lmshSegment.getSendingApplication().getNamespaceID().setValue(iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~Destination:participatingSystemName]"));
//ScriptWriter~~    lmshSegment.getSendingFacility().getNamespaceID().setValue(<![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]!>);
    lmshSegment.getSendingFacility().getNamespaceID().setValue(iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]"));
//ScriptWriter~~    lmshSegment.getReceivingApplication().getNamespaceID().setValue(<![em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName]!>);
    lmshSegment.getReceivingApplication().getNamespaceID().setValue(iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName]"));
//ScriptWriter~~    lmshSegment.getReceivingFacility().getNamespaceID().setValue(<![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]!>);
    lmshSegment.getReceivingFacility().getNamespaceID().setValue(iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]"));
//    lmshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue(currentDateTimeString);
    lmshSegment.getMessageControlID().setValue(getSequenceNumber());
//    lmshSegment.getVersionID().getVersionID().setValue("2.3");

  }
  catch(Exception e) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Here Exception <!%e!>
iOutputManager.println("Here Exception " + e + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  }

    return lSIU_S12;
    
}

 
public void execute1() {

  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\ExamManagement-3.0rc5.iepd\\XMLsamples\\3.0\\basic_exam_schedule_request_with_mult_contentions\\1_ExamSchedulingRequestCreatedEvent.xml");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~participatingSystemName   ** <![em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName]!> **
iOutputManager.println("participatingSystemName   ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName]") + " **", true);
//ScriptWriter~~contractorName            ** <![em~ExamManagementEventNotification:em~OriginatingSystem:contractorName]!> **
iOutputManager.println("contractorName            ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~OriginatingSystem:contractorName]") + " **", true);
//ScriptWriter~~participatingSystemName   ** <![em~ExamManagementEventNotification:em~Destination:participatingSystemName]!> **
iOutputManager.println("participatingSystemName   ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~Destination:participatingSystemName]") + " **", true);
//ScriptWriter~~eventUuid                 ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:eventUuid]!> **
iOutputManager.println("eventUuid                 ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:eventUuid]") + " **", true);
//ScriptWriter~~eventDtg                  ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:eventDtg]!> **
iOutputManager.println("eventDtg                  ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:eventDtg]") + " **", true);
//ScriptWriter~~examName                  ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:examName]!> **
iOutputManager.println("examName                  ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:examName]") + " **", true);
//ScriptWriter~~modelVersion              ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:modelVersion]!> **
iOutputManager.println("modelVersion              ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:modelVersion]") + " **", true);
//ScriptWriter~~examAppointmentUuid       ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:examAppointmentUuid]!> **
iOutputManager.println("examAppointmentUuid       ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:examAppointmentUuid]") + " **", true);
//ScriptWriter~~scheduledDateTime         ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:scheduledDateTime]!> **
iOutputManager.println("scheduledDateTime         ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:scheduledDateTime]") + " **", true);
//ScriptWriter~~previousEventUuid         ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:previousEventUuid]!> **
iOutputManager.println("previousEventUuid         ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:previousEventUuid]") + " **", true);
//ScriptWriter~~examSchedulingRequestUuid ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:examSchedulingRequestUuid]!> **
iOutputManager.println("examSchedulingRequestUuid ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:examSchedulingRequestUuid]") + " **", true);
//ScriptWriter~~id                        ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:id]!> **
iOutputManager.println("id                        ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:id]") + " **", true);
//ScriptWriter~~name                      ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]!> **
iOutputManager.println("name                      ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]") + " **", true);
//ScriptWriter~~Address1                  ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~Address1]!> **
iOutputManager.println("Address1                  ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~Address1]") + " **", true);
//ScriptWriter~~City                      ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~City]!> **
iOutputManager.println("City                      ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~City]") + " **", true);
//ScriptWriter~~State                     ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~State]!> **
iOutputManager.println("State                     ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~State]") + " **", true);
//ScriptWriter~~ZipOrPostalCode           ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~ZipOrPostalCode]!> **
iOutputManager.println("ZipOrPostalCode           ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~ZipOrPostalCode]") + " **", true);
//ScriptWriter~~Country                   ** <![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~Country]!> **
iOutputManager.println("Country                   ** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:em~Address:em~Country]") + " **", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  try {
    SIU_S12 lSIU_S12 = new SIU_S12();

    MSH lmshSegment = lSIU_S12.getMSH();
    lmshSegment.getFieldSeparator().setValue("|");
    lmshSegment.getEncodingCharacters().setValue("^~\\&");
//ScriptWriter~~    lmshSegment.getSendingApplication().getNamespaceID().setValue(<![em~ExamManagementEventNotification:em~Destination:participatingSystemName]!>);
    lmshSegment.getSendingApplication().getNamespaceID().setValue(iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~Destination:participatingSystemName]"));
//ScriptWriter~~    lmshSegment.getSendingFacility().getNamespaceID().setValue(<![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]!>);
    lmshSegment.getSendingFacility().getNamespaceID().setValue(iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]"));
//ScriptWriter~~    lmshSegment.getReceivingApplication().getNamespaceID().setValue(<![em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName]!>);
    lmshSegment.getReceivingApplication().getNamespaceID().setValue(iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~OriginatingSystem:participatingSystemName]"));
//ScriptWriter~~    lmshSegment.getReceivingFacility().getNamespaceID().setValue(<![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]!>);
    lmshSegment.getReceivingFacility().getNamespaceID().setValue(iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:em~ExaminingFacility:name]"));
//    lmshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue(currentDateTimeString);
    lmshSegment.getMessageControlID().setValue(getSequenceNumber());
//    lmshSegment.getVersionID().getVersionID().setValue("2.3");

    SCH lschSegment = lSIU_S12.getSCH();
//ScriptWriter~~    lschSegment.getFillerAppointmentID().getUniversalID().setValue(<![em~ExamManagementEventNotification:em~AppointmentScheduledEvent:eventUuid]!>);
    lschSegment.getFillerAppointmentID().getUniversalID().setValue(iSymbolTable.translateProperties("[em~ExamManagementEventNotification:em~AppointmentScheduledEvent:eventUuid]"));

    // Now, let's encode the message and look at the output
    Parser lParser = iHapiContext.getPipeParser();
    String lEncodedMessage = lParser.encode(lSIU_S12);
    System.out.println("Printing ER7 Encoded Message:");
    System.out.println(lEncodedMessage);

    // Next, let's use the XML parser to encode as XML
    lParser = iHapiContext.getXMLParser();
    lEncodedMessage = lParser.encode(lSIU_S12);
    System.out.println("Printing XML Encoded Message:");
    System.out.println(lEncodedMessage);

  }
  catch(Exception e) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Here Exception <!%e!>
iOutputManager.println("Here Exception " + e + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }
  
}

public void executex() {

  iHapiContext.setValidationRuleBuilder(new NoValidationBuilder());
  Message lMessage = null;
  SIU_S12 lSIU_S12 = null;
  
  try {
    //  Block of code to try
    lSIU_S12 = (SIU_S12) createMessage("SIU_S12");

    // Populate the MSH Segment
//    MSH lMshSegment = lSIU_S12.getMSH();
//    lMshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
//    lMshSegment.getSequenceNumber().setValue("123");

    MSH mshSegment = lSIU_S12.getMSH();
    mshSegment.getFieldSeparator().setValue("|");
    mshSegment.getEncodingCharacters().setValue("^~\\\\&");
    mshSegment.getSendingApplication().getNamespaceID().setValue("Our System");
    mshSegment.getSendingFacility().getNamespaceID().setValue("Our Facility");
    mshSegment.getReceivingApplication().getNamespaceID().setValue("Their Remote System");
    mshSegment.getReceivingFacility().getNamespaceID().setValue("Their Remote Facility");
//    mshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue(currentDateTimeString);
    mshSegment.getMessageControlID().setValue(getSequenceNumber());
//    mshSegment.getVersionID().getVersionID().setValue("2.4");
   

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Here1
iOutputManager.println("Here1", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


    // Now, let's encode the message and look at the output
    Parser lParser = iHapiContext.getPipeParser();
    String lEncodedMessage = lParser.encode(lSIU_S12);
    System.out.println("Printing ER7 Encoded Message:");
    System.out.println(lEncodedMessage);

    // Next, let's use the XML parser to encode as XML
    lParser = iHapiContext.getXMLParser();
    lEncodedMessage = lParser.encode(lSIU_S12);
    System.out.println("Printing XML Encoded Message:");
    System.out.println(lEncodedMessage);

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Here1a
iOutputManager.println("Here1a", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }
  catch(Exception e) {
    //  Block of code to handle errors
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~Here Exception <!%e!>
iOutputManager.println("Here Exception " + e + "", true);
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
//ScriptWriter~~Here2
iOutputManager.println("Here2", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


}

public Message createMessage(String aMessageType) throws HL7Exception {

  if (aMessageType.equals("SIU_S12")) {
    return mySIUMessageBuilder();
  }

// Consider throwing not handled exception

  return null;
  
}

public Message mySIUMessageBuilder() throws HL7Exception {

  return new SIU_S12();

}

public void createMshSegment(String currentDateTimeString) throws DataTypeException {
//  MSH mshSegment = _adtMessage.getMSH();
//  mshSegment.getFieldSeparator().setValue("|");
//  mshSegment.getEncodingCharacters().setValue("^~\\\\&");
//  mshSegment.getSendingApplication().getNamespaceID().setValue("Our System");
//  mshSegment.getSendingFacility().getNamespaceID().setValue("Our Facility");
//  mshSegment.getReceivingApplication().getNamespaceID().setValue("Their Remote System");
//  mshSegment.getReceivingFacility().getNamespaceID().setValue("Their Remote Facility");
//  mshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue(currentDateTimeString);
//  mshSegment.getMessageControlID().setValue(getSequenceNumber());
//  mshSegment.getVersionID().getVersionID().setValue("2.4");
}

private String getCurrentTimeStamp() {
  return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
}

private String getSequenceNumber() {
  String facilityNumberPrefix = "1234"; // some arbitrary prefix for the facility
  return facilityNumberPrefix.concat(getCurrentTimeStamp());
}

}
