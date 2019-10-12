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

//ScriptWriter~~public class <#[$jac:script]#> <#[$jac:script:extends]#> <#[$jac:script:implements]#> {
public class JeoOwlEngine extends com.esarks.mic.Component  {

int iFactName = 0;
boolean iProcessRules = true;
com.esarks.arm.owl.JeoOwlEngine iJeoOwlEngine = null;
private boolean iWsChange = true;

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected JeoOwlEngine() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public JeoOwlEngine(Script aScript) {

    super(aScript);

  }

public void execute() {
//ScriptWriter~~  if (<!mic.element:owl!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:owl")).size() > 0) {
//ScriptWriter~~    <!mic.element:owl!>!alias("owl");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("mic.element:owl")).alias("owl");
//ScriptWriter~~    %>1<![mic.element:owl:title]!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("1" + iSymbolTable.translateProperties("[mic.element:owl:title]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~    %>2<![owl:title]!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("2" + iSymbolTable.translateProperties("[owl:title]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    executeRules(null);    
  }
}

public void execute(com.esarks.arm.owl.JeoOwlEngine aJeoOwlEngine, String aRulesXml) {
  iJeoOwlEngine = aJeoOwlEngine;
  execute(aRulesXml);
}

public void execute(String aRulesXml) {
  loadRules(aRulesXml);
  executeRules(null);
}

public void execute(Object aCallBack, String aRulesXml, ArrayList aArrayList, String aJeosName) {
  loadRules(aRulesXml);
  loadJeos(aArrayList, aJeosName);
  executeRules(aCallBack);
}

public com.esarks.arm.owl.JeoOwlEngine loadRules(String aRulesXml) {
//ScriptWriter~~%>>>>loadRules <!%aRulesXml + "\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println(">>>loadRules " + aRulesXml + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  if (<!owl!>!size() > 0) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).size() > 0) {
    java.util.Date lDate = new java.util.Date();
    com.esarks.arm.owl.JeoOwlEngine lJeoOwlEngine = (com.esarks.arm.owl.JeoOwlEngine) loadScript(com.esarks.arm.owl.JeoOwlEngine.class.getName(), lDate.toString());
    return lJeoOwlEngine.loadRules(aRulesXml);
  }
  
//ScriptWriter~~  <!owl!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).remove();
  parseXml(aRulesXml);

//ScriptWriter~~  <!owl:facts:fact!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:facts:fact")).resetIterator();
//ScriptWriter~~  while (<!owl:facts:fact!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:facts:fact")).next()) {
//ScriptWriter~~    <!owl:facts:fact:attribute!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:facts:fact:attribute")).resetIterator();
//ScriptWriter~~    while (<!owl:facts:fact:attribute!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:facts:fact:attribute")).next()) {
//ScriptWriter~~      String lFactName = <![owl:facts:fact:name]!>;
      String lFactName = iSymbolTable.translateProperties("[owl:facts:fact:name]");
//ScriptWriter~~      if (<!owl:facts:fact:name!>!size() == 0) lFactName = Integer.toString(iFactName++);
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:facts:fact:name")).size() == 0) lFactName = Integer.toString(iFactName++);
//ScriptWriter~~      if (<!owl:facts:fact:attribute:type!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:facts:fact:attribute:type")).size() > 0) {
//ScriptWriter~~        addFact(lFactName, <![owl:facts:fact:lid]!>, <![owl:facts:fact:attribute:name]!>, new PropertyValue(<![owl:facts:fact:attribute:type]!>, <![owl:facts:fact:attribute:value]!>));
        addFact(lFactName, iSymbolTable.translateProperties("[owl:facts:fact:lid]"), iSymbolTable.translateProperties("[owl:facts:fact:attribute:name]"), new PropertyValue(iSymbolTable.translateProperties("[owl:facts:fact:attribute:type]"), iSymbolTable.translateProperties("[owl:facts:fact:attribute:value]")));
      } else {
//ScriptWriter~~        addFact(lFactName, <![owl:facts:fact:lid]!>, <![owl:facts:fact:attribute:name]!>, new PropertyValue(<![owl:facts:fact:attribute:value]!>));
        addFact(lFactName, iSymbolTable.translateProperties("[owl:facts:fact:lid]"), iSymbolTable.translateProperties("[owl:facts:fact:attribute:name]"), new PropertyValue(iSymbolTable.translateProperties("[owl:facts:fact:attribute:value]")));
      }
    }
  }
  return this;
}


public void loadJeos(ArrayList aArrayList, String aJeosName) {
//ScriptWriter~~%>>>>loadJeos <!%aJeosName + " " + aArrayList.size() + " \r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println(">>>loadJeos " + aJeosName + " " + aArrayList.size() + " \r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!owl:jeos!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos")).resetIterator();
//ScriptWriter~~  <!owl!>!scan("jeos:name", aJeosName);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("jeos:name", aJeosName);

//ScriptWriter~~  <!owl:jeos:facts!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).resetIterator();
//ScriptWriter~~  while (<!owl:jeos:facts!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).next()) {
//ScriptWriter~~    removeFact(<![owl:jeos:facts]!>);  
    removeFact(iSymbolTable.translateProperties("[owl:jeos:facts]"));  
  }
//ScriptWriter~~  <!owl:jeos:facts!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).remove();

  addFact(Integer.toString(++iFactName), "", aJeosName + " numberOfItems", new PropertyValue(aArrayList.size()));
//ScriptWriter~~  <!owl:jeos:facts!>!set(Integer.toString(iFactName));
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
  
  for (int lIdx=0; lIdx < aArrayList.size(); lIdx++) {

    com.esarks.jac.Jeo lJeo = (com.esarks.jac.Jeo) aArrayList.get(lIdx);   
//ScriptWriter~~    <!owl:jeos:jeo!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo")).resetIterator();
//ScriptWriter~~    if (<!owl:jeos!>!scan("jeo:instance", lJeo.getInstanceName())) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos")).scan("jeo:instance", lJeo.getInstanceName())) {

//ScriptWriter~~      <!owl:jeos:jeo:attribute!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo:attribute")).resetIterator();
//ScriptWriter~~      while (<!owl:jeos:jeo:attribute!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo:attribute")).next()) {

//ScriptWriter~~        String lPropertyType = lJeo.getTypeByName(<![owl:jeos:jeo:attribute:name]!>);
        String lPropertyType = lJeo.getTypeByName(iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:name]"));
        if (lPropertyType == null) continue;
        
//ScriptWriter~~        PropertyValue lLidPropertyValue = lJeo.getPropertyValueByName(<![owl:jeos:jeo:attribute:factId]!>);
        PropertyValue lLidPropertyValue = lJeo.getPropertyValueByName(iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factId]"));
//ScriptWriter~~        PropertyValue lPropertyValue = lJeo.getPropertyValueByName(<![owl:jeos:jeo:attribute:name]!>);
        PropertyValue lPropertyValue = lJeo.getPropertyValueByName(iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:name]"));
//ScriptWriter~~        PropertyValue lCompare = new PropertyValue(lPropertyType, <![owl:jeos:jeo:attribute:value]!>);
        PropertyValue lCompare = new PropertyValue(lPropertyType, iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:value]"));
//ScriptWriter~~        String lOperation = <![owl:jeos:jeo:attribute:operation]!>.toLowerCase();
        String lOperation = iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:operation]").toLowerCase();

        if (lOperation.equals("equal") && lPropertyValue.getType() == lCompare.getType() && lPropertyValue.compareTo(lCompare) == 0) {
//ScriptWriter~~          String lFactType = <![owl:jeos:jeo:attribute:factType]!>;
          String lFactType = iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factType]");
