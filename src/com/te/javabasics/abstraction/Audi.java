package com.te.javabasics.abstraction;

public class Audi implements Car {
	public void accelerate() {
		System.out.println("ArunAcceleratesAudi");

	}

	public void brakes() {
		System.out.println("arunstopsAudi");

	}

	public void gear() {
		System.out.println("Audi is on top gear");
	}

	public void gps() {
		System.out.println("Audi is on gps");
	}

}
