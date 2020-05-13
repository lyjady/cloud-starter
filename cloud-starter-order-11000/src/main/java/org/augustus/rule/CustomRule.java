package org.augustus.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LinYongJin
 * @date 2020/5/13 21:49
 */
@Configuration
public class CustomRule {

    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}
