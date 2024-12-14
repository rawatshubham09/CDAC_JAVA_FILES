package com.dai.day1;

// Q 3   Create a function that takes an integer and returns the sum of its digits.
// Use a loop to extract each digit and perform  the sum.

import java.util.Scanner;

public class DigitSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		
		int num = a.nextInt();
		int summ = 0;
		
		while (num>0)
		{
			
			summ = summ + num%10;
			
			num= num/10;
			
		}	
		
		System.out.println("\nSum of Digit is : "+ summ);
		
		a.close();
		
	}

}
