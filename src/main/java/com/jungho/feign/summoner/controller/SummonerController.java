package com.jungho.feign.summoner.controller;

import com.jungho.feign.common.Response;
import com.jungho.feign.summoner.model.SummonerDto;
import com.jungho.feign.summoner.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.jungho.feign.common.Response.success;

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
