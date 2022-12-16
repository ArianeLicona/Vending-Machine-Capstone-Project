package com.techelevator;

import com.techelevator.view.Menu;

import javax.swing.*;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class VendingMachineCLI{

	private double money = 0.00; //need to add a zero for money value


	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };
	private static final String PURCHASE_MENU_OPTIONS_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTIONS_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTIONS_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_OPTIONS_FEED_MONEY, PURCHASE_MENU_OPTIONS_SELECT_PRODUCT, PURCHASE_MENU_OPTIONS_FINISH_TRANSACTION};
	private Scanner userInputMenu;

	private Menu menu;

	private static Inventory inventory = new Inventory();



	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}


	public void run() {

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			System.out.println(choice);
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) { // display vending machine items
				inventory.displayInventory();
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) { // do purchase
				while (true) { //allows us to stay in the loop until broken
					String purchaseChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
					System.out.println(purchaseChoice);
					if (purchaseChoice.equals(PURCHASE_MENU_OPTIONS_FEED_MONEY)) {
						currentMoneyProvided();
					} else if (purchaseChoice.equals(PURCHASE_MENU_OPTIONS_SELECT_PRODUCT)) {
						inventory.displayInventory();
						selectingProducts();
					} else if (purchaseChoice.equals(PURCHASE_MENU_OPTIONS_FINISH_TRANSACTION)) {
						//need to create method
						break;
					}
				}
			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)){
				break;
			}
		}
	}
//	public void displayPurchaseMenu(){
//
//	}


	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		System.out.println("************************************");
		System.out.println("*       Vendo-Matic 800            *");
		System.out.println("************************************");
		System.out.println();
		inventory.inventory(); // calls the method that generates the inventory from the CSV
		cli.run();
	}

	public void selectingProducts() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter item number here: ");
		String itemNumber = userInput.nextLine().toUpperCase();
		boolean isValid = false;
		for (Snacks snacks : inventory.getAllSnacks()) {
				if (itemNumber.equals(snacks.getLocation())) {
					isValid = true;
					if (snacks.getQuantity() < 1){
						System.out.println("Sold out!");
						break;
					}
					if (money >= snacks.getPrice()) {
						System.out.println(snacks.getProductName());
						System.out.println(snacks.getPrice());
						System.out.println(snacks.getQuantity());
						money -= snacks.getPrice();
						NumberFormat formatter = NumberFormat.getCurrencyInstance();
						String moneyString = formatter.format(money);
						System.out.println("Your current balance is: " + moneyString);
						snacks.setQuantity(1); // removes one item
						System.out.println(snacks.printOut());
					} else {
						System.out.println("Not enough money. Please insert more money.");
					}
				}
			}
		if (!isValid){
			System.out.println("INVALID INPUT! TRY AGAIN.");
		}
	}

	//finish transaction method
	public void currentMoneyProvided(){
		Scanner scanner = new Scanner(System.in);
		double moneyProvided = scanner.nextDouble();
		money += moneyProvided;
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(money);
		System.out.println(moneyString);

	}
	//@Override
	public double getBalanceSpent(Map<String, Double> itemsPurchased) {
		double spentAmount = 0.00;
		for (String items : itemsPurchased.keySet()) {
			spentAmount += itemsPurchased.get(items);
		}
		return spentAmount;
	}
	public static void gui(){
		JFrame frame = new JFrame();//creates new frame
		frame.setTitle("Vendo-Matic 800");//sets title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits out of application
		frame.setResizable(false);//prevents frame from being resized
		frame.setSize(500,500);//sets size of frame
		frame.setVisible(true);//Makes frame visible

		//ImageIcon topImage = new ImageIcon(); //adds image
	}

//	@Override
//	public double getReceipt(Map<String, Double> snackPurchased) {
//		double receipt = 0;
//		for (Map.Entry<String, Double> entry: snackPurchased.entrySet()) {
//			receipt += entry.getValue();
//		}
//		return receipt;
//	}
}
