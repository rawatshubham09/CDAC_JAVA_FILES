package inherit_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class SqureRoot {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number to find Square Root : ");
		try {
			int num = input.nextInt();
			double squreRoot = Math.sqrt(num);
			System.out.println("Square Root : "+ squreRoot);
		}
		catch (InputMismatchException e)
		{
			System.out.println("Enter Positive Integer only");
		}
		finally {
			input.close();
		}
		
	}

}
