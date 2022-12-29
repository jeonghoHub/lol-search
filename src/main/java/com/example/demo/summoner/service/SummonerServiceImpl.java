package com.example.demo.summoner.service;

import com.example.demo.summoner.client.SummonerClient;
import com.example.demo.summoner.model.SummonerDto;
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
