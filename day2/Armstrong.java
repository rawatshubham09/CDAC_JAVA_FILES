package com.dai.day2;

import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		int num=0;
		System.out.println("Enter the Number : ");
		num = input.nextInt();
		int num2 = num;
		int sum = 0;
		while (num2 > 0)
		{	
			int a = num2%10;
			sum = sum + (a*a*a);
			num2 = num2/10;
		}
		
		if (num==sum)
			System.out.println(num +" Num is Armstrong");
		else
			System.out.println(num +" Num is not Armstrong");
	}

}
