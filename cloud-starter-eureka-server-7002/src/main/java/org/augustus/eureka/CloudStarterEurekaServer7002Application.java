package org.augustus.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudStarterEurekaServer7002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStarterEurekaServer7002Application.class, args);
    }

}
