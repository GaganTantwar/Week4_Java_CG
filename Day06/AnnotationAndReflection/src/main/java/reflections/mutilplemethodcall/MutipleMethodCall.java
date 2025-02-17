package reflections.mutilplemethodcall;
import java.lang.reflect.*;
import java.util.*;

// Class to invoke methods from MathOperation dynamically using reflection
public class MutipleMethodCall {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the method name (add, subtract, multiply)
        System.out.print("Enter method name (add, subtract, multiply): ");
        String name = sc.nextLine();

        // Prompt user to enter the first number
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();

        // Prompt user to enter the second number
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();

        // Close the Scanner object
        sc.close();

        try {
            // Create an instance of MathOperation class
            MathOperation math = new MathOperation();

            // Get the Class object corresponding to MathOperation
            Class<?> cls = math.getClass();

            // Retrieve the Method object for the specified method name
            Method method = cls.getDeclaredMethod(name, int.class, int.class);

            // Invoke the specified method with the provided arguments
            int result = (int) method.invoke(math, a, b);

            // Print the result of the method call
            System.out.println("Result of " + name + " is " + result);

        } catch (Exception e) {
            // Handle any exceptions that may occur
            System.out.println("Exception Caught");
        }
    }
}
