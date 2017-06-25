/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-06-18")
public class BuildJobStateTargetNode implements org.apache.thrift.TBase<BuildJobStateTargetNode, BuildJobStateTargetNode._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJobStateTargetNode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJobStateTargetNode");

  private static final org.apache.thrift.protocol.TField CELL_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("cellIndex", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RAW_NODE_FIELD_DESC = new org.apache.thrift.protocol.TField("rawNode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField BUILD_TARGET_FIELD_DESC = new org.apache.thrift.protocol.TField("buildTarget", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildJobStateTargetNodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildJobStateTargetNodeTupleSchemeFactory());
  }

  public int cellIndex; // optional
  public String rawNode; // optional
  public BuildJobStateBuildTarget buildTarget; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CELL_INDEX((short)1, "cellIndex"),
    RAW_NODE((short)2, "rawNode"),
    BUILD_TARGET((short)3, "buildTarget");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CELL_INDEX
          return CELL_INDEX;
        case 2: // RAW_NODE
          return RAW_NODE;
        case 3: // BUILD_TARGET
          return BUILD_TARGET;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CELLINDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CELL_INDEX,_Fields.RAW_NODE,_Fields.BUILD_TARGET};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CELL_INDEX, new org.apache.thrift.meta_data.FieldMetaData("cellIndex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RAW_NODE, new org.apache.thrift.meta_data.FieldMetaData("rawNode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BUILD_TARGET, new org.apache.thrift.meta_data.FieldMetaData("buildTarget", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildJobStateBuildTarget.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJobStateTargetNode.class, metaDataMap);
  }

  public BuildJobStateTargetNode() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJobStateTargetNode(BuildJobStateTargetNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.cellIndex = other.cellIndex;
    if (other.isSetRawNode()) {
      this.rawNode = other.rawNode;
    }
    if (other.isSetBuildTarget()) {
      this.buildTarget = new BuildJobStateBuildTarget(other.buildTarget);
    }
  }

  public BuildJobStateTargetNode deepCopy() {
    return new BuildJobStateTargetNode(this);
  }

  @Override
  public void clear() {
    setCellIndexIsSet(false);
    this.cellIndex = 0;
    this.rawNode = null;
    this.buildTarget = null;
  }

  public int getCellIndex() {
    return this.cellIndex;
  }

  public BuildJobStateTargetNode setCellIndex(int cellIndex) {
    this.cellIndex = cellIndex;
    setCellIndexIsSet(true);
    return this;
  }

  public void unsetCellIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CELLINDEX_ISSET_ID);
  }

  /** Returns true if field cellIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetCellIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __CELLINDEX_ISSET_ID);
  }

  public void setCellIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CELLINDEX_ISSET_ID, value);
  }

  public String getRawNode() {
    return this.rawNode;
  }

  public BuildJobStateTargetNode setRawNode(String rawNode) {
    this.rawNode = rawNode;
    return this;
  }

  public void unsetRawNode() {
    this.rawNode = null;
  }

  /** Returns true if field rawNode is set (has been assigned a value) and false otherwise */
  public boolean isSetRawNode() {
    return this.rawNode != null;
  }

  public void setRawNodeIsSet(boolean value) {
    if (!value) {
      this.rawNode = null;
    }
  }

  public BuildJobStateBuildTarget getBuildTarget() {
    return this.buildTarget;
  }

  public BuildJobStateTargetNode setBuildTarget(BuildJobStateBuildTarget buildTarget) {
    this.buildTarget = buildTarget;
    return this;
  }

  public void unsetBuildTarget() {
    this.buildTarget = null;
  }

  /** Returns true if field buildTarget is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildTarget() {
    return this.buildTarget != null;
  }

  public void setBuildTargetIsSet(boolean value) {
    if (!value) {
      this.buildTarget = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CELL_INDEX:
      if (value == null) {
        unsetCellIndex();
      } else {
        setCellIndex((Integer)value);
      }
      break;

    case RAW_NODE:
      if (value == null) {
        unsetRawNode();
      } else {
        setRawNode((String)value);
      }
      break;

    case BUILD_TARGET:
      if (value == null) {
        unsetBuildTarget();
      } else {
        setBuildTarget((BuildJobStateBuildTarget)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CELL_INDEX:
      return getCellIndex();

    case RAW_NODE:
      return getRawNode();

    case BUILD_TARGET:
      return getBuildTarget();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CELL_INDEX:
      return isSetCellIndex();
    case RAW_NODE:
      return isSetRawNode();
    case BUILD_TARGET:
      return isSetBuildTarget();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJobStateTargetNode)
      return this.equals((BuildJobStateTargetNode)that);
    return false;
  }

  public boolean equals(BuildJobStateTargetNode that) {
    if (that == null)
      return false;

    boolean this_present_cellIndex = true && this.isSetCellIndex();
    boolean that_present_cellIndex = true && that.isSetCellIndex();
    if (this_present_cellIndex || that_present_cellIndex) {
      if (!(this_present_cellIndex && that_present_cellIndex))
        return false;
      if (this.cellIndex != that.cellIndex)
        return false;
    }

    boolean this_present_rawNode = true && this.isSetRawNode();
    boolean that_present_rawNode = true && that.isSetRawNode();
    if (this_present_rawNode || that_present_rawNode) {
      if (!(this_present_rawNode && that_present_rawNode))
        return false;
      if (!this.rawNode.equals(that.rawNode))
        return false;
    }

    boolean this_present_buildTarget = true && this.isSetBuildTarget();
    boolean that_present_buildTarget = true && that.isSetBuildTarget();
    if (this_present_buildTarget || that_present_buildTarget) {
      if (!(this_present_buildTarget && that_present_buildTarget))
        return false;
      if (!this.buildTarget.equals(that.buildTarget))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cellIndex = true && (isSetCellIndex());
    list.add(present_cellIndex);
    if (present_cellIndex)
      list.add(cellIndex);

    boolean present_rawNode = true && (isSetRawNode());
    list.add(present_rawNode);
    if (present_rawNode)
      list.add(rawNode);

    boolean present_buildTarget = true && (isSetBuildTarget());
    list.add(present_buildTarget);
    if (present_buildTarget)
      list.add(buildTarget);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildJobStateTargetNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCellIndex()).compareTo(other.isSetCellIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCellIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cellIndex, other.cellIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRawNode()).compareTo(other.isSetRawNode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRawNode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rawNode, other.rawNode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildTarget()).compareTo(other.isSetBuildTarget());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildTarget()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildTarget, other.buildTarget);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuildJobStateTargetNode(");
    boolean first = true;

    if (isSetCellIndex()) {
      sb.append("cellIndex:");
      sb.append(this.cellIndex);
      first = false;
    }
    if (isSetRawNode()) {
      if (!first) sb.append(", ");
      sb.append("rawNode:");
      if (this.rawNode == null) {
        sb.append("null");
      } else {
        sb.append(this.rawNode);
      }
      first = false;
    }
    if (isSetBuildTarget()) {
      if (!first) sb.append(", ");
      sb.append("buildTarget:");
      if (this.buildTarget == null) {
        sb.append("null");
      } else {
        sb.append(this.buildTarget);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (buildTarget != null) {
      buildTarget.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildJobStateTargetNodeStandardSchemeFactory implements SchemeFactory {
    public BuildJobStateTargetNodeStandardScheme getScheme() {
      return new BuildJobStateTargetNodeStandardScheme();
    }
  }

  private static class BuildJobStateTargetNodeStandardScheme extends StandardScheme<BuildJobStateTargetNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJobStateTargetNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CELL_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cellIndex = iprot.readI32();
              struct.setCellIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RAW_NODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rawNode = iprot.readString();
              struct.setRawNodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BUILD_TARGET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buildTarget = new BuildJobStateBuildTarget();
              struct.buildTarget.read(iprot);
              struct.setBuildTargetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJobStateTargetNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetCellIndex()) {
        oprot.writeFieldBegin(CELL_INDEX_FIELD_DESC);
        oprot.writeI32(struct.cellIndex);
        oprot.writeFieldEnd();
      }
      if (struct.rawNode != null) {
        if (struct.isSetRawNode()) {
          oprot.writeFieldBegin(RAW_NODE_FIELD_DESC);
          oprot.writeString(struct.rawNode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.buildTarget != null) {
        if (struct.isSetBuildTarget()) {
          oprot.writeFieldBegin(BUILD_TARGET_FIELD_DESC);
          struct.buildTarget.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobStateTargetNodeTupleSchemeFactory implements SchemeFactory {
    public BuildJobStateTargetNodeTupleScheme getScheme() {
      return new BuildJobStateTargetNodeTupleScheme();
    }
  }

  private static class BuildJobStateTargetNodeTupleScheme extends TupleScheme<BuildJobStateTargetNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJobStateTargetNode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCellIndex()) {
        optionals.set(0);
      }
      if (struct.isSetRawNode()) {
        optionals.set(1);
      }
      if (struct.isSetBuildTarget()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCellIndex()) {
        oprot.writeI32(struct.cellIndex);
      }
      if (struct.isSetRawNode()) {
        oprot.writeString(struct.rawNode);
      }
      if (struct.isSetBuildTarget()) {
        struct.buildTarget.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJobStateTargetNode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.cellIndex = iprot.readI32();
        struct.setCellIndexIsSet(true);
      }
      if (incoming.get(1)) {
        struct.rawNode = iprot.readString();
        struct.setRawNodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.buildTarget = new BuildJobStateBuildTarget();
        struct.buildTarget.read(iprot);
        struct.setBuildTargetIsSet(true);
      }
    }
  }

}

