//ScriptWriter~~package <#[$jac:script:package]#>;
package jacLicense;

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

import  javax.crypto.*;
import  javax.crypto.spec.*;
import  java.net.InetAddress;
//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class makeLicense extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected makeLicense() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public makeLicense(Script aScript) {

    super(aScript);

  }
private Script script;
private SymbolTable iSymbolTable;
private OutputManager outputManager;
private PropertyHelper propertyHelper;
private Log log;
private int logClass = 0;

  public void execute(String scriptArguments[]) {

    iSymbolTable.parseXml( iSymbolTable.getWorkFilePath("jacLicense.") + "VBALicense.xml");

    PBEKeySpec lPBEKeySpec;
    PBEParameterSpec lPBEParamSpec;
    SecretKeyFactory lSecretKeyFactory;

    // Salt must be eight bytes long.
    String lSaltString = "ac500000";
    byte[] lSalt = lSaltString.getBytes();

    int lCount = 5;

    iSymbolTable.getPropertyCollection().replacePropertyValue("jacLicense:product", new PropertyValue("jac"));
    iSymbolTable.getPropertyCollection().replacePropertyValue("jacLicense:from", new PropertyValue(""));
    iSymbolTable.getPropertyCollection().replacePropertyValue("jacLicense:to", new PropertyValue("2004.12.31"));
    iSymbolTable.getPropertyCollection().replacePropertyValue("jacLicense:name", new PropertyValue("Veterans Benefits Administration"));
    iSymbolTable.getPropertyCollection().replacePropertyValue("jacLicense:email", new PropertyValue("vba.va.gov"));
    iSymbolTable.getPropertyCollection().replacePropertyValue("jacLicense:options", new PropertyValue(""));
    try {
      InetAddress address = InetAddress.getLocalHost();
      iSymbolTable.getPropertyCollection().replacePropertyValue("jacLicense:host", new PropertyValue(address.getHostName().toLowerCase()));
      if (!iSymbolTable.getPropertyCollection().getPropertyValue("jacLicense:host", 0).getValueString().startsWith("317")) {
          System.out.println("Invalid host name.");
          return;
      }
    } catch (Exception lException) {   System.out.println("Invalid host name exception.");
                                       return; }

    String lCheck =
        iSymbolTable.getPropertyCollection().getPropertyValue("jacLicense:from", 0).getValueString() +
        iSymbolTable.getPropertyCollection().getPropertyValue("jacLicense:to", 0).getValueString() +
        iSymbolTable.getPropertyCollection().getPropertyValue("jacLicense:options", 0).getValueString() +
        iSymbolTable.getPropertyCollection().getPropertyValue("jacLicense:host", 0).getValueString() +
        iSymbolTable.getPropertyCollection().getPropertyValue("jacLicense:email", 0).getValueString() +
        iSymbolTable.getPropertyCollection().getPropertyValue("jacLicense:name", 0).getValueString();
    char[] lCheckChar = new char[lCheck.length()];
    lCheck.getChars(0, lCheck.length(), lCheckChar, 0);

    try {
        lPBEParamSpec = new PBEParameterSpec(lSalt, lCount);
        lPBEKeySpec = new PBEKeySpec(lCheckChar);
        lSecretKeyFactory = SecretKeyFactory.getInstance("PBEWithMD5AndDES");
        SecretKey lSecretKey = lSecretKeyFactory.generateSecret(lPBEKeySpec);
        Cipher lCipher = Cipher.getInstance("PBEWithMD5AndDES");
        lCipher.init(Cipher.ENCRYPT_MODE, lSecretKey, lPBEParamSpec);
        byte[] lClearText = new String(lCheck).getBytes();
        byte[] lCipherText = lCipher.doFinal(lClearText);
        String lCipherString = new Long(lCipherText.length).toString();
        for (int l=0; l<lCipherText.length; l++) {
            lCipherString = lCipherString.concat(new Byte(lCipherText[l]).toString()) + new Long(l).toString();
        }
//ScriptWriter~~        <!jacLicense:key!>!reset(lCipherString);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("jacLicense:key")).reset(lCipherString);

        } catch (Exception lException) {
            System.err.println("***************** FAILED!");
            return;
        }

//ScriptWriter~~    <!$outputFile!>!reset(iSymbolTable.getWorkFilePath("jacLicense.") + "license.xml");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$outputFile")).reset(iSymbolTable.getWorkFilePath("jacLicense.") + "license.xml");
//ScriptWriter~~    script.delete(<![$outputFile]!>);
    script.delete(iSymbolTable.translateProperties("[$outputFile]"));
//ScriptWriter~~//    outputManager.openOutputFile(<![$outputFile]!>, true);
//    outputManager.openOutputFile(iSymbolTable.translateProperties("[$outputFile]"), true);

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~<license>
iOutputManager.println("<license>", true);
//ScriptWriter~~  <<![jacLicense:product]!>>
iOutputManager.println("  <" + iSymbolTable.translateProperties("[jacLicense:product]") + ">", true);
//ScriptWriter~~    <from><![jacLicense:from]!></from>
iOutputManager.println("    <from>" + iSymbolTable.translateProperties("[jacLicense:from]") + "</from>", true);
//ScriptWriter~~    <to><![jacLicense:to]!></to>
iOutputManager.println("    <to>" + iSymbolTable.translateProperties("[jacLicense:to]") + "</to>", true);
//ScriptWriter~~    <options><![jacLicense:options]!></options>
iOutputManager.println("    <options>" + iSymbolTable.translateProperties("[jacLicense:options]") + "</options>", true);
//ScriptWriter~~    <host><![jacLicense:host]!></host>
iOutputManager.println("    <host>" + iSymbolTable.translateProperties("[jacLicense:host]") + "</host>", true);
//ScriptWriter~~    <email><![jacLicense:email]!></email>
iOutputManager.println("    <email>" + iSymbolTable.translateProperties("[jacLicense:email]") + "</email>", true);
//ScriptWriter~~    <name><![jacLicense:name]!></name>
iOutputManager.println("    <name>" + iSymbolTable.translateProperties("[jacLicense:name]") + "</name>", true);
//ScriptWriter~~    <key><![jacLicense:key]!></key>
iOutputManager.println("    <key>" + iSymbolTable.translateProperties("[jacLicense:key]") + "</key>", true);
//ScriptWriter~~  </<![jacLicense:product]!>>
iOutputManager.println("  </" + iSymbolTable.translateProperties("[jacLicense:product]") + ">", true);
//ScriptWriter~~</license>
iOutputManager.println("</license>", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  }
}
