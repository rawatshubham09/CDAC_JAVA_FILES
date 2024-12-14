package Assignment5;

import java.util.Scanner;
import java.util.function.Predicate;
public class Q5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Predicate<Integer> isPrime = num->{
			for (int i=2; i<Math.sqrt(num);i++) {
				if(num%i==0) { return false;}
				}
			return true;};

			System.out.print("Enter the Number : ");
			int num = scanner.nextInt();
			
			if (isPrime.test(num)) {System.out.println(num + " is Prime");}
			else {System.out.println(num + " is not Prime");}
			
			scanner.close();
	}
}