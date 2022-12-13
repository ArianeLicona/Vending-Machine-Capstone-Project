package com.techelevator;
import java.util.Scanner;

public class CustomerInput extends Snacks{
    public CustomerInput(String locationOfSnacks, String productName, double price, String snackType) {
        super(locationOfSnacks, productName, price, snackType);
    }
        public void scan(){ 
                Scanner userInput = new Scanner(System.in);
                System.out.println("Please enter number");

                String customerSelection = userInput.nextLine();
            }
        }
