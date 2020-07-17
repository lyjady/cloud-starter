package org.augustus.order.controller;


import org.augustus.entries.R;
import org.augustus.order.domain.Order;
import org.augustus.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author EiletXie
 * @Since 2020/3/18 21:15
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    /**
     * 创建订单
     *
     * @param order
     * @return
     */
    @GetMapping("/order/create")
    public R create(Order order) {
        orderService.create(order);
        return R.ok();
    }

}
