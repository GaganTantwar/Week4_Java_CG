package reflections.dynamicobjectcreation;

import java.lang.reflect.Constructor;

// Class to demonstrate dynamic object creation using reflection
public class DynamicObjectCreation {
    public static void main(String args[]) {
        try {
            // Get the Class object corresponding to the Student class
            Class<?> cls = Student.class;

            // Get the Constructor object for the Student class constructor that takes a String parameter
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class);

            // Create a new instance of the Student class using the constructor with the provided argument
            Student student = (Student) constructor.newInstance("Gagan");

            // Call the display method on the created Student object to print the student's name
            student.display();
        } catch (Exception e) {
            // Handle any exceptions that may occur
            System.out.println("Exception Caught ");
        }
    }
}
