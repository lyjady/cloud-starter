package org.augustus.order.feign;

import org.augustus.entries.R;
import org.augustus.order.hystrix.PaymentFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LinYongJin
 * @date 2020/5/26 19:14
 */
@FeignClient(value = "payment-service", fallback = PaymentFallback.class)
public interface PaymentFeignService {

    @GetMapping("/payment/timeout")
    R timeout();
}
