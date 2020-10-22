package com.dwarfeng.log4bean.stack.exception;

/**
 * 不支持的序列化器类型。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public class UnsupportedSerializerTypeException extends SerializerException {

    private static final long serialVersionUID = -5274173776940137092L;

    private final String type;

    public UnsupportedSerializerTypeException(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getMessage() {
        return "不支持的序列化器类型: " + type;
    }
}
