package org.college;

public class College {
	public void collegeName() {
		System.out.println("Anna University");

	}
	public void collegeCode() {
		System.out.println("1100100");

	}
	public void collegeRank() {
		System.out.println("College rank is 1");

	}
	public static void main(String[] args) {
		College obj = new College();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
	}

}
