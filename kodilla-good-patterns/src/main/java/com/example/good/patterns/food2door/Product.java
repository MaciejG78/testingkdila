package com.example.good.patterns.food2door;

public class Product {

    private String productName;
    private double price;
    private long quantity;

    public Product(String productName, double price, long quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public long getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Nazwa: " + productName + ", cena: " + price + "zł , ilość: " + quantity;
    }
}
