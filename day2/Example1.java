package com.dai.day2;
// take 7 number and send sum them and store the value

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = new int[7];
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter the Numbers");
		 for(int i=0; i< a.length; i++)
		 {
			 
			 a[i] = input.nextInt();
		 }
		 
		 int summ = 0;
		 for(int x:a)
			 summ = summ + x;
			 
		System.out.println("Total Sum of Numbers = "+ summ);
		
		input.close();
}

}
