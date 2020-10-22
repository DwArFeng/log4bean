package com.dwarfeng.log4bean.stack.handler;

import com.dwarfeng.log4bean.stack.exception.SerializerException;

/**
 * 序列化器。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface Serializer {

    /**
     * 序列化指定的对象。
     *
     * @param object 指定的对象。
     * @return 指定对象的序列化字符串。
     * @throws SerializerException 序列化器异常。
     */
    String serialize(Object object) throws SerializerException;
}
