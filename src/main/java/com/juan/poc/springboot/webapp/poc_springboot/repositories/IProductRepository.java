package com.juan.poc.springboot.webapp.poc_springboot.repositories;

import com.juan.poc.springboot.webapp.poc_springboot.models.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    Product findById(Long id);

}
