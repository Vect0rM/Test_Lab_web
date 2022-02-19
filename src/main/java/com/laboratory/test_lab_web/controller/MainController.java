package com.laboratory.test_lab_web.controller;

import com.laboratory.test_lab_web.models.Offers;
import com.laboratory.test_lab_web.ropository.CertificatesRepo;
import com.laboratory.test_lab_web.ropository.OffersRepo;
import com.laboratory.test_lab_web.ropository.OrdersRepo;
import com.laboratory.test_lab_web.ropository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private OffersRepo offersRepo;
    private CertificatesRepo certificatesRepo;
    private OrdersRepo ordersRepo;
    private UserRepo userRepo;

    @GetMapping("/")
    public String home(Model model) {
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

    @GetMapping("/orders")
    public String orders(Model model) {
        Iterable<Offers> offers = offersRepo.findAll();
        model.addAttribute("offers", offers);
        return "orders";
    }

    @PostMapping("/orders")
    public String ordersOffers(){
        return "/";
    }

}
