package com.dai.day1;


import java.util.Scanner;

public class Switchcase {


	public static void main(String[] args) {
		
	Scanner s= new Scanner(System.in);
	
	System.out.println("Enter the Choice");
	
	int a=s.nextInt();
	
	switch(a)
	{
	case 1: System.out.println("Welcome");
		break;
	
	case 2: System.out.println("hello");
		break;
	default : System.out.println("TATA");
	}
}
}
