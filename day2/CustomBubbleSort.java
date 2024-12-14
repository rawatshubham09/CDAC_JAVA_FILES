package com.dai.day2;

import java.util.Arrays;

public class CustomBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {4,44,34,23,12,43};
		
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
