package office  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _CommandBarButtonEvents extends Com4jObject {
  // Methods:
  /**
   * @param ctrl Mandatory office._CommandBarButton parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1)
  void click(
    office._CommandBarButton ctrl,
    Holder<Boolean> cancelDefault);


  // Properties:
}
