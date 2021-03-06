package com.dwarfeng.log4bean.stack.dao;

import com.dwarfeng.log4bean.stack.bean.entity.DeserializerSupport;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.dao.BaseDao;
import com.dwarfeng.subgrade.stack.dao.EntireLookupDao;
import com.dwarfeng.subgrade.stack.dao.PresetLookupDao;

/**
 * 反序列化器支持数据访问层。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface DeserializerSupportDao extends BaseDao<StringIdKey, DeserializerSupport>,
        EntireLookupDao<DeserializerSupport>, PresetLookupDao<DeserializerSupport> {
}
