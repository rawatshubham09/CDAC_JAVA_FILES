package day3;

public class MethodOverLoading {
	void show()
	{
		System.out.println("Nothing");
	}
	
	int show(int y)
	{
		return 0; // we can make different return type as it is not problem
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoading p = new MethodOverLoading();
		
		p.show();
		System.out.println("With argument"+p.show(100));

	}

}
