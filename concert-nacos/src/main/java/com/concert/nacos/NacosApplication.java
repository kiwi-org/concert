package com.concert.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YanAnHuaZai
 * created at：2020-05-25 13:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class, args);

    }
}