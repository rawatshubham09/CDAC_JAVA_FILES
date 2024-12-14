package day6;

import java.util.LinkedList;
import java.util.Queue; // first in first out
public class QueueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> r= new LinkedList<Integer>();
		r.offer(10);
		r.offer(30);
		r.offer(20);
		r.offer(50);
		r.offer(70);
		r.offer(90);
		
		System.out.println(r.poll()); // 10 is removed
		System.out.println(r);
		
		// if we use poll method more then its actual size it will give "Null"
		// remove on the other hand give Exception
		
	}

}
