package com.example.demo.summoner.feignClient;

import com.example.demo.summoner.Summoner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "summoner", url = "${riot.url}")
public interface SummonerClient {
    @GetMapping("/summoner/v4/summoners/by-name/{summonerName}")
    Summoner getSummonerByName(@PathVariable("summonerName") String summonerName);

//    @GetMapping("/league/v4/entries/by-summoner/{encryptedSummonerId}")
//    List<LeagueEntryDTO> getLeagueEntryInfo(@PathVariable("encryptedSummonerId") String encryptedSummonerId);
}
