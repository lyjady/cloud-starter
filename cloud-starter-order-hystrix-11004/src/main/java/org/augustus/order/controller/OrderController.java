package org.augustus.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.augustus.entries.R;
import org.augustus.order.feign.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/5/26 19:14
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @HystrixCommand(fallbackMethod = "consumerFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })
    @GetMapping("/consumer/timeout")
    public R timeout() {
        return paymentFeignService.timeout();
    }

    public R consumerFallback() {
        return R.ok().put("data", "消费者的服务降级");
    }
}
