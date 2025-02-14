package datastreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Student {
    // Fields to store student details
    int rollNumber;
    String name;
    double gpa;

    // Constructor to initialize the Student object
    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }

    // Method to save the student details to a file
    public void saveToFile(DataOutputStream dos) throws IOException {
        dos.writeInt(rollNumber);  // Write roll number as an integer
        dos.writeUTF(name);        // Write name as a UTF-8 encoded string
        dos.writeDouble(gpa);      // Write GPA as a double
    }

    // Static method to read and create a Student object from a file
    public static Student readFromFile(DataInputStream dis) throws IOException {
        int rollNumber = dis.readInt();     // Read roll number as an integer
        String name = dis.readUTF();        // Read name as a UTF-8 encoded string
        double gpa = dis.readDouble();      // Read GPA as a double
        return new Student(rollNumber, name, gpa); // Create and return a new Student object
    }

    // Override the toString method to display student details
    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", GPA: " + gpa;
    }
}
