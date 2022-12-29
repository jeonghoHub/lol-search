package com.example.demo.league;

import com.example.demo.league.model.LeagueEntryDto;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LeagueEntry {
    public String leagueId;
    public String queueType;
    public String tier;
    public String rank;
    public String summonerId;
    public String summonerName;
    public int leaguePoints;
    public int wins;
    public int losses;
    public boolean veteran;
    public boolean inactive;
    public boolean freshBlood;
    public boolean hotStreak;

    public LeagueEntryDto toDto() {
        return LeagueEntryDto.builder()
                .leagueId(leagueId)
                .queueType(queueType)
                .tier(tier)
                .rank(rank)
                .summonerId(summonerId)
                .summonerName(summonerName)
                .leaguePoints(leaguePoints)
                .wins(wins)
                .losses(losses)
                .veteran(veteran)
                .inactive(inactive)
                .freshBlood(freshBlood)
                .hotStreak(hotStreak)
                .build();
    }
}
