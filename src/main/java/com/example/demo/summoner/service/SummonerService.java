package com.example.demo.summoner.service;

import com.example.demo.summoner.model.SummonerDto;

public interface SummonerService {
    SummonerDto getSummonerByUser(String summonerName);
}
