package com.web_api.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to my Springboot Web API";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyRole('MANAGER','USER')")
    public String users(){
        return "Authorized user";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasAnyRole('MANAGER','USER')")
    public String managers(){
        return "Authorized manager";
    }
}
