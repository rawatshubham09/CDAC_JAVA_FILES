package day7_stream_reflection_lambda;

import java.util.function.Consumer;
public class ConsumerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String>p = (name)->System.out.println(name.charAt(0));
		p.accept("Welcome");
	}

}
