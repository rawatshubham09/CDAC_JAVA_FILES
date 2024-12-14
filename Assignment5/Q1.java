package Assignment5;

// Build Even odd using Predicate
import java.util.Scanner;
import java.util.function.Predicate;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//This will return 1 for even number and 0 for odd
		
		Predicate<Integer> isEven = num->num%2==0 ;
		System.out.print("Enter the number : ");
		int num = scanner.nextInt();
		
		if (isEven.test(num)) {System.out.println(num+" is Even");}
		else {System.out.println(num+" is Odd");}
	
		scanner.close();
	}
}
