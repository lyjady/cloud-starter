package org.augustus.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan(basePackages = "org.augustus.storage.mapper")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CloudAlibabaSeataStorage23000Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSeataStorage23000Application.class, args);
    }

}
