package org.augustus.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("org.augustus.payment.mapper")
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class CloudStarterPayment10000Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStarterPayment10000Application.class, args);
    }

}
