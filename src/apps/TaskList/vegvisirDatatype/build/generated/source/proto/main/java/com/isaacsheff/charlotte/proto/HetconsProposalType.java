// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hetcons.proto

package com.isaacsheff.charlotte.proto;

/**
 * Protobuf enum {@code charlotte.HetconsProposalType}
 */
public enum HetconsProposalType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BlockSlot = 0;</code>
   */
  BlockSlot(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BlockSlot = 0;</code>
   */
  public static final int BlockSlot_VALUE = 0;


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
  public static HetconsProposalType valueOf(int value) {
    return forNumber(value);
  }

  public static HetconsProposalType forNumber(int value) {
    switch (value) {
      case 0: return BlockSlot;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HetconsProposalType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HetconsProposalType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HetconsProposalType>() {
          public HetconsProposalType findValueByNumber(int number) {
            return HetconsProposalType.forNumber(number);
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
    return com.isaacsheff.charlotte.proto.HetconsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final HetconsProposalType[] VALUES = values();

  public static HetconsProposalType valueOf(
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

  private HetconsProposalType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:charlotte.HetconsProposalType)
}

