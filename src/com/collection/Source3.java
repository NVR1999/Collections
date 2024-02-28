package com.collection;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student {
	String name;
	int roll;

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return this.name;
	}

	public int getRoll() {
		return this.roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
}

class Record {
	List<Student> students = new ArrayList<Student>();

	public String addStudents(Student student) {
		String str = student.getName();
		if ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$"))) {
			students.add(student);
		} else {
			return "Invalid name";
		}
		return "Added";
	}

	public String swapRolls(Student s1, Student s2) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName() == s1.getName() && students.get(i).getRoll() == s1.getRoll()) {
				students.set(i, s2);
			} else if (students.get(i).getName() == s2.getName() && students.get(i).getRoll() == s2.getRoll()) {
				students.set(i, s1);
			}
		}
		return "Swapped";
	}
}

public class Source3 {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student("A", 1);
		Record record = new Record();
		record.addStudents(s1);
		System.out.println(record.addStudents(s1));
		Student s2 = new Student("B", 2);
		System.out.println(record.addStudents(s2));
		System.out.println(record.swapRolls(s1, s2));
	}
}
