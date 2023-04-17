package com.example.good.patterns.food2door;

import com.example.good.patterns.food2door.producers.ExtraFoodShop;
import com.example.good.patterns.food2door.producers.HealthyShop;

import java.time.LocalDateTime;

public class Food2DoorApp {

    public static void main(String[] args) {
        User user1 = new User("Adam", "Testowy", "ul. Testowa 5, 00-950 Warszawa", "adam@wp.pl", "123456789");
        Product product1 = new Product("Pomidor", 25.45, 2);
        HealthyShop producer1 = new HealthyShop();
        Order order1 = new Order(user1, product1, LocalDateTime.now());

        OrderRequest orderRequest1 = new OrderRequest(order1, producer1);

        User user2 = new User("Ewa", "Testowa", "ul. Testowa 5, 00-950 Warszawa", "adam@wp.pl", "123456789");
        Product product2 = new Product("Zapiekanka", 45.00, 1);
        ExtraFoodShop producer2 = new ExtraFoodShop();
        Order order2 = new Order(user2, product2, LocalDateTime.now());

        OrderRequest orderRequest2 = new OrderRequest(order2, producer2);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(orderRequest1);
        orderProcessor.process(orderRequest2);

    }
}