//ScriptWriter~~          if (<!owl:jeos:jeo:attribute:factType!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo:attribute:factType")).size() > 0) {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(lFactType, <![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(lFactType, iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          } else {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(<![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          }
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        } else if (lOperation.equals("notequal") && lPropertyValue.getType() == lCompare.getType() && lPropertyValue.compareTo(lCompare) != 0) {
//ScriptWriter~~          String lFactType = <![owl:jeos:jeo:attribute:factType]!>;
          String lFactType = iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factType]");
//ScriptWriter~~          if (<!owl:jeos:jeo:attribute:factType!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo:attribute:factType")).size() > 0) {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(lFactType, <![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(lFactType, iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          } else {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(<![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          }
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        } else if (lOperation.equals("less") && lPropertyValue.getType() == lCompare.getType() && lPropertyValue.compareTo(lCompare) < 0) {
//ScriptWriter~~          String lFactType = <![owl:jeos:jeo:attribute:factType]!>;
          String lFactType = iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factType]");
//ScriptWriter~~          if (<!owl:jeos:jeo:attribute:factType!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo:attribute:factType")).size() > 0) {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(lFactType, <![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(lFactType, iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          } else {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(<![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          }
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        } else if (lOperation.equals("greater") && lPropertyValue.getType() == lCompare.getType() && lPropertyValue.compareTo(lCompare) > 0) {
//ScriptWriter~~          String lFactType = <![owl:jeos:jeo:attribute:factType]!>;
          String lFactType = iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factType]");
//ScriptWriter~~          if (<!owl:jeos:jeo:attribute:factType!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo:attribute:factType")).size() > 0) {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(lFactType, <![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(lFactType, iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          } else {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(<![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          }
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        } else if (lOperation.equals("every")) {
//ScriptWriter~~          String lFactType = <![owl:jeos:jeo:attribute:factType]!>;
          String lFactType = iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factType]");
//ScriptWriter~~          if (<!owl:jeos:jeo:attribute:factType!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo:attribute:factType")).size() > 0) {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(lFactType, <![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(lFactType, iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          } else {
//ScriptWriter~~            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, new PropertyValue(<![owl:jeos:jeo:attribute:factValue]!>), lJeo);
            addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), new PropertyValue(iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factValue]")), lJeo);
          }
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        } else if (lOperation.equals("set")) {
//ScriptWriter~~          addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), <![owl:jeos:jeo:attribute:factAttribute]!>, lPropertyValue, lJeo);
          addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), iSymbolTable.translateProperties("[owl:jeos:jeo:attribute:factAttribute]"), lPropertyValue, lJeo);
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        }

//ScriptWriter~~        if (<!owl:jeos:jeo:attribute!>!isFirst() && lIdx == 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo:attribute")).isFirst() && lIdx == 0) {
          addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), aJeosName + " isFirstItem", new PropertyValue(true), lJeo);
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        } else {
          addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), aJeosName + " isFirstItem", new PropertyValue(false), lJeo);
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        }
//ScriptWriter~~        if (<!owl:jeos:jeo:attribute!>!isLast() && lIdx == aArrayList.size() -1) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:jeo:attribute")).isLast() && lIdx == aArrayList.size() -1) {
          addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), aJeosName + " isLastItem", new PropertyValue(true), lJeo);
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        } else {
          addFact(Integer.toString(++iFactName), lLidPropertyValue.toString(), aJeosName + " isLastItem", new PropertyValue(false), lJeo);
//ScriptWriter~~          <!owl:jeos:facts!>!set(Integer.toString(iFactName));
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:jeos:facts")).set(Integer.toString(iFactName));
        }
      }
    }
  }
}

public void addFact(String aLid, String aAttribute, String aConstant) {
  addFact(Integer.toString(iFactName++), aLid, aAttribute, new PropertyValue(aConstant));
}

public void addFact(String aLid, String aAttribute, PropertyValue aConstant) {
  addFact(Integer.toString(iFactName++), aLid, aAttribute, aConstant);
}

public void addFact(String aId, String aLid, String aAttribute, String aConstant) {
  addFact(aId, aLid, aAttribute, new PropertyValue(aConstant));
}

public void addFact(String aId, String aLid, String aAttribute, PropertyValue aConstant) {
  removeFact(aId);
//ScriptWriter~~  <!owl:fact!>!set("");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact")).set("");
//ScriptWriter~~  <!owl:fact:name!>!set(aId);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:name")).set(aId);
//ScriptWriter~~  <!owl:fact:id!>!set(aLid);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:id")).set(aLid);
//ScriptWriter~~  <!owl:fact:attribute!>!set(aAttribute);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:attribute")).set(aAttribute);
//ScriptWriter~~  <!owl:fact:value!>!set(aConstant.toString());
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:value")).set(aConstant.toString());
//ScriptWriter~~  <!owl:fact:propertyValue!>!set(aConstant);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:propertyValue")).set(aConstant);
//ScriptWriter~~//  System.out.println("******" + aConstant.getType() + " ** " + <!owl:fact:propertyValue!>!getPropertyValue().getType());
//  System.out.println("******" + aConstant.getType() + " ** " + iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:propertyValue")).getPropertyValue().getType());
  iWsChange = true;
}

public void addFact(String aLid, String aAttribute, String aConstant, Jeo aJeo) {
  addFact(Integer.toString(iFactName++), aLid, aAttribute, new PropertyValue(aConstant), aJeo);
}

public void addFact(String aLid, String aAttribute, PropertyValue aConstant, Jeo aJeo) {
  addFact(Integer.toString(iFactName++), aLid, aAttribute, aConstant, aJeo);
}

public void addFact(String aId, String aLid, String aAttribute, String aConstant, Jeo aJeo) {
  addFact(aId, aLid, aAttribute, new PropertyValue(aConstant), aJeo);
}

