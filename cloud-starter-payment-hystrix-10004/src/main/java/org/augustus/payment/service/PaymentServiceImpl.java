package org.augustus.payment.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.augustus.entries.R;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author LinYongJin
 * @date 2020/5/19 19:25
 */
@Service
@DefaultProperties(defaultFallback = "defaultFallback", commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
})
public class PaymentServiceImpl {

    public R ok() {
        return R.ok();
    }

//    @HystrixCommand(fallbackMethod = "fallback", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
    @HystrixCommand
    public R timeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return R.ok();
    }

    public R fallback() {
        return R.ok().put("data", "服务降级");
    }

    public R defaultFallback() {
        return R.ok().put("data", "默认服务降级");
    }
}
