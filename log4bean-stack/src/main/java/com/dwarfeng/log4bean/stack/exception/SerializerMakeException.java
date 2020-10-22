package com.dwarfeng.log4bean.stack.exception;

/**
 * 序列化器构造异常。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public class SerializerMakeException extends SerializerException {

    private static final long serialVersionUID = -8217077221912353253L;

    public SerializerMakeException() {
    }

    public SerializerMakeException(String message) {
        super(message);
    }

    public SerializerMakeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SerializerMakeException(Throwable cause) {
        super(cause);
    }
}
