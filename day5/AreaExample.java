package day5;

import java.util.Scanner;
public class AreaExample {
	void cube(int a)
	{
		System.out.println("Cube get input : "+ a);
		System.out.println("Volume = "+ a*a*a);
	}
	void square(int b)
	{
		System.out.println("Square get input :"+ b);
		System.out.println("Area : "+b*b);
	}
	void greater(int a, int b, int c)
	{
		if (a>b && a>c)
		{
			System.out.println("Greatest : "+ a);
		}
		else {
		
			if (b>c) {
				System.out.println("Greatest : "+ b);
			}
			else
			{
				System.out.println("Greatest : "+ c);
			}
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		AreaExample obj = new AreaExample();
		int choice;
		while(true) {
			System.out.println("display menu\r\n"
					+ "  1) cube\r\n"
					+ "  2) square\r\n"
					+ "  3) greater\n"
					+ "0) Exit");
			choice = input.nextInt();
			
			if (choice == 1) { obj.cube(3);}
			else if (choice==2) {obj.square(3);}
			else if (choice == 0) {break;}
			else if (choice==3) {obj.greater(7, 3, 5);}
			else {System.out.println("Wrong choice!");}
		
	}
	}
	}


