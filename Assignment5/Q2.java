package Assignment5;

//Write a Java program that uses a Consumer to print the name of a student in Uppercase.
import java.util.Scanner;
import java.util.function.Consumer;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Consumer<String> toUpper= str->System.out.println(str.toUpperCase());;
		
		System.out.print("Enter the name of Student :");
		String name = scanner.nextLine();
		toUpper.accept(name);
		scanner.close();
	}

}
