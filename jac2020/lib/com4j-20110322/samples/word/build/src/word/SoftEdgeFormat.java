package word  ;

import com4j.*;

@IID("{D040DAF9-6CE4-4BE8-839D-F4538A4301CF}")
public interface SoftEdgeFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoSoftEdgeType
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  office.MsoSoftEdgeType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory office.MsoSoftEdgeType parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void type(
    office.MsoSoftEdgeType prop);


  // Properties:
}
