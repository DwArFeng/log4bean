package com.dwarfeng.log4bean.stack.service;

import com.dwarfeng.log4bean.stack.bean.entity.ClazzInfo;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.service.BatchCrudService;
import com.dwarfeng.subgrade.stack.service.EntireLookupService;
import com.dwarfeng.subgrade.stack.service.PresetLookupService;

/**
 * 类型信息维护服务。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface ClazzInfoMaintainService extends BatchCrudService<StringIdKey, ClazzInfo>,
        EntireLookupService<ClazzInfo>, PresetLookupService<ClazzInfo> {

    String ID_LIKE = "id_like";
}
