package com.example.SecurityDemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/hello")
    @PreAuthorize("hasRole('BROTHER')")
    public String hello(){
        return "Welcome Bhaiya to Spring Boot Security :)";
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String getUser(){
        return "Hello User";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String getAdmin(){
        return "Hello Admin";
    }

}
