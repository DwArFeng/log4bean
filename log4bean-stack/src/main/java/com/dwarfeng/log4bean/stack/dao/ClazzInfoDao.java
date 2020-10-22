package com.dwarfeng.log4bean.stack.dao;

import com.dwarfeng.log4bean.stack.bean.entity.ClazzInfo;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.dao.BatchBaseDao;
import com.dwarfeng.subgrade.stack.dao.EntireLookupDao;
import com.dwarfeng.subgrade.stack.dao.PresetLookupDao;

/**
 * 类型器信息数据访问层。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface ClazzInfoDao extends BatchBaseDao<StringIdKey, ClazzInfo>, EntireLookupDao<ClazzInfo>,
        PresetLookupDao<ClazzInfo> {
}
