package day3;

class Addition
{
	public void add(int a,int b)
	{	
		int sum = a+b;
		System.out.println("Adding 2 number "+a+" + "+b+" = "+sum);
	}
	
	public void add(int a,int b,int c)
	{	
		int sum = a+b+c;
		System.out.println("Adding 3 number "+a+" + "+b+" + "+c+" = "+sum);
	}
	
	public void add(int a,int b, int c, int d)
	{	
		int sum = a+b+c+d;
		System.out.println("Adding 4 number "+a+" + "+b+" + "+c+" + "+d+" = "+sum);
	}
}

public class AddMultiple {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition n = new Addition();
		
		n.add(2, 3);
		n.add(2, 3, 5);
		n.add(1,2,3,4);
	}

}
