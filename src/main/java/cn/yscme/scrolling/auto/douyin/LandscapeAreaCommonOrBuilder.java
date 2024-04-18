// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

public interface LandscapeAreaCommonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.yscme.scrolling.auto.douyin.LandscapeAreaCommon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool showHead = 1;</code>
   * @return The showHead.
   */
  boolean getShowHead();

  /**
   * <code>bool showNickname = 2;</code>
   * @return The showNickname.
   */
  boolean getShowNickname();

  /**
   * <code>bool showFontColor = 3;</code>
   * @return The showFontColor.
   */
  boolean getShowFontColor();

  /**
   * <code>repeated string colorValueList = 4;</code>
   * @return A list containing the colorValueList.
   */
  java.util.List<java.lang.String>
      getColorValueListList();
  /**
   * <code>repeated string colorValueList = 4;</code>
   * @return The count of colorValueList.
   */
  int getColorValueListCount();
  /**
   * <code>repeated string colorValueList = 4;</code>
   * @param index The index of the element to return.
   * @return The colorValueList at the given index.
   */
  java.lang.String getColorValueList(int index);
  /**
   * <code>repeated string colorValueList = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the colorValueList at the given index.
   */
  com.google.protobuf.ByteString
      getColorValueListBytes(int index);

  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.CommentTypeTag commentTypeTagsList = 5;</code>
   * @return A list containing the commentTypeTagsList.
   */
  java.util.List<cn.yscme.scrolling.auto.douyin.CommentTypeTag> getCommentTypeTagsListList();
  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.CommentTypeTag commentTypeTagsList = 5;</code>
   * @return The count of commentTypeTagsList.
   */
  int getCommentTypeTagsListCount();
  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.CommentTypeTag commentTypeTagsList = 5;</code>
   * @param index The index of the element to return.
   * @return The commentTypeTagsList at the given index.
   */
  cn.yscme.scrolling.auto.douyin.CommentTypeTag getCommentTypeTagsList(int index);
  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.CommentTypeTag commentTypeTagsList = 5;</code>
   * @return A list containing the enum numeric values on the wire for commentTypeTagsList.
   */
  java.util.List<java.lang.Integer>
  getCommentTypeTagsListValueList();
  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.CommentTypeTag commentTypeTagsList = 5;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of commentTypeTagsList at the given index.
   */
  int getCommentTypeTagsListValue(int index);
}
