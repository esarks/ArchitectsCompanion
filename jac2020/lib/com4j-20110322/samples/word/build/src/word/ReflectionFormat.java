package word  ;

import com4j.*;

@IID("{F01943FF-1985-445E-8602-8FB8F39CCA75}")
public interface ReflectionFormat extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type office.MsoReflectionType
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  office.MsoReflectionType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param prop Mandatory office.MsoReflectionType parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  void type(
    office.MsoReflectionType prop);


  // Properties:
}
