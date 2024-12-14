package com.dai.day2;

import java.util.*;
public class IntegerShort7 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int EvenCount = 0;
		int OddCount = 0;
		int PositiveCount = 0;
		int NegativeCount = 0;
		int ZeroCount = 0;
		int num = 0;
		
		for(int i=0;i<20;i++)
		{
			num = input.nextInt();
			if (num>0)
			{
				PositiveCount++;
				if (num%2==0)
					EvenCount++;
				else
					OddCount++;
			}
			else if (num<0)
			{
				NegativeCount++;
				if (num%2==0)
					EvenCount++;
				else
					OddCount++;
			}
			else
				ZeroCount++;
		}
		System.out.println("Positive numbers: "+ PositiveCount);
		System.out.println("Negative numbers: "+ NegativeCount);
		System.out.println("Zero Count "+ ZeroCount);
		System.out.println("Even numbers: "+ EvenCount);
		System.out.println("Odd numbers: "+ OddCount);
	}

}
