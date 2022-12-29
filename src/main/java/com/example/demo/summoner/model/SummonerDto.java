package com.example.demo.summoner.model;

import lombok.Builder;
@Builder
public class SummonerDto {
    private String id;
    private String accountId;
    private String puuid;
    private String name;
    private int profileIconId;
    private long revisionDate;
    private long summonerLevel;
}