public void addFact(String aId, String aLid, String aAttribute, PropertyValue aConstant, Jeo aJeo) {
  removeFact(aId);
//ScriptWriter~~  <!owl:fact!>!set("");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact")).set("");
//ScriptWriter~~  <!owl:fact:name!>!set(aId);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:name")).set(aId);
//ScriptWriter~~  <!owl:fact:id!>!set(aLid);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:id")).set(aLid);
//ScriptWriter~~  <!owl:fact:attribute!>!set(aAttribute);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:attribute")).set(aAttribute);
//ScriptWriter~~  <!owl:fact:value!>!set(aConstant.toString());
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:value")).set(aConstant.toString());
//ScriptWriter~~  <!owl:fact:propertyValue!>!set(aConstant);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:propertyValue")).set(aConstant);
//ScriptWriter~~  <!owl:fact:jeo!>!set(aJeo);
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:jeo")).set(aJeo);
//ScriptWriter~~//  System.out.println("******" + aConstant.getType() + " ** " + <!owl:fact:propertyValue!>!getPropertyValue().getType());
//  System.out.println("******" + aConstant.getType() + " ** " + iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:propertyValue")).getPropertyValue().getType());
  iWsChange = true;
}

private void removeFact(String aFactName) {
//ScriptWriter~~  <!rete:fact!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("rete:fact")).resetIterator();
//ScriptWriter~~  if (<!owl!>!scan("fact:name", aFactName)) {
  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("fact:name", aFactName)) {
//ScriptWriter~~    <!owl:fact!>!removeValue();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact")).removeValue();
    iWsChange = true;
  } else {
  }
}

public void setWsChange(boolean aValue) {
  iWsChange = aValue;
}

public void executeRules() {
  executeRules(null);
}

private void executeRules(Object aCallback) {
//ScriptWriter~~%>>>>executeRules <![owl:title]!><!%"\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println(">>>executeRules " + iSymbolTable.translateProperties("[owl:title]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  if (!iWsChange) return;
  iWsChange = false;

  getConditionAttributes();
  associateFacts();
  determineRules();
 
//ScriptWriter~~  <!$mic:rule!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule")).resetIterator();
//ScriptWriter~~  while (<!$mic:rule!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule")).next()) {
//ScriptWriter~~    %>Evaluate Rule: <![$mic:rule]!><!%"\r\n"!><%
    {
//ScriptWriter~~~
iOutputManager.println("Evaluate Rule: " + iSymbolTable.translateProperties("[$mic:rule]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

    if (performProductions(aCallback)) {
//ScriptWriter~~      %>return true from performProductions<!%"\r\n"!><%
      {
//ScriptWriter~~~
iOutputManager.println("return true from performProductions" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~      if (<![owl:rule:breakOnRule]!>.equals("true")) break;
      if (iSymbolTable.translateProperties("[owl:rule:breakOnRule]").equals("true")) break;
      
//ScriptWriter~~      if (<!owl:rule:fact!>!size() > 0) {       
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:fact")).size() > 0) {       
//ScriptWriter~~        <!owl:rule:fact!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:fact")).resetIterator();
//ScriptWriter~~        while (<!owl:rule:fact!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:fact")).next()) {
//ScriptWriter~~          <!owl:rule:fact:attribute!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:fact:attribute")).resetIterator();
//ScriptWriter~~          while (<!owl:rule:fact:attribute!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:fact:attribute")).next()) {
//ScriptWriter~~            String lFactName = <![owl:rule:fact:name]!>;
            String lFactName = iSymbolTable.translateProperties("[owl:rule:fact:name]");
//ScriptWriter~~            if (<!owl:rule:fact:name!>!size() == 0) lFactName = Integer.toString(iFactName++);
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:fact:name")).size() == 0) lFactName = Integer.toString(iFactName++);
//ScriptWriter~~            if (<!owl:rule:fact:attribute:type!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:fact:attribute:type")).size() > 0) {
//ScriptWriter~~              addFact(lFactName, <![owl:rule:fact:lid]!>, <![owl:rule:fact:attribute:name]!>, new PropertyValue(<![owl:rule:fact:attribute:type]!>, <![owl:rule:fact:attribute:value]!>));
              addFact(lFactName, iSymbolTable.translateProperties("[owl:rule:fact:lid]"), iSymbolTable.translateProperties("[owl:rule:fact:attribute:name]"), new PropertyValue(iSymbolTable.translateProperties("[owl:rule:fact:attribute:type]"), iSymbolTable.translateProperties("[owl:rule:fact:attribute:value]")));
            } else {
//ScriptWriter~~              addFact(lFactName, <![owl:rule:fact:lid]!>, <![owl:rule:fact:attribute:name]!>, new PropertyValue(<![owl:rule:fact:attribute:value]!>));
              addFact(lFactName, iSymbolTable.translateProperties("[owl:rule:fact:lid]"), iSymbolTable.translateProperties("[owl:rule:fact:attribute:name]"), new PropertyValue(iSymbolTable.translateProperties("[owl:rule:fact:attribute:value]")));
            }
          }
        }
      }
     
      ArrayList lEnableArrayList = new ArrayList();
      ArrayList lDisableArrayList = new ArrayList();
      ArrayList lRemoveArrayList = new ArrayList();
//ScriptWriter~~      if (<!owl:rule:enable!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:enable")).size() > 0) {
//ScriptWriter~~        <!owl:rule:enable!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:enable")).resetIterator();
//ScriptWriter~~        while (<!owl:rule:enable!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:enable")).next()) {
//ScriptWriter~~          lEnableArrayList.add(<![owl:rule:enable:name]!>);
          lEnableArrayList.add(iSymbolTable.translateProperties("[owl:rule:enable:name]"));
        }
      }
//ScriptWriter~~      if (<!owl:rule:disable!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:disable")).size() > 0) {
//ScriptWriter~~        <!owl:rule:disable!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:disable")).resetIterator();
//ScriptWriter~~        while (<!owl:rule:disable!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:disable")).next()) {
//ScriptWriter~~          lDisableArrayList.add(<![owl:rule:disable:name]!>);
          lDisableArrayList.add(iSymbolTable.translateProperties("[owl:rule:disable:name]"));
        }
      }
//ScriptWriter~~      if (<!owl:rule:remove!>!size() > 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove")).size() > 0) {
//ScriptWriter~~        if (<!owl:rule:remove:rule!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove:rule")).size() > 0) {
//ScriptWriter~~          <!owl:rule:remove:rule!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove:rule")).resetIterator();
//ScriptWriter~~          while (<!owl:rule:remove:rule!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove:rule")).next()) {
//ScriptWriter~~            lRemoveArrayList.add(<![owl:rule:remove:rule:name]!>);
            lRemoveArrayList.add(iSymbolTable.translateProperties("[owl:rule:remove:rule:name]"));
          }
        }
