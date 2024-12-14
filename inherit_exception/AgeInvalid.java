package inherit_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class AgeInvalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Code");
		int code = s.nextInt();
		System.out.println("Code " + code);
		}
		catch(InputMismatchException r)
		{
			System.out.println("Please Enter Proper Input");
		}
	}

}
