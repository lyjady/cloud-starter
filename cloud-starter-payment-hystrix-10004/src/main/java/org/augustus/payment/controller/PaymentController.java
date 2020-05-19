package org.augustus.payment.controller;

import org.augustus.entries.R;
import org.augustus.payment.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/5/19 19:25
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;

    @GetMapping("/ok")
    public R ok() {
        return paymentService.ok();
    }

    @GetMapping("/timeout")
    public R timeout() {
        return paymentService.timeout();
    }
}
