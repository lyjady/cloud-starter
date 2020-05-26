package org.augustus.order.feign;

import org.augustus.entries.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LinYongJin
 * @date 2020/5/26 19:14
 */
@FeignClient("payment-serivce")
public interface PaymentFeignService {

    @GetMapping("/timeout")
    R timeout();
}
