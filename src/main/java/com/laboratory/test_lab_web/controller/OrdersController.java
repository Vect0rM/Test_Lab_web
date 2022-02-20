package com.laboratory.test_lab_web.controller;

import com.laboratory.test_lab_web.models.Offers;
import com.laboratory.test_lab_web.ropository.OffersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrdersController {

    /*public String getCurrentUsername() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getName();
    }*/

    @Autowired
    private OffersRepo offersRepo;

    @GetMapping("/orders")
    public String orders(Model model) {
        Iterable<Offers> offers = offersRepo.findAll();
        model.addAttribute("offers", offers);
        return "orders";
    }

   @PostMapping("/orders")
    public String OrderForm(Model model , @RequestParam String username){
       System.out.println(username);
        return "redirect:/";
    }
}
