package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface AppEvents extends Com4jObject {
  // Methods:
  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1565)
  void newWorkbook(
    excel._Workbook wb);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   */

  @DISPID(1558)
  void sheetSelectionChange(
    com4j.Com4jObject sh,
    excel.Range target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1559)
  void sheetBeforeDoubleClick(
    com4j.Com4jObject sh,
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1560)
  void sheetBeforeRightClick(
    com4j.Com4jObject sh,
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1561)
  void sheetActivate(
    com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1562)
  void sheetDeactivate(
    com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1563)
  void sheetCalculate(
    com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Range parameter.
   */

  @DISPID(1564)
  void sheetChange(
    com4j.Com4jObject sh,
    excel.Range target);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1567)
  void workbookOpen(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1568)
  void workbookActivate(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1569)
  void workbookDeactivate(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1570)
  void workbookBeforeClose(
    excel._Workbook wb,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param saveAsUI Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1571)
  void workbookBeforeSave(
    excel._Workbook wb,
    boolean saveAsUI,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1572)
  void workbookBeforePrint(
    excel._Workbook wb,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1573)
  void workbookNewSheet(
    excel._Workbook wb,
    com4j.Com4jObject sh);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1574)
  void workbookAddinInstall(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   */

  @DISPID(1575)
  void workbookAddinUninstall(
    excel._Workbook wb);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param wn Mandatory excel.Window parameter.
   */

  @DISPID(1554)
  void windowResize(
    excel._Workbook wb,
    excel.Window wn);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param wn Mandatory excel.Window parameter.
   */

  @DISPID(1556)
  void windowActivate(
    excel._Workbook wb,
    excel.Window wn);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param wn Mandatory excel.Window parameter.
   */

  @DISPID(1557)
  void windowDeactivate(
    excel._Workbook wb,
    excel.Window wn);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.Hyperlink parameter.
   */

  @DISPID(1854)
  void sheetFollowHyperlink(
    com4j.Com4jObject sh,
    excel.Hyperlink target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2157)
  void sheetPivotTableUpdate(
    com4j.Com4jObject sh,
    excel.PivotTable target);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2160)
  void workbookPivotTableCloseConnection(
    excel._Workbook wb,
    excel.PivotTable target);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2161)
  void workbookPivotTableOpenConnection(
    excel._Workbook wb,
    excel.PivotTable target);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param syncEventType Mandatory office.MsoSyncEventType parameter.
   */

  @DISPID(2289)
  void workbookSync(
    excel._Workbook wb,
    office.MsoSyncEventType syncEventType);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2290)
  void workbookBeforeXmlImport(
    excel._Workbook wb,
    excel.XmlMap map,
    java.lang.String url,
    boolean isRefresh,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param result Mandatory excel.XlXmlImportResult parameter.
   */

  @DISPID(2291)
  void workbookAfterXmlImport(
    excel._Workbook wb,
    excel.XmlMap map,
    boolean isRefresh,
    excel.XlXmlImportResult result);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2292)
  void workbookBeforeXmlExport(
    excel._Workbook wb,
    excel.XmlMap map,
    java.lang.String url,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param result Mandatory excel.XlXmlExportResult parameter.
   */

  @DISPID(2293)
  void workbookAfterXmlExport(
    excel._Workbook wb,
    excel.XmlMap map,
    java.lang.String url,
    excel.XlXmlExportResult result);


  /**
   * @param wb Mandatory excel._Workbook parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param sheet Mandatory java.lang.String parameter.
   * @param success Mandatory boolean parameter.
   */

  @DISPID(2611)
  void workbookRowsetComplete(
    excel._Workbook wb,
    java.lang.String description,
    java.lang.String sheet,
    boolean success);


  /**
   */

  @DISPID(2612)
  void afterCalculate();


  // Properties:
}
