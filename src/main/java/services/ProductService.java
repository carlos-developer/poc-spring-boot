package services;

import models.Product;
import repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private ProductRepository repository = new ProductRepository();

    public List<Product> findAll() {
        return  repository.findAll().stream().map(p ->{
           Double priceTax = p.getPrice() * 1.25;
           //Product newProd = new Product(p.getId(), p.getName(), priceIM.longValue());
           Product newProduct = (Product) p.clone();
           newProduct.setPrice(priceTax.longValue());
           return newProduct;
        }).collect(Collectors.toList());
    }
    public Product findById(Long id) {
        return repository.findById(id);
    }
}
