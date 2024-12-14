package day6;

public class Students {
	
	int Rollno;
	String Name;
	int Marks;
	
	public Students(int rollno, String name, int marks)
	{
		this.Rollno = rollno;
		this.Name = name;
		this.Marks = marks;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public String toString()
	{
		return this.Rollno + " -> " + this.Name + " : " + this.Marks;
	}
	
}
