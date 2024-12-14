package day7_stream_reflection_lambda;


@FunctionalInterface
interface Sum
{
	int add(int a, int b);
}

public class LambdaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum s=(a,b)->a+b;
		System.out.println(s.add(10,20));
		
		//Sum s=(a,b)->{return a+b};
		
	}

}
