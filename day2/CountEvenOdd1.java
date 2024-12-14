package com.dai.day2;

import java.util.*;

class EvenOdd{
	boolean isEven(int num)
	{
		 if(num%2==0)
			 return true;
		 else
			 return false;
	}
}
public class CountEvenOdd1 {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int array[] = new int[10];
		int evenCount=0;
		int oddCount=0;
		
		EvenOdd obj = new EvenOdd();
		
		System.out.println("Enter 10 no.");
		for(int i=0; i<array.length;i++)
		{
			array[i] = Input.nextInt();
			if (obj.isEven(array[i]))
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("num of Even : "+ evenCount);
		System.out.println("num of Odd : "+ oddCount);
	}

}
