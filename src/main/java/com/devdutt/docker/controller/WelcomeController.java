package com.devdutt.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping("/greats/{name}")
    public String greating(@PathVariable String name) {
        return name + " Welcome To SpringBoot with Docker...";
    }
}
