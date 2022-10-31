package com.revature.invincible.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.revature.invincible.dtos.requests.NewClothingRequest;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "clothings")
public class Clothing {
    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @JsonManagedReference
    @OneToMany(mappedBy = "clothing", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<ClothingSize> clothingSizes;

    public Clothing() {
    }

    public Clothing(String id, String name, BigDecimal price, Product product, Set<ClothingSize> clothingSizes) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.product = product;
        this.clothingSizes = clothingSizes;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Set<ClothingSize> getClothingSizes() {
        return clothingSizes;
    }

    public void setClothingSizes(Set<ClothingSize> clothingSizes) {
        this.clothingSizes = clothingSizes;
    }

    @Override
    public String toString() {
        return "Clothing{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", price=" + price + ", product=" + product + ", clothingSizes=" + clothingSizes + '}';
    }
}
