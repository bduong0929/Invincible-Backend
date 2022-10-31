package com.revature.invincible.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.revature.invincible.dtos.requests.NewProductRequest;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Clothing> clothings;


    public Product() {
    }

    public Product(String id, NewProductRequest req) {
        this.id = id;
        this.name = req.getName();
    }

    public Product(String id, String name, List<Clothing> clothings) {
        this.id = id;
        this.name = name;
        this.clothings = clothings;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Clothing> getClothings() {
        return clothings;
    }

    public void setClothings(List<Clothing> clothings) {
        this.clothings = clothings;
    }

    @Override
    public String toString() {
        return "Product{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", clothings=" + clothings + '}';
    }
}
