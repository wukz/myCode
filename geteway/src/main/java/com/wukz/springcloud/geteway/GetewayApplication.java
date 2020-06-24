package com.wukz.springcloud.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient //使用该注解将网关注册到eureka中
@EnableZuulProxy //使用该注解开启网关zuul
public class GetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetewayApplication.class, args);
    }

}
