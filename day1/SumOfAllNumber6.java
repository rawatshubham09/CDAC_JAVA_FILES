package com.dai.day1;

// //Q 6  Write a function that takes an  10 integer  and returns the sum of all even and odd numbers

import java.util.Scanner;
public class SumOfAllNumber6 {
	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);		
		System.out.println("Enter the 10 number :-");		// This will get the sum and new Input numbers
		int sumEven = 0;
		int sumOdd = 0;
		int num;
		
		for (int i=0; i<10;i++)
		{
			num = n.nextInt();	
			// checking for even number
			if (num%2==0)
				sumEven = sumEven + num;
			else
				sumOdd = sumOdd + num;
		}
	    
		System.out.println("Total Even Sum is : "+sumEven);
		System.out.println("Total Odd Sum is : "+sumOdd);
		
		n.close();
	}
}
