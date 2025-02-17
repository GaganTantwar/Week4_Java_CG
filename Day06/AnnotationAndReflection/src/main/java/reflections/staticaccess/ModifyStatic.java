package reflections.staticaccess;
import java.lang.reflect.*;
public class ModifyStatic {
    public static void main(String[] args) {
        try {
            // Get the class object
            Class<Configuration> clazz = Configuration.class;

            // Access the private static field
            Field field = clazz.getDeclaredField("API_KEY");
            field.setAccessible(true);

            // Modify the field value
            field.set(null, "NEW_SECRET_KEY");

            // Print the modified value
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
