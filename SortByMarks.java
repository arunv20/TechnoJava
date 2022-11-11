package com.te.studentmanagement;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Double d1 = o1.studentMarks;
		Double d2 = o2.studentMarks;

		return d1.compareTo(d2);
	}

}
