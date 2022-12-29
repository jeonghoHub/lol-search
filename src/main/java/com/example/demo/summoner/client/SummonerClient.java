package com.example.demo.summoner.client;

import com.example.demo.summoner.Summoner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "summoner", url = "${riot.url}")
public interface SummonerClient {
    @GetMapping("/summoner/v4/summoners/by-name/{summonerName}")
    Summoner getSummonerByName(@PathVariable("summonerName") String summonerName);

}
