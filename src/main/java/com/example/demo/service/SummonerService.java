package com.example.demo.service;

import com.example.demo.client.RiotFeignClient;
import com.example.demo.dto.SummonerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SummonerService {
    private final RiotFeignClient feignClient;
    public SummonerDTO getSummonerInfo(String summonerName) {
        return feignClient.getSummonerInfo(summonerName);
    }
}
