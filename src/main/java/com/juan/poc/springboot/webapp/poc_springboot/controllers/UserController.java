package com.juan.poc.springboot.webapp.poc_springboot.controllers;

import com.juan.models.User;
import com.juan.models.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {
    


    @GetMapping("/details")
    public String detailsMap(Model model) {
        User user = new User("juan", "calos");
        model.addAttribute("title", "Hola Mundo Spring boot desde User Controller");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = new ArrayList<>();

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    
}
