package org.augustus.consul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author LinYongJin
 * @date 2020/5/13 20:58
 */
@RequestMapping("/payment")
@RestController
public class Controller {

    @Value("${server.port}")
    private String port;

    @GetMapping("/consul")
    public String payment() {
        return port + "-consul-" + UUID.randomUUID().toString().replaceAll("-", "");
    }
}
