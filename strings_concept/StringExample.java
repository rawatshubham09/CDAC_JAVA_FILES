package strings_concept;

// If we crate a single name in different variable it will treat  one address only
// == compare to address
// String in Java is immutable i.e its value will not change.
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String k = "welcome";
		
		System.out.println("hellow".compareTo("HELLOW")); // give difference to ASCII value
		System.out.println("hellow".equals("HELLO")); //false
		
		String k="java";
		System.out.println(k.concat("word")); // javaword
		System.out.println(k); // java
		System.out.println("h".compareTo("HE"));
	}

}
