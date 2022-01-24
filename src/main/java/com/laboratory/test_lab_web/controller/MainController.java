package com.laboratory.test_lab_web.controller;

import com.laboratory.test_lab_web.models.Offers;
import com.laboratory.test_lab_web.ropository.OffersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private OffersRepo offersRepo;

    @GetMapping("/")
    public String home() {
        return "main";
    }
    @GetMapping("/info")
    public String info() {
        return "info";
    }
    @GetMapping("/offers")
    public String type(Model model) {
        Iterable<Offers> offers = offersRepo.findAll();
        model.addAttribute("offers", offers);
        return "offers";
    }
    @GetMapping("/avto")
    public String avto() {
        return "athoriz";
    }

}
