package com.jungho.feign.summoner.service;

import com.jungho.feign.summoner.client.SummonerClient;
import com.jungho.feign.summoner.model.SummonerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SummonerServiceImpl implements SummonerService {
    private final SummonerClient summonerClient;
    @Override
    public SummonerDto getSummonerByUser(String summonerName) {
        return summonerClient.getSummonerByName(summonerName).toDto();
    }
}
