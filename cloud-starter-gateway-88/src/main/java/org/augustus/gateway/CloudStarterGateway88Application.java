package org.augustus.gateway;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@EnableEurekaClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class})
public class CloudStarterGateway88Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStarterGateway88Application.class, args);
    }


    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route("baidu", route -> route.path("/baidu/**")
                .and().after(ZonedDateTime.of(LocalDateTime.of(2020, 6, 4, 14, 0, 0), ZoneId.systemDefault())).uri("https://www.baidu.com"))
                .route("taobao", route -> route.path("/taobao/**")
                        .and().after(ZonedDateTime.of(LocalDateTime.of(2020, 6, 4, 14, 0, 0), ZoneId.systemDefault())).uri("https://taobao.com")).build();
    }

}
