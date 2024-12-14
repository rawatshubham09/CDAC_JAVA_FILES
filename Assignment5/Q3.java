package Assignment5;

import java.util.function.Predicate;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Fruits[] = {"Apple", "Banana", "Cherry"};
		Predicate <String> p = (str)-> str.toLowerCase().contains("a");
		for (String name:Fruits) 
		{
			if (p.test(name))
				{System.out.println(name +" Contains letter 'a'.");}
			else 
				{System.out.println(name+" Does Not Contain letter 'a'.");}
		}
	}
}
