package reflections.annotationatruntime;

import java.lang.reflect.Method;

// Class to demonstrate using annotations and reflection to get metadata and invoke methods
public class AnnotationAndReflection {
    public static void main(String args[]) {
        try {
            // Create an instance of CustomeAnnotation class
            CustomeAnnotation test = new CustomeAnnotation();

            // Get the Class object corresponding to CustomeAnnotation
            Class<?> cls = test.getClass();

            // Retrieve the Method object for the method named "newMethod"
            Method method = cls.getDeclaredMethod("newMethod");

            // Check if the method is annotated with the custom annotation Authore
            if (method.isAnnotationPresent(Authore.class)) {
                // Get the Authore annotation applied to the method
                Authore annotation = method.getAnnotation(Authore.class);

                // Print the name attribute of the Authore annotation
                System.out.println("Authore Name: " + annotation.name());
            } else {
                // Print a message if the method is not annotated with Authore
                System.out.println("No Annotation Present");
            }

            // Invoke the "newMethod" on the Custom Annotation instance
            method.invoke(test);
        } catch (Exception e) {
            // Handle any exceptions that may occur
            System.out.println("Exception Caught ");
        }
    }
}
