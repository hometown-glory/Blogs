package com.yun.weblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 云言月
 * 2024/10/25 11:35
 */
@SpringBootApplication
@ComponentScan({"com.yun.weblog.*"})
@EnableScheduling
public class WeblogWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeblogWebApplication.class, args);
    }
}
