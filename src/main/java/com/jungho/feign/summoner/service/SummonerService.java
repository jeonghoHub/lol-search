package com.jungho.feign.summoner.service;

import com.jungho.feign.summoner.client.SummonerClient;
import com.jungho.feign.summoner.model.Summoner;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public interface SummonerService {
    Summoner getSummonerByUser(String summonerName);
    @Service
    @RequiredArgsConstructor
    class SummonerServiceImpl implements SummonerService {
        private final SummonerClient summonerClient;
        @Override
        public Summoner getSummonerByUser(String summonerName) {
            return summonerClient.toSummoner(summonerClient.getSummonerByName(summonerName));
        }
    }
}
