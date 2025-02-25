package com.juan.poc.springboot.webapp.poc_springboot.repositories;

import com.juan.poc.springboot.webapp.poc_springboot.models.Product;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Arrays;
import java.util.List;


@Primary
@RequestScope
@Repository
public class ProductRepositoryImpl implements IProductRepository{
    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria Corsair 32", 300L),
                new Product(2L, "Cpu Intel Core i9", 180L),
                new Product(3L, "Teclado Razer Mini 60%", 250L),
                new Product(4L, "Motherboard Gigabyte", 490L)
        );
    }
    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }
}
