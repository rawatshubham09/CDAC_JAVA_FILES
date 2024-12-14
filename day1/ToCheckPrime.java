package com.dai.day1;

// 1) Write a function that checks whether a given number is prime. 
// Use a loop to test for factors, and return true or false based on the result.

import java.util.Scanner;

public class ToCheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = s.nextInt();
		int i=2;
		boolean Notprime = false;
		while (i< num)
		{
			if (num%i==0)
			{
				Notprime = true;
				
			}
			i++;
		}
		
		if(Notprime)
		{
			System.out.println(num + " is not Prime no.");		
		}
		else
			System.out.println(num + " is Prime no.");
		
		s.close();
	}

}
