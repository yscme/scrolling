// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.1
package cn.yscme.scrolling.auto.douyin;

/**
 * Protobuf type {@code cn.yscme.scrolling.auto.douyin.FansClub}
 */
public final class FansClub extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:cn.yscme.scrolling.auto.douyin.FansClub)
        FansClubOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use FansClub.newBuilder() to construct.
    private FansClub(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private FansClub() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new FansClub();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClub_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
            int number) {
        switch (number) {
            case 2:
                return internalGetPreferData();
            default:
                throw new RuntimeException(
                        "Invalid map field number: " + number);
        }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClub_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.yscme.scrolling.auto.douyin.FansClub.class, cn.yscme.scrolling.auto.douyin.FansClub.Builder.class);
    }

    private int bitField0_;
    public static final int DATA_FIELD_NUMBER = 1;
    private cn.yscme.scrolling.auto.douyin.FansClubData data_;

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
     *
     * @return Whether the data field is set.
     */
    @java.lang.Override
    public boolean hasData() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
     *
     * @return The data.
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.FansClubData getData() {
        return data_ == null ? cn.yscme.scrolling.auto.douyin.FansClubData.getDefaultInstance() : data_;
    }

    /**
     * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder getDataOrBuilder() {
        return data_ == null ? cn.yscme.scrolling.auto.douyin.FansClubData.getDefaultInstance() : data_;
    }

    public static final int PREFERDATA_FIELD_NUMBER = 2;

    private static final class PreferDataDefaultEntryHolder {
        static final com.google.protobuf.MapEntry<
                java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> defaultEntry =
                com.google.protobuf.MapEntry
                        .<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData>newDefaultInstance(
                                cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClub_PreferDataEntry_descriptor,
                                com.google.protobuf.WireFormat.FieldType.INT32,
                                0,
                                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                                cn.yscme.scrolling.auto.douyin.FansClubData.getDefaultInstance());
    }

    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
            java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> preferData_;

    private com.google.protobuf.MapField<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData>
    internalGetPreferData() {
        if (preferData_ == null) {
            return com.google.protobuf.MapField.emptyMapField(
                    PreferDataDefaultEntryHolder.defaultEntry);
        }
        return preferData_;
    }

    public int getPreferDataCount() {
        return internalGetPreferData().getMap().size();
    }

    /**
     * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
     */
    @java.lang.Override
    public boolean containsPreferData(
            int key) {

        return internalGetPreferData().getMap().containsKey(key);
    }

    /**
     * Use {@link #getPreferDataMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> getPreferData() {
        return getPreferDataMap();
    }

    /**
     * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> getPreferDataMap() {
        return internalGetPreferData().getMap();
    }

    /**
     * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
    cn.yscme.scrolling.auto.douyin.FansClubData getPreferDataOrDefault(
            int key,
            /* nullable */
            cn.yscme.scrolling.auto.douyin.FansClubData defaultValue) {

        java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> map =
                internalGetPreferData().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
     */
    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.FansClubData getPreferDataOrThrow(
            int key) {

        java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> map =
                internalGetPreferData().getMap();
        if (!map.containsKey(key)) {
            throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
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
            output.writeMessage(1, getData());
        }
        com.google.protobuf.GeneratedMessageV3
                .serializeIntegerMapTo(
                        output,
                        internalGetPreferData(),
                        PreferDataDefaultEntryHolder.defaultEntry,
                        2);
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, getData());
        }
        for (java.util.Map.Entry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> entry
                : internalGetPreferData().getMap().entrySet()) {
            com.google.protobuf.MapEntry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData>
                    preferData__ = PreferDataDefaultEntryHolder.defaultEntry.newBuilderForType()
                    .setKey(entry.getKey())
                    .setValue(entry.getValue())
                    .build();
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(2, preferData__);
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
        if (!(obj instanceof cn.yscme.scrolling.auto.douyin.FansClub)) {
            return super.equals(obj);
        }
        cn.yscme.scrolling.auto.douyin.FansClub other = (cn.yscme.scrolling.auto.douyin.FansClub) obj;

        if (hasData() != other.hasData()) return false;
        if (hasData()) {
            if (!getData()
                    .equals(other.getData())) return false;
        }
        if (!internalGetPreferData().equals(
                other.internalGetPreferData())) return false;
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
        if (hasData()) {
            hash = (37 * hash) + DATA_FIELD_NUMBER;
            hash = (53 * hash) + getData().hashCode();
        }
        if (!internalGetPreferData().getMap().isEmpty()) {
            hash = (37 * hash) + PREFERDATA_FIELD_NUMBER;
            hash = (53 * hash) + internalGetPreferData().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub parseFrom(
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

    public static Builder newBuilder(cn.yscme.scrolling.auto.douyin.FansClub prototype) {
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
     * Protobuf type {@code cn.yscme.scrolling.auto.douyin.FansClub}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:cn.yscme.scrolling.auto.douyin.FansClub)
            cn.yscme.scrolling.auto.douyin.FansClubOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClub_descriptor;
        }

        @SuppressWarnings({"rawtypes"})
        protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
                int number) {
            switch (number) {
                case 2:
                    return internalGetPreferData();
                default:
                    throw new RuntimeException(
                            "Invalid map field number: " + number);
            }
        }

        @SuppressWarnings({"rawtypes"})
        protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
                int number) {
            switch (number) {
                case 2:
                    return internalGetMutablePreferData();
                default:
                    throw new RuntimeException(
                            "Invalid map field number: " + number);
            }
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClub_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.yscme.scrolling.auto.douyin.FansClub.class, cn.yscme.scrolling.auto.douyin.FansClub.Builder.class);
        }

        // Construct using cn.yscme.scrolling.auto.douyin.FansClub.newBuilder()
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
                getDataFieldBuilder();
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            data_ = null;
            if (dataBuilder_ != null) {
                dataBuilder_.dispose();
                dataBuilder_ = null;
            }
            internalGetMutablePreferData().clear();
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.yscme.scrolling.auto.douyin.Douyin.internal_static_cn_yscme_scrolling_auto_douyin_FansClub_descriptor;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.FansClub getDefaultInstanceForType() {
            return cn.yscme.scrolling.auto.douyin.FansClub.getDefaultInstance();
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.FansClub build() {
            cn.yscme.scrolling.auto.douyin.FansClub result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.FansClub buildPartial() {
            cn.yscme.scrolling.auto.douyin.FansClub result = new cn.yscme.scrolling.auto.douyin.FansClub(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(cn.yscme.scrolling.auto.douyin.FansClub result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.data_ = dataBuilder_ == null
                        ? data_
                        : dataBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.preferData_ = internalGetPreferData().build(PreferDataDefaultEntryHolder.defaultEntry);
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
            if (other instanceof cn.yscme.scrolling.auto.douyin.FansClub) {
                return mergeFrom((cn.yscme.scrolling.auto.douyin.FansClub) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.yscme.scrolling.auto.douyin.FansClub other) {
            if (other == cn.yscme.scrolling.auto.douyin.FansClub.getDefaultInstance()) return this;
            if (other.hasData()) {
                mergeData(other.getData());
            }
            internalGetMutablePreferData().mergeFrom(
                    other.internalGetPreferData());
            bitField0_ |= 0x00000002;
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
                                    getDataFieldBuilder().getBuilder(),
                                    extensionRegistry);
                            bitField0_ |= 0x00000001;
                            break;
                        } // case 10
                        case 18: {
                            com.google.protobuf.MapEntry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData>
                                    preferData__ = input.readMessage(
                                    PreferDataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                            internalGetMutablePreferData().ensureBuilderMap().put(
                                    preferData__.getKey(), preferData__.getValue());
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

        private cn.yscme.scrolling.auto.douyin.FansClubData data_;
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.FansClubData, cn.yscme.scrolling.auto.douyin.FansClubData.Builder, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder> dataBuilder_;

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
         *
         * @return Whether the data field is set.
         */
        public boolean hasData() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
         *
         * @return The data.
         */
        public cn.yscme.scrolling.auto.douyin.FansClubData getData() {
            if (dataBuilder_ == null) {
                return data_ == null ? cn.yscme.scrolling.auto.douyin.FansClubData.getDefaultInstance() : data_;
            } else {
                return dataBuilder_.getMessage();
            }
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
         */
        public Builder setData(cn.yscme.scrolling.auto.douyin.FansClubData value) {
            if (dataBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                data_ = value;
            } else {
                dataBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
         */
        public Builder setData(
                cn.yscme.scrolling.auto.douyin.FansClubData.Builder builderForValue) {
            if (dataBuilder_ == null) {
                data_ = builderForValue.build();
            } else {
                dataBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
         */
        public Builder mergeData(cn.yscme.scrolling.auto.douyin.FansClubData value) {
            if (dataBuilder_ == null) {
                if (((bitField0_ & 0x00000001) != 0) &&
                        data_ != null &&
                        data_ != cn.yscme.scrolling.auto.douyin.FansClubData.getDefaultInstance()) {
                    getDataBuilder().mergeFrom(value);
                } else {
                    data_ = value;
                }
            } else {
                dataBuilder_.mergeFrom(value);
            }
            if (data_ != null) {
                bitField0_ |= 0x00000001;
                onChanged();
            }
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
         */
        public Builder clearData() {
            bitField0_ = (bitField0_ & ~0x00000001);
            data_ = null;
            if (dataBuilder_ != null) {
                dataBuilder_.dispose();
                dataBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
         */
        public cn.yscme.scrolling.auto.douyin.FansClubData.Builder getDataBuilder() {
            bitField0_ |= 0x00000001;
            onChanged();
            return getDataFieldBuilder().getBuilder();
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
         */
        public cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder getDataOrBuilder() {
            if (dataBuilder_ != null) {
                return dataBuilder_.getMessageOrBuilder();
            } else {
                return data_ == null ?
                        cn.yscme.scrolling.auto.douyin.FansClubData.getDefaultInstance() : data_;
            }
        }

        /**
         * <code>.cn.yscme.scrolling.auto.douyin.FansClubData data = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
                cn.yscme.scrolling.auto.douyin.FansClubData, cn.yscme.scrolling.auto.douyin.FansClubData.Builder, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder>
        getDataFieldBuilder() {
            if (dataBuilder_ == null) {
                dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                        cn.yscme.scrolling.auto.douyin.FansClubData, cn.yscme.scrolling.auto.douyin.FansClubData.Builder, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder>(
                        getData(),
                        getParentForChildren(),
                        isClean());
                data_ = null;
            }
            return dataBuilder_;
        }

        private static final class PreferDataConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder, cn.yscme.scrolling.auto.douyin.FansClubData> {
            @java.lang.Override
            public cn.yscme.scrolling.auto.douyin.FansClubData build(cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder val) {
                if (val instanceof cn.yscme.scrolling.auto.douyin.FansClubData) {
                    return (cn.yscme.scrolling.auto.douyin.FansClubData) val;
                }
                return ((cn.yscme.scrolling.auto.douyin.FansClubData.Builder) val).build();
            }

            @java.lang.Override
            public com.google.protobuf.MapEntry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> defaultEntry() {
                return PreferDataDefaultEntryHolder.defaultEntry;
            }
        }

        ;
        private static final PreferDataConverter preferDataConverter = new PreferDataConverter();

        private com.google.protobuf.MapFieldBuilder<
                java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder, cn.yscme.scrolling.auto.douyin.FansClubData, cn.yscme.scrolling.auto.douyin.FansClubData.Builder> preferData_;

        private com.google.protobuf.MapFieldBuilder<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder, cn.yscme.scrolling.auto.douyin.FansClubData, cn.yscme.scrolling.auto.douyin.FansClubData.Builder>
        internalGetPreferData() {
            if (preferData_ == null) {
                return new com.google.protobuf.MapFieldBuilder<>(preferDataConverter);
            }
            return preferData_;
        }

        private com.google.protobuf.MapFieldBuilder<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder, cn.yscme.scrolling.auto.douyin.FansClubData, cn.yscme.scrolling.auto.douyin.FansClubData.Builder>
        internalGetMutablePreferData() {
            if (preferData_ == null) {
                preferData_ = new com.google.protobuf.MapFieldBuilder<>(preferDataConverter);
            }
            bitField0_ |= 0x00000002;
            onChanged();
            return preferData_;
        }

        public int getPreferDataCount() {
            return internalGetPreferData().ensureBuilderMap().size();
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
         */
        @java.lang.Override
        public boolean containsPreferData(
                int key) {

            return internalGetPreferData().ensureBuilderMap().containsKey(key);
        }

        /**
         * Use {@link #getPreferDataMap()} instead.
         */
        @java.lang.Override
        @java.lang.Deprecated
        public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> getPreferData() {
            return getPreferDataMap();
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
         */
        @java.lang.Override
        public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> getPreferDataMap() {
            return internalGetPreferData().getImmutableMap();
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
         */
        @java.lang.Override
        public /* nullable */
        cn.yscme.scrolling.auto.douyin.FansClubData getPreferDataOrDefault(
                int key,
                /* nullable */
                cn.yscme.scrolling.auto.douyin.FansClubData defaultValue) {

            java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder> map = internalGetMutablePreferData().ensureBuilderMap();
            return map.containsKey(key) ? preferDataConverter.build(map.get(key)) : defaultValue;
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
         */
        @java.lang.Override
        public cn.yscme.scrolling.auto.douyin.FansClubData getPreferDataOrThrow(
                int key) {

            java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder> map = internalGetMutablePreferData().ensureBuilderMap();
            if (!map.containsKey(key)) {
                throw new java.lang.IllegalArgumentException();
            }
            return preferDataConverter.build(map.get(key));
        }

        public Builder clearPreferData() {
            bitField0_ = (bitField0_ & ~0x00000002);
            internalGetMutablePreferData().clear();
            return this;
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
         */
        public Builder removePreferData(
                int key) {

            internalGetMutablePreferData().ensureBuilderMap()
                    .remove(key);
            return this;
        }

        /**
         * Use alternate mutation accessors instead.
         */
        @java.lang.Deprecated
        public java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData>
        getMutablePreferData() {
            bitField0_ |= 0x00000002;
            return internalGetMutablePreferData().ensureMessageMap();
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
         */
        public Builder putPreferData(
                int key,
                cn.yscme.scrolling.auto.douyin.FansClubData value) {

            if (value == null) {
                throw new NullPointerException("map value");
            }
            internalGetMutablePreferData().ensureBuilderMap()
                    .put(key, value);
            bitField0_ |= 0x00000002;
            return this;
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
         */
        public Builder putAllPreferData(
                java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> values) {
            for (java.util.Map.Entry<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubData> e : values.entrySet()) {
                if (e.getKey() == null || e.getValue() == null) {
                    throw new NullPointerException();
                }
            }
            internalGetMutablePreferData().ensureBuilderMap()
                    .putAll(values);
            bitField0_ |= 0x00000002;
            return this;
        }

        /**
         * <code>map&lt;int32, .cn.yscme.scrolling.auto.douyin.FansClubData&gt; preferData = 2;</code>
         */
        public cn.yscme.scrolling.auto.douyin.FansClubData.Builder putPreferDataBuilderIfAbsent(
                int key) {
            java.util.Map<java.lang.Integer, cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder> builderMap = internalGetMutablePreferData().ensureBuilderMap();
            cn.yscme.scrolling.auto.douyin.FansClubDataOrBuilder entry = builderMap.get(key);
            if (entry == null) {
                entry = cn.yscme.scrolling.auto.douyin.FansClubData.newBuilder();
                builderMap.put(key, entry);
            }
            if (entry instanceof cn.yscme.scrolling.auto.douyin.FansClubData) {
                entry = ((cn.yscme.scrolling.auto.douyin.FansClubData) entry).toBuilder();
                builderMap.put(key, entry);
            }
            return (cn.yscme.scrolling.auto.douyin.FansClubData.Builder) entry;
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


        // @@protoc_insertion_point(builder_scope:cn.yscme.scrolling.auto.douyin.FansClub)
    }

    // @@protoc_insertion_point(class_scope:cn.yscme.scrolling.auto.douyin.FansClub)
    private static final cn.yscme.scrolling.auto.douyin.FansClub DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new cn.yscme.scrolling.auto.douyin.FansClub();
    }

    public static cn.yscme.scrolling.auto.douyin.FansClub getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FansClub>
            PARSER = new com.google.protobuf.AbstractParser<FansClub>() {
        @java.lang.Override
        public FansClub parsePartialFrom(
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

    public static com.google.protobuf.Parser<FansClub> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FansClub> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public cn.yscme.scrolling.auto.douyin.FansClub getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

