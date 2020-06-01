package org.augustus.payment.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.augustus.entries.R;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author LinYongJin
 * @date 2020/6/1 9:58
 */
@Service
@DefaultProperties(defaultFallback = "handle", commandProperties = {
        // 开启断路器
        @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
        // 时间窗口期内的请求阈值
        @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
        // 时间窗口期
        @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "60000"),
        // 错误率
        @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),
})
public class PayServiceImpl {

    @HystrixCommand
    public R circuitBreaker(int num) {
        if (num < 0) {
            throw new RuntimeException("请输入正数!!!!");
        }
        return R.ok().put("data", UUID.randomUUID().toString().replaceAll("-", ""));
    }

    @HystrixCommand
    public R common() {
        return R.ok().put("data", "炮灰的通用方法");
    }

    public R handle() {
        return R.ok().put("data", " 发生了错误!!!");
    }
}
