package com.juan.poc.springboot.webapp.poc_springboot.controllers;

import java.util.*;

import com.juan.models.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.models.User;


@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping(path = "/detail2")
    public Map<String, Object> details() {
        User user = new User("Juan", "Carlos");
        Map<String, Object> model = new HashMap<String , Object>();
        model.put("title", "Hola Mundo Spring boot desde User Controller");
        model.put("name", user);
        model.put("lastname", "Suarez Marin");
        return model;
    }

    @GetMapping("/list")
    public List<User> list() {
        List<User> users = new ArrayList<>();
        users.add(new User("juan", "suarez"));
        users.add(new User("andrea", "perez"));
        users.add(new User("marina", "martinez"));

        return users;

    }

    @GetMapping("/detail")
    public UserDto details(Model model) {
        UserDto userDto = new UserDto();
        User user =  new User("Juan", "Carlos");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundooo");
        return userDto;
    }
    
}
