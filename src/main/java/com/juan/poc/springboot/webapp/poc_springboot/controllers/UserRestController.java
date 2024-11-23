package com.juan.poc.springboot.webapp.poc_springboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserRestController {
    
    @GetMapping("/detail2")
    public Map<String, Object> details() {
        Map<String, Object> model = new HashMap<String , Object>();
        model.put("title", "Hola Mundo Spring boot desde User Controller");
        model.put("name", "Juan Carlos");
        model.put("lastname", "Suarez Marin");
        return model;
    }
    
}
