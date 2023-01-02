package com.jungho.feign.summoner.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SummonerDto {
    private String encryptedSummonerId;
    private String accountId;
    private String puuid;
    private String name;
    private int profileIconId;
    private String profileIconPath;
    private long revisionDate;
    private long summonerLevel;
}
