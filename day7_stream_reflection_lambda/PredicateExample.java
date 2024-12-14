package day7_stream_reflection_lambda;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for getting true and false
		Predicate<String> p = (str)->str.length()>10;
		System.out.println(p.test("Raman"));
		
		// can use in Integer
		Predicate<Integer>k = (i)->i<100;
		System.out.println(k.test(90));
		
		// even we can override its buit in test function
		Predicate <String> p2= new Predicate<String>()
				{
			@Override
			public boolean test(String t) {
				if(t.equals("admin")) return true;
				return false;
			}
				};
				
			System.out.println(p2.test("admin"));
			
	}

}
