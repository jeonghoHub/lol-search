package com.example.demo.summoner;

import com.example.demo.summoner.model.SummonerDto;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Summoner {
    private String id;
    private String accountId;
    private String puuid;
    private String name;
    private int profileIconId;
    private long revisionDate;
    private long summonerLevel;

    public SummonerDto toDto() {
        return SummonerDto.builder()
                .id(id)
                .accountId(accountId)
                .puuid(puuid)
                .profileIconId(profileIconId)
                .revisionDate(revisionDate)
                .summonerLevel(summonerLevel)
                .build();
    }
}
