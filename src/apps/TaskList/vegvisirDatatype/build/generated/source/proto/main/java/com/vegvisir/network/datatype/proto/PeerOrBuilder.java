// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vegvisirNetwork.proto

package com.vegvisir.network.datatype.proto;

public interface PeerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:vegvisir.network.datatype.Peer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.vegvisir.network.datatype.Identifier id = 1;</code>
   */
  boolean hasId();
  /**
   * <code>.vegvisir.network.datatype.Identifier id = 1;</code>
   */
  com.vegvisir.network.datatype.proto.Identifier getId();
  /**
   * <code>.vegvisir.network.datatype.Identifier id = 1;</code>
   */
  com.vegvisir.network.datatype.proto.IdentifierOrBuilder getIdOrBuilder();

  /**
   * <code>.vegvisir.network.datatype.Connection conn = 2;</code>
   */
  boolean hasConn();
  /**
   * <code>.vegvisir.network.datatype.Connection conn = 2;</code>
   */
  com.vegvisir.network.datatype.proto.Connection getConn();
  /**
   * <code>.vegvisir.network.datatype.Connection conn = 2;</code>
   */
  com.vegvisir.network.datatype.proto.ConnectionOrBuilder getConnOrBuilder();
}
