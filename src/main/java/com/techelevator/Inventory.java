package com.techelevator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    private List<Snacks> allSnacks = new ArrayList<>();

    public void inventory() throws FileNotFoundException {
        try (Scanner scan = new Scanner("vendingmachine.csv")) {
            while (scan.hasNextLine()) {

                String line = scan.nextLine();
                String [] inventoryToAdd = line.split("|" , 5);

                if (inventoryToAdd.equals("Chip")) {
                   Snacks potatoCrisps = new Chip("A1", "Potato Crisps", 3.05, "Chip");
                   allSnacks.add(potatoCrisps);

                } else if (inventoryToAdd.equals("Chip")) {
                    Snacks b = new Chip("A2","Stackers",1.45, "Chip") ;
                    allSnacks.add(b);

                } else if (inventoryToAdd.equals("Chip")) {
                    Snacks c = new Chip("A3","Grain Waves", 2.75, "Chip");
                    allSnacks.add(c);

                } else if (inventoryToAdd.equals("Chip")) {
                    Snacks d = new Chip("A4", "Cloud Popcorn",3.65,"Chip") ;

            }

            }
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
