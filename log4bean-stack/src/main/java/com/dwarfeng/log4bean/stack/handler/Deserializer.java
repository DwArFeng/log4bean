package com.dwarfeng.log4bean.stack.handler;

import com.dwarfeng.log4bean.stack.exception.DeserializerException;

/**
 * 反序列化器。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface Deserializer {

    /**
     * 根据指定的分类和指定的内容反序列化。
     *
     * @param clazz   指定的分类。
     * @param content 指定的内容。
     * @return 根据指定的分类和指定的内容反序列化成的对象。
     * @throws DeserializerException 反序列化器异常。
     */
    Object deserialize(String clazz, String content) throws DeserializerException;
}
