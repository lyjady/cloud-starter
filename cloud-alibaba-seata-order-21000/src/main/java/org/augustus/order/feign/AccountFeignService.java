package org.augustus.order.feign;

import org.augustus.entries.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author EiletXie
 * @Since 2020/3/18 21:20
 */
@FeignClient(value = "seata-account-service")
public interface AccountFeignService {

    /**
     * 减余额
     * @param userId
     * @param money
     * @return
     */
    @PostMapping(value = "/account/decrease")
    R decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
