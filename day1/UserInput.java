package com.dai.day1;

// WAP to ask name, age, salary from user

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter name");
	String name=s.next();
	
	System.out.println("Enter age");
	
	int age=s.nextInt();
	
	System.out.println("Enter Salary");
	float salary = s.nextFloat();
	
	
	System.out.println(name+" "+age+" "+salary );
	
	
}
}
