// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

package com.proto.greet;

/**
 * Protobuf type {@code greet.GreetWithDeadLineRequest}
 */
public  final class GreetWithDeadLineRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:greet.GreetWithDeadLineRequest)
    GreetWithDeadLineRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GreetWithDeadLineRequest.newBuilder() to construct.
  private GreetWithDeadLineRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GreetWithDeadLineRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GreetWithDeadLineRequest(
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
            com.proto.greet.Greeting.Builder subBuilder = null;
            if (greeting_ != null) {
              subBuilder = greeting_.toBuilder();
            }
            greeting_ = input.readMessage(com.proto.greet.Greeting.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(greeting_);
              greeting_ = subBuilder.buildPartial();
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
    return com.proto.greet.Greet.internal_static_greet_GreetWithDeadLineRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.greet.Greet.internal_static_greet_GreetWithDeadLineRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.greet.GreetWithDeadLineRequest.class, com.proto.greet.GreetWithDeadLineRequest.Builder.class);
  }

  public static final int GREETING_FIELD_NUMBER = 1;
  private com.proto.greet.Greeting greeting_;
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  public boolean hasGreeting() {
    return greeting_ != null;
  }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  public com.proto.greet.Greeting getGreeting() {
    return greeting_ == null ? com.proto.greet.Greeting.getDefaultInstance() : greeting_;
  }
  /**
   * <code>.greet.Greeting greeting = 1;</code>
   */
  public com.proto.greet.GreetingOrBuilder getGreetingOrBuilder() {
    return getGreeting();
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
    if (greeting_ != null) {
      output.writeMessage(1, getGreeting());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (greeting_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGreeting());
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
    if (!(obj instanceof com.proto.greet.GreetWithDeadLineRequest)) {
      return super.equals(obj);
    }
    com.proto.greet.GreetWithDeadLineRequest other = (com.proto.greet.GreetWithDeadLineRequest) obj;

    boolean result = true;
    result = result && (hasGreeting() == other.hasGreeting());
    if (hasGreeting()) {
      result = result && getGreeting()
          .equals(other.getGreeting());
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
    if (hasGreeting()) {
      hash = (37 * hash) + GREETING_FIELD_NUMBER;
      hash = (53 * hash) + getGreeting().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.greet.GreetWithDeadLineRequest parseFrom(
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
  public static Builder newBuilder(com.proto.greet.GreetWithDeadLineRequest prototype) {
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
   * Protobuf type {@code greet.GreetWithDeadLineRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:greet.GreetWithDeadLineRequest)
      com.proto.greet.GreetWithDeadLineRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.greet.Greet.internal_static_greet_GreetWithDeadLineRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.greet.Greet.internal_static_greet_GreetWithDeadLineRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.greet.GreetWithDeadLineRequest.class, com.proto.greet.GreetWithDeadLineRequest.Builder.class);
    }

    // Construct using com.proto.greet.GreetWithDeadLineRequest.newBuilder()
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
      if (greetingBuilder_ == null) {
        greeting_ = null;
      } else {
        greeting_ = null;
        greetingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.greet.Greet.internal_static_greet_GreetWithDeadLineRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.greet.GreetWithDeadLineRequest getDefaultInstanceForType() {
      return com.proto.greet.GreetWithDeadLineRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.greet.GreetWithDeadLineRequest build() {
      com.proto.greet.GreetWithDeadLineRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.greet.GreetWithDeadLineRequest buildPartial() {
      com.proto.greet.GreetWithDeadLineRequest result = new com.proto.greet.GreetWithDeadLineRequest(this);
      if (greetingBuilder_ == null) {
        result.greeting_ = greeting_;
      } else {
        result.greeting_ = greetingBuilder_.build();
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
      if (other instanceof com.proto.greet.GreetWithDeadLineRequest) {
        return mergeFrom((com.proto.greet.GreetWithDeadLineRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.greet.GreetWithDeadLineRequest other) {
      if (other == com.proto.greet.GreetWithDeadLineRequest.getDefaultInstance()) return this;
      if (other.hasGreeting()) {
        mergeGreeting(other.getGreeting());
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
      com.proto.greet.GreetWithDeadLineRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.greet.GreetWithDeadLineRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.greet.Greeting greeting_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.greet.Greeting, com.proto.greet.Greeting.Builder, com.proto.greet.GreetingOrBuilder> greetingBuilder_;
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public boolean hasGreeting() {
      return greetingBuilder_ != null || greeting_ != null;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public com.proto.greet.Greeting getGreeting() {
      if (greetingBuilder_ == null) {
        return greeting_ == null ? com.proto.greet.Greeting.getDefaultInstance() : greeting_;
      } else {
        return greetingBuilder_.getMessage();
      }
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(com.proto.greet.Greeting value) {
      if (greetingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        greeting_ = value;
        onChanged();
      } else {
        greetingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder setGreeting(
        com.proto.greet.Greeting.Builder builderForValue) {
      if (greetingBuilder_ == null) {
        greeting_ = builderForValue.build();
        onChanged();
      } else {
        greetingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder mergeGreeting(com.proto.greet.Greeting value) {
      if (greetingBuilder_ == null) {
        if (greeting_ != null) {
          greeting_ =
            com.proto.greet.Greeting.newBuilder(greeting_).mergeFrom(value).buildPartial();
        } else {
          greeting_ = value;
        }
        onChanged();
      } else {
        greetingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public Builder clearGreeting() {
      if (greetingBuilder_ == null) {
        greeting_ = null;
        onChanged();
      } else {
        greeting_ = null;
        greetingBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public com.proto.greet.Greeting.Builder getGreetingBuilder() {
      
      onChanged();
      return getGreetingFieldBuilder().getBuilder();
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    public com.proto.greet.GreetingOrBuilder getGreetingOrBuilder() {
      if (greetingBuilder_ != null) {
        return greetingBuilder_.getMessageOrBuilder();
      } else {
        return greeting_ == null ?
            com.proto.greet.Greeting.getDefaultInstance() : greeting_;
      }
    }
    /**
     * <code>.greet.Greeting greeting = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.greet.Greeting, com.proto.greet.Greeting.Builder, com.proto.greet.GreetingOrBuilder> 
        getGreetingFieldBuilder() {
      if (greetingBuilder_ == null) {
        greetingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.greet.Greeting, com.proto.greet.Greeting.Builder, com.proto.greet.GreetingOrBuilder>(
                getGreeting(),
                getParentForChildren(),
                isClean());
        greeting_ = null;
      }
      return greetingBuilder_;
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


    // @@protoc_insertion_point(builder_scope:greet.GreetWithDeadLineRequest)
  }

  // @@protoc_insertion_point(class_scope:greet.GreetWithDeadLineRequest)
  private static final com.proto.greet.GreetWithDeadLineRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.greet.GreetWithDeadLineRequest();
  }

  public static com.proto.greet.GreetWithDeadLineRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GreetWithDeadLineRequest>
      PARSER = new com.google.protobuf.AbstractParser<GreetWithDeadLineRequest>() {
    @java.lang.Override
    public GreetWithDeadLineRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GreetWithDeadLineRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GreetWithDeadLineRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GreetWithDeadLineRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.greet.GreetWithDeadLineRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

