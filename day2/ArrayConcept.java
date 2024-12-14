package com.dai.day2;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[10]; // array all element is zero
		
		int k[] = {3,4,5,4,6,7,8,10};
		
		a[0] = 5;
		a[1] = 32;
		
		
		System.out.println(a); // give address of array
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		
		for(int x:k)
			System.out.println(x);
		
		

	}

}
