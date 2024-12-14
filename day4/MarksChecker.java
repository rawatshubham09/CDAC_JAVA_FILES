package day4;
import java.util.Scanner;

class InternalMarksException extends Exception {
 public InternalMarksException(String message) {
     super(message);
 }
}
class ExternalMarksException extends Exception 
{
 public ExternalMarksException(String message) {
     super(message);
 }
}

public class MarksChecker {
 public static void checkMarks(int internalMarks, int externalMarks) throws InternalMarksException,
 ExternalMarksException 
 {
     if (internalMarks > 40) {
         throw new InternalMarksException("Internal marks exceeded: " + internalMarks);
     }
     if (externalMarks > 60) {
         throw new ExternalMarksException("External marks exceeded: " + externalMarks);
     }
     System.out.println("Marks are within the valid range.");
 }

 public static void main(String[] args) {
     int internalMarks = 45;  // Example internal marks
     int externalMarks = 65;  // Example external marks
     
     try {
         checkMarks(internalMarks, externalMarks);
     } catch (InternalMarksException | ExternalMarksException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}

