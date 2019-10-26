//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.jac.generators;

import java.util.*;
import java.lang.reflect.*;
import java.io.*;
import java.text.*;
import java.sql.*;
//import java.net.*;
//import javax.net.ssl.*;
//import java.security.*;
import javax.servlet.*;
import javax.servlet.http.*;
//import java.awt.*;
//import javax.swing.*;

import com.esarks.jac.*;
import com.esarks.mic.*;

//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class GenerateFrame extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected GenerateFrame() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public GenerateFrame(Script aScript) {

    super(aScript);

  }

  public void generateFrames(String aXmlDefinition) {

//ScriptWriter~~    <!frames!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames")).remove();
    parseXmlPath(path(aXmlDefinition) + ".xml");
//ScriptWriter~~    if (<!frames!>!size() == 0) return;
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames")).size() == 0) return;

    setContext(iScript.getMasterScript());
//ScriptWriter~~    <!$jac:merge:sectionMarker!>!reset("//$Section=");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:sectionMarker")).reset("//$Section=");
//ScriptWriter~~    <!$jac:merge:preserveMarker!>!reset("$Preserve=yes");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preserveMarker")).reset("$Preserve=yes");
//ScriptWriter~~    <!$jac:merge:noPreserveMarker!>!reset("$Preserve=no");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:noPreserveMarker")).reset("$Preserve=no");
//ScriptWriter~~    <!$jac:merge:keepPreserveMarker!>!reset("$Preserve=keep");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepPreserveMarker")).reset("$Preserve=keep");
//ScriptWriter~~    <!$jac:merge:discardPreserveMarker!>!reset("$Preserve=discard");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:discardPreserveMarker")).reset("$Preserve=discard");
//ScriptWriter~~    <!$jac:merge:preservePreamble!>!reset("yes");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:preservePreamble")).reset("yes");
//ScriptWriter~~    <!$jac:merge:comments!>!reset("//");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:comments")).reset("//");
//ScriptWriter~~    <!$jac:merge:excludeCompare!>!reset("//  Generated at");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:excludeCompare")).reset("//  Generated at");
//ScriptWriter~~    <!$jac:merge:trimOutput!>!reset("yes");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:trimOutput")).reset("yes");
//ScriptWriter~~    <!$jac:merge:keepSections!>!reset("no");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$jac:merge:keepSections")).reset("no");
    restoreContext();

    if (aXmlDefinition.endsWith("_View")) {
      openOutput(path(aXmlDefinition.substring(0,aXmlDefinition.length()-5)) + ".new");
    }
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~//$Section=registerFrames$Preserve=no
iOutputManager.println("//$Section=registerFrames$Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  public void registerFrames() {
iOutputManager.println("  public void registerFrames() {", true);
//ScriptWriter~~    
iOutputManager.println("    ", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~    <!frames:frame!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame")).resetIterator();
//ScriptWriter~~    while (<!frames:frame!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame")).next()) {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    {
iOutputManager.println("    {", true);
//ScriptWriter~~      Frame lFrame = new Frame();
iOutputManager.println("      Frame lFrame = new Frame();", true);
//ScriptWriter~~      lFrame.setName("<![frames:frame:name]!>");
iOutputManager.println("      lFrame.setName(\"" + iSymbolTable.translateProperties("[frames:frame:name]") + "\");", true);
//ScriptWriter~~      lFrame.setTitle("<![frames:frame:title]!>");
iOutputManager.println("      lFrame.setTitle(\"" + iSymbolTable.translateProperties("[frames:frame:title]") + "\");", true);
//ScriptWriter~~      getFrames().add(lFrame);
iOutputManager.println("      getFrames().add(lFrame);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~      <!frames:frame:control!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control")).resetIterator();
//ScriptWriter~~      while (<!frames:frame:control!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control")).next()) {
//ScriptWriter~~        if (<![frames:frame:control:type]!>.compareTo("text") == 0) {
        if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("text") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      {
iOutputManager.println("      {", true);
//ScriptWriter~~        TextControl lControl = new TextControl();
iOutputManager.println("        TextControl lControl = new TextControl();", true);
//ScriptWriter~~        lControl.setName("<![frames:frame:control:name]!>");
iOutputManager.println("        lControl.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "\");", true);
//ScriptWriter~~        lControl.setType("<![frames:frame:control:type]!>");
iOutputManager.println("        lControl.setType(\"" + iSymbolTable.translateProperties("[frames:frame:control:type]") + "\");", true);
//ScriptWriter~~        lControl.setCaption("<![frames:frame:control:caption]!>");
iOutputManager.println("        lControl.setCaption(\"" + iSymbolTable.translateProperties("[frames:frame:control:caption]") + "\");", true);
//ScriptWriter~~        lControl.setGrid("<![frames:frame:control:grid]!>");
iOutputManager.println("        lControl.setGrid(\"" + iSymbolTable.translateProperties("[frames:frame:control:grid]") + "\");", true);
//ScriptWriter~~        lControl.setColumn("<![frames:frame:control:column]!>");
iOutputManager.println("        lControl.setColumn(\"" + iSymbolTable.translateProperties("[frames:frame:control:column]") + "\");", true);
//ScriptWriter~~        lControl.setMaxLength(<![frames:frame:control:maxlength]!>);
iOutputManager.println("        lControl.setMaxLength(" + iSymbolTable.translateProperties("[frames:frame:control:maxlength]") + ");", true);
//ScriptWriter~~        lControl.setSize(<![frames:frame:control:size]!>);
iOutputManager.println("        lControl.setSize(" + iSymbolTable.translateProperties("[frames:frame:control:size]") + ");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    if (<!frames:frame:control:uppercase!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:uppercase")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        lControl.setUppercase(<![frames:frame:control:uppercase]!>);
iOutputManager.println("        lControl.setUppercase(" + iSymbolTable.translateProperties("[frames:frame:control:uppercase]") + ");", true);
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
//ScriptWriter~~        lFrame.addControl(lControl);
iOutputManager.println("        lFrame.addControl(lControl);", true);
//ScriptWriter~~        ControlValue lControlValue = new ControlValue();
iOutputManager.println("        ControlValue lControlValue = new ControlValue();", true);
//ScriptWriter~~        lControl.setControlValue(lControlValue);
iOutputManager.println("        lControl.setControlValue(lControlValue);", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("password") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("password") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      {
iOutputManager.println("      {", true);
//ScriptWriter~~        TextControl lControl = new TextControl();
iOutputManager.println("        TextControl lControl = new TextControl();", true);
//ScriptWriter~~        lControl.setName("<![frames:frame:control:name]!>");
iOutputManager.println("        lControl.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "\");", true);
//ScriptWriter~~        lControl.setType("<![frames:frame:control:type]!>");
iOutputManager.println("        lControl.setType(\"" + iSymbolTable.translateProperties("[frames:frame:control:type]") + "\");", true);
//ScriptWriter~~        lControl.setCaption("<![frames:frame:control:caption]!>");
iOutputManager.println("        lControl.setCaption(\"" + iSymbolTable.translateProperties("[frames:frame:control:caption]") + "\");", true);
//ScriptWriter~~        lControl.setGrid("<![frames:frame:control:grid]!>");
iOutputManager.println("        lControl.setGrid(\"" + iSymbolTable.translateProperties("[frames:frame:control:grid]") + "\");", true);
//ScriptWriter~~        lControl.setColumn("<![frames:frame:control:column]!>");
iOutputManager.println("        lControl.setColumn(\"" + iSymbolTable.translateProperties("[frames:frame:control:column]") + "\");", true);
//ScriptWriter~~        lControl.setMaxLength(<![frames:frame:control:maxlength]!>);
iOutputManager.println("        lControl.setMaxLength(" + iSymbolTable.translateProperties("[frames:frame:control:maxlength]") + ");", true);
//ScriptWriter~~        lControl.setSize(<![frames:frame:control:size]!>);
iOutputManager.println("        lControl.setSize(" + iSymbolTable.translateProperties("[frames:frame:control:size]") + ");", true);
//ScriptWriter~~        lFrame.addControl(lControl);
iOutputManager.println("        lFrame.addControl(lControl);", true);
//ScriptWriter~~        ControlValue lControlValue = new ControlValue();
iOutputManager.println("        ControlValue lControlValue = new ControlValue();", true);
//ScriptWriter~~        lControl.setControlValue(lControlValue);
iOutputManager.println("        lControl.setControlValue(lControlValue);", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("select") == 0 ||
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("select") == 0 ||
//ScriptWriter~~                 <![frames:frame:control:type]!>.compareTo("checkbox") == 0 ||
                 iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("checkbox") == 0 ||
//ScriptWriter~~                 <![frames:frame:control:type]!>.compareTo("radio") == 0) {
                 iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("radio") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      {
iOutputManager.println("      {", true);
//ScriptWriter~~        OptionControl lControl = new OptionControl();
iOutputManager.println("        OptionControl lControl = new OptionControl();", true);
//ScriptWriter~~        lControl.setName("<![frames:frame:control:name]!>");
iOutputManager.println("        lControl.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "\");", true);
//ScriptWriter~~        lControl.setType("<![frames:frame:control:type]!>");
iOutputManager.println("        lControl.setType(\"" + iSymbolTable.translateProperties("[frames:frame:control:type]") + "\");", true);
//ScriptWriter~~        lControl.setCaption("<![frames:frame:control:caption]!>");
iOutputManager.println("        lControl.setCaption(\"" + iSymbolTable.translateProperties("[frames:frame:control:caption]") + "\");", true);
//ScriptWriter~~        lControl.setGrid("<![frames:frame:control:grid]!>");
iOutputManager.println("        lControl.setGrid(\"" + iSymbolTable.translateProperties("[frames:frame:control:grid]") + "\");", true);
//ScriptWriter~~        lControl.setColumn("<![frames:frame:control:column]!>");
iOutputManager.println("        lControl.setColumn(\"" + iSymbolTable.translateProperties("[frames:frame:control:column]") + "\");", true);
//ScriptWriter~~        lFrame.addControl(lControl);
iOutputManager.println("        lFrame.addControl(lControl);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          <!frames:frame:control:option!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:option")).resetIterator();
//ScriptWriter~~          while (<!frames:frame:control:option!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:option")).next()) {
//ScriptWriter~~            int lIterator = <!frames:frame:control:option!>!getIterator();
            int lIterator = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:option")).getIterator();
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        {
iOutputManager.println("        {", true);
//ScriptWriter~~          OptionValue lControlValue = new OptionValue();
iOutputManager.println("          OptionValue lControlValue = new OptionValue();", true);
//ScriptWriter~~          lControlValue.setValue("<![frames:frame:control:option:value]!>");
iOutputManager.println("          lControlValue.setValue(\"" + iSymbolTable.translateProperties("[frames:frame:control:option:value]") + "\");", true);
//ScriptWriter~~          lControlValue.setName("<![frames:frame:control:option]!>");
iOutputManager.println("          lControlValue.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:option]") + "\");", true);
//ScriptWriter~~          lControl.addControlValue(lControlValue);
iOutputManager.println("          lControl.addControlValue(lControlValue);", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
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
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("date") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("date") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      {
iOutputManager.println("      {", true);
//ScriptWriter~~        Control lControl = new Control();
iOutputManager.println("        Control lControl = new Control();", true);
//ScriptWriter~~        lControl.setName("<![frames:frame:control:name]!>");
iOutputManager.println("        lControl.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "\");", true);
//ScriptWriter~~        lControl.setType("<![frames:frame:control:type]!>");
iOutputManager.println("        lControl.setType(\"" + iSymbolTable.translateProperties("[frames:frame:control:type]") + "\");", true);
//ScriptWriter~~        lControl.setCaption("<![frames:frame:control:caption]!>");
iOutputManager.println("        lControl.setCaption(\"" + iSymbolTable.translateProperties("[frames:frame:control:caption]") + "\");", true);
//ScriptWriter~~        lControl.setGrid("<![frames:frame:control:grid]!>");
iOutputManager.println("        lControl.setGrid(\"" + iSymbolTable.translateProperties("[frames:frame:control:grid]") + "\");", true);
//ScriptWriter~~        lControl.setColumn("<![frames:frame:control:column]!>");
iOutputManager.println("        lControl.setColumn(\"" + iSymbolTable.translateProperties("[frames:frame:control:column]") + "\");", true);
//ScriptWriter~~        lFrame.addControl(lControl);
iOutputManager.println("        lFrame.addControl(lControl);", true);
//ScriptWriter~~        DateValue lControlValue = new DateValue();
iOutputManager.println("        DateValue lControlValue = new DateValue();", true);
//ScriptWriter~~        lControl.setControlValue(lControlValue);
iOutputManager.println("        lControl.setControlValue(lControlValue);", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("submit") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("submit") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      {
iOutputManager.println("      {", true);
//ScriptWriter~~        SubmitControl lControl = new SubmitControl();
iOutputManager.println("        SubmitControl lControl = new SubmitControl();", true);
//ScriptWriter~~        lControl.setName("<![frames:frame:control:name]!>");
iOutputManager.println("        lControl.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "\");", true);
//ScriptWriter~~        lControl.setType("<![frames:frame:control:type]!>");
iOutputManager.println("        lControl.setType(\"" + iSymbolTable.translateProperties("[frames:frame:control:type]") + "\");", true);
//ScriptWriter~~        lControl.setCaption("<![frames:frame:control:caption]!>");
iOutputManager.println("        lControl.setCaption(\"" + iSymbolTable.translateProperties("[frames:frame:control:caption]") + "\");", true);
//ScriptWriter~~        lControl.setGrid("<![frames:frame:control:grid]!>");
iOutputManager.println("        lControl.setGrid(\"" + iSymbolTable.translateProperties("[frames:frame:control:grid]") + "\");", true);
//ScriptWriter~~        lControl.setColumn("<![frames:frame:control:column]!>");
iOutputManager.println("        lControl.setColumn(\"" + iSymbolTable.translateProperties("[frames:frame:control:column]") + "\");", true);
//ScriptWriter~~        lFrame.addControl(lControl);
iOutputManager.println("        lFrame.addControl(lControl);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          <!frames:frame:control:button!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:button")).resetIterator();
//ScriptWriter~~          while (<!frames:frame:control:button!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:button")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        {
iOutputManager.println("        {", true);
//ScriptWriter~~          ButtonValue lControlValue = new ButtonValue();
iOutputManager.println("          ButtonValue lControlValue = new ButtonValue();", true);
//ScriptWriter~~          lControlValue.setType("<![frames:frame:control:button:type]!>");
iOutputManager.println("          lControlValue.setType(\"" + iSymbolTable.translateProperties("[frames:frame:control:button:type]") + "\");", true);
//ScriptWriter~~          lControlValue.setName("<![frames:frame:control:button:name]!>");
iOutputManager.println("          lControlValue.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:button:name]") + "\");", true);
//ScriptWriter~~          lControlValue.setValue("<![frames:frame:control:button:value]!>");
iOutputManager.println("          lControlValue.setValue(\"" + iSymbolTable.translateProperties("[frames:frame:control:button:value]") + "\");", true);
//ScriptWriter~~          lControlValue.setEvent("<![frames:frame:control:button:method]!>");
iOutputManager.println("          lControlValue.setEvent(\"" + iSymbolTable.translateProperties("[frames:frame:control:button:method]") + "\");", true);
//ScriptWriter~~          lControlValue.setService("<![frames:frame:control:button:service:script]!>");
iOutputManager.println("          lControlValue.setService(\"" + iSymbolTable.translateProperties("[frames:frame:control:button:service:script]") + "\");", true);
//ScriptWriter~~          lControlValue.setMethod("<![frames:frame:control:button:service:method]!>");
iOutputManager.println("          lControlValue.setMethod(\"" + iSymbolTable.translateProperties("[frames:frame:control:button:service:method]") + "\");", true);
//ScriptWriter~~          lControlValue.setMap("<![frames:frame:control:button:service:map]!>");
iOutputManager.println("          lControlValue.setMap(\"" + iSymbolTable.translateProperties("[frames:frame:control:button:service:map]") + "\");", true);
//ScriptWriter~~          lControl.addControlValue(lControlValue);
iOutputManager.println("          lControl.addControlValue(lControlValue);", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
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
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("multirow") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("multirow") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      {
iOutputManager.println("      {", true);
//ScriptWriter~~        MultiRowControl lControl = new MultiRowControl();
iOutputManager.println("        MultiRowControl lControl = new MultiRowControl();", true);
//ScriptWriter~~        lControl.setName("<![frames:frame:control:name]!>");
iOutputManager.println("        lControl.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "\");", true);
//ScriptWriter~~        lControl.setType("<![frames:frame:control:type]!>");
iOutputManager.println("        lControl.setType(\"" + iSymbolTable.translateProperties("[frames:frame:control:type]") + "\");", true);
//ScriptWriter~~        lControl.setCaption("<![frames:frame:control:caption]!>");
iOutputManager.println("        lControl.setCaption(\"" + iSymbolTable.translateProperties("[frames:frame:control:caption]") + "\");", true);
//ScriptWriter~~        lControl.setGrid("<![frames:frame:control:grid]!>");
iOutputManager.println("        lControl.setGrid(\"" + iSymbolTable.translateProperties("[frames:frame:control:grid]") + "\");", true);
//ScriptWriter~~        lControl.setColumn("<![frames:frame:control:column]!>");
iOutputManager.println("        lControl.setColumn(\"" + iSymbolTable.translateProperties("[frames:frame:control:column]") + "\");", true);
//ScriptWriter~~        lFrame.addControl(lControl);
iOutputManager.println("        lFrame.addControl(lControl);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~          <!frames:frame:control:rowColumn!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:rowColumn")).resetIterator();
//ScriptWriter~~          while (<!frames:frame:control:rowColumn!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:rowColumn")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~        {
iOutputManager.println("        {", true);
//ScriptWriter~~          ColumnValue lControlValue = new ColumnValue();
iOutputManager.println("          ColumnValue lControlValue = new ColumnValue();", true);
//ScriptWriter~~          lControlValue.setTitle("<![frames:frame:control:rowColumn:title]!>");
iOutputManager.println("          lControlValue.setTitle(\"" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:title]") + "\");", true);
//ScriptWriter~~          lControlValue.setName("<![frames:frame:control:rowColumn:name]!>");
iOutputManager.println("          lControlValue.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:name]") + "\");", true);
//ScriptWriter~~          lControlValue.setHrefMethod("<![frames:frame:control:rowColumn:hrefMethod]!>");
iOutputManager.println("          lControlValue.setHrefMethod(\"" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:hrefMethod]") + "\");", true);
//ScriptWriter~~          lControlValue.setHrefRowColumn("<![frames:frame:control:rowColumn:hrefRowColumn]!>");
iOutputManager.println("          lControlValue.setHrefRowColumn(\"" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:hrefRowColumn]") + "\");", true);
//ScriptWriter~~          lControl.addControlValue(lControlValue);
iOutputManager.println("          lControl.addControlValue(lControlValue);", true);
//ScriptWriter~~        }
iOutputManager.println("        }", true);
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
//ScriptWriter~~      }
iOutputManager.println("      }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("data") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("data") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~      {
iOutputManager.println("      {", true);
//ScriptWriter~~        Control lControl = new Control();
iOutputManager.println("        Control lControl = new Control();", true);
//ScriptWriter~~        lControl.setName("<![frames:frame:control:name]!>");
iOutputManager.println("        lControl.setName(\"" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "\");", true);
//ScriptWriter~~        lControl.setType("<![frames:frame:control:type]!>");
iOutputManager.println("        lControl.setType(\"" + iSymbolTable.translateProperties("[frames:frame:control:type]") + "\");", true);
//ScriptWriter~~        lControl.setCaption("<![frames:frame:control:caption]!>");
iOutputManager.println("        lControl.setCaption(\"" + iSymbolTable.translateProperties("[frames:frame:control:caption]") + "\");", true);
//ScriptWriter~~        lControl.setGrid("<![frames:frame:control:grid]!>");
iOutputManager.println("        lControl.setGrid(\"" + iSymbolTable.translateProperties("[frames:frame:control:grid]") + "\");", true);
//ScriptWriter~~        lFrame.addControl(lControl);
iOutputManager.println("        lFrame.addControl(lControl);", true);
//ScriptWriter~~        ControlValue lControlValue = new ControlValue();
iOutputManager.println("        ControlValue lControlValue = new ControlValue();", true);
//ScriptWriter~~        lControl.setControlValue(lControlValue);
iOutputManager.println("        lControl.setControlValue(lControlValue);", true);
//ScriptWriter~~      }
iOutputManager.println("      }", true);
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
//ScriptWriter~~    }
iOutputManager.println("    }", true);
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
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~<%    
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
    

//ScriptWriter~~      <!frames:frame:control!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control")).resetIterator();
//ScriptWriter~~      while (<!frames:frame:control!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control")).next()) {
//ScriptWriter~~        if (<![frames:frame:control:type]!>.compareTo("text") == 0) {
        if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("text") == 0) {
        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("password") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("password") == 0) {
        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("select") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("select") == 0) {
        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("date") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("date") == 0) {
        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("radio") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("radio") == 0) {
        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("submit") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("submit") == 0) {
        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("multirow") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("multirow") == 0) {
        }
//ScriptWriter~~        else if (<![frames:frame:control:type]!>.compareTo("data") == 0) {
        else if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("data") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  public void set_<![frames:frame:name]!>_<![frames:frame:control:name]!>(String aValue) {
iOutputManager.println("  public void set_" + iSymbolTable.translateProperties("[frames:frame:name]") + "_" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "(String aValue) {", true);
//ScriptWriter~~//$Section=set_<![frames:frame:name]!>_<![frames:frame:control:name]!>$Preserve=no
iOutputManager.println("//$Section=set_" + iSymbolTable.translateProperties("[frames:frame:name]") + "_" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "$Preserve=no", true);
//ScriptWriter~~    Frame lFrame = getFrame("<![frames:frame:name]!>");
iOutputManager.println("    Frame lFrame = getFrame(\"" + iSymbolTable.translateProperties("[frames:frame:name]") + "\");", true);
//ScriptWriter~~    if (lFrame == null) return;
iOutputManager.println("    if (lFrame == null) return;", true);
//ScriptWriter~~    lFrame.setValue("<![frames:frame:control:name]!>", aValue);
iOutputManager.println("    lFrame.setValue(\"" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "\", aValue);", true);
//ScriptWriter~~//$Section=set_<![frames:frame:name]!>_<![frames:frame:control:name]!>$Preserve=no
iOutputManager.println("//$Section=set_" + iSymbolTable.translateProperties("[frames:frame:name]") + "_" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~  public String get_<![frames:frame:name]!>_<![frames:frame:control:name]!>() {
iOutputManager.println("  public String get_" + iSymbolTable.translateProperties("[frames:frame:name]") + "_" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "() {", true);
//ScriptWriter~~//$Section=set_<![frames:frame:name]!>_<![frames:frame:control:name]!>$Preserve=no
iOutputManager.println("//$Section=set_" + iSymbolTable.translateProperties("[frames:frame:name]") + "_" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "$Preserve=no", true);
//ScriptWriter~~    Frame lFrame = getFrame("<![frames:frame:name]!>");
iOutputManager.println("    Frame lFrame = getFrame(\"" + iSymbolTable.translateProperties("[frames:frame:name]") + "\");", true);
//ScriptWriter~~    if (lFrame == null) return null;
iOutputManager.println("    if (lFrame == null) return null;", true);
//ScriptWriter~~    return lFrame.getControl("<![frames:frame:control:name]!>").getControlValue().getValue();
iOutputManager.println("    return lFrame.getControl(\"" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "\").getControlValue().getValue();", true);
//ScriptWriter~~//$Section=set_<![frames:frame:name]!>_<![frames:frame:control:name]!>$Preserve=no
iOutputManager.println("//$Section=set_" + iSymbolTable.translateProperties("[frames:frame:name]") + "_" + iSymbolTable.translateProperties("[frames:frame:control:name]") + "$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        }
      }

//ScriptWriter~~      <!frames:frame:service!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:service")).resetIterator();
//ScriptWriter~~      while (<!frames:frame:service!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:service")).next()) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  public void service_<![frames:frame:service:name]!>() {
iOutputManager.println("  public void service_" + iSymbolTable.translateProperties("[frames:frame:service:name]") + "() {", true);
//ScriptWriter~~//$Section=service_<![frames:frame:service:name]!>$Preserve=no
iOutputManager.println("//$Section=service_" + iSymbolTable.translateProperties("[frames:frame:service:name]") + "$Preserve=no", true);
//ScriptWriter~~    Frame lFrame = getFrame("<![frames:frame:name]!>");
iOutputManager.println("    Frame lFrame = getFrame(\"" + iSymbolTable.translateProperties("[frames:frame:name]") + "\");", true);
//ScriptWriter~~    if (lFrame == null) return;
iOutputManager.println("    if (lFrame == null) return;", true);
//ScriptWriter~~    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = (com.esarks.arm.model.jeo.ServiceJeo) lFrame.getServiceJeo();
iOutputManager.println("    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = (com.esarks.arm.model.jeo.ServiceJeo) lFrame.getServiceJeo();", true);
//ScriptWriter~~    lFrame.setServiceJeo(lServiceJeo);
iOutputManager.println("    lFrame.setServiceJeo(lServiceJeo);", true);
//ScriptWriter~~    Object lObject = loadScript("<![frames:frame:service:script]!>", "");
iOutputManager.println("    Object lObject = loadScript(\"" + iSymbolTable.translateProperties("[frames:frame:service:script]") + "\", \"\");", true);
//ScriptWriter~~    iScript.execMethod(lObject, "<![frames:frame:service:method]!>", new Object[]{lServiceJeo});
iOutputManager.println("    iScript.execMethod(lObject, \"" + iSymbolTable.translateProperties("[frames:frame:service:method]") + "\", new Object[]{lServiceJeo});", true);
//ScriptWriter~~    if (lServiceJeo.getJeoByInstanceNameSize("Error") == 0) {
iOutputManager.println("    if (lServiceJeo.getJeoByInstanceNameSize(\"Error\") == 0) {", true);
//ScriptWriter~~      iScript.execMethod(this, "<![frames:frame:service:map]!>", new Object[] {lFrame});
iOutputManager.println("      iScript.execMethod(this, \"" + iSymbolTable.translateProperties("[frames:frame:service:map]") + "\", new Object[] {lFrame});", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    lFrame.setErrors(lServiceJeo.getJeoByInstanceName("Error"));
iOutputManager.println("    lFrame.setErrors(lServiceJeo.getJeoByInstanceName(\"Error\"));", true);
//ScriptWriter~~//$Section=service_<![frames:frame:service:name]!>$Preserve=no
iOutputManager.println("//$Section=service_" + iSymbolTable.translateProperties("[frames:frame:service:name]") + "$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~<%            
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
            
      }

//ScriptWriter~~      <!frames:frame:control!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control")).resetIterator();
//ScriptWriter~~      while (<!frames:frame:control!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control")).next()) {
//ScriptWriter~~        if (<![frames:frame:control:type]!>.compareTo("multirow") == 0) {
        if (iSymbolTable.translateProperties("[frames:frame:control:type]").compareTo("multirow") == 0) {
//ScriptWriter~~          <!frames:frame:control:rowColumn!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:rowColumn")).resetIterator();
//ScriptWriter~~          while(<!frames:frame:control:rowColumn!>!next()) {
          while(iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:rowColumn")).next()) {
//ScriptWriter~~            if (<!frames:frame:control:rowColumn:hrefMethod!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:control:rowColumn:hrefMethod")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  public void <![frames:frame:control:rowColumn:hrefMethod]!>(String aArgument) {
iOutputManager.println("  public void " + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:hrefMethod]") + "(String aArgument) {", true);
//ScriptWriter~~//$Section=<![frames:frame:control:rowColumn:hrefMethod]!>$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:hrefMethod]") + "$Preserve=no", true);
//ScriptWriter~~    Frame lFrame = getFrame("<![frames:frame:name]!>");
iOutputManager.println("    Frame lFrame = getFrame(\"" + iSymbolTable.translateProperties("[frames:frame:name]") + "\");", true);
//ScriptWriter~~    if (lFrame == null) return;
iOutputManager.println("    if (lFrame == null) return;", true);
//ScriptWriter~~    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();
iOutputManager.println("    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = new com.esarks.arm.model.jeo.ServiceJeo();", true);
//ScriptWriter~~    lFrame.setServiceJeo(lServiceJeo);
iOutputManager.println("    lFrame.setServiceJeo(lServiceJeo);", true);
//ScriptWriter~~    lServiceJeo.getRequest().setPropertyValue("<![frames:frame:control:rowColumn:hrefRowColumn]!>", new PropertyValue(aArgument));
iOutputManager.println("    lServiceJeo.getRequest().setPropertyValue(\"" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:hrefRowColumn]") + "\", new PropertyValue(aArgument));", true);
//ScriptWriter~~    Object lObject = loadScript("<![frames:frame:control:rowColumn:service:script]!>", "");
iOutputManager.println("    Object lObject = loadScript(\"" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:service:script]") + "\", \"\");", true);
//ScriptWriter~~    iScript.execMethod(lObject, "<![frames:frame:control:rowColumn:service:method]!>", new Object[]{lServiceJeo});
iOutputManager.println("    iScript.execMethod(lObject, \"" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:service:method]") + "\", new Object[]{lServiceJeo});", true);
//ScriptWriter~~    if (lServiceJeo.getError() == null || lServiceJeo.getError().getSeverity() == 10) {
iOutputManager.println("    if (lServiceJeo.getError() == null || lServiceJeo.getError().getSeverity() == 10) {", true);
//ScriptWriter~~      iScript.execMethod(this, "<![frames:frame:control:rowColumn:service:map]!>", new Object[] {lFrame});
iOutputManager.println("      iScript.execMethod(this, \"" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:service:map]") + "\", new Object[] {lFrame});", true);
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~    lFrame.setErrors(lServiceJeo.getJeoByInstanceName("Error"));
iOutputManager.println("    lFrame.setErrors(lServiceJeo.getJeoByInstanceName(\"Error\"));", true);
//ScriptWriter~~//$Section=<![frames:frame:control:rowColumn:hrefMethod]!>$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[frames:frame:control:rowColumn:hrefMethod]") + "$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~<%            
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~
            
            }
          }
        }
      }

//System.out.println("***" + aXmlDefinition);
//ScriptWriter~~    <!frames:frame!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame")).resetIterator();
//ScriptWriter~~    while (<!frames:frame!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame")).next()) {
//ScriptWriter~~//System.out.println("   Frame: " + <![frames:frame:name]!>);
//System.out.println("   Frame: " + iSymbolTable.translateProperties("[frames:frame:name]"));
//ScriptWriter~~      <!frames:frame:maps:map!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:maps:map")).resetIterator();
//ScriptWriter~~      while (<!frames:frame:maps:map!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:maps:map")).next()) {
//ScriptWriter~~//System.out.println("     Map: " + <![frames:frame:maps:map:name]!>);
//System.out.println("     Map: " + iSymbolTable.translateProperties("[frames:frame:maps:map:name]"));
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~  public void <![frames:frame:maps:map:name]!>(Frame aFrame) {
iOutputManager.println("  public void " + iSymbolTable.translateProperties("[frames:frame:maps:map:name]") + "(Frame aFrame) {", true);
//ScriptWriter~~//$Section=<![frames:frame:maps:map:name]!>$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[frames:frame:maps:map:name]") + "$Preserve=no", true);
//ScriptWriter~~    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = (com.esarks.arm.model.jeo.ServiceJeo) aFrame.getServiceJeo();
iOutputManager.println("    com.esarks.arm.model.jeo.ServiceJeo lServiceJeo = (com.esarks.arm.model.jeo.ServiceJeo) aFrame.getServiceJeo();", true);
//ScriptWriter~~    if (lServiceJeo == null) return;
iOutputManager.println("    if (lServiceJeo == null) return;", true);
//ScriptWriter~~    ArrayList lArrayList = lServiceJeo.getReply().getJeoByInstanceName("<![frames:frame:maps:map:jeo:name]!>");
iOutputManager.println("    ArrayList lArrayList = lServiceJeo.getReply().getJeoByInstanceName(\"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:name]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    if (<!frames:frame:maps:map:jeo:control!>!size() > 0) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:maps:map:jeo:control")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~    <![frames:frame:maps:map:jeo:name]!> lJeo = null;
iOutputManager.println("    " + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:name]") + " lJeo = null;", true);
//ScriptWriter~~    for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {
iOutputManager.println("    for (int lIdx=0; lIdx < lArrayList.size(); lIdx++) {", true);
//ScriptWriter~~      ((MultiRowControl) aFrame.getControl("<![frames:frame:maps:map:jeo:control]!>")).addRow();
iOutputManager.println("      ((MultiRowControl) aFrame.getControl(\"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:control]") + "\")).addRow();", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
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
//ScriptWriter~~    if (lArrayList.size() == 0) return;
iOutputManager.println("    if (lArrayList.size() == 0) return;", true);
//ScriptWriter~~    <![frames:frame:maps:map:jeo:name]!> lJeo = null;
iOutputManager.println("    " + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:name]") + " lJeo = null;", true);
//ScriptWriter~~    {
iOutputManager.println("    {", true);
//ScriptWriter~~      int lIdx = 0;
iOutputManager.println("      int lIdx = 0;", true);
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
//ScriptWriter~~      lJeo = (<![frames:frame:maps:map:jeo:name]!>) lArrayList.get(lIdx);
iOutputManager.println("      lJeo = (" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:name]") + ") lArrayList.get(lIdx);", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    <!frames:frame:maps:map:jeo:property!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:maps:map:jeo:property")).resetIterator();
//ScriptWriter~~    while (<!frames:frame:maps:map:jeo:property!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:maps:map:jeo:property")).next()) {

//ScriptWriter~~      if (<!frames:frame:maps:map:jeo:property:from!>!size() == 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:maps:map:jeo:property:from")).size() == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      aFrame.clearValue("<![frames:frame:maps:map:jeo:property:to]!>");
iOutputManager.println("      aFrame.clearValue(\"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:to]") + "\");", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        continue;
      }
      
//ScriptWriter~~      if (<!frames:frame:maps:map:jeo:control!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:maps:map:jeo:control")).size() > 0) {
//ScriptWriter~~          if (<![frames:frame:maps:map:jeo:property:format]!>.compareTo("date") == 0) {
          if (iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:format]").compareTo("date") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      aFrame.setColumnValue("<![frames:frame:maps:map:jeo:control]!>", "<![frames:frame:maps:map:jeo:property:rowColumn]!>", lJeo.get<![cap@[frames:frame:maps:map:jeo:property:from]]!>PropertyValue().toDateString("MM-dd-yyyy"));
iOutputManager.println("      aFrame.setColumnValue(\"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:control]") + "\", \"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:rowColumn]") + "\", lJeo.get" + iSymbolTable.translateProperties("[cap@[frames:frame:maps:map:jeo:property:from]]") + "PropertyValue().toDateString(\"MM-dd-yyyy\"));", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      aFrame.setColumnValue("<![frames:frame:maps:map:jeo:control]!>", "<![frames:frame:maps:map:jeo:property:rowColumn]!>", lJeo.get<![cap@[frames:frame:maps:map:jeo:property:from]]!>PropertyValue().toString());
iOutputManager.println("      aFrame.setColumnValue(\"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:control]") + "\", \"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:rowColumn]") + "\", lJeo.get" + iSymbolTable.translateProperties("[cap@[frames:frame:maps:map:jeo:property:from]]") + "PropertyValue().toString());", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
      } else {
//ScriptWriter~~        if (<!frames:frame:maps:map:jeo:property:value!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:maps:map:jeo:property:value")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      aFrame.setOptionValue("<![frames:frame:maps:map:jeo:property:to]!>", "<![frames:frame:maps:map:jeo:property:value]!>", lJeo.get<![cap@[frames:frame:maps:map:jeo:property:from]]!>PropertyValue().toString());
iOutputManager.println("      aFrame.setOptionValue(\"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:to]") + "\", \"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:value]") + "\", lJeo.get" + iSymbolTable.translateProperties("[cap@[frames:frame:maps:map:jeo:property:from]]") + "PropertyValue().toString());", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

        } else {
//ScriptWriter~~          if (<![frames:frame:maps:map:jeo:property:format]!>.compareTo("date") == 0) {
          if (iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:format]").compareTo("date") == 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      aFrame.setDateValue("<![frames:frame:maps:map:jeo:property:to]!>", 
iOutputManager.println("      aFrame.setDateValue(\"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:to]") + "\", ", true);
//ScriptWriter~~        lJeo.get<![cap@[frames:frame:maps:map:jeo:property:from]]!>PropertyValue().toDateString("MM-dd-yyyy"),
iOutputManager.println("        lJeo.get" + iSymbolTable.translateProperties("[cap@[frames:frame:maps:map:jeo:property:from]]") + "PropertyValue().toDateString(\"MM-dd-yyyy\"),", true);
//ScriptWriter~~        lJeo.get<![cap@[frames:frame:maps:map:jeo:property:from]]!>PropertyValue().toDateString("MM"),
iOutputManager.println("        lJeo.get" + iSymbolTable.translateProperties("[cap@[frames:frame:maps:map:jeo:property:from]]") + "PropertyValue().toDateString(\"MM\"),", true);
//ScriptWriter~~        lJeo.get<![cap@[frames:frame:maps:map:jeo:property:from]]!>PropertyValue().toDateString("dd"),
iOutputManager.println("        lJeo.get" + iSymbolTable.translateProperties("[cap@[frames:frame:maps:map:jeo:property:from]]") + "PropertyValue().toDateString(\"dd\"),", true);
//ScriptWriter~~        lJeo.get<![cap@[frames:frame:maps:map:jeo:property:from]]!>PropertyValue().toDateString("yyyy"));
iOutputManager.println("        lJeo.get" + iSymbolTable.translateProperties("[cap@[frames:frame:maps:map:jeo:property:from]]") + "PropertyValue().toDateString(\"yyyy\"));", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          } else {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      aFrame.setValue("<![frames:frame:maps:map:jeo:property:to]!>", lJeo.get<![cap@[frames:frame:maps:map:jeo:property:from]]!>PropertyValue().toString());
iOutputManager.println("      aFrame.setValue(\"" + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:to]") + "\", lJeo.get" + iSymbolTable.translateProperties("[cap@[frames:frame:maps:map:jeo:property:from]]") + "PropertyValue().toString());", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

          }
        }
      }
//ScriptWriter~~      if (<!frames:frame:maps:map:jeo:property:method!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("frames:frame:maps:map:jeo:property:method")).size() > 0) {
//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~      <![frames:frame:maps:map:jeo:property:method]!>(aFrame);
iOutputManager.println("      " + iSymbolTable.translateProperties("[frames:frame:maps:map:jeo:property:method]") + "(aFrame);", true);
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
//ScriptWriter~~    }
iOutputManager.println("    }", true);
//ScriptWriter~~//$Section=<![frames:frame:maps:map:name]!>$Preserve=no
iOutputManager.println("//$Section=" + iSymbolTable.translateProperties("[frames:frame:maps:map:name]") + "$Preserve=no", true);
//ScriptWriter~~  }
iOutputManager.println("  }", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

      }
    }
    closeOutput();
    if (aXmlDefinition.endsWith("_View")) {
      Merge.getInstance().doMerge(path(aXmlDefinition.substring(0,aXmlDefinition.length()-5)) + ".script", path(aXmlDefinition.substring(0,aXmlDefinition.length()-5)) + ".new", iScript.getMasterScript());
    }
  }

  
}
