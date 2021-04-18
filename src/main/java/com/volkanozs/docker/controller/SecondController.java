package com.volkanozs.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "secondController")
public class SecondController {

    @GetMapping(value = "/")
    public String getSecondController(@RequestParam String user){
        return String.format("-_- Selam %s", user);
    }
}
