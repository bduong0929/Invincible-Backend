package com.revature.invincible.services;

import com.revature.invincible.dtos.requests.NewClothingRequest;
import com.revature.invincible.models.Clothing;
import com.revature.invincible.repositories.ClothingRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class ClothingService {
    private final ClothingRepository clothingRepo;

    public ClothingService(ClothingRepository clothingRepo) {
        this.clothingRepo = clothingRepo;
    }

    public void saveClothing(NewClothingRequest req) {
        clothingRepo.save(UUID.randomUUID().toString(), req.getName(), req.getPrice(), req.getProduct_id());
    }
}
