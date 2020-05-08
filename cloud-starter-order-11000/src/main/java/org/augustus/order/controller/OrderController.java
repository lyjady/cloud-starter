package org.augustus.order.controller;

import org.augustus.entries.R;
import org.augustus.to.PaymentTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author LinYongJin
 * @date 2020/5/4 17:16
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    private final String SERVER_NAME = "http://PAYMENT-SERVICE";

    @PostMapping("/consumer/save/payment")
    public R savePaymentInfo(@RequestBody PaymentTo payment) {
        ResponseEntity<R> entity = restTemplate.postForEntity(SERVER_NAME + "/payment/save", payment, R.class);
        return entity.getBody();
    }

    @GetMapping("/consumer/find/payment/{id}")
    public R findPayment(@PathVariable Long id) {
        return restTemplate.getForObject(SERVER_NAME + "/payment/find/" + id, R.class);
    }

    @GetMapping("/consumer/port")
    public R port() {
        return restTemplate.getForObject(SERVER_NAME + "/payment/port", R.class);
    }

    @GetMapping("/discovery")
    public void discovery() {
        System.out.println("description" + discoveryClient.description());
        List<String> services = discoveryClient.getServices();
        services.forEach(System.out::println);
        List<ServiceInstance> instances = discoveryClient.getInstances("PAYMENT-SERVICE");
        instances.forEach(instance -> {
            System.out.println("host: " + instance.getHost());
            System.out.println("port: " + instance.getPort());
            System.out.println("scheme: " + instance.getScheme());
            System.out.println("uri: " + instance.getUri());
            System.out.println("metadata: " + instance.getMetadata());
        });
    }
}
