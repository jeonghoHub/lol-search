package com.jungho.feign.summoner;

import com.jungho.feign.summoner.model.SummonerDto;
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
                .encryptedSummonerId(id)
                .name(name)
                .accountId(accountId)
                .puuid(puuid)
                .profileIconId(profileIconId)
                .profileIconPath(initProfileIconPathById())
                .revisionDate(revisionDate)
                .summonerLevel(summonerLevel)
                .build();
    }
    private String initProfileIconPathById() {
        return "https://ddragon.leagueoflegends.com/cdn/12.23.1/img/profileicon/"+profileIconId+".png";
    }
}
