package com.example.good.patterns.challenges;

public interface OrderRepository {

    void createOrder(User user, String product, Double quantity);

}
