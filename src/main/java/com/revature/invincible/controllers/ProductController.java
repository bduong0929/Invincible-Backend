package com.revature.invincible.controllers;

import com.revature.invincible.dtos.requests.NewProductRequest;
import com.revature.invincible.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @CrossOrigin
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void addNewProduct(@RequestBody NewProductRequest req) {
        productService.saveProduct(req);
    }
}
