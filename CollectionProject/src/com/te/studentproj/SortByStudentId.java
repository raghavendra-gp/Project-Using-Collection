package com.te.studentproj;

import java.util.Comparator;

public class SortByStudentId implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.stuId - o2.stuId;
	}

}
