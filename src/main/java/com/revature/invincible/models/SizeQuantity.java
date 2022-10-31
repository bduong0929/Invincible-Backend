package com.revature.invincible.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class SizeQuantity {
    @EmbeddedId
    private SizeQuantityKey id;

    @ManyToOne
    @MapsId("sizeId")
    @JsonBackReference
    @JoinColumn(name = "size_id", nullable = false)
    private Size size;

    @ManyToOne
    @JsonBackReference
    @MapsId("quantityId")
    @JoinColumn(name = "quantity_id", nullable = false)
    private Quantity quantity;

    public SizeQuantity() {

    }

    public SizeQuantity(SizeQuantityKey id, Size size, Quantity quantity) {
        this.id = id;
        this.size = size;
        this.quantity = quantity;
    }

    public SizeQuantityKey getId() {
        return id;
    }

    public void setId(SizeQuantityKey id) {
        this.id = id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SizeQuantity{" +
                "id=" + id +
                ", size=" + size +
                ", quantity=" + quantity +
                '}';
    }
}
