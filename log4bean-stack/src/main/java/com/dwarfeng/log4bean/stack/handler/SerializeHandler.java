package com.dwarfeng.log4bean.stack.handler;

import com.dwarfeng.subgrade.stack.exception.HandlerException;
import com.dwarfeng.subgrade.stack.handler.Handler;

/**
 * 串行化处理器。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface SerializeHandler extends Handler {

    /**
     * 序列化指定的对象。
     *
     * @param object 指定的对象。
     * @return 指定对象的序列化字符串。
     * @throws HandlerException 处理器异常。
     */
    String serialize(Object object) throws HandlerException;

    /**
     * 根据指定的分类和指定的内容反序列化。
     *
     * @param clazz   指定的分类。
     * @param content 指定的内容。
     * @return 根据指定的分类和指定的内容反序列化成的对象。
     * @throws HandlerException 处理器异常。
     */
    Object deserialize(String clazz, String content) throws HandlerException;
}
