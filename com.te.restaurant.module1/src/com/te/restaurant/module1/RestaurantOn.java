package com.te.restaurant.module1;

import java.util.Scanner;

public class RestaurantOn {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);// creating scanner object
		String[] items = new String[] { "Idly", "Vada", "Dosa", "Poori", "Done" };// declaring
																										// String food
																										// items
		int[] rate = new int[] { 30, 35, 40, 30 ,0};// declaring array of prices
		int[] quan = new int[10]; // getting quantities
		int sum = 0; // to calculate amount intialising 0
		boolean quit = true;

		do {
			System.out.println("ITEM" + "\t\t\tPrice");
			for (int i = 0; i < 5; i++)
				System.out.println((i + 1) + "." + items[i] + "\t\t" + rate[i]); // To display items

			System.out.println("Enter number of food item number choices");
			int choice = input.nextInt(); // getting choices from user
			if (choice > 0 && choice < 5) // if he enters 0 or until 5 we are getting quantities
			{
				System.out.println("enter the no of quantites of " + items[choice - 1]);
				int q = input.nextInt();
				quan[choice - 1] += q;

			} else {
				quit = false;

			}

		} while (quit);

		System.out.println("Your Orders are:\n");
		for (int i = 0; i < 5; i++) {
			if (quan[i] != 0) {
				sum =sum+( quan[i] * rate[i]);
				System.out.println(items[i] + "*   " + quan[i] + "==" + quan[i] * rate[i] + "rs");
			}
		}

		System.out.println("Your total bill=" + sum);

		System.out.println("Your Order placed  successfull");
		input.close();

	}

}