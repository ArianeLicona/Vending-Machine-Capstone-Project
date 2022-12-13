package com.techelevator;

<<<<<<< HEAD
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

    public String getLocationOfSnacks() {
        return locationOfSnacks;
    }

    public String getProductName() {
        return productName;
=======
public abstract class Snacks {
public String location;
public String name;
public double price;
public String type;

    public Snacks(String location, String name, double price, String type) {
        this.location = location;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    //getters and setters
    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
>>>>>>> fd7ae6141fd162ec4e6fe91107d9850fec874693
    }

    public double getPrice() {
        return price;
    }

<<<<<<< HEAD
    public String getSnackType() {
        return snackType;
    }
}
=======
    public String getType() {
        return type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Methods
    
}
>>>>>>> fd7ae6141fd162ec4e6fe91107d9850fec874693
