package inherit;
// constructor in inheritence
class Base
{
	Base() // this will call as default
	{
		System.out.println("Base argument constructor");
	}
	Base(int x)
	{
		System.out.println("Base argument constructor : "+ x);
	}
}
public class Derived extends Base
{

	Derived()
	{
		System.out.println("Derived Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d = new Derived();
		
	}

}
