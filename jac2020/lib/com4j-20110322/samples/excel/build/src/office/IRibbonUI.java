package office  ;

import com4j.*;

@IID("{000C03A7-0000-0000-C000-000000000046}")
public interface IRibbonUI extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void invalidate();


  /**
   * @param controlID Mandatory java.lang.String parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void invalidateControl(
    java.lang.String controlID);


  // Properties:
}
