package org.augustus.order.controller;

import org.augustus.order.feign.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/6/18 21:12
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/pay")
    public String order() {
        return paymentFeignService.pay();
    }
}
