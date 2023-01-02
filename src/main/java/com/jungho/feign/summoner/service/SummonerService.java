package com.jungho.feign.summoner.service;

import com.jungho.feign.summoner.model.SummonerDto;

public interface SummonerService {
    SummonerDto getSummonerByUser(String summonerName);
}
