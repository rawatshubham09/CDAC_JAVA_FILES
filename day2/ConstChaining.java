package com.dai.day2;

public class ConstChaining {

	ConstChaining() // 1
	{
		System.out.println("No Argument");
	}
	
	ConstChaining(int r) // 2
	{
		System.out.println("With Argument "+ r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstChaining a=new ConstChaining(); // 1
		ConstChaining b=new ConstChaining(22); // 2
	}

}
