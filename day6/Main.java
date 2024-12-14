package day6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Enrolling students in courses
        student1.setCourses(course1);
        student1.setCourses(course2);
        student2.setCourses(course1);
        
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(course1);
        System.out.println(course2);
        
	}
}
