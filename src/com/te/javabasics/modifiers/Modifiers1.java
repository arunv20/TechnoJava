package com.te.javabasics.modifiers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Modifiers1 {
	public void publicMethod() {
		System.out.println("i am a public access specifier");
		
	}
	private void privateMethod() {
		System.out.println("i am a private access specifier");
		
	}
	protected void protectedMethod() {
		System.out.println("i am a protected access specifier");
		
	}
	 void defaultMethod() {
		 System.out.println("i am a default access specifier");
		
	}
	 public static void main(String[] args) {
		 Modifiers1 modifiers1 = new Modifiers1();
		 modifiers1.publicMethod();
		 modifiers1.protectedMethod();
		 modifiers1.privateMethod();
		 modifiers1.defaultMethod();
		
	}

}


