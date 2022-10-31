package com.revature.invincible.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "quantities")
public class Quantity {
    @Id
    private String id;

    @Column(name = "quantity")
    private int quantity;

    @JsonManagedReference
    @OneToMany(mappedBy = "quantity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<SizeQuantity> sizeQuantities;

    public Quantity() {
    }

    public Quantity(String id, int quantity, Set<SizeQuantity> sizeQuantities) {
        this.id = id;
        this.quantity = quantity;
        this.sizeQuantities = sizeQuantities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<SizeQuantity> getSizeQuantities() {
        return sizeQuantities;
    }

    public void setSizeQuantities(Set<SizeQuantity> sizeQuantities) {
        this.sizeQuantities = sizeQuantities;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "id='" + id + '\'' +
                ", quantity=" + quantity +
                ", sizeQuantities=" + sizeQuantities +
                '}';
    }
}
