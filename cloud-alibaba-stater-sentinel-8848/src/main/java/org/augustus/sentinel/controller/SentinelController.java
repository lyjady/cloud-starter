package org.augustus.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String testB() throws InterruptedException {
        return "sentinel B";
    }

    @GetMapping("/hotKey")
    @SentinelResource(value = "hotKey", blockHandler = "hotKeyHandler")
    public String hotKey(@RequestParam(required = false) String p1, @RequestParam(required = false) String p2) {
        return "----hotKey----";
    }

    public String hotKeyHandler(String p1, String p2, BlockException exception) {
        System.out.println("p1: " + p1 + ", " + "p2: " + p2);
        System.out.println(exception.getMessage());
        return "custom fallback";
    }
}
