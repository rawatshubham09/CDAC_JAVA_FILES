package com.dai.day2;

import java.util.*;

public class BinarySearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Default Binary search builtin method
		
		Scanner in = new Scanner(System.in);
		
		int arr[] = {10,20,30,40,50};
		
		System.out.println("Enter the number to be found");
		int num = in.nextInt();
		int flag=0;
		
		int positon = Arrays.binarySearch(arr,num); // buildIn method it return -1 if position not found
		
		System.out.println(positon);
		
		
		// Custom binary Search Methods
		
		System.out.println("Inside Custom Binary Search");
		int left=0;
		int right = arr.length;
		int mid=0;
		while (left<right)
		{
			mid = (left+right)/2;
			
			if (arr[mid]> num)
			{
				right = mid -1;
			}
			else if (arr[mid]<num)
			{
				left = mid + 1;
			}
			
			else
			{
				System.out.println("Found, Index of Number is : "+ mid);
				flag = 1;
				break;
			}
			
		}
		
		if (flag==0)
		{
			System.out.println("Not Found!");
		}
		
		in.close();
	}
	

}
