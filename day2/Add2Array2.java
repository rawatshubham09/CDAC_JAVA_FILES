package com.dai.day2;

import java.util.Arrays;
public class Add2Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {2,3,4,5,6};
		int arr2[] = {7,8,9,10,11};
		
		int arr3[] = new int[5];
		
		for(int i=0; i<arr3.length; i++)
		{
			arr3[i] = arr1[i] + arr2[i];
		}
		
		System.out.println("Array 1 : "+ Arrays.toString(arr1));
		System.out.println("Array 2 : "+ Arrays.toString(arr2));
		System.out.println("Array 3 : "+ Arrays.toString(arr3));
	}

}
