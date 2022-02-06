package com.laboratory.test_lab_web.controller;

import com.laboratory.test_lab_web.models.Role;
import com.laboratory.test_lab_web.models.User;
import com.laboratory.test_lab_web.ropository.RoleRepo;
import com.laboratory.test_lab_web.ropository.UserRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
public class RegistrationController {

    private final  UserRepo userRepo;

    public RegistrationController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    @PostMapping("/registration")
    public String registrationUser(Model model, @RequestParam String username, @RequestParam String password){
        User user = new User(username , password, password, Collections.singleton(new Role(1L, "ROLE_USER")));
        userRepo.save(user);
        return "redirect:/";
    }
}
