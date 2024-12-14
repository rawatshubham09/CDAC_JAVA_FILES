package day3;
// Method with variable arguments
public class MethodWithVariable {
	
	void sum(int ...a) // this will work as a args and kwrgs in python
	{
		int sum=0;
		for(int x:a) sum+=x;
		System.out.println("Sum = "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithVariable v = new MethodWithVariable();
		
		v.sum();
		v.sum(1,2,3,4);
		v.sum(22,23,34,45,53); 

		
		//output Sum = 0
		// Sum = 10
		// Sum = 177
	}

}
