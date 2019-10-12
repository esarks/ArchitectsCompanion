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

import  ca.uhn.hl7v2.DefaultHapiContext;
import  ca.uhn.hl7v2.HL7Exception;
import  ca.uhn.hl7v2.HapiContext;
import  ca.uhn.hl7v2.model.v24.message.ADT_A01;
import  ca.uhn.hl7v2.model.v24.segment.MSH;
import  ca.uhn.hl7v2.model.v24.segment.PID;
import  ca.uhn.hl7v2.model.v24.datatype.PN;
import  ca.uhn.hl7v2.model.v24.segment.MSH;
import  ca.uhn.hl7v2.parser.EncodingNotSupportedException;
import  ca.uhn.hl7v2.parser.Parser;
import  ca.uhn.hl7v2.model.Message;
//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class Parse extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected Parse() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public Parse(Script aScript) {

    super(aScript);

  }


public void execute() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\ExamManagement-3.0rc5.iepd\\XMLsamples\\3.0\\files.xml");

//ScriptWriter~~  <!files!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("files")).resetIterator();
//ScriptWriter~~  <!files:folder!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("files:folder")).resetIterator();
  
//ScriptWriter~~  while (<!files:folder!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("files:folder")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<![files:folder:name]!>
iOutputManager.println("" + iSymbolTable.translateProperties("[files:folder:name]") + "", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!files:folder:file!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("files:folder:file")).resetIterator();
    
//ScriptWriter~~    while (<!files:folder:file!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("files:folder:file")).next()) {

//ScriptWriter~~      iSymbolTable.parseXml(<![files:folder:name]!> + "\\" + <![files:folder:file]!>);
      iSymbolTable.parseXml(iSymbolTable.translateProperties("[files:folder:name]") + "\\" + iSymbolTable.translateProperties("[files:folder:file]"));

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~*** <![files:folder:file]!> *** <![em~ExamManagementEventNotification:xsi~schemaLocation]!> ***
iOutputManager.println("*** " + iSymbolTable.translateProperties("[files:folder:file]") + " *** " + iSymbolTable.translateProperties("[em~ExamManagementEventNotification:xsi~schemaLocation]") + " ***", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    }


  }

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


}

