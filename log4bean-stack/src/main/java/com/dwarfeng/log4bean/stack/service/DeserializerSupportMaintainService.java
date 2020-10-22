package com.dwarfeng.log4bean.stack.service;

import com.dwarfeng.log4bean.stack.bean.entity.DeserializerSupport;
import com.dwarfeng.subgrade.stack.bean.key.StringIdKey;
import com.dwarfeng.subgrade.stack.exception.ServiceException;
import com.dwarfeng.subgrade.stack.service.CrudService;
import com.dwarfeng.subgrade.stack.service.EntireLookupService;
import com.dwarfeng.subgrade.stack.service.PresetLookupService;

/**
 * 反序列化器支持维护服务。
 *
 * @author DwArFeng
 * @since 1.0.0
 */
public interface DeserializerSupportMaintainService extends CrudService<StringIdKey, DeserializerSupport>,
        EntireLookupService<DeserializerSupport>, PresetLookupService<DeserializerSupport> {

    String ID_LIKE = "id_like";

    /**
     * 重置反序列化器支持。
     *
     * @throws ServiceException 服务异常。
     */
    void reset() throws ServiceException;
}
