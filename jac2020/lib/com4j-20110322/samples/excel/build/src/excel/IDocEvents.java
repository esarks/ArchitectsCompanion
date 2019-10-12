package excel  ;

import com4j.*;

@IID("{00024411-0001-0000-C000-000000000046}")
public interface IDocEvents extends Com4jObject {
  // Methods:
  /**
   * @param target Mandatory excel.Range parameter.
   */

  @VTID(7)
  void selectionChange(
    excel.Range target);


  /**
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(8)
  void beforeDoubleClick(
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(9)
  void beforeRightClick(
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   */

  @VTID(10)
  void activate();


  /**
   */

  @VTID(11)
  void deactivate();


  /**
   */

  @VTID(12)
  void calculate();


  /**
   * @param target Mandatory excel.Range parameter.
   */

  @VTID(13)
  void change(
    excel.Range target);


  /**
   * @param target Mandatory excel.Hyperlink parameter.
   */

  @VTID(14)
  void followHyperlink(
    excel.Hyperlink target);


  /**
   * @param target Mandatory excel.PivotTable parameter.
   */

  @VTID(15)
  void pivotTableUpdate(
    excel.PivotTable target);


  // Properties:
}
