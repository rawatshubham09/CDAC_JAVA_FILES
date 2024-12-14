package com.dai.day2;

import java.util.*;

public class LinearSearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,61,63};
		int flag = 0;
		
		int numm;
		System.out.println("Enter the number need to Found in Array : ");
		numm = in.nextInt();
		
		for(int i : a)
		{
			if (numm == i)
			{
				System.out.println("Number Found inside the array");
				flag=1;
				break;
			}
		}
		
		if (flag == 0)
		{
			System.out.println("Number not Found ! ");
		}

	}

}
