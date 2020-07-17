package org.augustus.storage.controller;

import org.augustus.entries.R;
import org.augustus.storage.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author EiletXie
 * @Since 2020/3/18 22:35
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public R decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return R.ok();
    }
}
