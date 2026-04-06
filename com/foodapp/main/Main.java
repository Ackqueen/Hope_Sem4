package com.foodapp.main;

import com.foodapp.model.*;
import com.foodapp.services.OrderServices;
import com.foodapp.services.RestaurantServices;
import com.foodapp.util.ValidationUtil;
import com.foodapp.exceptions.InvalidOrderException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        try {
            if (!ValidationUtil.isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid email format!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            sc.close();
            return;
        }

        User user = new User(name, email);

        Restaurant homefoods = new Restaurant("Home Foods");
        Restaurant spicytreats = new Restaurant("Spicy Treats");
        Restaurant elementcoffee = new Restaurant("Element Coffee");

        homefoods.addMenuItem(new MenuItem("Sambar rice", 100));
        homefoods.addMenuItem(new MenuItem("Rasam rice", 100));
        homefoods.addMenuItem(new MenuItem("Idly, sambar, chutney", 80));
        homefoods.addMenuItem(new MenuItem("Poori channa", 150));

        spicytreats.addMenuItem(new MenuItem("Biryani", 250));
        spicytreats.addMenuItem(new MenuItem("Chicken Curry", 300));
        spicytreats.addMenuItem(new MenuItem("Veg Biryani", 150));
        spicytreats.addMenuItem(new MenuItem("Curry", 100));

        elementcoffee.addMenuItem(new MenuItem("Filter Coffee", 40));
        elementcoffee.addMenuItem(new MenuItem("Cappuccino", 80));
        elementcoffee.addMenuItem(new MenuItem("Latte", 100));
        elementcoffee.addMenuItem(new MenuItem("Cold Coffee", 220));

        List<Restaurant> restaurants = Arrays.asList(homefoods, spicytreats, elementcoffee);

        System.out.println("\nChoose a Restaurant:");
        for (int i=0; i<restaurants.size(); i++) {
            System.out.println((i+1) + ". " +restaurants.get(i).getName());
        }

        int res = sc.nextInt();
        Restaurant selectedRestaurant = restaurants.get(res - 1);

        RestaurantServices restaurantService = new RestaurantServices();
        restaurantService.showMenu(selectedRestaurant);

        Order order = new Order(user);

        int choice;
        do {
            System.out.println("\nSelect item number to add (0 to finish):");

            List<MenuItem> menu = selectedRestaurant.getMenu();
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i+1) + ". " + menu.get(i).getName() + "-" + menu.get(i).getPrice());
            }
            choice = sc.nextInt();
            if (choice > 0 && choice <= menu.size()) {
                order.addItem(menu.get(choice - 1));
                System.out.println("Item added!");
            } else if (choice != 0) {
                System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        OrderServices os = new OrderServices();
        try {
            os.placeOrder(order);
        } catch (InvalidOrderException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");

        int payChoice = sc.nextInt();
        Payment payment;
        if (payChoice == 1) {
            payment = new Payment() {
                @Override
                public void pay(int amount) {
                    System.out.println("Paid via UPI: " + amount);
                }
            };
        } else {
            payment = new Payment() {
                @Override
                public void pay(int amount) {
                    System.out.println("Paid via Credit Card: " + amount);
                }
            };
        }
        payment.pay(order.getTotalAmount());
        order.setStatus("Delivered");
        order.printOrder();

        sc.close();
    }
}