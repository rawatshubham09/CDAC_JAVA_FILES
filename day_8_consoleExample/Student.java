package day_8_consoleExample;

public class Student {
	
	int Rollno;
	String Name;
	int Class;
	
	Student(int no, String name, int cls)
	{
		this.Class = cls;
		this.Name = name;
		this.Rollno = no;
	}
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Name=" + Name + ", Class=" + Class + "]";
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

	public void setClass(int class1) {
		Class = class1;
	}

}
