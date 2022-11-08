package com.te.javabasics.abstraction;

import com.te.javabasics.modifiers.Modifiers1;
import com.te.javabasics.modifiers.ModifiersOnNextClass;

public class SpecifierOnOtherPackage extends Modifiers1 {

	public static void main(String[] args) {
		
		SpecifierOnOtherPackage onOtherPackage = new SpecifierOnOtherPackage();
		
		onOtherPackage.publicMethod();
		onOtherPackage.protectedMethod();
		
		
		

	}

}
