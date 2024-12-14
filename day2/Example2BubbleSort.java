package com.dai.day2;

import java.util.*;

public class Example2BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int a[] = new int[10];
		
		System.out.println("Enter the 10 number in Array :");
		for(int i=0; i<a.length; i++)
		{
			a[i] = input.nextInt();
		}
		int temp=0;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-i-1; j++)
				
				if (a[j] > a[j+1])
				{
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
