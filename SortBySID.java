package com.te.studentmanagement;

import java.util.Comparator;

public class SortBySID implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentId-o2.studentId;
	}

	
	

}
