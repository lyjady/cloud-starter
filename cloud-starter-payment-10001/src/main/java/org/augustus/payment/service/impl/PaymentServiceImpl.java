package org.augustus.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.augustus.payment.entries.Payment;
import org.augustus.payment.mapper.PaymentMapper;
import org.augustus.payment.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author LinYongJin
 * @date 2020/5/4 16:38
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
