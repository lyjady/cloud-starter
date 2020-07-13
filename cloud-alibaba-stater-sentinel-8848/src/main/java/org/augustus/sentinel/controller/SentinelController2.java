package org.augustus.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import org.augustus.sentinel.feign.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/7/13 20:33
 */
@RestController
public class SentinelController2 {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/ignore")
    @SentinelResource(value = "ignore", blockHandler = "ignoreBlockHandler", fallback = "ignoreFallback", exceptionsToIgnore = IllegalArgumentException.class)
    public String ignoreException(int code) {
        if (code == 1) {
            throw new NullPointerException();
        } else if (code == 2) {
            throw new IllegalArgumentException();
        }
        return "ignore exception";
    }

    public String ignoreFallback(int code) {
        return "ignoreException fallback";
    }

    public String ignoreBlockHandler(int code, BlockException e) {
        return "ignoreException block";
    }

    @GetMapping("/consumer/payment")
    public String payment() {
        return paymentFeignService.payment();
    }
}
