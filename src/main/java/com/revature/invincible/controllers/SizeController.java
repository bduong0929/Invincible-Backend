package com.revature.invincible.controllers;

import com.revature.invincible.dtos.requests.NewSizeRequest;
import com.revature.invincible.services.SizeService;
import com.revature.invincible.utils.custom_exceptions.InvalidSizeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/clothings/sizes")
public class SizeController {
    private final SizeService sizeService;

    public SizeController(SizeService sizeService) {
        this.sizeService = sizeService;
    }

    @CrossOrigin
    @PostMapping(consumes = "application/json")
    public void addNewSize(@RequestBody NewSizeRequest req) {
        sizeService.saveSize(req);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT)
    public InvalidSizeException handledInvalidSizeException(InvalidSizeException e) {
        return e;
    }
}
