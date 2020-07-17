package org.augustus.account.controller;


import org.augustus.account.service.AccountService;
import org.augustus.entries.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author EiletXie
 * @Since 2020/3/18 23:21
 */
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    @RequestMapping("/account/decrease")
    public R decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId,money);
        return R.ok();
    }
}
