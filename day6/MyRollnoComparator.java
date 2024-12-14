package day6;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MyRollnoComparator implements Comparator<Students>
{
	@Override
	public int compare(Students s1, Students s2) {
		return Integer.compare(s1.Rollno, s2.Rollno);
	}
	
	public static void main(String[] args) {
		
		// creating 5 students
		Students s1 = new Students(2,"Luffy",500);
		Students s2 = new Students(3,"Zoro",450);
		Students s3 = new Students(5,"Sanji",400);
		Students s4 = new Students(1,"Goku",550);
		Students s5 = new Students(4,"Deku",420);
		
		// creating a TreeSet
		Set<Students> stuSet = new TreeSet<>(new MyRollnoComparator());
		
		stuSet.add(s1);
		stuSet.add(s2);
		stuSet.add(s3);
		stuSet.add(s4);
		stuSet.add(s5);
		
		for(Students x:stuSet)
		{	
			System.out.println(x);
		}		
	}
}



