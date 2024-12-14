package inherit_exception;

// checked Exception
public class MyException extends Exception
{
	public MyException()
	{
		System.out.println("Value not correct");
	}
	
	public MyException(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getMessage2()
	{
		return "Ok Now Execute";
	}

}
