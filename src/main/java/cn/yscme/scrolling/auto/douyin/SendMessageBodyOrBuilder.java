// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

public interface SendMessageBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.yscme.scrolling.auto.douyin.SendMessageBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string conversationId = 1;</code>
   * @return The conversationId.
   */
  java.lang.String getConversationId();
  /**
   * <code>string conversationId = 1;</code>
   * @return The bytes for conversationId.
   */
  com.google.protobuf.ByteString
      getConversationIdBytes();

  /**
   * <code>uint32 conversationType = 2;</code>
   * @return The conversationType.
   */
  int getConversationType();

  /**
   * <code>uint64 conversationShortId = 3;</code>
   * @return The conversationShortId.
   */
  long getConversationShortId();

  /**
   * <code>string content = 4;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <code>string content = 4;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.ExtList ext = 5;</code>
   */
  java.util.List<cn.yscme.scrolling.auto.douyin.ExtList> 
      getExtList();
  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.ExtList ext = 5;</code>
   */
  cn.yscme.scrolling.auto.douyin.ExtList getExt(int index);
  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.ExtList ext = 5;</code>
   */
  int getExtCount();
  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.ExtList ext = 5;</code>
   */
  java.util.List<? extends cn.yscme.scrolling.auto.douyin.ExtListOrBuilder> 
      getExtOrBuilderList();
  /**
   * <code>repeated .cn.yscme.scrolling.auto.douyin.ExtList ext = 5;</code>
   */
  cn.yscme.scrolling.auto.douyin.ExtListOrBuilder getExtOrBuilder(
      int index);

  /**
   * <code>uint32 messageType = 6;</code>
   * @return The messageType.
   */
  int getMessageType();

  /**
   * <code>string ticket = 7;</code>
   * @return The ticket.
   */
  java.lang.String getTicket();
  /**
   * <code>string ticket = 7;</code>
   * @return The bytes for ticket.
   */
  com.google.protobuf.ByteString
      getTicketBytes();

  /**
   * <code>string clientMessageId = 8;</code>
   * @return The clientMessageId.
   */
  java.lang.String getClientMessageId();
  /**
   * <code>string clientMessageId = 8;</code>
   * @return The bytes for clientMessageId.
   */
  com.google.protobuf.ByteString
      getClientMessageIdBytes();
}
