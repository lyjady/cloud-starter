package org.augustus.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudStarterPaymentConsul10003Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStarterPaymentConsul10003Application.class, args);
    }

}
