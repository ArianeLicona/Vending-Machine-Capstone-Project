package com.techelevator;

import java.util.Scanner;

public class CustomerInput {

    public static void main(String[] args) { // change main and not static
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter number");

        String customerSelection = userInput.nextLine();
    }
}
