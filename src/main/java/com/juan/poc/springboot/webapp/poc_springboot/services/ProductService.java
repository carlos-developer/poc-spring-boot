package com.juan.poc.springboot.webapp.poc_springboot.services;

import com.juan.poc.springboot.webapp.poc_springboot.models.Product;

import java.util.List;

public interface ProductService {
     List<Product> findAll();

     Product findById(Long id);
}
