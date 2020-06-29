package org.augustus.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CloudAlibabaStaterSentinel8848Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaStaterSentinel8848Application.class, args);
    }

}
