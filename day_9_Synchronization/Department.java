package day_9_Synchronization;

class Employee
{
	int empId;
	String empName;
	String empDepartment;
	
	Employee(int id, String name, String department){
		this.empId = id;
		this.empDepartment = department;
		this.empName = name;
	}

	@Override
	public String toString() {
		return "Employee {empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + "}";
	}	
}
public class Department {

	public static void main(String[] args) {
		
		Employee Sales[] = new Employee[5];
		
		Sales[0] = new Employee(1,"Karan","CustumSupport");
		Sales[1] = new Employee(2,"Pankaj","CustumSupport");
		Sales[2] = new Employee(3,"Preeti","CustumSupport");
		Sales[3] = new Employee(4,"Pinki","CustumSupport");
		Sales[4] = new Employee(5,"Sohan","CustumSupport");
		
		for(Employee x: Sales) {
			System.out.println(x);
		}
	}
}
