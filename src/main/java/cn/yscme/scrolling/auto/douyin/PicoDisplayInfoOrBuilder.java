// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

public interface PicoDisplayInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.yscme.scrolling.auto.douyin.PicoDisplayInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 comboSumCount = 1;</code>
   * @return The comboSumCount.
   */
  long getComboSumCount();

  /**
   * <code>string emoji = 2;</code>
   * @return The emoji.
   */
  java.lang.String getEmoji();
  /**
   * <code>string emoji = 2;</code>
   * @return The bytes for emoji.
   */
  com.google.protobuf.ByteString
      getEmojiBytes();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image emojiIcon = 3;</code>
   * @return Whether the emojiIcon field is set.
   */
  boolean hasEmojiIcon();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image emojiIcon = 3;</code>
   * @return The emojiIcon.
   */
  cn.yscme.scrolling.auto.douyin.Image getEmojiIcon();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image emojiIcon = 3;</code>
   */
  cn.yscme.scrolling.auto.douyin.ImageOrBuilder getEmojiIconOrBuilder();

  /**
   * <code>string emojiText = 4;</code>
   * @return The emojiText.
   */
  java.lang.String getEmojiText();
  /**
   * <code>string emojiText = 4;</code>
   * @return The bytes for emojiText.
   */
  com.google.protobuf.ByteString
      getEmojiTextBytes();
}
