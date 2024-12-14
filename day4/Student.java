package day4;
class AgeNotWithinRangeException extends Exception
{
	public AgeNotWithinRangeException (String msg)
	{	
		super(msg);
	}
}
class NameNotValidException extends Exception
{
	public NameNotValidException(String msg) 
	{
		super(msg);
	}
}

public class Student {
	int rollno;
	int age;
	String name;
	String course;
	
	public Student(int no, int Age, String Name, String Course) throws AgeNotWithinRangeException, NameNotValidException
	{
		if (age < 15 || age > 21)
		{
			throw new AgeNotWithinRangeException("Age Must be between 15 and 21!");
		}
		if (!name.equals("[a-zA-Z]+")) {
			throw new NameNotValidException("Name Done not required Numbers or Special Chracters!,");
		}
		
		this.rollno = no;
		this.age = Age;
		this.name = Name;
		this.course = Course;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{ // Example of valid student 
			
			 Student student1 = new Student(1,20, "Alice", "Mathematics");
			 System.out.println("Student 1 created successfully: " ); 
			
			// Example of invalid age 
			
			Student student2 = new Student(2, 22,"Bob", "Physics");
			}
		catch (AgeNotWithinRangeException | NameNotValidException e) 
		{ 
			System.out.println("Error: " + e.getMessage());
		} 
		try 
		{ 
			// Example of invalid name 
			Student student3 = new Student(3, 19,"Eve123", "Computer Science");
		}
		catch (AgeNotWithinRangeException | NameNotValidException e) 
		{ 
			System.out.println("Error: " + e.getMessage()); 
		}
		
		}
	}


