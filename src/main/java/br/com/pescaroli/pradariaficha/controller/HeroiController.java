package br.com.pescaroli.pradariaficha.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroiController {
    @PostMapping("/add")
    public @ResponseBody String addNewHeroi(@RequestParam String nome){
        return "Saved";
    }
}
