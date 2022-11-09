package com.te.exceptionhandling;

public class RunAccount {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000.0);
		try {
			account.withdraw(2000000.0);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
	}

}
