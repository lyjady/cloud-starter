package org.augustus.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/6/9 10:25
 */
@RestController
@RequestMapping("/client")
@RefreshScope
public class ConfigController {

//    @Value("${dev}")
//    private String dev;

    @Value("${config.info}")
    private String prod;

//    @GetMapping("/dev")
//    public String dev() {
//        return dev;
//    }

    @GetMapping("/prod")
    public String prod() {
        return prod;
    }
}
