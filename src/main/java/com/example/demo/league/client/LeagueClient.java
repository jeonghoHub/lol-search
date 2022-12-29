package com.example.demo.league.client;

import com.example.demo.league.LeagueEntry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@FeignClient(name = "league", url = "${riot.url}")
public interface LeagueClient {
    @GetMapping("/league/v4/entries/by-summoner/{encryptedSummonerId}")
    List<LeagueEntry> getLeagueEntryInfo(@PathVariable("encryptedSummonerId") String encryptedSummonerId);
}
