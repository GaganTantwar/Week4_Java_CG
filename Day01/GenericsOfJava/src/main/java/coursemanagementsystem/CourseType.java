package coursemanagementsystem;
//Abstract class CourseType
public abstract class CourseType {
    // Attributes Declerations
    private String courseName;
    private int charges;
    private String courseId;
    //CourseType Constructor
    public CourseType(String courseName,int charges,String courseId){
        this.courseName=courseName;
        this.charges=charges;
        this.courseId=courseId;
    }
    //Returning courseId
    public String getCourseId(){
        return courseId;
    }
    // Returning courseName
    public String getCourseName(){
        return courseName;
    }
    //Returning charges
    public int getCharges(){
        return charges;
    }
    // Abstract Method displayInfo
    abstract void displayInfo();
}