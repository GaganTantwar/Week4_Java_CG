package resumescreeningsystem;

// Main class to demonstrate the resume screening system
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        // Create instances of different job roles with candidate details
        JobRole candidate1 = new SoftwareEngineer("Shubham Rajput", "Capgemini", 450000, "B-Tech-AIML", "Java Fullstack and C++");
        JobRole candidate2 = new DataScientist("Harshit Patel", "Accenture", 600000, "B-Tech-AIDS", "Python, Numpy, Pandas");
        JobRole candidate3 = new ProductManager("Gagan Tantwar", "TCS", 700000, "MBA", "Good Communication, Team Leading, Management");
        JobRole candidate4 = new ProductManager("Nehal Sharma", "Cognizant", 450000, "MBA", "Good Communication, Team Leading");

        // Create a Resume object to hold the candidates
        Resume<JobRole> resumes = new Resume<>();

        // Add the candidates to the Resume object
        resumes.addCandidates(candidate1);
        resumes.addCandidates(candidate2);
        resumes.addCandidates(candidate3);
        resumes.addCandidates(candidate4);

        // Display the information for all candidates
        Utility.getData(resumes.getCandidates());
    }
}
