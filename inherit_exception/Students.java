package inherit_exception;

public class Students {
	
	public void AddStudent()
	{
		class MtechStudents implements Admission{
			public void Registration() {
				System.out.println("Mtech Student Registred");
			};
		}
		
		Admission mtechStudent = new MtechStudents(); 
		mtechStudent.Registration();
		
		// local anonymous
		Admission k=new Admission()
		{
			public void Registration() {
				System.out.println("PHD Class Student Registred");
			}
		};
		k.Registration();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students object = new Students();
		
		object.AddStudent();
	}
}
