package com.jungho.feign.league.controller;

import com.jungho.feign.common.Response;
import com.jungho.feign.league.model.EntryInfo;
import com.jungho.feign.league.service.FindEntry;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.jungho.feign.common.Response.success;

public interface LeagueController{

    @GetMapping("/id/{encryptedSummonerId}")
    Response<List<EntryInfo>> getLeagueByEncryptedSummonerId(@PathVariable String encryptedSummonerId);

    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/api/v1/league")
    class WebLeague implements LeagueController{
        private final FindEntry findEntry;
        @Override
        @GetMapping("/id/{encryptedSummonerId}")
        public Response getLeagueByEncryptedSummonerId(@PathVariable String encryptedSummonerId) {
            return success(findEntry.with(encryptedSummonerId));
        }
    }
}
