package com.revature.invincible.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewSizeRequest {
    private String size;
    private int quantity;
    private String clothing_id;
}
