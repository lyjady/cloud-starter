package org.augustus.account.service.impl;


import org.augustus.account.mapper.AccountMapper;
import org.augustus.account.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @Author EiletXie
 * @Since 2020/3/18 23:31
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("account-service中扣减用户余额开始");
        accountMapper.decrease(userId,money);
        LOGGER.info("account-service中扣减用户余额结束");
    }
}
