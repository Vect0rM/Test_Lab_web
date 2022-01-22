package com.laboratory.test_lab_web.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/pageinfo")
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
