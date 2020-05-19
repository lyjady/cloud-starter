package org.augustus.order.feign;

import org.augustus.entries.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LinYongJin
 * @date 2020/5/19 10:45
 */
@FeignClient("payment-service")
public interface PaymentFeignService {

    @GetMapping("/payment/feignPort")
    R feignOrder();
}
