package strings_concept;


class Product
{
	void show() {}
	final void print() {} // this method cannot be called by other class
}

class NewProduct extends Product
{
	void show() {}
	// void print() {} // print method is final in patent class so can not be override it
}

final class ABC{}


public class FinalExample // extends ABC // Final class cannot be extended
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a=10;
		
		// cannot modified a
		
		try {
		// a = a+1; //cannot updated
		System.out.println(a);
		}
		catch (Exception e)
		{
			System.out.println("Error Occur"+ e);
		}
	}

}
