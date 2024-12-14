package com.dai.day2;

import java.util.Arrays;

public class Add10FindSmallest3 {

	public static void main(String[] args) {
		
		int arr[] = {4,3,6,2,7,11,23,45,67,86,43,1};
		System.out.println("Before Array : "+ Arrays.toString(arr));
		
		int smallest=99999;
		
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = arr[i] + 10;
			
			if (arr[i] < smallest)
				smallest = arr[i];
		}
		
		System.out.println("After Array : "+ Arrays.toString(arr));
		System.out.println("Smallest no: "+smallest);
	}

}
