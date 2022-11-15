package com.te.studentproj;

import java.util.Comparator;

public class SortByStudentAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.stuAge - o2.stuAge;
	}

	

}
