package com.dai.day2;

import java.util.Scanner;
public class BillGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println( "Menu: \n"+ "Rs.100/pizza\r\n"
				+ "Rs.20/puffs\r\n"
				+ "Rs.10/cooldrink\r\n"
				+ "");
		int order[] = new int[3]; // for taking order
		int cost[] = {100,20,10};
		int sum = 0;
		String info[] = {"Enter the no of pizzas bought:","Enter the no of puffs bought:",
				"Enter the no of cool drinks bought:"};
		
		for(int i=0; i<3; i++)
		{
			System.out.println(info[i]);
			order[i] = input.nextInt();
			
			sum = + order[i]*cost[i];
		}
		
		System.out.println("Bill Details : ");
		System.out.println("No. of Pizzas : "+order[0]);
		System.out.println("No. of Puff : "+order[1]);
		System.out.println("No. of Pizzas : "+order[2]);
		System.out.println("No. of Pizzas : "+ sum);
	}

}
