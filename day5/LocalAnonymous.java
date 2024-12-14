package day5;

interface One
{
	void show();
}
public class LocalAnonymous {
	void print()
	{
		// =================Local Class===========================
		class Test implements One
		{
			public void show()
			{
				System.out.println("Local Welcome");
			}
		}
		
		// ==============Local Anonymous Class=====================
		One r = new One()
		{
			public void show() // we need to override this parent class method
			{
				System.out.println("Anonymous Welcome");
			}
		};
		
		r.show();
		
		One t= new Test(); // yai Calega
		t.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalAnonymous p = new LocalAnonymous();
		
		p.print();
	}

}
