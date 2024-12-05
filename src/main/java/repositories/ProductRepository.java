package repositories;

import models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria Corsair 32", 300L),
                new Product(2L, "Cpu Intel Core i9", 180L),
                new Product(3L, "Teclado Razer Mini 60%", 250L),
                new Product(4L, "Motherboard Gigabyte", 490L)
        );
    }

    public List<Product> findAll() {
        return data;
    }
}
