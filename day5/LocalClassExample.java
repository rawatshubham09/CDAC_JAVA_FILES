package day5;

// We cannot take Static inside the local variable
import java.util.Scanner;
public class LocalClassExample {

	// Nested Class
	// 
	int code=122;
	void print()
	{
		Scanner s= new Scanner(System.in); 
		System.out.print("Enter Department : ");
		String dept = s.next();
		if (dept.equals("Sales"))
		{
			class Sales
			{
			int a=10;
			static int y=33;
				void show()
				{
					System.out.println(a);
					System.out.println(y);
					System.out.println(dept);
					System.out.println(code);
				}
			}
			
			Sales s1 = new Sales();
			s1.show();
		}
		else
		{
			System.out.println("You are not from Sales" + code);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Local Class
		// Local variable
		
		LocalClassExample e = new LocalClassExample();
		e.print();
		
	}

}
