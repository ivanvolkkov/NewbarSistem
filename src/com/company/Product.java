package com.company;

public class Product {

    public String name;
    public String quantity;
    public double price;

    public Product(String name, String quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return this.name;
    }
}