//ScriptWriter~~        if (<!owl:rule:remove:fact!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove:fact")).size() > 0) {
//ScriptWriter~~          <!owl:rule:remove:fact!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove:fact")).resetIterator();
//ScriptWriter~~          while (<!owl:rule:remove:fact!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove:fact")).next()) {
//ScriptWriter~~            <!owl:fact!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact")).resetIterator();
//ScriptWriter~~            if (<!owl!>!scan("fact:name", <![owl:rule:remove:fact:name]!>)) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("fact:name", iSymbolTable.translateProperties("[owl:rule:remove:fact:name]"))) {
//ScriptWriter~~              <!owl:fact!>!removeValue();
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact")).removeValue();
            }
          }
        }
//ScriptWriter~~        if (<!owl:rule:remove:condition!>!size() > 0) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove:condition")).size() > 0) {
//ScriptWriter~~          <!owl:rule:remove:condition!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove:condition")).resetIterator();
//ScriptWriter~~          while (<!owl:rule:remove:condition!>!next()) {
          while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:remove:condition")).next()) {
//ScriptWriter~~            <!owl:condition!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition")).resetIterator();
//ScriptWriter~~            if (<!owl!>!scan("condition:name", <![owl:rule:remove:condition:name]!>)) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("condition:name", iSymbolTable.translateProperties("[owl:rule:remove:condition:name]"))) {
//ScriptWriter~~              <!owl:condition!>!removeValue();
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition")).removeValue();
            }
          }
        }
      }
      for (int lListIdx=0; lListIdx < lEnableArrayList.size(); lListIdx++) {
//ScriptWriter~~        <!owl:rule!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule")).resetIterator();
//ScriptWriter~~        if (<!owl!>!scan("rule:name", (String) lEnableArrayList.get(lListIdx))) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("rule:name", (String) lEnableArrayList.get(lListIdx))) {
//ScriptWriter~~          <!owl:rule:disabled!>!remove();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:disabled")).remove();
        }
      }
      for (int lListIdx=0; lListIdx < lDisableArrayList.size(); lListIdx++) {
//ScriptWriter~~        <!owl:rule!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule")).resetIterator();
//ScriptWriter~~        if (<!owl!>!scan("rule:name", (String) lDisableArrayList.get(lListIdx))) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("rule:name", (String) lDisableArrayList.get(lListIdx))) {
//ScriptWriter~~          <!owl:rule:disabled!>!reset("true");
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:disabled")).reset("true");
        }
      }
      for (int lListIdx=0; lListIdx < lRemoveArrayList.size(); lListIdx++) {
//ScriptWriter~~        <!owl:rule!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule")).resetIterator();
//ScriptWriter~~        if (<!owl!>!scan("rule:name", (String) lDisableArrayList.get(lListIdx))) {
        if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("rule:name", (String) lDisableArrayList.get(lListIdx))) {
//ScriptWriter~~          <!owl:rule!>!removeValue();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule")).removeValue();
        }
      }

      if (iWsChange) {
        getConditionAttributes();
        associateFacts();
        determineRules();
//ScriptWriter~~        <!$mic:rule!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule")).resetIterator();
      }
    }
  }
}

private void getConditionAttributes() {
//ScriptWriter~~%>>>>getConditionAttributes<!%"\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println(">>>getConditionAttributes" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!$mic:conditionAttribute!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:conditionAttribute")).remove();

  // Create list of unique condition attributes, associating conditions
//ScriptWriter~~  <!owl:condition!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition")).resetIterator();
//ScriptWriter~~  while (<!owl:condition!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition")).next()) {
//ScriptWriter~~    String lAttribute = <![owl:condition:attribute]!>;
    String lAttribute = iSymbolTable.translateProperties("[owl:condition:attribute]");
//ScriptWriter~~    <!$mic:conditionAttribute:" + lAttribute + "!>!set(<![owl:condition:name]!>);
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:conditionAttribute:" + lAttribute + "")).set(iSymbolTable.translateProperties("[owl:condition:name]"));
  }
}

private void associateFacts() {
//ScriptWriter~~%>>>>associateFacts<!%"\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println(">>>associateFacts" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!$mic:conditionFact!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:conditionFact")).remove();

  // Create list of unique fact attributes, associating facts
//ScriptWriter~~  <!owl:fact!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact")).resetIterator();
//ScriptWriter~~  while (<!owl:fact!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact")).next()) {
//ScriptWriter~~    String lAttribute = <![owl:fact:attribute]!>;
    String lAttribute = iSymbolTable.translateProperties("[owl:fact:attribute]");
    // Match the fact to the condition (builds a condition / fact association list)
//ScriptWriter~~    <!$mic:conditionAttribute:" + lAttribute + "!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:conditionAttribute:" + lAttribute + "")).resetIterator();
//ScriptWriter~~    while (<!$mic:conditionAttribute:" + lAttribute + "!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:conditionAttribute:" + lAttribute + "")).next()) {
//ScriptWriter~~      String lCondition = <![$mic:conditionAttribute:" + lAttribute + "]!>;
      String lCondition = iSymbolTable.translateProperties("[$mic:conditionAttribute:" + lAttribute + "]");
//ScriptWriter~~      <!$mic:conditionFact:" + lCondition + "!>!set(<![owl:fact:name]!>);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:conditionFact:" + lCondition + "")).set(iSymbolTable.translateProperties("[owl:fact:name]"));
    }
  }
}

private void determineRules() {
//ScriptWriter~~%>>>>determineRules<!%"\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println(">>>determineRules" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

  
//ScriptWriter~~  <!$mic:rule!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule")).remove();
//ScriptWriter~~  <!$mic:production!>!remove();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:production")).remove();
    
  // Determine which rules to use, and number of potential productions in a rule
//ScriptWriter~~  <!owl:rule!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule")).resetIterator();
//ScriptWriter~~  while (<!owl:rule!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule")).next()) {

//ScriptWriter~~    if (<![owl:rule:disabled]!>.equals("true")) continue;
    if (iSymbolTable.translateProperties("[owl:rule:disabled]").equals("true")) continue;
//ScriptWriter~~    String lProductionName = "r=(" + <![owl:rule:name]!> + ")";
    String lProductionName = "r=(" + iSymbolTable.translateProperties("[owl:rule:name]") + ")";
//ScriptWriter~~    String lRuleName = <![owl:rule:name]!>;
    String lRuleName = iSymbolTable.translateProperties("[owl:rule:name]");
//ScriptWriter~~    <!$mic:production:" + lProductionName + "!>!set("");
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:production:" + lProductionName + "")).set("");
    boolean lUseRule = true;

//ScriptWriter~~    <!owl:rule:hasCondition!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:hasCondition")).resetIterator();
//ScriptWriter~~    while (<!owl:rule:hasCondition!>!next()) {
    while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:hasCondition")).next()) {
//ScriptWriter~~      String lHasCondition = <![owl:rule:hasCondition:name]!>;
      String lHasCondition = iSymbolTable.translateProperties("[owl:rule:hasCondition:name]");
//ScriptWriter~~      if (<!$mic:conditionFact:" + lHasCondition + "!>!size() == 0) {
      if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:conditionFact:" + lHasCondition + "")).size() == 0) {
        lUseRule = false;
        break;
      }

