// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vegvisirNetwork.proto

package com.vegvisir.network.datatype.proto;

public interface PeerViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:vegvisir.network.datatype.PeerView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .vegvisir.network.datatype.Peer active_peers = 1;</code>
   */
  java.util.List<com.vegvisir.network.datatype.proto.Peer> 
      getActivePeersList();
  /**
   * <code>repeated .vegvisir.network.datatype.Peer active_peers = 1;</code>
   */
  com.vegvisir.network.datatype.proto.Peer getActivePeers(int index);
  /**
   * <code>repeated .vegvisir.network.datatype.Peer active_peers = 1;</code>
   */
  int getActivePeersCount();
  /**
   * <code>repeated .vegvisir.network.datatype.Peer active_peers = 1;</code>
   */
  java.util.List<? extends com.vegvisir.network.datatype.proto.PeerOrBuilder> 
      getActivePeersOrBuilderList();
  /**
   * <code>repeated .vegvisir.network.datatype.Peer active_peers = 1;</code>
   */
  com.vegvisir.network.datatype.proto.PeerOrBuilder getActivePeersOrBuilder(
      int index);

  /**
   * <code>repeated .vegvisir.network.datatype.Peer connected_peers = 2;</code>
   */
  java.util.List<com.vegvisir.network.datatype.proto.Peer> 
      getConnectedPeersList();
  /**
   * <code>repeated .vegvisir.network.datatype.Peer connected_peers = 2;</code>
   */
  com.vegvisir.network.datatype.proto.Peer getConnectedPeers(int index);
  /**
   * <code>repeated .vegvisir.network.datatype.Peer connected_peers = 2;</code>
   */
  int getConnectedPeersCount();
  /**
   * <code>repeated .vegvisir.network.datatype.Peer connected_peers = 2;</code>
   */
  java.util.List<? extends com.vegvisir.network.datatype.proto.PeerOrBuilder> 
      getConnectedPeersOrBuilderList();
  /**
   * <code>repeated .vegvisir.network.datatype.Peer connected_peers = 2;</code>
   */
  com.vegvisir.network.datatype.proto.PeerOrBuilder getConnectedPeersOrBuilder(
      int index);
}