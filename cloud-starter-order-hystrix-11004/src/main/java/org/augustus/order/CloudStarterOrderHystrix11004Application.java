package org.augustus.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
@SpringBootApplication
public class CloudStarterOrderHystrix11004Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStarterOrderHystrix11004Application.class, args);
    }

}
