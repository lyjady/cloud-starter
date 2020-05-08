package org.augustus.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan(basePackages = "org.augustus.payment.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class CloudStarterPayment10001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStarterPayment10001Application.class, args);
    }

}
