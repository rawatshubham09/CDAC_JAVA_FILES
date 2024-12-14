package day7_stream_reflection_lambda;

import java.util.function.Predicate;

import java.util.Scanner;
public class PredicateAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Predicate<Integer> x = num-> num >0;
		
		Predicate<Integer> y= num-> num%2==0;
		
		Predicate<Integer> isPositiveAndEven = x.and(y);
		
		System.out.print("Enter the number : ");
		int number = scanner.nextInt();
		
		if (isPositiveAndEven.test(number))
		{
			System.out.println("Sccess");
		}
		else
		{
			System.out.println("Fail");
		}
		
		scanner.close();
	}

}
