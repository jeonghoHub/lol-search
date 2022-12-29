package com.example.demo.summoner.controller;

import com.example.demo.common.Response;
import com.example.demo.summoner.model.SummonerDto;
import com.example.demo.summoner.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.example.demo.common.Response.success;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/summoner")
public class SummonerController {
    private final SummonerService summonerService;
    @GetMapping("/name/{userName}")
    public Response<SummonerDto> getSummonerByName(@PathVariable String userName) {
        return success(summonerService.getSummonerByUser(userName));
    }
}
