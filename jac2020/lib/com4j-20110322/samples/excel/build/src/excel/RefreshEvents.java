package excel  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface RefreshEvents extends Com4jObject {
  // Methods:
  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1596)
  void beforeRefresh(
    Holder<Boolean> cancel);


  /**
   * @param success Mandatory boolean parameter.
   */

  @DISPID(1597)
  void afterRefresh(
    boolean success);


  // Properties:
}
