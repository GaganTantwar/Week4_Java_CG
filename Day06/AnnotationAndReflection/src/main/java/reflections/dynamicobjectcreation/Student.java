package reflections.dynamicobjectcreation;

// Class representing a Student with a name attribute and a method to display the name
public class Student {
    private String name;

    // Constructor to initialize Student object with name
    public Student(String name) {
        this.name = name;
    }

    // Method to display the name of the student
    public void display() {
        System.out.println("Name of the Student: " + name);
    }
}
