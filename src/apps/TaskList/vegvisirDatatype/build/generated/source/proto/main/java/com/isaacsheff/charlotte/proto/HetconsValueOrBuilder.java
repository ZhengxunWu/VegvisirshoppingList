// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hetcons.proto

package com.isaacsheff.charlotte.proto;

public interface HetconsValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:charlotte.HetconsValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.charlotte.Reference block = 1;</code>
   */
  boolean hasBlock();
  /**
   * <code>.charlotte.Reference block = 1;</code>
   */
  com.isaacsheff.charlotte.proto.Reference getBlock();
  /**
   * <code>.charlotte.Reference block = 1;</code>
   */
  com.isaacsheff.charlotte.proto.ReferenceOrBuilder getBlockOrBuilder();

  /**
   * <code>int64 num = 2;</code>
   */
  long getNum();

  public com.isaacsheff.charlotte.proto.HetconsValue.ProposedContentOneofCase getProposedContentOneofCase();
}
