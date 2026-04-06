package com.foodapp.services;

import com.foodapp.model.Order;
import com.foodapp.exceptions.InvalidOrderException;

public class OrderServices {
    public void placeOrder(Order order) throws InvalidOrderException {
        if (order.getTotalAmount() == 0) {
            throw new InvalidOrderException("Order is empty!");
        }
        System.out.println("Order placed successfully!");
    }
}