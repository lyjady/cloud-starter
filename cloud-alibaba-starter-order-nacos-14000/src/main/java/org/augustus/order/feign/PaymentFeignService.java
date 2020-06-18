package org.augustus.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LinYongJin
 * @date 2020/6/18 21:11
 */
@FeignClient("nacos-payment-service")
public interface PaymentFeignService {

    @RequestMapping("/payment/pay")
    String pay();
}
