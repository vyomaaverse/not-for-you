package com.example.nonoisnice.GreatWeather.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String getGreeting(){

        return "Hi, I'm Nono and I'm a nice person!";
    }
}
