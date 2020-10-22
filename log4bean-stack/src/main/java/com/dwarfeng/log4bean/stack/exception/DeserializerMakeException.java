package com.dwarfeng.log4bean.stack.exception;

/**
 * 反序列化器构造异常。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public class DeserializerMakeException extends DeserializerException {

    private static final long serialVersionUID = 30058430189289241L;

    public DeserializerMakeException() {
    }

    public DeserializerMakeException(String message) {
        super(message);
    }

    public DeserializerMakeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeserializerMakeException(Throwable cause) {
        super(cause);
    }
}
