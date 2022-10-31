package com.revature.invincible.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ClothingSizeKey implements Serializable {
    @Column(name = "clothing_id")
    private String clothingId;

    @Column(name = "size_id")
    private String sizeId;

    public ClothingSizeKey() {
    }

    public ClothingSizeKey(String clothingId, String sizeId) {
        this.clothingId = clothingId;
        this.sizeId = sizeId;
    }

    public String getClothingId() {
        return clothingId;
    }

    public void setClothingId(String clothingId) {
        this.clothingId = clothingId;
    }

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    @Override
    public String toString() {
        return "ClothingSizeKey{" +
                "clothingId='" + clothingId + '\'' +
                ", sizeId='" + sizeId + '\'' +
                '}';
    }
}
