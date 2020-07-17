package org.augustus.order.feign;

import org.augustus.entries.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author EiletXie
 * @Since 2020/3/18 21:18
 */
@FeignClient(value = "seata-storage-service")
public interface StorageFeignService {

    /**
     * 减库存
     * @param productId
     * @param count
     * @return
     */
    @PostMapping(value = "/storage/decrease")
    R decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
