package com.dai.day1;

import java.util.Scanner;

public class Employee {
	
		String name;
		int age;
		String address;
		
		static String companyname;
		
		static void banner()
		{
			companyname="CDAC";
			System.out.println(companyname);
		}
		
		public void get()
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter Name");
			name = s.next();
			System.out.println("enter age ");
			age=s.nextInt();
			System.out.println("enter address ");
			address=s.next();
		}
		
		public void display()
		{
			System.out.println(name);
			System.out.println(age);
			System.out.println(address);
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee s = new Employee();
		
		s.get();
		s.display();
	}

}
