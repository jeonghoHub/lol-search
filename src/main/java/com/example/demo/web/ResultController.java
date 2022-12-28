package com.example.demo.web;

import com.example.demo.client.RiotFeignClient;
import com.example.demo.dto.SummonerDTO;
import com.example.demo.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ResultController {
    private final SummonerService summonerService;
    @GetMapping("/search")
    public String getFeign(@RequestParam("summonerName") String summonerName, Model model) {
        model.addAttribute("summonerInfo", summonerService.getSummonerInfo(summonerName));
        return "result";
    }

}
