package coursemanagementsystem;

import java.util.concurrent.Callable;

public class CourseManagementSystem {
    // Main Method
    public static void main(String args[]){
        //object decleration
        CourseType java=new ExamCourse("Java Full Stack",5000,"JAVA78",1000,true);
        CourseType cpp=new ResearchCourse("C++ Learning",4000,"CPP78",500,true);
        CourseType python=new AssignmentCourse("Python Ml",6000,"PY67","09/03/2025",false);
        Course<CourseType> courses=new Course<>();
        courses.addCourse(java);
        courses.addCourse(cpp);
        courses.addCourse(python);
        Utility.displayDetails(courses.getCoureseList());
    }
}
