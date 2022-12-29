package com.example.demo.league.service;

import com.example.demo.league.LeagueEntry;
import com.example.demo.league.client.LeagueClient;
import com.example.demo.league.model.LeagueEntryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LeagueServiceImpl implements LeagueService{
    private final LeagueClient leagueClient;
    @Override
    public List<LeagueEntryDto> getLeagueByEncryptedSummonerId(String encryptedSummonerId) {
        return leagueClient.getLeagueEntryInfo(encryptedSummonerId).stream().map(LeagueEntry::toDto).toList();
    }
}
