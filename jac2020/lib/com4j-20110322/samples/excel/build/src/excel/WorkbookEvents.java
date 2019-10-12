package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface WorkbookEvents extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1923)
  void open();


  /**
   */

  @DISPID(304)
  void activate();


  /**
   */

  @DISPID(1530)
  void deactivate();


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1546)
  void beforeClose(
    Holder<Boolean> cancel);


  /**
   * @param saveAsUI Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1547)
  void beforeSave(
    boolean saveAsUI,
    Holder<Boolean> cancel);


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1549)
  void beforePrint(
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1550)
  void newSheet(
    com4j.Com4jObject sh);


  /**
   */

  @DISPID(1552)
  void addinInstall();


  /**
   */

  @DISPID(1553)
  void addinUninstall();


  /**
   * @param wn Mandatory excel.Window parameter.
   */

  @DISPID(1554)
  void windowResize(
    excel.Window wn);


  /**
   * @param wn Mandatory excel.Window parameter.
   */

  @DISPID(1556)
  void windowActivate(
    excel.Window wn);


  /**
   * @param wn Mandatory excel.Window parameter.
   */

  @DISPID(1557)
  void windowDeactivate(
    excel.Window wn);


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
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2158)
  void pivotTableCloseConnection(
    excel.PivotTable target);


  /**
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2159)
  void pivotTableOpenConnection(
    excel.PivotTable target);


  /**
   * @param syncEventType Mandatory office.MsoSyncEventType parameter.
   */

  @DISPID(2266)
  void sync(
    office.MsoSyncEventType syncEventType);


  /**
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2283)
  void beforeXmlImport(
    excel.XmlMap map,
    java.lang.String url,
    boolean isRefresh,
    Holder<Boolean> cancel);


  /**
   * @param map Mandatory excel.XmlMap parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param result Mandatory excel.XlXmlImportResult parameter.
   */

  @DISPID(2285)
  void afterXmlImport(
    excel.XmlMap map,
    boolean isRefresh,
    excel.XlXmlImportResult result);


  /**
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2287)
  void beforeXmlExport(
    excel.XmlMap map,
    java.lang.String url,
    Holder<Boolean> cancel);


  /**
   * @param map Mandatory excel.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param result Mandatory excel.XlXmlExportResult parameter.
   */

  @DISPID(2288)
  void afterXmlExport(
    excel.XmlMap map,
    java.lang.String url,
    excel.XlXmlExportResult result);


  /**
   * @param description Mandatory java.lang.String parameter.
   * @param sheet Mandatory java.lang.String parameter.
   * @param success Mandatory boolean parameter.
   */

  @DISPID(2610)
  void rowsetComplete(
    java.lang.String description,
    java.lang.String sheet,
    boolean success);


  // Properties:
}
