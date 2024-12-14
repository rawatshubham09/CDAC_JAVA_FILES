package com.dai.day2;
import java.util.Scanner;
public class Search8 {
	
	int LinearSearch(int arr[], int num)
	{
		for(int i=0; i< arr.length-1;i++)
		{
		if (arr[i]==num)
			return i;
		}
		return -1; // not found
	}
	
	int BinarySearch(int arr[], int num)
	{
		int left=0;
		int right=arr.length - 1;
		int mid =0;
		
		while (left<right)
		{
			mid = (left+right)/2;
			if (arr[mid]>num)
				right = mid-1;
			else if (arr[mid]<num)
				left = mid + 1;
			else
				return mid;
		}
		return -1; // if number not found
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		Search8 search = new Search8(); // Class Object
		
		int arr[] = {10,22,25,34,45,56,67,77,78,89}; // Taking it as ascending order
		int num=0;
		System.out.println("Enter the Number need to found = ");
		num = input.nextInt(); // taking input from user

		int linearSearchResult = search.LinearSearch(arr, num); 
		int binarySearchResult = search.BinarySearch(arr, num);
		
		System.out.println("Linear Search : "+ linearSearchResult);
		System.out.println("Binary Search : "+ binarySearchResult);
	}	

}
