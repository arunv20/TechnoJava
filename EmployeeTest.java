package com.te.practice.compara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee=new  Employee(50,"Arun");
		Employee employee1=new  Employee(10,"Zcen");
		Employee employee2=new  Employee(20,"Bun");
		Employee employee3=new  Employee(30,"Done");
		
		ArrayList<Employee>list= new ArrayList<Employee>();
		list.add(employee3);
		list.add(employee2);
		list.add(employee1);
		list.add(employee);
		System.out.println("Before Sorting ");
		for (Employee employee4 : list) {
			System.out.println(employee4);	
		}
		System.out.println("After Sorting ");
		Collections.sort(list);
		for (Employee employee4 : list) {
			System.out.println(employee4);	
		}
		System.out.println("sortById");
		Collections.sort(list, new SortById());
		for (Employee employee4 : list) {
			System.out.println(employee4);
		}
		System.out.println("SortByName");
		Collections.sort(list, new SortByName() );
		for (Employee employee4 : list) {
			System.out.println(employee4);
			
		}

	}

}
