package com.laboratory.test_lab_web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home() {
        return "main";
    }
    @GetMapping("/info")
    public String info() {
        return "info";
    }
    @GetMapping("/offers")
    public String type() {
        return "offers";
    }
    @GetMapping("/work")
    public String work() {
        return "works";
    }
    @GetMapping("/avto")
    public String avto() {
        return "athoriz";
    }

}
