package com.dwarfeng.log4bean.stack.cache;

import com.dwarfeng.log4bean.stack.bean.entity.ClazzInfo;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.cache.BatchBaseCache;

/**
 * 类型信息缓存。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface ClazzInfoCache extends BatchBaseCache<StringIdKey, ClazzInfo> {
}
