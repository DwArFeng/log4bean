package com.dwarfeng.log4bean.stack.handler;

import com.dwarfeng.subgrade.stack.bean.Bean;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.exception.HandlerException;
import com.dwarfeng.subgrade.stack.handler.Handler;

/**
 * 串行化本地缓存处理器。
 * <p>处理器在本地保存数据，缓存中的数据可以保证与数据源保持同步。</p>
 * <p>数据存放在本地，必要时才与数据访问层通信，这有助于程序效率的提升。</p>
 * <p>该处理器线程安全。</p>
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface SerializeLocalCacheHandler extends Handler {

    /**
     * 是否包含指定的类型。
     *
     * @param clazzKey 指定的类型。
     * @return 是否包含指定的类型。
     * @throws HandlerException 处理器异常。
     */
    boolean existsClazz(StringIdKey clazzKey) throws HandlerException;

    /**
     * 获取指定类型的串行化上下文。
     *
     * @param clazzKey 指定的类型。
     * @return 指定类型的串行化上下文，或者是null。
     * @throws HandlerException 处理器异常。
     */
    SerializeContext getSerializeContext(StringIdKey clazzKey) throws HandlerException;

    /**
     * 清除本地缓存。
     *
     * @throws HandlerException 处理器异常。
     */
    void clear() throws HandlerException;

    /**
     * 串行化上下文。
     *
     * @author DwArFeng
     * @since 1.0.0
     */
    class SerializeContext implements Bean {

        private static final long serialVersionUID = 2669541215346249396L;

        private Serializer serializer;
        private Deserializer deserializer;

        public SerializeContext() {
        }

        public SerializeContext(Serializer serializer, Deserializer deserializer) {
            this.serializer = serializer;
            this.deserializer = deserializer;
        }

        public Serializer getSerializer() {
            return serializer;
        }

        public void setSerializer(Serializer serializer) {
            this.serializer = serializer;
        }

        public Deserializer getDeserializer() {
            return deserializer;
        }

        public void setDeserializer(Deserializer deserializer) {
            this.deserializer = deserializer;
        }

        @Override
        public String toString() {
            return "SerializeContext{" +
                    "serializer=" + serializer +
                    ", deserializer=" + deserializer +
                    '}';
        }
    }
}
