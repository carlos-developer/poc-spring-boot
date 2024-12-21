package com.juan.poc.springboot.webapp.poc_springboot.services;

import com.juan.poc.springboot.webapp.poc_springboot.models.Product;
import com.juan.poc.springboot.webapp.poc_springboot.repositories.ProductRepositoryImpl;

import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {

    private ProductRepositoryImpl repository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return  repository.findAll().stream().map(p ->{
           Double priceTax = p.getPrice() * 1.25;
           //Product newProd = new Product(p.getId(), p.getName(), priceIM.longValue());
           Product newProduct = (Product) p.clone();
           newProduct.setPrice(priceTax.longValue());
           return newProduct;
        }).collect(Collectors.toList());
    }
    @Override
    public Product findById(Long id) {
        return repository.findById(id);
    }
}
