package resumescreeningsystem;
import java.util.*;

// Resume class with a generic type T that extends JobRole
public class Resume<T extends JobRole> {
    // List to store candidates of type T
    List<T> candidates = new ArrayList<>();

    // Method to add a candidate to the list
    public void addCandidates(T job) {
        candidates.add(job);
    }

    // Method to get the list of candidates
    public List<T> getCandidates() {
        return candidates;
    }
}
