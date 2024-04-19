// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

/**
 * Protobuf type {@code cn.yscme.scrolling.auto.douyin.UserBadge}
 */
public final class UserBadge extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:cn.yscme.scrolling.auto.douyin.UserBadge)
        UserBadgeOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use UserBadge.newBuilder() to construct.
    private UserBadge(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private UserBadge() {
        title_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new UserBadge();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_UserBadge_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
            int number) {
        switch (number) {
            case 1:
                return internalGetIcons();
            default:
                throw new RuntimeException(
                        "Invalid map field number: " + number);
        }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_UserBadge_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.yscme.scrolling.auto.douyin.UserBadge.class, cn.yscme.scrolling.auto.douyin.UserBadge.Builder.class);
    }

    public static final int ICONS_FIELD_NUMBER = 1;

    private static final class IconsDefaultEntryHolder {
        static final com.google.protobuf.MapEntry<
                java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> defaultEntry =
                com.google.protobuf.MapEntry
                        .<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image>newDefaultInstance(
                                cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_UserBadge_IconsEntry_descriptor,
                                com.google.protobuf.WireFormat.FieldType.INT32,
                                0,
                                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                                cn.yscme.scrolling.auto.douyin.Image.getDefaultInstance());
    }

    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
            java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> icons_;

    private com.google.protobuf.MapField<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image>
    internalGetIcons() {
        if (icons_ == null) {
            return com.google.protobuf.MapField.emptyMapField(
                    IconsDefaultEntryHolder.defaultEntry);
        }
        return icons_;
    }

    public int getIconsCount() {
        return internalGetIcons().getMap().size();
    }

    /**
     * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
     */
    @java.lang.Override
    public boolean containsIcons(
            int key) {

        return internalGetIcons().getMap().containsKey(key);
    }

    /**
     * Use {@link #getIconsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> getIcons() {
        return getIconsMap();
    }

    /**
     * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> getIconsMap() {
        return internalGetIcons().getMap();
    }

    /**
     * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
    cn.yscme.scrolling.auto.douyin.Image getIconsOrDefault(
            int key,
            /* nullable */
            cn.yscme.scrolling.auto.douyin.Image defaultValue) {

        java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> map =
                internalGetIcons().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.Image getIconsOrThrow(
            int key) {

        java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> map =
                internalGetIcons().getMap();
        if (!map.containsKey(key)) {
            throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
    }

    public static final int TITLE_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object title_ = "";

    /**
     * <code>string title = 2;</code>
     *
     * @return The title.
     */
    @java.lang.Override
    public java.lang.String getTitle() {
        java.lang.Object ref = title_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            title_ = s;
            return s;
        }
    }

    /**
     * <code>string title = 2;</code>
     *
     * @return The bytes for title.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getTitleBytes() {
        java.lang.Object ref = title_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (java.lang.String) ref);
            title_ = b;
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
        com.google.protobuf.GeneratedMessageV3
                .serializeIntegerMapTo(
                        output,
                        internalGetIcons(),
                        IconsDefaultEntryHolder.defaultEntry,
                        1);
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        for (java.util.Map.Entry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> entry
                : internalGetIcons().getMap().entrySet()) {
            com.google.protobuf.MapEntry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image>
                    icons__ = IconsDefaultEntryHolder.defaultEntry.newBuilderForType()
                    .setKey(entry.getKey())
                    .setValue(entry.getValue())
                    .build();
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, icons__);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
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
        if (!(obj instanceof cn.yscme.scrolling.auto.douyin.UserBadge)) {
            return super.equals(obj);
        }
        cn.yscme.scrolling.auto.douyin.UserBadge other = (cn.yscme.scrolling.auto.douyin.UserBadge) obj;

        if (!internalGetIcons().equals(
                other.internalGetIcons())) return false;
        if (!getTitle()
                .equals(other.getTitle())) return false;
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
        if (!internalGetIcons().getMap().isEmpty()) {
            hash = (37 * hash) + ICONS_FIELD_NUMBER;
            hash = (53 * hash) + internalGetIcons().hashCode();
        }
        hash = (37 * hash) + TITLE_FIELD_NUMBER;
        hash = (53 * hash) + getTitle().hashCode();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge parseFrom(
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

    public static Builder newBuilder(cn.yscme.scrolling.auto.douyin.UserBadge prototype) {
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
     * Protobuf type {@code cn.yscme.scrolling.auto.douyin.UserBadge}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:cn.yscme.scrolling.auto.douyin.UserBadge)
            cn.yscme.scrolling.auto.douyin.UserBadgeOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_UserBadge_descriptor;
        }

        @SuppressWarnings({"rawtypes"})
        protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
                int number) {
            switch (number) {
                case 1:
                    return internalGetIcons();
                default:
                    throw new RuntimeException(
                            "Invalid map field number: " + number);
            }
        }

        @SuppressWarnings({"rawtypes"})
        protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
                int number) {
            switch (number) {
                case 1:
                    return internalGetMutableIcons();
                default:
                    throw new RuntimeException(
                            "Invalid map field number: " + number);
            }
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_UserBadge_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.yscme.scrolling.auto.douyin.UserBadge.class, cn.yscme.scrolling.auto.douyin.UserBadge.Builder.class);
        }

        // Construct using cn.yscme.scrolling.auto.douyin.UserBadge.newBuilder()
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
            internalGetMutableIcons().clear();
            title_ = "";
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_UserBadge_descriptor;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.UserBadge getDefaultInstanceForType() {
            return cn.yscme.scrolling.auto.douyin.UserBadge.getDefaultInstance();
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.UserBadge build() {
            cn.yscme.scrolling.auto.douyin.UserBadge result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.UserBadge buildPartial() {
            cn.yscme.scrolling.auto.douyin.UserBadge result = new cn.yscme.scrolling.auto.douyin.UserBadge(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(cn.yscme.scrolling.auto.douyin.UserBadge result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.icons_ = internalGetIcons().build(IconsDefaultEntryHolder.defaultEntry);
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.title_ = title_;
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
            if (other instanceof cn.yscme.scrolling.auto.douyin.UserBadge) {
                return mergeFrom((cn.yscme.scrolling.auto.douyin.UserBadge) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.yscme.scrolling.auto.douyin.UserBadge other) {
            if (other == cn.yscme.scrolling.auto.douyin.UserBadge.getDefaultInstance()) return this;
            internalGetMutableIcons().mergeFrom(
                    other.internalGetIcons());
            bitField0_ |= 0x00000001;
            if (!other.getTitle().isEmpty()) {
                title_ = other.title_;
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
                            com.google.protobuf.MapEntry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image>
                                    icons__ = input.readMessage(
                                    IconsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            internalGetMutableIcons().ensureBuilderMap().put(
                                    icons__.getKey(), icons__.getValue());
                            bitField0_ |= 0x00000001;
                            break;
                        } // case 10
                        case 18: {
                            title_ = input.readStringRequireUtf8();
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

        private static final class IconsConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.Integer, cn.yscme.scrolling.auto.douyin.ImageOrBuilder, cn.yscme.scrolling.auto.douyin.Image> {
            @java.lang.Override
            public cn.yscme.scrolling.auto.douyin.Image build(cn.yscme.scrolling.auto.douyin.ImageOrBuilder val) {
                if (val instanceof cn.yscme.scrolling.auto.douyin.Image) {
                    return (cn.yscme.scrolling.auto.douyin.Image) val;
                }
                return ((cn.yscme.scrolling.auto.douyin.Image.Builder) val).build();
            }

            @java.lang.Override
            public com.google.protobuf.MapEntry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> defaultEntry() {
                return IconsDefaultEntryHolder.defaultEntry;
            }
        }

        ;
        private static final IconsConverter iconsConverter = new IconsConverter();

        private com.google.protobuf.MapFieldBuilder<
                java.lang.Integer, cn.yscme.scrolling.auto.douyin.ImageOrBuilder, cn.yscme.scrolling.auto.douyin.Image, cn.yscme.scrolling.auto.douyin.Image.Builder> icons_;

        private com.google.protobuf.MapFieldBuilder<java.lang.Integer, cn.yscme.scrolling.auto.douyin.ImageOrBuilder, cn.yscme.scrolling.auto.douyin.Image, cn.yscme.scrolling.auto.douyin.Image.Builder>
        internalGetIcons() {
            if (icons_ == null) {
                return new com.google.protobuf.MapFieldBuilder<>(iconsConverter);
            }
            return icons_;
        }

        private com.google.protobuf.MapFieldBuilder<java.lang.Integer, cn.yscme.scrolling.auto.douyin.ImageOrBuilder, cn.yscme.scrolling.auto.douyin.Image, cn.yscme.scrolling.auto.douyin.Image.Builder>
        internalGetMutableIcons() {
            if (icons_ == null) {
                icons_ = new com.google.protobuf.MapFieldBuilder<>(iconsConverter);
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return icons_;
        }

        public int getIconsCount() {
            return internalGetIcons().ensureBuilderMap().size();
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
         */
        @java.lang.Override
        public boolean containsIcons(
                int key) {

            return internalGetIcons().ensureBuilderMap().containsKey(key);
        }

        /**
         * Use {@link #getIconsMap()} instead.
         */
        @java.lang.Override
        @java.lang.Deprecated
        public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> getIcons() {
            return getIconsMap();
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
         */
        @java.lang.Override
        public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> getIconsMap() {
            return internalGetIcons().getImmutableMap();
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
         */
        @java.lang.Override
        public /* nullable */
        cn.yscme.scrolling.auto.douyin.Image getIconsOrDefault(
                int key,
                /* nullable */
                cn.yscme.scrolling.auto.douyin.Image defaultValue) {

            java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.ImageOrBuilder> map = internalGetMutableIcons().ensureBuilderMap();
            return map.containsKey(key) ? iconsConverter.build(map.get(key)) : defaultValue;
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
         */
        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.Image getIconsOrThrow(
                int key) {

            java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.ImageOrBuilder> map = internalGetMutableIcons().ensureBuilderMap();
            if (!map.containsKey(key)) {
                throw new java.lang.IllegalArgumentException();
            }
            return iconsConverter.build(map.get(key));
        }

        public Builder clearIcons() {
            bitField0_ = (bitField0_ & ~0x00000001);
            internalGetMutableIcons().clear();
            return this;
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
         */
        public Builder removeIcons(
                int key) {

            internalGetMutableIcons().ensureBuilderMap()
                    .remove(key);
            return this;
        }

        /**
         * Use alternate mutation accessors instead.
         */
        @java.lang.Deprecated
        public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image>
        getMutableIcons() {
            bitField0_ |= 0x00000001;
            return internalGetMutableIcons().ensureMessageMap();
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
         */
        public Builder putIcons(
                int key,
                cn.yscme.scrolling.auto.douyin.Image value) {

            if (value == null) {
                throw new NullPointerException("map value");
            }
            internalGetMutableIcons().ensureBuilderMap()
                    .put(key, value);
            bitField0_ |= 0x00000001;
            return this;
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
         */
        public Builder putAllIcons(
                java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> values) {
            for (java.util.Map.Entry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.Image> e : values.entrySet()) {
                if (e.getKey() == null || e.getValue() == null) {
                    throw new NullPointerException();
                }
            }
            internalGetMutableIcons().ensureBuilderMap()
                    .putAll(values);
            bitField0_ |= 0x00000001;
            return this;
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.Image&gt; icons = 1;</code>
         */
        public cn.yscme.scrolling.auto.douyin.Image.Builder putIconsBuilderIfAbsent(
                int key) {
            java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.ImageOrBuilder> builderMap = internalGetMutableIcons().ensureBuilderMap();
            cn.yscme.scrolling.auto.douyin.ImageOrBuilder entry = builderMap.get(key);
            if (entry == null) {
                entry = cn.yscme.scrolling.auto.douyin.Image.newBuilder();
                builderMap.put(key, entry);
            }
            if (entry instanceof cn.yscme.scrolling.auto.douyin.Image) {
                entry = ((cn.yscme.scrolling.auto.douyin.Image) entry).toBuilder();
                builderMap.put(key, entry);
            }
            return (cn.yscme.scrolling.auto.douyin.Image.Builder) entry;
        }

        private java.lang.Object title_ = "";

        /**
         * <code>string title = 2;</code>
         *
         * @return The title.
         */
        public java.lang.String getTitle() {
            java.lang.Object ref = title_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                title_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string title = 2;</code>
         *
         * @return The bytes for title.
         */
        public com.google.protobuf.ByteString
        getTitleBytes() {
            java.lang.Object ref = title_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                title_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string title = 2;</code>
         *
         * @param value The title to set.
         * @return This builder for chaining.
         */
        public Builder setTitle(
                java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            title_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>string title = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearTitle() {
            title_ = getDefaultInstance().getTitle();
            bitField0_ = (bitField0_ & ~0x00000002);
            onChanged();
            return this;
        }

        /**
         * <code>string title = 2;</code>
         *
         * @param value The bytes for title to set.
         * @return This builder for chaining.
         */
        public Builder setTitleBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            title_ = value;
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


        // @@protoc_insertion_point(builder_scope:cn.yscme.scrolling.auto.douyin.UserBadge)
    }

    // @@protoc_insertion_point(class_scope:cn.yscme.scrolling.auto.douyin.UserBadge)
    private static final cn.yscme.scrolling.auto.douyin.UserBadge DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.yscme.scrolling.auto.douyin.UserBadge();
    }

    public static cn.yscme.scrolling.auto.douyin.UserBadge getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserBadge>
            PARSER = new com.google.protobuf.AbstractParser<UserBadge>() {
        @java.lang.Override
        public UserBadge parsePartialFrom(
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

    public static com.google.protobuf.Parser<UserBadge> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserBadge> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.UserBadge getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

