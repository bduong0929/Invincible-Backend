package com.revature.invincible.controllers;

import com.revature.invincible.dtos.requests.NewClothingRequest;
import com.revature.invincible.services.ClothingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products/clothings")
public class ClothingController {
    private final ClothingService clothingService;

    public ClothingController(ClothingService clothingService) {
        this.clothingService = clothingService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void addNewClothing(@RequestBody NewClothingRequest req) {
        clothingService.saveClothing(req);
    }
}
