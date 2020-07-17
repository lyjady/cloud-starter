package org.augustus.account.mapper;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author LinYongJin
 * @date 2020/7/17 16:08
 */
public interface AccountMapper {
    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
