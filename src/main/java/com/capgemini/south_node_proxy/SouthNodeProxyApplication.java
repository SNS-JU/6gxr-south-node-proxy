package com.capgemini.south_node_proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SouthNodeProxyApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplication(SouthNodeProxyApplication.class).run(args);
    }
}