public void execute1() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  iSymbolTable.parseXml("C:\\Users\\ptm\\OneDrive\\Desktop\\EHRM\\ExamManagement-3.0rc5.iepd\\XMLschemas\\extension\\ExamManagementTypes-3.0.xsd");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~*** <![xs~schema:targetNamespace]!> ***
iOutputManager.println("*** " + iSymbolTable.translateProperties("[xs~schema:targetNamespace]") + " ***", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~********************************
iOutputManager.println("********************************", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


}

public void execute2() throws Exception {

//ScriptWriter~~%>**1**<%
{
//ScriptWriter~~~
iOutputManager.println("**1**", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        ADT_A01 adt = new ADT_A01();
//ScriptWriter~~%>**2**<%
{
//ScriptWriter~~~
iOutputManager.println("**2**", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        adt.initQuickstart("ADT", "A01", "P");
//ScriptWriter~~%>**3**<%
{
//ScriptWriter~~~
iOutputManager.println("**3**", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


// Populate the MSH Segment
   MSH mshSegment = adt.getMSH();
   mshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
   mshSegment.getSequenceNumber().setValue("123");
   
   // Populate the PID Segment
   PID pid = adt.getPID(); 
   pid.getPatientName(0).getFamilyName().getSurname().setValue("Doe");
   pid.getPatientName(0).getGivenName().setValue("John");
   pid.getPatientIdentifierList(0).getID().setValue("123456");

   /*
    * In a real situation, of course, many more segments and fields would be populated
    */
   
   // Now, let's encode the message and look at the output
   HapiContext context = new DefaultHapiContext();
   Parser parser = context.getPipeParser();
   String encodedMessage = parser.encode(adt);
   System.out.println("Printing ER7 Encoded Message:");
   System.out.println(encodedMessage);
   
   /*
    * Prints:
    * 
    * MSH|^~\&|TestSendingSystem||||200701011539||ADT^A01^ADT A01||||123
    * PID|||123456||Doe^John
    */

   // Next, let's use the XML parser to encode as XML
   parser = context.getXMLParser();
   encodedMessage = parser.encode(adt);
   System.out.println("Printing XML Encoded Message:");
   System.out.println(encodedMessage);
   

}

public void execute3() {

        String msg = "MSH|^~\\&|HIS|RIH|EKG|EKG|199904140038||ADT^A01||P|2.2\r"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                + "PID|0001|00009874|00001122|A00977|SMITH^JOHN^M|MOM|19581119|F|NOTREAL^LINDA^M|C|564 SPRING ST^^NEEDHAM^MA^02494^US|0002|(818)565-1551|(425)828-3344|E|S|C|0000444444|252-00-4414||||SA|||SA||||NONE|V1|0001|I|D.ER^50A^M110^01|ER|P00055|11B^M011^02|070615^BATMAN^GEORGE^L|555888^NOTREAL^BOB^K^DR^MD|777889^NOTREAL^SAM^T^DR^MD^PHD|ER|D.WT^1A^M010^01|||ER|AMB|02|070615^NOTREAL^BILL^L|ER|000001916994|D||||||||||||||||GDD|WA|NORM|02|O|02|E.IN^02D^M090^01|E.IN^01D^M080^01|199904072124|199904101200|199904101200||||5555112333|||666097^NOTREAL^MANNY^P\r"
                + "NK1|0222555|NOTREAL^JAMES^R|FA|STREET^OTHER STREET^CITY^ST^55566|(222)111-3333|(888)999-0000|||||||ORGANIZATION\r"                                                                                                                                                                                                                                                                                                                                                                                                                                                
                + "PV1|0001|I|D.ER^1F^M950^01|ER|P000998|11B^M011^02|070615^BATMAN^GEORGE^L|555888^OKNEL^BOB^K^DR^MD|777889^NOTREAL^SAM^T^DR^MD^PHD|ER|D.WT^1A^M010^01|||ER|AMB|02|070615^VOICE^BILL^L|ER|000001916994|D||||||||||||||||GDD|WA|NORM|02|O|02|E.IN^02D^M090^01|E.IN^01D^M080^01|199904072124|199904101200|||||5555112333|||666097^DNOTREAL^MANNY^P\r"                                                                                                                                                                                                                  
                + "PV2|||0112^TESTING|55555^PATIENT IS NORMAL|NONE|||19990225|19990226|1|1|TESTING|555888^NOTREAL^BOB^K^DR^MD||||||||||PROD^003^099|02|ER||NONE|19990225|19990223|19990316|NONE\r"                                                                                                                                                                                                                                                                                                                                                                                   
                + "AL1||SEV|001^POLLEN\r"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                + "GT1||0222PL|NOTREAL^BOB^B||STREET^OTHER STREET^CITY^ST^77787|(444)999-3333|(222)777-5555||||MO|111-33-5555||||NOTREAL GILL N|STREET^OTHER STREET^CITY^ST^99999|(111)222-3333\r"                                                                                                                                                                                                                                                                                                                                                                                   
                + "IN1||022254P|4558PD|BLUE CROSS|STREET^OTHER STREET^CITY^ST^00990||(333)333-6666||221K|LENIX|||19980515|19990515|||PATIENT01 TEST D||||||||||||||||||02LL|022LP554";                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        /*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
         * The HapiContext holds all configuration and provides factory methods for obtaining                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
         * all sorts of HAPI objects, e.g. parsers.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
         */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        HapiContext context = new DefaultHapiContext();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        /*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
         * A Parser is used to convert between string representations of messages and instances of                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
         * HAPI's "Message" object. In this case, we are using a "GenericParser", which is able to                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
         * handle both XML and ER7 (pipe & hat) encodings.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
         */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        Parser p = context.getGenericParser();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        Message hapiMsg;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
        try {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
            // The parse method performs the actual parsing                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
            hapiMsg = p.parse(msg);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        } catch (EncodingNotSupportedException e) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
            e.printStackTrace();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
            return;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        } catch (HL7Exception e) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
            e.printStackTrace();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
            return;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        /*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
         * This message was an ADT^A01 is an HL7 data type consisting of several components1, so we                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
         * will cast it as such. The ADT_A01 class extends from Message, providing specialized                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
         * accessors for ADT^A01's segments.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
         *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
         * HAPI provides several versions of the ADT_A01 class, each in a different package (note                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
         * the import statement above) corresponding to the HL7 version for the message.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
         */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        ADT_A01 adtMsg = (ADT_A01)hapiMsg;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        MSH msh = adtMsg.getMSH();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        // Retrieve some data from the MSH segment                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        String msgType = msh.getMessageType().getMessageType().getValue();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
        String msgTrigger = msh.getMessageType().getTriggerEvent().getValue();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        // Prints "ADT A01"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        System.out.println(msgType + " " + msgTrigger);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        /*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
         * Now let's retrieve the patient's name from the parsed message.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
         *                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
         * PN is an HL7 data type consisting of several components, such as                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
         * family name, given name, etc.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
         */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        PN patientName = adtMsg.getPID().getPatientName();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
        // Prints "SMITH"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        String familyName = patientName.getFamilyName().getValue();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        System.out.println(familyName);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
}
