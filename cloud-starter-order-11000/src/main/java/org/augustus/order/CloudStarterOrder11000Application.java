package org.augustus.order;

import org.augustus.rule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author User
 */
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "PAYMENT-SERVICE", configuration = CustomRule.class)
public class CloudStarterOrder11000Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStarterOrder11000Application.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