//ScriptWriter~~      <!$mic:production:" + lProductionName + "!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:production:" + lProductionName + "")).resetIterator();
//ScriptWriter~~      while (<!$mic:production:" + lProductionName + "!>!next()) {
      while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:production:" + lProductionName + "")).next()) {
//ScriptWriter~~        <!$mic:conditionFact:" + lHasCondition + "!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:conditionFact:" + lHasCondition + "")).resetIterator();
//ScriptWriter~~        while (<!$mic:conditionFact:" + lHasCondition + "!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:conditionFact:" + lHasCondition + "")).next()) {
//ScriptWriter~~          String lFact = <![$mic:conditionFact:" + lHasCondition + "]!>;
          String lFact = iSymbolTable.translateProperties("[$mic:conditionFact:" + lHasCondition + "]");
//ScriptWriter~~          <!$mic:production:" + lProductionName + " c=(" + lHasCondition + ")!>!set(<![$mic:production:" + lProductionName + "]!> + "f=(" + lFact + ") ");
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:production:" + lProductionName + " c=(" + lHasCondition + ")")).set(iSymbolTable.translateProperties("[$mic:production:" + lProductionName + "]") + "f=(" + lFact + ") ");
//ScriptWriter~~          if (<![$mic:production:" + lProductionName + "]" + "f=(" + lFact + ") !>!size() == 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$mic:production:" + lProductionName + "]" + "f=(" + lFact + ") ")).size() == 0) {
//ScriptWriter~~            <![$mic:production:" + lProductionName + "]!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$mic:production:" + lProductionName + "]")).resetIterator();
//ScriptWriter~~            while (<![$mic:production:" + lProductionName + "]!>!next()) {
            while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$mic:production:" + lProductionName + "]")).next()) {
//ScriptWriter~~              <![$mic:production:" + lProductionName + "]" + "f=(" + lFact + ") !>!set(<![[$mic:production:" + lProductionName + "]]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$mic:production:" + lProductionName + "]" + "f=(" + lFact + ") ")).set(iSymbolTable.translateProperties("[[$mic:production:" + lProductionName + "]]"));
            }
//ScriptWriter~~            <![$mic:production:" + lProductionName + "]" + "f=(" + lFact + ") !>!set(lFact);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$mic:production:" + lProductionName + "]" + "f=(" + lFact + ") ")).set(lFact);
          }
        }
      }
      lProductionName += " c=(" + lHasCondition + ")";
    }
   
    if (lUseRule) {
//ScriptWriter~~      if (!<![$mic:rule]!>.equals(<![owl:rule:name]!>)) {
      if (!iSymbolTable.translateProperties("[$mic:rule]").equals(iSymbolTable.translateProperties("[owl:rule:name]"))) {
//ScriptWriter~~        <!$mic:rule!>!set(<![owl:rule:name]!>);
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule")).set(iSymbolTable.translateProperties("[owl:rule:name]"));
      }
//ScriptWriter~~      <!$mic:rule:production!>!set(lProductionName);
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:production")).set(lProductionName);
    }
  }
}

