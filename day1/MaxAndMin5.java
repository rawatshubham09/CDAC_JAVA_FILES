package com.dai.day1;

// Q 5  Write a function that takes an array of integers and returns both the maximum and minimum values using a loop. 
// Print the results in the main program.


import java.util.Scanner;

public class MaxAndMin5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number of Integer : ");
		
		int n = a.nextInt();
		
		System.out.println("Enter the Numbers 1 : ");
		int newNum = a.nextInt();
		
		int max = newNum;
		int min = newNum;
		
		for(int i=2; i<n+1;i++)
		{	
			System.out.println("Enter the Numbers "+i+" : ");
			newNum = a.nextInt();
			
			if (newNum > max)
				max=newNum;
			
			if (newNum< min)
				min=newNum;
		}
		
		System.out.println("Minimum number : "+min);
		System.out.println("Maximum number : "+max);
		a.close();
	}

}
