package org.augustus.payment.controller;

import org.augustus.entries.R;
import org.augustus.payment.entries.Payment;
import org.augustus.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author LinYongJin
 * @date 2020/5/4 16:39
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/save")
    public R save(@RequestBody Payment payment) {
        boolean isSave = paymentService.save(payment);
        return isSave ? R.ok() : R.error(500, "出现错误请重试");
    }

    @GetMapping("/find/{id}")
    public R findById(@PathVariable Long id) {
        Payment payment = paymentService.getById(id);
        return payment != null ? R.ok().put("data", payment) : R.error(500, "没有指定的数据");
    }
}
