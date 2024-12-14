package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyCalculator
{
	long power(int n, int p) throws Exception
	{
		long result=0;
		if (n<=0 || p<=0)
		{
			throw new Exception("Both number and power should be grater than Zero");
			
		}
		else
		{
			result = (long) Math.pow(n,p);
		}
			
		return result;
	}
}

public class NewCalculator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		MyCalculator obj = new MyCalculator();
		
		System.out.print("Enter the Number : ");
		int n = input.nextInt();
		System.out.print("Enter the power : ");
		int p = input.nextInt();
		
		long result = obj.power(n,p);
		
		System.out.println("Result = "+ result);
		
		input.close();
	}

}
