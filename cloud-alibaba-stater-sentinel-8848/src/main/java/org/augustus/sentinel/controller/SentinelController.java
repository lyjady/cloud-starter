package org.augustus.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author LinYongJin
 * @date 2020/6/29 11:35
 */
@RestController
@RequestMapping("/sentinel")
public class SentinelController {

    @GetMapping("/a")
    public String testA() throws InterruptedException {
        return "sentinel A";
    }

    @GetMapping("/b")
    public String testB() {
        return "sentinel B";
    }
}
