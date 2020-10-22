package com.dwarfeng.log4bean.stack.exception;

import com.dwarfeng.subgrade.stack.exception.HandlerException;

/**
 * 反序列化器异常。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public class DeserializerException extends HandlerException {

    private static final long serialVersionUID = -1789761257873208519L;

    public DeserializerException() {
    }

    public DeserializerException(String message) {
        super(message);
    }

    public DeserializerException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeserializerException(Throwable cause) {
        super(cause);
    }
}
