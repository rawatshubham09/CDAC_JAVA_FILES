package day_10_Stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l= Arrays.asList(4,5,3,2,1,6);
		
		l.stream().sorted()
			.map(p->p*2)
			.forEach(System.out::println);
	}

}
