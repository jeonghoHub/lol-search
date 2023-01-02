package com.jungho.feign.summoner.model;

import lombok.Builder;
import lombok.Data;

public record Summoner(
  String encryptedSummonerId,
  String accountId,
  String puuid,
  String name,
  Integer profileIconId,
  String profileIconPath,
  Long revisionDate,
  Long summonerLevel
){

}
