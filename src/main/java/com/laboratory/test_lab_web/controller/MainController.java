package com.laboratory.test_lab_web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/info")
    public String info() {
        return "pageinfo";
    }
    @GetMapping("/type")
    public String type() {
        return "pagetype";
    }
    @GetMapping("/work")
    public String work() {
        return "pagework";
    }

}
