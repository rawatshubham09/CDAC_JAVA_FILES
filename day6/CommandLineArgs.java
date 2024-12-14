package day6;

public class CommandLineArgs {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly two command-line arguments.");
            }
            
            String firstArg = args[0];
            String secondArg = args[1];
    
            String output = firstArg + " technology " + secondArg;
            System.out.println(output);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
