package com.example.demo.controller;


import com.example.demo.entity.Cat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    // @Autowired
    // private ObjectMapper objectMapper;

    @GetMapping("/api/main")
    public String mainListener() {
        return "Hello, world!";
    }

    @GetMapping("/api/cat")
    public Cat giveCat() {
        return new Cat("Misha", 2, 6);
    }



}
