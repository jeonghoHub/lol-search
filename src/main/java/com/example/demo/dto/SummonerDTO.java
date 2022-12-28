package com.example.demo.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SummonerDTO {
    private String id;
    private String accountId;
    private String puuid;
    private String name;
    private int profileIconId;
    private long revisionDate;
    private long summonerLevel;
}
