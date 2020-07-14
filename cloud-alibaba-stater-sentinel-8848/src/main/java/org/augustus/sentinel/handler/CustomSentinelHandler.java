package org.augustus.sentinel.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author LinYongJin
 * @date 2020/7/8 9:42
 */
public class CustomSentinelHandler {

    public static String custom1(BlockException blockException) {
        return "全局自定义的block handler1";
    }

    public static String custom2(BlockException blockException) {
        return "全局自定义的block handler2";
    }
}
