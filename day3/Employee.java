package day3;

public class Employee {
	
	int salary;
	int workingHours;
	void getInfo(int Salary, int Hours)
	{
		salary = Salary;
		workingHours = Hours;
	}
	void AddSal()
	{
	if (salary<50000)
		salary += 10000;
	}
	void AddWork()
	{
		if (workingHours>6)
			salary += 5000;
	}
	void display(Employee e) 
	{
		e.AddSal();
		e.AddWork();
		System.out.println("Final Salary : "+e.salary);
	}
	
	public static void main(String[] args) {

		Employee e = new Employee();
		e.getInfo(54000, 7);
		e.display(e);
	}
}