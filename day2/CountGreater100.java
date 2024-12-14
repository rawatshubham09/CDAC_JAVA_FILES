package com.dai.day2;

import java.util.*;

public class CountGreater100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the no. of Integer need to fill");
		int num = Input.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter numbers :");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = Input.nextInt();
		}
		int count = 0;
		System.out.println("Num of Elements greter then 100: ");
		for(int x: arr)
		{	
			if (x>100)
			{
				System.out.print(x+" ");
				count++;
			}
		}
	System.out.println(" : Count: "+ count);
	}

}
