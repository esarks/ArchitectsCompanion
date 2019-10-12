package ppt  ;

import com4j.*;

/**
 */
public enum PpEntryEffect implements ComEnum {
  /**
   * <p>
   * The value of this constant is -2
   * </p>
   */
  ppEffectMixed(-2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  ppEffectNone(0),
  /**
   * <p>
   * The value of this constant is 257
   * </p>
   */
  ppEffectCut(257),
  /**
   * <p>
   * The value of this constant is 258
   * </p>
   */
  ppEffectCutThroughBlack(258),
  /**
   * <p>
   * The value of this constant is 513
   * </p>
   */
  ppEffectRandom(513),
  /**
   * <p>
   * The value of this constant is 769
   * </p>
   */
  ppEffectBlindsHorizontal(769),
  /**
   * <p>
   * The value of this constant is 770
   * </p>
   */
  ppEffectBlindsVertical(770),
  /**
   * <p>
   * The value of this constant is 1025
   * </p>
   */
  ppEffectCheckerboardAcross(1025),
  /**
   * <p>
   * The value of this constant is 1026
   * </p>
   */
  ppEffectCheckerboardDown(1026),
  /**
   * <p>
   * The value of this constant is 1281
   * </p>
   */
  ppEffectCoverLeft(1281),
  /**
   * <p>
   * The value of this constant is 1282
   * </p>
   */
  ppEffectCoverUp(1282),
  /**
   * <p>
   * The value of this constant is 1283
   * </p>
   */
  ppEffectCoverRight(1283),
  /**
   * <p>
   * The value of this constant is 1284
   * </p>
   */
  ppEffectCoverDown(1284),
  /**
   * <p>
   * The value of this constant is 1285
   * </p>
   */
  ppEffectCoverLeftUp(1285),
  /**
   * <p>
   * The value of this constant is 1286
   * </p>
   */
  ppEffectCoverRightUp(1286),
  /**
   * <p>
   * The value of this constant is 1287
   * </p>
   */
  ppEffectCoverLeftDown(1287),
  /**
   * <p>
   * The value of this constant is 1288
   * </p>
   */
  ppEffectCoverRightDown(1288),
  /**
   * <p>
   * The value of this constant is 1537
   * </p>
   */
  ppEffectDissolve(1537),
  /**
   * <p>
   * The value of this constant is 1793
   * </p>
   */
  ppEffectFade(1793),
  /**
   * <p>
   * The value of this constant is 2049
   * </p>
   */
  ppEffectUncoverLeft(2049),
  /**
   * <p>
   * The value of this constant is 2050
   * </p>
   */
  ppEffectUncoverUp(2050),
  /**
   * <p>
   * The value of this constant is 2051
   * </p>
   */
  ppEffectUncoverRight(2051),
  /**
   * <p>
   * The value of this constant is 2052
   * </p>
   */
  ppEffectUncoverDown(2052),
  /**
   * <p>
   * The value of this constant is 2053
   * </p>
   */
  ppEffectUncoverLeftUp(2053),
  /**
   * <p>
   * The value of this constant is 2054
   * </p>
   */
  ppEffectUncoverRightUp(2054),
  /**
   * <p>
   * The value of this constant is 2055
   * </p>
   */
  ppEffectUncoverLeftDown(2055),
  /**
   * <p>
   * The value of this constant is 2056
   * </p>
   */
  ppEffectUncoverRightDown(2056),
  /**
   * <p>
   * The value of this constant is 2305
   * </p>
   */
  ppEffectRandomBarsHorizontal(2305),
  /**
   * <p>
   * The value of this constant is 2306
   * </p>
   */
  ppEffectRandomBarsVertical(2306),
  /**
   * <p>
   * The value of this constant is 2561
   * </p>
   */
  ppEffectStripsUpLeft(2561),
  /**
   * <p>
   * The value of this constant is 2562
   * </p>
   */
  ppEffectStripsUpRight(2562),
  /**
   * <p>
   * The value of this constant is 2563
   * </p>
   */
  ppEffectStripsDownLeft(2563),
  /**
   * <p>
   * The value of this constant is 2564
   * </p>
   */
  ppEffectStripsDownRight(2564),
  /**
   * <p>
   * The value of this constant is 2565
   * </p>
   */
  ppEffectStripsLeftUp(2565),
  /**
   * <p>
   * The value of this constant is 2566
   * </p>
   */
  ppEffectStripsRightUp(2566),
  /**
   * <p>
   * The value of this constant is 2567
   * </p>
   */
  ppEffectStripsLeftDown(2567),
  /**
   * <p>
   * The value of this constant is 2568
   * </p>
   */
  ppEffectStripsRightDown(2568),
  /**
   * <p>
   * The value of this constant is 2817
   * </p>
   */
  ppEffectWipeLeft(2817),
  /**
   * <p>
   * The value of this constant is 2818
   * </p>
   */
  ppEffectWipeUp(2818),
  /**
   * <p>
   * The value of this constant is 2819
   * </p>
   */
  ppEffectWipeRight(2819),
  /**
   * <p>
   * The value of this constant is 2820
   * </p>
   */
  ppEffectWipeDown(2820),
  /**
   * <p>
   * The value of this constant is 3073
   * </p>
   */
  ppEffectBoxOut(3073),
  /**
   * <p>
   * The value of this constant is 3074
   * </p>
   */
  ppEffectBoxIn(3074),
  /**
   * <p>
   * The value of this constant is 3329
   * </p>
   */
  ppEffectFlyFromLeft(3329),
  /**
   * <p>
   * The value of this constant is 3330
   * </p>
   */
  ppEffectFlyFromTop(3330),
  /**
   * <p>
   * The value of this constant is 3331
   * </p>
   */
  ppEffectFlyFromRight(3331),
  /**
   * <p>
   * The value of this constant is 3332
   * </p>
   */
  ppEffectFlyFromBottom(3332),
  /**
   * <p>
   * The value of this constant is 3333
   * </p>
   */
  ppEffectFlyFromTopLeft(3333),
  /**
   * <p>
   * The value of this constant is 3334
   * </p>
   */
  ppEffectFlyFromTopRight(3334),
  /**
   * <p>
   * The value of this constant is 3335
   * </p>
   */
  ppEffectFlyFromBottomLeft(3335),
  /**
   * <p>
   * The value of this constant is 3336
   * </p>
   */
  ppEffectFlyFromBottomRight(3336),
  /**
   * <p>
   * The value of this constant is 3337
   * </p>
   */
  ppEffectPeekFromLeft(3337),
  /**
   * <p>
   * The value of this constant is 3338
   * </p>
   */
  ppEffectPeekFromDown(3338),
  /**
   * <p>
   * The value of this constant is 3339
   * </p>
   */
  ppEffectPeekFromRight(3339),
  /**
   * <p>
   * The value of this constant is 3340
   * </p>
   */
  ppEffectPeekFromUp(3340),
  /**
   * <p>
   * The value of this constant is 3341
   * </p>
   */
  ppEffectCrawlFromLeft(3341),
  /**
   * <p>
   * The value of this constant is 3342
   * </p>
   */
  ppEffectCrawlFromUp(3342),
  /**
   * <p>
   * The value of this constant is 3343
   * </p>
   */
  ppEffectCrawlFromRight(3343),
  /**
   * <p>
   * The value of this constant is 3344
   * </p>
   */
  ppEffectCrawlFromDown(3344),
  /**
   * <p>
   * The value of this constant is 3345
   * </p>
   */
  ppEffectZoomIn(3345),
  /**
   * <p>
   * The value of this constant is 3346
   * </p>
   */
  ppEffectZoomInSlightly(3346),
  /**
   * <p>
   * The value of this constant is 3347
   * </p>
   */
  ppEffectZoomOut(3347),
  /**
   * <p>
   * The value of this constant is 3348
   * </p>
   */
  ppEffectZoomOutSlightly(3348),
  /**
   * <p>
   * The value of this constant is 3349
   * </p>
   */
  ppEffectZoomCenter(3349),
  /**
   * <p>
   * The value of this constant is 3350
   * </p>
   */
  ppEffectZoomBottom(3350),
  /**
   * <p>
   * The value of this constant is 3351
   * </p>
   */
  ppEffectStretchAcross(3351),
  /**
   * <p>
   * The value of this constant is 3352
   * </p>
   */
  ppEffectStretchLeft(3352),
  /**
   * <p>
   * The value of this constant is 3353
   * </p>
   */
  ppEffectStretchUp(3353),
  /**
   * <p>
   * The value of this constant is 3354
   * </p>
   */
  ppEffectStretchRight(3354),
  /**
   * <p>
   * The value of this constant is 3355
   * </p>
   */
  ppEffectStretchDown(3355),
  /**
   * <p>
   * The value of this constant is 3356
   * </p>
   */
  ppEffectSwivel(3356),
  /**
   * <p>
   * The value of this constant is 3357
   * </p>
   */
  ppEffectSpiral(3357),
  /**
   * <p>
   * The value of this constant is 3585
   * </p>
   */
  ppEffectSplitHorizontalOut(3585),
  /**
   * <p>
   * The value of this constant is 3586
   * </p>
   */
  ppEffectSplitHorizontalIn(3586),
  /**
   * <p>
   * The value of this constant is 3587
   * </p>
   */
  ppEffectSplitVerticalOut(3587),
  /**
   * <p>
   * The value of this constant is 3588
   * </p>
   */
  ppEffectSplitVerticalIn(3588),
  /**
   * <p>
   * The value of this constant is 3841
   * </p>
   */
  ppEffectFlashOnceFast(3841),
  /**
   * <p>
   * The value of this constant is 3842
   * </p>
   */
  ppEffectFlashOnceMedium(3842),
  /**
   * <p>
   * The value of this constant is 3843
   * </p>
   */
  ppEffectFlashOnceSlow(3843),
  /**
   * <p>
   * The value of this constant is 3844
   * </p>
   */
  ppEffectAppear(3844),
  /**
   * <p>
   * The value of this constant is 3845
   * </p>
   */
  ppEffectCircleOut(3845),
  /**
   * <p>
   * The value of this constant is 3846
   * </p>
   */
  ppEffectDiamondOut(3846),
  /**
   * <p>
   * The value of this constant is 3847
   * </p>
   */
  ppEffectCombHorizontal(3847),
  /**
   * <p>
   * The value of this constant is 3848
   * </p>
   */
  ppEffectCombVertical(3848),
  /**
   * <p>
   * The value of this constant is 3849
   * </p>
   */
  ppEffectFadeSmoothly(3849),
  /**
   * <p>
   * The value of this constant is 3850
   * </p>
   */
  ppEffectNewsflash(3850),
  /**
   * <p>
   * The value of this constant is 3851
   * </p>
   */
  ppEffectPlusOut(3851),
  /**
   * <p>
   * The value of this constant is 3852
   * </p>
   */
  ppEffectPushDown(3852),
  /**
   * <p>
   * The value of this constant is 3853
   * </p>
   */
  ppEffectPushLeft(3853),
  /**
   * <p>
   * The value of this constant is 3854
   * </p>
   */
  ppEffectPushRight(3854),
  /**
   * <p>
   * The value of this constant is 3855
   * </p>
   */
  ppEffectPushUp(3855),
  /**
   * <p>
   * The value of this constant is 3856
   * </p>
   */
  ppEffectWedge(3856),
  /**
   * <p>
   * The value of this constant is 3857
   * </p>
   */
  ppEffectWheel1Spoke(3857),
  /**
   * <p>
   * The value of this constant is 3858
   * </p>
   */
  ppEffectWheel2Spokes(3858),
  /**
   * <p>
   * The value of this constant is 3859
   * </p>
   */
  ppEffectWheel3Spokes(3859),
  /**
   * <p>
   * The value of this constant is 3860
   * </p>
   */
  ppEffectWheel4Spokes(3860),
  /**
   * <p>
   * The value of this constant is 3861
   * </p>
   */
  ppEffectWheel8Spokes(3861),
  ;

  private final int value;
  PpEntryEffect(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
