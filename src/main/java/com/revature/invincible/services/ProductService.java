package com.revature.invincible.services;

import com.revature.invincible.dtos.requests.NewProductRequest;
import com.revature.invincible.models.Product;
import com.revature.invincible.repositories.ProductRepository;
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
        Product product = new Product(UUID.randomUUID().toString(), req);
        productRepo.save(product);
    }
    public List<Product> getAllProducts() {
        return (List<Product>) productRepo.findAll();
    }
}
