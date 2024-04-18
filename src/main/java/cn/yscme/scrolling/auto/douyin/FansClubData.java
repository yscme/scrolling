// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

/**
 * Protobuf type {@code cn.yscme.scrolling.auto.douyin.FansClubData}
 */
public final class FansClubData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.yscme.scrolling.auto.douyin.FansClubData)
    FansClubDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FansClubData.newBuilder() to construct.
  private FansClubData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FansClubData() {
    clubName_ = "";
    availableGiftIds_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FansClubData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClubData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClubData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.yscme.scrolling.auto.douyin.FansClubData.class, cn.yscme.scrolling.auto.douyin.FansClubData.Builder.class);
  }

  private int bitField0_;
  public static final int CLUBNAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clubName_ = "";
  /**
   * <code>string clubName = 1;</code>
   * @return The clubName.
   */
  @java.lang.Override
  public java.lang.String getClubName() {
    java.lang.Object ref = clubName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clubName_ = s;
      return s;
    }
  }
  /**
   * <code>string clubName = 1;</code>
   * @return The bytes for clubName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClubNameBytes() {
    java.lang.Object ref = clubName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clubName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEVEL_FIELD_NUMBER = 2;
  private int level_ = 0;
  /**
   * <code>int32 level = 2;</code>
   * @return The level.
   */
  @java.lang.Override
  public int getLevel() {
    return level_;
  }

  public static final int USERFANSCLUBSTATUS_FIELD_NUMBER = 3;
  private int userFansClubStatus_ = 0;
  /**
   * <code>int32 userFansClubStatus = 3;</code>
   * @return The userFansClubStatus.
   */
  @java.lang.Override
  public int getUserFansClubStatus() {
    return userFansClubStatus_;
  }

  public static final int BADGE_FIELD_NUMBER = 4;
  private cn.yscme.scrolling.auto.douyin.UserBadge badge_;
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
   * @return Whether the badge field is set.
   */
  @java.lang.Override
  public boolean hasBadge() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
   * @return The badge.
   */
  @java.lang.Override
  public cn.yscme.scrolling.auto.douyin.UserBadge getBadge() {
    return badge_ == null ? cn.yscme.scrolling.auto.douyin.UserBadge.getDefaultInstance() : badge_;
  }
  /**
   * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
   */
  @java.lang.Override
  public cn.yscme.scrolling.auto.douyin.UserBadgeOrBuilder getBadgeOrBuilder() {
    return badge_ == null ? cn.yscme.scrolling.auto.douyin.UserBadge.getDefaultInstance() : badge_;
  }

  public static final int AVAILABLEGIFTIDS_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList availableGiftIds_ =
      emptyLongList();
  /**
   * <code>repeated int64 availableGiftIds = 5;</code>
   * @return A list containing the availableGiftIds.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getAvailableGiftIdsList() {
    return availableGiftIds_;
  }
  /**
   * <code>repeated int64 availableGiftIds = 5;</code>
   * @return The count of availableGiftIds.
   */
  public int getAvailableGiftIdsCount() {
    return availableGiftIds_.size();
  }
  /**
   * <code>repeated int64 availableGiftIds = 5;</code>
   * @param index The index of the element to return.
   * @return The availableGiftIds at the given index.
   */
  public long getAvailableGiftIds(int index) {
    return availableGiftIds_.getLong(index);
  }
  private int availableGiftIdsMemoizedSerializedSize = -1;

  public static final int ANCHORID_FIELD_NUMBER = 6;
  private long anchorId_ = 0L;
  /**
   * <code>int64 anchorId = 6;</code>
   * @return The anchorId.
   */
  @java.lang.Override
  public long getAnchorId() {
    return anchorId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clubName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clubName_);
    }
    if (level_ != 0) {
      output.writeInt32(2, level_);
    }
    if (userFansClubStatus_ != 0) {
      output.writeInt32(3, userFansClubStatus_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getBadge());
    }
    if (getAvailableGiftIdsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(availableGiftIdsMemoizedSerializedSize);
    }
    for (int i = 0; i < availableGiftIds_.size(); i++) {
      output.writeInt64NoTag(availableGiftIds_.getLong(i));
    }
    if (anchorId_ != 0L) {
      output.writeInt64(6, anchorId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clubName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clubName_);
    }
    if (level_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, level_);
    }
    if (userFansClubStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, userFansClubStatus_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getBadge());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < availableGiftIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(availableGiftIds_.getLong(i));
      }
      size += dataSize;
      if (!getAvailableGiftIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      availableGiftIdsMemoizedSerializedSize = dataSize;
    }
    if (anchorId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, anchorId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.yscme.scrolling.auto.douyin.FansClubData)) {
      return super.equals(obj);
    }
    cn.yscme.scrolling.auto.douyin.FansClubData other = (cn.yscme.scrolling.auto.douyin.FansClubData) obj;

    if (!getClubName()
        .equals(other.getClubName())) return false;
    if (getLevel()
        != other.getLevel()) return false;
    if (getUserFansClubStatus()
        != other.getUserFansClubStatus()) return false;
    if (hasBadge() != other.hasBadge()) return false;
    if (hasBadge()) {
      if (!getBadge()
          .equals(other.getBadge())) return false;
    }
    if (!getAvailableGiftIdsList()
        .equals(other.getAvailableGiftIdsList())) return false;
    if (getAnchorId()
        != other.getAnchorId()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLUBNAME_FIELD_NUMBER;
    hash = (53 * hash) + getClubName().hashCode();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getLevel();
    hash = (37 * hash) + USERFANSCLUBSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + getUserFansClubStatus();
    if (hasBadge()) {
      hash = (37 * hash) + BADGE_FIELD_NUMBER;
      hash = (53 * hash) + getBadge().hashCode();
    }
    if (getAvailableGiftIdsCount() > 0) {
      hash = (37 * hash) + AVAILABLEGIFTIDS_FIELD_NUMBER;
      hash = (53 * hash) + getAvailableGiftIdsList().hashCode();
    }
    hash = (37 * hash) + ANCHORID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAnchorId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cn.yscme.scrolling.auto.douyin.FansClubData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cn.yscme.scrolling.auto.douyin.FansClubData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.yscme.scrolling.auto.douyin.FansClubData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cn.yscme.scrolling.auto.douyin.FansClubData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code cn.yscme.scrolling.auto.douyin.FansClubData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.yscme.scrolling.auto.douyin.FansClubData)
      cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClubData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClubData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.yscme.scrolling.auto.douyin.FansClubData.class, cn.yscme.scrolling.auto.douyin.FansClubData.Builder.class);
    }

    // Construct using cn.yscme.scrolling.auto.douyin.FansClubData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getBadgeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      clubName_ = "";
      level_ = 0;
      userFansClubStatus_ = 0;
      badge_ = null;
      if (badgeBuilder_ != null) {
        badgeBuilder_.dispose();
        badgeBuilder_ = null;
      }
      availableGiftIds_ = emptyLongList();
      anchorId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClubData_descriptor;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.FansClubData getDefaultInstanceForType() {
      return cn.yscme.scrolling.auto.douyin.FansClubData.getDefaultInstance();
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.FansClubData build() {
      cn.yscme.scrolling.auto.douyin.FansClubData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.FansClubData buildPartial() {
      cn.yscme.scrolling.auto.douyin.FansClubData result = new cn.yscme.scrolling.auto.douyin.FansClubData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cn.yscme.scrolling.auto.douyin.FansClubData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clubName_ = clubName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.level_ = level_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.userFansClubStatus_ = userFansClubStatus_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.badge_ = badgeBuilder_ == null
            ? badge_
            : badgeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        availableGiftIds_.makeImmutable();
        result.availableGiftIds_ = availableGiftIds_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.anchorId_ = anchorId_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.yscme.scrolling.auto.douyin.FansClubData) {
        return mergeFrom((cn.yscme.scrolling.auto.douyin.FansClubData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.yscme.scrolling.auto.douyin.FansClubData other) {
      if (other == cn.yscme.scrolling.auto.douyin.FansClubData.getDefaultInstance()) return this;
      if (!other.getClubName().isEmpty()) {
        clubName_ = other.clubName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getLevel() != 0) {
        setLevel(other.getLevel());
      }
      if (other.getUserFansClubStatus() != 0) {
        setUserFansClubStatus(other.getUserFansClubStatus());
      }
      if (other.hasBadge()) {
        mergeBadge(other.getBadge());
      }
      if (!other.availableGiftIds_.isEmpty()) {
        if (availableGiftIds_.isEmpty()) {
          availableGiftIds_ = other.availableGiftIds_;
          availableGiftIds_.makeImmutable();
          bitField0_ |= 0x00000010;
        } else {
          ensureAvailableGiftIdsIsMutable();
          availableGiftIds_.addAll(other.availableGiftIds_);
        }
        onChanged();
      }
      if (other.getAnchorId() != 0L) {
        setAnchorId(other.getAnchorId());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              clubName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              level_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              userFansClubStatus_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getBadgeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              long v = input.readInt64();
              ensureAvailableGiftIdsIsMutable();
              availableGiftIds_.addLong(v);
              break;
            } // case 40
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureAvailableGiftIdsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                availableGiftIds_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 42
            case 48: {
              anchorId_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object clubName_ = "";
    /**
     * <code>string clubName = 1;</code>
     * @return The clubName.
     */
    public java.lang.String getClubName() {
      java.lang.Object ref = clubName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clubName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clubName = 1;</code>
     * @return The bytes for clubName.
     */
    public com.google.protobuf.ByteString
        getClubNameBytes() {
      java.lang.Object ref = clubName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clubName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clubName = 1;</code>
     * @param value The clubName to set.
     * @return This builder for chaining.
     */
    public Builder setClubName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clubName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string clubName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClubName() {
      clubName_ = getDefaultInstance().getClubName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string clubName = 1;</code>
     * @param value The bytes for clubName to set.
     * @return This builder for chaining.
     */
    public Builder setClubNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clubName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int level_ ;
    /**
     * <code>int32 level = 2;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }
    /**
     * <code>int32 level = 2;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(int value) {

      level_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 level = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      level_ = 0;
      onChanged();
      return this;
    }

    private int userFansClubStatus_ ;
    /**
     * <code>int32 userFansClubStatus = 3;</code>
     * @return The userFansClubStatus.
     */
    @java.lang.Override
    public int getUserFansClubStatus() {
      return userFansClubStatus_;
    }
    /**
     * <code>int32 userFansClubStatus = 3;</code>
     * @param value The userFansClubStatus to set.
     * @return This builder for chaining.
     */
    public Builder setUserFansClubStatus(int value) {

      userFansClubStatus_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 userFansClubStatus = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserFansClubStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      userFansClubStatus_ = 0;
      onChanged();
      return this;
    }

    private cn.yscme.scrolling.auto.douyin.UserBadge badge_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.yscme.scrolling.auto.douyin.UserBadge, cn.yscme.scrolling.auto.douyin.UserBadge.Builder, cn.yscme.scrolling.auto.douyin.UserBadgeOrBuilder> badgeBuilder_;
    /**
     * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
     * @return Whether the badge field is set.
     */
    public boolean hasBadge() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
     * @return The badge.
     */
    public cn.yscme.scrolling.auto.douyin.UserBadge getBadge() {
      if (badgeBuilder_ == null) {
        return badge_ == null ? cn.yscme.scrolling.auto.douyin.UserBadge.getDefaultInstance() : badge_;
      } else {
        return badgeBuilder_.getMessage();
      }
    }
    /**
     * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
     */
    public Builder setBadge(cn.yscme.scrolling.auto.douyin.UserBadge value) {
      if (badgeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        badge_ = value;
      } else {
        badgeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
     */
    public Builder setBadge(
        cn.yscme.scrolling.auto.douyin.UserBadge.Builder builderForValue) {
      if (badgeBuilder_ == null) {
        badge_ = builderForValue.build();
      } else {
        badgeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
     */
    public Builder mergeBadge(cn.yscme.scrolling.auto.douyin.UserBadge value) {
      if (badgeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          badge_ != null &&
          badge_ != cn.yscme.scrolling.auto.douyin.UserBadge.getDefaultInstance()) {
          getBadgeBuilder().mergeFrom(value);
        } else {
          badge_ = value;
        }
      } else {
        badgeBuilder_.mergeFrom(value);
      }
      if (badge_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
     */
    public Builder clearBadge() {
      bitField0_ = (bitField0_ & ~0x00000008);
      badge_ = null;
      if (badgeBuilder_ != null) {
        badgeBuilder_.dispose();
        badgeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
     */
    public cn.yscme.scrolling.auto.douyin.UserBadge.Builder getBadgeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getBadgeFieldBuilder().getBuilder();
    }
    /**
     * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
     */
    public cn.yscme.scrolling.auto.douyin.UserBadgeOrBuilder getBadgeOrBuilder() {
      if (badgeBuilder_ != null) {
        return badgeBuilder_.getMessageOrBuilder();
      } else {
        return badge_ == null ?
            cn.yscme.scrolling.auto.douyin.UserBadge.getDefaultInstance() : badge_;
      }
    }
    /**
     * <code>.cn.yscme.scrolling.auto.douyin.UserBadge badge = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.yscme.scrolling.auto.douyin.UserBadge, cn.yscme.scrolling.auto.douyin.UserBadge.Builder, cn.yscme.scrolling.auto.douyin.UserBadgeOrBuilder> 
        getBadgeFieldBuilder() {
      if (badgeBuilder_ == null) {
        badgeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.yscme.scrolling.auto.douyin.UserBadge, cn.yscme.scrolling.auto.douyin.UserBadge.Builder, cn.yscme.scrolling.auto.douyin.UserBadgeOrBuilder>(
                getBadge(),
                getParentForChildren(),
                isClean());
        badge_ = null;
      }
      return badgeBuilder_;
    }

    private com.google.protobuf.Internal.LongList availableGiftIds_ = emptyLongList();
    private void ensureAvailableGiftIdsIsMutable() {
      if (!availableGiftIds_.isModifiable()) {
        availableGiftIds_ = makeMutableCopy(availableGiftIds_);
      }
      bitField0_ |= 0x00000010;
    }
    /**
     * <code>repeated int64 availableGiftIds = 5;</code>
     * @return A list containing the availableGiftIds.
     */
    public java.util.List<java.lang.Long>
        getAvailableGiftIdsList() {
      availableGiftIds_.makeImmutable();
      return availableGiftIds_;
    }
    /**
     * <code>repeated int64 availableGiftIds = 5;</code>
     * @return The count of availableGiftIds.
     */
    public int getAvailableGiftIdsCount() {
      return availableGiftIds_.size();
    }
    /**
     * <code>repeated int64 availableGiftIds = 5;</code>
     * @param index The index of the element to return.
     * @return The availableGiftIds at the given index.
     */
    public long getAvailableGiftIds(int index) {
      return availableGiftIds_.getLong(index);
    }
    /**
     * <code>repeated int64 availableGiftIds = 5;</code>
     * @param index The index to set the value at.
     * @param value The availableGiftIds to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableGiftIds(
        int index, long value) {

      ensureAvailableGiftIdsIsMutable();
      availableGiftIds_.setLong(index, value);
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 availableGiftIds = 5;</code>
     * @param value The availableGiftIds to add.
     * @return This builder for chaining.
     */
    public Builder addAvailableGiftIds(long value) {

      ensureAvailableGiftIdsIsMutable();
      availableGiftIds_.addLong(value);
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 availableGiftIds = 5;</code>
     * @param values The availableGiftIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAvailableGiftIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureAvailableGiftIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, availableGiftIds_);
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 availableGiftIds = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailableGiftIds() {
      availableGiftIds_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }

    private long anchorId_ ;
    /**
     * <code>int64 anchorId = 6;</code>
     * @return The anchorId.
     */
    @java.lang.Override
    public long getAnchorId() {
      return anchorId_;
    }
    /**
     * <code>int64 anchorId = 6;</code>
     * @param value The anchorId to set.
     * @return This builder for chaining.
     */
    public Builder setAnchorId(long value) {

      anchorId_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int64 anchorId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnchorId() {
      bitField0_ = (bitField0_ & ~0x00000020);
      anchorId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cn.yscme.scrolling.auto.douyin.FansClubData)
  }

  // @@protoc_insertion_point(class_scope:cn.yscme.scrolling.auto.douyin.FansClubData)
  private static final cn.yscme.scrolling.auto.douyin.FansClubData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.yscme.scrolling.auto.douyin.FansClubData();
  }

  public static cn.yscme.scrolling.auto.douyin.FansClubData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FansClubData>
      PARSER = new com.google.protobuf.AbstractParser<FansClubData>() {
    @java.lang.Override
    public FansClubData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FansClubData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FansClubData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.yscme.scrolling.auto.douyin.FansClubData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

