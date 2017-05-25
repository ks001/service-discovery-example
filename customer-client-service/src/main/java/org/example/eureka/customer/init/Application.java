package org.example.eureka.customer.init;

import org.example.eureka.customer.services.CustomerServiceFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebMvc
@EnableFeignClients(basePackageClasses = CustomerServiceFeignClient.class)
@ComponentScan(basePackages = {"org.example.eureka.customer"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}


