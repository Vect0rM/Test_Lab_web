package com.laboratory.test_lab_web.controller;

import com.laboratory.test_lab_web.models.Orders;
import com.laboratory.test_lab_web.ropository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @Autowired
   private OrdersRepo ordersRepo;

    @GetMapping("/admin")
    public String AdminPanel(Model model){
        Iterable<Orders> orders = ordersRepo.findAll();
        model.addAttribute("orders", orders);
        return "admin";
    }
}
