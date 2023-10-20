package org.college;

public class College {
	
	private void collegeName () {
		System.out.println("College Name: Kings Engineering College");
	}
	
	private void collegeCode () {
		System.out.println("College Code: 2108");
	}
	private void collegeRank () {
		System.out.println("College Rank: ");
	}
	public static void main(String[]args) {
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
		
	}


}
