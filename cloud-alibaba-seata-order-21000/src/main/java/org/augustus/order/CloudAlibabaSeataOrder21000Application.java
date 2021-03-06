package org.augustus.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan(basePackages = "org.augustus.order.mapper")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudAlibabaSeataOrder21000Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSeataOrder21000Application.class, args);
    }

}
