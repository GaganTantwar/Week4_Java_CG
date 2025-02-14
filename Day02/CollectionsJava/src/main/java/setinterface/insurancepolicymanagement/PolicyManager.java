package setinterface.insurancepolicymanagement;

import java.util.*;

public class PolicyManager {
    // Sets to store policies using different types of collections
    private Set<Policy> hashSet = new HashSet<>(); // Unordered unique policies
    private Set<Policy> linkedHashSet = new LinkedHashSet<>(); // Maintains insertion order
    private Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate)); // Sorted by expiry date

    // Adds a new policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Retrieves all unique policies from the HashSet
    public Set<Policy> getAllUniquePolicies() {
        return hashSet;
    }

    // Retrieves policies that will expire within the next 30 days
    public List<Policy> getPoliciesExpiringSoon() {
        List<Policy> expiringSoon = new ArrayList<>();
        Date now = new Date();
        Date soon = new Date(now.getTime() + (30L * 24 * 60 * 60 * 1000));

        for (Policy policy : treeSet) {
            if (policy.getExpiryDate().before(soon)) {
                expiringSoon.add(policy);
            }
        }
        return expiringSoon;
    }

    // Retrieves policies based on a specific coverage type
    public List<Policy> getPoliciesByCoverageType(String coverageType) {
        List<Policy> policiesByType = new ArrayList<>();
        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policiesByType.add(policy);
            }
        }
        return policiesByType;
    }

    // Identifies duplicate policies based on policy number
    public Set<Policy> getDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<String> uniquePolicyNumbers = new HashSet<>();

        for (Policy policy : treeSet) {
            if (uniquePolicyNumbers.contains(policy.getPolicyNumber())) {
                duplicates.add(policy);
            } else {
                uniquePolicyNumbers.add(policy.getPolicyNumber());
            }
        }
        return duplicates;
    }

    // Compares performance of adding a policy to different sets
    public void compareAddPerformance(Policy policy) {
        long startTime, endTime;

        startTime = System.nanoTime();
        hashSet.add(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to add to HashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.add(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to add to LinkedHashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSet.add(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to add to TreeSet: " + (endTime - startTime) + " ns");
    }

    // Compares performance of removing a policy from different sets
    public void compareRemovePerformance(Policy policy) {
        long startTime, endTime;

        startTime = System.nanoTime();
        hashSet.remove(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove from HashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.remove(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove from LinkedHashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSet.remove(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove from TreeSet: " + (endTime - startTime) + " ns");
    }

    // Compares performance of searching for a policy in different sets
    public void compareSearchPerformance(Policy policy) {
        long startTime, endTime;

        startTime = System.nanoTime();
        boolean foundInHashSet = hashSet.contains(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to search in HashSet: " + (endTime - startTime) + " ns" + " (Found: " + foundInHashSet + ")");

        startTime = System.nanoTime();
        boolean foundInLinkedHashSet = linkedHashSet.contains(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to search in LinkedHashSet: " + (endTime - startTime) + " ns" + " (Found: " + foundInLinkedHashSet + ")");

        startTime = System.nanoTime();
        boolean foundInTreeSet = treeSet.contains(policy);
        endTime = System.nanoTime();
        System.out.println("Time taken to search in TreeSet: " + (endTime - startTime) + " ns" + " (Found: " + foundInTreeSet + ")");
    }
}
