package com.juan.poc.springboot.webapp.poc_springboot.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.juan.poc.springboot.webapp.poc_springboot.models.Product;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ProductRepositoryJson implements IProductRepository {

    private List<Product> list;

    public ProductRepositoryJson() {
        ClassPathResource resource = new ClassPathResource("json/product.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            list = Arrays.asList(objectMapper.readValue(resource.getFile(), Product[].class));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public Product findById(Long id) {
        return list.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow();
    }
}
