package com.jungho.feign.summoner.controller;

import static com.jungho.feign.common.Response.success;

import com.jungho.feign.common.Response;
import com.jungho.feign.summoner.model.Summoner;
import com.jungho.feign.summoner.service.FindSummoner;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface SummonerController {

    @GetMapping("/name/{userName}")
    Response<Summoner> getSummonerByName(@PathVariable String userName);

    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/api/v1/summoner")
    class WebSummonerController implements SummonerController {

        private final FindSummoner findSumonner;

        @Override
        @GetMapping("/name/{userName}")
        public Response getSummonerByName(@PathVariable String userName) {
            return success(findSumonner.with(userName));
        }
    }
}

