// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vegvisirNetwork.proto

package com.vegvisir.network.datatype.proto;

/**
 * Protobuf type {@code vegvisir.network.datatype.SendRequest}
 */
public  final class SendRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:vegvisir.network.datatype.SendRequest)
    SendRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendRequest.newBuilder() to construct.
  private SendRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.vegvisir.network.datatype.proto.Payload.Builder subBuilder = null;
            if (payload_ != null) {
              subBuilder = payload_.toBuilder();
            }
            payload_ = input.readMessage(com.vegvisir.network.datatype.proto.Payload.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(payload_);
              payload_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.vegvisir.network.datatype.proto.VegvisirNetworkDatatypeProto.internal_static_vegvisir_network_datatype_SendRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.vegvisir.network.datatype.proto.VegvisirNetworkDatatypeProto.internal_static_vegvisir_network_datatype_SendRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.vegvisir.network.datatype.proto.SendRequest.class, com.vegvisir.network.datatype.proto.SendRequest.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private com.vegvisir.network.datatype.proto.Payload payload_;
  /**
   * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
   */
  public boolean hasPayload() {
    return payload_ != null;
  }
  /**
   * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
   */
  public com.vegvisir.network.datatype.proto.Payload getPayload() {
    return payload_ == null ? com.vegvisir.network.datatype.proto.Payload.getDefaultInstance() : payload_;
  }
  /**
   * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
   */
  public com.vegvisir.network.datatype.proto.PayloadOrBuilder getPayloadOrBuilder() {
    return getPayload();
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
    if (payload_ != null) {
      output.writeMessage(1, getPayload());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (payload_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPayload());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.vegvisir.network.datatype.proto.SendRequest)) {
      return super.equals(obj);
    }
    com.vegvisir.network.datatype.proto.SendRequest other = (com.vegvisir.network.datatype.proto.SendRequest) obj;

    boolean result = true;
    result = result && (hasPayload() == other.hasPayload());
    if (hasPayload()) {
      result = result && getPayload()
          .equals(other.getPayload());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.vegvisir.network.datatype.proto.SendRequest parseFrom(
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
  public static Builder newBuilder(com.vegvisir.network.datatype.proto.SendRequest prototype) {
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
   * Protobuf type {@code vegvisir.network.datatype.SendRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:vegvisir.network.datatype.SendRequest)
      com.vegvisir.network.datatype.proto.SendRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.vegvisir.network.datatype.proto.VegvisirNetworkDatatypeProto.internal_static_vegvisir_network_datatype_SendRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.vegvisir.network.datatype.proto.VegvisirNetworkDatatypeProto.internal_static_vegvisir_network_datatype_SendRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.vegvisir.network.datatype.proto.SendRequest.class, com.vegvisir.network.datatype.proto.SendRequest.Builder.class);
    }

    // Construct using com.vegvisir.network.datatype.proto.SendRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (payloadBuilder_ == null) {
        payload_ = null;
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.vegvisir.network.datatype.proto.VegvisirNetworkDatatypeProto.internal_static_vegvisir_network_datatype_SendRequest_descriptor;
    }

    @java.lang.Override
    public com.vegvisir.network.datatype.proto.SendRequest getDefaultInstanceForType() {
      return com.vegvisir.network.datatype.proto.SendRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.vegvisir.network.datatype.proto.SendRequest build() {
      com.vegvisir.network.datatype.proto.SendRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.vegvisir.network.datatype.proto.SendRequest buildPartial() {
      com.vegvisir.network.datatype.proto.SendRequest result = new com.vegvisir.network.datatype.proto.SendRequest(this);
      if (payloadBuilder_ == null) {
        result.payload_ = payload_;
      } else {
        result.payload_ = payloadBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.vegvisir.network.datatype.proto.SendRequest) {
        return mergeFrom((com.vegvisir.network.datatype.proto.SendRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.vegvisir.network.datatype.proto.SendRequest other) {
      if (other == com.vegvisir.network.datatype.proto.SendRequest.getDefaultInstance()) return this;
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.vegvisir.network.datatype.proto.SendRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.vegvisir.network.datatype.proto.SendRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.vegvisir.network.datatype.proto.Payload payload_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.vegvisir.network.datatype.proto.Payload, com.vegvisir.network.datatype.proto.Payload.Builder, com.vegvisir.network.datatype.proto.PayloadOrBuilder> payloadBuilder_;
    /**
     * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
     */
    public boolean hasPayload() {
      return payloadBuilder_ != null || payload_ != null;
    }
    /**
     * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
     */
    public com.vegvisir.network.datatype.proto.Payload getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null ? com.vegvisir.network.datatype.proto.Payload.getDefaultInstance() : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }
    /**
     * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
     */
    public Builder setPayload(com.vegvisir.network.datatype.proto.Payload value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        payloadBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
     */
    public Builder setPayload(
        com.vegvisir.network.datatype.proto.Payload.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
     */
    public Builder mergePayload(com.vegvisir.network.datatype.proto.Payload value) {
      if (payloadBuilder_ == null) {
        if (payload_ != null) {
          payload_ =
            com.vegvisir.network.datatype.proto.Payload.newBuilder(payload_).mergeFrom(value).buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        payloadBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        payload_ = null;
        onChanged();
      } else {
        payload_ = null;
        payloadBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
     */
    public com.vegvisir.network.datatype.proto.Payload.Builder getPayloadBuilder() {
      
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
     */
    public com.vegvisir.network.datatype.proto.PayloadOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null ?
            com.vegvisir.network.datatype.proto.Payload.getDefaultInstance() : payload_;
      }
    }
    /**
     * <code>.vegvisir.network.datatype.Payload payload = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.vegvisir.network.datatype.proto.Payload, com.vegvisir.network.datatype.proto.Payload.Builder, com.vegvisir.network.datatype.proto.PayloadOrBuilder> 
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.vegvisir.network.datatype.proto.Payload, com.vegvisir.network.datatype.proto.Payload.Builder, com.vegvisir.network.datatype.proto.PayloadOrBuilder>(
                getPayload(),
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      return payloadBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:vegvisir.network.datatype.SendRequest)
  }

  // @@protoc_insertion_point(class_scope:vegvisir.network.datatype.SendRequest)
  private static final com.vegvisir.network.datatype.proto.SendRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.vegvisir.network.datatype.proto.SendRequest();
  }

  public static com.vegvisir.network.datatype.proto.SendRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendRequest>
      PARSER = new com.google.protobuf.AbstractParser<SendRequest>() {
    @java.lang.Override
    public SendRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.vegvisir.network.datatype.proto.SendRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

