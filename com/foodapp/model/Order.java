package com.foodapp.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private User user;
    private List<MenuItem> items;
    private String status;

    public Order(User user) {
        this.user = user;
        this.items = new ArrayList<>();
        this.status = "PENDING";
    }
    public void addItem(MenuItem item) {
        items.add(item);
    }
    public int getTotalAmount() {
        int total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void printOrder() {
        System.out.println("User: " + user.getName());
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total: " + getTotalAmount());
        System.out.println("Status: " + status);
    }
}