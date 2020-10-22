package com.dwarfeng.log4bean.stack.exception;

import com.dwarfeng.subgrade.stack.exception.HandlerException;

/**
 * 序列化器异常。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public class SerializerException extends HandlerException {

    private static final long serialVersionUID = 338683025103281168L;

    public SerializerException() {
    }

    public SerializerException(String message) {
        super(message);
    }

    public SerializerException(String message, Throwable cause) {
        super(message, cause);
    }

    public SerializerException(Throwable cause) {
        super(cause);
    }
}
