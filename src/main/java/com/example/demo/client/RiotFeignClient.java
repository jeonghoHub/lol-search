package com.example.demo.client;

import com.example.demo.dto.SummonerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "my-client", url = "${riot.url}")
public interface RiotFeignClient {
    @GetMapping("/summoner/v4/summoners/by-name/{summonerName}")
    public SummonerDTO getSummonerInfo(@PathVariable("summonerName") String summonerName);
}
