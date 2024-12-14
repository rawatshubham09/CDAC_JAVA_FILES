package day6;

class MyException extends Exception{
	MyException(String p){
		System.out.println("Exception Occur"+ p);
	}
}
public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if (a<10 || b<10 || c<10) {
			throw new MyException("Value Less then 10");
		}
		System.out.println("Sum : "+ (a+b+c));
		
	}
		catch(ArrayIndexOutOfBoundsException t)
		{
			System.out.println("Plz enter the 3 varible in intiger");
		}
		catch(Exception r)
		{
			System.out.println(r);
		}
	}
}
