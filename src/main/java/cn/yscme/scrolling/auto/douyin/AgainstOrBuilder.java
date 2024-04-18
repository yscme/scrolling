// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

public interface AgainstOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn.yscme.scrolling.auto.douyin.Against)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string leftName = 1;</code>
   * @return The leftName.
   */
  java.lang.String getLeftName();
  /**
   * <code>string leftName = 1;</code>
   * @return The bytes for leftName.
   */
  com.google.protobuf.ByteString
      getLeftNameBytes();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image leftLogo = 2;</code>
   * @return Whether the leftLogo field is set.
   */
  boolean hasLeftLogo();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image leftLogo = 2;</code>
   * @return The leftLogo.
   */
  cn.yscme.scrolling.auto.douyin.Image getLeftLogo();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image leftLogo = 2;</code>
   */
  cn.yscme.scrolling.auto.douyin.ImageOrBuilder getLeftLogoOrBuilder();

  /**
   * <code>string leftGoal = 3;</code>
   * @return The leftGoal.
   */
  java.lang.String getLeftGoal();
  /**
   * <code>string leftGoal = 3;</code>
   * @return The bytes for leftGoal.
   */
  com.google.protobuf.ByteString
      getLeftGoalBytes();

  /**
   * <pre>
   *  LeftPlayersList leftPlayersList = 4;
   *  LeftGoalStageDetail leftGoalStageDetail = 5;
   * </pre>
   *
   * <code>string rightName = 6;</code>
   * @return The rightName.
   */
  java.lang.String getRightName();
  /**
   * <pre>
   *  LeftPlayersList leftPlayersList = 4;
   *  LeftGoalStageDetail leftGoalStageDetail = 5;
   * </pre>
   *
   * <code>string rightName = 6;</code>
   * @return The bytes for rightName.
   */
  com.google.protobuf.ByteString
      getRightNameBytes();

  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image rightLogo = 7;</code>
   * @return Whether the rightLogo field is set.
   */
  boolean hasRightLogo();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image rightLogo = 7;</code>
   * @return The rightLogo.
   */
  cn.yscme.scrolling.auto.douyin.Image getRightLogo();
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.Image rightLogo = 7;</code>
   */
  cn.yscme.scrolling.auto.douyin.ImageOrBuilder getRightLogoOrBuilder();

  /**
   * <code>string rightGoal = 8;</code>
   * @return The rightGoal.
   */
  java.lang.String getRightGoal();
  /**
   * <code>string rightGoal = 8;</code>
   * @return The bytes for rightGoal.
   */
  com.google.protobuf.ByteString
      getRightGoalBytes();

  /**
   * <pre>
   *  RightPlayersList rightPlayersList  = 9;
   *  RightGoalStageDetail rightGoalStageDetail = 10;
   * </pre>
   *
   * <code>uint64 timestamp = 11;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>uint64 version = 12;</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <code>uint64 leftTeamId = 13;</code>
   * @return The leftTeamId.
   */
  long getLeftTeamId();

  /**
   * <code>uint64 rightTeamId = 14;</code>
   * @return The rightTeamId.
   */
  long getRightTeamId();

  /**
   * <code>uint64 diffSei2absSecond = 15;</code>
   * @return The diffSei2absSecond.
   */
  long getDiffSei2AbsSecond();

  /**
   * <code>uint32 finalGoalStage = 16;</code>
   * @return The finalGoalStage.
   */
  int getFinalGoalStage();

  /**
   * <code>uint32 currentGoalStage = 17;</code>
   * @return The currentGoalStage.
   */
  int getCurrentGoalStage();

  /**
   * <code>uint32 leftScoreAddition = 18;</code>
   * @return The leftScoreAddition.
   */
  int getLeftScoreAddition();

  /**
   * <code>uint32 rightScoreAddition = 19;</code>
   * @return The rightScoreAddition.
   */
  int getRightScoreAddition();

  /**
   * <code>uint64 leftGoalInt = 20;</code>
   * @return The leftGoalInt.
   */
  long getLeftGoalInt();

  /**
   * <code>uint64 rightGoalInt = 21;</code>
   * @return The rightGoalInt.
   */
  long getRightGoalInt();
}
