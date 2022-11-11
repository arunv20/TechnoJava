package com.te.studentmanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentIsPresent {
	int choice;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student student = new Student(1, "Arun", 5, 90);
		Student student1 = new Student(2, "Kumar", 6, 80);
		Student student2 = new Student(3, "helenski", 5, 100);
		Student student3 = new Student(4, "tokoyo", 5, 60);
		Student student4 = new Student(5, "Chennai", 5, 54);

		ArrayList<Student> studentsList = new ArrayList<Student>();
		studentsList.add(student4);
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student1);
		studentsList.add(student);

		int i = 1;

		while (i == 1) {

			System.out.println("Please Enter your choices");
			System.out.println("Sort by Student ID - Press 1 ");
			System.out.println("Sort by Student Name - Press 2");
			System.out.println("Sort by Student Age - Press 3");
			System.out.println("Sort by Student Marks - Press 4");
			int choice = scanner.nextInt();
			if (choice > 4) {
				try {
					throw new InvalidInputExcception("Please Enter a Valid Input ");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			if (choice == 1) {
				Collections.sort(studentsList, new SortBySID());
				for (Student student5 : studentsList) {
					System.out.println(student5);

				}
			}

			if (choice == 2) {
				Collections.sort(studentsList, new SortBySName());
				for (Student student5 : studentsList) {
					System.out.println(student5);

				}
			}

			if (choice == 3) {
				Collections.sort(studentsList, new SortByAge());
				for (Student student5 : studentsList) {
					System.out.println(student5);

				}
			}

			if (choice == 4) {
				Collections.sort(studentsList, new SortByMarks());
				for (Student student5 : studentsList) {
					System.out.println(student5);

				}
			}

			System.out.println("If you want to see other sorting Continue 1 or 0");

			int choice2 = scanner.nextInt();
			if (choice2 == 0) {
				i = 0;
				System.out.println("thank you come Again");
				break;

			}

		}
	}

}
