package day_10_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = Arrays.asList("suman","sneha","pinki");
		
		l.stream().filter(s->s.startsWith("s")).forEach(System.out::println);
	}

}
