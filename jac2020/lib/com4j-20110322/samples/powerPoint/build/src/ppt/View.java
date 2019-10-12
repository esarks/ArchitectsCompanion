package ppt  ;

import com4j.*;

@IID("{91493458-5A91-11CF-8700-00AA0060263B}")
public interface View extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type ppt._Application
   */

  @DISPID(2001) //= 0x7d1. The runtime will prefer the VTID if present
  @VTID(7)
  ppt._Application application();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2002) //= 0x7d2. The runtime will prefer the VTID if present
  @VTID(8)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type ppt.PpViewType
   */

  @DISPID(2003) //= 0x7d3. The runtime will prefer the VTID if present
  @VTID(9)
  ppt.PpViewType type();


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(10)
  int zoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param zoom Mandatory int parameter.
   */

  @DISPID(2004) //= 0x7d4. The runtime will prefer the VTID if present
  @VTID(11)
  void zoom(
    int zoom);


  /**
   */

  @DISPID(2005) //= 0x7d5. The runtime will prefer the VTID if present
  @VTID(12)
  void paste();


  /**
   * <p>
   * Getter method for the COM property "Slide"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject slide();


  /**
   * <p>
   * Setter method for the COM property "Slide"
   * </p>
   * @param slide Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(2006) //= 0x7d6. The runtime will prefer the VTID if present
  @VTID(14)
  void slide(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject slide);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(2007) //= 0x7d7. The runtime will prefer the VTID if present
  @VTID(15)
  void gotoSlide(
    int index);


  /**
   * <p>
   * Getter method for the COM property "DisplaySlideMiniature"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(16)
  office.MsoTriState displaySlideMiniature();


  /**
   * <p>
   * Setter method for the COM property "DisplaySlideMiniature"
   * </p>
   * @param displaySlideMiniature Mandatory office.MsoTriState parameter.
   */

  @DISPID(2008) //= 0x7d8. The runtime will prefer the VTID if present
  @VTID(17)
  void displaySlideMiniature(
    office.MsoTriState displaySlideMiniature);


  /**
   * <p>
   * Getter method for the COM property "ZoomToFit"
   * </p>
   * @return  Returns a value of type office.MsoTriState
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(18)
  office.MsoTriState zoomToFit();


  /**
   * <p>
   * Setter method for the COM property "ZoomToFit"
   * </p>
   * @param zoomToFit Mandatory office.MsoTriState parameter.
   */

  @DISPID(2009) //= 0x7d9. The runtime will prefer the VTID if present
  @VTID(19)
  void zoomToFit(
    office.MsoTriState zoomToFit);


  /**
   * @param dataType Optional parameter. Default value is 0
   * @param displayAsIcon Optional parameter. Default value is 0
   * @param iconFileName Optional parameter. Default value is ""
   * @param iconIndex Optional parameter. Default value is 0
   * @param iconLabel Optional parameter. Default value is ""
   * @param link Optional parameter. Default value is 0
   */

  @DISPID(2010) //= 0x7da. The runtime will prefer the VTID if present
  @VTID(20)
  void pasteSpecial(
    @Optional @DefaultValue("0") ppt.PpPasteDataType dataType,
    @Optional @DefaultValue("0") office.MsoTriState displayAsIcon,
    @Optional @DefaultValue("") java.lang.String iconFileName,
    @Optional @DefaultValue("0") int iconIndex,
    @Optional @DefaultValue("") java.lang.String iconLabel,
    @Optional @DefaultValue("0") office.MsoTriState link);


  /**
   * <p>
   * Getter method for the COM property "PrintOptions"
   * </p>
   * @return  Returns a value of type ppt.PrintOptions
   */

  @DISPID(2011) //= 0x7db. The runtime will prefer the VTID if present
  @VTID(21)
  ppt.PrintOptions printOptions();


  /**
   * @param from Optional parameter. Default value is -1
   * @param to Optional parameter. Default value is -1
   * @param printToFile Optional parameter. Default value is ""
   * @param copies Optional parameter. Default value is 0
   * @param collate Optional parameter. Default value is -99
   */

  @DISPID(2012) //= 0x7dc. The runtime will prefer the VTID if present
  @VTID(22)
  void printOut(
    @Optional @DefaultValue("-1") int from,
    @Optional @DefaultValue("-1") int to,
    @Optional @DefaultValue("") java.lang.String printToFile,
    @Optional @DefaultValue("0") int copies,
    @Optional @DefaultValue("-99") office.MsoTriState collate);


  // Properties:
}
