package coursemanagementsystem;
// ResearchCourse Class
public class ResearchCourse extends CourseType{
    private int projectCharges;
    private boolean availability;
    public  ResearchCourse(String courseName,int charges,String courseId,int projectCharges,boolean availability){
        super(courseName,charges,courseId);
        this.projectCharges=projectCharges;
        this.availability=availability;
    }
    // Returning projectCharges
    public int getProjectCharges(){
        return projectCharges;
    }
    //Returning availability
    public boolean getAvailability() {
        return availability;
    }
    // overrided displayInfo method
    @Override
    public void displayInfo(){
        System.out.println("Name of the Course: "+getCourseName());
        System.out.println("Id of the Course: "+getCourseId());
        System.out.println("Charges of the Course: "+getCharges());
        System.out.println("Charges of Project and Thesis : "+getProjectCharges());
        System.out.println("Availability of the Seats in Course: "+getAvailability());
        System.out.println(" ");
    }
}
