package day4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionException {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		try
		{
			System.out.print("Enter number 1 : ");
			int a = n.nextInt();
			System.out.print("Enter number 2 : ");
			int b = n.nextInt();
			
			float result = a/b;
			
			System.out.println("Division of "+a+"and"+b +" is = "+ result);
			
		}
		catch (InputMismatchException e)
		{
			System.out.println("Error: Please enter valid Integers.");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error: Division by zero not Allowed");
		}
		finally
		{
			n.close();
		}
	}

}