private boolean performProductions(Object aCallback) {
//ScriptWriter~~%>>>>performProductions<!%"\r\n"!><%
{
//ScriptWriter~~~
iOutputManager.println(">>>performProductions" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  boolean lProductionPassed=false;  
//ScriptWriter~~  <!$mic:production:[$mic:rule:production]!>!resetIterator();
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:production:[$mic:rule:production]")).resetIterator();
//ScriptWriter~~  while (<!$mic:production:[$mic:rule:production]!>!next()) {
  while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:production:[$mic:rule:production]")).next()) {

//ScriptWriter~~    <!$mic:rule:symbol!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbol")).remove();
//ScriptWriter~~    <!$mic:rule:symbolFact!>!remove();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbolFact")).remove();
    
//ScriptWriter~~    <!owl:rule!>!resetIterator();
    iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule")).resetIterator();
//ScriptWriter~~    if (<!owl!>!scan("rule:name", <![$mic:rule]!>)) {
    if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("rule:name", iSymbolTable.translateProperties("[$mic:rule]"))) {
//ScriptWriter~~      <!owl:rule:hasCondition!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:hasCondition")).resetIterator();
//ScriptWriter~~      <![$mic:production:[$mic:rule:production]]!>!resetIterator();
      iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$mic:production:[$mic:rule:production]]")).resetIterator();
      boolean lPerformRule = true;
      boolean lRuleResult = true;

      while (lPerformRule) {
//ScriptWriter~~        lPerformRule = <!owl:rule:hasCondition!>!next();
        lPerformRule = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:hasCondition")).next();
        if (lPerformRule) {
//ScriptWriter~~          lPerformRule = <![$mic:production:[$mic:rule:production]]!>!next();
          lPerformRule = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$mic:production:[$mic:rule:production]]")).next();
          if (lPerformRule) {
//ScriptWriter~~            <!owl:condition!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition")).resetIterator();
//ScriptWriter~~            <!owl!>!scan("condition:name", <![owl:rule:hasCondition:name]!>);
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("condition:name", iSymbolTable.translateProperties("[owl:rule:hasCondition:name]"));
//ScriptWriter~~            <!owl:fact!>!resetIterator();
            iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact")).resetIterator();
//ScriptWriter~~            if (<!owl!>!scan("fact:name", <![[$mic:production:[$mic:rule:production]]]!>) == false) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("fact:name", iSymbolTable.translateProperties("[[$mic:production:[$mic:rule:production]]]")) == false) {
//ScriptWriter~~              %><![[$mic:production:[$mic:rule:production]]]!> fact not found!<!%"\r\n"!><%
              {
//ScriptWriter~~~
iOutputManager.println("" + iSymbolTable.translateProperties("[[$mic:production:[$mic:rule:production]]]") + " fact not found!" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            }
            // Check for consistent symbol assignment (symbol to lid)
//ScriptWriter~~            String lLhs = <![owl:condition:lhs]!>;
            String lLhs = iSymbolTable.translateProperties("[owl:condition:lhs]");
//ScriptWriter~~            if (<!$mic:rule:symbol:" + lLhs + "!>!size() == 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbol:" + lLhs + "")).size() == 0) {
//ScriptWriter~~              <!$mic:rule:symbol:" + lLhs + "!>!set(<![owl:fact:id]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbol:" + lLhs + "")).set(iSymbolTable.translateProperties("[owl:fact:id]"));
            } else {
//ScriptWriter~~              if (!<![$mic:rule:symbol:" + lLhs + "]!>.equals(<![owl:fact:id]!>)) {
              if (!iSymbolTable.translateProperties("[$mic:rule:symbol:" + lLhs + "]").equals(iSymbolTable.translateProperties("[owl:fact:id]"))) {
                lPerformRule = false;
                lRuleResult = false;
                break;
              }
            }
            // Check for reverse symbol assignment (lid to symbol)
//ScriptWriter~~            String lFact = <![owl:fact:id]!>;
            String lFact = iSymbolTable.translateProperties("[owl:fact:id]");
//ScriptWriter~~            if (<!$mic:rule:symbolFact:" + lFact + "!>!size() == 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbolFact:" + lFact + "")).size() == 0) {
//ScriptWriter~~              <!$mic:rule:symbolFact:" + lFact + "!>!set(<![owl:condition:lhs]!>);
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbolFact:" + lFact + "")).set(iSymbolTable.translateProperties("[owl:condition:lhs]"));
            } else {
//ScriptWriter~~              if (!<![$mic:rule:symbolFact:" + lFact + "]!>.equals(<![owl:condition:lhs]!>)) {
              if (!iSymbolTable.translateProperties("[$mic:rule:symbolFact:" + lFact + "]").equals(iSymbolTable.translateProperties("[owl:condition:lhs]"))) {
                lPerformRule = false;
                lRuleResult = false;
                break;
              }
            }
            // Check for consistent symbol assignment (symbol to lid)
//ScriptWriter~~            if (<!owl:condition:rhs!>!size() > 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition:rhs")).size() > 0) {
//ScriptWriter~~              String lRhs = <![owl:condition:rhs]!>;
              String lRhs = iSymbolTable.translateProperties("[owl:condition:rhs]");
//ScriptWriter~~              if (<!$mic:rule:symbol:" + lRhs + "!>!size() == 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbol:" + lRhs + "")).size() == 0) {
//ScriptWriter~~                <!$mic:rule:symbol:" + lRhs + "!>!set(<![owl:fact:rid]!>);
                iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbol:" + lRhs + "")).set(iSymbolTable.translateProperties("[owl:fact:rid]"));
              } else {
//ScriptWriter~~                if (!<![$mic:rule:symbol:" + lRhs + "]!>.equals(<![owl:fact:rid]!>)) {
                if (!iSymbolTable.translateProperties("[$mic:rule:symbol:" + lRhs + "]").equals(iSymbolTable.translateProperties("[owl:fact:rid]"))) {
                  lPerformRule = false;
                  lRuleResult = false;
                  break;
                }
              }
              // Check for reverse symbol assignment (rule to symbol)
//ScriptWriter~~              if (<!$mic:rule:symbolFact:" + lFact + "!>!size() == 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbolFact:" + lFact + "")).size() == 0) {
//ScriptWriter~~                <!$mic:rule:symbolFact:" + lFact + "!>!set(<![owl:condition:rhs]!>);
                iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("$mic:rule:symbolFact:" + lFact + "")).set(iSymbolTable.translateProperties("[owl:condition:rhs]"));
              } else {
//ScriptWriter~~                if (!<![$mic:rule:symbolFact:" + lFact + "]!>.equals(<![owl:condition:rhs]!>)) {
                if (!iSymbolTable.translateProperties("[$mic:rule:symbolFact:" + lFact + "]").equals(iSymbolTable.translateProperties("[owl:condition:rhs]"))) {
                  lPerformRule = false;
                  lRuleResult = false;
                  break;
                }
              }
            } else {
//ScriptWriter~~              if (<!owl:fact:propertyValue!>!size() == 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:propertyValue")).size() == 0) {
//ScriptWriter~~                String lPropertyType = <![owl:fact:type]!>;
                String lPropertyType = iSymbolTable.translateProperties("[owl:fact:type]");
//ScriptWriter~~                if (<!owl:fact:type!>!size() == 0) {
                if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:type")).size() == 0) {
//ScriptWriter~~                  <!owl:fact:propertyValue!>!set(new PropertyValue(<![owl:fact:value]!>));
                  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:propertyValue")).set(new PropertyValue(iSymbolTable.translateProperties("[owl:fact:value]")));
                } else {
//ScriptWriter~~                  <!owl:fact:propertyValue!>!set(new PropertyValue(lPropertyType, <![owl:fact:value]!>));
                  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:propertyValue")).set(new PropertyValue(lPropertyType, iSymbolTable.translateProperties("[owl:fact:value]")));
                }
              }
//ScriptWriter~~              if (<!owl:condition:propertyValue!>!size() == 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition:propertyValue")).size() == 0) {
//ScriptWriter~~                String lPropertyType = <![owl:condition:type]!>;
                String lPropertyType = iSymbolTable.translateProperties("[owl:condition:type]");
//ScriptWriter~~                if (<!owl:condition:type!>!size() == 0) {
                if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition:type")).size() == 0) {
//ScriptWriter~~                  <!owl:condition:propertyValue!>!set(new PropertyValue(<![owl:condition:value]!>));
                  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition:propertyValue")).set(new PropertyValue(iSymbolTable.translateProperties("[owl:condition:value]")));
                } else {
//ScriptWriter~~                  <!owl:condition:propertyValue!>!set(new PropertyValue(lPropertyType, <![owl:condition:value]!>));
                  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition:propertyValue")).set(new PropertyValue(lPropertyType, iSymbolTable.translateProperties("[owl:condition:value]")));
                }
              }
//ScriptWriter~~              if (<!owl:fact:propertyValue!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:propertyValue")).size() > 0) {
//ScriptWriter~~                if (<!owl:condition:propertyValue!>!size() > 0) {
                if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition:propertyValue")).size() > 0) {
//ScriptWriter~~                  PropertyValue lFactPropertyValue = <!owl:fact:propertyValue!>!getPropertyValue();
                  PropertyValue lFactPropertyValue = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:propertyValue")).getPropertyValue();
//ScriptWriter~~                  PropertyValue lConditionPropertyValue = <!owl:condition:propertyValue!>!getPropertyValue();
                  PropertyValue lConditionPropertyValue = iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition:propertyValue")).getPropertyValue();

//ScriptWriter~~                  String lOperation = <![owl:condition:operation]!>.toLowerCase();
                  String lOperation = iSymbolTable.translateProperties("[owl:condition:operation]").toLowerCase();
