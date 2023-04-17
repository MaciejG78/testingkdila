package com.example.good.patterns.food2door.producers;

import com.example.good.patterns.food2door.OrderRequest;

public class ExtraFoodShop implements Producer{

    private final String name = "ExtraFoodShop";

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Producent " + name + " zrealizował następujące zamówienie:");
        System.out.println(orderRequest);
    }

    @Override
    public String toString() {
        return "Nazwa producenta: " + name;
    }
}
