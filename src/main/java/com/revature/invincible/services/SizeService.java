package com.revature.invincible.services;

import com.revature.invincible.dtos.requests.NewSizeRequest;
import com.revature.invincible.entities.Size;
import com.revature.invincible.repositories.SizeRepository;
import com.revature.invincible.utils.custom_exceptions.InvalidSizeException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class SizeService {
    private final SizeRepository sizeRepo;

    public SizeService(SizeRepository sizeRepo) {
        this.sizeRepo = sizeRepo;
    }

    public void saveSize(NewSizeRequest req) {
        List<String> sizes = sizeRepo.findSizesByClothingIdAndSize(req.getClothing_id(), req.getSize());

        if (sizes.size() > 0) throw new InvalidSizeException("The size you are trying to create already exist");

        Size size = new Size(UUID.randomUUID().toString(), req.getSize().toUpperCase(), req.getQuantity());
        sizeRepo.save(size);
        sizeRepo.saveClothingSize(req.getClothing_id(), size.getId());
    }
}
