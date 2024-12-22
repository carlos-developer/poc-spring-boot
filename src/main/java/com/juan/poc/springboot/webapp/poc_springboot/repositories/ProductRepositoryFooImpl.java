package com.juan.poc.springboot.webapp.poc_springboot.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.juan.poc.springboot.webapp.poc_springboot.models.Product;

@Primary
@Repository
public class ProductRepositoryFooImpl implements IProductRepository {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L, "Prueba desde repositorio FOO", 600L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id, "Pruebas desde repositorio FOO", 600L);
    }
    
}
