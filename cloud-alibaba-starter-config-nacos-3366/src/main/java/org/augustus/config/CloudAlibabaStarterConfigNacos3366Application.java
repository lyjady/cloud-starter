package org.augustus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CloudAlibabaStarterConfigNacos3366Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaStarterConfigNacos3366Application.class, args);
    }

}
