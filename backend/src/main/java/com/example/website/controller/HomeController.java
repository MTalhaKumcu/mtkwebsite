package com.example.website.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to MTK Website API!";
    }

    @GetMapping("/api/status")
    public String status() {
        return "{\"status\": \"running\", \"message\": \"Backend is operational\"}";
    }

    @GetMapping("/api/info")
    public String info() {
        return "{\"name\": \"MTK Website\", \"version\": \"1.0.0\", \"author\": \"MTalhaKumcu\"}";
    }
} 