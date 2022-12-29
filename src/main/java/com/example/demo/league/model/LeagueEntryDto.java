package com.example.demo.league.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LeagueEntryDto {
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
}
