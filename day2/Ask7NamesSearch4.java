package com.dai.day2;

import java.util.*;
public class Ask7NamesSearch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the 7 new Names : ");
		
		String names[] = new String[7];
		
		for (int i=0; i<names.length; i++)
		{
			names[i] = Input.next();
		}
		
		System.out.println("Enter the name which need to Find : ");
		String FindName = Input.next();
		
		System.out.println(FindName);
		int flag=0;
		for (int i=0; i<names.length; i++)
		{
			if (FindName.equals(names[i]))
			{	
				System.out.println("Found it!");
				flag=1;
			}
		}
		
		if (flag==0)
			System.out.println("Do not Found!");
	}

}
