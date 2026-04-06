package com.foodapp.services;

import com.foodapp.model.MenuItem;
import com.foodapp.model.Restaurant;

public class RestaurantServices {
    public void showMenu(Restaurant restaurant) {
        System.out.println("Menu of " + restaurant.getName());
        for (MenuItem item : restaurant.getMenu()) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
    }
}