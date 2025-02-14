package mapinterface.votingsystem;

public class VotingSystem {
    public static void main(String[] args) {
        VotesDetails votesDetails = new VotesDetails();

        // Voting
        votesDetails.voteForCandidate("Alice");
        votesDetails.voteForCandidate("Bob");
        votesDetails.voteForCandidate("Alice");
        votesDetails.voteForCandidate("Charlie");
        votesDetails.voteForCandidate("Bob");

        // Display results in sorted order
        System.out.println("Results (Sorted by Candidate Name): " + votesDetails.getResultsSortedByCandidateName());

        // Display results in the order votes were cast
        System.out.println("Results (Order of Voting): " + votesDetails.getResultsInVoteOrder());

        // Display winner(s)
        System.out.println("Winner(s): " + votesDetails.getWinners());
    }

}
