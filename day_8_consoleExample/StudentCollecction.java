package day_8_consoleExample;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Comp implements Comparator<Student>
{
	@Override
	public int compare(Student i1, Student i2)
	{
		return Integer.compare(i1.Rollno, i1.Rollno);
	}
}

public class StudentCollecction {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Kuldeep",12);
		Student s2 = new Student(2,"Naveen",12);
		Student s3 = new Student(4,"Kandi",12);
		Student s4 = new Student(5,"Ravi",12);
		Student s5 = new Student(3,"Manish",12);
		Student s6 = new Student(7,"Pankaj",12);
		
		TreeMap<Student> stuBook = new TreeMap<>();
		
	}

}
