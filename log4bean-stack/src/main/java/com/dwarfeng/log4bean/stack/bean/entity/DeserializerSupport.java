package com.dwarfeng.log4bean.stack.bean.entity;

import com.dwarfeng.subgrade.stack.bean.entity.Entity;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;

/**
 * 反序列化器支持。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public class DeserializerSupport implements Entity<StringIdKey> {

    private static final long serialVersionUID = -7913071737417041594L;

    private StringIdKey key;
    private String label;
    private String description;

    public DeserializerSupport() {
    }

    public DeserializerSupport(StringIdKey key, String label, String description) {
        this.key = key;
        this.label = label;
        this.description = description;
    }

    @Override
    public StringIdKey getKey() {
        return key;
    }

    @Override
    public void setKey(StringIdKey key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DeserializerSupport{" +
                "key=" + key +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
