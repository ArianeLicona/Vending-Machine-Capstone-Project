package com.techelevator;

import java.util.Scanner;

public abstract class Snacks {
    private String location;
    private String productName;
    private double price;
    private String snackType;
    private int quantity;

    public Snacks(String location, String productName, double price, String snackType, int quantity) {
        this.location = location;
        this.productName = productName;
        this.price = price;
        this.snackType = snackType;
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
    public String getSnackType() {
        return snackType;
    }
    public int getQuantity() {
        return quantity;
    }

    public abstract String printOut();
}
