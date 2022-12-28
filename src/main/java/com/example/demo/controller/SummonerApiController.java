package com.example.demo.controller;

import com.example.demo.dto.SummonerDTO;
import com.example.demo.client.RiotFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SummonerApiController {
    private final RiotFeignClient feignClient;

//    @GetMapping("/search")
//    public SummonerDTO getFeign(@RequestParam("summonerName") String summonerName) {
//        return feignClient.getSummonerInfo(summonerName);
//    }
}
