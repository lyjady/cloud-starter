package org.augustus.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinYongJin
 * @date 2020/6/23 10:53
 */
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/info")
    public String info() {
        return info;
    }
}
