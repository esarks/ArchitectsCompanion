package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ChartEvents extends Com4jObject {
  // Methods:
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

  @DISPID(256)
  void resize();


  /**
   * @param button Mandatory int parameter.
   * @param shift Mandatory int parameter.
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1531)
  void mouseDown(
    int button,
    int shift,
    int x,
    int y);


  /**
   * @param button Mandatory int parameter.
   * @param shift Mandatory int parameter.
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1532)
  void mouseUp(
    int button,
    int shift,
    int x,
    int y);


  /**
   * @param button Mandatory int parameter.
   * @param shift Mandatory int parameter.
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(1533)
  void mouseMove(
    int button,
    int shift,
    int x,
    int y);


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1534)
  void beforeRightClick(
    Holder<Boolean> cancel);


  /**
   */

  @DISPID(1535)
  void dragPlot();


  /**
   */

  @DISPID(1536)
  void dragOver();


  /**
   * @param elementID Mandatory int parameter.
   * @param arg1 Mandatory int parameter.
   * @param arg2 Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1537)
  void beforeDoubleClick(
    int elementID,
    int arg1,
    int arg2,
    Holder<Boolean> cancel);


  /**
   * @param elementID Mandatory int parameter.
   * @param arg1 Mandatory int parameter.
   * @param arg2 Mandatory int parameter.
   */

  @DISPID(235)
  void select(
    int elementID,
    int arg1,
    int arg2);


  /**
   * @param seriesIndex Mandatory int parameter.
   * @param pointIndex Mandatory int parameter.
   */

  @DISPID(1538)
  void seriesChange(
    int seriesIndex,
    int pointIndex);


  /**
   */

  @DISPID(279)
  void calculate();


  // Properties:
}
