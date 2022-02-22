package com.laboratory.test_lab_web.controller;

import com.laboratory.test_lab_web.models.Offers;
import com.laboratory.test_lab_web.models.Orders;
import com.laboratory.test_lab_web.models.Role;
import com.laboratory.test_lab_web.models.User;
import com.laboratory.test_lab_web.ropository.OffersRepo;
import com.laboratory.test_lab_web.ropository.OrdersRepo;
import com.laboratory.test_lab_web.ropository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Collections;


@Controller
public class OrdersController {


    public String getCurrentUsername() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getName();
    }

   public User FindUser(String username){
       User f1 = userRepo.findByUsername(username);
        return new User(f1.getUsername(), f1.getPassword(), f1.getPasswordConfirm(),  Collections.singleton(new Role(1L, "ROLE_USER")));
    }

    @Autowired
    private OffersRepo offersRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private OrdersRepo ordersRepo;

    @GetMapping("/orders")
    public String orders(Model model) {
        Iterable<Offers> offers = offersRepo.findAll();
        model.addAttribute("offers", offers);
        model.addAttribute("NameOfUser", getCurrentUsername());
        return "orders";
    }

   @PostMapping("/orders")
    public String OrderForm(@RequestParam String firstName, @RequestParam String lastname, @RequestParam String username, @RequestParam String email, @RequestParam Long num, @RequestParam String offer){
       Orders orders = new Orders(firstName, lastname, email, offer, num, Collections.singleton(FindUser(username)));
       ordersRepo.save(orders);
        return "redirect:/";
    }
}
