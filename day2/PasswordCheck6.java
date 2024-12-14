package com.dai.day2;

import java.util.*;
public class PasswordCheck6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int password=0;
		int attempt = 3;
		int flag = 0;
		while(attempt!=0)
		{
			System.out.print("Enter the Password :");
			password = input.nextInt();
			if (password != 123)
			{
				System.out.println("Wrong Password, Try Again!");
				attempt--;
			}
			else
			{
				System.out.println("Password Correct, Welcome User.");
				flag = 1;
				break;
			}
		}
		if (flag==0)
			System.out.println("You Card is Blocked!");
	}

}
