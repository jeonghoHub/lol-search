package com.example.demo.feignInterface;

import com.example.demo.dto.Human;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "my-client", url = "localhost:8080/example/human")
public interface MyFeignClient {
    @GetMapping(produces = "application/json", value = "/get")
    public List<Human> getHumans();
}
