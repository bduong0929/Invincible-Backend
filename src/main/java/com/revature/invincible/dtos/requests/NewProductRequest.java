package com.revature.invincible.dtos.requests;

public class NewProductRequest {
    private String name;

    public NewProductRequest() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NewProductRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
