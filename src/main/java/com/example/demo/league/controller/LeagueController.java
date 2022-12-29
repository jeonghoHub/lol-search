package com.example.demo.league.controller;

import com.example.demo.common.Response;
import com.example.demo.league.model.LeagueEntryDto;
import com.example.demo.league.service.LeagueService;
import com.example.demo.summoner.model.SummonerDto;
import com.example.demo.summoner.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.demo.common.Response.success;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/league")
public class LeagueController {
    private final LeagueService leagueService;
    @GetMapping("/id/{encryptedSummonerId}")
    public Response<List<LeagueEntryDto>> getLeagueByEncryptedSummonerId(@PathVariable String encryptedSummonerId) {
        return success(leagueService.getLeagueByEncryptedSummonerId(encryptedSummonerId));
    }
}
