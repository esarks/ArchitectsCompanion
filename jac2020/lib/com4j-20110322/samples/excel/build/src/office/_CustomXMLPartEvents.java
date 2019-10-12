package office  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _CustomXMLPartEvents extends Com4jObject {
  // Methods:
  /**
   * @param newNode Mandatory office.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(1)
  void nodeAfterInsert(
    office.CustomXMLNode newNode,
    boolean inUndoRedo);


  /**
   * @param oldNode Mandatory office.CustomXMLNode parameter.
   * @param oldParentNode Mandatory office.CustomXMLNode parameter.
   * @param oldNextSibling Mandatory office.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(2)
  void nodeAfterDelete(
    office.CustomXMLNode oldNode,
    office.CustomXMLNode oldParentNode,
    office.CustomXMLNode oldNextSibling,
    boolean inUndoRedo);


  /**
   * @param oldNode Mandatory office.CustomXMLNode parameter.
   * @param newNode Mandatory office.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(3)
  void nodeAfterReplace(
    office.CustomXMLNode oldNode,
    office.CustomXMLNode newNode,
    boolean inUndoRedo);


  // Properties:
}
