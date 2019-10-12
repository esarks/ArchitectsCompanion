import com.esarks.jac.*;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:1
import java.util.*;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:2
import java.io.*;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:3
import java.util.*;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:4
import java.text.*;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:5
public class Start {  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:7
  private Script script;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:9
  private SymbolTable symbolTable;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:10
  private OutputManager outputManager;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:11
  private PropertyHelper propertyHelper;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:12
  private Start() {  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:14
  }  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:15
  public Start(Script aScript) {  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:17
    script = aScript;  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:19
    symbolTable = script.getSymbolTable();  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:20
    outputManager = script.getOutputManager();  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:21
    propertyHelper = new PropertyHelper(script);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:22
  }  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:24
  public void execute(String aArguments[]) {  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:26
    //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPrefix.script:27
{ // Start of output block
    outputManager.println("********************************", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:1
    outputManager.println("********************************", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:2
    outputManager.println("********************************", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:3
    outputManager.println("", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:4
} // End of output block
  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:5
  symbolTable.parseXml(symbolTable.translateProperties("[$scriptPath]Data.xml"));  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:7
  propertyHelper.setPropertyName(symbolTable.translateProperties("data:item")).resetIterator();  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:9
  while (propertyHelper.setPropertyName(symbolTable.translateProperties("data:item")).next()) {  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:10
    //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:12
{ // Start of output block
    outputManager.println("  " + symbolTable.translateProperties("[data:item:attribute]") + "", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:13
} // End of output block
  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:14
  }  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:15
    //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:16
{ // Start of output block
    outputManager.println("", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:17
    outputManager.println("********************************", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:18
    outputManager.println("********************************", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:19
    outputManager.println("********************************", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:20
    outputManager.println("", true);  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\Start.script:21
} // End of output block
  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPostfix.script:1
  }  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPostfix.script:2
}  //@ C:\ArchitectsCompanion\Acv5\ScriptsLibrary\Test\ParseXml\..\..\Common\scriptPostfix.script:3
