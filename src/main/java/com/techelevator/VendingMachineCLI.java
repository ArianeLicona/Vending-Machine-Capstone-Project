package com.techelevator;

import com.techelevator.view.Menu;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class VendingMachineCLI {


	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

	private Menu menu;
	public String item;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
				try {
					//reading inventory from file and adding it to a list
					File inventoryFile = new File("vendingmachine.csv");
					Scanner scanner = new Scanner(inventoryFile);
					ArrayList<String> inventoryList = new ArrayList<String>();
					while (scanner.hasNextLine()){
						inventoryList.add(scanner.nextLine());
					}
					//printing out items in inventoryList
					for (String element : inventoryList) {
						System.out.println(element);
					}
					scanner.close();

				} catch (Exception e){
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase

			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
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

	public double getReceipt(Map<String, Double> snackPurchased) {
		double receipt = 0;
		for (Map.Entry<String, Double> entry: snackPurchased.entrySet()) {
			receipt += entry.getValue();
		}
		return receipt;
	}
}
