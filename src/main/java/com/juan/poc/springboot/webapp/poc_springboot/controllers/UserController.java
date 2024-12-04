package com.juan.poc.springboot.webapp.poc_springboot.controllers;

import com.juan.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
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
        List<User> users = List.of(new User("pepa", "Gonzalez", "pep@gmail.com"), new User("lalo", "perez"), new User("Juanita", "Roe"));

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }
}
