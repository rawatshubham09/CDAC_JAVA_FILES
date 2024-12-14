package com.dai.day2;

public class ConstroctorExample {
	
	int num1;
	float num2;
	String name;
	
	ConstroctorExample() // default has change to these values
	{
		num1=10;
		num2 = 22.5f;
		name = "Shubham";
	}
	
	ConstroctorExample(int Num1, float Num2, String Name) // user define constructor
	{
		num1 = Num1;
		num2 = Num2;
		name = Name;
	}
	
	void print()
	{
		System.out.println(name+" : "+num1+" : "+num2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ConstroctorExample().print(); // default
		ConstroctorExample a = new ConstroctorExample(); // this will create an object of this class
		ConstroctorExample b = new ConstroctorExample(10, 20.2f, "Amit");
		
		a.print();
		b.print();
		

	}

}
