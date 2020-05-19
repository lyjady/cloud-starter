package org.augustus.payment.service;

import org.augustus.entries.R;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author LinYongJin
 * @date 2020/5/19 19:25
 */
@Service
public class PaymentServiceImpl {

    public R ok() {
        return R.ok();
    }

    public R timeout() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return R.ok();
    }
}
