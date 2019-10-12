package vba  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _dispReferences_Events extends Com4jObject {
  // Methods:
  /**
   * @param reference Mandatory vba.Reference parameter.
   */

  @DISPID(0)
  @DefaultMethod
  void itemAdded(
    vba.Reference reference);


  /**
   * @param reference Mandatory vba.Reference parameter.
   */

  @DISPID(1)
  void itemRemoved(
    vba.Reference reference);


  // Properties:
}
