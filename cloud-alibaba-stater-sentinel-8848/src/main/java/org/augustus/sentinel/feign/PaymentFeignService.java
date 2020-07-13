package org.augustus.sentinel.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LinYongJin
 * @date 2020/7/13 20:40
 */
@FeignClient(value = "nacos-payment-service", fallback = PaymentFeignServiceFallback.class)
public interface PaymentFeignService {

    @GetMapping("/payment/pay")
    String payment();

}
