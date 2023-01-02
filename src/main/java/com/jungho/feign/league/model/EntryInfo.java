package com.jungho.feign.league.model;

public record EntryInfo(
        String leagueId,
        String queueTyp,
        String tier,
        String rank,
        String summonerId,
        String summonerName,
        Integer leaguePoints,
        Integer wins,
        Integer losses,
        Boolean veteran,
        Boolean inactive,
        Boolean freshBlood,
        Boolean hotStreak
){

}