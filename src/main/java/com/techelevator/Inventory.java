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
                String [] divideInventory = line.split("|" , 5);

                if (divideInventory.equals("Chip")) {
                   Snacks potatoCrisps = new Chip("A1", "Potato Crisps", 3.05, "Chip");
                   allSnacks.add(potatoCrisps);

                } else if (divideInventory.equals("Candy")) {
                    Snacks b = new Candy() ;

                } else if (divideInventory.equals("Drinks")) {
                    Snacks c = new Drinks() ;

                } else if (divideInventory.equals("Gum")) {
                    Snacks d = new Gum() ;

            }

            }
        }
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
