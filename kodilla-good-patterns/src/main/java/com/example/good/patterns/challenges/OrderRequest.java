package com.example.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderDate;
    private String product;
    private Double quantity;

    public OrderRequest(User user, LocalDateTime orderDate, String product, Double quantity) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getProduct() {
        return product;
    }

    public Double getQuantity() {
        return quantity;
    }
}
