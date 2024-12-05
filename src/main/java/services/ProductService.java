package services;

import models.Product;
import repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private ProductRepository repository = new ProductRepository();

    public List<Product> findAll() {
        return  repository.findAll().stream().map(p ->{
           Double priceIM = p.getPrice() * 1.25;
           p.setPrice(priceIM.longValue());
           return p;
        }).collect(Collectors.toList());
    }
    public Product findById(Long id) {
        return repository.findById(id);
    }
}
