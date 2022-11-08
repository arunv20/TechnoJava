package com.te.javabasics.abstraction;


public class MainClass {

	public static void main(String[] args) {
		
		CarHelper carHelper =  new CarHelper();// Creating an object of Car Helper
		Car car =carHelper.getCar();// calling a method and storing in Car object 
	    Driver driver= new Driver();// to unchange in mainclass we should make changes in here
	    driver.drive(car);//this car stores the object returned by 10th line 
	    StringBuilder builder = new StringBuilder();
		
	}

}
