package com.te.studentproj;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class StudentDrive {
	static Student student;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int id;
		String name;
		int data;
		int age;
		int math;
		int science;
		int language;
		int totalMark;
		char ch;

		System.out.println("How many datas you wanna enter: ");
		data = scanner.nextInt();
		HashSet<Student> hashSet = new HashSet<Student>();

		for (int i = 0; i < data; i++) {

			System.out.println("Enter the student id: ");
			id = scanner.nextInt();

			System.out.println("Enter the student name: ");
			name = scanner.next();

			System.out.println("Enter the student age: ");
			age = scanner.nextInt();

			System.out.println("Enter the math marks: ");
			math = scanner.nextInt();
			if (math > 100) {
				System.out.println("Enter valid marks: ");
				break;
			}
			try {
				if (math < 35) {
					throw new FailedException("Youre Failed!! Sorry");
				}
			} catch (FailedException e) {
				System.out.println(e.getMessage());
				break;
			}

			System.out.println("Enter the science marks: ");
			science = scanner.nextInt();
			if (science > 100) {
				System.out.println("Enter valid marks: ");
				break;
			}
			try {
				if (science < 35) {
					throw new FailedException("Youre Failed!! Sorry");
				}
			} catch (FailedException e) {
				System.out.println(e.getMessage());
				break;
			}

			System.out.println("Enter the language marks: ");
			language = scanner.nextInt();
			if (language > 100) {
				System.out.println("Enter valid marks: ");
				break;
			}
			try {
				if (language < 35) {
					throw new FailedException("Youre Failed!! Sorry");
				}
			} catch (FailedException e) {
				System.out.println(e.getMessage());
				break;
			}

			totalMark = (math + science + language) / 3;

			hashSet.add(new Student(id, name, age, totalMark));

		}

		System.out.println();
		System.out.println("The entered Data is : ");
		for (Student o : hashSet) {
			System.out.println(o);
		}

		System.out.println();
		ArrayList<Student> arrayList = new ArrayList<Student>(hashSet);

		do {
			System.out.println("Do you wanna soooooorttttt: (y/n)");
			ch = scanner.next().charAt(0);

			if (ch == 'y') {

				System.out.println(arrayList);

				Student.choiceMeth(arrayList);
			} else {
				System.out.println("Ba Byeee");
			}

		} while (ch == 'y');

	}

}
