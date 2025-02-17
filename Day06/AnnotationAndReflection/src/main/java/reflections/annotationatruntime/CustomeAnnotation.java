package reflections.annotationatruntime;

// Class to demonstrate the use of a custom annotation
public class CustomeAnnotation {

    // Apply the custom annotation to the method with the author's name
    @Authore(name = "Jake Mugger")

    // Method to display a welcome message
    public void newMethod() {
        System.out.println("Welcome Jake");
    }
}
