package com.te.javabasics.abstraction;

import java.util.Scanner;

public class CarHelper  {
	
// Without using the if else method we want to return an object with its function members  
	public static Car getCar() {                //Here we are returning the object type car while calling this method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Car Name ");// getting  input from the user 
		String carName = scanner.next();
		if (carName.equalsIgnoreCase("audi")) {
			return new Audi();                     //if input is audi then it used to return the audi object 

		} else if (carName.equalsIgnoreCase("bmw")) {
			return new Bmw();                     //if input is bmw then it used to return the bmw object 

		} else {
			return null;
		}
	}
	String

}
