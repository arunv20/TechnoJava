package com.te.exceptionhandling;

public class BankAccount {
	double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}

	double amount;
	
	public void withdraw(double amount) {
		if (this.balance>amount) {
			System.out.println("Your balance is"+this.balance);
			this.balance -= amount;
			System.out.println(amount + "Rs. Withdrawn");
			System.out.println("Remaning balance:" + this.balance);
			
		}
		else {
			throw new InsufficientBalException("Insufficient balance!!!");
		}
		
	}

}
