package com.foodapp.model;

public class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
