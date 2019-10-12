package office  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _CustomTaskPaneEvents extends Com4jObject {
  // Methods:
  /**
   * @param customTaskPaneInst Mandatory office._CustomTaskPane parameter.
   */

  @DISPID(1)
  void visibleStateChange(
    office._CustomTaskPane customTaskPaneInst);


  /**
   * @param customTaskPaneInst Mandatory office._CustomTaskPane parameter.
   */

  @DISPID(2)
  void dockPositionStateChange(
    office._CustomTaskPane customTaskPaneInst);


  // Properties:
}
