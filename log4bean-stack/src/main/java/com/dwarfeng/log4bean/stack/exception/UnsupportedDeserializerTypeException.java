package com.dwarfeng.log4bean.stack.exception;

/**
 * 不支持的反序列化器类型。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public class UnsupportedDeserializerTypeException extends DeserializerException {

    private static final long serialVersionUID = 1496767309976432977L;

    private final String type;

    public UnsupportedDeserializerTypeException(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getMessage() {
        return "不支持的反序列器类型: " + type;
    }
}
