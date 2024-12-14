package inherit_exception;

import java.util.Scanner;

public class VotingAge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age=s.nextInt();
		
		if (age<18)
		{
			throw new MyException("******TESTING*****");
		}
		else
			System.out.println("Welcome you are allowed to voting");
		}
		catch (MyException er)
		{
			System.out.println(er);
			er.getMessage2();
		}
	}

}
