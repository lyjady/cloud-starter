package org.augustus.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LinYongJin
 * @date 2020/5/19 10:57
 */
@Configuration
public class OpenFeignConfiguration {

    @Bean
    public Logger.Level log() {
        return Logger.Level.HEADERS;
    }
}
