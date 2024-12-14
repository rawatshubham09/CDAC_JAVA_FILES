package day3;

import java.util.Scanner;
public class CreateRoom {
	int roomno;
	String roomtype;
	int roomarea;
	int ACmachine;
	
	void setdata()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the total rooms: ");
		roomno = in.nextInt();
		System.out.print("Enter Room Type: ");
		roomtype = in.next();
		System.out.print("Enter Room Area :");
		roomarea = in.nextInt();
		System.out.print("Enter no. of AC Machine :");
		ACmachine = in.nextInt();
		in.close();
	}
	void displaydata()
	{
		System.out.println("Total the room no: "+roomno);
		System.out.println("Room Type: "+roomtype);
		System.out.println("Total Room Area :"+roomarea+" sqfeet");
		System.out.println("Total no. of AC Machine :"+ACmachine);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateRoom obj = new CreateRoom();
		obj.setdata();
		obj.displaydata();
		
	}

}
