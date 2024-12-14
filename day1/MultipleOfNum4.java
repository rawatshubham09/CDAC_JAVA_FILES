package com.dai.day1;

// Q 4    Write a function that takes an integer n and prints the multiplication table for that number (from 1 to 10) using a loop. 

import java.util.Scanner;

public class MultipleOfNum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		
		int num = a.nextInt();
		
		for(int i=1; i<= 10; i++)
			System.out.println(num + " * " + i + " = "+ num*i );
		
		a.close();
	}

}
