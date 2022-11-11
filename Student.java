package com.te.studentmanagement;

import com.sun.jdi.Method;

public class Student implements Comparable<Student> {
	int studentId;
	String studentName;
	int studentAge;
	double studentMarks;

	public Student(int studentId, String studentName, int studentAge, double studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.studentName.compareTo(o.studentName);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [studentId=" + studentId + ",studentName=" + studentName + ",studentAge=" + studentAge
				+ ",studentMarks=" + studentMarks + "]";
	}

}
