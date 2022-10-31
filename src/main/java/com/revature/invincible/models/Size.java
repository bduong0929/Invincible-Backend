package com.revature.invincible.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sizes")
public class Size {
    @Id
    private String id;

    @Column(name = "size", nullable = false)
    private String size;

    @JsonManagedReference
    @OneToMany(mappedBy = "size", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<ClothingSize> clothingSizes;

    @JsonManagedReference
    @OneToMany(mappedBy = "size", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<SizeQuantity> sizeQuantities;

    public Size() {
    }

    public Size(String id, String size, Set<ClothingSize> clothingSizes, Set<SizeQuantity> sizeQuantities) {
        this.id = id;
        this.size = size;
        this.clothingSizes = clothingSizes;
        this.sizeQuantities = sizeQuantities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Set<ClothingSize> getClothingSizes() {
        return clothingSizes;
    }

    public void setClothingSizes(Set<ClothingSize> clothingSizes) {
        this.clothingSizes = clothingSizes;
    }

    public Set<SizeQuantity> getSizeQuantities() {
        return sizeQuantities;
    }

    public void setSizeQuantities(Set<SizeQuantity> sizeQuantities) {
        this.sizeQuantities = sizeQuantities;
    }

    @Override
    public String toString() {
        return "Size{" +
                "id='" + id + '\'' +
                ", size='" + size + '\'' +
                ", clothingSizes=" + clothingSizes +
                ", sizeQuantities=" + sizeQuantities +
                '}';
    }
}
