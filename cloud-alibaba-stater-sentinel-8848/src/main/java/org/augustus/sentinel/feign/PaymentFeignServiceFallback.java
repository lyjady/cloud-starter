package org.augustus.sentinel.feign;

import org.springframework.stereotype.Component;

/**
 * @author LinYongJin
 * @date 2020/7/13 21:06
 */
@Component
public class PaymentFeignServiceFallback implements PaymentFeignService {

    @Override
    public String payment() {
        return "Open Feign Fall Back";
    }
}
