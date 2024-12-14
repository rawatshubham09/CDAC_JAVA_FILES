package day6;

import java.util.HashSet;
import java.util.Set;
public class BookRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b= new Books(1300,"Java","AB123");
		Books b1= new Books(2100,"ML","AB124");
		Books b2= new Books(2400,"C#","AB125");
		Books b3= new Books(300,"C","AB126");
		Books b4= new Books(1300,"Python","AB127");
		Books b5= new Books(1400,"C++","AB128");
		Books b6= new Books(2500,"Handa on ML","AB129");
		
		System.out.println(b); // call toString method
		
		Set<Books> s= new HashSet<>();
		s.add(b);
		s.add(b1);
		s.add(b2);
		s.add(b3);
		s.add(b4);
		s.add(b5);
		s.add(b6);
		System.out.println(s);
		System.out.println(s.remove(b3));
	}

}