//ScriptWriter~~                  if (<!owl:condition:operation!>!size() == 0) lOperation = "equal";
                  if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:condition:operation")).size() == 0) lOperation = "equal";

                  if (lOperation.equals("equal") && (lFactPropertyValue.getValueType() != lConditionPropertyValue.getValueType() || lFactPropertyValue.compareTo(lConditionPropertyValue) == 0)) {
                  } else if (lOperation.equals("notequal") && (lFactPropertyValue.getValueType() != lConditionPropertyValue.getValueType() || lFactPropertyValue.compareTo(lConditionPropertyValue) != 0)) {
                  } else if (lOperation.equals("less") && (lFactPropertyValue.getValueType() != lConditionPropertyValue.getValueType() || lFactPropertyValue.compareTo(lConditionPropertyValue) < 0)) {
                  } else if (lOperation.equals("greater") && (lFactPropertyValue.getValueType() != lConditionPropertyValue.getValueType() || lFactPropertyValue.compareTo(lConditionPropertyValue) > 0)) {
                  } else {
                    lPerformRule = false;
                    lRuleResult = false;
                    break;
                  }
                } else {
                  lPerformRule = false;
                  lRuleResult = false;
                  break;
                }
              } else {
                lPerformRule = false;
                lRuleResult = false;
                break;
              }
            }              
          }
        }
      }

      if (lRuleResult) {

        ArrayList lJeoArrayList = new ArrayList(); 
//ScriptWriter~~        <![$mic:production:[$mic:rule:production]]!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$mic:production:[$mic:rule:production]]")).resetIterator();
//ScriptWriter~~        while (<![$mic:production:[$mic:rule:production]]!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("[$mic:production:[$mic:rule:production]]")).next()) {
//ScriptWriter~~          <!owl:fact!>!resetIterator();
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact")).resetIterator();
//ScriptWriter~~          <!owl!>!scan("fact:name", <![[$mic:production:[$mic:rule:production]]]!>);
          iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl")).scan("fact:name", iSymbolTable.translateProperties("[[$mic:production:[$mic:rule:production]]]"));
//ScriptWriter~~          if (<!owl:fact:jeo!>!size() > 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:jeo")).size() > 0) {
//ScriptWriter~~            lJeoArrayList.add((Jeo) <!owl:fact:jeo!>!getValueObject());
            lJeoArrayList.add((Jeo) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:fact:jeo")).getValueObject());
          }
        }

        lProductionPassed = true;

//ScriptWriter~~        if (<![owl:rule:disable]!>.equals("true")) <!owl:rule:disabled!>!reset("true");
        if (iSymbolTable.translateProperties("[owl:rule:disable]").equals("true")) iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:disabled")).reset("true");

//ScriptWriter~~        <!owl:rule:action!>!resetIterator();
        iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action")).resetIterator();
//ScriptWriter~~        while (<!owl:rule:action!>!next()) {
        while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action")).next()) {
//ScriptWriter~~          if (<!owl:rule:action:name!>!size() == 0) {
          if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:name")).size() == 0) {
          } else {
//ScriptWriter~~            %>Action: <![owl:rule:action:name]!><!%"\r\n"!><%
            {
//ScriptWriter~~~
iOutputManager.println("Action: " + iSymbolTable.translateProperties("[owl:rule:action:name]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

            MicScriptHelper lLoadObject = this;
//ScriptWriter~~            if (!<![owl:rule:action:name]!>.equals("?this")) {
            if (!iSymbolTable.translateProperties("[owl:rule:action:name]").equals("?this")) {
//ScriptWriter~~              if (<!owl:rule:action:instance!>!size() > 0) {
              if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:instance")).size() > 0) {
//ScriptWriter~~                lLoadObject = loadScript(<![owl:rule:action:name]!>, <![owl:rule:action:instance]!>);
                lLoadObject = loadScript(iSymbolTable.translateProperties("[owl:rule:action:name]"), iSymbolTable.translateProperties("[owl:rule:action:instance]"));
              } else {
//ScriptWriter~~                lLoadObject = loadScript(<![owl:rule:action:name]!>);
                lLoadObject = loadScript(iSymbolTable.translateProperties("[owl:rule:action:name]"));
              }
            }

//ScriptWriter~~            if (<!owl:rule:action:parameter!>!size() == 0) {
            if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).size() == 0) {
//ScriptWriter~~              iScript.execMethod(lLoadObject, <![owl:rule:action:operation]!>);
              iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[owl:rule:action:operation]"));
//ScriptWriter~~              %>Operation0: <![owl:rule:action:operation]!><!%"\r\n"!><%
              {
//ScriptWriter~~~
iOutputManager.println("Operation0: " + iSymbolTable.translateProperties("[owl:rule:action:operation]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~            } else if (<!owl:rule:action:parameter!>!size() > 0 && <!owl:rule:action:parameter2!>!size() == 0) {
            } else if (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).size() > 0 && iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter2")).size() == 0) {
//ScriptWriter~~              Object lArgs[] = new Object[<!owl:rule:action:parameter!>!size()];
              Object lArgs[] = new Object[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).size()];
//ScriptWriter~~              <!owl:rule:action:parameter!>!resetIterator();
              iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).resetIterator();
//ScriptWriter~~              while (<!owl:rule:action:parameter!>!next()) {
              while (iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).next()) {
//ScriptWriter~~                if (<![owl:rule:action:parameter]!>.equals("?script")) {
                if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?script")) {
//ScriptWriter~~                  lArgs[<!owl:rule:action:parameter!>!getIterator() - 1] = iScript;
                  lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).getIterator() - 1] = iScript;
//ScriptWriter~~                } else if (<![owl:rule:action:parameter]!>.equals("?this")) {
                } else if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?this")) {
//ScriptWriter~~                  lArgs[<!owl:rule:action:parameter!>!getIterator() - 1] = this;
                  lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).getIterator() - 1] = this;
//ScriptWriter~~                } else if (<![owl:rule:action:parameter]!>.equals("?callback")) {
                } else if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?callback")) {
//ScriptWriter~~                  lArgs[<!owl:rule:action:parameter!>!getIterator() - 1] = iJeoOwlEngine;
                  lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).getIterator() - 1] = iJeoOwlEngine;
//ScriptWriter~~                } else if (<![owl:rule:action:parameter]!>.equals("?jeos")) {
                } else if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?jeos")) {
//ScriptWriter~~                  lArgs[<!owl:rule:action:parameter!>!getIterator() - 1] = lJeoArrayList;
                  lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).getIterator() - 1] = lJeoArrayList;
//ScriptWriter~~                } else if (<![owl:rule:action:parameter]!>.equals("?jeo")) {
                } else if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?jeo")) {
