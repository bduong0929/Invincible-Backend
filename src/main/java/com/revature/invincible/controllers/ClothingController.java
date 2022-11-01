package com.revature.invincible.controllers;

import com.revature.invincible.dtos.requests.NewClothingRequest;
import com.revature.invincible.entities.Clothing;
import com.revature.invincible.services.ClothingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products/clothings")
public class ClothingController {
    private final ClothingService clothingService;

    public ClothingController(ClothingService clothingService) {
        this.clothingService = clothingService;
    }

    @CrossOrigin
    @PostMapping(consumes = "application/json")
    public void addNewClothing(@RequestBody NewClothingRequest req) {
        clothingService.saveClothing(req);
    }

    @CrossOrigin
    @GetMapping(produces = "application/json")
    public List<Clothing> getAllClothings() {
        return clothingService.findAllClothings();
    }
}
