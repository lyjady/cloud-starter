package org.augustus.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class CloudStarterPaymentHystrix10004Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStarterPaymentHystrix10004Application.class, args);
    }

}
