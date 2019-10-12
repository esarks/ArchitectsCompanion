package office  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _CustomXMLPartsEvents extends Com4jObject {
  // Methods:
  /**
   * @param newPart Mandatory office._CustomXMLPart parameter.
   */

  @DISPID(1)
  void partAfterAdd(
    office._CustomXMLPart newPart);


  /**
   * @param oldPart Mandatory office._CustomXMLPart parameter.
   */

  @DISPID(2)
  void partBeforeDelete(
    office._CustomXMLPart oldPart);


  /**
   * @param part Mandatory office._CustomXMLPart parameter.
   */

  @DISPID(3)
  void partAfterLoad(
    office._CustomXMLPart part);


  // Properties:
}
