package com.dwarfeng.log4bean.stack.dao;

import com.dwarfeng.log4bean.stack.bean.entity.LogInfo;
import com.dwarfeng.subgrade.stack.bean.key.LongIdKey;
import com.dwarfeng.subgrade.stack.dao.BatchBaseDao;
import com.dwarfeng.subgrade.stack.dao.BatchWriteDao;
import com.dwarfeng.subgrade.stack.dao.EntireLookupDao;
import com.dwarfeng.subgrade.stack.dao.PresetLookupDao;

/**
 * 日志信息数据数据访问层。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface LogInfoDao extends BatchBaseDao<LongIdKey, LogInfo>, EntireLookupDao<LogInfo>,
        PresetLookupDao<LogInfo>, BatchWriteDao<LogInfo> {
}
