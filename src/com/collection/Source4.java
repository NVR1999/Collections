package com.collection;

import java.util.HashMap;
import java.util.Map;

class Salary {
	HashMap<String, Integer> empList = new HashMap<>();

	public int totalSalary() {
		int total = 0;
		for (Map.Entry<String, Integer> set : empList.entrySet()) {
			total = total + set.getValue();
		}
		return total;
	}

	public String getSalary(String designation) {
		return String.valueOf(empList.get(designation));
	}

	public void updateSalary(String designation, int newSalary) {
		empList.replace(designation, newSalary);
	}
}

public class Source4 {
	public static void main(String args[]) {
		Salary obj = new Salary();
		obj.empList.put("CEO", 20000);
		obj.empList.put("Developer", 50000);
		System.out.println(obj.totalSalary());
		obj.updateSalary("Developer", 60000);
		System.out.println("salary is " + obj.getSalary("Developer"));
		System.out.println("salary is " + obj.totalSalary());
	}
}
