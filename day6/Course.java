package day6;

import java.util.ArrayList;
import java.util.List;

public class Course {
	String courseName;
	List<Student> studentList;
	
	public Course(String CName) {
		this.courseName = CName;
		this.studentList = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", studentList=" + studentList + "]";
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(Student studentLis) {
		this.studentList.add(studentLis);
	}
	
	
}
