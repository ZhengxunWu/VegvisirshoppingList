// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hetcons.proto

package com.isaacsheff.charlotte.proto;

public interface HetconsMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:charlotte.HetconsMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.charlotte.HetconsMessageType type = 4;</code>
   */
  int getTypeValue();
  /**
   * <code>.charlotte.HetconsMessageType type = 4;</code>
   */
  com.isaacsheff.charlotte.proto.HetconsMessageType getType();

  /**
   * <code>.charlotte.HetconsMessage1a m1a = 1;</code>
   */
  boolean hasM1A();
  /**
   * <code>.charlotte.HetconsMessage1a m1a = 1;</code>
   */
  com.isaacsheff.charlotte.proto.HetconsMessage1a getM1A();
  /**
   * <code>.charlotte.HetconsMessage1a m1a = 1;</code>
   */
  com.isaacsheff.charlotte.proto.HetconsMessage1aOrBuilder getM1AOrBuilder();

  /**
   * <code>.charlotte.HetconsMessage1b m1b = 2;</code>
   */
  boolean hasM1B();
  /**
   * <code>.charlotte.HetconsMessage1b m1b = 2;</code>
   */
  com.isaacsheff.charlotte.proto.HetconsMessage1b getM1B();
  /**
   * <code>.charlotte.HetconsMessage1b m1b = 2;</code>
   */
  com.isaacsheff.charlotte.proto.HetconsMessage1bOrBuilder getM1BOrBuilder();

  /**
   * <code>.charlotte.HetconsMessage2ab m2b = 3;</code>
   */
  boolean hasM2B();
  /**
   * <code>.charlotte.HetconsMessage2ab m2b = 3;</code>
   */
  com.isaacsheff.charlotte.proto.HetconsMessage2ab getM2B();
  /**
   * <code>.charlotte.HetconsMessage2ab m2b = 3;</code>
   */
  com.isaacsheff.charlotte.proto.HetconsMessage2abOrBuilder getM2BOrBuilder();

  /**
   * <code>.charlotte.HetconsObserverGroup observerGroup = 5;</code>
   */
  boolean hasObserverGroup();
  /**
   * <code>.charlotte.HetconsObserverGroup observerGroup = 5;</code>
   */
  com.isaacsheff.charlotte.proto.HetconsObserverGroup getObserverGroup();
  /**
   * <code>.charlotte.HetconsObserverGroup observerGroup = 5;</code>
   */
  com.isaacsheff.charlotte.proto.HetconsObserverGroupOrBuilder getObserverGroupOrBuilder();

  /**
   * <code>.charlotte.Reference observerGroupReferecne = 10;</code>
   */
  boolean hasObserverGroupReferecne();
  /**
   * <code>.charlotte.Reference observerGroupReferecne = 10;</code>
   */
  com.isaacsheff.charlotte.proto.Reference getObserverGroupReferecne();
  /**
   * <code>.charlotte.Reference observerGroupReferecne = 10;</code>
   */
  com.isaacsheff.charlotte.proto.ReferenceOrBuilder getObserverGroupReferecneOrBuilder();

  /**
   * <code>.charlotte.CryptoId identity = 8;</code>
   */
  boolean hasIdentity();
  /**
   * <code>.charlotte.CryptoId identity = 8;</code>
   */
  com.isaacsheff.charlotte.proto.CryptoId getIdentity();
  /**
   * <code>.charlotte.CryptoId identity = 8;</code>
   */
  com.isaacsheff.charlotte.proto.CryptoIdOrBuilder getIdentityOrBuilder();

  public com.isaacsheff.charlotte.proto.HetconsMessage.HetconsMessageTypeOneofCase getHetconsMessageTypeOneofCase();
}