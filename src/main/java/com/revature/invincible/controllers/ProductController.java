package com.revature.invincible.controllers;

import com.revature.invincible.dtos.requests.NewProductRequest;
import com.revature.invincible.entities.Clothing;
import com.revature.invincible.entities.Product;
import com.revature.invincible.services.ProductService;
import com.revature.invincible.utils.custom_exceptions.InvalidProductException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @CrossOrigin
    @GetMapping(produces = "application/json")
    public List<Product> listAllProducts() {
        return productService.findAllProducts();
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    public InvalidProductException handledInvalidProductException(InvalidProductException e) {
        return e;
    }

    @CrossOrigin
    @GetMapping(value = "/name", produces = "application/json")
    public List<Product> getAllProductsByName(@RequestParam String name) {
        return productService.findAllProductsByName(name);
    }
}
