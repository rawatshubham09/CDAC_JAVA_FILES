package day6;

import java.util.PriorityQueue;
import java.util.Queue;
public class QueuePriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> r= new PriorityQueue<Integer>();
		r.offer(10);
		r.offer(30);
		r.offer(20);
		r.offer(50);
		r.offer(70);
		r.offer(90);
		
		System.out.println(r);
		System.out.println(r.poll());
		System.out.println(r);
		System.out.println(r.remove(30));
		System.out.println(r);
	}

}
