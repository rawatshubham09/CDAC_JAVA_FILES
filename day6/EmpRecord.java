package day6;

import java.util.*;
public class EmpRecord 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e = new Emp("Chetan",1);
		Emp e1 = new Emp("Deepak",2);
		Emp e2 = new Emp("putin",12);
		Emp e3 = new Emp("Zoro",31);
		Emp e4 = new Emp("Jinping",15);
		Emp e5 = new Emp("Luffy",7);
		
		PriorityQueue<Emp> p= new PriorityQueue();
		p.add(e);
		p.add(e1);
		p.add(e2);
		p.add(e3);
		p.add(e4);
		p.add(e5);
		
		for (Emp k:p)
			System.out.println(k);

	}

}
