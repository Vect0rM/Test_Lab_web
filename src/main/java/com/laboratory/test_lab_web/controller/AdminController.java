package com.laboratory.test_lab_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {

    @GetMapping("/admin")
    public String AdminPanel(){
        return "admin";
    }
}
