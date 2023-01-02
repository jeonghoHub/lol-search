package com.jungho.feign.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PageBinder implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addStatusController("/404", HttpStatus.NOT_FOUND);
        registry.addStatusController("/500", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
