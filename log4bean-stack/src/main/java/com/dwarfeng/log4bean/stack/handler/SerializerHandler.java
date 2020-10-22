package com.dwarfeng.log4bean.stack.handler;

import com.dwarfeng.subgrade.stack.exception.HandlerException;
import com.dwarfeng.subgrade.stack.handler.Handler;

/**
 * 序列化处理器。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface SerializerHandler extends Handler {

    /**
     * 根据指定的类型构造一个序列化器。
     *
     * @param type 指定的类型。
     * @return 根据指定的类型生成的序列化器。
     * @throws HandlerException 处理器异常。
     */
    Serializer make(String type) throws HandlerException;
}
