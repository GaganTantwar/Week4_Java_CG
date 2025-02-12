// package decleration
package coursemanagementsystem;
// AssignmentCourse class
public class AssignmentCourse extends CourseType{
    private String dueDate;
    private boolean availability;
    //AssignmentCourseConstructor
    public AssignmentCourse(String courseName,int charges,String courseId,String dueDate,boolean availability){
        super(courseName,charges,courseId);
        this.dueDate=dueDate ;
        this.availability=availability;
    }
    //Returning dueDate;
    public String getdueDate(){
        return dueDate;
    }
    // Returning availability
    public boolean getAvailability() {
        return availability;
    }
    //overrided displayInfo method
    @Override
    public void displayInfo(){
        System.out.println("Name of the Course: "+getCourseName());
        System.out.println("Id of the Course: "+getCourseId());
        System.out.println("Charges of the Course: "+getCharges());
        System.out.println("Due Date of Assignment  : "+getdueDate());
        System.out.println("Availability of the Seats in Course: "+getAvailability());
        System.out.println(" ");

    }
}
