package com.example.demo.config;

import feign.Logger.Level;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.*;


@Configuration
@EnableFeignClients(basePackages = "com.example.demo.client")
public class OpenFeignConfig {
    @Value("${riot.key}")
    public String key;
    @Bean
    public Level feignLoggerLevel() {
        return Level.FULL;
    }
    @Bean
    public RequestInterceptor requestInterceptor() {
        return template -> {
            template.query("api_key", key);
        };
    }
}
