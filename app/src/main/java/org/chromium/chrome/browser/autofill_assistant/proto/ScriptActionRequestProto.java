// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * Protobuf type {@code autofill_assistant.ScriptActionRequestProto}
 */
public  final class ScriptActionRequestProto extends
    com.google.protobuf.GeneratedMessageLite<
        ScriptActionRequestProto, ScriptActionRequestProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.ScriptActionRequestProto)
    ScriptActionRequestProtoOrBuilder {
  private ScriptActionRequestProto() {
    globalPayload_ = com.google.protobuf.ByteString.EMPTY;
    scriptPayload_ = com.google.protobuf.ByteString.EMPTY;
  }
  private int bitField0_;
  private int requestCase_ = 0;
  private java.lang.Object request_;
  public enum RequestCase
      implements com.google.protobuf.Internal.EnumLite {
    INITIAL_REQUEST(4),
    NEXT_REQUEST(5),
    REQUEST_NOT_SET(0);
    private final int value;
    private RequestCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RequestCase valueOf(int value) {
      return forNumber(value);
    }

    public static RequestCase forNumber(int value) {
      switch (value) {
        case 4: return INITIAL_REQUEST;
        case 5: return NEXT_REQUEST;
        case 0: return REQUEST_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RequestCase
  getRequestCase() {
    return RequestCase.forNumber(
        requestCase_);
  }

  private void clearRequest() {
    requestCase_ = 0;
    request_ = null;
  }

  public static final int CLIENT_CONTEXT_FIELD_NUMBER = 7;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto clientContext_;
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
   */
  public boolean hasClientContext() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto getClientContext() {
    return clientContext_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.getDefaultInstance() : clientContext_;
  }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
   */
  private void setClientContext(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    clientContext_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
   */
  private void setClientContext(
      org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.Builder builderForValue) {
    clientContext_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
   */
  private void mergeClientContext(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto value) {
    if (clientContext_ != null &&
        clientContext_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.getDefaultInstance()) {
      clientContext_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.newBuilder(clientContext_).mergeFrom(value).buildPartial();
    } else {
      clientContext_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
   */
  private void clearClientContext() {  clientContext_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int GLOBAL_PAYLOAD_FIELD_NUMBER = 8;
  private com.google.protobuf.ByteString globalPayload_;
  /**
   * <pre>
   * Global payload from the previous response, possibly for another script.
   * </pre>
   *
   * <code>optional bytes global_payload = 8;</code>
   */
  public boolean hasGlobalPayload() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * Global payload from the previous response, possibly for another script.
   * </pre>
   *
   * <code>optional bytes global_payload = 8;</code>
   */
  public com.google.protobuf.ByteString getGlobalPayload() {
    return globalPayload_;
  }
  /**
   * <pre>
   * Global payload from the previous response, possibly for another script.
   * </pre>
   *
   * <code>optional bytes global_payload = 8;</code>
   */
  private void setGlobalPayload(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
    globalPayload_ = value;
  }
  /**
   * <pre>
   * Global payload from the previous response, possibly for another script.
   * </pre>
   *
   * <code>optional bytes global_payload = 8;</code>
   */
  private void clearGlobalPayload() {
    bitField0_ = (bitField0_ & ~0x00000002);
    globalPayload_ = getDefaultInstance().getGlobalPayload();
  }

  public static final int SCRIPT_PAYLOAD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString scriptPayload_;
  /**
   * <pre>
   * Script payload from the previous response, for the same script.
   * For backward compatibility, for initial requests, forward the last returned
   * script_payload.
   * </pre>
   *
   * <code>optional bytes script_payload = 2;</code>
   */
  public boolean hasScriptPayload() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * Script payload from the previous response, for the same script.
   * For backward compatibility, for initial requests, forward the last returned
   * script_payload.
   * </pre>
   *
   * <code>optional bytes script_payload = 2;</code>
   */
  public com.google.protobuf.ByteString getScriptPayload() {
    return scriptPayload_;
  }
  /**
   * <pre>
   * Script payload from the previous response, for the same script.
   * For backward compatibility, for initial requests, forward the last returned
   * script_payload.
   * </pre>
   *
   * <code>optional bytes script_payload = 2;</code>
   */
  private void setScriptPayload(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
    scriptPayload_ = value;
  }
  /**
   * <pre>
   * Script payload from the previous response, for the same script.
   * For backward compatibility, for initial requests, forward the last returned
   * script_payload.
   * </pre>
   *
   * <code>optional bytes script_payload = 2;</code>
   */
  private void clearScriptPayload() {
    bitField0_ = (bitField0_ & ~0x00000004);
    scriptPayload_ = getDefaultInstance().getScriptPayload();
  }

  public static final int INITIAL_REQUEST_FIELD_NUMBER = 4;
  /**
   * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
   */
  public boolean hasInitialRequest() {
    return requestCase_ == 4;
  }
  /**
   * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto getInitialRequest() {
    if (requestCase_ == 4) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto) request_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto.getDefaultInstance();
  }
  /**
   * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
   */
  private void setInitialRequest(org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    request_ = value;
    requestCase_ = 4;
  }
  /**
   * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
   */
  private void setInitialRequest(
      org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto.Builder builderForValue) {
    request_ = builderForValue.build();
    requestCase_ = 4;
  }
  /**
   * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
   */
  private void mergeInitialRequest(org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto value) {
    if (requestCase_ == 4 &&
        request_ != org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto.getDefaultInstance()) {
      request_ = org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto) request_)
          .mergeFrom(value).buildPartial();
    } else {
      request_ = value;
    }
    requestCase_ = 4;
  }
  /**
   * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
   */
  private void clearInitialRequest() {
    if (requestCase_ == 4) {
      requestCase_ = 0;
      request_ = null;
    }
  }

  public static final int NEXT_REQUEST_FIELD_NUMBER = 5;
  /**
   * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
   */
  public boolean hasNextRequest() {
    return requestCase_ == 5;
  }
  /**
   * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto getNextRequest() {
    if (requestCase_ == 5) {
       return (org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto) request_;
    }
    return org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto.getDefaultInstance();
  }
  /**
   * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
   */
  private void setNextRequest(org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    request_ = value;
    requestCase_ = 5;
  }
  /**
   * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
   */
  private void setNextRequest(
      org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto.Builder builderForValue) {
    request_ = builderForValue.build();
    requestCase_ = 5;
  }
  /**
   * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
   */
  private void mergeNextRequest(org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto value) {
    if (requestCase_ == 5 &&
        request_ != org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto.getDefaultInstance()) {
      request_ = org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto.newBuilder((org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto) request_)
          .mergeFrom(value).buildPartial();
    } else {
      request_ = value;
    }
    requestCase_ = 5;
  }
  /**
   * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
   */
  private void clearNextRequest() {
    if (requestCase_ == 5) {
      requestCase_ = 0;
      request_ = null;
    }
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeBytes(2, scriptPayload_);
    }
    if (requestCase_ == 4) {
      output.writeMessage(4, (org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto) request_);
    }
    if (requestCase_ == 5) {
      output.writeMessage(5, (org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto) request_);
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(7, getClientContext());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeBytes(8, globalPayload_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, scriptPayload_);
    }
    if (requestCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto) request_);
    }
    if (requestCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, (org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto) request_);
    }
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getClientContext());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(8, globalPayload_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code autofill_assistant.ScriptActionRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.ScriptActionRequestProto)
      org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    public RequestCase
        getRequestCase() {
      return instance.getRequestCase();
    }

    public Builder clearRequest() {
      copyOnWrite();
      instance.clearRequest();
      return this;
    }


    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
     */
    public boolean hasClientContext() {
      return instance.hasClientContext();
    }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto getClientContext() {
      return instance.getClientContext();
    }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
     */
    public Builder setClientContext(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto value) {
      copyOnWrite();
      instance.setClientContext(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
     */
    public Builder setClientContext(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.Builder builderForValue) {
      copyOnWrite();
      instance.setClientContext(builderForValue);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
     */
    public Builder mergeClientContext(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto value) {
      copyOnWrite();
      instance.mergeClientContext(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 7;</code>
     */
    public Builder clearClientContext() {  copyOnWrite();
      instance.clearClientContext();
      return this;
    }

    /**
     * <pre>
     * Global payload from the previous response, possibly for another script.
     * </pre>
     *
     * <code>optional bytes global_payload = 8;</code>
     */
    public boolean hasGlobalPayload() {
      return instance.hasGlobalPayload();
    }
    /**
     * <pre>
     * Global payload from the previous response, possibly for another script.
     * </pre>
     *
     * <code>optional bytes global_payload = 8;</code>
     */
    public com.google.protobuf.ByteString getGlobalPayload() {
      return instance.getGlobalPayload();
    }
    /**
     * <pre>
     * Global payload from the previous response, possibly for another script.
     * </pre>
     *
     * <code>optional bytes global_payload = 8;</code>
     */
    public Builder setGlobalPayload(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setGlobalPayload(value);
      return this;
    }
    /**
     * <pre>
     * Global payload from the previous response, possibly for another script.
     * </pre>
     *
     * <code>optional bytes global_payload = 8;</code>
     */
    public Builder clearGlobalPayload() {
      copyOnWrite();
      instance.clearGlobalPayload();
      return this;
    }

    /**
     * <pre>
     * Script payload from the previous response, for the same script.
     * For backward compatibility, for initial requests, forward the last returned
     * script_payload.
     * </pre>
     *
     * <code>optional bytes script_payload = 2;</code>
     */
    public boolean hasScriptPayload() {
      return instance.hasScriptPayload();
    }
    /**
     * <pre>
     * Script payload from the previous response, for the same script.
     * For backward compatibility, for initial requests, forward the last returned
     * script_payload.
     * </pre>
     *
     * <code>optional bytes script_payload = 2;</code>
     */
    public com.google.protobuf.ByteString getScriptPayload() {
      return instance.getScriptPayload();
    }
    /**
     * <pre>
     * Script payload from the previous response, for the same script.
     * For backward compatibility, for initial requests, forward the last returned
     * script_payload.
     * </pre>
     *
     * <code>optional bytes script_payload = 2;</code>
     */
    public Builder setScriptPayload(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setScriptPayload(value);
      return this;
    }
    /**
     * <pre>
     * Script payload from the previous response, for the same script.
     * For backward compatibility, for initial requests, forward the last returned
     * script_payload.
     * </pre>
     *
     * <code>optional bytes script_payload = 2;</code>
     */
    public Builder clearScriptPayload() {
      copyOnWrite();
      instance.clearScriptPayload();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
     */
    public boolean hasInitialRequest() {
      return instance.hasInitialRequest();
    }
    /**
     * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto getInitialRequest() {
      return instance.getInitialRequest();
    }
    /**
     * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
     */
    public Builder setInitialRequest(org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto value) {
      copyOnWrite();
      instance.setInitialRequest(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
     */
    public Builder setInitialRequest(
        org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto.Builder builderForValue) {
      copyOnWrite();
      instance.setInitialRequest(builderForValue);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
     */
    public Builder mergeInitialRequest(org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto value) {
      copyOnWrite();
      instance.mergeInitialRequest(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.InitialScriptActionsRequestProto initial_request = 4;</code>
     */
    public Builder clearInitialRequest() {
      copyOnWrite();
      instance.clearInitialRequest();
      return this;
    }

    /**
     * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
     */
    public boolean hasNextRequest() {
      return instance.hasNextRequest();
    }
    /**
     * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto getNextRequest() {
      return instance.getNextRequest();
    }
    /**
     * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
     */
    public Builder setNextRequest(org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto value) {
      copyOnWrite();
      instance.setNextRequest(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
     */
    public Builder setNextRequest(
        org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto.Builder builderForValue) {
      copyOnWrite();
      instance.setNextRequest(builderForValue);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
     */
    public Builder mergeNextRequest(org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto value) {
      copyOnWrite();
      instance.mergeNextRequest(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.NextScriptActionsRequestProto next_request = 5;</code>
     */
    public Builder clearNextRequest() {
      copyOnWrite();
      instance.clearNextRequest();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.ScriptActionRequestProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto other = (org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto) arg1;
        clientContext_ = visitor.visitMessage(clientContext_, other.clientContext_);
        globalPayload_ = visitor.visitByteString(
            hasGlobalPayload(), globalPayload_,
            other.hasGlobalPayload(), other.globalPayload_);
        scriptPayload_ = visitor.visitByteString(
            hasScriptPayload(), scriptPayload_,
            other.hasScriptPayload(), other.scriptPayload_);
        switch (other.getRequestCase()) {
          case INITIAL_REQUEST: {
            request_ = visitor.visitOneofMessage(
                requestCase_ == 4,
                request_,
                other.request_);
            break;
          }
          case NEXT_REQUEST: {
            request_ = visitor.visitOneofMessage(
                requestCase_ == 5,
                request_,
                other.request_);
            break;
          }
          case REQUEST_NOT_SET: {
            visitor.visitOneofNotSet(requestCase_ != 0);
            break;
          }
        }
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          if (other.requestCase_ != 0) {
            requestCase_ = other.requestCase_;
          }
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 18: {
                bitField0_ |= 0x00000004;
                scriptPayload_ = input.readBytes();
                break;
              }
              case 34: {
                org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto.Builder subBuilder = null;
                if (requestCase_ == 4) {
                  subBuilder = ((org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto) request_).toBuilder();
                }
                request_ =
                     input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom((org.chromium.chrome.browser.autofill_assistant.proto.InitialScriptActionsRequestProto) request_);
                  request_ = subBuilder.buildPartial();
                }
                requestCase_ = 4;
                break;
              }
              case 42: {
                org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto.Builder subBuilder = null;
                if (requestCase_ == 5) {
                  subBuilder = ((org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto) request_).toBuilder();
                }
                request_ =
                     input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom((org.chromium.chrome.browser.autofill_assistant.proto.NextScriptActionsRequestProto) request_);
                  request_ = subBuilder.buildPartial();
                }
                requestCase_ = 5;
                break;
              }
              case 58: {
                org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = clientContext_.toBuilder();
                }
                clientContext_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(clientContext_);
                  clientContext_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 66: {
                bitField0_ |= 0x00000002;
                globalPayload_ = input.readBytes();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.ScriptActionRequestProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ScriptActionRequestProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.ScriptActionRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ScriptActionRequestProto> PARSER;

  public static com.google.protobuf.Parser<ScriptActionRequestProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

