package com.juan.poc.springboot.webapp.poc_springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
    
    @GetMapping("/detail")
    public String details(Model model) {
        model.addAttribute("title", "Hola Mundo Spring boot desde User Controller");
        model.addAttribute("name", "Juan Carlos");

        model.addAttribute("lastname", "Suarez Marin");
        return "details";
    }
    
}
