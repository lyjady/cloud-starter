package org.augustus.order.controller;

import org.augustus.entries.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author LinYongJin
 * @date 2020/5/13 21:05
 */
@RestController
@RequestMapping("/order")
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment")
    public String consul() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://payment-service/payment/consul", String.class);
        return forEntity.getBody();
    }
}
