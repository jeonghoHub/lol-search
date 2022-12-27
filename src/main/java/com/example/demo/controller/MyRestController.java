package com.example.demo.controller;

import com.example.demo.dto.Human;
import com.example.demo.feignInterface.MyFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.expression.Lists;

import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequiredArgsConstructor
public class MyRestController {
    private final MyFeignClient feignClient;

    @GetMapping("/example/human")
    public List<Human> getHuman() {
        return IntStream.range(0, 10)
                .mapToObj(value -> Human.builder()
                        .name("이정호"+value)
                        .age(22+value)
                        .sex("남").build())
                .toList();
    }
    @GetMapping("/example/feign")
    public List<Human> getFeign()
    {
        List<Human> humans= feignClient.getHumans();
        System.out.println(humans);
        humans.stream().forEach(m->m.setAge(100));
        return humans;
    }
}
