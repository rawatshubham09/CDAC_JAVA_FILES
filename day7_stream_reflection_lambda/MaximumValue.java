package day7_stream_reflection_lambda;

// lambda will not work if more then one method is inside the interface class
@FunctionalInterface
interface maximum{
	int max(int a, int b);
}
public class MaximumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		maximum m = (a,b) -> {return a>b?a:b;};
		
		System.out.println(m.max(10,20));
	}

}
