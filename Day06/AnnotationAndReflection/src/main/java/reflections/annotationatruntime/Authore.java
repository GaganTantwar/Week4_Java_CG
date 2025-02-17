package reflections.annotationatruntime;

// Import statements for annotation classes
import java.lang.annotation.*;

// Annotation to specify that the annotation will be available at runtime
@Retention(RetentionPolicy.RUNTIME)

// Annotation to specify that the annotation can only be applied to methods
@Target(ElementType.METHOD)

// Custom annotation named Authore with a name attribute
public @interface Authore {
    String name();
}
