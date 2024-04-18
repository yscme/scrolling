// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

/**
 * Protobuf type {@code cn.yscme.scrolling.auto.douyin.DoubleLikeDetail}
 */
public final class DoubleLikeDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn.yscme.scrolling.auto.douyin.DoubleLikeDetail)
    DoubleLikeDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DoubleLikeDetail.newBuilder() to construct.
  private DoubleLikeDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DoubleLikeDetail() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DoubleLikeDetail();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_DoubleLikeDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_DoubleLikeDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.yscme.scrolling.auto.douyin.DoubleLikeDetail.class, cn.yscme.scrolling.auto.douyin.DoubleLikeDetail.Builder.class);
  }

  public static final int DOUBLEFLAG_FIELD_NUMBER = 1;
  private boolean doubleFlag_ = false;
  /**
   * <code>bool doubleFlag = 1;</code>
   * @return The doubleFlag.
   */
  @java.lang.Override
  public boolean getDoubleFlag() {
    return doubleFlag_;
  }

  public static final int SEQID_FIELD_NUMBER = 2;
  private int seqId_ = 0;
  /**
   * <code>uint32 seqId = 2;</code>
   * @return The seqId.
   */
  @java.lang.Override
  public int getSeqId() {
    return seqId_;
  }

  public static final int RENEWALSNUM_FIELD_NUMBER = 3;
  private int renewalsNum_ = 0;
  /**
   * <code>uint32 renewalsNum = 3;</code>
   * @return The renewalsNum.
   */
  @java.lang.Override
  public int getRenewalsNum() {
    return renewalsNum_;
  }

  public static final int TRIGGERSNUM_FIELD_NUMBER = 4;
  private int triggersNum_ = 0;
  /**
   * <code>uint32 triggersNum = 4;</code>
   * @return The triggersNum.
   */
  @java.lang.Override
  public int getTriggersNum() {
    return triggersNum_;
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
    if (doubleFlag_ != false) {
      output.writeBool(1, doubleFlag_);
    }
    if (seqId_ != 0) {
      output.writeUInt32(2, seqId_);
    }
    if (renewalsNum_ != 0) {
      output.writeUInt32(3, renewalsNum_);
    }
    if (triggersNum_ != 0) {
      output.writeUInt32(4, triggersNum_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (doubleFlag_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, doubleFlag_);
    }
    if (seqId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, seqId_);
    }
    if (renewalsNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, renewalsNum_);
    }
    if (triggersNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, triggersNum_);
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
    if (!(obj instanceof cn.yscme.scrolling.auto.douyin.DoubleLikeDetail)) {
      return super.equals(obj);
    }
    cn.yscme.scrolling.auto.douyin.DoubleLikeDetail other = (cn.yscme.scrolling.auto.douyin.DoubleLikeDetail) obj;

    if (getDoubleFlag()
        != other.getDoubleFlag()) return false;
    if (getSeqId()
        != other.getSeqId()) return false;
    if (getRenewalsNum()
        != other.getRenewalsNum()) return false;
    if (getTriggersNum()
        != other.getTriggersNum()) return false;
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
    hash = (37 * hash) + DOUBLEFLAG_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDoubleFlag());
    hash = (37 * hash) + SEQID_FIELD_NUMBER;
    hash = (53 * hash) + getSeqId();
    hash = (37 * hash) + RENEWALSNUM_FIELD_NUMBER;
    hash = (53 * hash) + getRenewalsNum();
    hash = (37 * hash) + TRIGGERSNUM_FIELD_NUMBER;
    hash = (53 * hash) + getTriggersNum();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail parseFrom(
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
  public static Builder newBuilder(cn.yscme.scrolling.auto.douyin.DoubleLikeDetail prototype) {
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
   * Protobuf type {@code cn.yscme.scrolling.auto.douyin.DoubleLikeDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn.yscme.scrolling.auto.douyin.DoubleLikeDetail)
      cn.yscme.scrolling.auto.douyin.DoubleLikeDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_DoubleLikeDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_DoubleLikeDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.yscme.scrolling.auto.douyin.DoubleLikeDetail.class, cn.yscme.scrolling.auto.douyin.DoubleLikeDetail.Builder.class);
    }

    // Construct using cn.yscme.scrolling.auto.douyin.DoubleLikeDetail.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      doubleFlag_ = false;
      seqId_ = 0;
      renewalsNum_ = 0;
      triggersNum_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_DoubleLikeDetail_descriptor;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.DoubleLikeDetail getDefaultInstanceForType() {
      return cn.yscme.scrolling.auto.douyin.DoubleLikeDetail.getDefaultInstance();
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.DoubleLikeDetail build() {
      cn.yscme.scrolling.auto.douyin.DoubleLikeDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.DoubleLikeDetail buildPartial() {
      cn.yscme.scrolling.auto.douyin.DoubleLikeDetail result = new cn.yscme.scrolling.auto.douyin.DoubleLikeDetail(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(cn.yscme.scrolling.auto.douyin.DoubleLikeDetail result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.doubleFlag_ = doubleFlag_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.seqId_ = seqId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.renewalsNum_ = renewalsNum_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.triggersNum_ = triggersNum_;
      }
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
      if (other instanceof cn.yscme.scrolling.auto.douyin.DoubleLikeDetail) {
        return mergeFrom((cn.yscme.scrolling.auto.douyin.DoubleLikeDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.yscme.scrolling.auto.douyin.DoubleLikeDetail other) {
      if (other == cn.yscme.scrolling.auto.douyin.DoubleLikeDetail.getDefaultInstance()) return this;
      if (other.getDoubleFlag() != false) {
        setDoubleFlag(other.getDoubleFlag());
      }
      if (other.getSeqId() != 0) {
        setSeqId(other.getSeqId());
      }
      if (other.getRenewalsNum() != 0) {
        setRenewalsNum(other.getRenewalsNum());
      }
      if (other.getTriggersNum() != 0) {
        setTriggersNum(other.getTriggersNum());
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
            case 8: {
              doubleFlag_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              seqId_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              renewalsNum_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              triggersNum_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private boolean doubleFlag_ ;
    /**
     * <code>bool doubleFlag = 1;</code>
     * @return The doubleFlag.
     */
    @java.lang.Override
    public boolean getDoubleFlag() {
      return doubleFlag_;
    }
    /**
     * <code>bool doubleFlag = 1;</code>
     * @param value The doubleFlag to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleFlag(boolean value) {

      doubleFlag_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool doubleFlag = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleFlag() {
      bitField0_ = (bitField0_ & ~0x00000001);
      doubleFlag_ = false;
      onChanged();
      return this;
    }

    private int seqId_ ;
    /**
     * <code>uint32 seqId = 2;</code>
     * @return The seqId.
     */
    @java.lang.Override
    public int getSeqId() {
      return seqId_;
    }
    /**
     * <code>uint32 seqId = 2;</code>
     * @param value The seqId to set.
     * @return This builder for chaining.
     */
    public Builder setSeqId(int value) {

      seqId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 seqId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeqId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      seqId_ = 0;
      onChanged();
      return this;
    }

    private int renewalsNum_ ;
    /**
     * <code>uint32 renewalsNum = 3;</code>
     * @return The renewalsNum.
     */
    @java.lang.Override
    public int getRenewalsNum() {
      return renewalsNum_;
    }
    /**
     * <code>uint32 renewalsNum = 3;</code>
     * @param value The renewalsNum to set.
     * @return This builder for chaining.
     */
    public Builder setRenewalsNum(int value) {

      renewalsNum_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 renewalsNum = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRenewalsNum() {
      bitField0_ = (bitField0_ & ~0x00000004);
      renewalsNum_ = 0;
      onChanged();
      return this;
    }

    private int triggersNum_ ;
    /**
     * <code>uint32 triggersNum = 4;</code>
     * @return The triggersNum.
     */
    @java.lang.Override
    public int getTriggersNum() {
      return triggersNum_;
    }
    /**
     * <code>uint32 triggersNum = 4;</code>
     * @param value The triggersNum to set.
     * @return This builder for chaining.
     */
    public Builder setTriggersNum(int value) {

      triggersNum_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 triggersNum = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTriggersNum() {
      bitField0_ = (bitField0_ & ~0x00000008);
      triggersNum_ = 0;
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


    // @@protoc_insertion_point(builder_scope:cn.yscme.scrolling.auto.douyin.DoubleLikeDetail)
  }

  // @@protoc_insertion_point(class_scope:cn.yscme.scrolling.auto.douyin.DoubleLikeDetail)
  private static final cn.yscme.scrolling.auto.douyin.DoubleLikeDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.yscme.scrolling.auto.douyin.DoubleLikeDetail();
  }

  public static cn.yscme.scrolling.auto.douyin.DoubleLikeDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DoubleLikeDetail>
      PARSER = new com.google.protobuf.AbstractParser<DoubleLikeDetail>() {
    @java.lang.Override
    public DoubleLikeDetail parsePartialFrom(
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

  public static com.google.protobuf.Parser<DoubleLikeDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DoubleLikeDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.yscme.scrolling.auto.douyin.DoubleLikeDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

