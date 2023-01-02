package com.jungho.feign.summoner.service;

import com.jungho.feign.summoner.client.SummonerClient;
import com.jungho.feign.summoner.model.Summoner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@FunctionalInterface
public interface FindSummoner {

    Summoner with(String summonerName);

    @Service
    @RequiredArgsConstructor
    class FindSummonerService implements FindSummoner {
        private final SummonerClient summonerClient;
        @Override
        public Summoner with(String summonerName) {
            return summonerClient.toSummoner(summonerClient.with(summonerName));
        }
    }
}
