package org.augustus.order.controller;

import org.augustus.entries.R;
import org.augustus.to.PaymentTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author LinYongJin
 * @date 2020/5/4 17:16
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/consumer/save/payment")
    public R savePaymentInfo(@RequestBody PaymentTo payment) {
        ResponseEntity<R> entity = restTemplate.postForEntity("http://localhost:10000/payment/save", payment, R.class);
        return entity.getBody();
    }

    @GetMapping("/consumer/find/payment/{id}")
    public R findPayment(@PathVariable Long id) {
        return restTemplate.getForObject("http://localhost:10000/payment/find/" + id, R.class);
    }
}
