package day3;

// default
// public
// private
// protected
public class Modifier {
	int x; //default same pakage
	private int y; // not visible outside class
	protected int z; // can be visible in same package
	public int a; // can be accessible outside package also
	
	void print()
	{
		x=11;
		y=44;
		z=445;
		a=332;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ABC
{
	Modifier obj = new Modifier();
	
	void show()
	{	// except y every thing can be access outside.
		obj.a=4;
		obj.x = 22;
		obj.z = 5;
	}
}
