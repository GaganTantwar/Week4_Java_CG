package coursemanagementtesting;

import coursemanagementsystem.AssignmentCourse;
import coursemanagementsystem.ExamCourse;
import coursemanagementsystem.ResearchCourse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseManagementTesting {

    @Test
    public void examCourseTesting(){
        // Create a new ExamCourse object named java
        ExamCourse java = new ExamCourse("Java", 5000, "java89", 1000, true);
        // Get the course name of the exam course
        String name = java.getCourseName();
        // Check the availability of the exam course
        boolean available = java.getAvailability();
        // Assert that the course name is "Java"
        Assertions.assertEquals("Java", name);
        // Assert that the course is available
        Assertions.assertEquals(true, available);
        System.out.println("Testing Pass");
    }

    @Test
    public void researchCourseTesting(){
        // Create a new ResearchCourse object named ml
        ResearchCourse ml = new ResearchCourse("Machine Learning", 8000, "ML909", 2000, true);
        // Get the project charges of the research course
        int charges = ml.getProjectCharges();
        // Check the availability of the research course
        boolean available = ml.getAvailability();
        // Assert that the project charges are 2000
        Assertions.assertEquals(2000, charges);
        // Assert that the course is available
        Assertions.assertEquals(true, available);
        System.out.println("Testing Pass");
    }

    @Test
    public void assignmentCourseTesting(){
        // Create a new AssignmentCourse object named fullstack
        AssignmentCourse fullstack = new AssignmentCourse("Full Stack Development", 6000, "AC987", "09-03-2025", false);
        // Get the due date of the assignment course
        String date = fullstack.getdueDate();
        // Check the availability of the assignment course
        boolean available = fullstack.getAvailability();
        // Assert that the due date is "09-03-2025"
        Assertions.assertEquals("09-03-2025", date);
        // Assert that the course is not available
        Assertions.assertNotEquals(true, available);
        System.out.println("Testing Pass");
    }
}
