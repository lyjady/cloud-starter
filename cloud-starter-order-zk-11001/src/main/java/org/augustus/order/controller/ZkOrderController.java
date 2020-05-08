package org.augustus.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author LinYongJin
 * @date 2020/5/8 22:25
 */
@RestController
@RequestMapping("/order")
public class ZkOrderController {

    @Autowired
    private RestTemplate restTemplate;

    private final String SERVICE_NAME = "http://payment-service";

    @GetMapping("/consumer/zk")
    public String zk() {
        return restTemplate.getForObject(SERVICE_NAME + "/payment/zk", String.class);
    }
}
