package com.techelevator;

<<<<<<< HEAD
public class CustomerInput extends Snacks{
    public CustomerInput(String locationOfSnacks, String productName, double price, String snackType) {
        super(locationOfSnacks, productName, price, snackType);
=======
import java.util.Scanner;

public class CustomerInput {

    public static void main(String[] args) { // change main and not static
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter number");

        String customerSelection = userInput.nextLine();
>>>>>>> fd7ae6141fd162ec4e6fe91107d9850fec874693
    }
}
