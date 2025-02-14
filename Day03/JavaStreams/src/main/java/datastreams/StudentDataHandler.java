package datastreams;

import java.io.*;

public class StudentDataHandler {
    // File name to store student data
    private static final String FILE_NAME = "students.dat";
    public boolean checkDataStream(){
        boolean ans1=false;
        boolean ans2=false;
        // Writing student data to file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            // Create student objects
            Student student1 = new Student(101, "Alice", 3.8);
            Student student2 = new Student(102, "Bob", 3.6);

            // Save student details to file
            student1.saveToFile(dos);
            student2.saveToFile(dos);
            ans1=true;
        } catch (IOException e) {
            // Handle exceptions during writing
            ans1=false;
            e.printStackTrace();
        }

        // Reading student data from file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            // Loop while there is data available to read
            while (dis.available() > 0) {
                // Read student details from file
                Student student = Student.readFromFile(dis);
                // Print student details
                System.out.println(student);
            }
            ans2=true;
        } catch (IOException e) {
            // Handle exceptions during reading
            ans1=false;
            e.printStackTrace();
        }
        if(ans1==true && ans2==true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StudentDataHandler data=new StudentDataHandler();
        boolean checked= data.checkDataStream();
     }

}
