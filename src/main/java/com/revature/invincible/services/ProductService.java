package com.revature.invincible.services;

import com.revature.invincible.dtos.requests.NewProductRequest;
import com.revature.invincible.entities.Product;
import com.revature.invincible.repositories.ProductRepository;
import com.revature.invincible.utils.custom_exceptions.InvalidProductException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProductService {
    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public void saveProduct(NewProductRequest req) {
        List<Product> products = productRepo.findAll();

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(req.getName())) throw new InvalidProductException("The product you are trying to create already exist");
        }

        Product product = new Product(UUID.randomUUID().toString(), req.getName().substring(0, 1).toUpperCase() + req.getName().substring(1));
        productRepo.save(product);
    }
    public List<Product> findAllProducts() {
        return (List<Product>) productRepo.findAll();
    }

    public List<Product> findAllProductsByName(String name) {
        return productRepo.findAllByName(name);
    }
}
