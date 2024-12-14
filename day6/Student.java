package day6;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String studentName;
	List<Course> courses;
	
	public Student(String Name) {
		this.studentName = Name;
		this.courses = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", courses=" + courses + "]";
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(Course course) {
		this.courses.add(course);
	}

}
