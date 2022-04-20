package com.example.springsayhellotogithub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping(path = "/")
    public String index() {
        return "index";
    }
}
