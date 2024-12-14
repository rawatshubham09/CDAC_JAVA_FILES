package inherit_exception;

import java.util.Scanner;

public class StringToIntegerConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a string to convert to integer: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("The integer value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! string cannot be converted to an integer.");
        } finally {
            scanner.close();
        }
    }
}
