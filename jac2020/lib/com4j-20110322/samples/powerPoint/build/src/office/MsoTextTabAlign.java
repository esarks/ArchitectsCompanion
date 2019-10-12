package office  ;

import com4j.*;

/**
 */
public enum MsoTextTabAlign implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  msoTabAlignMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  msoTabAlignLeft(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  msoTabAlignCenter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  msoTabAlignRight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  msoTabAlignDecimal(3),
  ;

  private final int value;
  MsoTextTabAlign(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
