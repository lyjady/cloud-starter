package org.augustus.payment.handler;

import org.augustus.entries.R;
import org.augustus.exception.CloudException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author LinYongJin
 * @date 2020/5/4 16:48
 */
@ControllerAdvice
public class PaymentExceptionHandler {

    @ExceptionHandler(CloudException.class)
    public R businessExceptionHandler(CloudException exception) {
        return R.error(exception.getCode(), exception.getMessage());
    }

    @ExceptionHandler(Throwable.class)
    public R systemExceptionHandler(Throwable throwable) {
        throwable.printStackTrace();
        return R.error(500, "未知的系统异常");
    }
}
