package com.jungho.feign.league.service;

import com.jungho.feign.league.client.LeagueClient;
import com.jungho.feign.league.model.EntryInfo;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public interface FindEntry {
    List<EntryInfo> withSummonerId(String encryptedSummonerId);

    @Service
    @RequiredArgsConstructor
    class FindEntryService implements FindEntry {

        private final LeagueClient leagueClient;

        @Override
        public List<EntryInfo> withSummonerId(String encryptedSummonerId) {
            return leagueClient.getLeagueEntryInfo(encryptedSummonerId)
                    .stream()
                    .map(leagueClient::toEntry)
                    .toList();
        }
    }
}