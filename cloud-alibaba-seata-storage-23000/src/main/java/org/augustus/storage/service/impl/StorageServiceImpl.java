package org.augustus.storage.service.impl;

import org.augustus.storage.mapper.StorageMapper;
import org.augustus.storage.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author EiletXie
 * @Since 2020/3/18 23:06
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("中扣减库存开始");
        storageMapper.decrease(productId,count);
        LOGGER.info("中扣减库存结束");
    }
}
