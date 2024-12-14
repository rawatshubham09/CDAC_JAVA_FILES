package inherit_exception;

import java.util.Scanner;
public class ValidAge {

	public static void main(String[] args) throws MyException{

		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age=s.nextInt();
		
		if (age<18)
		{
			throw new MyException();
		}
		else
			System.out.println("Welcome you are allowed to voting");
	}

}
