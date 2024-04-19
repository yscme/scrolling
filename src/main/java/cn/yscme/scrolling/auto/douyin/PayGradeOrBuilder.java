// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

public interface PayGradeOrBuilder extends
        // @@protoc_insertion_point(interface_extends:cn.yscme.scrolling.auto.douyin.PayGrade)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 totalDiamondCount = 1;</code>
     *
     * @return The totalDiamondCount.
     */
    long getTotalDiamondCount();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image diamondIcon = 2;</code>
     *
     * @return Whether the diamondIcon field is set.
     */
    boolean hasDiamondIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image diamondIcon = 2;</code>
     *
     * @return The diamondIcon.
     */
    cn.yscme.scrolling.auto.douyin.Image getDiamondIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image diamondIcon = 2;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getDiamondIconOrBuilder();

    /**
     * <code>string name = 3;</code>
     *
     * @return The name.
     */
    java.lang.String getName();

    /**
     * <code>string name = 3;</code>
     *
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
    getNameBytes();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image icon = 4;</code>
     *
     * @return Whether the icon field is set.
     */
    boolean hasIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image icon = 4;</code>
     *
     * @return The icon.
     */
    cn.yscme.scrolling.auto.douyin.Image getIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image icon = 4;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getIconOrBuilder();

    /**
     * <code>string nextName = 5;</code>
     *
     * @return The nextName.
     */
    java.lang.String getNextName();

    /**
     * <code>string nextName = 5;</code>
     *
     * @return The bytes for nextName.
     */
    com.google.protobuf.ByteString
    getNextNameBytes();

    /**
     * <code>int64 level = 6;</code>
     *
     * @return The level.
     */
    long getLevel();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image nextIcon = 7;</code>
     *
     * @return Whether the nextIcon field is set.
     */
    boolean hasNextIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image nextIcon = 7;</code>
     *
     * @return The nextIcon.
     */
    cn.yscme.scrolling.auto.douyin.Image getNextIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image nextIcon = 7;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getNextIconOrBuilder();

    /**
     * <code>int64 nextDiamond = 8;</code>
     *
     * @return The nextDiamond.
     */
    long getNextDiamond();

    /**
     * <code>int64 nowDiamond = 9;</code>
     *
     * @return The nowDiamond.
     */
    long getNowDiamond();

    /**
     * <code>int64 thisGradeMinDiamond = 10;</code>
     *
     * @return The thisGradeMinDiamond.
     */
    long getThisGradeMinDiamond();

    /**
     * <code>int64 thisGradeMaxDiamond = 11;</code>
     *
     * @return The thisGradeMaxDiamond.
     */
    long getThisGradeMaxDiamond();

    /**
     * <code>int64 payDiamondBak = 12;</code>
     *
     * @return The payDiamondBak.
     */
    long getPayDiamondBak();

    /**
     * <code>string gradeDescribe = 13;</code>
     *
     * @return The gradeDescribe.
     */
    java.lang.String getGradeDescribe();

    /**
     * <code>string gradeDescribe = 13;</code>
     *
     * @return The bytes for gradeDescribe.
     */
    com.google.protobuf.ByteString
    getGradeDescribeBytes();

    /**
     * <code>repeated .cn.yscme.scrolling.auto.douyin.GradeIcon gradeIconList = 14;</code>
     */
    java.util.List<cn.yscme.scrolling.auto.douyin.GradeIcon>
    getGradeIconListList();

    /**
     * <code>repeated .cn.yscme.scrolling.auto.douyin.GradeIcon gradeIconList = 14;</code>
     */
    cn.yscme.scrolling.auto.douyin.GradeIcon getGradeIconList(int index);

    /**
     * <code>repeated .cn.yscme.scrolling.auto.douyin.GradeIcon gradeIconList = 14;</code>
     */
    int getGradeIconListCount();

    /**
     * <code>repeated .cn.yscme.scrolling.auto.douyin.GradeIcon gradeIconList = 14;</code>
     */
    java.util.List<? extends cn.yscme.scrolling.auto.douyin.GradeIconOrBuilder>
    getGradeIconListOrBuilderList();

    /**
     * <code>repeated .cn.yscme.scrolling.auto.douyin.GradeIcon gradeIconList = 14;</code>
     */
    cn.yscme.scrolling.auto.douyin.GradeIconOrBuilder getGradeIconListOrBuilder(
            int index);

    /**
     * <code>int64 screenChatType = 15;</code>
     *
     * @return The screenChatType.
     */
    long getScreenChatType();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image imIcon = 16;</code>
     *
     * @return Whether the imIcon field is set.
     */
    boolean hasImIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image imIcon = 16;</code>
     *
     * @return The imIcon.
     */
    cn.yscme.scrolling.auto.douyin.Image getImIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image imIcon = 16;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getImIconOrBuilder();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image imIconWithLevel = 17;</code>
     *
     * @return Whether the imIconWithLevel field is set.
     */
    boolean hasImIconWithLevel();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image imIconWithLevel = 17;</code>
     *
     * @return The imIconWithLevel.
     */
    cn.yscme.scrolling.auto.douyin.Image getImIconWithLevel();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image imIconWithLevel = 17;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getImIconWithLevelOrBuilder();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image liveIcon = 18;</code>
     *
     * @return Whether the liveIcon field is set.
     */
    boolean hasLiveIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image liveIcon = 18;</code>
     *
     * @return The liveIcon.
     */
    cn.yscme.scrolling.auto.douyin.Image getLiveIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image liveIcon = 18;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getLiveIconOrBuilder();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image newImIconWithLevel = 19;</code>
     *
     * @return Whether the newImIconWithLevel field is set.
     */
    boolean hasNewImIconWithLevel();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image newImIconWithLevel = 19;</code>
     *
     * @return The newImIconWithLevel.
     */
    cn.yscme.scrolling.auto.douyin.Image getNewImIconWithLevel();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image newImIconWithLevel = 19;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getNewImIconWithLevelOrBuilder();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image newLiveIcon = 20;</code>
     *
     * @return Whether the newLiveIcon field is set.
     */
    boolean hasNewLiveIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image newLiveIcon = 20;</code>
     *
     * @return The newLiveIcon.
     */
    cn.yscme.scrolling.auto.douyin.Image getNewLiveIcon();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image newLiveIcon = 20;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getNewLiveIconOrBuilder();

    /**
     * <code>int64 upgradeNeedConsume = 21;</code>
     *
     * @return The upgradeNeedConsume.
     */
    long getUpgradeNeedConsume();

    /**
     * <code>string nextPrivileges = 22;</code>
     *
     * @return The nextPrivileges.
     */
    java.lang.String getNextPrivileges();

    /**
     * <code>string nextPrivileges = 22;</code>
     *
     * @return The bytes for nextPrivileges.
     */
    com.google.protobuf.ByteString
    getNextPrivilegesBytes();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image background = 23;</code>
     *
     * @return Whether the background field is set.
     */
    boolean hasBackground();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image background = 23;</code>
     *
     * @return The background.
     */
    cn.yscme.scrolling.auto.douyin.Image getBackground();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image background = 23;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getBackgroundOrBuilder();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image backgroundBack = 24;</code>
     *
     * @return Whether the backgroundBack field is set.
     */
    boolean hasBackgroundBack();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image backgroundBack = 24;</code>
     *
     * @return The backgroundBack.
     */
    cn.yscme.scrolling.auto.douyin.Image getBackgroundBack();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image backgroundBack = 24;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getBackgroundBackOrBuilder();

    /**
     * <code>int64 score = 25;</code>
     *
     * @return The score.
     */
    long getScore();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.GradeBuffInfo buffInfo = 26;</code>
     *
     * @return Whether the buffInfo field is set.
     */
    boolean hasBuffInfo();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.GradeBuffInfo buffInfo = 26;</code>
     *
     * @return The buffInfo.
     */
    cn.yscme.scrolling.auto.douyin.GradeBuffInfo getBuffInfo();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.GradeBuffInfo buffInfo = 26;</code>
     */
    cn.yscme.scrolling.auto.douyin.GradeBuffInfoOrBuilder getBuffInfoOrBuilder();

    /**
     * <code>string gradeBanner = 1001;</code>
     *
     * @return The gradeBanner.
     */
    java.lang.String getGradeBanner();

    /**
     * <code>string gradeBanner = 1001;</code>
     *
     * @return The bytes for gradeBanner.
     */
    com.google.protobuf.ByteString
    getGradeBannerBytes();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image profileDialogBg = 1002;</code>
     *
     * @return Whether the profileDialogBg field is set.
     */
    boolean hasProfileDialogBg();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image profileDialogBg = 1002;</code>
     *
     * @return The profileDialogBg.
     */
    cn.yscme.scrolling.auto.douyin.Image getProfileDialogBg();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image profileDialogBg = 1002;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getProfileDialogBgOrBuilder();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image profileDialogBgBack = 1003;</code>
     *
     * @return Whether the profileDialogBgBack field is set.
     */
    boolean hasProfileDialogBgBack();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image profileDialogBgBack = 1003;</code>
     *
     * @return The profileDialogBgBack.
     */
    cn.yscme.scrolling.auto.douyin.Image getProfileDialogBgBack();

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Image profileDialogBgBack = 1003;</code>
     */
    cn.yscme.scrolling.auto.douyin.ImageOrBuilder getProfileDialogBgBackOrBuilder();
}
