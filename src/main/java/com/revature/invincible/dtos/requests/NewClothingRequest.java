package com.revature.invincible.dtos.requests;

import java.math.BigDecimal;

public class NewClothingRequest {
    private String name;
    private BigDecimal price;
    private String product_id;

    public NewClothingRequest() {

    }

    public NewClothingRequest(String name, BigDecimal price, String product_id) {
        this.name = name;
        this.price = price;
        this.product_id = product_id;
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

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    @Override
    public String toString() {
        return "NewClothingRequest{" + "name='" + name + '\'' + ", price=" + price + ", product_id='" + product_id + '\'' + '}';
    }
}
