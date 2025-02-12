package coursemanagementsystem;
import java.util.*;

public class Utility {
    //Wildcard Method
    public static void displayDetails(List<? extends CourseType> courses){
        for(CourseType course:courses){
            course.displayInfo();
        }
    }
}
