package com.revature.invincible.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SizeQuantityKey implements Serializable {
    @Column(name = "size_id")
    private String sizeId;

    @Column(name = "quantity_id")
    private String quantityId;

    public SizeQuantityKey() {
    }

    public SizeQuantityKey(String sizeId, String quantityId) {
        this.sizeId = sizeId;
        this.quantityId = quantityId;
    }

    public String getSizeId() {
        return sizeId;
    }

    public void setSizeId(String sizeId) {
        this.sizeId = sizeId;
    }

    public String getQuantityId() {
        return quantityId;
    }

    public void setQuantityId(String quantityId) {
        this.quantityId = quantityId;
    }

    @Override
    public String toString() {
        return "SizeQuantityKey{" +
                "sizeId='" + sizeId + '\'' +
                ", quantityId='" + quantityId + '\'' +
                '}';
    }
}
