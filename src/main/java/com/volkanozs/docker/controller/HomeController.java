package com.volkanozs.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/defaultController")
public class HomeController {

    @GetMapping
    public String getFirstMessage(@RequestParam String user){
        return "Docker'a hos geldin." + " " + user;
    }
}
