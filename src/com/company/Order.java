package com.company;

import java.util.ArrayList;

public class Order {

    public ArrayList<Product> products;
    public int tableNumber;
    public Waitress waitress;

    public Order(int tableNumber, Waitress waitress) {
        this.tableNumber = tableNumber;
        this.waitress = waitress;
        this.products = new ArrayList<>();
    }

    public String printBill() {

        double totalPrice = 0;
        for (Product product : this.products) {
            totalPrice = totalPrice + product.price;
        }

        String finalText = "Your waitress was: " + this.waitress.name + ". Bill for table: " + this.tableNumber + " is " + totalPrice + " BGN";

        return finalText;
    }

}
