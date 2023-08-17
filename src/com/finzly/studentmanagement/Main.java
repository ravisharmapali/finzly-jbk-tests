package com.finzly.studentmanagement;

public class Main {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.addStudent(111, "Ravi");
		Student stu2 = new Student();
		stu2.addStudent(112, "Jayesh");
		System.out.println(" total students " + Student.getCount());
		stu1 = stu1.removeStudent();
		System.out.println(" total students " + Student.getCount());
		System.out.println("student :" + stu2.getStId() + " " + stu2.getStName());
		System.out.println("student :" + stu1.getStId() + " " + stu1.getStName());

	}
}