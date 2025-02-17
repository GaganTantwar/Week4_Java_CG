package reflections.getclassinformation;
import java.util.*;
import java.lang.reflect.*;

// Class to get and display information about a specified class using reflection
public class GetClassInfo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the name of the class they want information about
        System.out.println("Enter a Class Name: ");
        String className = sc.nextLine();

        // Close the Scanner object
        sc.close();

        try {
            // Get the Class object corresponding to the specified class name
            Class<?> cls = Class.forName(className);

            // Display the name of the class
            System.out.println("Name of the Class: " + cls.getName());

            // Display the constructors of the class
            System.out.println("Constructor :");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("  " + constructor);
            }

            // Display the fields of the class
            System.out.println("\nFields:");
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("  " + field);
            }

            // Display the methods of the class
            System.out.println("\nMethods:");
            Method[] methods = cls.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("  " + method);
            }
        } catch (ClassNotFoundException e) {
            // Handle the exception if the class is not found
            System.out.println("Exception: ");
            System.out.println(e.getMessage());
        }
    }
}
