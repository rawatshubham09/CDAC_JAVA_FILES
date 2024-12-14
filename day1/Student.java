package com.dai.day1;
//wap to store one students record
public class Student
{
String name;
int age;
String address;

//single copy is created per class 

static String centername ;//class variable 

static void banner()
{
	centername="CDAC"; 
	System.out.println(centername);
}
public void get()
{
	Scanner s= new Scanner(System.in);
	System.out.println("enter name ");
	name=s.next();
	System.out.println("enter age ");
	age=s.nextInt();
	System.out.println("enter address ");
	address=s.next();
			 
}
public void display()
{
	System.out.println(name);
	System.out.println(age);
	System.out.println(address);
	
}

public static void main(String args[])
{

	 //System.out.println("center name "+ Student.centername);
	 Student.banner();
	 
	
}
}