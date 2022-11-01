package com.revature.invincible.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.revature.invincible.dtos.requests.NewProductRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Clothing> clothings;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
