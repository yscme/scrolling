// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

public interface MessageOrBuilder extends
        // @@protoc_insertion_point(interface_extends:cn.yscme.scrolling.auto.douyin.Message)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string method = 1;</code>
     *
     * @return The method.
     */
    java.lang.String getMethod();

    /**
     * <code>string method = 1;</code>
     *
     * @return The bytes for method.
     */
    com.google.protobuf.ByteString
    getMethodBytes();

    /**
     * <code>bytes payload = 2;</code>
     *
     * @return The payload.
     */
    com.google.protobuf.ByteString getPayload();

    /**
     * <code>int64 msgId = 3;</code>
     *
     * @return The msgId.
     */
    long getMsgId();

    /**
     * <code>int32 msgType = 4;</code>
     *
     * @return The msgType.
     */
    int getMsgType();

    /**
     * <code>int64 offset = 5;</code>
     *
     * @return The offset.
     */
    long getOffset();

    /**
     * <code>bool needWrdsStore = 6;</code>
     *
     * @return The needWrdsStore.
     */
    boolean getNeedWrdsStore();

    /**
     * <code>int64 wrdsVersion = 7;</code>
     *
     * @return The wrdsVersion.
     */
    long getWrdsVersion();

    /**
     * <code>string wrdsSubKey = 8;</code>
     *
     * @return The wrdsSubKey.
     */
    java.lang.String getWrdsSubKey();

    /**
     * <code>string wrdsSubKey = 8;</code>
     *
     * @return The bytes for wrdsSubKey.
     */
    com.google.protobuf.ByteString
    getWrdsSubKeyBytes();
}
