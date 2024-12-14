package inherit_exception;

public class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Constructor with only name and age
    public Student(String name, int age) {
        this(name, age, "Not specified"); // Calls the other constructor
    }

    // Constructor with only name
    public Student(String name) {
        this(name, 18, "Not specified"); // Default age is 18 and course is not specified
    }

    // Default constructor
    public Student() {
        this("Unknown", 18, "Not specified"); // Default values
        }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Amit", 20, "Mathematics");
        Student student2 = new Student("Bhumika", 19);
        Student student3 = new Student("Pankaj");
        Student student4 = new Student();

        student1.display();
        student2.display();
        student3.display();
        student4.display();
    }
}
