package com.jungho.feign.summoner.client;

import com.jungho.feign.summoner.model.Summoner;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FunctionalInterface
@FeignClient(name = "summoner", url = "${riot.url}")
public interface SummonerClient {
    @GetMapping("/summoner/v4/summoners/by-name/{summonerName}")
    SummonerResponse with(@PathVariable("summonerName") String summonerName);
    default Summoner toSummoner(SummonerResponse response) {
        return new Summoner(
            response.id,
            response.name,
            response.accountId,
            response.puuid,
            response.profileIconId,
            response.toPath(),
            response.revisionDate,
            response.summonerLevel
        );
    }
    record SummonerResponse(
        String id,
        String accountId,
        String puuid,
        String name,
        Integer profileIconId,
        Long revisionDate,
        Long summonerLevel
    ){
        private static final String PROFILE_ICON_URL = "http://ddragon.leagueoflegends.com/cdn/11.6.1/img/profileicon/%d.png";
        private static final String EXTENSION = ".png";

        private String toPath() {
            return PROFILE_ICON_URL + profileIconId + EXTENSION;
        }
    }
}
