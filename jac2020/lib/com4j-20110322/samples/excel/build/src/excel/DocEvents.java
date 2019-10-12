package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface DocEvents extends Com4jObject {
  // Methods:
  /**
   * @param target Mandatory excel.Range parameter.
   */

  @DISPID(1543)
  void selectionChange(
    excel.Range target);


  /**
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1537)
  void beforeDoubleClick(
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   * @param target Mandatory excel.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1534)
  void beforeRightClick(
    excel.Range target,
    Holder<Boolean> cancel);


  /**
   */

  @DISPID(304)
  void activate();


  /**
   */

  @DISPID(1530)
  void deactivate();


  /**
   */

  @DISPID(279)
  void calculate();


  /**
   * @param target Mandatory excel.Range parameter.
   */

  @DISPID(1545)
  void change(
    excel.Range target);


  /**
   * @param target Mandatory excel.Hyperlink parameter.
   */

  @DISPID(1470)
  void followHyperlink(
    excel.Hyperlink target);


  /**
   * @param target Mandatory excel.PivotTable parameter.
   */

  @DISPID(2156)
  void pivotTableUpdate(
    excel.PivotTable target);


  // Properties:
}
