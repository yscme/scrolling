// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

/**
 * Protobuf type {@code cn.yscme.scrolling.auto.douyin.PatternRef}
 */
public final class PatternRef extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:cn.yscme.scrolling.auto.douyin.PatternRef)
        PatternRefOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use PatternRef.newBuilder() to construct.
    private PatternRef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private PatternRef() {
        key_ = "";
        defaultPattern_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new PatternRef();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_PatternRef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_PatternRef_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.yscme.scrolling.auto.douyin.PatternRef.class, cn.yscme.scrolling.auto.douyin.PatternRef.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object key_ = "";

    /**
     * <code>string key = 1;</code>
     *
     * @return The key.
     */
    @java.lang.Override
    public java.lang.String getKey() {
        java.lang.Object ref = key_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            key_ = s;
            return s;
        }
    }

    /**
     * <code>string key = 1;</code>
     *
     * @return The bytes for key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getKeyBytes() {
        java.lang.Object ref = key_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            key_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int DEFAULTPATTERN_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object defaultPattern_ = "";

    /**
     * <code>string defaultPattern = 2;</code>
     *
     * @return The defaultPattern.
     */
    @java.lang.Override
    public java.lang.String getDefaultPattern() {
        java.lang.Object ref = defaultPattern_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            defaultPattern_ = s;
            return s;
        }
    }

    /**
     * <code>string defaultPattern = 2;</code>
     *
     * @return The bytes for defaultPattern.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getDefaultPatternBytes() {
        java.lang.Object ref = defaultPattern_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            defaultPattern_ = b;
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
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultPattern_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, defaultPattern_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(defaultPattern_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, defaultPattern_);
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
        if (!(obj instanceof cn.yscme.scrolling.auto.douyin.PatternRef)) {
            return super.equals(obj);
        }
        cn.yscme.scrolling.auto.douyin.PatternRef other = (cn.yscme.scrolling.auto.douyin.PatternRef) obj;

        if (!getKey()
                .equals(other.getKey())) return false;
        if (!getDefaultPattern()
                .equals(other.getDefaultPattern())) return false;
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
        hash = (37 * hash) + KEY_FIELD_NUMBER;
        hash = (53 * hash) + getKey().hashCode();
        hash = (37 * hash) + DEFAULTPATTERN_FIELD_NUMBER;
        hash = (53 * hash) + getDefaultPattern().hashCode();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef parseFrom(
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

    public static Builder newBuilder(cn.yscme.scrolling.auto.douyin.PatternRef prototype) {
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
     * Protobuf type {@code cn.yscme.scrolling.auto.douyin.PatternRef}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:cn.yscme.scrolling.auto.douyin.PatternRef)
            cn.yscme.scrolling.auto.douyin.PatternRefOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_PatternRef_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_PatternRef_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.yscme.scrolling.auto.douyin.PatternRef.class, cn.yscme.scrolling.auto.douyin.PatternRef.Builder.class);
        }

        // Construct using cn.yscme.scrolling.auto.douyin.PatternRef.newBuilder()
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
            key_ = "";
            defaultPattern_ = "";
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_PatternRef_descriptor;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.PatternRef getDefaultInstanceForType() {
            return cn.yscme.scrolling.auto.douyin.PatternRef.getDefaultInstance();
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.PatternRef build() {
            cn.yscme.scrolling.auto.douyin.PatternRef result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.PatternRef buildPartial() {
            cn.yscme.scrolling.auto.douyin.PatternRef result = new cn.yscme.scrolling.auto.douyin.PatternRef(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(cn.yscme.scrolling.auto.douyin.PatternRef result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.key_ = key_;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.defaultPattern_ = defaultPattern_;
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
            if (other instanceof cn.yscme.scrolling.auto.douyin.PatternRef) {
                return mergeFrom((cn.yscme.scrolling.auto.douyin.PatternRef) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.yscme.scrolling.auto.douyin.PatternRef other) {
            if (other == cn.yscme.scrolling.auto.douyin.PatternRef.getDefaultInstance()) return this;
            if (!other.getKey().isEmpty()) {
                key_ = other.key_;
                bitField0_ |= 0x00000001;
                onChanged();
            }
            if (!other.getDefaultPattern().isEmpty()) {
                defaultPattern_ = other.defaultPattern_;
                bitField0_ |= 0x00000002;
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
                            key_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000001;
                            break;
                        } // case 10
                        case 18: {
                            defaultPattern_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000002;
                            break;
                        } // case 18
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

        private java.lang.Object key_ = "";

        /**
         * <code>string key = 1;</code>
         *
         * @return The key.
         */
        public java.lang.String getKey() {
            java.lang.Object ref = key_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                key_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string key = 1;</code>
         *
         * @return The bytes for key.
         */
        public com.google.protobuf.ByteString
        getKeyBytes() {
            java.lang.Object ref = key_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                key_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string key = 1;</code>
         *
         * @param value The key to set.
         * @return This builder for chaining.
         */
        public Builder setKey(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            key_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>string key = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearKey() {
            key_ = getDefaultInstance().getKey();
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }

        /**
         * <code>string key = 1;</code>
         *
         * @param value The bytes for key to set.
         * @return This builder for chaining.
         */
        public Builder setKeyBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            key_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        private java.lang.Object defaultPattern_ = "";

        /**
         * <code>string defaultPattern = 2;</code>
         *
         * @return The defaultPattern.
         */
        public java.lang.String getDefaultPattern() {
            java.lang.Object ref = defaultPattern_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                defaultPattern_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string defaultPattern = 2;</code>
         *
         * @return The bytes for defaultPattern.
         */
        public com.google.protobuf.ByteString
        getDefaultPatternBytes() {
            java.lang.Object ref = defaultPattern_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                defaultPattern_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string defaultPattern = 2;</code>
         *
         * @param value The defaultPattern to set.
         * @return This builder for chaining.
         */
        public Builder setDefaultPattern(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            defaultPattern_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>string defaultPattern = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearDefaultPattern() {
            defaultPattern_ = getDefaultInstance().getDefaultPattern();
            bitField0_ = (bitField0_ & ~0x00000002);
            onChanged();
            return this;
        }

        /**
         * <code>string defaultPattern = 2;</code>
         *
         * @param value The bytes for defaultPattern to set.
         * @return This builder for chaining.
         */
        public Builder setDefaultPatternBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            defaultPattern_ = value;
            bitField0_ |= 0x00000002;
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


        // @@protoc_insertion_point(builder_scope:cn.yscme.scrolling.auto.douyin.PatternRef)
    }

    // @@protoc_insertion_point(class_scope:cn.yscme.scrolling.auto.douyin.PatternRef)
    private static final cn.yscme.scrolling.auto.douyin.PatternRef DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.yscme.scrolling.auto.douyin.PatternRef();
    }

    public static cn.yscme.scrolling.auto.douyin.PatternRef getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PatternRef>
            PARSER = new com.google.protobuf.AbstractParser<PatternRef>() {
        @java.lang.Override
        public PatternRef parsePartialFrom(
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

    public static com.google.protobuf.Parser<PatternRef> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PatternRef> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.PatternRef getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

