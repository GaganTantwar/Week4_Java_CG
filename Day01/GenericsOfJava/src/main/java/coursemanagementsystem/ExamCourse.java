package coursemanagementsystem;
// Exam Course Class
public class ExamCourse extends CourseType{
    //Attributes Declerations
    private int examCharges;
    private boolean availability;
    public ExamCourse(String courseName,int charges,String courseId,int examCharges,boolean availability){
        super(courseName,charges,courseId);
        this.examCharges=examCharges;
        this.availability=availability;
    }
    // Returning examCharges
    public int getExamCharges(){
        return examCharges;
    }
    // Returning availability
    public boolean getAvailability() {
        return availability;
    }
    // overrided displayInfo
    @Override
    public void displayInfo(){
        System.out.println("Name of the Course: "+getCourseName());
        System.out.println("Id of the Course: "+getCourseId());
        System.out.println("Charges of the Course: "+getCharges());
        System.out.println("Charges of Exam : "+getExamCharges());
        System.out.println("Availability of the Seats in Course: "+getAvailability());
        System.out.println(" ");

    }
}
