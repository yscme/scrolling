// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

public interface LikeMessageOrBuilder extends
        // @@protoc_insertion_point(interface_extends:cn.yscme.scrolling.auto.douyin.LikeMessage)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
     *
     * @return Whether the common field is set.
     */
    boolean hasCommon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
     *
     * @return The common.
     */
    cn.yscme.scrolling.auto.douyin.Common getCommon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
     */
    cn.yscme.scrolling.auto.douyin.CommonOrBuilder getCommonOrBuilder();

    /**
     * <code>uint64 count = 2;</code>
     *
     * @return The count.
     */
    long getCount();

    /**
     * <code>uint64 total = 3;</code>
     *
     * @return The total.
     */
    long getTotal();

    /**
     * <code>uint64 color = 4;</code>
     *
     * @return The color.
     */
    long getColor();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 5;</code>
     *
     * @return Whether the user field is set.
     */
    boolean hasUser();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 5;</code>
     *
     * @return The user.
     */
    cn.yscme.scrolling.auto.douyin.User getUser();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 5;</code>
     */
    cn.yscme.scrolling.auto.douyin.UserOrBuilder getUserOrBuilder();

    /**
     * <code>string icon = 6;</code>
     *
     * @return The icon.
     */
    java.lang.String getIcon();

    /**
     * <code>string icon = 6;</code>
     *
     * @return The bytes for icon.
     */
    com.google.protobuf.ByteString
    getIconBytes();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.DoubleLikeDetail doubleLikeDetail = 7;</code>
     *
     * @return Whether the doubleLikeDetail field is set.
     */
    boolean hasDoubleLikeDetail();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.DoubleLikeDetail doubleLikeDetail = 7;</code>
     *
     * @return The doubleLikeDetail.
     */
    cn.yscme.scrolling.auto.douyin.DoubleLikeDetail getDoubleLikeDetail();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.DoubleLikeDetail doubleLikeDetail = 7;</code>
     */
    cn.yscme.scrolling.auto.douyin.DoubleLikeDetailOrBuilder getDoubleLikeDetailOrBuilder();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.DisplayControlInfo displayControlInfo = 8;</code>
     *
     * @return Whether the displayControlInfo field is set.
     */
    boolean hasDisplayControlInfo();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.DisplayControlInfo displayControlInfo = 8;</code>
     *
     * @return The displayControlInfo.
     */
    cn.yscme.scrolling.auto.douyin.DisplayControlInfo getDisplayControlInfo();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.DisplayControlInfo displayControlInfo = 8;</code>
     */
    cn.yscme.scrolling.auto.douyin.DisplayControlInfoOrBuilder getDisplayControlInfoOrBuilder();

    /**
     * <code>uint64 linkmicGuestUid = 9;</code>
     *
     * @return The linkmicGuestUid.
     */
    long getLinkmicGuestUid();

    /**
     * <code>string scene = 10;</code>
     *
     * @return The scene.
     */
    java.lang.String getScene();

    /**
     * <code>string scene = 10;</code>
     *
     * @return The bytes for scene.
     */
    com.google.protobuf.ByteString
    getSceneBytes();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.PicoDisplayInfo picoDisplayInfo = 11;</code>
     *
     * @return Whether the picoDisplayInfo field is set.
     */
    boolean hasPicoDisplayInfo();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.PicoDisplayInfo picoDisplayInfo = 11;</code>
     *
     * @return The picoDisplayInfo.
     */
    cn.yscme.scrolling.auto.douyin.PicoDisplayInfo getPicoDisplayInfo();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.PicoDisplayInfo picoDisplayInfo = 11;</code>
     */
    cn.yscme.scrolling.auto.douyin.PicoDisplayInfoOrBuilder getPicoDisplayInfoOrBuilder();
}
