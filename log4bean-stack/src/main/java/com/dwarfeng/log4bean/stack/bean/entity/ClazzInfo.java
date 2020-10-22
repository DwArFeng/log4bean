package com.dwarfeng.log4bean.stack.bean.entity;

import com.dwarfeng.subgrade.stack.bean.entity.Entity;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;

/**
 * 类型信息。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public class ClazzInfo implements Entity<StringIdKey> {

    private static final long serialVersionUID = 8007646841109568881L;

    private StringIdKey key;
    private String serializerType;
    private String deserializerType;
    private String remark;

    public ClazzInfo() {
    }

    public ClazzInfo(StringIdKey key, String serializerType, String deserializerType, String remark) {
        this.key = key;
        this.serializerType = serializerType;
        this.deserializerType = deserializerType;
        this.remark = remark;
    }

    @Override
    public StringIdKey getKey() {
        return key;
    }

    @Override
    public void setKey(StringIdKey key) {
        this.key = key;
    }

    public String getSerializerType() {
        return serializerType;
    }

    public void setSerializerType(String serializerType) {
        this.serializerType = serializerType;
    }

    public String getDeserializerType() {
        return deserializerType;
    }

    public void setDeserializerType(String deserializerType) {
        this.deserializerType = deserializerType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "ClazzInfo{" +
                "key=" + key +
                ", serializerType='" + serializerType + '\'' +
                ", deserializerType='" + deserializerType + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
