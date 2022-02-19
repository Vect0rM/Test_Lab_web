package com.laboratory.test_lab_web.controller;

import com.laboratory.test_lab_web.models.Role;
import com.laboratory.test_lab_web.models.User;
import com.laboratory.test_lab_web.ropository.RoleRepo;
import com.laboratory.test_lab_web.ropository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User user = new User(username , passwordEncoder.encode(password), passwordEncoder.encode(password), Collections.singleton(new Role(1L, "ROLE_USER")));
        userRepo.save(user);
        return "redirect:/";
    }
  /*  @PostMapping("/login")
    public String Login(){
        return "redirect:/";
    }
    @GetMapping ("/login")
    public String LoginIn(){
        return "login";
    }*/
}
