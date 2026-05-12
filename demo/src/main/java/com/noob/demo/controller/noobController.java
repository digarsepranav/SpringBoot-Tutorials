package com.noob.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class noobController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello Noob Player";
    }
}
