package resumescreeningtesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resumescreeningsystem.DataScientist;
import resumescreeningsystem.ProductManager;
import resumescreeningsystem.SoftwareEngineer;

public class ResumeScreeningTest {

    @Test
    public void checkDataScientist(){
        // Create a new DataScientist object named resume1
        DataScientist resume1 = new DataScientist("Gagan Tantwar", "Capgemini", 45000, "B-Tech-DS", "Python,ML,Numpy,Pandas");
        // Check the result of the data scientist resume
        boolean ans = resume1.getResult();
        // Get the qualification of the data scientist
        String qualification = resume1.getQualification();
        // Assert that the qualification is "B-Tech-DS"
        Assertions.assertEquals("B-Tech-DS", qualification);
        // Assert that the result is true
        Assertions.assertEquals(true, ans);
        System.out.println("Testing Pass");
    }

    @Test
    public void checkManagement(){
        // Create a new ProductManager object named resume2
        ProductManager resume2 = new ProductManager("Raj", "TCS", 50000, "MBA", "Management,Communication,Team Leading");
        // Check the result of the product manager resume
        boolean ans = resume2.getResult();
        // Get the name of the candidate
        String name = resume2.getCandidateName();
        // Assert that the name is "Raj"
        Assertions.assertEquals("Raj", name);
        // Assert that the result is true
        Assertions.assertEquals(true, ans);
        System.out.println("Testing Pass");
    }

    @Test
    public void checkSoftwareEngineer() {
        // Create a new SoftwareEngineer object named resume3
        SoftwareEngineer resume3 = new SoftwareEngineer("Shubham", "Accenture", 60000, "B-Tech", "C++,Java,Python");
        // Get the company name of the software engineer
        String company = resume3.getCompanyName();
        // Check the result of the software engineer resume
        boolean ans = resume3.getResult();
        // Assert that the company name is "Accenture"
        Assertions.assertEquals("Accenture", company);
        // Assert that the result is true
        Assertions.assertEquals(true, ans);
        System.out.println("Testing Pass");
    }
}
