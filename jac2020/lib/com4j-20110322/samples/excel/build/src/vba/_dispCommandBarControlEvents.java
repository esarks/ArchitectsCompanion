package vba  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _dispCommandBarControlEvents extends Com4jObject {
  // Methods:
  /**
   * @param commandBarControl Mandatory com4j.Com4jObject parameter.
   * @param handled Mandatory Holder<Boolean> parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1)
  void click(
    com4j.Com4jObject commandBarControl,
    Holder<Boolean> handled,
    Holder<Boolean> cancelDefault);


  // Properties:
}
