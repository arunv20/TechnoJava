package com.te.javabasics.abstraction;

public interface Car {
	public void accelerate();

	public void brakes();

	public void gear();

	default void airbag() {
		System.out.println("Air bag is on Audi");
	}

	default void gps() {

	}

}
