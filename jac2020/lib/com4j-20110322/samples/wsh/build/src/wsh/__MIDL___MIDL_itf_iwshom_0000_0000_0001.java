package wsh  ;

import com4j.*;

/**
 */
public enum __MIDL___MIDL_itf_iwshom_0000_0000_0001 implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  Normal(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  ReadOnly(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  Hidden(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  System(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  Volume(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  Directory(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  Archive(32),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  Alias(1024),
  /**
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  Compressed(2048),
  ;

  private final int value;
  __MIDL___MIDL_itf_iwshom_0000_0000_0001(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
