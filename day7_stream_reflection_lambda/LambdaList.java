package day7_stream_reflection_lambda;

import java.util.ArrayList;

public class LambdaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("Luffy");
		a.add("Zoro");
		a.add("Sanji");
		
		a.forEach((x)->System.out.println(x));
		
		
	}

}
