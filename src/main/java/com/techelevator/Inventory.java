package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    private List<Snacks> allSnacks = new ArrayList<>();

    public void inventory() {
        File vendingInventory = new File("vendingmachine.csv"); // created an object so that Scanner has something to read through

        try (Scanner scan = new Scanner(vendingInventory)) { //looks through the actual scanner
            while (scan.hasNextLine()) {

                String line = scan.nextLine();

                String[] inventoryToAdd = line.split("\\|"); // use escape operator

                Snacks snacks = null; //need a snack item because it is abstract, so we create variable for future created snacks
                    if (inventoryToAdd[3].equals("Candy")) { // creating if for every type
                        allSnacks.add(snacks = new Candy(inventoryToAdd[0], inventoryToAdd[1], Double.parseDouble(inventoryToAdd[2]), inventoryToAdd[3]));
                    } else if (inventoryToAdd[3].equals("Chip")) { // creating if for every type
                        allSnacks.add(snacks = new Chip(inventoryToAdd[0], inventoryToAdd[1], Double.parseDouble(inventoryToAdd[2]), inventoryToAdd[3]));
                    } else if (inventoryToAdd[3].equals("Drink")) { // creating if for every type
                        allSnacks.add(snacks = new Drinks(inventoryToAdd[0], inventoryToAdd[1], Double.parseDouble(inventoryToAdd[2]), inventoryToAdd[3]));
                    } else if (inventoryToAdd[3].equals("Gum")) { // creating if for every type
                        allSnacks.add(snacks = new Gum(inventoryToAdd[0], inventoryToAdd[1], Double.parseDouble(inventoryToAdd[2]), inventoryToAdd[3]));
                    }
                }
            }

    // Shorting the if statment


//                if (inventoryToAdd.equals("Chip")) {      // will always be false
//                    Snacks potatoCrisps = new Chip("A1", "Potato Crisps", 3.05, "Chip");
//                    allSnacks.add(potatoCrisps);
//
//                } else if (inventoryToAdd.equals("Chip")) {
//                    Snacks b = new Chip("A2", "Stackers", 1.45, "Chip");
//                    allSnacks.add(b);
//
//                } else if (inventoryToAdd.equals("Chip")) {
//                    Snacks c = new Chip("A3", "Grain Waves", 2.75, "Chip");
//                    allSnacks.add(c);
//
//                } else if (inventoryToAdd.equals("Chip")) {
//                    Snacks d = new Chip("A4", "Cloud Popcorn", 3.65, "Chip");
//                    allSnacks.add(d);
//
//                } else if (inventoryToAdd.equals("Candy")) {
//                    Snacks e = new Candy("B1", "Moonpie", 1.80, "Candy");
//                    allSnacks.add(e);
//
//                } else if (inventoryToAdd.equals("Candy")) {
//                    Snacks f = new Candy("B2", "Cowtales", 1.50, "Candy");
//                    allSnacks.add(f);
//
//                } else if (inventoryToAdd.equals("Candy")) {
//                    Snacks g = new Candy("B3", "Wonka Bar", 1.50, "Candy");
//                    allSnacks.add(g);
//
//                } else if (inventoryToAdd.equals("Candy")) {
//                    Snacks h = new Candy("B4", "Crunchie", 1.75, "Candy");
//                    allSnacks.add(h);
//
//                } else if (inventoryToAdd.equals("Drinks")) {
//                    Snacks i = new Drinks("C1", "Cola", 1.25, "Drink");
//                    allSnacks.add(i);
//
//                } else if (inventoryToAdd.equals("Drinks")) {
//                    Snacks j = new Drinks("C2", "Dr. Salt", 1.50, "Drink");
//                    allSnacks.add(j);
//
//                } else if (inventoryToAdd.equals("Drinks")) {
//                    Snacks k = new Drinks("C3", "Mountain Melter", 1.50, "Drink");
//                    allSnacks.add(k);
//
//                } else if (inventoryToAdd.equals("Drinks")) {
//                    Snacks l = new Drinks("C4", "Heavy", 1.50, "Drink");
//                    allSnacks.add(l);
//
//                } else if (inventoryToAdd.equals("Gum")) {
//                    Snacks m = new Gum("D1", "U-Chews", 0.85, "Gum");
//                    allSnacks.add(m);
//
//                } else if (inventoryToAdd.equals("Gum")) {
//                    Snacks n = new Gum("D2", "Little League Chew", 0.95, "Gum");
//                    allSnacks.add(n);
//
//                } else if (inventoryToAdd.equals("Gum")) {
//                    Snacks o = new Gum("D3", "Chiclets", 0.75, "Gum");
//                    allSnacks.add(o);
//
//                } else if (inventoryToAdd.equals("Gum")) {
//                    Snacks p = new Gum("D4", "Triplemint", 0.75, "Gum");
//                    allSnacks.add(p);
//                }

        catch (FileNotFoundException e){
            System.out.println("Invalid input");
        }
    }

    public List<Snacks> getAllSnacks() {
        return allSnacks;
    }

    public void displayInventory() {

        for (Snacks snack : allSnacks) {
            System.out.print(snack.getLocation()+ " ");
            System.out.print(snack.getProductName() + " ");
            System.out.print(snack.getPrice() + " ");
            System.out.print(snack.getQuantity() + "\n");
        }
    }

}
