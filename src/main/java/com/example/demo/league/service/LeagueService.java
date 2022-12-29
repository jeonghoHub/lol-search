package com.example.demo.league.service;

import com.example.demo.league.model.LeagueEntryDto;

import java.util.List;

public interface LeagueService {
    List<LeagueEntryDto> getLeagueByEncryptedSummonerId(String encryptedSummonerId);
}
