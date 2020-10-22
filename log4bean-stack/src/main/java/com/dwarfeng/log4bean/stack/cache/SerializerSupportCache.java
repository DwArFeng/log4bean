package com.dwarfeng.log4bean.stack.cache;

import com.dwarfeng.log4bean.stack.bean.entity.SerializerSupport;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.cache.BatchBaseCache;

/**
 * 序列化器支持缓存。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface SerializerSupportCache extends BatchBaseCache<StringIdKey, SerializerSupport> {
}
