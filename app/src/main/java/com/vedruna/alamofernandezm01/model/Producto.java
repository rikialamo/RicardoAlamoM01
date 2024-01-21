package com.vedruna.alamofernandezm01.model;

import androidx.annotation.NonNull;

public class Producto {
    private int id;
    private String name;
    private int price;

    public Producto(){}

    public Producto(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() ;
    }
}
