// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

/**
 * Protobuf type {@code cn.yscme.scrolling.auto.douyin.TextPieceUser}
 */
public final class TextPieceUser extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:cn.yscme.scrolling.auto.douyin.TextPieceUser)
        TextPieceUserOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use TextPieceUser.newBuilder() to construct.
    private TextPieceUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private TextPieceUser() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new TextPieceUser();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_TextPieceUser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_TextPieceUser_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.yscme.scrolling.auto.douyin.TextPieceUser.class, cn.yscme.scrolling.auto.douyin.TextPieceUser.Builder.class);
    }

    private int bitField0_;
    public static final int USER_FIELD_NUMBER = 1;
    private cn.yscme.scrolling.auto.douyin.User user_;

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
     *
     * @return Whether the user field is set.
     */
    @java.lang.Override
    public boolean hasUser() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
     *
     * @return The user.
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.User getUser() {
        return user_ == null ? cn.yscme.scrolling.auto.douyin.User.getDefaultInstance() : user_;
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.UserOrBuilder getUserOrBuilder() {
        return user_ == null ? cn.yscme.scrolling.auto.douyin.User.getDefaultInstance() : user_;
    }

    public static final int WITHCOLON_FIELD_NUMBER = 2;
    private boolean withColon_ = false;

    /**
     * <code>bool withColon = 2;</code>
     *
     * @return The withColon.
     */
    @java.lang.Override
    public boolean getWithColon() {
        return withColon_;
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
            output.writeMessage(1, getUser());
        }
        if (withColon_ != false) {
            output.writeBool(2, withColon_);
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
                    .computeMessageSize(1, getUser());
        }
        if (withColon_ != false) {
            size += com.google.protobuf.CodedOutputStream
                    .computeBoolSize(2, withColon_);
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
        if (!(obj instanceof cn.yscme.scrolling.auto.douyin.TextPieceUser)) {
            return super.equals(obj);
        }
        cn.yscme.scrolling.auto.douyin.TextPieceUser other = (cn.yscme.scrolling.auto.douyin.TextPieceUser) obj;

        if (hasUser() != other.hasUser()) return false;
        if (hasUser()) {
            if (!getUser()
                    .equals(other.getUser())) return false;
        }
        if (getWithColon()
                != other.getWithColon()) return false;
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
        if (hasUser()) {
            hash = (37 * hash) + USER_FIELD_NUMBER;
            hash = (53 * hash) + getUser().hashCode();
        }
        hash = (37 * hash) + WITHCOLON_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                getWithColon());
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser parseFrom(
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

    public static Builder newBuilder(cn.yscme.scrolling.auto.douyin.TextPieceUser prototype) {
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
     * Protobuf type {@code cn.yscme.scrolling.auto.douyin.TextPieceUser}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:cn.yscme.scrolling.auto.douyin.TextPieceUser)
            cn.yscme.scrolling.auto.douyin.TextPieceUserOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_TextPieceUser_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_TextPieceUser_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.yscme.scrolling.auto.douyin.TextPieceUser.class, cn.yscme.scrolling.auto.douyin.TextPieceUser.Builder.class);
        }

        // Construct using cn.yscme.scrolling.auto.douyin.TextPieceUser.newBuilder()
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
                getUserFieldBuilder();
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            withColon_ = false;
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_TextPieceUser_descriptor;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.TextPieceUser getDefaultInstanceForType() {
            return cn.yscme.scrolling.auto.douyin.TextPieceUser.getDefaultInstance();
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.TextPieceUser build() {
            cn.yscme.scrolling.auto.douyin.TextPieceUser result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.TextPieceUser buildPartial() {
            cn.yscme.scrolling.auto.douyin.TextPieceUser result = new cn.yscme.scrolling.auto.douyin.TextPieceUser(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(cn.yscme.scrolling.auto.douyin.TextPieceUser result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.user_ = userBuilder_ == null
                        ? user_
                        : userBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.withColon_ = withColon_;
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
            if (other instanceof cn.yscme.scrolling.auto.douyin.TextPieceUser) {
                return mergeFrom((cn.yscme.scrolling.auto.douyin.TextPieceUser) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.yscme.scrolling.auto.douyin.TextPieceUser other) {
            if (other == cn.yscme.scrolling.auto.douyin.TextPieceUser.getDefaultInstance()) return this;
            if (other.hasUser()) {
                mergeUser(other.getUser());
            }
            if (other.getWithColon() != false) {
                setWithColon(other.getWithColon());
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
                                    getUserFieldBuilder().getBuilder(),
                                    extensionRegistry);
                            bitField0_ |= 0x00000001;
                            break;
                        } // case 10
                        case 16: {
                            withColon_ = input.readBool();
                            bitField0_ |= 0x00000002;
                            break;
                        } // case 16
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

        private cn.yscme.scrolling.auto.douyin.User user_;
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.User, cn.yscme.scrolling.auto.douyin.User.Builder, cn.yscme.scrolling.auto.douyin.UserOrBuilder> userBuilder_;

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
         *
         * @return Whether the user field is set.
         */
        public boolean hasUser() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
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
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
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
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
         */
        public Builder setUser(
                cn.yscme.scrolling.auto.douyin.User.Builder builderForValue) {
            if (userBuilder_ == null) {
                user_ = builderForValue.build();
            } else {
                userBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
         */
        public Builder mergeUser(cn.yscme.scrolling.auto.douyin.User value) {
            if (userBuilder_ == null) {
                if (((bitField0_ & 0x00000001) != 0) &&
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
                bitField0_ |= 0x00000001;
                onChanged();
            }
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
         */
        public Builder clearUser() {
            bitField0_ = (bitField0_ & ~0x00000001);
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
         */
        public cn.yscme.scrolling.auto.douyin.User.Builder getUserBuilder() {
            bitField0_ |= 0x00000001;
            onChanged();
            return getUserFieldBuilder().getBuilder();
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
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
         * <code>.cn.yscme.scrolling.auto.douyin.User user = 1;</code>
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

        private boolean withColon_;

        /**
         * <code>bool withColon = 2;</code>
         *
         * @return The withColon.
         */
        @java.lang.Override
        public boolean getWithColon() {
            return withColon_;
        }

        /**
         * <code>bool withColon = 2;</code>
         *
         * @param value The withColon to set.
         * @return This builder for chaining.
         */
        public Builder setWithColon(boolean value) {

            withColon_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>bool withColon = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearWithColon() {
            bitField0_ = (bitField0_ & ~0x00000002);
            withColon_ = false;
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


        // @@protoc_insertion_point(builder_scope:cn.yscme.scrolling.auto.douyin.TextPieceUser)
    }

    // @@protoc_insertion_point(class_scope:cn.yscme.scrolling.auto.douyin.TextPieceUser)
    private static final cn.yscme.scrolling.auto.douyin.TextPieceUser DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.yscme.scrolling.auto.douyin.TextPieceUser();
    }

    public static cn.yscme.scrolling.auto.douyin.TextPieceUser getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TextPieceUser>
            PARSER = new com.google.protobuf.AbstractParser<TextPieceUser>() {
        @java.lang.Override
        public TextPieceUser parsePartialFrom(
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

    public static com.google.protobuf.Parser<TextPieceUser> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TextPieceUser> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.TextPieceUser getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

