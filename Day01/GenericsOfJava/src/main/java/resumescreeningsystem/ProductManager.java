package resumescreeningsystem;

// ProductManager class extends the JobRole class
public class ProductManager extends JobRole {
    // Constructor to initialize the ProductManager object
    public ProductManager(String candidateName, String companyName, int salary, String qualification, String skills) {
        super(candidateName, companyName, salary, qualification, skills);
    }

    // Method to check if the candidate meets the required skills and qualifications
    public boolean getResult() {
        String skillset = getSkills();
        String qualification = getQualification();

        // Check if the candidate has the required skills and qualifications
        if ((skillset.toLowerCase().contains("communication") && skillset.toLowerCase().contains("management") && skillset.toLowerCase().contains("team leading")) &&
                qualification.toLowerCase().contains("mba")) {
            return true;
        }
        return false;
    }

    // Variable to store the result of the getResult method
    boolean check = getResult();

    // Override the displayInfo method from the JobRole class
    @Override
    public void displayInfo() {
        // Display the company name, salary, candidate name, qualification, and skills
        System.out.println("Company Who wanted Software Engineer: " + getCompanyName());
        System.out.println("Salary Of Software Engineer: " + getSalary());
        System.out.println("Name of the Candidate: " + getCandidateName());
        System.out.println("Qualification of Candidate: " + getQualification());
        System.out.println("Skills of the Candidate: " + getSkills());

        // Display the result of the resume screening
        if (check) {
            System.out.println("Candidate Resume is Selected for Test: ");
        } else {
            System.out.println("Sorry to Say Candidate Not selected: ");
        }

        // Print a blank line for separation
        System.out.println(" ");
    }
}
