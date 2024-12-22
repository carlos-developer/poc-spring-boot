package com.juan.poc.springboot.webapp.poc_springboot.controllers;

import com.juan.poc.springboot.webapp.poc_springboot.models.Product;
import com.juan.poc.springboot.webapp.poc_springboot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.juan.poc.springboot.webapp.poc_springboot.services.ProductServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return service.findById(id);
    }
}
