package resumescreeningsystem;

// Abstract class representing a Job Role
public abstract class JobRole {
    // Private member variables to store the candidate's details
    private String candidateName;
    private String companyName;
    private int salary;
    private String qualification;
    private String skills;

    // Constructor to initialize the member variables
    public JobRole(String candidateName, String companyName, int salary, String qualification, String skills) {
        this.candidateName = candidateName;
        this.companyName = companyName;
        this.salary = salary;
        this.qualification = qualification;
        this.skills = skills;
    }

    // Getter method to get the company name
    public String getCompanyName() {
        return companyName;
    }

    // Getter method to get the salary
    public int getSalary() {
        return salary;
    }

    // Getter method to get the candidate name
    public String getCandidateName() {
        return candidateName;
    }

    // Getter method to get the qualification
    public String getQualification() {
        return qualification;
    }

    // Getter method to get the skills
    public String getSkills() {
        return skills;
    }

    // Abstract method to display the job role information
    abstract void displayInfo();
}
