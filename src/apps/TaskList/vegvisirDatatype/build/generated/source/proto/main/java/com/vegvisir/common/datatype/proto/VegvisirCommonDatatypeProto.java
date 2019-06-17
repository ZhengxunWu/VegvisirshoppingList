// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vegvisirCommon.proto

package com.vegvisir.common.datatype.proto;

public final class VegvisirCommonDatatypeProto {
  private VegvisirCommonDatatypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vegvisir_common_datatype_ProtocolVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vegvisir_common_datatype_ProtocolVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vegvisir_common_datatype_Timestamp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vegvisir_common_datatype_Timestamp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vegvisir_common_datatype_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vegvisir_common_datatype_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vegvisir_common_datatype_LocationRequestResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vegvisir_common_datatype_LocationRequestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_vegvisir_common_datatype_LocationServiceNotAvailableException_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_vegvisir_common_datatype_LocationServiceNotAvailableException_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024vegvisirCommon.proto\022\030vegvisir.common." +
      "datatype\">\n\017ProtocolVersion\022\r\n\005major\030\001 \001" +
      "(\005\022\r\n\005minor\030\002 \001(\005\022\r\n\005patch\030\003 \001(\005\"3\n\tTime" +
      "stamp\022\020\n\010utc_time\030\001 \001(\003\022\024\n\014elapsed_time\030" +
      "\002 \001(\003\"y\n\010Location\022\021\n\tlongitude\030\001 \001(\002\022\020\n\010" +
      "latitude\030\002 \001(\002\022\020\n\010altitude\030\003 \001(\002\0226\n\ttime" +
      "stamp\030\004 \001(\0132#.vegvisir.common.datatype.T" +
      "imestamp\"{\n\027LocationRequestResponse\0226\n\010l" +
      "ocation\030\001 \001(\0132\".vegvisir.common.datatype" +
      ".LocationH\000\022\027\n\rerror_message\030\002 \001(\tH\000B\017\n\r" +
      "content_oneof\"=\n$LocationServiceNotAvail" +
      "ableException\022\025\n\rerror_message\030\001 \001(\t*H\n\r" +
      "ControlSignal\022\013\n\007VERSION\020\000\022\016\n\nADD_BLOCKS" +
      "\020\001\022\020\n\014VECTOR_CLOCK\020\002\022\010\n\004PULL\020\003BN\n\"com.ve" +
      "gvisir.common.datatype.protoB\033VegvisirCo" +
      "mmonDatatypeProtoP\001\242\002\010VEGVISIRb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_vegvisir_common_datatype_ProtocolVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_vegvisir_common_datatype_ProtocolVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vegvisir_common_datatype_ProtocolVersion_descriptor,
        new java.lang.String[] { "Major", "Minor", "Patch", });
    internal_static_vegvisir_common_datatype_Timestamp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_vegvisir_common_datatype_Timestamp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vegvisir_common_datatype_Timestamp_descriptor,
        new java.lang.String[] { "UtcTime", "ElapsedTime", });
    internal_static_vegvisir_common_datatype_Location_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_vegvisir_common_datatype_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vegvisir_common_datatype_Location_descriptor,
        new java.lang.String[] { "Longitude", "Latitude", "Altitude", "Timestamp", });
    internal_static_vegvisir_common_datatype_LocationRequestResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_vegvisir_common_datatype_LocationRequestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vegvisir_common_datatype_LocationRequestResponse_descriptor,
        new java.lang.String[] { "Location", "ErrorMessage", "ContentOneof", });
    internal_static_vegvisir_common_datatype_LocationServiceNotAvailableException_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_vegvisir_common_datatype_LocationServiceNotAvailableException_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_vegvisir_common_datatype_LocationServiceNotAvailableException_descriptor,
        new java.lang.String[] { "ErrorMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}