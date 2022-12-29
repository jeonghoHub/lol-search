package com.example.demo.config;

import feign.Logger.Level;
import feign.RequestInterceptor;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.*;

import static feign.Retryer.*;


@Configuration
@EnableFeignClients(basePackages = "com.example.demo")
public class OpenFeignConfig {
    @Value("${riot.key}")
    public String key;
    @Bean
    public Level feignLoggerLevel() {
        return Level.FULL;
    }
    @Bean
    public Retryer retryer() {
        return new Default(1_000, 2_000, 3);
    }
    @Bean
    public RequestInterceptor requestInterceptor() {
        return template -> {
            template.query("api_key", key);
        };
    }
}
