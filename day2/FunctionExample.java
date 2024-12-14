package com.dai.day2;


class Emp
{
	String name;
	int age;
	
	void input() // void is always use as method only as it does not return anything
	{
		name = "Shubham";
		age=27;
	}
	
	void show()
	{
		System.out.println(name+" : "+ age);
	}
	
	
}

class Cals
{
 int sum()
 {
	 int a=10;
	 int b = 20;
	 
	 return a+b; // return must be last statement in the program
 }
 
 int sumNumber(int a, int b)
 {
	 return a+b;
 }
}
public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e = new Emp();
		e.input();
		e.show();
		
		Cals b = new Cals();
		System.out.println(b.sumNumber(10, 20));
	}

}
