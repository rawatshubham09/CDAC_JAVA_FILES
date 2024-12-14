package inherit_exception;

public class ArithmeticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int x=10;
			int y = 0;
			int z = x/y;
		}
		catch(ArithmeticException r)
		{
			System.out.println(r);
			System.out.println(r.getMessage());
			System.out.println("Cannot Divide by Zero");
		}
		System.out.println("Eend of Program");
	}

}
