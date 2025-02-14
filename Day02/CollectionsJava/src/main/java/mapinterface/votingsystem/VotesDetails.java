package mapinterface.votingsystem;
import  java.util.*;
public class VotesDetails {
    private Map<String, Integer> voteMap; // Stores candidate votes
    private TreeMap<String, Integer> sortedResults; // Displays results in sorted order
    private LinkedHashMap<String, Integer> voteOrderMap; // Maintains order of votes

    public VotesDetails() {
        this.voteMap = new HashMap<>();
        this.sortedResults = new TreeMap<>();
        this.voteOrderMap = new LinkedHashMap<>();
    }

    public void voteForCandidate(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteMap.get(candidate));
    }

    // Get results sorted by candidate name
    public Map<String, Integer> getResultsSortedByCandidateName() {
        sortedResults.clear();
        sortedResults.putAll(voteMap);
        return sortedResults;
    }

    // Get results in the order votes were cast
    public Map<String, Integer> getResultsInVoteOrder() {
        return voteOrderMap;
    }

    // Get the winner(s) with the highest votes
    public List<String> getWinners() {
        int maxVotes = Collections.max(voteMap.values());
        List<String> winners = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            if (entry.getValue() == maxVotes) {
                winners.add(entry.getKey());
            }
        }
        return winners;
    }
}
