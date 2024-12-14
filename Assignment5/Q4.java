package Assignment5;

import java.util.function.Function;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Function<Double,Double> toFahrenheit = degree-> (degree*9/5) + 32;
		
		System.out.print("Enter the Tenmprture in Celsius: ");
		double temprature = scanner.nextDouble();
		
		System.out.println(temprature + " Celsius is equal to "+toFahrenheit.apply(temprature)
		+" Fahrenheit");
		
		scanner.close();
	}

}
