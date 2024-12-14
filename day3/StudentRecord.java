package day3;

public class StudentRecord {
	int roll_no;
	String sname;
	
	StudentRecord(int roll, String name)
	{
		roll_no = roll;
		sname = name;
	}
	void display()
	{
		System.out.println("Name : "+sname+", Roll no. :"+roll_no);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecord student1 = new StudentRecord(22,"Kuldeep");
		student1.display();
	}

}
