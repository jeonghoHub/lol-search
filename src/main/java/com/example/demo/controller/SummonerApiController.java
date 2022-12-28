package com.example.demo.controller;

import com.example.demo.dto.SummonerDTO;
import com.example.demo.client.RiotFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SummonerApiController {
    private final RiotFeignClient feignClient;

    @GetMapping("/")
    public SummonerDTO getFeign() {
        return feignClient.getSummonerInfo("울엄마소라카장인");
    }
}
