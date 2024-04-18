// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

public interface ChatMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.yscme.scrolling.auto.douyin.ChatMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
   * @return The common.
   */
  cn.yscme.scrolling.auto.douyin.Common getCommon();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
   */
  cn.yscme.scrolling.auto.douyin.CommonOrBuilder getCommonOrBuilder();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
   * @return The user.
   */
  cn.yscme.scrolling.auto.douyin.User getUser();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
   */
  cn.yscme.scrolling.auto.douyin.UserOrBuilder getUserOrBuilder();

  /**
   * <code>string content = 3;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 3;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>bool visibleToSender = 4;</code>
   * @return The visibleToSender.
   */
  boolean getVisibleToSender();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image backgroundImage = 5;</code>
   * @return Whether the backgroundImage field is set.
   */
  boolean hasBackgroundImage();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image backgroundImage = 5;</code>
   * @return The backgroundImage.
   */
  cn.yscme.scrolling.auto.douyin.Image getBackgroundImage();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image backgroundImage = 5;</code>
   */
  cn.yscme.scrolling.auto.douyin.ImageOrBuilder getBackgroundImageOrBuilder();

  /**
   * <code>string fullScreenTextColor = 6;</code>
   * @return The fullScreenTextColor.
   */
  java.lang.String getFullScreenTextColor();
  /**
   * <code>string fullScreenTextColor = 6;</code>
   * @return The bytes for fullScreenTextColor.
   */
  com.google.protobuf.ByteString
      getFullScreenTextColorBytes();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image backgroundImageV2 = 7;</code>
   * @return Whether the backgroundImageV2 field is set.
   */
  boolean hasBackgroundImageV2();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image backgroundImageV2 = 7;</code>
   * @return The backgroundImageV2.
   */
  cn.yscme.scrolling.auto.douyin.Image getBackgroundImageV2();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image backgroundImageV2 = 7;</code>
   */
  cn.yscme.scrolling.auto.douyin.ImageOrBuilder getBackgroundImageV2OrBuilder();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.PublicAreaCommon publicAreaCommon = 9;</code>
   * @return Whether the publicAreaCommon field is set.
   */
  boolean hasPublicAreaCommon();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.PublicAreaCommon publicAreaCommon = 9;</code>
   * @return The publicAreaCommon.
   */
  cn.yscme.scrolling.auto.douyin.PublicAreaCommon getPublicAreaCommon();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.PublicAreaCommon publicAreaCommon = 9;</code>
   */
  cn.yscme.scrolling.auto.douyin.PublicAreaCommonOrBuilder getPublicAreaCommonOrBuilder();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image giftImage = 10;</code>
   * @return Whether the giftImage field is set.
   */
  boolean hasGiftImage();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image giftImage = 10;</code>
   * @return The giftImage.
   */
  cn.yscme.scrolling.auto.douyin.Image getGiftImage();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image giftImage = 10;</code>
   */
  cn.yscme.scrolling.auto.douyin.ImageOrBuilder getGiftImageOrBuilder();

  /**
   * <code>uint64 agreeMsgId = 11;</code>
   * @return The agreeMsgId.
   */
  long getAgreeMsgId();

  /**
   * <code>uint32 priorityLevel = 12;</code>
   * @return The priorityLevel.
   */
  int getPriorityLevel();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.LandscapeAreaCommon landscapeAreaCommon = 13;</code>
   * @return Whether the landscapeAreaCommon field is set.
   */
  boolean hasLandscapeAreaCommon();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.LandscapeAreaCommon landscapeAreaCommon = 13;</code>
   * @return The landscapeAreaCommon.
   */
  cn.yscme.scrolling.auto.douyin.LandscapeAreaCommon getLandscapeAreaCommon();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.LandscapeAreaCommon landscapeAreaCommon = 13;</code>
   */
  cn.yscme.scrolling.auto.douyin.LandscapeAreaCommonOrBuilder getLandscapeAreaCommonOrBuilder();

  /**
   * <code>uint64 eventTime = 15;</code>
   * @return The eventTime.
   */
  long getEventTime();

  /**
   * <code>bool sendReview = 16;</code>
   * @return The sendReview.
   */
  boolean getSendReview();

  /**
   * <code>bool fromIntercom = 17;</code>
   * @return The fromIntercom.
   */
  boolean getFromIntercom();

  /**
   * <code>bool intercomHideUserCard = 18;</code>
   * @return The intercomHideUserCard.
   */
  boolean getIntercomHideUserCard();

  /**
   * <pre>
   *  repeated chatTagsList = 19;
   * </pre>
   *
   * <code>string chatBy = 20;</code>
   * @return The chatBy.
   */
  java.lang.String getChatBy();
  /**
   * <pre>
   *  repeated chatTagsList = 19;
   * </pre>
   *
   * <code>string chatBy = 20;</code>
   * @return The bytes for chatBy.
   */
  com.google.protobuf.ByteString
      getChatByBytes();

  /**
   * <code>uint32 individualChatPriority = 21;</code>
   * @return The individualChatPriority.
   */
  int getIndividualChatPriority();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Text rtfContent = 22;</code>
   * @return Whether the rtfContent field is set.
   */
  boolean hasRtfContent();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Text rtfContent = 22;</code>
   * @return The rtfContent.
   */
  cn.yscme.scrolling.auto.douyin.Text getRtfContent();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Text rtfContent = 22;</code>
   */
  cn.yscme.scrolling.auto.douyin.TextOrBuilder getRtfContentOrBuilder();
}
