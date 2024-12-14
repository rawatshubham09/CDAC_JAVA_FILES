package day_9_Synchronization;

public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Enrolling students in courses
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course1);

        // Displaying students enrolled in each course
        System.out.println("Students in " + course1.getCourseName() + ":");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getStudentName());
        }

        System.out.println("Students in " + course2.getCourseName() + ":");
        for (Student student : course2.getStudents()) {
            System.out.println(student.getStudentName());
        }

        // Displaying courses each student is enrolled in
        System.out.println("Courses for " + student1.getStudentName() + ":");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getCourseName());
        }

        System.out.println("Courses for " + student2.getStudentName() + ":");
        for (Course course : student2.getCourses()) {
            System.out.println(course.getCourseName());
        }
    }
}
