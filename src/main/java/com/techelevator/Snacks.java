package com.techelevator;

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
    }

    public double getPrice() {
        return price;
    }

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
