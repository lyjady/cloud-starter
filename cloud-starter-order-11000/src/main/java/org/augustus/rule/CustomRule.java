package org.augustus.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

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
