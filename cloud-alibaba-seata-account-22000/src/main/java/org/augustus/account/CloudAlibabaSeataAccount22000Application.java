package org.augustus.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan(basePackages = "org.augustus.account.mapper")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudAlibabaSeataAccount22000Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSeataAccount22000Application.class, args);
    }

}
