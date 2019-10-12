//ScriptWriter~~package <#[$jac:script:package]#>;
package scripts_migrate.Demo.PreserveSections;

import com.esarks.jac.*;
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

//ScriptWriter~~public class <#[$jac:script]#> extends <#[$jac:script:extends]#> {
public class PreserveSections extends com.esarks.mic.Component {

//ScriptWriter~~  protected <#[$jac:script]#>() {
  protected PreserveSections() {
  }

//ScriptWriter~~  public <#[$jac:script]#>(Script aScript) {
  public PreserveSections(Script aScript) {

    super(aScript);

  }

public void execute() {

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~***************************************
iOutputManager.println("***************************************", true);
//ScriptWriter~~***************************************
iOutputManager.println("***************************************", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


//ScriptWriter~~  <!sectionMarker!>!reset("$Section Name=");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("sectionMarker")).reset("$Section Name=");
//ScriptWriter~~  <!preserveMarker!>!reset("$Preserve=yes");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("preserveMarker")).reset("$Preserve=yes");
//ScriptWriter~~  <!noPreserveMarker!>!reset("$Preserve=no");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("noPreserveMarker")).reset("$Preserve=no");
//ScriptWriter~~  <!discardPreserveMarker!>!reset("$Preserve=discard");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("discardPreserveMarker")).reset("$Preserve=discard");
//ScriptWriter~~  <!preservePreamble!>!reset("no");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("preservePreamble")).reset("no");
//ScriptWriter~~  <!comments!>!reset("//");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("comments")).reset("//");
//ScriptWriter~~  <!excludeCompare!>!reset("This File Generated At");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("excludeCompare")).reset("This File Generated At");
//ScriptWriter~~  <!trimOutput!>!reset("yes");
  iPropertyHelper.setPropertyName(iScript, iSymbolTable.translateProperties("trimOutput")).reset("yes");

  openOutput(path("scripts_migrate.Demo.PreserveSections.") + "test1.txt");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~This is the preamble (the section preceeding the first section marker).
iOutputManager.println("This is the preamble (the section preceeding the first section marker).", true);
//ScriptWriter~~Depending on the preservePreamble flag, this section is preserved or overwritten.
iOutputManager.println("Depending on the preservePreamble flag, this section is preserved or overwritten.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~If only the timestamp changes, the file is not considered modified.
iOutputManager.println("If only the timestamp changes, the file is not considered modified.", true);
//ScriptWriter~~This File Generated At <![$jac:dateTime]!>
iOutputManager.println("This File Generated At " + iSymbolTable.translateProperties("[$jac:dateTime]") + "", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~$Section Name=One  $Preserve=yes
iOutputManager.println("$Section Name=One  $Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  Modifications made to this section are preserved.
iOutputManager.println("  Modifications made to this section are preserved.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~$Section Name=Two  $Preserve=no
iOutputManager.println("$Section Name=Two  $Preserve=no", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  Modifications made to this section are overwritten.
iOutputManager.println("  Modifications made to this section are overwritten.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~$Section Name=Three $Preserve=discard
iOutputManager.println("$Section Name=Three $Preserve=discard", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  This section is discarded.
iOutputManager.println("  This section is discarded.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~$Section Name=Four $Preserve=yes
iOutputManager.println("$Section Name=Four $Preserve=yes", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~  The final section (after the discarded section) is preserved.
iOutputManager.println("  The final section (after the discarded section) is preserved.", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


  closeOutput();
  merge(path("scripts_migrate.Demo.PreserveSections.") + "test2.txt", path("scripts_migrate.Demo.PreserveSections.") + "test1.txt");

//ScriptWriter~~%>
{
//ScriptWriter~~~
iOutputManager.println("", false);
//ScriptWriter~~***************************************
iOutputManager.println("***************************************", true);
//ScriptWriter~~***************************************
iOutputManager.println("***************************************", true);
//ScriptWriter~~
iOutputManager.println("", true);
//ScriptWriter~~<%
iOutputManager.println("", false);
//ScriptWriter~~~
}
//ScriptWriter~~~


}
}
