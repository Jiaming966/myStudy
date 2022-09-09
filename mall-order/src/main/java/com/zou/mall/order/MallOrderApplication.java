package com.zou.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zouzhangli
 * @date 2022/9/9  11:13
 * @description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallOrderApplication.class, args);
    }
}
