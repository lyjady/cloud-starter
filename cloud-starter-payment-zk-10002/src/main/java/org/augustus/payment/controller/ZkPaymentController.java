package org.augustus.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author LinYongJin
 * @date 2020/5/8 22:26
 */
@RestController
@RequestMapping("/payment")
public class ZkPaymentController {

    @GetMapping("/zk")
    public String zk() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
