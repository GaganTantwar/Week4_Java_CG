package reflections.getclassinformation;

// Class representing a Student with attributes like name, roll number, age, and course
public class Student {
    private String name;
    private String rollNo;
    private int age;
    private String course;

    // Constructor to initialize Student object with name, roll number, age, and course
    public Student(String name, String rollNo, int age, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.course = course;
    }

    // Getter method to get the name of the student
    public String getName() {
        return name;
    }

    // Getter method to get the roll number of the student
    public String getRollNo() {
        return rollNo;
    }

    // Getter method to get the age of the student
    public int age() {
        return age;
    }

    // Getter method to get the course of the student
    public String getCourse() {
        return course;
    }
}
