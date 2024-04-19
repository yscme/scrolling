// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

/**
 * <pre>
 * from https://github.com/HaoDong108/DouyinBarrageGrab/blob/main/BarrageGrab/proto/message.proto
 * status = 3 下播
 * </pre>
 * <p>
 * Protobuf type {@code cn.yscme.scrolling.auto.douyin.ControlMessage}
 */
public final class ControlMessage extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:cn.yscme.scrolling.auto.douyin.ControlMessage)
        ControlMessageOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use ControlMessage.newBuilder() to construct.
    private ControlMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ControlMessage() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new ControlMessage();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_ControlMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_ControlMessage_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.yscme.scrolling.auto.douyin.ControlMessage.class, cn.yscme.scrolling.auto.douyin.ControlMessage.Builder.class);
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

    public static final int STATUS_FIELD_NUMBER = 2;
    private int status_ = 0;

    /**
     * <code>int32 status = 2;</code>
     *
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
        return status_;
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
        if (status_ != 0) {
            output.writeInt32(2, status_);
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
        if (status_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, status_);
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
        if (!(obj instanceof cn.yscme.scrolling.auto.douyin.ControlMessage)) {
            return super.equals(obj);
        }
        cn.yscme.scrolling.auto.douyin.ControlMessage other = (cn.yscme.scrolling.auto.douyin.ControlMessage) obj;

        if (hasCommon() != other.hasCommon()) return false;
        if (hasCommon()) {
            if (!getCommon()
                    .equals(other.getCommon())) return false;
        }
        if (getStatus()
                != other.getStatus()) return false;
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
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage parseFrom(
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

    public static Builder newBuilder(cn.yscme.scrolling.auto.douyin.ControlMessage prototype) {
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
     * status = 3 下播
     * </pre>
     * <p>
     * Protobuf type {@code cn.yscme.scrolling.auto.douyin.ControlMessage}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:cn.yscme.scrolling.auto.douyin.ControlMessage)
            cn.yscme.scrolling.auto.douyin.ControlMessageOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_ControlMessage_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_ControlMessage_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.yscme.scrolling.auto.douyin.ControlMessage.class, cn.yscme.scrolling.auto.douyin.ControlMessage.Builder.class);
        }

        // Construct using cn.yscme.scrolling.auto.douyin.ControlMessage.newBuilder()
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
            status_ = 0;
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_ControlMessage_descriptor;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.ControlMessage getDefaultInstanceForType() {
            return cn.yscme.scrolling.auto.douyin.ControlMessage.getDefaultInstance();
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.ControlMessage build() {
            cn.yscme.scrolling.auto.douyin.ControlMessage result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.ControlMessage buildPartial() {
            cn.yscme.scrolling.auto.douyin.ControlMessage result = new cn.yscme.scrolling.auto.douyin.ControlMessage(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(cn.yscme.scrolling.auto.douyin.ControlMessage result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.common_ = commonBuilder_ == null
                        ? common_
                        : commonBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.status_ = status_;
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
            if (other instanceof cn.yscme.scrolling.auto.douyin.ControlMessage) {
                return mergeFrom((cn.yscme.scrolling.auto.douyin.ControlMessage) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.yscme.scrolling.auto.douyin.ControlMessage other) {
            if (other == cn.yscme.scrolling.auto.douyin.ControlMessage.getDefaultInstance()) return this;
            if (other.hasCommon()) {
                mergeCommon(other.getCommon());
            }
            if (other.getStatus() != 0) {
                setStatus(other.getStatus());
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
                        case 16: {
                            status_ = input.readInt32();
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

        private int status_;

        /**
         * <code>int32 status = 2;</code>
         *
         * @return The status.
         */
        @java.lang.Override
        public int getStatus() {
            return status_;
        }

        /**
         * <code>int32 status = 2;</code>
         *
         * @param value The status to set.
         * @return This builder for chaining.
         */
        public Builder setStatus(int value) {

            status_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>int32 status = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearStatus() {
            bitField0_ = (bitField0_ & ~0x00000002);
            status_ = 0;
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


        // @@protoc_insertion_point(builder_scope:cn.yscme.scrolling.auto.douyin.ControlMessage)
    }

    // @@protoc_insertion_point(class_scope:cn.yscme.scrolling.auto.douyin.ControlMessage)
    private static final cn.yscme.scrolling.auto.douyin.ControlMessage DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.yscme.scrolling.auto.douyin.ControlMessage();
    }

    public static cn.yscme.scrolling.auto.douyin.ControlMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ControlMessage>
            PARSER = new com.google.protobuf.AbstractParser<ControlMessage>() {
        @java.lang.Override
        public ControlMessage parsePartialFrom(
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

    public static com.google.protobuf.Parser<ControlMessage> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ControlMessage> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.ControlMessage getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

