// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

/**
 * Protobuf type {@code cn.yscme.scrolling.auto.douyin.CommonTextMessage}
 */
public final class CommonTextMessage extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:cn.yscme.scrolling.auto.douyin.CommonTextMessage)
        CommonTextMessageOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use CommonTextMessage.newBuilder() to construct.
    private CommonTextMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private CommonTextMessage() {
        scene_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new CommonTextMessage();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_CommonTextMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_CommonTextMessage_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.yscme.scrolling.auto.douyin.CommonTextMessage.class, cn.yscme.scrolling.auto.douyin.CommonTextMessage.Builder.class);
    }

    private int bitField0_;
    public static final int COMMON_FIELD_NUMBER = 1;
    private cn.yscme.scrolling.auto.douyin.Common common_;

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
     *
     * @return Whether the common field is set.
     */
    @java.lang.Override
    public boolean hasCommon() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
     *
     * @return The common.
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.Common getCommon() {
        return common_ == null ? cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance() : common_;
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.CommonOrBuilder getCommonOrBuilder() {
        return common_ == null ? cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance() : common_;
    }

    public static final int USER_FIELD_NUMBER = 2;
    private cn.yscme.scrolling.auto.douyin.User user_;

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
     *
     * @return Whether the user field is set.
     */
    @java.lang.Override
    public boolean hasUser() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
     *
     * @return The user.
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.User getUser() {
        return user_ == null ? cn.yscme.scrolling.auto.douyin.User.getDefaultInstance() : user_;
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.UserOrBuilder getUserOrBuilder() {
        return user_ == null ? cn.yscme.scrolling.auto.douyin.User.getDefaultInstance() : user_;
    }

    public static final int SCENE_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object scene_ = "";

    /**
     * <code>string scene = 3;</code>
     *
     * @return The scene.
     */
    @java.lang.Override
    public java.lang.String getScene() {
        java.lang.Object ref = scene_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            scene_ = s;
            return s;
        }
    }

    /**
     * <code>string scene = 3;</code>
     *
     * @return The bytes for scene.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getSceneBytes() {
        java.lang.Object ref = scene_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            scene_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
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
            output.writeMessage(1, getCommon());
        }
        if (((bitField0_ & 0x00000002) != 0)) {
            output.writeMessage(2, getUser());
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scene_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, scene_);
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
                    .computeMessageSize(1, getCommon());
        }
        if (((bitField0_ & 0x00000002) != 0)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(2, getUser());
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(scene_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, scene_);
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
        if (!(obj instanceof cn.yscme.scrolling.auto.douyin.CommonTextMessage)) {
            return super.equals(obj);
        }
        cn.yscme.scrolling.auto.douyin.CommonTextMessage other = (cn.yscme.scrolling.auto.douyin.CommonTextMessage) obj;

        if (hasCommon() != other.hasCommon()) return false;
        if (hasCommon()) {
            if (!getCommon()
                    .equals(other.getCommon())) return false;
        }
        if (hasUser() != other.hasUser()) return false;
        if (hasUser()) {
            if (!getUser()
                    .equals(other.getUser())) return false;
        }
        if (!getScene()
                .equals(other.getScene())) return false;
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
        if (hasCommon()) {
            hash = (37 * hash) + COMMON_FIELD_NUMBER;
            hash = (53 * hash) + getCommon().hashCode();
        }
        if (hasUser()) {
            hash = (37 * hash) + USER_FIELD_NUMBER;
            hash = (53 * hash) + getUser().hashCode();
        }
        hash = (37 * hash) + SCENE_FIELD_NUMBER;
        hash = (53 * hash) + getScene().hashCode();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage parseFrom(
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

    public static Builder newBuilder(cn.yscme.scrolling.auto.douyin.CommonTextMessage prototype) {
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
     * Protobuf type {@code cn.yscme.scrolling.auto.douyin.CommonTextMessage}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:cn.yscme.scrolling.auto.douyin.CommonTextMessage)
            cn.yscme.scrolling.auto.douyin.CommonTextMessageOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_CommonTextMessage_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_CommonTextMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.yscme.scrolling.auto.douyin.CommonTextMessage.class, cn.yscme.scrolling.auto.douyin.CommonTextMessage.Builder.class);
        }

        // Construct using cn.yscme.scrolling.auto.douyin.CommonTextMessage.newBuilder()
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
                getCommonFieldBuilder();
                getUserFieldBuilder();
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            common_ = null;
            if (commonBuilder_ != null) {
                commonBuilder_.dispose();
                commonBuilder_ = null;
            }
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            scene_ = "";
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_CommonTextMessage_descriptor;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.CommonTextMessage getDefaultInstanceForType() {
            return cn.yscme.scrolling.auto.douyin.CommonTextMessage.getDefaultInstance();
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.CommonTextMessage build() {
            cn.yscme.scrolling.auto.douyin.CommonTextMessage result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.CommonTextMessage buildPartial() {
            cn.yscme.scrolling.auto.douyin.CommonTextMessage result = new cn.yscme.scrolling.auto.douyin.CommonTextMessage(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(cn.yscme.scrolling.auto.douyin.CommonTextMessage result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.common_ = commonBuilder_ == null
                        ? common_
                        : commonBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.user_ = userBuilder_ == null
                        ? user_
                        : userBuilder_.build();
                to_bitField0_ |= 0x00000002;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                result.scene_ = scene_;
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
            if (other instanceof cn.yscme.scrolling.auto.douyin.CommonTextMessage) {
                return mergeFrom((cn.yscme.scrolling.auto.douyin.CommonTextMessage) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.yscme.scrolling.auto.douyin.CommonTextMessage other) {
            if (other == cn.yscme.scrolling.auto.douyin.CommonTextMessage.getDefaultInstance()) return this;
            if (other.hasCommon()) {
                mergeCommon(other.getCommon());
            }
            if (other.hasUser()) {
                mergeUser(other.getUser());
            }
            if (!other.getScene().isEmpty()) {
                scene_ = other.scene_;
                bitField0_ |= 0x00000004;
                onChanged();
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
                                    getCommonFieldBuilder().getBuilder(),
                                    extensionRegistry);
                            bitField0_ |= 0x00000001;
                            break;
                        } // case 10
                        case 18: {
                            input.readMessage(
                                    getUserFieldBuilder().getBuilder(),
                                    extensionRegistry);
                            bitField0_ |= 0x00000002;
                            break;
                        } // case 18
                        case 26: {
                            scene_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000004;
                            break;
                        } // case 26
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

        private cn.yscme.scrolling.auto.douyin.Common common_;
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.Common, cn.yscme.scrolling.auto.douyin.Common.Builder, cn.yscme.scrolling.auto.douyin.CommonOrBuilder> commonBuilder_;

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
         *
         * @return Whether the common field is set.
         */
        public boolean hasCommon() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
         *
         * @return The common.
         */
        public cn.yscme.scrolling.auto.douyin.Common getCommon() {
            if (commonBuilder_ == null) {
                return common_ == null ? cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance() : common_;
            } else {
                return commonBuilder_.getMessage();
            }
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
         */
        public Builder setCommon(cn.yscme.scrolling.auto.douyin.Common value) {
            if (commonBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                common_ = value;
            } else {
                commonBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
         */
        public Builder setCommon(
                cn.yscme.scrolling.auto.douyin.Common.Builder builderForValue) {
            if (commonBuilder_ == null) {
                common_ = builderForValue.build();
            } else {
                commonBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
         */
        public Builder mergeCommon(cn.yscme.scrolling.auto.douyin.Common value) {
            if (commonBuilder_ == null) {
                if (((bitField0_ & 0x00000001) != 0) &&
                        common_ != null &&
                        common_ != cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance()) {
                    getCommonBuilder().mergeFrom(value);
                } else {
                    common_ = value;
                }
            } else {
                commonBuilder_.mergeFrom(value);
            }
            if (common_ != null) {
                bitField0_ |= 0x00000001;
                onChanged();
            }
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
         */
        public Builder clearCommon() {
            bitField0_ = (bitField0_ & ~0x00000001);
            common_ = null;
            if (commonBuilder_ != null) {
                commonBuilder_.dispose();
                commonBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
         */
        public cn.yscme.scrolling.auto.douyin.Common.Builder getCommonBuilder() {
            bitField0_ |= 0x00000001;
            onChanged();
            return getCommonFieldBuilder().getBuilder();
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
         */
        public cn.yscme.scrolling.auto.douyin.CommonOrBuilder getCommonOrBuilder() {
            if (commonBuilder_ != null) {
                return commonBuilder_.getMessageOrBuilder();
            } else {
                return common_ == null ?
                        cn.yscme.scrolling.auto.douyin.Common.getDefaultInstance() : common_;
            }
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.Common common = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.Common, cn.yscme.scrolling.auto.douyin.Common.Builder, cn.yscme.scrolling.auto.douyin.CommonOrBuilder>
        getCommonFieldBuilder() {
            if (commonBuilder_ == null) {
                commonBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        cn.yscme.scrolling.auto.douyin.Common, cn.yscme.scrolling.auto.douyin.Common.Builder, cn.yscme.scrolling.auto.douyin.CommonOrBuilder>(
                        getCommon(),
                        getParentForChildren(),
                        isClean());
                common_ = null;
            }
            return commonBuilder_;
        }

        private cn.yscme.scrolling.auto.douyin.User user_;
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.User, cn.yscme.scrolling.auto.douyin.User.Builder, cn.yscme.scrolling.auto.douyin.UserOrBuilder> userBuilder_;

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
         *
         * @return Whether the user field is set.
         */
        public boolean hasUser() {
            return ((bitField0_ & 0x00000002) != 0);
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
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
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
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
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
         */
        public Builder setUser(
                cn.yscme.scrolling.auto.douyin.User.Builder builderForValue) {
            if (userBuilder_ == null) {
                user_ = builderForValue.build();
            } else {
                userBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
         */
        public Builder mergeUser(cn.yscme.scrolling.auto.douyin.User value) {
            if (userBuilder_ == null) {
                if (((bitField0_ & 0x00000002) != 0) &&
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
                bitField0_ |= 0x00000002;
                onChanged();
            }
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
         */
        public Builder clearUser() {
            bitField0_ = (bitField0_ & ~0x00000002);
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
         */
        public cn.yscme.scrolling.auto.douyin.User.Builder getUserBuilder() {
            bitField0_ |= 0x00000002;
            onChanged();
            return getUserFieldBuilder().getBuilder();
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
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
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 2;</code>
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

        private java.lang.Object scene_ = "";

        /**
         * <code>string scene = 3;</code>
         *
         * @return The scene.
         */
        public java.lang.String getScene() {
            java.lang.Object ref = scene_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                scene_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string scene = 3;</code>
         *
         * @return The bytes for scene.
         */
        public com.google.protobuf.ByteString
        getSceneBytes() {
            java.lang.Object ref = scene_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                scene_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string scene = 3;</code>
         *
         * @param value The scene to set.
         * @return This builder for chaining.
         */
        public Builder setScene(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            scene_ = value;
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>string scene = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearScene() {
            scene_ = getDefaultInstance().getScene();
            bitField0_ = (bitField0_ & ~0x00000004);
            onChanged();
            return this;
        }

        /**
         * <code>string scene = 3;</code>
         *
         * @param value The bytes for scene to set.
         * @return This builder for chaining.
         */
        public Builder setSceneBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            scene_ = value;
            bitField0_ |= 0x00000004;
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


        // @@protoc_insertion_point(builder_scope:cn.yscme.scrolling.auto.douyin.CommonTextMessage)
    }

    // @@protoc_insertion_point(class_scope:cn.yscme.scrolling.auto.douyin.CommonTextMessage)
    private static final cn.yscme.scrolling.auto.douyin.CommonTextMessage DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.yscme.scrolling.auto.douyin.CommonTextMessage();
    }

    public static cn.yscme.scrolling.auto.douyin.CommonTextMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CommonTextMessage>
            PARSER = new com.google.protobuf.AbstractParser<CommonTextMessage>() {
        @java.lang.Override
        public CommonTextMessage parsePartialFrom(
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

    public static com.google.protobuf.Parser<CommonTextMessage> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CommonTextMessage> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.CommonTextMessage getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

