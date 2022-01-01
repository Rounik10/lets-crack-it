package goldmansachs;


import java.util.*;

/**
 * Q. Given an array of strings, return all groups of strings that are anagrams.
 * Link: https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/
 */
public class AnagramList {

    public List<List<String>> Anagrams(String[] string_list) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : string_list) {
            String key = getHashKey(word);
            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<>());
            }
            map.get(key).add(word);
        }

        List<List<String>> anagrams = new LinkedList<>();
        for (String key : map.keySet()) {
            anagrams.add(map.get(key));
        }
        return anagrams;
    }

    /**
     * @param word input
     * @return a unique string, based on frequency of chars, in the input word
     */
    private String getHashKey(String word) {
        word = word.toLowerCase();
        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        return Arrays.toString(freq);
    }

    // We may use HashMap instead of String, to save space
    private HashMap<Character, Integer> getHashMap(String word) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (freqMap.containsKey(word.charAt(i))) {
                freqMap.put(word.charAt(i), freqMap.get(word.charAt(i)) + 1);
            } else {
                freqMap.put(word.charAt(i), 1);
            }
        }
        return freqMap;
    }

}
