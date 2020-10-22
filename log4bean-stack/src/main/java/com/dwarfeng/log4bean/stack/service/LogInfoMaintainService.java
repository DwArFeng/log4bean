package com.dwarfeng.log4bean.stack.service;

import com.dwarfeng.log4bean.stack.bean.entity.LogInfo;
import com.dwarfeng.subgrade.stack.bean.key.LongIdKey;
import com.dwarfeng.subgrade.stack.service.BatchCrudService;
import com.dwarfeng.subgrade.stack.service.EntireLookupService;
import com.dwarfeng.subgrade.stack.service.PresetLookupService;

/**
 * 日志信息维护服务。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface LogInfoMaintainService extends BatchCrudService<LongIdKey, LogInfo>, EntireLookupService<LogInfo>,
        PresetLookupService<LogInfo> {

    String CHILD_FOR_CLAZZ_INFO = "child_for_clazz_info";
}
