package coursemanagementsystem;

import java.util.*;
// Generic Class Course Lower Bound Restricted
public class Course <T extends  CourseType>{
    // List of T
    List<T> courses=new ArrayList<>();
    public void addCourse(T course){
        courses.add(course);
    }
    // Returning courses list;
    public List<T> getCoureseList(){
        return courses;
    }
}
