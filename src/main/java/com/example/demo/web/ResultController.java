package com.example.demo.web;

import com.example.demo.summoner.service.SummonerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ResultController {
    @GetMapping("/search")
    public String getSearchSummoner() {
        return "result";
    }
}
