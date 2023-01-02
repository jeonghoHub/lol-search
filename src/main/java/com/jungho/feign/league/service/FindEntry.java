package com.jungho.feign.league.service;

import com.jungho.feign.league.client.CallLeagueInfo;
import com.jungho.feign.league.model.EntryInfo;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public interface FindEntry {
    List<EntryInfo> with(String encryptedSummonerId);

    @Service
    @RequiredArgsConstructor
    class FindEntryService implements FindEntry {
        private final CallLeagueInfo leagueClient;
        @Override
        public List<EntryInfo> with(String encryptedSummonerId) {
            return leagueClient.with(encryptedSummonerId)
                    .stream()
                    .map(leagueClient::toEntry)
                    .toList();
        }
    }
}