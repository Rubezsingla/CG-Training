package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello(){
        return "hello from spring boot";
    }
}
