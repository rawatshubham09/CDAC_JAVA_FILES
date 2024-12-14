package inherit;

class One
{
	void test()
	{
		System.out.println("Testing version 1.1");
	}
}

class Two extends One
{	
	@Override
	void test() // Method Overridding
	{
		System.out.println("Testing version 2.1");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two p = new Two();
		p.test(); // Child will Invoke
	}

}
