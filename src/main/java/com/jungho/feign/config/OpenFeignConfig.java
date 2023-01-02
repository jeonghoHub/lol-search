package com.jungho.feign.config;

import feign.Logger.Level;
import feign.RequestInterceptor;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.*;

import static feign.Retryer.*;


@Configuration
@EnableFeignClients(basePackages = {"com.jungho.feign.league", "com.jungho.feign.summoner"})
public class OpenFeignConfig {
    @Value("${riot.key}")
    private String key;
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
