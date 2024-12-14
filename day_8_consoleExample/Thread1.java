package day_8_consoleExample;

import java.lang.Thread;
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = Thread.currentThread(); // (1-10) preority
		
		System.out.println(t.getId()); //1
		System.out.println(t.getName()); // main
		System.out.println(t.getPriority()); //5
	}

}
