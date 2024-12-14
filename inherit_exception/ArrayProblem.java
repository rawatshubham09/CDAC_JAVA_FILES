package inherit_exception;

public class ArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int a[] = new int[10];
		
		a[10]=22; // size problem
		
		System.out.println("Array problem" + a[10]); // Run time error
		System.out.println("=====bye======");
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("Array out of range");
		}
		catch(Exception r)
		{
			System.out.println(r);
		}
	}

}
