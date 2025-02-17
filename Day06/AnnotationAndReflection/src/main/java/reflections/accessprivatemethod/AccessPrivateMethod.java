package reflections.accessprivatemethod;

import java.lang.reflect.Method;

// Class to demonstrate accessing and invoking a private method using reflection
public class AccessPrivateMethod {
    public static void main(String args[]) {
        try {
            // Create an instance of the Calculator class
            Calculator calc = new Calculator();

            // Get the Class object corresponding to the Calculator class
            Class<?> cls = calc.getClass();

            // Retrieve the Method object for the private method named "multiply" with two int parameters
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Set the accessible flag to true to bypass Java access control checks
            method.setAccessible(true);

            // Invoke the private method with the provided arguments
            int result = (int) method.invoke(calc, 5, 10);

            // Print the result of the multiplication
            System.out.println("Multiplication Result: " + result);
        } catch (NoSuchMethodException e) {
            // Handle the exception if the method is not found
            System.out.println("No Such Method");
        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.out.println("Exception");
        }
    }
}
