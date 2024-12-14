package com.dai.day1;

// 2 ) Write a function that takes a student's score as an argument 
//     and returns a letter grade based on the following scale:
//     	90-100: A		80-89: B		70-79: C		60-69: D		Below 60: F
//Use if-else statements to determine the grade.  

import java.util.Scanner;

public class ClassRank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Enter the Marsk of Student : ");
		
		int num = a.nextInt();
		
		System.out.print("\nStudent Grade : ");
		// if-else Statement
		
		if (num >= 90)
			System.out.println("A");
		else if(num>=80)
			System.out.println("B");
		else if(num>70)
			System.out.println("C");
		else if(num>60)
			System.out.println("D");
		else
			System.out.println("F");
		
		a.close();
	}

}
