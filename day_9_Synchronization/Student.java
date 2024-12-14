package day_9_Synchronization;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private List<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void removeCourse(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            course.removeStudent(this);
        }
    }
}
