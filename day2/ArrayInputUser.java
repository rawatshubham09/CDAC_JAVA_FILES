package com.dai.day2;

import java.util.Scanner;
public class ArrayInputUser {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//int b[] = new int[0]; // no compile error but we can not fill value in it
				
		int a[] = new int [5];
		
		System.out.println("Enter the number: ");
		for(int i=0;i<a.length;i++)
		{
		a[i] = in.nextInt();
		}
		
		for (int x : a ) // for x in a -> we have to type same data type in array(Int)
		{
			System.out.println("Value = "+ x);
		}
		
		in.close();
	}

}
