package day5;

public class GenericExample <T, T1> 
{	T a,b;
	T1 c;
	
	void get(T a, T b, T1 c)
	{
		this.a = a;
		this.b = b;
	}
	void show()
	{
		System.out.println(a+" "+b+" "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	GenericExample <Integer,String>r = new GenericExample<>();
		
		int u=233;
		r.get(u, 20,"hello");
		r.show();
		
		GenericExample <String ,Float>r1 = new GenericExample<>();
		r1.get("welcome","java",233.3f);
		r1.show();
	}

}
