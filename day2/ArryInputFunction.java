package com.dai.day2;

import java.util.Arrays;

class NewClass
{
	void printArray(int arr[])
	{
		System.out.println(Arrays.toString(arr));
	}
}

public class ArryInputFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int arr[] = {23,32,34,43,45,54,56,65};
		
		NewClass a = new NewClass();
		
		a.printArray(arr);
	}

}
