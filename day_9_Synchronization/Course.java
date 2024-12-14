package day_9_Synchronization;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
        }
    }

    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            student.removeCourse(this);
        }
    }
}
