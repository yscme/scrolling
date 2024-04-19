// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

/**
 * <pre>
 * from https://github.com/HaoDong108/DouyinBarrageGrab/blob/main/BarrageGrab/proto/message.proto
 * </pre>
 * <p>
 * Protobuf type {@code cn.yscme.scrolling.auto.douyin.FansclubMessage}
 */
public final class FansclubMessage extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:cn.yscme.scrolling.auto.douyin.FansclubMessage)
        FansclubMessageOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use FansclubMessage.newBuilder() to construct.
    private FansclubMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private FansclubMessage() {
        content_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new FansclubMessage();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansclubMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansclubMessage_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.yscme.scrolling.auto.douyin.FansclubMessage.class, cn.yscme.scrolling.auto.douyin.FansclubMessage.Builder.class);
    }

    private int bitField0_;
    public static final int COMMONINFO_FIELD_NUMBER = 1;
    private cn.yscme.scrolling.auto.douyin.Common commonInfo_;

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
     *
     * @return Whether the commonInfo field is set.
     */
    @java.lang.Override
    public boolean hasCommonInfo() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
     *
     * @return The commonInfo.
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.Common getCommonInfo() {
        return commonInfo_ == null ? cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance() : commonInfo_;
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.CommonOrBuilder getCommonInfoOrBuilder() {
        return commonInfo_ == null ? cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance() : commonInfo_;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_ = 0;

    /**
     * <pre>
     * 升级是1，加入是2
     * </pre>
     *
     * <code>int32 type = 2;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
        return type_;
    }

    public static final int CONTENT_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object content_ = "";

    /**
     * <code>string content = 3;</code>
     *
     * @return The content.
     */
    @java.lang.Override
    public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            content_ = s;
            return s;
        }
    }

    /**
     * <code>string content = 3;</code>
     *
     * @return The bytes for content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            content_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int USER_FIELD_NUMBER = 4;
    private cn.yscme.scrolling.auto.douyin.User user_;

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
     *
     * @return Whether the user field is set.
     */
    @java.lang.Override
    public boolean hasUser() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
     *
     * @return The user.
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.User getUser() {
        return user_ == null ? cn.yscme.scrolling.auto.douyin.User.getDefaultInstance() : user_;
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.UserOrBuilder getUserOrBuilder() {
        return user_ == null ? cn.yscme.scrolling.auto.douyin.User.getDefaultInstance() : user_;
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
        if (((bitField0_ & 0x00000001) != 0)) {
            output.writeMessage(1, getCommonInfo());
        }
        if (type_ != 0) {
            output.writeInt32(2, type_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
            output.writeMessage(4, getUser());
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, getCommonInfo());
        }
        if (type_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, type_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, content_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(4, getUser());
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
        if (!(obj instanceof cn.yscme.scrolling.auto.douyin.FansclubMessage)) {
            return super.equals(obj);
        }
        cn.yscme.scrolling.auto.douyin.FansclubMessage other = (cn.yscme.scrolling.auto.douyin.FansclubMessage) obj;

        if (hasCommonInfo() != other.hasCommonInfo()) return false;
        if (hasCommonInfo()) {
            if (!getCommonInfo()
                    .equals(other.getCommonInfo())) return false;
        }
        if (getType()
                != other.getType()) return false;
        if (!getContent()
                .equals(other.getContent())) return false;
        if (hasUser() != other.hasUser()) return false;
        if (hasUser()) {
            if (!getUser()
                    .equals(other.getUser())) return false;
        }
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
        if (hasCommonInfo()) {
            hash = (37 * hash) + COMMONINFO_FIELD_NUMBER;
            hash = (53 * hash) + getCommonInfo().hashCode();
        }
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
        hash = (37 * hash) + CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getContent().hashCode();
        if (hasUser()) {
            hash = (37 * hash) + USER_FIELD_NUMBER;
            hash = (53 * hash) + getUser().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(cn.yscme.scrolling.auto.douyin.FansclubMessage prototype) {
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
     * <pre>
     * from https://github.com/HaoDong108/DouyinBarrageGrab/blob/main/BarrageGrab/proto/message.proto
     * </pre>
     * <p>
     * Protobuf type {@code cn.yscme.scrolling.auto.douyin.FansclubMessage}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:cn.yscme.scrolling.auto.douyin.FansclubMessage)
            cn.yscme.scrolling.auto.douyin.FansclubMessageOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansclubMessage_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansclubMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.yscme.scrolling.auto.douyin.FansclubMessage.class, cn.yscme.scrolling.auto.douyin.FansclubMessage.Builder.class);
        }

        // Construct using cn.yscme.scrolling.auto.douyin.FansclubMessage.newBuilder()
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
                getCommonInfoFieldBuilder();
                getUserFieldBuilder();
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            commonInfo_ = null;
            if (commonInfoBuilder_ != null) {
                commonInfoBuilder_.dispose();
                commonInfoBuilder_ = null;
            }
            type_ = 0;
            content_ = "";
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansclubMessage_descriptor;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.FansclubMessage getDefaultInstanceForType() {
            return cn.yscme.scrolling.auto.douyin.FansclubMessage.getDefaultInstance();
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.FansclubMessage build() {
            cn.yscme.scrolling.auto.douyin.FansclubMessage result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.FansclubMessage buildPartial() {
            cn.yscme.scrolling.auto.douyin.FansclubMessage result = new cn.yscme.scrolling.auto.douyin.FansclubMessage(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(cn.yscme.scrolling.auto.douyin.FansclubMessage result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.commonInfo_ = commonInfoBuilder_ == null
                        ? commonInfo_
                        : commonInfoBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.type_ = type_;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                result.content_ = content_;
            }
            if (((from_bitField0_ & 0x00000008) != 0)) {
                result.user_ = userBuilder_ == null
                        ? user_
                        : userBuilder_.build();
                to_bitField0_ |= 0x00000002;
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
            if (other instanceof cn.yscme.scrolling.auto.douyin.FansclubMessage) {
                return mergeFrom((cn.yscme.scrolling.auto.douyin.FansclubMessage) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.yscme.scrolling.auto.douyin.FansclubMessage other) {
            if (other == cn.yscme.scrolling.auto.douyin.FansclubMessage.getDefaultInstance()) return this;
            if (other.hasCommonInfo()) {
                mergeCommonInfo(other.getCommonInfo());
            }
            if (other.getType() != 0) {
                setType(other.getType());
            }
            if (!other.getContent().isEmpty()) {
                content_ = other.content_;
                bitField0_ |= 0x00000004;
                onChanged();
            }
            if (other.hasUser()) {
                mergeUser(other.getUser());
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
                            input.readMessage(
                                    getCommonInfoFieldBuilder().getBuilder(),
                                    extensionRegistry);
                            bitField0_ |= 0x00000001;
                            break;
                        } // case 10
                        case 16: {
                            type_ = input.readInt32();
                            bitField0_ |= 0x00000002;
                            break;
                        } // case 16
                        case 26: {
                            content_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000004;
                            break;
                        } // case 26
                        case 34: {
                            input.readMessage(
                                    getUserFieldBuilder().getBuilder(),
                                    extensionRegistry);
                            bitField0_ |= 0x00000008;
                            break;
                        } // case 34
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

        private cn.yscme.scrolling.auto.douyin.Common commonInfo_;
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.Common, cn.yscme.scrolling.auto.douyin.Common.Builder, cn.yscme.scrolling.auto.douyin.CommonOrBuilder> commonInfoBuilder_;

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
         *
         * @return Whether the commonInfo field is set.
         */
        public boolean hasCommonInfo() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
         *
         * @return The commonInfo.
         */
        public cn.yscme.scrolling.auto.douyin.Common getCommonInfo() {
            if (commonInfoBuilder_ == null) {
                return commonInfo_ == null ? cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance() : commonInfo_;
            } else {
                return commonInfoBuilder_.getMessage();
            }
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
         */
        public Builder setCommonInfo(cn.yscme.scrolling.auto.douyin.Common value) {
            if (commonInfoBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                commonInfo_ = value;
            } else {
                commonInfoBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
         */
        public Builder setCommonInfo(
                cn.yscme.scrolling.auto.douyin.Common.Builder builderForValue) {
            if (commonInfoBuilder_ == null) {
                commonInfo_ = builderForValue.build();
            } else {
                commonInfoBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
         */
        public Builder mergeCommonInfo(cn.yscme.scrolling.auto.douyin.Common value) {
            if (commonInfoBuilder_ == null) {
                if (((bitField0_ & 0x00000001) != 0) &&
                        commonInfo_ != null &&
                        commonInfo_ != cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance()) {
                    getCommonInfoBuilder().mergeFrom(value);
                } else {
                    commonInfo_ = value;
                }
            } else {
                commonInfoBuilder_.mergeFrom(value);
            }
            if (commonInfo_ != null) {
                bitField0_ |= 0x00000001;
                onChanged();
            }
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
         */
        public Builder clearCommonInfo() {
            bitField0_ = (bitField0_ & ~0x00000001);
            commonInfo_ = null;
            if (commonInfoBuilder_ != null) {
                commonInfoBuilder_.dispose();
                commonInfoBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
         */
        public cn.yscme.scrolling.auto.douyin.Common.Builder getCommonInfoBuilder() {
            bitField0_ |= 0x00000001;
            onChanged();
            return getCommonInfoFieldBuilder().getBuilder();
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
         */
        public cn.yscme.scrolling.auto.douyin.CommonOrBuilder getCommonInfoOrBuilder() {
            if (commonInfoBuilder_ != null) {
                return commonInfoBuilder_.getMessageOrBuilder();
            } else {
                return commonInfo_ == null ?
                        cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance() : commonInfo_;
            }
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common commonInfo = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.Common, cn.yscme.scrolling.auto.douyin.Common.Builder, cn.yscme.scrolling.auto.douyin.CommonOrBuilder>
        getCommonInfoFieldBuilder() {
            if (commonInfoBuilder_ == null) {
                commonInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        cn.yscme.scrolling.auto.douyin.Common, cn.yscme.scrolling.auto.douyin.Common.Builder, cn.yscme.scrolling.auto.douyin.CommonOrBuilder>(
                        getCommonInfo(),
                        getParentForChildren(),
                        isClean());
                commonInfo_ = null;
            }
            return commonInfoBuilder_;
        }

        private int type_;

        /**
         * <pre>
         * 升级是1，加入是2
         * </pre>
         *
         * <code>int32 type = 2;</code>
         *
         * @return The type.
         */
        @java.lang.Override
        public int getType() {
            return type_;
        }

        /**
         * <pre>
         * 升级是1，加入是2
         * </pre>
         *
         * <code>int32 type = 2;</code>
         *
         * @param value The type to set.
         * @return This builder for chaining.
         */
        public Builder setType(int value) {

            type_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 升级是1，加入是2
         * </pre>
         *
         * <code>int32 type = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearType() {
            bitField0_ = (bitField0_ & ~0x00000002);
            type_ = 0;
            onChanged();
            return this;
        }

        private java.lang.Object content_ = "";

        /**
         * <code>string content = 3;</code>
         *
         * @return The content.
         */
        public java.lang.String getContent() {
            java.lang.Object ref = content_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                content_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string content = 3;</code>
         *
         * @return The bytes for content.
         */
        public com.google.protobuf.ByteString
        getContentBytes() {
            java.lang.Object ref = content_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                content_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string content = 3;</code>
         *
         * @param value The content to set.
         * @return This builder for chaining.
         */
        public Builder setContent(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            content_ = value;
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>string content = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearContent() {
            content_ = getDefaultInstance().getContent();
            bitField0_ = (bitField0_ & ~0x00000004);
            onChanged();
            return this;
        }

        /**
         * <code>string content = 3;</code>
         *
         * @param value The bytes for content to set.
         * @return This builder for chaining.
         */
        public Builder setContentBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            content_ = value;
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        private cn.yscme.scrolling.auto.douyin.User user_;
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.User, cn.yscme.scrolling.auto.douyin.User.Builder, cn.yscme.scrolling.auto.douyin.UserOrBuilder> userBuilder_;

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
         *
         * @return Whether the user field is set.
         */
        public boolean hasUser() {
            return ((bitField0_ & 0x00000008) != 0);
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
         *
         * @return The user.
         */
        public cn.yscme.scrolling.auto.douyin.User getUser() {
            if (userBuilder_ == null) {
                return user_ == null ? cn.yscme.scrolling.auto.douyin.User.getDefaultInstance() : user_;
            } else {
                return userBuilder_.getMessage();
            }
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
         */
        public Builder setUser(cn.yscme.scrolling.auto.douyin.User value) {
            if (userBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                user_ = value;
            } else {
                userBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000008;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
         */
        public Builder setUser(
                cn.yscme.scrolling.auto.douyin.User.Builder builderForValue) {
            if (userBuilder_ == null) {
                user_ = builderForValue.build();
            } else {
                userBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000008;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
         */
        public Builder mergeUser(cn.yscme.scrolling.auto.douyin.User value) {
            if (userBuilder_ == null) {
                if (((bitField0_ & 0x00000008) != 0) &&
                        user_ != null &&
                        user_ != cn.yscme.scrolling.auto.douyin.User.getDefaultInstance()) {
                    getUserBuilder().mergeFrom(value);
                } else {
                    user_ = value;
                }
            } else {
                userBuilder_.mergeFrom(value);
            }
            if (user_ != null) {
                bitField0_ |= 0x00000008;
                onChanged();
            }
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
         */
        public Builder clearUser() {
            bitField0_ = (bitField0_ & ~0x00000008);
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
         */
        public cn.yscme.scrolling.auto.douyin.User.Builder getUserBuilder() {
            bitField0_ |= 0x00000008;
            onChanged();
            return getUserFieldBuilder().getBuilder();
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
         */
        public cn.yscme.scrolling.auto.douyin.UserOrBuilder getUserOrBuilder() {
            if (userBuilder_ != null) {
                return userBuilder_.getMessageOrBuilder();
            } else {
                return user_ == null ?
                        cn.yscme.scrolling.auto.douyin.User.getDefaultInstance() : user_;
            }
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 4;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.User, cn.yscme.scrolling.auto.douyin.User.Builder, cn.yscme.scrolling.auto.douyin.UserOrBuilder>
        getUserFieldBuilder() {
            if (userBuilder_ == null) {
                userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        cn.yscme.scrolling.auto.douyin.User, cn.yscme.scrolling.auto.douyin.User.Builder, cn.yscme.scrolling.auto.douyin.UserOrBuilder>(
                        getUser(),
                        getParentForChildren(),
                        isClean());
                user_ = null;
            }
            return userBuilder_;
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


        // @@protoc_insertion_point(builder_scope:cn.yscme.scrolling.auto.douyin.FansclubMessage)
    }

    // @@protoc_insertion_point(class_scope:cn.yscme.scrolling.auto.douyin.FansclubMessage)
    private static final cn.yscme.scrolling.auto.douyin.FansclubMessage DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.yscme.scrolling.auto.douyin.FansclubMessage();
    }

    public static cn.yscme.scrolling.auto.douyin.FansclubMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FansclubMessage>
            PARSER = new com.google.protobuf.AbstractParser<FansclubMessage>() {
        @java.lang.Override
        public FansclubMessage parsePartialFrom(
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

    public static com.google.protobuf.Parser<FansclubMessage> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FansclubMessage> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.FansclubMessage getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