//ScriptWriter~~                  lArgs[<!owl:rule:action:parameter!>!getIterator() - 1] = lJeoArrayList.get(0);
                  lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).getIterator() - 1] = lJeoArrayList.get(0);
                } else {
//ScriptWriter~~                  lArgs[<!owl:rule:action:parameter!>!getIterator() - 1] = <![owl:rule:action:parameter]!>;
                  lArgs[iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:action:parameter")).getIterator() - 1] = iSymbolTable.translateProperties("[owl:rule:action:parameter]");
                }
              }
//ScriptWriter~~              %>Operation1: <![owl:rule:action:operation]!><!%"\r\n"!><%
              {
//ScriptWriter~~~
iOutputManager.println("Operation1: " + iSymbolTable.translateProperties("[owl:rule:action:operation]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~              iScript.execMethod(lLoadObject, <![owl:rule:action:operation]!>, lArgs);
              iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[owl:rule:action:operation]"), lArgs);
            } else {
//ScriptWriter~~              if (<![owl:rule:action:parameter]!>.equals("?script")) {
              if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?script")) {
//ScriptWriter~~                %>Operation2: <![owl:rule:action:operation]!><!%"\r\n"!><%
                {
//ScriptWriter~~~
iOutputManager.println("Operation2: " + iSymbolTable.translateProperties("[owl:rule:action:operation]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                iScript.execMethod(lLoadObject, <![owl:rule:action:operation]!>, new Object[]{iScript, <![owl:rule:action:parameter2]!>});
                iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[owl:rule:action:operation]"), new Object[]{iScript, iSymbolTable.translateProperties("[owl:rule:action:parameter2]")});
//ScriptWriter~~              } else if (<![owl:rule:action:parameter]!>.equals("?this")) {
              } else if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?this")) {
//ScriptWriter~~                %>Operation3: <![owl:rule:action:operation]!><!%"\r\n"!><%
                {
//ScriptWriter~~~
iOutputManager.println("Operation3: " + iSymbolTable.translateProperties("[owl:rule:action:operation]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                iScript.execMethod(lLoadObject, <![owl:rule:action:operation]!>, new Object[]{this, <![owl:rule:action:parameter2]!>});
                iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[owl:rule:action:operation]"), new Object[]{this, iSymbolTable.translateProperties("[owl:rule:action:parameter2]")});
//ScriptWriter~~              } else if (<![owl:rule:action:parameter]!>.equals("?callback")) {
              } else if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?callback")) {
//ScriptWriter~~                %>Operation4: <![owl:rule:action:operation]!><!%"\r\n"!><%
                {
//ScriptWriter~~~
iOutputManager.println("Operation4: " + iSymbolTable.translateProperties("[owl:rule:action:operation]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                iScript.execMethod(lLoadObject, <![owl:rule:action:operation]!>, new Object[]{iJeoOwlEngine, <![owl:rule:action:parameter2]!>});
                iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[owl:rule:action:operation]"), new Object[]{iJeoOwlEngine, iSymbolTable.translateProperties("[owl:rule:action:parameter2]")});
//ScriptWriter~~              } else if (<![owl:rule:action:parameter]!>.equals("?jeos")) {
              } else if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?jeos")) {
//ScriptWriter~~                %>Operation5: <![owl:rule:action:operation]!><!%"\r\n"!><%
                {
//ScriptWriter~~~
iOutputManager.println("Operation5: " + iSymbolTable.translateProperties("[owl:rule:action:operation]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                iScript.execMethod(lLoadObject, <![owl:rule:action:operation]!>, new Object[]{lJeoArrayList, <![owl:rule:action:parameter2]!>});
                iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[owl:rule:action:operation]"), new Object[]{lJeoArrayList, iSymbolTable.translateProperties("[owl:rule:action:parameter2]")});
//ScriptWriter~~              } else if (<![owl:rule:action:parameter]!>.equals("?jeo")) {
              } else if (iSymbolTable.translateProperties("[owl:rule:action:parameter]").equals("?jeo")) {
//ScriptWriter~~                %>Operation6: <![owl:rule:action:operation]!><!%"\r\n"!><%
                {
//ScriptWriter~~~
iOutputManager.println("Operation6: " + iSymbolTable.translateProperties("[owl:rule:action:operation]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                iScript.execMethod(lLoadObject, <![owl:rule:action:operation]!>, new Object[]{lJeoArrayList.get(0), <![owl:rule:action:parameter2]!>});
                iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[owl:rule:action:operation]"), new Object[]{lJeoArrayList.get(0), iSymbolTable.translateProperties("[owl:rule:action:parameter2]")});
              } else {
//ScriptWriter~~                %>Operation7: <![owl:rule:action:operation]!><!%"\r\n"!><%
                {
//ScriptWriter~~~
iOutputManager.println("Operation7: " + iSymbolTable.translateProperties("[owl:rule:action:operation]") + "" + "\r\n" + "", false);
//ScriptWriter~~~
}
//ScriptWriter~~~

//ScriptWriter~~                iScript.execMethod(lLoadObject, <![owl:rule:action:operation]!>, new Object[]{<![owl:rule:action:parameter]!>, <![owl:rule:action:parameter2]!>});
                iScript.execMethod(lLoadObject, iSymbolTable.translateProperties("[owl:rule:action:operation]"), new Object[]{iSymbolTable.translateProperties("[owl:rule:action:parameter]"), iSymbolTable.translateProperties("[owl:rule:action:parameter2]")});
              }
            }
          }
        }
//ScriptWriter~~        if (aCallback != null && <!owl:rule:callback!>!size() > 0) iScript.execMethod(aCallback, <![owl:rule:callback]!>, new Object[]{<![owl:rule:name]!>});
        if (aCallback != null && iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("owl:rule:callback")).size() > 0) iScript.execMethod(aCallback, iSymbolTable.translateProperties("[owl:rule:callback]"), new Object[]{iSymbolTable.translateProperties("[owl:rule:name]")});
//ScriptWriter~~        if (<![owl:rule:breakOnRule]!>.equals("true") || <![owl:rule:breakOnProduction]!>.equals("true")) return lProductionPassed;
        if (iSymbolTable.translateProperties("[owl:rule:breakOnRule]").equals("true") || iSymbolTable.translateProperties("[owl:rule:breakOnProduction]").equals("true")) return lProductionPassed;
      }
    }
  }
  return lProductionPassed;
}

public void setProcessRules(boolean aValue) {
  iProcessRules = aValue;
}

private boolean greaterThan(String aValue1, String aValue2) {
  if (aValue1.compareTo(aValue2) > 0) return true;
  return false;
}

private boolean lessThan(String aValue1, String aValue2) {
  if (aValue1.compareTo(aValue2) < 0) return true;
  return false;
}

private boolean equals(String aValue1, String aValue2) {
  if (aValue1.compareTo(aValue2) == 0) return true;
  return false;
}
}
