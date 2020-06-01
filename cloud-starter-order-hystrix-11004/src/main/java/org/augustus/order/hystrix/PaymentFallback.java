package org.augustus.order.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.augustus.entries.R;
import org.augustus.order.feign.PaymentFeignService;
import org.springframework.stereotype.Component;

/**
 * @author LinYongJin
 * @date 2020/6/1 8:55
 */
@Component
public class PaymentFallback implements PaymentFeignService {

    @Override
    public R timeout() {
        return R.ok().put("data", "feign fallback");
    }
}
