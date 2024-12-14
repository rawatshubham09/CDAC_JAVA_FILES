package day3;

import java.util.Scanner;
public class BankAccount {
	
	String name;
	int accountNumber;
	String accountType;
	double balanceAmount;
	
	void createNewUser()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter User Name : ");
		name = in.next();
		System.out.print("Enter User Account no. : ");
		accountNumber = in.nextInt();
		System.out.print("Enter User Account Type : ");
		accountType = in.next();
		System.out.print("Enter User Balance Amount");
		balanceAmount = in.nextDouble();	
		in.close();
	}
	void deposit(double amount, BankAccount p)
	{
		balanceAmount = balanceAmount + amount;
		p.display();
	}
	void withdraw(double amount, BankAccount p)
	{	
		if (amount <= balanceAmount)
				balanceAmount = balanceAmount - amount;
		else
			System.out.println("Insufficent Amount!");
		p.display();
	}
	void display()
	{
		System.out.println("Name : "+name+", Balance : "+balanceAmount);
	}
	public static void main(String[] args) {

		BankAccount person1 = new BankAccount();
		person1.createNewUser();
		person1.deposit(5000, person1);
		person1.withdraw(6000, person1);
		person1.display();
	}

}
