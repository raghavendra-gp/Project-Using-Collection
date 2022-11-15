package com.te.studentproj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {

	static Scanner scanner = new Scanner(System.in);

	public int stuId;
	public String stuName;
	public int stuAge;

	public int stuMark;

	public Student(int id, String name, int age, int totalMark) {
		this.stuId = id;
		this.stuName = name;
		this.stuAge = age;
		this.stuMark = totalMark;
	}

	@Override
	public String toString() {
		return "[ " + stuId + ", " + stuName + ", " + stuAge + ", " + stuMark + " ]";
	}

	@Override
	public int hashCode() {

		return stuId;
	}

	@Override
	public boolean equals(Object obj) {

		Student other = (Student) obj;

		if (stuId == other.stuId) {
			try {
				throw new DataExistException("Data with same student ID");
			} catch (DataExistException e) {
				System.out.println(e.getMessage());
			}
			return true;
		} else
			return true;
	}
	

	public static void choiceMeth(ArrayList<Student> arrayList) {
		
		

		System.out.println("Press 1 to sort based on student ID");
		System.out.println("Press 2 to sort based on student Name");
		System.out.println("Press 3 to sort based on student Age");
		System.out.println("Press 4 to sort based on student Marks");

		System.out.println("Enter your choice ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			// System.out.println();
			Collections.sort(arrayList, new SortByStudentId());
			for (Object o : arrayList) {
				System.out.println(o);
			}
			break;
		case 2:
			Collections.sort(arrayList, new SortByStudentName());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		case 3:
			Collections.sort(arrayList, new SortByStudentAge());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		case 4:
			Collections.sort(arrayList, new SortByStudentMarks());
			for (Student student : arrayList) {
				System.out.println(student);
			}
			break;
		default:
			break;
		}

			
	}

	

}
