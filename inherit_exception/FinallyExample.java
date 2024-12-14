package inherit_exception;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a[] = new int[-1];
			a[0] = 1;
			System.out.println("value of a : "+ a[0]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally  // This block will always executed
		{
			System.out.println("====End of Program===");
		}
	}

}
