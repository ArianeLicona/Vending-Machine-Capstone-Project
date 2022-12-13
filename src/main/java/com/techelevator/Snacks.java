package com.techelevator;

import java.util.Scanner;

public abstract class Snacks {
    private String locationOfSnacks;
    private String productName;
    private double price;
    private String snackType;

    public Snacks(String locationOfSnacks, String productName, double price, String snackType) {
        this.locationOfSnacks = locationOfSnacks;
        this.productName = productName;
        this.price = price;
        this.snackType = snackType;
    }
}
