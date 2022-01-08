package org.department;

import org.college.College;

public class Department extends College {
	 public void departmentName() {
		 System.out.println("The dept is Chemical Engg.");
		

	}

	public static void main(String[] args) {
		Department dept = new Department();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeRank();
		dept.departmentName();
		

	}

}
