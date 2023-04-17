package com.example.good.patterns.food2door;

import com.example.good.patterns.food2door.producers.ExtraFoodShop;
import com.example.good.patterns.food2door.producers.GlutenFreeShop;
import com.example.good.patterns.food2door.producers.HealthyShop;
import com.example.good.patterns.food2door.producers.Producer;

public class OrderProcessor {

    public void process(OrderRequest orderRequest) {
        Producer producer = getProducer(orderRequest);
        if (producer != null) {
            producer.process(orderRequest);
        }
    }

    private Producer getProducer(OrderRequest orderRequest) {
        switch (orderRequest.getProducer().getClass().getSimpleName()) {
            case "ExtraFoodShop" -> {
                return new ExtraFoodShop();
            }
            case "GlutenFreeShop" -> {
                return new GlutenFreeShop();
            }
            case "HealthyShop" -> {
                return new HealthyShop();
            }
        }
        return null;
    }
}
