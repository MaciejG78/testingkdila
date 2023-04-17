package com.example.good.patterns.food2door;

import com.example.good.patterns.food2door.producers.Producer;

public class OrderRequest {
    private Order order;
    private Producer producer;

    public OrderRequest(Order order, Producer producer) {
        this.order = order;
        this.producer = producer;
    }

    public Order getOrder() {
        return order;
    }

    public Producer getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Zamówienie: " + order + ", Producent: " + producer;
    }
}
