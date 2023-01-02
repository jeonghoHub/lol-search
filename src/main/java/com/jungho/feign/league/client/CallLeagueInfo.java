package com.jungho.feign.league.client;

import com.jungho.feign.league.model.EntryInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
@FeignClient(name = "league", url = "${riot.url}")
public interface CallLeagueInfo {
    @GetMapping("/league/v4/entries/by-summoner/{encryptedSummonerId}")
    List<ClientResponse> with(@PathVariable("encryptedSummonerId") String encryptedSummonerId);

    default EntryInfo toEntry(ClientResponse clientResponse){
        return new EntryInfo(
                clientResponse.leagueId,
                clientResponse.queueType,
                clientResponse.tier,
                clientResponse.rank,
                clientResponse.summonerId,
                clientResponse.summonerName,
                clientResponse.leaguePoints,
                clientResponse.wins,
                clientResponse.losses,
                clientResponse.veteran,
                clientResponse.inactive,
                clientResponse.freshBlood,
                clientResponse.hotStreak);
    }
    record ClientResponse(
            String leagueId,
            String summonerId,
            String summonerName,
            String queueType,
            String tier,
            String rank,
            Integer leaguePoints,
            Integer wins,
            Integer losses,
            Boolean veteran,
            Boolean inactive,
            Boolean freshBlood,
            Boolean hotStreak
    ) { }
}