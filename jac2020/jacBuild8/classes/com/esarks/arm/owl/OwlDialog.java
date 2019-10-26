//ScriptWriter~~package <#[$jac:script:package]#>;
package com.esarks.arm.owl;

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

import  com.esarks.arm.model.jeo.*;
import  com.esarks.arm.owl.*;
import  java.awt.*;
import  javax.swing.*;
//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class OwlDialog extends com.esarks.mic.Component  {


//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected OwlDialog() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public OwlDialog(Script aScript) {

    super(aScript);

  }


public void askYesNoCancel(com.esarks.arm.owl.JeoOwlEngine aJeoOwlEngine, String aQuestion, String aFactName) {
  askYesNoCancel(aJeoOwlEngine, aQuestion, aFactName, "", aFactName);
}

public void askYesNoCancel(com.esarks.arm.owl.JeoOwlEngine aJeoOwlEngine, String aQuestion, String aFactName, String aFactLid, String aFactAttribute) {
  java.awt.Frame lFrame = new java.awt.Frame();
  int lResult = JOptionPane.showConfirmDialog(lFrame, aQuestion);
  switch (lResult) {
      case JOptionPane.YES_OPTION:
          aJeoOwlEngine.addFact(aFactName, aFactLid, aFactAttribute, "yes");
          break;
      case JOptionPane.NO_OPTION:
          aJeoOwlEngine.addFact(aFactName, aFactLid, aFactAttribute, "no");
          break;
      case JOptionPane.CANCEL_OPTION:
          aJeoOwlEngine.addFact(aFactName, aFactLid, aFactAttribute, "cancel");
          break;
  }
  lFrame.dispose();
}
}
