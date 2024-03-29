// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hetcons.proto

package com.isaacsheff.charlotte.proto;

/**
 * Protobuf enum {@code charlotte.HetconsConsensusStage}
 */
public enum HetconsConsensusStage
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Proposed = 0;</code>
   */
  Proposed(0),
  /**
   * <code>M1ASent = 1;</code>
   */
  M1ASent(1),
  /**
   * <code>M1BSent = 2;</code>
   */
  M1BSent(2),
  /**
   * <code>QuorumOfM1BReceived = 3;</code>
   */
  QuorumOfM1BReceived(3),
  /**
   * <code>M2BSent = 4;</code>
   */
  M2BSent(4),
  /**
   * <code>QuorumOfM2BReceived = 5;</code>
   */
  QuorumOfM2BReceived(5),
  /**
   * <code>HetconsTimeout = 6;</code>
   */
  HetconsTimeout(6),
  /**
   * <code>InvalidProposal = 7;</code>
   */
  InvalidProposal(7),
  /**
   * <code>ConsensusDecided = 8;</code>
   */
  ConsensusDecided(8),
  /**
   * <code>ConsensusAccepted = 9;</code>
   */
  ConsensusAccepted(9),
  /**
   * <code>ConsensusFailed = 10;</code>
   */
  ConsensusFailed(10),
  /**
   * <code>ConsensusIdile = 11;</code>
   */
  ConsensusIdile(11),
  /**
   * <code>ConsensusRestart = 12;</code>
   */
  ConsensusRestart(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Proposed = 0;</code>
   */
  public static final int Proposed_VALUE = 0;
  /**
   * <code>M1ASent = 1;</code>
   */
  public static final int M1ASent_VALUE = 1;
  /**
   * <code>M1BSent = 2;</code>
   */
  public static final int M1BSent_VALUE = 2;
  /**
   * <code>QuorumOfM1BReceived = 3;</code>
   */
  public static final int QuorumOfM1BReceived_VALUE = 3;
  /**
   * <code>M2BSent = 4;</code>
   */
  public static final int M2BSent_VALUE = 4;
  /**
   * <code>QuorumOfM2BReceived = 5;</code>
   */
  public static final int QuorumOfM2BReceived_VALUE = 5;
  /**
   * <code>HetconsTimeout = 6;</code>
   */
  public static final int HetconsTimeout_VALUE = 6;
  /**
   * <code>InvalidProposal = 7;</code>
   */
  public static final int InvalidProposal_VALUE = 7;
  /**
   * <code>ConsensusDecided = 8;</code>
   */
  public static final int ConsensusDecided_VALUE = 8;
  /**
   * <code>ConsensusAccepted = 9;</code>
   */
  public static final int ConsensusAccepted_VALUE = 9;
  /**
   * <code>ConsensusFailed = 10;</code>
   */
  public static final int ConsensusFailed_VALUE = 10;
  /**
   * <code>ConsensusIdile = 11;</code>
   */
  public static final int ConsensusIdile_VALUE = 11;
  /**
   * <code>ConsensusRestart = 12;</code>
   */
  public static final int ConsensusRestart_VALUE = 12;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static HetconsConsensusStage valueOf(int value) {
    return forNumber(value);
  }

  public static HetconsConsensusStage forNumber(int value) {
    switch (value) {
      case 0: return Proposed;
      case 1: return M1ASent;
      case 2: return M1BSent;
      case 3: return QuorumOfM1BReceived;
      case 4: return M2BSent;
      case 5: return QuorumOfM2BReceived;
      case 6: return HetconsTimeout;
      case 7: return InvalidProposal;
      case 8: return ConsensusDecided;
      case 9: return ConsensusAccepted;
      case 10: return ConsensusFailed;
      case 11: return ConsensusIdile;
      case 12: return ConsensusRestart;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HetconsConsensusStage>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HetconsConsensusStage> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HetconsConsensusStage>() {
          public HetconsConsensusStage findValueByNumber(int number) {
            return HetconsConsensusStage.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.isaacsheff.charlotte.proto.HetconsProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final HetconsConsensusStage[] VALUES = values();

  public static HetconsConsensusStage valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private HetconsConsensusStage(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:charlotte.HetconsConsensusStage)
}

