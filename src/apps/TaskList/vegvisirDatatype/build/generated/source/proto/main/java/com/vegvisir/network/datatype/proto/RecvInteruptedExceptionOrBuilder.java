// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vegvisirNetwork.proto

package com.vegvisir.network.datatype.proto;

public interface RecvInteruptedExceptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:vegvisir.network.datatype.RecvInteruptedException)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.vegvisir.network.datatype.ConnectionLostException lost_connection = 1;</code>
   */
  boolean hasLostConnection();
  /**
   * <code>.vegvisir.network.datatype.ConnectionLostException lost_connection = 1;</code>
   */
  com.vegvisir.network.datatype.proto.ConnectionLostException getLostConnection();
  /**
   * <code>.vegvisir.network.datatype.ConnectionLostException lost_connection = 1;</code>
   */
  com.vegvisir.network.datatype.proto.ConnectionLostExceptionOrBuilder getLostConnectionOrBuilder();

  public com.vegvisir.network.datatype.proto.RecvInteruptedException.ExceptionTypeOneofCase getExceptionTypeOneofCase();
}
