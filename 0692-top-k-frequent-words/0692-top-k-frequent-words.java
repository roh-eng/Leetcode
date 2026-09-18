import java.util.*;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        List<String> sortedWords = new ArrayList<>(frequencyMap.keySet());
        
        sortedWords.sort((a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            
            if (freqA != freqB) {
                return freqB - freqA; 
            }
            
            return a.compareTo(b);
        });

        return sortedWords.subList(0, k);
    }
}