package day6;

public class Emp implements Comparable<Emp>{
	String empName;
	int empId;
	
	public Emp(String name, int id) {
		super();
		this.empId = id;
		this.empName = name;
	}
	
	@Override
	public int compareTo(Emp o)
	{
		return Integer.compare(empId, o.empId);
	}
	
	@Override
	public String toString()
	{
		return "Emp [ename=" + empName + ", empid=" + empId + "]";
	}
	
		
	

}
