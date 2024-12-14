package inherit_exception;

import java.util.Scanner;
class MyException2 extends Exception{
	public MyException2(String msg) 
	{
		super(msg);
	}
}
public class PrintSum {

	public static void main(String[] args) throws MyException2 {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 number :");
		int numbers[] = new int[3];
		int sum = 0;
		
		for(int i=0; i<3;i++) {		
			numbers[i] = input.nextInt();
			if (numbers[i]<=10) {
				throw new MyException2("Number Should Be grater then 10");
			}
			sum += numbers[i];
		}
		
		System.out.println("Sum of Three number is : "+sum);
		input.close();
	}
}
