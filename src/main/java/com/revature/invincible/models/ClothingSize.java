package com.revature.invincible.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class ClothingSize {
    @EmbeddedId
    private ClothingSizeKey id;

    @ManyToOne
    @MapsId("clothingId")
    @JsonBackReference
    @JoinColumn(name = "clothing_id", nullable = false)
    private Clothing clothing;

    @ManyToOne
    @MapsId("sizeId")
    @JsonBackReference
    @JoinColumn(name = "size_id", nullable = false)
    private Size size;

    public ClothingSize() {
    }

    public ClothingSize(ClothingSizeKey id, Clothing clothing, Size size) {
        this.id = id;
        this.clothing = clothing;
        this.size = size;
    }

    public ClothingSizeKey getId() {
        return id;
    }

    public void setId(ClothingSizeKey id) {
        this.id = id;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ClothingSize{" +
                "id=" + id +
                ", clothing=" + clothing +
                ", size=" + size +
                '}';
    }
}
