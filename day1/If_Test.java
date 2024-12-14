package com.dai.day1;

public class If_Test {

	public static void main(String[] args) {
		
		int a=5;
		
		// it will run only one and exit for others
		
		if(a<10)
		{
			System.out.println("welcome");
		}
		else if (a<15)
		{
			System.out.println("hello");
		}
		else if (a<20)
		{
			System.out.println("testing");
		}
		
		
		// this will run each condition
		
		if(a<10)
		{
			System.out.println("welcome2");
		}
		if (a<15)
		{
			System.out.println("hello2");
		}
		if (a<20)
		{
			System.out.println("testing2");
		}
		
	}

}
