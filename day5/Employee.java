package day5;
// non static neasted class = inner class
public class Employee {

	String name;
	int age;
	
	class Itdept
	{
		int pduration;
		int cost;
		String pname;
		
		void get()
		{
			name="Ashu";
			age = 22;
			pduration=2;
			pname="kvs";	
		}
		void show()
		{
			System.out.println(name+" "+ age+ " "+pduration);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e= new Employee();
		
		Employee.Itdept i = e.new Itdept(); // non static Inner class
		
		i.show(); // defult null 0 0
		i.get();
		i.show(); // Assigned value Ashu 22 2
		}

}
