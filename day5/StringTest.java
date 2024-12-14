package day5;

// write a method that takes one string parameter and return true if its
//length is greater than 5
import java.util.Scanner;
public class StringTest {
	
	boolean check(String word)
	{
	if (word.length() > 5)
	{
		return true;
	}
	else
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter the Words :");
		String word = n.next();
		StringTest obj = new StringTest();
		
		System.out.print(obj.check(word));
		

	}

}
